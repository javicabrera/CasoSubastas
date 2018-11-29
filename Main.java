import java.util.Scanner;

public Class Main(){
    private observadores ArrayList<Observadores>;
    private articulos ArrayList<Articulo>;
	private Scanner sc = new Scanner(System.in);
	public static void main ( String[] args ){
		
	}
    public void crearCuenta(){
        Observador o;
        String n=sc.nextLine();
        System.out.println("Ingrese 0 si es vendedor o 1 si es comprador");
        int x=nextInt();
        if(x==0){
            o=new Observador(n,true);
        }
        else{
            o=new Observador(n,false);
        }
    }
    public void mostrarArticulos(){
        int i=0;
        for(Articulo a: articulos){
            System.out.println(i".- "+a.nombre);
        }
        System.out.println("Ingrese el numero del articulo que desea revisar");
        int j=sc.nextInt();
        articulos.get(j).mostrarPujas();
    }
}