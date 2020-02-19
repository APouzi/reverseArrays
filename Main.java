package com.company;

	  class Main{
                public static void main(String args[])
                {

                    int[] array = {1,2,3,4,5};
                    int[] array2 = {1,2,3,4,5};
                    int[] reversedArr = reverseArray(array);
                    int[] reversedArr2 = reverseArray2(array2);
         printArray(reversedArr);
                    printArray(reversedArr2);


                }

            public static void printArray(int[] array){
                for(int i = 0; i < array.length; i++){
                    System.out.println("Element " + i + ", value is " + array[i]);


                }}

            public static void mean(int[] numSet){
            int y;
            int x =0;
            for (int i =0; i<numSet.length;i++){
               x += numSet[i];
            }
                int mean = x/numSet.length;
                System.out.println(mean);
            }

            public static int[] reverseArray(int[] arr){
                    int cap = arr.length-1;
                    int temp;
                    for(int i = 0; i< cap; i++){
                        temp = arr[i];
                        arr[i]=arr[cap];
                        arr[cap]=temp;
                        cap--;
                    }
                    return arr;
            }

            public static int[] reverseArray2(int[] arr){
                    int cap = arr.length-1;
                    int temp;
                    for(int i = 0; i <cap/2;i++){
                        temp = arr[i];
                        arr[i]=arr[cap-i];
                        arr[cap-i]=temp;
                    }
                    return arr;
            }
    }

