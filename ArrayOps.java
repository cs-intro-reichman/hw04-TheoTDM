public class ArrayOps {
    public static void main(String[] args) {
        int [] arr  = {2,8,3,7,8};
        System.out.println(secondMaxValue(arr));
    }
    
    public static int findMissingInt (int [] array){
        if(array.length==1)
            return 1;
        for(int i =0 ; i<array.length ; i++){
            boolean t = false;
            for(int j= 0 ; j<array.length;j++){
                if(array[j]==i)
                    t = true;
            }
            if(!t)
                return i;
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int scmax = array[0];
        for(int i = 1; i<array.length; i++){
            if(max <= array[i]){
                scmax = max;
                max = array[i];
            }
        }
        return scmax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2){
        boolean t = false;
        for(int i = 0;i<array1.length;i++){
            t = false;
            for(int j = 0;j<array2.length;j++){
                if(array1[i]==array2[j])
                    t = true;
            }
            if(!t)
                    return false;
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        if(array[0] > array[1]){
            for(int i = 1;i<array.length-1;i++){
                if(array[i] < array[i+1])
                    return false;
            }
            return true;
        }
        for(int i = 1 ; i<array.length-1;i++){
            if(array[i] >= array[i+1])
                return false;
        }
        return true;    
    }

}