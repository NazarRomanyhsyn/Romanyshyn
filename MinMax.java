public class MinMax{
    public static void main(String[] args){
        int arrayCount = 100;
        int[][] massive = new int[arrayCount][arrayCount];
        for(int i=0;i<arrayCount;i++){
            for(int j=0;j<arrayCount;j++){
                massive[i][j] = ((int)Math.round(Math.random()*10000));
            }
        }
        int min = massive[0][0];
        for(int i=0; i<arrayCount-1; i++){
            for(int j=0; j<arrayCount; j++){
                if(massive[i][j]<min){
                    min = massive[i][j];
                }
            }
        }

        System.out.print(min);
    }
}