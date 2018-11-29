import java.util.Scanner;
import java.util.ArrayList;
public Class Main(){
    private ArrayList<Observadores> observadores ;
    private ArrayList<Articulo> articulos ;
	private Scanner sc = new Scanner(System.in);
	public static void main ( String[] args ){
        boolean x=true;
        long startTime = System.nanoTime();
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
                                System.out.println("Ingrese 4 para salir");
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
                                        break;
                                    case 4:
                                        x=false;
                                        break;
                                }
                            }
                            else(
                                System,out.println("Ingrese 1 si desea pujar un articulo en la subasta");
                                System.out.println("Ingrese 2 si desea revisar un articulo ");
                                System.out.println("Ingrese 3 para salir");
                                int opcion2=sc.nextInt();
                                switch(opcion2){
                                    case 1:
                                        observador.get(i).pujar(observador.get(i));
                                        break;
                                    case 2:
                                        mostrarArticulos(false);
                                        break;
                                    case 3:
                                        x=false;
                                        break;
                                }

                            )
                        }
                    }
                    if(aux==0){
                        System.out.println("Nombre y/o identificador incorrectos ");
                    }
                case 3:
                    x=false;
                    break;
                long endTime = System.nanoTime();
                if(endTime-startTime>10000000000){
                    for(int i=0;i<articulos.size();i++){
                        if(articulo.get(i).getPujas().size()!=0){
                            int max=articulo.get(i).getPujas().get(0).monto;
                            int pos=0;
                            for(int j=1;j<articulo.get(i).getPujas().size();j++{
                                if(max<articulo.get(i).getPujas().get(j).monto){
                                    max=articulo.get(i).getPujas().get(j).monto;
                                    pos=j;
                                }
                            }
                            articulos.get(i).asignar(articulo.get(i).getPujas().get(pos).o);
                        }
                    }
                    startTime = System.nanoTime();
                }
            }
        }
	}
    public void crearCuenta(){
        Observador o;
        System.out.println("Ingrese su nombre");
        String n=sc.nextLine();
        System.out.println("Ingrese un numero  identificador");
        int id=sc.nextInt();
        System.out.println("Ingrese 0 si es vendedor o 1 si es comprador");
        int x=sc.nextInt();
        if(x==0){
            o=new Observador(n,true,id);
        }
        else{
            o=new Observador(n,false,id);
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