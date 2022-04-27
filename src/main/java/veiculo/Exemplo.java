package veiculo;

public class Exemplo {
    public static void main(String[] args) {
        Carro car = new Carro();
        Moto moto = new Moto();

        car.setMarca("Ford");
        car.setNome("Fiesta");
        car.setPlaca(123456);

        moto.setMarca("Yamaha");
        moto.setNome("Factor 150");
        moto.setPlaca(654321);

        car.getInfo();
        moto.getInfo();
    }
}
