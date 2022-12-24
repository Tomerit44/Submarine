package com.example.submarines;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{
    EditText email,pass;
    FirebaseDatabase database;
    FirebaseAuth mAuth;
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        database = FirebaseDatabase.getInstance();
        mAuth = FirebaseAuth.getInstance();
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        reg = (Button) findViewById(R.id.reg);
        reg.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu3, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.i2)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    public void onClick(View v)
    {
        if(v==reg)
        {
            if(TextUtils.isEmpty(email.getText().toString()) || TextUtils.isEmpty(pass.getText().toString()))
            {
                Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
            }
            else
            {
                reg.setEnabled(false);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reg.setEnabled(true);
                    }
                }, 2000);
                String emaill = email.getText().toString().trim();
                String passs = pass.getText().toString().trim();
                Intent nt= new Intent(this,MainActivity2.class);
                mAuth.createUserWithEmailAndPassword(emaill,passs)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful())
                                {
                                    startActivity(nt);
                                    Toast.makeText(MainActivity3.this, "REGISTERED", Toast.LENGTH_SHORT).show();
                                }
                                else
                                {
                                    Toast.makeText(MainActivity3.this, "REGISTER FAILED", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        }
    }
}