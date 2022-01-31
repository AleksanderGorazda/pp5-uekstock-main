package pl.agorazda.stock.sales;

public interface ProductDetailsProvider {
    ProductDetails getProductDetails(String productId);
}