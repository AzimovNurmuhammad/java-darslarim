// import java.util.Scanner;
// import java.util.Collections; // 4, 5- usul uchun kerak
// import java.util.Arrays; //3- usul uchun kerak emas
public class massiv_saralash {
    public static void main(String[] args){
//1- usul kichikdan katta songa qarab tartiblaydi
/*
bu 1- usul
siklda tartiblash
        int massiv[] = {16, 3, 7, 9, 0};
        for(int k = 0; k < massiv.length; k++)
            System.out.printf("%d ",massiv[k]);

        System.out.println("");
        int barter;

        for (int i = 0; i < massiv.length; i++)
            for (int j = 0; j < i; j++)
                if(massiv[i] < massiv[j]){
                    barter = massiv[i];
                    massiv[i] = massiv[j];
                    massiv[j] = barter;

                }
        for(int k = 0; k < massiv.length; k++)
            System.out.printf("%d ",massiv[k]);

 */

//2- usul kichikdan katta songa qarab tartiblaydi
/*
bu 2- usul sort metodidan foydalandik Arrays kutubxonasini

//defining an array of integer type
        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
//invoking sort() method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("%d ",array[i]);
        }
*/

//3- usul kichikdan katta songa qarab tartiblaydi
/*

bu usulda biz class yaratib va shu orqali saraladik
        int i;
//initializing an array
        int array[] = {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
        System.out.print("Array elements before sorting: \n");
        for(i = 0; i < array.length; i++)
            System.out.println(array[i]);
//invoking user defined method
        sortArray(array, array.length);
        System.out.print("Array elements after sorting: \n");
//accessing elements of the sorted array (tartiblangan massiv elementlariga kirish )
        for(i = 0; i <array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    //user defined method to sort an array in ascending order ( massivni o'sish tartibida saralash
    // uchun foydalanuvchi tomonidan belgilangan usul )
    private static void sortArray(int array[], int n)
    {
        for (int i = 1; i < n; i++)
        {
            int j = i;
            int a = array[i];
            while ((j > 0) && (array[j-1] > a))   //returns true when both conditions are true
            {
                array[j] = array[j-1];
                j--;
            }
            array[j] = a;
        }
*/

//4- usulda kattadan kichikka qarab saralaydi
/*
        Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
// sorts array[] in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " + Arrays.toString(array));
*/

/* biz bu  usullarda int, double, float va shunga o'xshagan sonlar yoki
raqamlar bilan ishlaydigan turdagilar uchun saralashdi amalga oshirdik
 */

//5- usul Stringda alfabitga teskari tartibda sarala
/*
        String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
// sorts array[] in descending order
        Arrays.sort(strarray, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(strarray));
*/

//6- usulda kattadan kichikka qarab saraladik
/*
        int temp;
//initializing an array
        int a[]={12,5,56,-2,32,2,-26,9,43,94,-78};
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order:");
//accessing element of the array
        for (int i = 0; i <=a.length - 1; i++)
        {
            System.out.println(a[i]);
        }

 */

//7- usulda usulda kattadan kichikka qarab saraladik
/*        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
//        massivga qiymat kiritamiz
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order:");
// Teskari saralashda sikldan foydalanamiz
        for (int i = 0; i < n - 1; i++)
        {
            System.out.println(a[i]);
        }
        System.out.print(a[n - 1]);

 */
    }
}
