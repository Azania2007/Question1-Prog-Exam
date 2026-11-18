//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

            Scanner input = new Scanner(System.in);

            // Store the three mattress product names.
            String[] productNames = {
                    "Cozy Nights Monarch",
                    "Restonic Barbados",
                    "Sealy Phuket"
            };

            // Store sales for three products over three months.
            int[][] monthlySales =
                    new int[productNames.length][3];

            // Capture monthly sales for each product.
            for (int product = 0;
                 product < productNames.length;
                 product++) {

                for (int month = 0; month < 3; month++) {

                    monthlySales[product][month] =
                            readSales(input, month + 1,
                                    productNames[product]);
                }

                System.out.println();
            }

            // Create the Product object.
            SalesReport.Product sales =
                    new SalesReport.Product(productNames, monthlySales);

            // Create and display the report.
            printProduct report = new printProduct(sales);

            report.PrintReport();
        }

        // Read and validate sales input.
        private static int readSales(
                Scanner input, int month, String productName) {

            while (true) {

                System.out.print(
                        "Enter number of sales for month "
                                + month + " for "
                                + productName + " mattress: ");

                if (input.hasNextInt()) {

                    int sales = input.nextInt();

                    if (sales >= 0) {
                        return sales;
                    }

                } else {
                    input.next();
                }

                System.out.println(
                        "Please enter a whole number that is zero or more.");
            }
        }





