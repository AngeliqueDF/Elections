public class Candidat {
    int voies = -1;
    private String nom;
    private String prenom;
    private String affil;

    public Candidat(String nom, String prenom, String affil) {
        this.nom = nom;
        this.prenom = prenom;
        if (affil == null) {
            this.affil = "INDEPENDANT";
        } else {
            this.affil = affil;
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    public String getAffil() {
        return affil;
    }

    public void setAffil(String affil) {
        this.affil = affil;
    }

    public int getVoies() {
        if (voies == -1) {
            throw new IllegalStateException("Erreur : ce candidat n'a pas encore obtenu de voies.");
        }
        return voies;
    }

    public void setVoies(int voies) {
        if (voies < 0)
            throw new IllegalStateException("Erreur : le nombre de voies ne peut pas être négatif");
        this.voies = voies;
    }

    @Override
    public String toString() {
        String res = "Candidat : " + nom + " " + prenom + ". Parti politique : " + affil + ".";
        if (voies > -1) {
            res += " " + voies + " votes obtenus.";
        } else {
            res += "Comptage des voies reçues non effectué pour le moment.";
        }
        return res;
    }
}
