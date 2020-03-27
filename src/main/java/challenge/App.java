package challenge;

public class App {

    public static void main(String[] args){


        Estacionamento estacionamento = new Estacionamento();
        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("jorge")
                                        .withIdade(20)
                                        .withPontos(20)
                                        .withHabilitacao("A")
                                        .build())
                        .withPlaca("JVO1234")
                        .withCor( Cor.BRANCO)
                        .build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("levi")
                                        .withIdade(18)
                                        .withPontos(19)
                                        .withHabilitacao("B")
                                        .build())
                        .withPlaca("AAA1234")
                        .withCor( Cor.PRETO).build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("marli")
                                        .withIdade(20)
                                        .withPontos(19)
                                        .withHabilitacao("AB")
                                        .build())
                        .withPlaca("NTB8215")
                        .withCor( Cor.COLORIDO).build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("marli")
                                        .withIdade(20)
                                        .withPontos(19)
                                        .withHabilitacao("AB")
                                        .build())
                        .withPlaca("NTB8215")
                        .withCor( Cor.COLORIDO).build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("marli")
                                        .withIdade(20)
                                        .withPontos(19)
                                        .withHabilitacao("AB")
                                        .build())
                        .withPlaca("NTB8215")
                        .withCor( Cor.COLORIDO).build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("marli")
                                        .withIdade(20)
                                        .withPontos(19)
                                        .withHabilitacao("AB")
                                        .build())
                        .withPlaca("NTB8215")
                        .withCor( Cor.COLORIDO).build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("marli")
                                        .withIdade(20)
                                        .withPontos(19)
                                        .withHabilitacao("AB")
                                        .build())
                        .withPlaca("NTB8215")
                        .withCor( Cor.COLORIDO).build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("marli")
                                        .withIdade(20)
                                        .withPontos(19)
                                        .withHabilitacao("AB")
                                        .build())
                        .withPlaca("NTB8215")
                        .withCor( Cor.COLORIDO).build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("marli")
                                        .withIdade(20)
                                        .withPontos(19)
                                        .withHabilitacao("AB")
                                        .build())
                        .withPlaca("NTB8215")
                        .withCor( Cor.COLORIDO).build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("marli")
                                        .withIdade(20)
                                        .withPontos(19)
                                        .withHabilitacao("AB")
                                        .build())
                        .withPlaca("NTB8215")
                        .withCor( Cor.COLORIDO).build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("marli")
                                        .withIdade(20)
                                        .withPontos(19)
                                        .withHabilitacao("AB")
                                        .build())
                        .withPlaca("NTB8215")
                        .withCor( Cor.COLORIDO).build()
        );

        estacionamento.estacionar(
                Carro.builder()
                        .withMotorista(
                                Motorista
                                        .builder()
                                        .withNome("marli")
                                        .withIdade(20)
                                        .withPontos(19)
                                        .withHabilitacao("AB")
                                        .build())
                        .withPlaca("NTB8215")
                        .withCor( Cor.COLORIDO).build()
        );

        System.out.println(estacionamento.carrosEstacionados());
    }
}
