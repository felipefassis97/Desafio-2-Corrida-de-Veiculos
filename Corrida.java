//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package teste;

class Veiculo {
    String nome;

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public void mover() {
        System.out.println(nome + ": se movendo...");
    }
}

// Subclasses
class Carro extends Veiculo {
    public Carro() {
        super("Carro");
    }

    @Override
    public void mover() {
        System.out.println(nome + ": Vruuummmm!");
    }
}

class Moto extends Veiculo {
    public Moto() {
        super("Moto");
    }

    @Override
    public void mover() {
        System.out.println(nome + ": Brrruummmm!");
    }
}

class Bicicleta extends Veiculo {
    public Bicicleta() {
        super("Bicicleta");
    }

    @Override
    public void mover() {
        System.out.println(nome + ": Pedalando...");
    }
}

// Programa principal
public class Corrida {
    public static void main(String[] args) {
        Veiculo v1 = new Carro();
        Veiculo v2 = new Bicicleta();

        System.out.println("Veículos escolhidos: " + v1.nome + " vs " + v2.nome);
        v1.mover();
        v2.mover();
    }
}