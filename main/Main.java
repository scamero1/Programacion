import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        Moto moto1 = new Moto("Yamaha");
        Moto moto2 = new Moto("Honda");
        Vehiculo[] motos = {moto1, moto2}; 

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        Vehiculo[] carros = {carro1, carro2};


        while (true) {
            System.out.println("1) Elija el tipo de vehiculo");
            System.out.println("2) Salir del sistema");
            
            int b = 0; 
            int des = 0;
            
            try {
                des = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue; 
            }

            if (des == 1) {
                System.out.println("1) Moto");
                System.out.println("2) Carro");
                int a = 0;
                
                try {
                    a = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    continue;
                }

                if (a == 1) {
                    for (int i = 0; i < motos.length; i++) {
                        b++;
                        System.out.println(b + ") " + motos[i].toString());
                    }
                } else if (a == 2) {
                    for (int i = 0; i < carros.length; i++) {
                        b++;
                        System.out.println(b + ") " + carros[i].toString());
                    }
                }

                System.out.println("\nPresione ENTER para continuar...");
                scanner.nextLine();
                
            } else if (des == 2) {
                break;
            }
        }
    }
}