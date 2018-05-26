package com.example.pc.mainmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.pc.mainmenu.R;

import java.util.ArrayList;

public class southindian extends AppCompatActivity {

    private ListView listView5;
    private ListAdapter listAdapter5;
    ArrayList<Product> products5 = new ArrayList<>();
    Button btnPlaceOrder5;
    ArrayList<Product> productOrders5 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_southindian);
        getProduct();
        listView5 = (ListView) findViewById(R.id.customListView5);
        listAdapter5 = new ListAdapter(this, products5);
        listView5.setAdapter(listAdapter5);
        btnPlaceOrder5 = (Button) findViewById(R.id.btnPlaceOrder5);
        btnPlaceOrder5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder() {
        productOrders5.clear();
        for (int i = 0; i < listAdapter5.listProducts.size(); i++) {
            if (listAdapter5.listProducts.get(i).CartQuantity > 0) {
                Product products = new Product(
                        listAdapter5.listProducts.get(i).ProductName
                        , listAdapter5.listProducts.get(i).ProductPrice
                        , listAdapter5.listProducts.get(i).ProductImage
                );
                products.CartQuantity = listAdapter5.listProducts.get(i).CartQuantity;
                productOrders5.add(products);
            }
        }
    }

    public void getProduct() {
        products5.add(new Product("Idli", 10.0d, R.drawable.idli));
        products5.add(new Product("Dosa", 11.0d, R.drawable.dosa));
        products5.add(new Product("Vada Sambhar", 12.0d, R.drawable.vadasambhar));
        products5.add(new Product("Appam and Stew", 13.0d, R.drawable.appam));
        products5.add(new Product("Uttappam", 14.0d, R.drawable.uttapam));
        products5.add(new Product("South Indian Biryani", 16.0d, R.drawable.biryani));
        products5.add(new Product("South Indian Thali", 11.0d, R.drawable.thali));
        products5.add(new Product("Kerala Sadya", 15.0d, R.drawable.sadya));
        products5.add(new Product("Upma and Rava Kichdi", 17.0d, R.drawable.ravakhichdi));
        products5.add(new Product("Rasam", 67.0d, R.drawable.rasam));
        products5.add(new Product("Medhu Vadai", 41.0d, R.drawable.medhu));
        products5.add(new Product("Cabbage Kootu", 16.0d, R.drawable.cabbage));
        products5.add(new Product("Thakkali Thokku", 18.0d, R.drawable.thakkali));
        products5.add(new Product("Arbi Curry", 121.0d, R.drawable.arbi));
        products5.add(new Product("Oats Dosa", 122.0d, R.drawable.oatsdosa));
        products5.add(new Product("Vegetable Korma", 14.0d, R.drawable.vegkorma));
        products5.add(new Product("Pesarattu", 51.0d, R.drawable.pesarattu));

    }
}