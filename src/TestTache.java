public class TestTache {
    public static void main(String[] args) {
        TacheElementaire tache1 = new TacheElementaire("Tache 1", 10);
        TacheElementaire tache2 = new TacheElementaire("Tache 2", 15);

        TacheComplexe tacheComplexe = new TacheComplexe("Tache Complexe");
        tacheComplexe.ajouter(tache1);
        tacheComplexe.ajouter(tache2);

        System.out.println(tacheComplexe.getCout());
    }
}