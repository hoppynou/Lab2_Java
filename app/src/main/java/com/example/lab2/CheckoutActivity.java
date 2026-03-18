package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CheckoutActivity extends BaseActivity { // Наследуемся от нашей базы

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Button btnPay = findViewById(R.id.btn_pay);
        btnPay.setOnClickListener(v -> {
            // Показываем сообщение через метод из BaseActivity
            showMessage("Заказ создан успешно!");

            // Возвращаемся в магазин и чистим историю переходов
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish();
        });
    }
}