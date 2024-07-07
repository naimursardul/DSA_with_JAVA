class array_demo {
    static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }


    // Removing evenn integers from array elements
    static int[] removeEven(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }

        int[] result = new int[count];
        int indx = 0;
        for(int j = 0; j < arr.length ; j++){
            if(arr[j] % 2 != 0){
                result[indx] = arr[j];
                indx++;
            }
        }
        return result;
    }

    // Reversing Array
    static int[] reverseArr(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while(start < end){
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }

    // Finding the min val
    static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
  

    // Finding the 2nd max value
    static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    
    // Move all zeroes to end of an array with maintaining the relative order of non-zero value
    static void moveZeroes(int[] arr){
        int zeroPointer = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 && arr[zeroPointer] == 0){
                int temp = arr[zeroPointer];
                arr[zeroPointer] = arr[i];
                arr[i] = temp;
            }
            if(arr[zeroPointer] != 0){
                zeroPointer++;
            } 
        }
    }


    // Resizing the array
    static int[] resizeArr(int[] arr, int capacity){
        int[] newArr = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // Find the missing number
    static int missingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = n * ( n + 1 ) / 2;
        for(int val : arr){
            sum -= val;
        }
        return sum;
    }


    // Palindrome
    static boolean checkPalindrome(String word){
        char[] charArr = word.toCharArray();
        int start = 0;
        int end = charArr.length - 1;
        while(end > start){
            if(charArr[start] != charArr[end]){
                return false;
            } 
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args){
        // int[] myArr = {1,6,3,2,5};
        
        
        boolean isPalindrome = checkPalindrome("madamm");
        // moveZeroes(myArr);
        // printArr(myArr);
        // int secondMaxval = findSecondMax(myArr);
        System.out.println(isPalindrome);
    }
    
}
