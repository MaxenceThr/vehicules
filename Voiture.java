package vehicules ;
public class Voiture extends Vehicule {

    private int nbPortiere;

    public Voiture(float vitesse, int nbPassager, int nbPortier){
            super(vitesse,nbPassager);
            setNbPortiere(nbPortier);
    }

    public int getNbPortiere(){
        return nbPortiere;
    }

    public void setNbPortiere(int nbPortiere){
         if (nbPortiere<1 && nbPortiere>5){
            throw new IllegalArgumentException("nombre de portiere entre 1 et 5 inclus !");
        }
        else{
            this.nbPortiere = nbPortiere;
        }
    }

    @Override
    public void setVitesse(float vitesse){
         if (vitesse<0 && vitesse >250){
            throw new IllegalArgumentException(" vitesse doit etre comprise entre 0 et 250 inclus !");
        }
        else{
            super.setVitesse(vitesse);
        }
    }

        @Override
    public void setNbPassager(int nbPassager){
         if (nbPassager<1 && nbPassager >8){
            throw new IllegalArgumentException(" NB DE PASSAGER DOIT ETRE COMPRIS ENTRE 1 ET 8 inclus !");
        }
        else{
            super.setNbPassager(nbPassager);
        }
    }
}
