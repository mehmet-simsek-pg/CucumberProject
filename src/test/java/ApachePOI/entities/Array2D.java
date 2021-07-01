package ApachePOI.entities;

public class Array2D {
    public static void main(String[] args) {

        String [][] zoo={{"leon","1"},{"Tiger","2"},{"Zebra","3","1"},{"Elephant","4"}};

        for (int i = 0; i < zoo.length; i++) {
            for (int j = 0; j < zoo[i].length; j++) {
                System.out.print(zoo[i][j]+" ");
            }
            System.out.println();
        }
    }
}
