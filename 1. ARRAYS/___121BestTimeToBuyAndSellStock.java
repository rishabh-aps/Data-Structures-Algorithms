public class ___121BestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    // Get the length of the input array
    int arrayLength = prices.length;

    // Initialize the minimum buying price to the first price in the array
    int minBuyingPrice = prices[0];

    // Initialize maximum profit to 0
    int maxProfit = 0;

    // Iterate over the array starting from the second price
    for (int i = 1; i < arrayLength; i++) {
      // Calculate the profit if selling at the current price
      int profit = prices[i] - minBuyingPrice;

      // Update the maximum profit if the current profit is greater
      maxProfit = Math.max(maxProfit, profit);

      // Update the minimum buying price if the current price is lower
      minBuyingPrice = Math.min(prices[i], minBuyingPrice);
    }

    // Return the maximum profit found
    return maxProfit;
  }
}

/*
 * Intuition:
 * The problem involves finding the maximum profit from buying and selling a
 * stock on different days,
 * where you must buy before you sell. To solve this efficiently:
 * 1. Keep track of the minimum price encountered so far (`minBuyingPrice`) as
 * you iterate through the array.
 * 2. Calculate the profit if you were to sell at the current day's price
 * (`prices[i] - minBuyingPrice`).
 * 3. Keep updating the maximum profit (`maxProfit`) if the calculated profit
 * exceeds the previous maximum profit.
 * By doing this, you ensure that the algorithm efficiently computes the result
 * in a single pass through the array.
 * 
 * Time Complexity:
 * - O(n), where `n` is the number of elements in the `prices` array.
 * - The algorithm iterates through the array once, making it linear in time.
 * 
 * Space Complexity:
 * - O(1), as the algorithm uses only a few integer variables (`arrayLength`,
 * `minBuyingPrice`, `maxProfit`, and `profit`) and no additional data
 * structures.
 */
