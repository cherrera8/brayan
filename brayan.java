import java.util.Scanner;

public class caca
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String[] empleado = new String[4];
        int[] servicios = new int[4*7];
        int[] totalServicios = new int[4];
        for (int i = 0; i < empleado.length; i++)
        {
            System.out.print("Nombre del empleado: ");
            empleado[i] = sc.nextLine();
        }
        int j = 1;
        int k = 1;
        int l = 0;
        for (int i = 0; i < servicios.length; i++)
        {
            if (j > 7)
            {
                j = 1;
            }
            System.out.print("Ingrese los servicios totales del día " + j + " del empleado " + k + ": ");
            l = sc.nextInt();
            while (l < 0 || l > 30)
            {
                System.out.print("Ingresa un número válido. ");
                l = sc.nextInt();
            }
            servicios[i] = l;
            if (j % 7 == 0)
            {
                k++;
            }
            j++;
        }
        System.out.print("--------------------------------------------------\n");
        int m = 0;
        for (int i = 0; i < empleado.length; i++)
        {
            totalServicios[i] = servicios[m] + servicios[m + 1] + servicios[m + 2] + servicios[m + 3] + servicios[m + 4] + servicios[m + 5] + servicios[m + 6];
            System.out.print("Nombre del empleado: " + empleado[i] + " | Día 1: " + servicios[m] + " Día 2: " + servicios[m + 1] + " Día 3: " + servicios[m + 2] + " Día 4: " + servicios[m + 3] + " Día 5: " + servicios[m + 4] + " Día 6: " + servicios[m + 5] + " Día 7: " + servicios[m + 6] + " | Total de la semana: " + totalServicios[i] + "\n");
            System.out.print("--------------------------------------------------\n");
            m += 7;
        }
        int n = totalServicios[0];
        int o = 0;
        for (int i = 0; i < totalServicios.length; i++)
        {
            if (totalServicios[i] > n)
            {
                o = i;
                n = totalServicios[i];
            }
        }
        System.out.print("Empleado con más servicios: " + empleado[o] + ", " + totalServicios[o] + " servicios.");
        sc.close();
    }
}