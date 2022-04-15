public class Personagem {

    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;
    final static int LIMITE_SUPERIOR = 10;

    public Personagem(int energia, int fome, int sono) {
        if (energia >= 0 && energia <= 10)
            this.energia = energia;
        if (fome >= 0 && fome <= 10)
            this.fome = fome;
        if (sono >= 0 && sono <= 10)
            this.sono = sono;
    }

    public Personagem(String nome, int energia, int fome, int sono) {
        this(energia, fome, sono);
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getEnergia() {
        return this.energia;
    }

    public int getFome() {
        return this.fome;
    }

    public int getSono() {
        return this.sono;
    }

    void cacar() {
        if (this.energia >= 2) {
            System.out.printf("%s caçando...\n", nome);
            this.energia = this.energia - 2;
        } else {
            System.out.printf("%s sem energia para caçar...\n", nome);
        }
        this.fome = Math.min(this.fome + 1, LIMITE_SUPERIOR);
        this.sono = Math.min(this.sono + 1, LIMITE_SUPERIOR);
    }

    void comer() {
        if (this.fome >= 1) {
            System.out.printf("%s comendo...\n", nome);
            this.fome -= 1;
            this.energia = this.energia + 1 <= LIMITE_SUPERIOR ? this.energia + 1 : this.energia;
        } else {
            System.out.printf("%s sem fome...\n", nome);
        }
    }

    void dormir() {
        if (this.sono >= 1) {
            System.out.printf("%s dormindo...\n", nome);
            this.sono -= 1;
            this.energia = this.energia + 1 <= LIMITE_SUPERIOR ? this.energia + 1 : this.energia;
        } else {
            System.out.printf("%s sem sono...\n", nome);
        }
    }

    void estado() {
        System.out.println("\n-------------------------------------------------");
        System.out.printf("ESTADO:\nPersonagem: %s\nEnergia: %d\nFome: %d\nSono: %d", this.getNome(), this.getEnergia(), this.getFome(), this.getSono());
    }
}