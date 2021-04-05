package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {
    private Button btn_tabung,btn_balok,btn_kerucut;
    private TextView tvBalok,tvTabung, tvKerucut;
    private EditText etBalok_p, etBalok_t, etBalok_l;
    private EditText etTabung_r, etTabung_t, etKerucut_r, etKerucut_t;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn_balok = findViewById(R.id.btnbalok);
        tvBalok = findViewById(R.id.tv_hasil);
        etBalok_l = findViewById(R.id.et_lebar);
        etBalok_p = findViewById(R.id.et_panjang);
        etBalok_t = findViewById(R.id.et_tinggi);

        btn_tabung = findViewById(R.id.btntabung);
        tvTabung = findViewById(R.id.tv_hasil_t);
        etTabung_r = findViewById(R.id.et_jari_t);
        etTabung_t = findViewById(R.id.et_tinggi_t);

        btn_kerucut = findViewById(R.id.btnkerucut);
        tvKerucut = findViewById(R.id.tv_hasil_k);
        etKerucut_r = findViewById(R.id.et_jari_k);
        etKerucut_t = findViewById(R.id.et_tinggi_k);
        
        btn_balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sP_Balok = etBalok_p.getText().toString();
                    String sL_Balok = etBalok_l.getText().toString();
                    String sT_Balok = etBalok_t.getText().toString();

                    double pb = Double.parseDouble(sP_Balok);
                    double sl = Double.parseDouble(sL_Balok);
                    double st = Double.parseDouble(sT_Balok);

                    double hasil = pb * sl * st;

                    String shasil = String.valueOf(hasil);
                    tvBalok.setText(shasil);
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong!!", Toast.LENGTH_SHORT).show();
                }
                
            }
        });

        btn_tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sR_Tabung = etTabung_r.getText().toString();
                    String sT_Tabung = etTabung_t.getText().toString();

                    double dR = Double.parseDouble(sR_Tabung);
                    double dT = Double.parseDouble(sT_Tabung);

                    double hasil_t = 3.15 * dR * dR * dT;

                    String shasil_t = String.valueOf(hasil_t);
                    tvTabung.setText(shasil_t);
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong!!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn_kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sR_Kerucut = etKerucut_r.getText().toString();
                    String sT_Kerucut = etKerucut_t.getText().toString();

                    double dR_k = Double.parseDouble(sR_Kerucut);
                    double dT_k = Double.parseDouble(sT_Kerucut);

                    double hasil_k = 3.15 * dR_k * dR_k * dT_k / 3;

                    String shasil_k = String.valueOf(hasil_k);
                    tvKerucut.setText(shasil_k);
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong!!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}