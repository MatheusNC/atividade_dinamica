package veiculo;

public class Carro implements Veiculo {
    private String nome;
    private String marca;
    private int placa;
    private int idVeiculo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    @Override
    public String getTipo() {
        return "carro";
    }

    @Override
    public int getQtyRodas() {
        return 4;
    }

    @Override
    public int getQtyPortas() {
        return 4;
    }

    public void getInfo() {
        System.out.println(" -= Informações do veículo =-");
        System.out.println("Tipo do veículo: " + this.getTipo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Quantidade de rodas: " + this.getQtyRodas());
        System.out.println("Quantidade máxima de portas: " + this.getQtyPortas());
        System.out.println("");
    }
}
