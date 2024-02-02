public class Array_2D_3D {
    public static void main(String[] args) {

        // 2D - Array
        System.out.println("2D - Array: ");
        int [][] flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for (int[] flat : flats) {
            for (int i : flat) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("\n");



        // 3D - Array
        System.out.println("3D - Array: ");

        int [][][] cuboid = new int[2][3][4];

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                for (int k=0; k<4; k++){
                    cuboid[i][j][k] = i+j+k;
                }
            }
        }

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                for (int k=0; k<4; k++){
                    System.out.print(cuboid[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
