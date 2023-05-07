pacote com. exemplo. projeto_java01;

Aula pública  Guitarra {

    private String numeroSerie, fabricante, modelo, tipo, madeira;
    privado duplo preco;

    Criação do construtor da classe Guitarra
    public guitarra(
            String numeroSerie, String fabricante,
            String modelo, String tipo,
            Corda madeira, duplo preco) {
        isso. numeroSerie = numeroSérie;
        isso.  fabricante = fabricante;
        isso.  modelo = modelo;
        isso.  tipo = tipo;
        isso.  madeira = madeira;
        isso. preco = preco;
    }
    public String getNumeroSerie() {
        retorno numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        isso. numeroSerie = numeroSérie;
    }
    public String getFabricante() {
        Return fabricante;
    }
    public void setFabricante(String, fabricante,) {
        isso.  fabricante = fabricante;
    }
    public String getModelo() {
        modelo de retorno ;
    }
    public void setModelo(String modelo) {
        isso.  modelo = modelo;
    }
    public String getTipo() {
        tipo de retorno ;
    }
    public void setTipo(String tipo) {
        isso.  tipo = tipo;
    }
    String pública getMadeira() {
        Regresso Madeira;
    }
    public void setMadeira(String madeira) {
        isso.  madeira = madeira;
    }
    público duplo getPreco() {
        Retornar PRECO;
    }
    public void setPreco(double preco) {
        isso. preco = preco;
    }

    o método main() é o método principal da classe
    public static void main(String[] args) {
        instanciamos um objeto chamado "minhaGuitara" que será do tipo "Guitarra"
        Os valores passados são usados pelo construtor da classe para criar
        o objeto
        guitarra minhaGuitarra = nova guitarra("01020304", "fender", "telecaster",
                "elétrica", "mogno", 1500);

        Testando os dados da classe, imprimindo a saída simples no terminal
        Sistema. fora. println(minhaGuitarra. getNumeroSerie());
        Sistema. fora. println(minhaGuitarra. getMadeira());
        Sistema. fora. println(minhaGuitarra. getPreco());
        Sistema. fora. println(minhaGuitarra. getTipo());
    }

}
