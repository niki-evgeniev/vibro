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
            product.setImagePath("/img/Vibrofiltr 2.jpg");
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
            product.setImagePath("/img/Vibrofiltr 3.jpg");
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
            product.setImagePath("/img/Vibrofiltr 4.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr 1.5");
            product.setDescription("Използва се за оформяне на водоустойчив слой, изолиращ вибрациите в автомобили и други места, където също има нужда от звукоизолация, защита от вибрации и корозия. Виброгасящият материал има многослойна структура и се състои от слой от екологично чист състав от бутилкаучук и алуминиево фолио.");
            product.setSizeA(0.7);
            product.setSizeB(0.5);
            product.setLostHz(200.0);
            product.setLost(0.38);
            product.setThickness(1.5);
            product.setImagePath("/img/Vibrofiltr 1.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Самозлепващ тепих - сив");
            product.setDescription("некво инфо");
            product.setSizeA(1.4);
            product.setSizeB(0.7);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(2.0);
            product.setImagePath("/img/tepih.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Самозлепващ тепих - черен");
            product.setDescription("инфо");
            product.setSizeA(1.4);
            product.setSizeB(0.7);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(2.0);
            product.setImagePath("/img/tepih-black.jpeg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Acoustic - Alveolar Foam");
            product.setDescription("Материалът е самозалепващ и звукопоглъщащ.");
            product.setSizeA(0.5);
            product.setSizeB(1.0);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(2.0);
            product.setImagePath("/img/Acoustic.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Sandwich Ulrta");
            product.setDescription("Най-ефективният мембранен материал със затворени клетки с допълнителен ефект на потискане на вибрациите. С дебелина от само 6 мм, той  осигурява намаляне на шума с до 33 dB. Водоустойчив дизайн. Ефективността на материала се дължи на правилно подбраните дебелини и плътности на съставните му слоеве, а абсолютната влагозащита на материала гарантира високата му производителност през целия експлоатационен живот на автомобила.  Използваа се за зони под на автомобила  и багажно отделение");
            product.setSizeA(0.5);
            product.setSizeB(0.8);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(6.0);
            product.setImagePath("/img/Acoustic.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr ECO 8");
            product.setDescription("Изолаторът се използва най-добре заедно с вибро-изолационните материали като двуслоен слой за намаляване и абсорбиране на външни и въздушни шумове.");
            product.setSizeA(0.5);
            product.setSizeB(0.75);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(8.0);
            product.setImagePath("/img/eco.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr Black Flex 10");
            product.setDescription("Топлоизолационен материал на базата на разпенен каучук, който има свойствата на абсорбция и звукоизолация. Той е много пластичен, което позволява материалът да се използва за обработка на трудни повърхности при различни условия на работа. Продуктът е маслоустойчив и незапалим, не отделя токсини, което позволява да се използва върху всички повърхности на автомобила и в двигателното отделение.");
            product.setSizeA(0.5);
            product.setSizeB(0.75);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(10.0);
            product.setImagePath("/img/black-flex.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr Black Flex 6");
            product.setDescription("Топлоизолационен материал на базата на разпенен каучук, който има свойствата на абсорбция и звукоизолация. Той е много пластичен, което позволява материалът да се използва за обработка на трудни повърхности при различни условия на работа. Продуктът е маслоустойчив и незапалим, не отделя токсини, което позволява да се използва върху всички повърхности на автомобила и в двигателното отделение.");
            product.setSizeA(0.5);
            product.setSizeB(0.75);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(10.0);
            product.setImagePath("/img/black-flex.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr ECO 4");
            product.setDescription("Изолаторът се използва най-добре заедно с вибро-изолационните материали като двуслоен слой за намаляване и абсорбиране на външни и въздушни шумове.");
            product.setSizeA(0.5);
            product.setSizeB(0.75);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(4.0);
            product.setImagePath("/img/black-flex.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr Gray Wave 15");
            product.setDescription("Материалът е самозалепващ, звукопоглъщащ и уплътняващ на основата на специална полиуретанова пяна, релеф във формата на пирамиди.");
            product.setSizeA(0.5);
            product.setSizeB(0.5);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(15.0);
            product.setImagePath("/img/black-flex.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr Gray Wave 15");
            product.setDescription("Материалът е самозалепващ, звукопоглъщащ и уплътняващ на основата на специална полиуретанова пяна, релеф във формата на пирамиди.");
            product.setSizeA(0.5);
            product.setSizeB(0.5);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(15.0);
            product.setImagePath("/img/gray-wave.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr PPE ECO 8 Foil");
            product.setDescription("Това е термоизолационен материал за автомобилния капак, с алуминиево фолио и самозалепваща се подложка.");
            product.setSizeA(0.5);
            product.setSizeB(0.75);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(8.0);
            product.setImagePath("/img/ppe-eco.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr roll 1.5");
            product.setDescription("Използва се за оформяне на водоустойчив слой, изолиращ вибрациите в автомобили и други места, където също има нужда от звукоизолация, защита от вибрации и корозия. Виброгасящият материал има многослойна структура и се състои от слой от екологично чист състав от бутилкаучук и алуминиево фолио.");
            product.setSizeA(0.5);
            product.setSizeB(6.00);
            product.setLostHz(200.0);
            product.setLost(0.21);
            product.setThickness(1.5);
            product.setImagePath("/img/roll.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr roll 2.0");
            product.setDescription("Използва се за оформяне на водоустойчив слой, изолиращ вибрациите в автомобили и други места, където също има нужда от звукоизолация, защита от вибрации и корозия. Виброгасящият материал има многослойна структура и се състои от слой от екологично чист състав от бутилкаучук и алуминиево фолио.");
            product.setSizeA(0.5);
            product.setSizeB(4.00);
            product.setLostHz(200.0);
            product.setLost(0.32);
            product.setThickness(2.0);
            product.setImagePath("/img/roll.jpg");
            productsRepository.save(product);

            product.setUuid(UUID.randomUUID());
            product.setName("Vibrofiltr Roller");
            product.setDescription("Инструмент за полагане на дъмпинг материали, за по-доброто им прилепване.");
            product.setSizeA(0.0);
            product.setSizeB(0.00);
            product.setLostHz(0.0);
            product.setLost(0.0);
            product.setThickness(0.0);
            product.setImagePath("/img/roller.jpg");
            productsRepository.save(product);



        }
    }


}
