import java.util.Objects;

public class Indrustrial extends Vehiculo implements Camperizable {
    private float tamCaja;

    /*constructor*/
    public Indrustrial(String marca, String modelo, float tamCaja) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.tamCaja = tamCaja;
    }

    /*getters y setters*/
    public float getTamCaja() {
        return tamCaja;
    }
    public void setTamCaja(float tamCaja) {
        this.tamCaja = tamCaja;
    }

    @Override
    public Medidas getMedidas() {
        return super.getMedidas();
    }

    @Override
    public void setMedidas(Medidas medidas) {
        super.setMedidas(medidas);
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public int getAFabricacion() {
        return super.getAFabricacion();
    }

    @Override
    public void setAFabricacion(int aFabricacion) {
        super.setAFabricacion(aFabricacion);
    }

    @Override
    public int getKms() {
        return super.getKms();
    }

    @Override
    public void setKms(int kms) {
        super.setKms(kms);
    }

    @Override
    public int getPortenciaCV() {
        return super.getPortenciaCV();
    }

    @Override
    public void setPortenciaCV(int portenciaCV) {
        super.setPortenciaCV(portenciaCV);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio);
    }

    @Override
    public TipoCombustible getCombustible() {
        return super.getCombustible();
    }

    @Override
    public void setCombustible(TipoCombustible combustible) {
        super.setCombustible(combustible);
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
   /* @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass()!= obj.getClass()) {
            return false;
        }
        final Indrustrial other = (Industrial) obj;
        if (!Objects.equals(this.getMarca(), other.getMarca())) {
            return false;
        }
        if (!Objects.equals(this.getModelo(), other.getModelo())) {
            return false;
        }
        if (Float.floatToIntBits(this.getTamCaja())!= Float.floatToIntBits(other.getTamCaja())) {
            return false;
        }
        return true;

    }*/
    /*toString*/
    @Override
    public String toString() {
        return "Industrial{" + "marca=" + getMarca() + ", modelo=" + getModelo() + ", tamCaja=" + getTamCaja() + '}';
    }

    @Override
    public void añadirCama() {

    }

    @Override
    public void añadirDucha() {

    }

    @Override
    public void añadirCocina() {

    }
}
