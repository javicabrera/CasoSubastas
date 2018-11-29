public class Puja(){
    public int monto;
    public Observador o;

    public Puja(int monto, Observador o){
        this.monto=monto;
        this.o=o;
    }

    public void toString(){
        System.out.println("Monto "+monto);
        System.out.println("Comprador "+o.nombre);
    }
}