package com.example.vintageshop.activities;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vintageshop.MainActivity;
import com.example.vintageshop.R;
import com.google.firebase.auth.FirebaseAuth;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity {

    ProgressBar progressBar;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);

        auth =  FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar3);
        progressBar.setVisibility(View.GONE);
        if(auth.getCurrentUser() != null)
        {
            progressBar.setVisibility(View.VISIBLE);
            startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
            Toast.makeText(this,"Please wait you are already logged in!",Toast.LENGTH_SHORT).show();
           finish();
        }




        // Butonul pentru Login
        Button buttonLogin = findViewById(R.id.login_splash);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Deschide LoginActivity
                Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Închide PrezentareActivity pentru a nu permite revenirea
            }
        });

        // Butonul pentru Sign Up
        Button buttonSignUp = findViewById(R.id.reg_splash);
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Deschide RegistrationActivity
                Intent intent = new Intent(SplashScreenActivity.this, RegistrationActivity.class);
                startActivity(intent);
                finish(); // Închide PrezentareActivity pentru a nu permite revenirea
            }
        });
    }
}
