public class CalculateSumAndAverage {
    public static void main(String[] args) {
          int [] ages = {23,45,56,1,2};
    int sum =0 ;
    int average =0;
    for(int age : ages){
        sum += age;
        average = sum / ages.length;
    }
    System.out.println(sum);
System.out.println(average);

    
    }
  
}
