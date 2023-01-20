public class Main {
    //task 1 and 2
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        double[] weightsWeek = {109.8, 109.3, 109.1, 108.8, 107.9, 107.3, 106.9};
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length -1){
                System.out.println(array1[i]);
            }
            else{
                System.out.print(array1[i] + ", ");
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1){
                System.out.println(array2[i]);
            }
            else{
                System.out.print(array2[i] + ", ");
            }
        }
        for (int i = 0; i < weightsWeek.length; i++) {
            if (i == weightsWeek.length - 1){
                System.out.println(weightsWeek[i]);
            }
            else{
                System.out.print(weightsWeek[i] + ", ");
            }
        }
        //task 3
        for (int i = 2; i >= 0; i--) {
            if (i == array1.length - 3){
                System.out.println(array1[i]);
            }
            else{
                System.out.print(array1[i] + ", ");
            }
        }
        for (int i = 2; i >= 0; i--) {
            if (i == array2.length - 3){
                System.out.println(array2[i]);
            }
            else{
                System.out.print(array2[i] + ", ");
            }
        }
        for (int i = 6; i >= 0; i--) {
            if (i == weightsWeek.length - 7){
                System.out.println(weightsWeek[i]);
            }
            else{
                System.out.print(weightsWeek[i] + ", ");
            }
        }
        //task 4
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0){
                array1[i] = array1[i] +1;
            }
            System.out.print(array1[i] + " ");
        }
    }
}