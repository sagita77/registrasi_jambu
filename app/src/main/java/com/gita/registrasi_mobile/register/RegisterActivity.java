package com.gita.registrasi_mobile.register;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.gita.registrasi_mobile.R;

import java.util.Arrays;
import java.util.List;

public class RegisterActivity extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Spinner spinner = findViewById(R.id.spinner);
        List<String> items = Arrays.asList("Laki - Laki", "Perempuan");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button btnsubmit = findViewById(R.id.button);
        EditText editfullname = findViewById(R.id.edt_fullname);
        EditText editusername = findViewById(R.id.edt_username);
        EditText editemail = findViewById(R.id.edt_email);
        EditText edit_no_hp = findViewById(R.id.edt_nohp);
        EditText edit_alamat = findViewById(R.id.edt_alamat);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterActivity.this,
                        " nama saya "+ editfullname.getText().toString()
                        + " username saya "+ editusername.getText().toString()
                        + " jenis kelamin saya "+ spinner.getSelectedItem().toString()
                        + " email saya " + editemail.getText().toString()
                        +" no hp saya "+ edit_no_hp.getText().toString()
                                +" alamat saya "+ edit_alamat.getText().toString(),

                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}