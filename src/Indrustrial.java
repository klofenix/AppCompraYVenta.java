import java.util.Objects;

public class Indrustrial extends Vehiculo implements Camperizable {
    private float tamCaja;

    /*constructor*/
    public Indrustrial() {
    }
    public Indrustrial(String marca, String modelo, float tamCaja) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.tamCaja = tamCaja;
    }
    public Indrustrial(Vehiculo vehiculo, float tamCaja) {
        super(vehiculo);
        this.tamCaja = tamCaja;
    }

    /*getters y setters*/
    public float getTamCaja() {
        return tamCaja;
    }
    public void setTamCaja(float tamCaja) {
        this.tamCaja = tamCaja;
    }

   /*hashcode e equals*/
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.getMarca());
        hash = 89 * hash + Objects.hashCode(this.getModelo());
        hash = 89 * hash + Float.floatToIntBits(this.getTamCaja());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Indrustrial that = (Indrustrial) o;
        return Float.compare(that.tamCaja, tamCaja) == 0;
    }

    /*toString*/
    @Override
    public String toString() {
        return "Industrial{" + "marca=" + getMarca() + ", modelo=" + getModelo() + ", tamCaja=" + getTamCaja() + '}';
    }
    // Implementación de métodos de la interfaz Camperizable
    @Override
    public void añadirCama() {

    }

    @Override
    public void añadirDucha() {

    }

    @Override
    public void añadirCocina() {

    }
    @Override
    public int getPotenciaKW(int getPotenciaCV){
        double _1KW = getPotenciaCV * 1.34;
        return (int) _1KW;
    }
}
