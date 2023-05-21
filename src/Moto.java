public  class Moto extends Vehiculo  {
    private int numRuedas;

    /* Constructor */
    public final void Moto(){}
    public Moto(int numRuedas){
        this.numRuedas = numRuedas;
    }

    public Moto(String marca, String modelo, int aFabricacion, int kms, int potenciaCV, double precio, TipoCombustible combustible, Medidas medidas, int numRuedas) {
        super(marca, modelo, aFabricacion, kms, potenciaCV, precio, combustible, medidas);
        this.numRuedas = numRuedas;
    }

    public Moto(Moto moto){
        super(moto);
        this.numRuedas = moto.numRuedas;
    }
    /* toString */
    public String toString(){
        return "Moto";
    }
    /*hascode e equals*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        Moto other = (Moto) obj;
        if (numRuedas!= other.numRuedas)
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numRuedas;
        return result;
    }
    @Override
    public int getPotenciaKW(int getPotenciaCV){
        double _1KW = getPotenciaCV * 1.34;
        return (int) _1KW;
    }

     /*getter y setter*/
    public int getNumRuedas() {
        return numRuedas;
    }
    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

}
