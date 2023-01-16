import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Radio radio = new Radio();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        String menu = "\n°°°°°°°°°°°°°°°°°°°° RADIO °°°°°°°°°°°°°°°°°°°\n1. Cambiar a FM / AM \n2. Avanzar emisora \n3. Guardar emisora actual \n4. Seleccionar una emisora de las guardadas \n5. Apagar el radio.°";

        while (opcion >= 0 && opcion < 5){
            try{
                System.out.println("\n¿Desea encender el radio?\n1. SI\n2. NO");
                int encender = teclado.nextInt();
                teclado.nextLine();

                if (encender == 1){

                    while (opcion >= 0 && opcion < 6){

                        System.out.println(menu);
                        System.out.println("\nEscoja una opción: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();

                        switch (opcion) {
                            case 1: //Cambiar a FM / AM
                                System.out.println("Frecuancia actual del radio: " + radio.getFrequence());
                                String frecuencia = radio.getFrequence();
                                radio.setFrequence(frecuencia);
                                System.out.println("La frecuencia se ha cambiado a: " + radio.getFrequence());
                                break;

                            case 2: // Avanzar emisora
                                System.out.println("\n1. Subir estacion \n2. Bajar estacion");
                                int subirBajar = teclado.nextInt();
                                teclado.nextLine();

                                if(subirBajar!=1 && subirBajar!=2){
                                    System.out.println("Ingrese un numero valido");

                                    boolean entradaIncorrecta = true;
                                    while(entradaIncorrecta){
                                        System.out.println("\n1. Subir estacion \n2. Bajar estacion");
                                        subirBajar = teclado.nextInt();
                                        teclado.nextLine();

                                        if(subirBajar ==1 || subirBajar ==2){
                                            entradaIncorrecta = false;
                                        }

                                        else{
                                            System.out.println("Ingrese un numero valido");
                                        }
                                    }
                                }

                                if(radio.getFrequence()=="AM"){
                                    switch (subirBajar) {
                                        case 1:
                                            radio.Forward();
                                            System.out.println("Se ha subido la estacion, la estacion actual es:" + radio.getAMActualStation());
                                            break;

                                        case 2:
                                            radio.Backward();
                                            System.out.println("Se ha bajado la estacion, la estacion actual es:" + radio.getAMActualStation());
                                            break;
                                    
                                        default:
                                            break;
                                    }
                                }

                                else if(radio.getFrequence()=="FM"){
                                    switch (subirBajar) {
                                        case 1:
                                            radio.Forward();
                                            System.out.println("Se ha subido la estacion, la estacion actual es:" + radio.getFMActualStation());
                                            break;

                                        case 2:
                                            radio.Backward();
                                            System.out.println("Se ha bajado la estacion, la estacion actual es:" + radio.getFMActualStation());
                                            break;
                                    
                                        default:
                                            break;
                                    }
                                }

                                break;

                            case 3: // Guardar emisora actual 
                                break;

                            case 4: // Seleccionar una emisora de las guardadas 
                                break;

                            case 5: // Apagar el radio
                                break;
                        
                            default:
                                break;
                        }
                    }
                }

                else{
                    System.out.println("\nNo se encendió el radio.");
                    System.exit(0);
                }

            }
            catch (Exception e){
                teclado.nextLine();
                System.out.println("\nEntrada incorrecta. Verificar que el tipo de dato ingresado sea el solicitado.");
                System.out.println();
            }
        }
        
    }
}
