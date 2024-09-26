package vibro.vibro.Init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vibro.vibro.Models.Entity.Product;
import vibro.vibro.Repository.ProductsRepository;

import java.util.UUID;

@Component
public class AddProductToDB implements CommandLineRunner {

    private final ProductsRepository productsRepository;

    public AddProductToDB(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (productsRepository.count() == 0) {
            Product product = new Product();
            product.setName("Vibrofiltr 2.0");
            product.setDescription(" 2 Използва се за оформяне на водоустойчив слой," +
                    " изолиращ вибрациите в автомобили и други места, където също има нужда от звукоизолация," +
                    " защита от вибрации и корозия. " +
                    "Виброгасящият материал има многослойна структура и се състои от слой от екологично чист състав от бутилкаучук" +
                    " и алуминиево фолио.");
            product.setSizeA(0.35);
            product.setSizeB(0.5);
            product.setLostHz(200.0);
            product.setLost(0.38);
            product.setThickness(2.0);
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr 3.0");
            product.setDescription(" 3 Използва се за оформяне на водоустойчив слой, изолиращ вибрациите в автомобили и други места," +
                    " където също има нужда от звукоизолация, защита от вибрации и корозия. Виброгасящият материал има многослойна структура" +
                    " и се състои от слой от екологично чист състав от бутилкаучук и алуминиево фолио.В производството VIBROFILTR използва алуминиево фолио с висок вискозитет." +
                    " В резултат на това материалът има увеличен честотен диапазон на коефициента на механични загуби.");
            product.setSizeA(0.35);
            product.setSizeB(0.5);
            product.setLostHz(200.0);
            product.setLost(0.50);
            product.setThickness(3.0);
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr 4.0");
            product.setDescription(" 4 Използва се за оформяне на водоустойчив слой, изолиращ вибрациите в автомобили и други места," +
                    " където също има нужда от звукоизолация, защита от вибрации и корозия. Виброгасящият материал има многослойна структура" +
                    " и се състои от слой от екологично чист състав от бутилкаучук и алуминиево фолио.В производството VIBROFILTR използва алуминиево фолио с висок вискозитет." +
                    " В резултат на това материалът има увеличен честотен диапазон на коефициента на механични загуби.");
            product.setSizeA(0.35);
            product.setSizeB(0.5);
            product.setLostHz(200.0);
            product.setLost(0.60);
            product.setThickness(4.0);
            productsRepository.save(product);
        }
    }


}
