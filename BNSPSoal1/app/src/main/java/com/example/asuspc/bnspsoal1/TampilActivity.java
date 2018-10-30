package com.example.asuspc.bnspsoal1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TampilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        Bundle b = getIntent().getExtras();

        TextView nama = (TextView) findViewById(R.id.namaview);
        TextView email = (TextView) findViewById(R.id.emailview);
        TextView nomor = (TextView) findViewById(R.id.nomorview);

        nama.setText(b.getString("nama"));
        email.setText(b.getString("email"));
        nomor.setText(b.getString("nomor"));
    }

}
