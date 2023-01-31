public class Election {
    public static void main(String[] args) {
        Candidat riri = new Candidat("Riri", "Duck", null);
        Candidat fifi = new Candidat("Fifi", "Duck", null);
        Candidat loulou = new Candidat("Loulou", "Duck", null);
        riri.setVoies(12);
        fifi.setVoies(5);
        loulou.setVoies(37);
        Candidat[] candidats = {riri, fifi, loulou};
        Conscription conscription = new Conscription("Picsouville", 100);
        for (int i = 0; i < candidats.length; i++) {
            conscription.ajouterCandidat(candidats[i]);
            System.out.println(candidats[i]);
        }
        conscription.setElectionFinie(true);
        System.out.println(conscription);
    }
}
