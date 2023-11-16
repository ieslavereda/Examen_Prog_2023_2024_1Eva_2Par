package es.ieslavereda;

public class Exercise04 {

    public static void main(String[] args) {
        String[][] people = {
                {"Juan","5.75"},
                {"Carlos","8.70"},
                {"Teresa","7.25"},
                {"Ana","3.2"},
                {"Antonio","8"},
                {"Francisco","4.1"},
                {"Luis","6.75"},
                {"Lorena","9.9"},
        };

        System.out.println("a) Sorted by name");
        sortByName(people);
        show(people);

        System.out.println("\nb) Sorted by grades");
        sortByGrade(people);
        show(people);
    }




    public static void sortByName(String[][] array){
        int menor;

        for(int i=0;i<array.length-1;i++){
            menor = i;
            for(int j=i;j< array.length ; j++){
                if(array[j][0].compareTo(array[menor][0])<0)
                    menor=j;
            }
            if(i!=menor)
                swap(array,i,menor);
        }
    }

    private static void sortByGrade(String[][] array) {
        int mayor;

        for(int i=0;i<array.length-1;i++){
            mayor = i;
            for(int j=i;j< array.length ; j++){
                if(Float.parseFloat(array[j][1])>Float.parseFloat(array[mayor][1]))
                    mayor=j;
            }
            if(i!=mayor)
                swap(array,i,mayor);
        }
    }

    private static void show(String[][] people) {
        for(String[] p : people)
            System.out.println(p[0] + " -> " + p[1]);
    }

    private static void swap(String[][] array, int i, int j) {
        String[] aux = array[i];
        array[i]=array[j];
        array[j] = aux;
    }
}
