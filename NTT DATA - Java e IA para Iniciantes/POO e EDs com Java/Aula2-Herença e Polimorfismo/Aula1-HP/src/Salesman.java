public non-sealed class Salesman extends Employee{ //Extensão-subclasse

    private double percentPerSold;

    public Salesman() {
    }

    public Salesman(String code, String name, String address, int age, double salary) {
        super(code, name, address, age, salary);
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
