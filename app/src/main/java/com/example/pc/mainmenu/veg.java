package com.example.pc.mainmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.pc.mainmenu.R;

import java.util.ArrayList;

public class veg extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;
    ArrayList<Product> products = new ArrayList<>();
    Button btnPlaceOrder;
    ArrayList<Product> productOrders = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);
        getProduct();
        listView = (ListView) findViewById(R.id.customListView);
        listAdapter = new ListAdapter(this,products);
        listView.setAdapter(listAdapter);
        btnPlaceOrder = (Button) findViewById(R.id.btnPlaceOrder);
        btnPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder()
    {
        productOrders.clear();
        for(int i=0;i<listAdapter.listProducts.size();i++)
        {
            if(listAdapter.listProducts.get(i).CartQuantity > 0)
            {
                Product products = new Product(
                        listAdapter.listProducts.get(i).ProductName
                        ,listAdapter.listProducts.get(i).ProductPrice
                        ,listAdapter.listProducts.get(i).ProductImage
                );
                products.CartQuantity = listAdapter.listProducts.get(i).CartQuantity;
                productOrders.add(products);
            }
        }
    }

    public void getProduct() {
        products.add(new Product("Aaloo Gobhi",10.0d,R.drawable.gobhi));
        products.add(new Product("Dam Aaloo",11.0d,R.drawable.damaaloo));
        products.add(new Product("Kadhai Paneer",12.0d,R.drawable.kadhai));
        products.add(new Product("Shahi Paneer",13.0d,R.drawable.shahi));
        products.add(new Product("Veg Raita",14.0d,R.drawable.raita));
        products.add(new Product("Dahi",16.0d,R.drawable.dahi));
        products.add(new Product("Sada Chapati",11.0d,R.drawable.roti));
        products.add(new Product("Butter Chapati",15.0d,R.drawable.butterroti));
        products.add(new Product("Butter Naan",17.0d,R.drawable.naan));
        products.add(new Product("Mushroom",67.0d,R.drawable.mushroom));

    }
}