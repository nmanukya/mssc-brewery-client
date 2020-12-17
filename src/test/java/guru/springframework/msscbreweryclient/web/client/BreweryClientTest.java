package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BreweryClientTest {
    @Autowired
    BreweryClient client;
    @Test
    void getBeerById() {
        BeerDto dto= client.getBeerById(UUID.randomUUID());
        System.out.println(dto);
        assertNotNull(dto);
    }

    @Test
    void saveNewBeer() {
        BeerDto beerDto=BeerDto.builder().beerName("Lefe").build();
        URI uri=client.saveNewBeer(beerDto);
        assertNotNull(uri);
        System.out.println(uri.toString());
    }

    @Test
    void updateBeer() {
        BeerDto beerDto=BeerDto.builder().beerName("Hainiken").build();
        client.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void deleteBeer() {
        client.deleteBeer(UUID.randomUUID());
    }

    @Test
    void getCustomerById() {
       // CustomerDto customerdto=CustomerDto.builder().id(45).build();
        CustomerDto dto= client.getCustomerById(ThreadLocalRandom.current().nextInt());
        System.out.println(dto);
        assertNotNull(dto);
    }

    @Test
    void saveNewCustomer() {
        CustomerDto dto=CustomerDto.builder().id(45).customerName("Vazgen").build();
        URI uri=client.saveNewCustomer(dto);
        assertNotNull(uri);
        System.out.println(uri.toString());
    }

    @Test
    void updateCustomer() {
        CustomerDto dto=CustomerDto.builder().customerName("Poghos").build();
        client.updateCustomer(ThreadLocalRandom.current().nextInt(), dto);
    }

    @Test
    void deleteCustomer() {
        client.deleteCustomer(ThreadLocalRandom.current().nextInt());
    }
}