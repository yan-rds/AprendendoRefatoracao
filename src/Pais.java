public class Pais {
    String nome;
    double territorio;
    double populacao;

    String informacoes (){
        return "Nome do país: " + nome + "\nTamanho do territorio: " + territorio + " km²" + "\nPopulação: " + populacao + " milhões\n";
    }

}