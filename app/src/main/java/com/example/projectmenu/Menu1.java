package com.example.projectmenu;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class Menu1 extends AppCompatActivity {
    // Deklarasi  objek ke variabel
    EditText angka1, angka2;
    Button tambah, kurang, kali, bagi, bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        angka1 = (EditText) findViewById(R.id.angka_pertama);
        angka2 = (EditText) findViewById(R.id.angka_kedua);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        bersihkan = (Button) findViewById(R.id.bersihkan);
        hasil = (TextView) findViewById(R.id.hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length() > 0) && (angka2.getText().length() > 0)) {
                    double ang1 = Double.parseDouble(angka1.getText().toString());
                    double ang2 = Double.parseDouble(angka2.getText().toString());
                    double result = ang1 + ang2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(Menu1.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length() > 0) && (angka2.getText().length() > 0)) {
                    double ang1 = Double.parseDouble(angka1.getText().toString());
                    double ang2 = Double.parseDouble(angka2.getText().toString());
                    double result = ang1 - ang2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(Menu1.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length() > 0) && (angka2.getText().length() > 0)) {
                    double ang1 = Double.parseDouble(angka1.getText().toString());
                    double ang2 = Double.parseDouble(angka2.getText().toString());
                    double result = ang1 * ang2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(Menu1.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length() > 0) && (angka2.getText().length() > 0)) {
                    double ang1 = Double.parseDouble(angka1.getText().toString());
                    double ang2 = Double.parseDouble(angka2.getText().toString());
                    double result = ang1 / ang2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(Menu1.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                }
            }
        });

        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1.setText("");
                angka2.setText("");
                hasil.setText("0");
                angka1.requestFocus();
            }
        });
    }
}