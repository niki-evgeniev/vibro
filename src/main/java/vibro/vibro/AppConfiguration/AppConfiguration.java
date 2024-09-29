package vibro.vibro.AppConfiguration;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vibro.vibro.Models.Entity.Product;
import vibro.vibro.Models.ProductsAllDTO;

@Configuration
public class AppConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        Converter<String, String> nullToNoneString = new Converter<String, String>() {
            @Override
            public String convert(MappingContext<String, String> mappingContext) {
                String source = mappingContext.getSource();
                return (source == null || source.isEmpty()) ? "none" : source;
            }
        };
        modelMapper
                .createTypeMap(Product.class, ProductsAllDTO.class)
                .addMappings(mapper -> mapper.map(Product::getUuid, ProductsAllDTO::setId));


        return modelMapper;
    }
}
