public class TacheElementaire implements Tache{
    public String nom;
    public int cout;

    public TacheElementaire(String nom, int cout) {
        this.nom = nom;
        this.cout = cout;
    }

    @Override
    public int getCout() {
        return cout;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    @Override
    public String getNom() {
        return nom;
    }
}
