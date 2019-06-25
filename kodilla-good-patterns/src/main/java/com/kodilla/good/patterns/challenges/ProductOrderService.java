package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private SaleService saleService;
    private SaleRepository saleRepository;

    public ProductOrderService(final InformationService informationService, final SaleService saleService, final SaleRepository saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }

    public SoldDto process(final SaleRequest saleRequest) {
        boolean isSold = saleService.sold(saleRequest.getUser(), saleRequest.getDateOfSale());

        if (isSold) {
            informationService.inform(saleRequest.getUser(), saleRequest.getDateOfSale());
            saleRepository.createSale(saleRequest.getUser(), saleRequest.getDateOfSale());
            return new SoldDto(saleRequest.getUser(), true);
        } else {
            return new SoldDto(saleRequest.getUser(), false);
        }
    }
}
