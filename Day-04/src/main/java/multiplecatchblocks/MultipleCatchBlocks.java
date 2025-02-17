package multiplecatchblocks;
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        //create an array
        int[] array = {2, 3, 6, 9};
        int index = 0; //specify the index
        //call method to validate age
         arrayExceptions(array, index);
    }
    //method to perform array operation
    public static void arrayExceptions(int[] array, int index){
        try { //this code might throw exception
            System.out.println("Value at index " + index + " is " + array[index]); //will throw out of bound exception
        }//catch block to handle out of bound index
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index! " + e.getMessage());
        }
        //catch block to handle null pointer
        catch (NullPointerException e){
            System.out.println("\nArray is not initialized " + e.getMessage());
        }
    }
}
