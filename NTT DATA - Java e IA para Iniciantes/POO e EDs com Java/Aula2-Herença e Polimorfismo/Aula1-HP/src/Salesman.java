public non-sealed class Salesman extends Employee{ //Extensão-subclasse

    private double percentPerSold;

    public Salesman() {
    }

    public Salesman(String code, String name, String address,
                    int age, double salary, double percentPerSold) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
    }

    @Override
    public String getCode(){ //sobrecrevendo
        return "SL" + super.getCode();
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
