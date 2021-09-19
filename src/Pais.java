public class Pais {
    String nome;
    double territorio;
    double populacao;

    String informacoes (){
        return "Nome do País: " + nome + "\nTamanho do território: " + territorio + " km²" + "\nPopulação: " + populacao + " milhões\n";
    }

}