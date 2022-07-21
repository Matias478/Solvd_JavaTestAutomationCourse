import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {9, 15, 12, 8, 7, 6};
        Scanner in = new Scanner(System.in);
        System.out.println("Ascendent sort(1): \n" +
                "Descendent sort(0): \n" + "Choose the type of sort: ");
        int criterio = in.nextInt();
        System.out.println("Number without sort");
        ShowNumbers(numbers);
        SortNumbers(numbers,criterio);
        System.out.println("Numbers sorted");
        ShowNumbers(numbers);



    }
    public static void ShowNumbers(int num[])
    {
        for (int i=0;i<num.length;i++)
        {
            System.out.print(num[i]);
            System.out.print(" ");
        }
        System.out.println("\n");
    }
    public static void SortNumbers(int num[], int criterio) {
        int aux;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (criterio == 1) {
                    if (num[i] > num[j]) {
                        aux = num[i];
                        num[i] = num[j];
                        num[j] = aux;
                    }
                } else if (criterio == 0) {
                    if (num[i] < num[j]) {
                        aux = num[i];
                        num[i] = num[j];
                        num[j] = aux;
                    }
                }
            }
        }
    }

}
