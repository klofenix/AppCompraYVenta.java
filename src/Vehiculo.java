public abstract  class Vehiculo {
    protected String marca, modelo;
    protected int aFabricacion, kms, portenciaCV;
    protected double precio;
    private Medidas medidas;


    protected enum TipoCombustible{
        Diesel,
        Gasolina,
        Hibrido,
        Electrico,
        GLP
    }
    protected TipoCombustible combustible;
    /*Constructor*/
    public Vehiculo(String marca, String modelo, int aFabricacion, int kms, int portenciaCV, double precio, TipoCombustible combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.aFabricacion = aFabricacion;
        this.kms = kms;
        this.portenciaCV = portenciaCV;
        this.precio = precio;
        this.combustible = combustible;
    }

/*constructor por defecto y copia*/
    public Vehiculo(){}

    public Vehiculo(Vehiculo vehiculo){
        this.marca = vehiculo.marca;
        this.modelo = vehiculo.modelo;
        this.aFabricacion = vehiculo.aFabricacion;
        this.kms = vehiculo.kms;
        this.portenciaCV = vehiculo.portenciaCV;
        this.precio = vehiculo.precio;
        this.combustible = vehiculo.combustible;
    }
    /*Getters y Setters*/
    public Medidas getMedidas() {
        return medidas;
    }

    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAFabricacion() {
        return aFabricacion;
    }
    public void setAFabricacion(int aFabricacion) {
        this.aFabricacion = aFabricacion;
    }
    public int getKms() {
        return kms;
    }
    public void setKms(int kms) {
        this.kms = kms;
    }
    public int getPotenciaCV() {
        return portenciaCV;
    }
    public void setPotenciaCV(int portenciaCV) {
        this.portenciaCV = portenciaCV;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public TipoCombustible getCombustible() {
        return combustible;
    }
    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }
    @Override
    public String toString(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAFabricacion: " + aFabricacion + "\nKms: " + kms + "\nPortenciaCV: " + portenciaCV + "\nCombustible: " + combustible;
    }
    /*Metodos*/

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public int getPotenciaKW(int getPotenciaCV){
        double _1KW = getPotenciaCV / 1.34;
        return (int) _1KW;
    }
}
