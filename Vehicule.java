package vehicules;
public class Vehicule{
    private double vitesse;
    private int nbPassager;

    public Vehicule(double vitesse,int nbPassager){
        setVitesse(vitesse);
        setNbPassager(nbPassager);
    }

    public double getVitesse(){
        return vitesse;
    }
    public int getNbPassager(){
        return nbPassager;
    }

    public void setVitesse(double vitesse){
        if (vitesse<0){
            throw new IllegalArgumentException(" vitesse ne peut pas etre null !");
        }
        else{
            this.vitesse = vitesse;
        }
    }
    public void setNbPassager(int nbPassager){
        if (nbPassager<0){
            throw new IllegalArgumentException("nombre de passager ne peut pas etre null !");
        }
        else{
            this.nbPassager = nbPassager;
        }

    }

    public String toString(){
        return "Vehicule: [vitesse: "+getVitesse()+" km/h, passagers: "+getNbPassager()+"]";
    }
}
