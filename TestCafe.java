import java.util.ArrayList;
import java.util.Arrays;
class TestCafe {
    public static void main(String[] args) {
        
        CafeUtil appTest = new CafeUtil();

        System.out.println("\n----- Prueba Meta café -----");
        System.out.printf("Compras necesarias para la semana 10:  %s \n\n",appTest.getStreakGoal(1,10));

        
        System.out.println("----- Prueba Total Orden -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Total orden: %s \n\n",appTest.getOrderTotal(lineItems));

        System.out.println("----- Prueba Mostrar Menú-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("café de goteo");
        menu.add("capuchino");
        menu.add("latte");
        menu.add("moka");
        appTest.displayMenu(menu);

        System.out.println("\n----- Prueba acgregar cliente-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Probar 4 veces ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }



    }

}

