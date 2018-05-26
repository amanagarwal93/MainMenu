package com.example.pc.mainmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.pc.mainmenu.R;

import java.util.ArrayList;

public class maincourse extends AppCompatActivity {

    private ListView listView6;
    private ListAdapter listAdapter6;
    ArrayList<Product> products6 = new ArrayList<>();
    Button btnPlaceOrder6;
    ArrayList<Product> productOrders6 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincourse);
        getProduct();
        listView6 = (ListView) findViewById(R.id.customListView6);
        listAdapter6 = new ListAdapter(this,products6);
        listView6.setAdapter(listAdapter6);
        btnPlaceOrder6 = (Button) findViewById(R.id.btnPlaceOrder6);
        btnPlaceOrder6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder()
    {
        productOrders6.clear();
        for(int i=0;i<listAdapter6.listProducts.size();i++)
        {
            if(listAdapter6.listProducts.get(i).CartQuantity > 0)
            {
                Product products = new Product(
                        listAdapter6.listProducts.get(i).ProductName
                        ,listAdapter6.listProducts.get(i).ProductPrice
                        ,listAdapter6.listProducts.get(i).ProductImage
                );
                products.CartQuantity = listAdapter6.listProducts.get(i).CartQuantity;
                productOrders6.add(products);
            }
        }
    }

    public void getProduct() {
        products6.add(new Product("Creamy Courette Lasagne",10.0d,R.drawable.lasagna));
        products6.add(new Product("Vegetable Biriyani",11.0d,R.drawable.vegbiryani));
        products6.add(new Product("Chana Masala",12.0d,R.drawable.chanamasal));
        products6.add(new Product("Cabbage Koorma",13.0d,R.drawable.cabbagekoorma));
        products6.add(new Product("Spicy Indian Dal",14.0d,R.drawable.daal));
        products6.add(new Product("Black Chana with Potato",16.0d,R.drawable.blackchana));
        products6.add(new Product("Rajma Chawal",11.0d,R.drawable.rajma));
        products6.add(new Product("Chhole Bhatoore",15.0d,R.drawable.chhole));
        products6.add(new Product("Kadhi",17.0d,R.drawable.kadhai));
        products6.add(new Product("Kashmiri Saag",67.0d,R.drawable.saag));
    }
}
