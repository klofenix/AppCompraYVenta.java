public class Turismo extends Vehiculo{
    protected TipoCarroceria carroceria;

    /*Constructor*/

    public Turismo() {
        super();
    }

    /*Getters y Setters*/
    public TipoCarroceria getCarroceria() {
        return carroceria;
    }
    public void setCarroceria(TipoCarroceria carroceria) {
        this.carroceria = carroceria;
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
    public int getPotenciaCV() {
        return super.getPotenciaCV();
    }

    @Override
    public void setPotenciaCV(int potenciaCV) {
        super.setPotenciaCV(potenciaCV);
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
    @Override
    public String toString() {
        return super.toString();
    }
}
