package challenges;

public class ProductOrderServiceImpl implements ProductOrderService {

  public void order(Product product) {

      System.out.println("zamowilem product "+ product);

  }


}




/*stwórz klasę ProductOrderService. Serwis powinien zajmować się wykonywaniem zamówień różnego rodzaju produktów – gier, kapci, szczoteczek do zębów... innymi słowy, Allegro :)

Wykorzystaj przykład poniżej jako wzór do swojej implementacji:

*********************************************************************************************************************



    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {

        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());

        if (isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }



 */