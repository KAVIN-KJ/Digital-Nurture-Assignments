package DataStructures_And_Algorithms.ECommerce_Search_Function;

/*

INPUT :   
        3
        101
        Laptop
        Electronics
        102
        Mobile
        Electronics
        103
        Shirt
        Clothing
        
        Laptop

*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Product arr[] = new Product[n];
        Product sorted[] = new Product[n];
        for(int i=0;i<n;i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String cat = in.nextLine();
            arr[i] = new Product(Integer.parseInt(id), name, cat);
            sorted[i] = arr[i];
        }
        Arrays.sort(sorted, Comparator.comparing(p -> p.pname));
        System.out.println("Enter Product name to search : ");
        String sr = in.nextLine();
        System.out.println("Linear Search : ");
        System.out.println(linearSearch(arr,sr));
        System.out.println("Binary Search : ");
        System.out.println(binarySearch(arr,sr));
    }

    private static String binarySearch(Product[] arr, String sr) {

        int lt = 0;
        int rt = arr.length-1;
        while(lt<=rt){
            int mid = (lt+rt)/2;
            int comp = arr[mid].pname.compareToIgnoreCase(sr);
            if(comp > 0){
                rt = mid-1;
            }
            else if (comp<0){
                lt = mid+1;
            }
            else{
                return "Found";
            }
        }
        
        return "Not Found";
    }

    private static String linearSearch(Product[] arr, String sr) {
        for(Product p : arr){
            if(p.pname.equalsIgnoreCase(sr)) return "Found";
        }
        return "Not Found";
    }   
}
