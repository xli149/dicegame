class MonetaryCoin extends Coin{
    private double value;
    public MonetaryCoin(double value){
        super();
        this.value = value;
    }
    public double getValue(){
        return value;
    }
    public String toString(){
        String result = super.toString() + "\t" + value;
        return result;
    }
}