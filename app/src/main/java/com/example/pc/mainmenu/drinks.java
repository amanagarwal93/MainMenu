package com.example.pc.mainmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.pc.mainmenu.R;

import java.util.ArrayList;

public class drinks extends AppCompatActivity {

    private ListView listView2;
    private ListAdapter listAdapter2;
    ArrayList<Product> products2 = new ArrayList<>();
    Button btnPlaceOrder2;
    ArrayList<Product> productOrders2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        getProduct();
        listView2 = (ListView) findViewById(R.id.customListView2);
        listAdapter2 = new ListAdapter(this,products2);
        listView2.setAdapter(listAdapter2);
        btnPlaceOrder2 = (Button) findViewById(R.id.btnPlaceOrder2);
        btnPlaceOrder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder()
    {
        productOrders2.clear();
        for(int i=0;i<listAdapter2.listProducts.size();i++)
        {
            if(listAdapter2.listProducts.get(i).CartQuantity > 0)
            {
                Product products = new Product(
                        listAdapter2.listProducts.get(i).ProductName
                        ,listAdapter2.listProducts.get(i).ProductPrice
                        ,listAdapter2.listProducts.get(i).ProductImage
                );
                products.CartQuantity = listAdapter2.listProducts.get(i).CartQuantity;
                productOrders2.add(products);
            }
        }
    }

    public void getProduct() {
        products2.add(new Product("Fruit Punch",150.00,R.drawable.fruitpunch));
        products2.add(new Product("Red Sea",150.00,R.drawable.redsea));
        products2.add(new Product("Virgin Colada",150.00,R.drawable.virgincolada));
        products2.add(new Product("Love Valley",150.00,R.drawable.lovevalley));
        products2.add(new Product("Pomi Twist",150.00,R.drawable.pomitwist));
        products2.add(new Product("Ginger Fizz",150.00,R.drawable.gingerfizz));
        products2.add(new Product("Italian Smooch",150.00,R.drawable.italian));
        products2.add(new Product("Devils Kiss",150.00,R.drawable.devils));
        products2.add(new Product("Blue Lagoon",150.00,R.drawable.bluelagoon));
        products2.add(new Product("Fresh Mint Mojito",150.00,R.drawable.mintmojito));
        products2.add(new Product("Kiwi Smoothie",150.00,R.drawable.kiwismoothie));
        products2.add(new Product("Virgin Guava",150.00,R.drawable.virginguava));
        products2.add(new Product("Litchie Smoothie",150.00,R.drawable.litchie));
        products2.add(new Product("Peach Apricot",150.00,R.drawable.peachapricot));
        products2.add(new Product("Blue Berry Smoothie",150.00,R.drawable.blueberry));
        products2.add(new Product("Green Hayland",150.00,R.drawable.greenhayland));
        products2.add(new Product("White Rosy",150.00,R.drawable.whiterosy));
        products2.add(new Product("Watermelon Mojito",150.00,R.drawable.watermelon));

    }
}
