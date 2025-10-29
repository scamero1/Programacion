package Notas;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Base {
    
    static ArrayList<String> estudiantes = new ArrayList<>();

    public static void main(String [] args) {
        
        JOptionPane.showMessageDialog(
                null,
                "¡Bienvenido al sistema de Notas UNAB!",
                "Mensaje de bienvenida", JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Vas a modificar las notas (ten en cuenta que una vez subidas, no se podrán modificar)");
        
        int opcion;

        do {
            String menu = JOptionPane.showInputDialog(null, 
                    "===== MENÚ PRINCIPAL =====\n"
                    + "1. Registrar un nuevo estudiante\n"
                    + "2. Mostrar la lista de estudiantes\n"
                    + "3. Salir del programa", 
                    "Menú Interactivo",
                    JOptionPane.QUESTION_MESSAGE);

            if (menu == null) break; // Si presiona cancelar, salir

            try {
                opcion = Integer.parseInt(menu);  
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    rEstudiante();
                    break;
                case 2:
                    mostrarEstudiantes();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta, intenta de nuevo");
            }
        } while (opcion != 3);
    }
    
    public static void rEstudiante() {
        String nombre = JOptionPane.showInputDialog(null, 
                "Ingrese el nombre del estudiante", "Datos del estudiante",
                JOptionPane.QUESTION_MESSAGE);
        
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre no válido.");
            return;
        }

        Object seleccion = JOptionPane.showInputDialog(null, 
                "Seleccione la carrera del estudiante", "Datos del estudiante",
                JOptionPane.QUESTION_MESSAGE, null, new Object[] {
                        "Administración de Empresas (presencial, virtual y dual)",
                        "Administración Turística y Hotelera",
                        "Arquitectura",
                        "Comunicación Social",
                        "Contaduría Pública (presencial y virtual)",
                        "Derecho (también en modalidad virtual)",
                        "Economía",
                        "Enfermería",
                        "Finanzas",
                        "Ingeniería Biomédica",
                        "Ingeniería de Sistemas",
                        "Ingeniería Eléctrica",
                        "Ingeniería Electrónica",
                        "Ingeniería Industrial",
                        "Ingeniería Mecánica",
                        "Ingeniería Mecatrónica",
                        "Medicina",
                        "Negocios Internacionales",
                        "Psicología"
                }, 
                "Administración de Empresas (presencial, virtual y dual)");

        double nota1 = obtenerNota("Ingrese la primera nota del estudiante");
        double nota2 = obtenerNota("Ingrese la segunda nota del estudiante");
        double nota3 = obtenerNota("Ingrese la tercera nota del estudiante");

        double promedio = (nota1 + nota2 + nota3) / 3;

        String registro = "Nombre: " + nombre +
                          "\nCarrera: " + seleccion +
                          "\nNotas: " + nota1 + ", " + nota2 + ", " + nota3 +
                          "\nPromedio: " + String.format("%.2f", promedio);

        estudiantes.add(registro);

        JOptionPane.showMessageDialog(null, "Estudiante registrado con éxito.\n\n" + registro);
    }

    public static double obtenerNota(String mensaje) {
        double nota = 0;
        boolean valid = false;
        while (!valid) {
            try {
                String input = JOptionPane.showInputDialog(null, mensaje, "Datos del estudiante", JOptionPane.QUESTION_MESSAGE);
                if (input == null) return 0;
                nota = Double.parseDouble(input);
                if (nota < 0 || nota > 5) {
                    throw new NumberFormatException();
                }
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una nota válida (0.0 - 5.0).");
            }
        }
        return nota;
    }

    public static void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
        } else {
            StringBuilder lista = new StringBuilder("===== LISTA DE ESTUDIANTES =====\n\n");
            for (String est : estudiantes) {
                lista.append(est).append("\n---------------------------\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }
}
