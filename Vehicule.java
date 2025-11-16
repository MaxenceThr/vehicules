package vehicules;
class Vehicule{
    private float vitesse;
    private int nbPassager;

    public Vehicule(float vitesse,int nbPassager){
        setVitesse(vitesse);
        setNbPassager(nbPassager);
    }

    public float getVitesse(){
        return vitesse;
    }
    public int getNbPassager(){
        return nbPassager;
    }

    void setVitesse(float vitesse){
        if (vitesse<0){
            throw new IllegalArgumentException(" vitesse ne peut pas etre null !");
        }
        else{
            this.vitesse = vitesse;
        }
    }
    void setNbPassager(int nbPassager){
        if (nbPassager<0){
            throw new IllegalArgumentException("nombre de passager ne peut pas etre null !");
        }
        else{
            this.nbPassager = nbPassager;
        }

    }
}