public class Main {
    public static void main(String[] args){
        int[] marks={70,80,65,90,85};
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        float average=(float)sum/marks.length;
        System.out.println("The average of the marks is: "+ average);
    }
}