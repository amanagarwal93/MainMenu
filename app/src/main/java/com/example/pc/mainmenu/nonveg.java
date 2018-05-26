package com.example.pc.mainmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.pc.mainmenu.R;

import java.util.ArrayList;

public class nonveg extends AppCompatActivity {

    private ListView listView1;
    private ListAdapter listAdapter1;
    ArrayList<Product> products1 = new ArrayList<>();
    Button btnPlaceOrder1;
    ArrayList<Product> productOrders1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonveg);
        getProduct();
        listView1 = (ListView) findViewById(R.id.customListView1);
        listAdapter1 = new ListAdapter(this,products1);
        listView1.setAdapter(listAdapter1);
        btnPlaceOrder1 = (Button) findViewById(R.id.btnPlaceOrder1);
        btnPlaceOrder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder()
    {
        productOrders1.clear();
        for(int i=0;i<listAdapter1.listProducts.size();i++)
        {
            if(listAdapter1.listProducts.get(i).CartQuantity > 0)
            {
                Product products = new Product(
                        listAdapter1.listProducts.get(i).ProductName
                        ,listAdapter1.listProducts.get(i).ProductPrice
                        ,listAdapter1.listProducts.get(i).ProductImage
                );
                products.CartQuantity = listAdapter1.listProducts.get(i).CartQuantity;
                productOrders1.add(products);
            }
        }
    }

    public void getProduct() {
        products1.add(new Product("Grilled Chicken",10.0d,R.drawable.grilled));
        products1.add(new Product("Mutton Korma",11.0d,R.drawable.mutton));
        products1.add(new Product("Tandoori Lamb Chops",12.0d,R.drawable.tandoorilamb));
        products1.add(new Product("Malabar Fish Biryani",13.0d,R.drawable.fishbiryani));
        products1.add(new Product("Keema Samosa",14.0d,R.drawable.keemasamosa));
        products1.add(new Product("Goan Prawn Curry",16.0d,R.drawable.prawn));
        products1.add(new Product("Chicken Lolipop",11.0d,R.drawable.chickenlolipop));
        products1.add(new Product("Chicken Kaalimirch",15.0d,R.drawable.kaalimirch));
        products1.add(new Product("Mutton Haandi",17.0d,R.drawable.muttonhaandi));
        products1.add(new Product("Kabab Paratha",67.0d,R.drawable.kababparatha));
    }
}
