class SalesReport {
    public static class Product implements Isales.IProducts {

        private final String[] productNames;
        private final int[][] monthlySales;

        public Product(String[] productNames, int[][] monthlySales) {

            if (productNames == null || monthlySales == null
                    || productNames.length != monthlySales.length) {
                throw new IllegalArgumentException(
                        "Product names and sales data must match.");
            }

            this.productNames = productNames;
            this.monthlySales = monthlySales;
        }

        // Calculate the total number of products sold.
        @Override
        public int GetTotalProductsSold() {

            int total = 0;

            for (int[] productSales : monthlySales) {
                for (int monthlySale : productSales) {
                    total += monthlySale;
                }
            }

            return total;
        }

        // Calculate the average number of products sold.
        @Override
        public double GetAverageProductSold() {

            int numberOfEntries = 0;

            for (int[] productSales : monthlySales) {
                numberOfEntries += productSales.length;
            }

            if (numberOfEntries == 0) {
                return 0;
            }

            return (double) GetTotalProductsSold() / numberOfEntries;
        }

        // Find the product with the highest combined sales.
        @Override
        public String GetMostPopularProduct() {

            if (productNames.length == 0) {
                return "No products available";
            }

            int highestTotal = Integer.MIN_VALUE;
            int popularIndex = 0;

            for (int i = 0; i < monthlySales.length; i++) {

                int productTotal = 0;

                for (int sale : monthlySales[i]) {
                    productTotal += sale;
                }

                if (productTotal > highestTotal) {
                    highestTotal = productTotal;
                    popularIndex = i;
                }
            }

            return productNames[popularIndex];
        }

        // Calculate the total sales for one product.
        public int GetProductTotal(int index) {

            int total = 0;

            for (int sale : monthlySales[index]) {
                total += sale;
            }

            return total;
        }
    }
}
