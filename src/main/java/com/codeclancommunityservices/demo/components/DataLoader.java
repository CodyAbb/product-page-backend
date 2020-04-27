package com.codeclancommunityservices.demo.components;

import com.codeclancommunityservices.demo.models.Product;
import com.codeclancommunityservices.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    ProductRepository productRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Product beef = new Product("Beef", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit ultrices tristique. Cras placerat posuere vehicula. Aliquam eget dignissim quam, sed tempus massa. Cras placerat posuere vehicula. Aliquam eget dignissim quam, sed tempus massa.", 899);
        productRepository.save(beef);

        Product ham = new Product("Ham", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit ultrices tristique. Cras placerat posuere vehicula. Aliquam eget dignissim quam, sed tempus massa. Cras placerat posuere vehicula. Aliquam eget dignissim quam, sed tempus massa.", 1099);
        productRepository.save(ham);

        Product chicken = new Product("Chicken", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit ultrices tristique. Cras placerat posuere vehicula. Aliquam eget dignissim quam, sed tempus massa. Cras placerat posuere vehicula. Aliquam eget dignissim quam, sed tempus massa.", 599);
        productRepository.save(chicken);

        Product lamb = new Product("Lamb", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit ultrices tristique. Cras placerat posuere vehicula. Aliquam eget dignissim quam, sed tempus massa. Cras placerat posuere vehicula. Aliquam eget dignissim quam, sed tempus massa.", 1299);
        productRepository.save(lamb);
    }
}
