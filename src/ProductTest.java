
    import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class ProductTest {

        @Test
        void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

            SalesReport.Product product = new SalesReport.Product(
                    new String[]{
                            "Cozy Nights Monarch",
                            "Restonic Barbados",
                            "Sealy Phuket"
                    },
                    new int[][]{
                            {25, 18, 20},
                            {15, 10, 12},
                            {18, 15, 20}
                    }
            );

            assertEquals(
                    153,
                    product.GetTotalProductsSold());
        }

        @Test
        void GetAverageSales_WithValidData_ReturnsCorrectValue() {

            SalesReport.Product product = new SalesReport.Product(
                    new String[]{
                            "Cozy Nights Monarch",
                            "Restonic Barbados",
                            "Sealy Phuket"
                    },
                    new int[][]{
                            {25, 18, 20},
                            {15, 10, 12},
                            {18, 15, 20}
                    }
            );

            assertEquals(
                    17.0,
                    product.GetAverageProductSold(),
                    0.001);
        }
    }


