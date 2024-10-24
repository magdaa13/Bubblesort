public class Bubblesort {
    public static void main(String[] args) {
        //das zu sortierende Array
        int array [] = {5, 1, 3, 8, 11};
        //ich bin ein koMMENTARAAA
        System.out.println("Hier kommt ein unsortiertes Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //Vertauschungen zählen
        int swapCounter = 0;
        boolean swapped;

        //das ist eine wundervolle do-Schleife
        do {
            swapped = true;
            for (int i = 0; i < array.length - 1; i++) {

                //Vergleichen der Elemente
                if (array[i] > array[i + 1]) {
                    //Tauschen der Elemente
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                    swapCounter++;

                }
            }
        }
            while(swapped);{

                //Ausgabe sortiertes Array
                System.out.println("Sortiertes Array;");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
       }
        // Ausgabe der Anzahl der Vertauschungen
        System.out.println("Anzahl der Vertauschungen: " + swapCounter);
        System.out.println("LOL im pfushing your code");
        }
    }
