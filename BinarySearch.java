public class BinarySearch {
    public int binarySearch(int arr[], int no){
        int l=0;
        int r = arr.length-1;
        int x = no;

        while(l<=r){
            int m = l + (r-l)/2;

            //check at mid
            if(arr[m]==x){
                return m;
            }

            //If x is greater, ignore left half
            if(arr[m]<x){
                l=m+1;
            }
            //If x is smaller, ignore right half
            else r=m-1;
        }
        //if element is not preset
        return -1;
    }

    public static void main(String agrs[]){
        //Sorted array
        int arr[] = {10,13,14,18,20,25,65,70,80,82,84,89,90};
        //Element to be searched
        int no = 65;
        int result = new BinarySearch().binarySearch(arr,no);

        if (result==-1){
            System.out.println("Element not present");
        }
        else
            System.out.println("Element is present at index "+result);

    }
}
