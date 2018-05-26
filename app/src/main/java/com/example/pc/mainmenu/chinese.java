package com.example.pc.mainmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.pc.mainmenu.R;

import java.util.ArrayList;

public class chinese extends AppCompatActivity {

    private ListView listView3;
    private ListAdapter listAdapter3;
    ArrayList<Product> products3 = new ArrayList<>();
    Button btnPlaceOrder3;
    ArrayList<Product> productOrders3 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);
        getProduct();
        listView3 = (ListView) findViewById(R.id.customListView3);
        listAdapter3 = new ListAdapter(this,products3);
        listView3.setAdapter(listAdapter3);
        btnPlaceOrder3 = (Button) findViewById(R.id.btnPlaceOrder3);
        btnPlaceOrder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder()
    {
        productOrders3.clear();
        for(int i=0;i<listAdapter3.listProducts.size();i++)
        {
            if(listAdapter3.listProducts.get(i).CartQuantity > 0)
            {
                Product products = new Product(
                        listAdapter3.listProducts.get(i).ProductName
                        ,listAdapter3.listProducts.get(i).ProductPrice
                        ,listAdapter3.listProducts.get(i).ProductImage
                );
                products.CartQuantity = listAdapter3.listProducts.get(i).CartQuantity;
                productOrders3.add(products);
            }
        }
    }

    public void getProduct() {
        products3.add(new Product("Chilli Chicken",10.0d,R.drawable.chicken));
        products3.add(new Product("Manchurian",11.0d,R.drawable.manchurian));
        products3.add(new Product("Chowmein",12.0d,R.drawable.chowmein));
        products3.add(new Product("Manchow Soup",13.0d,R.drawable.manchoe));
        products3.add(new Product("Szechwan",14.0d,R.drawable.szechwa));
        products3.add(new Product("American Chop Suey",11.0d,R.drawable.chopsuey));
        products3.add(new Product("Date Pancakes",15.0d,R.drawable.datepan));
        products3.add(new Product("Fried Rice",17.0d,R.drawable.friedrice));
        products3.add(new Product("Dim Sums",67.0d,R.drawable.dimsums));
        products3.add(new Product("Hot and Sour Soup",41.0d,R.drawable.hotsour));
        products3.add(new Product("Quick Noodles",16.0d,R.drawable.quicknoodle));
        products3.add(new Product("Stir Fried Tofu with Rice",18.0d,R.drawable.stirfried));
        products3.add(new Product("Shitake Fried Rice with Water Chestnuts",121.0d,R.drawable.shitake));
        products3.add(new Product("Chicken with Chestnuts",122.0d,R.drawable.chestnuts));
        products3.add(new Product("Wok Tossed Veggies in Honey and Black Bean Glaze",14.0d,R.drawable.wok));
        products3.add(new Product("Fried rice with Egg",51.0d,R.drawable.friedricegg));
        products3.add(new Product("Ma Po Tofu",12.0d,R.drawable.tofu));
    }
}
