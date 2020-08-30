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
        SellerCenter.apiKey = 382620c56efbdae6a477f0b87f4adc6cb0ef22c8;
        SellerCenter.userId = electronyque@gmail.com;
        SellerCenter.url = https://sellercenter-api.jumia.ma?Action=GetOrders&CreatedAfter=2014-02-25T23%3A46%3A11%2B00%3A00&Format=XML&Timestamp=2020-08-30T02%3A27%3A46%2B01%3A00&UserID=electronyque%40gmail.com&Version=1.0&Signature=cc6b4a244fbd1f76372935c43ad0a732eaa92ccf95d4e914e4b0c2ebfac5a68d;

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
