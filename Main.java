import java.util.Scanner;

public Class Main(){
    private ArrayList<Observadores> observadores ;
    private ArrayList<Articulo> articulos ;
	private Scanner sc = new Scanner(System.in);
	public static void main ( String[] args ){
        boolean x=true;
        while(x){
            System.out.println("CASA DE SUBASTAS  ");
		    System.out.println("Ingrese 1 para crear cuenta ");
            System.out.println("Ingrese 2 para ingresar);
            System.out.println("Ingrese 3 para salir");
            int opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    System.out.print("Ingrese su nombre ");
                    String n=sc.nextLine();
                    System.out.println("Ingrese su identificador");
                    int id=sc.nextInt();
                    int aux=0;
                    for(int i=0;i<observadores.size();i++){
                        if(observadores.get(i).nombre==n && observadores.get(i).identificador==id){
                            aux=1;
                            if(observadores.get(i).vende==true){
                                System,out.println("Ingrese 1 si desea registrar un articulo en la subasta");
                                System.out.println("Ingrese 2 si desea modificar un articulo ");
                                System.out.println("Ingrese 3 si desea revisar un articulo ");
                                int opcion2=sc.nextInt();
                                switch(opcion2){
                                    case 1:
                                       articulos.add(observador.get(i).registrar(o));
                                        break;
                                    case 2:
                                        mostrarArticulos(true);
                                        break;
                                    case 3:
                                        mostrarArticulos(false);
                                }
                            }
                            else(
                                System,out.println("Ingrese 1 si desea pujar un articulo en la subasta");
                                System.out.println("Ingrese 2 si desea revisar un articulo ");

                            )
                        }
                    }
                    if(aux==0){
                        System.out.println("Nombre y/o identificador incorrectos ");
                    }
            }
        }
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
        observadores.add(o);
    }
    public void mostrarArticulos(boolean x){
        int i=0;
        for(Articulo a: articulos){
            System.out.println(i".- "+a.nombre);
        }
        System.out.println("Ingrese el numero del articulo que desea revisar/modificar");
        int j=sc.nextInt();
        if(articulos.get(j).pujas.size()==0 &&  x){
            articulos.get(j).modificar();
        }
        articulos.get(j).mostrarPujas();
    }
}