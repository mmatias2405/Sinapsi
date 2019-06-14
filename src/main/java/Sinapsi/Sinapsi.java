package Sinapsi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Sinapsi extends Application {

    private static Stage stage;
    private static Integer renda;
    private static Scene tela;
    private static ArrayList<Integer> resposta;
    private static int telaAtual, idEstrategia;
    private static String inicio, fim, paper;

    public static void choose(int id)throws Exception {
        idEstrategia = id;
        FXMLLoader loader = new FXMLLoader(Sinapsi.class.getResource("../Time.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void action(String acao)throws Exception {
        /*
        paper = acao;
        FXMLLoader loader = new FXMLLoader(Sinapsi.class.getResource("../GraficosTela.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        */
    }
    public static void data(LocalTime i, LocalTime f)throws Exception {
        inicio = i.toString();
        fim = f.toString();
        FXMLLoader loader = new FXMLLoader(Sinapsi.class.getResource("../actionPaper.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void anterior()throws Exception {
        telaAtual = 0;
        resposta = new ArrayList<Integer>();
        FXMLLoader loader = new FXMLLoader(Sinapsi.class.getResource("../Questionario1.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void salvaOpcao(int i)throws Exception {
        telaAtual++;
        if(telaAtual == 7){
            Sinapsi.escolherPerfil();
        }
        else {
            resposta.add(new Integer(i));
            FXMLLoader loader = new FXMLLoader(Sinapsi.class.getResource("../Questionario" + String.valueOf(telaAtual) + ".fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    private static void escolherPerfil()throws Exception  {
        int sum = 0;
        String perfil = "";
        for(Integer d : resposta)
            sum += d;
        if (sum < 5)
            perfil = "ProfileResultVeryConservative.fxml";
        else if(sum < 11)
            perfil = "ProfileResultConservative.fxml";
        else if(sum < 16)
            perfil = "ProfileResultModerate.fxml";
        else if(sum < 18)
            perfil = "ProfileResultRisky.fxml";
        else
            perfil = "ProfileResultVeryRisky.fxml";

        FXMLLoader loader = new FXMLLoader(Sinapsi.class.getResource("../" + perfil));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void salario(String s)throws Exception {
        telaAtual++;
        renda = Integer.valueOf(s);
        FXMLLoader loader = new FXMLLoader(Sinapsi.class.getResource("../Questionario"+ String.valueOf(telaAtual) +".fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void continuar() throws IOException {
        FXMLLoader loader = new FXMLLoader(Sinapsi.class.getResource("../EscolherEstratgTela.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void action(Object value) throws IOException {
        Sinapsi.graphic();
    }

    public static void graphic() {
    }

    @Override
    public void start(Stage stage) throws Exception  {
        this.renda = 0;
        this.telaAtual = 0;
        this.resposta = new ArrayList<Integer>();
        this.stage = stage;
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../LoginTela.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
        this.stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}