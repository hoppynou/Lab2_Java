package com.example.lab2;

import androidx.fragment.app.Fragment;

public class CatalogFragment extends androidx.fragment.app.Fragment {
    // Интерфейс для связи (Задание 1)
    public interface OnCartClickListener { void onOpenCart(); }
    private OnCartClickListener listener;

    @Override
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        if (context instanceof OnCartClickListener) listener = (OnCartClickListener) context;
    }

    @Override
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        android.view.View v = inflater.inflate(R.layout.fragment_catalog, container, false);

        // Логика кнопок (просто уведомления о добавлении)
        v.findViewById(R.id.btn_cucumber).setOnClickListener(view -> android.widget.Toast.makeText(getContext(), "Огурец в корзине", android.widget.Toast.LENGTH_SHORT).show());
        v.findViewById(R.id.btn_tomato).setOnClickListener(view -> android.widget.Toast.makeText(getContext(), "Помидор в корзине", android.widget.Toast.LENGTH_SHORT).show());
        v.findViewById(R.id.btn_ketchup).setOnClickListener(view -> android.widget.Toast.makeText(getContext(), "Кетчуп в корзине", android.widget.Toast.LENGTH_SHORT).show());
        v.findViewById(R.id.btn_meat).setOnClickListener(view -> android.widget.Toast.makeText(getContext(), "Мясо в корзине", android.widget.Toast.LENGTH_SHORT).show());

        v.findViewById(R.id.btn_cart).setOnClickListener(view -> {
            if (listener != null) listener.onOpenCart();
        });
        return v;
    }
}