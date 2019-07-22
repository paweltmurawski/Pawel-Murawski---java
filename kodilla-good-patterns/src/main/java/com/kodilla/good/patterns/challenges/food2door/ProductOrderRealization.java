package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderRealization {
    private ProductRepository productRepository;
    private InformClient informClient;

    public ProductOrderRealization(ProductRepository productRepository, InformClient informClient) {
        this.productRepository = productRepository;
        this.informClient = informClient;
    }

    public void realizationProcess(ProductOrderInformation productOrderInformation) {
        productOrderInformation.getProducer().process();
       boolean isOrderRealized = informClient.clientInform(productOrderInformation);
       if(isOrderRealized) {
           productRepository.createProductRepository(productOrderInformation.getProducer(), productOrderInformation.getProduct(), productOrderInformation.getDateOfRealization());
       }
       System.out.println("No order realize");
    }
}
