public  class Moto extends Vehiculo  {
    protected int numRuedas;

    /* Constructor */
    public Moto(){}
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

     /*getter y setter*/
    public int getNumRuedas() {
        return numRuedas;
    }
    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

}
