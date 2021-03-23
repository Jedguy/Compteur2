package com.example.compteur;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


public class SecondFragment extends Fragment {

    public int compteur = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        TextView textView = (TextView) findViewById(R.id.textView);
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    private Object findViewById(int textView) {
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });

        view.findViewById(R.id.buttonLess).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valeur = textView.getText().toString();
                compteur = Integer.parseInt(valeur) - 1;
                textView.setText("" + compteur);
            }
        });

        view.findViewById(R.id.buttonPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valeur = textView.getText().toString();
                compteur = Integer.parseInt(valeur) + 1;
                textView.setText("" + compteur);
            }
        });

        view.findViewById(R.id.buttonRAZ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valeur = textView.getText().toString();
                compteur = 0;
                textView.setText("" + compteur);
            }
        });
}

}
