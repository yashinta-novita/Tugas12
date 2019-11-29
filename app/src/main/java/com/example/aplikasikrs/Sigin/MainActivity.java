package com.example.aplikasikrs.Sigin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aplikasikrs.Admin.AdminHome;
import com.example.aplikasikrs.Admin.DosenHome;
import com.example.aplikasikrs.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSignIn = findViewById(R.id.btnSignIn);

        final EditText email = findViewById(R.id.editText3);
        this.getSupportActionBar().hide();

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(MainActivity.this, MenuDosenAdminActivity.class);
                startActivity(intent);*/
                SharedPreferences prefs = MainActivity.this.getSharedPreferences("prefs_file", MODE_PRIVATE);
                String statusLogin = prefs.getString("isLogin", null);
                SharedPreferences.Editor edit = prefs.edit();

                if (email.getText().toString().contains("@staff.ukdw.ac.id")) {
                    edit.putString("isLogin", "Admin");
                    edit.commit();
                    Intent intent = new Intent(MainActivity.this, AdminHome.class);
                    startActivity(intent);

                } else if (email.getText().toString().contains("@si.ukdw.ac.id")) {
                    edit.putString("isLogin", "Mhs");
                    edit.commit();
                    Intent intent = new Intent(MainActivity.this, DosenHome.class);
                    startActivity(intent);

                }
            }
        });
    }
}