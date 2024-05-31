public class GameLauncher {
    public static void main(String[] args) {
        GuessGame g = new GuessGame();
        int i=1;
        int sum = 0;
        float avg;
        int[] Values = new int[100];
        for(int j = 0; j!=100; j++){
            while(!g.all){
                g.startGame();
                i++;
            }
            System.out.println(i);
            Values[j]=i;
            i=0;
        }
        for(int k =0; k!=100; k++){
            sum += Values[k];
        }
        avg = sum/100.0f; //average number of tries it takes for all the players to guess correctly
        System.out.println("The average chance of all of them guessing the same number is about 1 in " + sum);
        
    }
}
