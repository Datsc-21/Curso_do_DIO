public non-sealed class Manager extends Employee{ //Extensão - subclasse

    private String login;

    private String password;

    private double commission;

    public Manager() {
    }

    public Manager(String code, String name, String address, int age, double salary) {
        super(code, name, address, age, salary);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
