package packpage;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {

        int wealth = 0;

        for(int i = 0; i < accounts.length; i++){
            int aux = 0;
            for(int j = 0; j < accounts[i].length; j++){
                aux += accounts[i][j];
            }if(aux >= wealth){
                wealth = aux;
            }
        }
        return wealth;
    }
}
