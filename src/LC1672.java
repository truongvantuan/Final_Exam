public class LC1672 {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            max = Math.max(max, temp);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 }, { 2, 3, 4 }, { 3, 4, 5 } };
        System.out.println(LC1672.maximumWealth(accounts));
    }
}
