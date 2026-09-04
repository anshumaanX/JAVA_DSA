public class BestTimeToBuyAndSellStock05 {

    /*
     * Best Time to Buy and Sell Stock
     *
     * We can buy the stock only before selling it.
     *
     * buyPrice  -> stores the lowest price seen so far.
     * maxProfit -> stores the maximum profit found so far.
     *
     * For every price:
     *
     * 1. If it is lower than buyPrice,
     *    update buyPrice.
     *
     * 2. Otherwise, calculate the profit by selling
     *    at the current price.
     *
     * 3. Update maxProfit if the current profit is greater.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int buyAndSell(int arr[]) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;


        /*
         * Traverse through the stock prices.
         */
        for (int i = 0; i < arr.length; i++) {

            /*
             * Find the lowest buying price.
             */
            if (arr[i] < buyPrice) {

                buyPrice = arr[i];

            } else {

                /*
                 * Calculate profit if we sell
                 * at the current price.
                 */
                int profit = arr[i] - buyPrice;

                /*
                 * Store the maximum profit.
                 */
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }


    public static void main(String[] args) {

        int arr[] = {7, 1, 5, 3, 6, 4};

        int result = buyAndSell(arr);


        /*
         * If profit is greater than 0,
         * print the profit.
         *
         * Otherwise, print "No profit".
         */
        System.out.println(
            result > 0
                ? "Profit: " + result
                : "No profit"
        );
    }
}