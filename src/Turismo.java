public class Turismo extends Vehiculo{
    protected TipoCarroceria carroceria;

    /*Constructor*/

    public Turismo() {
    }
    public Turismo(String marca, String modelo, int aFabricacion, int kms, int potenciaCV, double precio, TipoCombustible combustible, Medidas medidas, TipoCarroceria carroceria) {
        super(marca, modelo, aFabricacion, kms, potenciaCV, precio, combustible, medidas);
        this.carroceria = carroceria;
    }

    public Turismo(Vehiculo vehiculo, TipoCarroceria carroceria) {
        super(vehiculo);
        this.carroceria = carroceria;
    }

    /*Getters y Setters*/
    public TipoCarroceria getCarroceria() {
        return carroceria;
    }
    public void setCarroceria(TipoCarroceria carroceria) {
        this.carroceria = carroceria;
    }
    @Override
    public int getPotenciaKW(int getPotenciaCV){
        double _1KW = getPotenciaCV * 1.34;
        return (int) _1KW;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

