public class Practice3 {
    public static void main(){
     int[] ages = {23,13,21,39};
     int sum = 0;
     for(int x=0;x<ages.length;x++) { //x=0 cuz the array starts at 0 not 1, we want a counter that matches the array index
        sum += ages[x]; //sums up all the shit in the array, one by one, courtesy of the for loop

        }
        System.out.println(sum); //outputs at the end of the loop
    }
}
