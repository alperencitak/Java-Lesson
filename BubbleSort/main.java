package BubbleSort;

public class main {
    public static void main(String[] args){
        
        int array[] = {5,7,1,3,2};
        print(array);
        //bubbleSort(array);
        //insortSort(array);
        selectionSort(array);
        print(array);
        
        
    }
    private static void bubbleSort(int[] array){
        int temp;
        for(int i=1;i<5;i++){
            for(int j=0;j<5-i;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    private static void insortSort(int[] array){
        int temp;
        for(int i=1;i<5;i++){
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    private static void selectionSort(int[] array){
        for(int i=0;i<5;i++){
            int min=i,temp=array[i];
            for(int j=i+1;j<5;j++){
                if(array[min]>array[j]){
                        min=j;
                }
            }
            array[i]=array[min];
            array[min]=temp;
        }
    }
    private static void print(int[] array){
        for(int i=0;i<5;i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
}