package com.kavish.tutorials.exercise.array;

public class ReplaceCharInArray {
    public static void main(String[] args) {
        char[] inputArray = {'1','3','5',' ','9','$','#',' ','9','*','-','-','-','-'};
        System.out.println("Original Array :");
        for(int i=0;i<inputArray.length;i++){
            System.out.print(inputArray[i]);
        }
        System.out.println("");
        inputArray = execute(inputArray);
        System.out.println("");
        System.out.println("New Array :");
        for(int i=0;i<inputArray.length;i++){
            System.out.print(inputArray[i]);
        }
        //System.out.println("New Array : " + inputArray);

    }

    private static char[] execute(char[] inputArray) {
    for(int i=0;i<inputArray.length;i++){
        if(inputArray[i] == ' '){
            //inputArray[i] = '%';
            //perform right shift
            inputArray = performRightShift(inputArray);
            /*inputArray[i+1] = '2';
            inputArray[i+2] = '0';*/
        }
    }
        System.out.println("After right shift");
        for(int i=0;i<inputArray.length;i++){
            System.out.print(inputArray[i]);
        }
        return inputArray;
    }

    private static char[] performRightShift(char[] inputArray) {
        char temp=inputArray[inputArray.length-1];
        for(int i=inputArray.length-1;i>0;i--)
        {
            inputArray[i]=inputArray[i-1];
        }
        inputArray[0]=temp;
        return inputArray;
    }
}
