import java.io.Serializable;

public class Personagem implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int ALEGRIA_MAXIMA = 10;

    private String nome;
    private int alegria;

    public Personagem(String nome, int alegria) {
        this.nome = nome;
        setAlegria(alegria);
    }

    public String getNome() {
        return nome;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        if (alegria < 0) {
            notificarFaltaDeAnimacao();
        } else if (alegria > ALEGRIA_MAXIMA) {
            notificarAnimacao();
            this.alegria = ALEGRIA_MAXIMA;
        } else {
            this.alegria = alegria;
        }
    }

    private void notificarFaltaDeAnimacao() {
        System.out.println(nome + " não tem ânimo suficiente para ir ao baile.");
    }

    private void notificarAnimacao() {
        System.out.println(nome + " está animado para ir ao baile.");
    }
}
