package com.example.pc.mainmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.pc.mainmenu.R;

import java.util.ArrayList;

public class starters extends AppCompatActivity {

    private ListView listView4;
    private ListAdapter listAdapter4;
    ArrayList<Product> products4 = new ArrayList<>();
    Button btnPlaceOrder4;
    ArrayList<Product> productOrders4 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
        getProduct();
        listView4 = (ListView) findViewById(R.id.customListView4);
        listAdapter4 = new ListAdapter(this,products4);
        listView4.setAdapter(listAdapter4);
        btnPlaceOrder4 = (Button) findViewById(R.id.btnPlaceOrder4);
        btnPlaceOrder4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder()
    {
        productOrders4.clear();
        for(int i=0;i<listAdapter4.listProducts.size();i++)
        {
            if(listAdapter4.listProducts.get(i).CartQuantity > 0)
            {
                Product products = new Product(
                        listAdapter4.listProducts.get(i).ProductName
                        ,listAdapter4.listProducts.get(i).ProductPrice
                        ,listAdapter4.listProducts.get(i).ProductImage
                );
                products.CartQuantity = listAdapter4.listProducts.get(i).CartQuantity;
                productOrders4.add(products);
            }
        }
    }

    public void getProduct() {
        products4.add(new Product("Spring Roll",10.0d,R.drawable.springroll));
        products4.add(new Product("Chilli Paneer",11.0d,R.drawable.chillipaneer));
        products4.add(new Product("Veg. Manchurian",12.0d,R.drawable.vegmanchurian));
        products4.add(new Product("Potatoes in Honey & Chilly",13.0d,R.drawable.chillipotato));
        products4.add(new Product("Baby Corn",14.0d,R.drawable.babycorn));
        products4.add(new Product("Chilly Mushroom Dry",16.0d,R.drawable.mushroom));
        products4.add(new Product("Tandoori Paneer Tikka",11.0d,R.drawable.tandoori));
        products4.add(new Product("Malai Paneer Tikka",15.0d,R.drawable.malaipaneer));
        products4.add(new Product("Soya Tandoori Tikka",17.0d,R.drawable.soyatandoori));
        products4.add(new Product("Tandoori Aloo",67.0d,R.drawable.tandoorialoo));
        products4.add(new Product("Punjabi Soya Chap",41.0d,R.drawable.soyachap));
        products4.add(new Product("Hare Bhare Kabab",16.0d,R.drawable.harebhare));
        products4.add(new Product("Dahi ke Kabab",18.0d,R.drawable.dahikabab));
        products4.add(new Product("Platter",121.0d,R.drawable.platter));
        products4.add(new Product("Lilva Kachori",122.0d,R.drawable.lilva));
        products4.add(new Product("Veg Kofta",14.0d,R.drawable.vegkofta));
        products4.add(new Product("Momos",51.0d,R.drawable.momos));
        products4.add(new Product("Idli Fry",12.0d,R.drawable.idlifry));
        products4.add(new Product("Veg Cutlet",16.0d,R.drawable.vegcutlet));
        products4.add(new Product("Baked Samosa",12.0d,R.drawable.samosa));
        products4.add(new Product("Oats Dhokla",17.0d,R.drawable.oatsdhokla));
        products4.add(new Product("Batata Vada",12.0d,R.drawable.batatavada));
        products4.add(new Product("Pani Puri",18.0d,R.drawable.panipuri));
        products4.add(new Product("Sweet Corn",19.0d,R.drawable.sweetcorn));
        products4.add(new Product("Roasted Tomato Soup",21.0d,R.drawable.roasted));

    }
}
