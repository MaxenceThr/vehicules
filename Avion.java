package vehicules;
class Avion extends Vehicule{
    
    private int nbMoteur;

    public Avion(float vitesse, int nbPassager){
        super(vitesse,nbPassager);
        setNbMoteur(nbMoteur);
    }

    public int getNbMoteur(){
        return nbMoteur;
    }


    public void setNbMoteur(int nbMoteur){
        if(nbMoteur < 1 && nbMoteur >8){
            throw new IllegalArgumentException("nbr de moteur compris entre 1 et 8 tout inclus !");
        }
        else{
            this.nbMoteur = nbMoteur;
        }
    }
    @Override
    public void setVitesse(float vitesse){
        if (vitesse<0 && vitesse >1000){
            throw new IllegalArgumentException(" vitesse ne peut pas etre null !");
        }
        else{
            super.setVitesse(vitesse);
        }
    }
    @Override
    void setNbPassager(int nbPassager){
        if (nbPassager<5 && nbPassager>200){
            throw new IllegalArgumentException("nombre de passager doit etre entre 5 et 200 inclus !");
        }
        else{
            super.setNbPassager(nbPassager);
        }

    }

}