package hackerearth;

public class EmployeeRating {
    public static int maxRating(int N[]){
        int previousMax=0;
        int currentMax=0;
        for(int i=0;i<N.length;i++){
            if(N[i]>6){
                currentMax++;
            }else if(currentMax > previousMax) {
                previousMax = currentMax;
                currentMax = 0;
            }
            else{
                currentMax = 0;
            }

        }
        return currentMax>previousMax?currentMax:previousMax;
    }
    public static void main(String[] args){
      int[] N = {2, 3, 7, 8, 7, 6, 3, 8, 12, 11, 12, 10};
      System.out.println(maxRating(N));
    }
}
