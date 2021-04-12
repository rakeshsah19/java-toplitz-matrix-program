package com.rakesh;

/**
 * given a nxm matrix i want to find weather it is toplitz matrix
 * or not
 */



public class toeplitzMatrix {
    public boolean istoeplitzMatrix(int[][]matrix){
        for(int row=0;row<matrix.length-1;row++) {
            for (int col = 0; col < matrix[row].length - 1; col++){
                if (matrix[row][col] != matrix[row + 1][col + 1])
                    return false;
            }
        }
        return true;
    }

    private static void print2DMatrix(int[][]matrix){
        System.out.println("test matrix: \n");
        for (int[]row:matrix){
            for (int valinRow:row)
            {
                System.out.print(valinRow+" ");

            }
            System.out.print("\n");
        }

    }


    public static void main(String[] args) {
        toeplitzMatrix ToeplitzMatrix=new toeplitzMatrix();

        int[][] testCase1={{1,2,3},{4,5,6},{7,8,9}};
        print2DMatrix(testCase1);
        System.out.println(" Is testCase1 matrix a toeplitz:" + ToeplitzMatrix.istoeplitzMatrix(testCase1));

        int[][] testcase2={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        print2DMatrix(testcase2);
        System.out.println(" Is testCase2 matrix a toeplitz:"+ ToeplitzMatrix.istoeplitzMatrix(testcase2));
    }

}
