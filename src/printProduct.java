
   public class printProduct {

        private final SalesReport.Product product;

        public printProduct(SalesReport.Product product) {
            this.product = product;
        }

        // Display total product sales.
        public void PrintTotalProductSales() {

            System.out.println(
                    "TOTAL PRODUCT SALES: "
                            + product.GetTotalProductsSold());
        }

        // Display average product sales.
        public void PrintAverageProductSales() {

            System.out.printf(
                    "AVERAGE PRODUCT SALES: %.0f%n",
                    product.GetAverageProductSold());
        }

        // Display the most popular product.
        public void PrintMostPopularProduct() {

            String name = product.GetMostPopularProduct();

            System.out.println(
                    "MOST POPULAR PRODUCT: " + name);
        }

        // Print the complete sales report.
        public void PrintReport() {

            System.out.println("\nPRODUCT SALES REPORT - 2026");

            System.out.println(
                    "**************************************************");

            PrintTotalProductSales();
            PrintAverageProductSales();
            PrintMostPopularProduct();
        }
    }

