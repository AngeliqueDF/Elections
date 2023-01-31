import java.util.ArrayList;

public class Conscription {
    private String nom;
    private int nbInscrits;
    private ArrayList<Candidat> candidats = new ArrayList<Candidat>();
    private boolean electionFinie;

    Conscription(String nom, int nbInscrits) {
        this.nom = nom;
        this.nbInscrits = nbInscrits;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nvNom) {
        nom = nvNom;
    }

    public int getNbInscrits() {
        return nbInscrits;
    }

    public void setNbInscrits(int nvNbInscrits) {
        nbInscrits = nvNbInscrits;
    }

    public boolean getElectionFinie() {
        return electionFinie;
    }

    public void setElectionFinie(boolean finie) {
        electionFinie = finie;
    }

    public ArrayList<Candidat> getCandidats() {
        return candidats;
    }

    public void ajouterCandidat(Candidat cand) {
        this.candidats.add(cand);
    }

    public double calcTauxPartic() {
        int voiesTotales = 0;
        for (int i = 0; i < this.candidats.size(); i++) {
            voiesTotales += this.candidats.get(i).getVoies();
        }
        return ((double) voiesTotales / this.nbInscrits) * 100;
    }

    public Candidat trouverVainqueur() {
        Candidat res = this.candidats.get(0);
        for (int i = 1; i < this.candidats.size(); i++) {
            if (this.candidats.get(i).getVoies() >= res.getVoies()) {
                res = this.candidats.get(i);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "Conscription : " + this.nom + ".\n";
        res += "Nombre d'inscrits sur les listes électorales : " + nbInscrits + ".\n";
        if (this.getElectionFinie()) {
            res += "Election terminée, vainqueur : " + this.trouverVainqueur() + "\n";
        } else {
            res += "Election en cours.\n";
        }
        res += "Taux de participation : " + calcTauxPartic() + "%.\n";
        return res;
    }
}
