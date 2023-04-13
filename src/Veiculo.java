public class Veiculo implements VeiculoInterface {
    private int anoFabricacao;
    private  String modelo;
    private String cor;
    private double preco;

        
    public void andar(){
        System.out.println("Andou...");
     }
    
    public void freiar(){
        System.out.println("Freiou...");
    }
    
    public void passarMarcha(int marcha){
        System.out.println("Passou a marcha para: " + marcha);
    }



    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
