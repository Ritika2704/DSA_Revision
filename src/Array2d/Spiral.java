package Array2d;

public class Spiral {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSprial(matrix);
    }
    public static void printSprial(int mat[][]){
        for(int i =0; i<mat.length; i++){
            if(i%2 ==0){
                for(int j =0; j<mat[i].length; j++){
                    System.out.print(mat[i][j]+ " ");
                }
            }else{
                for(int j=mat[i].length-1; j>=0; j--){
                    System.out.print(mat[i][j]+ " ");
                }
            }
            System.out.println();
        }
    }
}
