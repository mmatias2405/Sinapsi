package controller;

import Sinapsi.Sinapsi;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class EscolherEstratgController {
    private String estrategia1 = "Media Movel";
    private String estrategia2 = "Long And Short";
    private String estrategia3 = "Bandas de Bollinger";
    private String estrategia4 = "Indice de Força Relativa";
    private String estrategia5 = "Eco Temporal";
    private String estrategia6 = "Agulhadas";
    private String estrategiaOpcao;
    ObservableList<String> cbEstrategiasValues = FXCollections.observableArrayList
            (estrategia1, estrategia2, estrategia3, estrategia4, estrategia5, estrategia6);

    @FXML
    private ComboBox cbEstrategiasBox;
    @FXML
    private TextArea resumo;

    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
    int hora = calendar.get(Calendar.HOUR_OF_DAY);
    int minuto = calendar.get(Calendar.MINUTE);
    int segundo = calendar.get(Calendar.SECOND);

    @FXML
    public void responder(ActionEvent e) throws Exception
    {
        String value = (String) cbEstrategiasBox.getValue();
        int id = 0;
        if(value.equals("Media Movel"))
            id = 1;
        else if(value.equals("Long And Short"))
            id = 2;
        else if(value.equals("Bandas de Bollinger"))
            id = 3;
        else if(value.equals("Indice de Força Relativa"))
            id = 4;
        else if(value.equals("Eco Temporal"))
            id = 5;
        else
            id = 6;
        Sinapsi.choose(id);
    }

    @FXML
    public void initialize() {
        cbEstrategiasBox.setItems(cbEstrategiasValues);
    }

    public void resumir (ActionEvent actionEvent) {
        String value = (String) cbEstrategiasBox.getValue();
        if(value.equals("Media Movel"))
        {
            resumo.setText("As médias móveis suavizam os dados de preços para formar um indicador de tendência sequencial. Elas não prevêem a direção dos preços, mas, antes, definem a sua direção atual com um atraso.\n" +
                    "As médias móveis atrasam porque elas são baseadas em preços passados.");
        }
        else if(value.equals("Long And Short"))
        {
            resumo.setText("A operação Long and Short consiste na venda a descoberto de um ativo (Short) e utilização dos recursos levantados na compra (Long) de outro papel. Isso não implica necessariamente em volumes financeiros iguais. A operação busca coordenação entre dois ativos afim de reconhecer discrepância temporária.");
        }
        else if(value.equals("Bandas de Bollinger"))
        {
            resumo.setText("Baseado na ideia de que os preços das ações costumam variar dentro de um padrão, inicialmente foram desenvolvidos os indicadores de envelope. São traçadas linha acima e abaixo do preço, ficando sempre uma distância percentual constante entre o preço e as linhas de envelope.");
        }
        else if(value.equals("Indice de Força Relativa"))
        {
            resumo.setText("Resultado de imagem para Indice de Força Relativa Desenvolvido por J. Welles Wilder, o Índice de Força Relativa é um oscilador de momentum que mede a velocidade e mudança dos movimentos de preços. O IFR oscila entre 0 e 100. Tradicionalmente, o IFR é considerado superavaliado quando acima de 70 e subavaliado abaixo de 30.");
        }
        else if(value.equals("Agulhadas"))
        {
            resumo.setText("O conceito das agulhadas é bem simples, colocando-se em um gráfico 3 Médias Móveis Simples, uma de 3 períodos, uma de 8 e uma de 20, sempre que as 3 médias passarem simultaneamente por dentro do Corpo Real de um Candle nós dizemos que temos uma agulhada. Isto por que o movimento é semelhante a passar uma linha por dentro da cabeça de uma agulha.\n" +
                    "Quando após a agulhada ocorrer as médias saírem na ordem: Média de 3 períodos acima, de 8 no meio e de 20 em baixo, temos uma Agulhada de Alta , o que significa que os preços devem subir rapidamente logo após este sinal. Se a ordem for inversa, ou seja, a Média de 20 períodos acima, a de 8 no meio e a de 3 em baixo, temos uma Agulhada de Baixa, o que significa que os preços devem cair rapidamente após o sinal. ");
        }
        else
        {
            resumo.setText("Examina anualmente o preço do periodo atual e anterior do dia aplicado perseguindo altas e baixas recorrentes");
        }
    }
}

