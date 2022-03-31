import java.util.ArrayList;
import java.util.Arrays;
//Metodos
class CafeUtil {

    public static int getStreakGoal(int numinicio,int numWeeks){
        int i,suma;
        suma = 0;
        numWeeks=numWeeks;

        for (i=1; i<= numWeeks; i++) {
            System.out.println("proceso"+i);
            suma = suma + i;
            System.out.println(suma);
        }
        return suma;
    }

    public static double getOrderTotal(double[] prices) {
        double suma = 0;

		for (int x = 0; x < prices.length; x++) {
            System.out.println("proceso"+x);
			suma += prices[x];
            System.out.println(suma);
		}
        return suma;
    }


    public void displayMenu(ArrayList<String>menu){
        for (String name:menu){
            System.out.println(name);
        }
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Ingrese su nombre:\n");
        String userName =  System.console().readLine();
        int clientesCantidad = customers.size();
        System.out.println("Hola "+ userName+ " hay " +clientesCantidad+" personas frente a ti");
        customers.add(userName);

        // for(String name:customers){
        //     System.out.println(name);
        // }
        System.out.println(customers.toString());

    }

}
    





