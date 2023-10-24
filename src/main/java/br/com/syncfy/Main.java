package br.com.syncfy;

import br.com.syncfy.domain.entity.*;
import jakarta.persistence.*;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        Category category = new Category();
        City city = new City();
        CompanyUser companyUser = new CompanyUser();
        CompanyUserAddress companyUserAddress = new CompanyUserAddress();
        Country country = new Country();
        Ddd ddd = new Ddd();
        IBGECode ibgeCode = new IBGECode();
        Material material = new Material();
        MaterialOrder materialOrder = new MaterialOrder();
        Neighborhood neighborhood = new Neighborhood();
        Order order = new Order();
        Phone phone = new Phone();
        Segment segment = new Segment();
        ShippingCost shippingCost = new ShippingCost();
        Uf uf = new Uf();
        Vendor vendor = new Vendor();
        VendorAddress vendorAddress = new VendorAddress();
        ZipCode zipCode = new ZipCode();

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
//        manager.persist(address);
//        manager.persist( category );
//        manager.persist( city);
        manager.persist(companyUser);
//        manager.persist(companyUserAddress);
//        manager.persist( country);
//        manager.persist(ddd);
//        manager.persist(ibgeCode);
//        manager.persist(material);
//        manager.persist(materialOrder);
//        manager.persist(neighborhood);
//        manager.persist(order);
//        manager.persist(phone);
//        manager.persist(segment);
//        manager.persist(shippingCost);
//        manager.persist(uf);
//        manager.persist(vendor);
//        manager.persist(vendorAddress);
//        manager.persist(zipCode);

        manager.getTransaction().commit();
        manager.close();
        factory.close();
    }
}