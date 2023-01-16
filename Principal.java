import java.util.Scanner;
/**
 * Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 1
 * 16-01-2023
 * Clase Principal: es la que interactúa con el usuario. Solamente se comunica con la clase Radio. 
 */

public class Principal {
    
    /** 
     * @param args
     */
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

                    while (opcion >= 0 && opcion < 5){

                        System.out.println(menu);
                        System.out.println("\nEscoja una opción: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();

                        switch (opcion) {
                            case 1: //Cambiar a FM / AM
                                System.out.println("Frecuencia actual del radio: " + radio.getFrequence());
                                String frecuencia = radio.getFrequence();

                                switch (frecuencia) {
                                    case "AM":
                                        radio.setFrequence("FM");
                                        break;
                                
                                    case "FM":
                                        radio.setFrequence("AM");
                                        break;
                                    
                                    default:
                                        break;
                                }

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
                                if (radio.getFrequence() == "AM"){
                                    System.out.println("La estación actual es: " + radio.getAMActualStation());  

                                    System.out.println("¿En qué slot desea guardar la estacion? (Del 1 al 12)");
                                    int slot = teclado.nextInt();
                                    teclado.nextLine();
                                    
                                    if (slot <= 0 || slot > 12){
                                        System.out.println("Ingrese un número válido.");
                                        boolean entradaIncorrecta2 = true;
                                        
                                        while (entradaIncorrecta2){
                                            System.out.println("¿En qué slot desea guardar la estacion? (Del 1 al 12)");
                                            slot = teclado.nextInt();
                                            teclado.nextLine();
                                            
                                            if (slot > 0 && slot <= 12){
                                                entradaIncorrecta2 = false;
                                            }
                                            else{
                                                System.out.println("Ingrese un número válido.");
                                            }
                                        }
                                    }

                                    radio.saveAMStation(radio.getAMActualStation(), slot); 
                                    System.out.println("Se ha guardado el slot.");
                                    
                                }

                                else if (radio.getFrequence() == "FM"){
                                    System.out.println("La estación actual es: " + radio.getFMActualStation());  

                                    System.out.println("¿En qué slot desea guardar la estacion? (Del 1 al 12)");
                                    int slot = teclado.nextInt();
                                    teclado.nextLine();
                                    
                                    if (slot <= 0 || slot > 12){
                                        System.out.println("Ingrese un número válido.");
                                        boolean entradaIncorrecta2 = true;
                                        
                                        while (entradaIncorrecta2){
                                            System.out.println("¿En qué slot desea guardar la estacion? (Del 1 al 12)");
                                            slot = teclado.nextInt();
                                            teclado.nextLine();
                                            
                                            if (slot > 0 && slot <= 12){
                                                entradaIncorrecta2 = false;
                                            }
                                            else{
                                                System.out.println("Ingrese un número válido.");
                                            }
                                        }
                                    }

                                    radio.saveFMStation(radio.getFMActualStation(), slot); 
                                    System.out.println("Se ha guardado el slot.");
                                }

                                break;

                            case 4: // Seleccionar una emisora de las guardadas 
                                if (radio.getFrequence() == "AM"){
                                    System.out.println("La estación actual es: " + radio.getAMActualStation());  

                                    System.out.println("¿Qué slot desea sintonizar? (Del 1 al 12)");
                                    int slot2 = teclado.nextInt();
                                    teclado.nextLine();
                                    
                                    if (slot2 <= 0 || slot2 > 12){
                                        if (radio.getAMSlot(slot2) == 0){
                                            System.out.println("El slot se encuentra vacío.");
                                            boolean entradaIncorrecta3 = true;
                                            
                                            while (entradaIncorrecta3){
                                                System.out.println("¿Qué slot desea sintonizar? (Del 1 al 12)");
                                                slot2 = teclado.nextInt();
                                                teclado.nextLine();
                                                
                                                if ((slot2 > 0 && slot2 <= 12) && (radio.getAMSlot(slot2) != 0)){
                                                    entradaIncorrecta3 = false;
                                                }
                                                else{
                                                    System.out.println("El slot se encuentra vacío.");
                                                }
                                            }
                                        }
                                        
                                    }
                                    System.out.println("Se ha seleccionado la emisora: " + radio.getAMSlot(slot2));  

                                }

                                else if (radio.getFrequence() == "FM"){
                                    System.out.println("La estación actual es: " + radio.getFMActualStation());  

                                    System.out.println("¿Qué slot desea sintonizar? (Del 1 al 12)");
                                    int slot2 = teclado.nextInt();
                                    teclado.nextLine();
                                    
                                    if (slot2 <= 0 || slot2 > 12){
                                        if (radio.getFMSlot(slot2) == 0){
                                            System.out.println("El slot se encuentra vacío.");
                                            boolean entradaIncorrecta3 = true;
                                            
                                            while (entradaIncorrecta3){
                                                System.out.println("¿Qué slot desea sintonizar? (Del 1 al 12)");
                                                slot2 = teclado.nextInt();
                                                teclado.nextLine();
                                                
                                                if ((slot2 > 0 && slot2 <= 12) && (radio.getFMSlot(slot2) != 0)){
                                                    entradaIncorrecta3 = false;
                                                }
                                                else{
                                                    System.out.println("El slot se encuentra vacío.");
                                                }
                                            }
                                        }
                                        
                                    }
                                    System.out.println("Se ha seleccionado la emisora: " + radio.getFMSlot(slot2));  
                                }
                                break;

                            case 5: // Apagar el radio
                                radio.off();
                                System.out.println("Se ha apagado el radio.");
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
