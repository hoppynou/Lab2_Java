package com.example.lab2;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends BaseActivity implements CatalogFragment.OnCartClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new CatalogFragment())
                    .commit();
        }
    }

    @Override
    public void onOpenCart() {
        // Переход во вторую активити
        startActivity(new Intent(this, CheckoutActivity.class));
    }
}