package com.example.asuspc.bnspsoal1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    private Button btn;
    private EditText edNama;
    private EditText edEmail;
    private EditText edNomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.buttom_submit);

        edNama = (EditText) findViewById(R.id.nama);
        edEmail = (EditText) findViewById(R.id.email);
        edNomor = (EditText) findViewById(R.id.nomor);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent inte = new Intent(MainActivity.this, TampilActivity.class);
                Bundle b = new Bundle();
                b.putString("nama", edNama.getText().toString());
                b.putString("email", edEmail.getText().toString());
                b.putString("nomor", edNomor.getText().toString());

                inte.putExtras(b);

                startActivity(inte);
            }
        });
    }
}
