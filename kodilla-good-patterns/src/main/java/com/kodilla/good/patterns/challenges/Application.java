package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        SaleRequestRetriever saleRequestRetriever = new SaleRequestRetriever();
        SaleRequest saleRequest = new SaleRequestRetriever().retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new SaleService(), new SaleRepository());
        productOrderService.process(saleRequest);
    }
}
