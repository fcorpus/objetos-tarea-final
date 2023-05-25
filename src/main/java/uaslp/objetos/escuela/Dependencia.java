package uaslp.objetos.escuela;

public class Dependencia implements Dependencia1, Dependencia2,Dependencia3{
    private  boolean saved = false;
    private  boolean printed = false;
    private  boolean sent = false;
    private boolean recovered = false;
    @Override
    public void save(String c) {
        saved = true;
    }

    @Override
    public void print(int a, String c) {
        printed = true;
    }

    @Override
    public void send(int a, int b) {
        sent = true;
    }

    @Override
    public void recover() {
        recovered = true;
    }

    public boolean isSaved() {
        return saved;
    }

    public boolean isPrinted() {
        return printed;
    }

    public boolean isSent() {
        return sent;
    }
    public boolean isRecovered(){
        return recovered;
    }
}
