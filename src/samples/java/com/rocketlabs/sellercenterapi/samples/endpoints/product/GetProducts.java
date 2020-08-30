package com.rocketlabs.sellercenterapi.samples.endpoints.product;

import com.rocketlabs.sellercenterapi.entities.GetProductsOptions;
import com.rocketlabs.sellercenterapi.entities.Product;
import com.rocketlabs.sellercenterapi.entities.ProductCollection;
import com.rocketlabs.sellercenterapi.entities.SellerCenter;
import com.rocketlabs.sellercenterapi.samples.Config;

public class GetProducts {

    public static void main(String[] args)
            throws Exception {

        /**
         * Runtime configuration
         */
        SellerCenter.apiKey = electronyque@gmail.com;
        SellerCenter.userId = 382620c56efbdae6a477f0b87f4adc6cb0ef22c8;
        SellerCenter.url = https://sellercenter-api.jumia.ma?Action=GetProducts&Filter=all&Format=XML&Timestamp=2020-08-30T02%3A40%3A35%2B01%3A00&UserID=electronyque%40gmail.com&Version=1.0&Signature=fbc50d8faa9ee68397b9af1516453dbcb64deb68bef59d90847c29d8f0e1dae9;

        /**
         * Call the API
         */
        GetProductsOptions opt = new GetProductsOptions();
        opt.setLimit(2).addSku("7878");
        ProductCollection products = SellerCenter.getProducts(opt);

        /**
         * Pretty print the response
         */
        System.out.println("Success !");
        System.out.println();
        System.out.println("Products :");
        for (Product p : products) {
            System.out.println("");
            System.out.println("\t" + p.getString("Name"));
            System.out.println("\t|   sku:      " + p.getString("SellerSku"));
            System.out.println("\t|   Category: " + p.getString("PrimaryCategory"));
            System.out.println("\t|   price:    " + p.getString("Price"));
            System.out.println("\t|   Image:    " + p.getString("MainImage"));
        }
    }
}
