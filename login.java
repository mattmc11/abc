package com.example.matthew.footballgrounds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class Login extends AppCompatActivity implements AsyncResponse, View.OnClickListener {

    EditText etEmail, etPassword;
    Button bLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        bLogin.setOnClickListener(this);
        Button bRegisterhere = (Button) findViewById(R.id.bRegisterHere);
        bRegisterhere.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void processFinish(String Result) {
        if(Result.contains("success")){
            Intent in= new Intent(this,MainMenu.class);
            startActivity(in);
        }
        else{
            Toast.makeText(this, "Login failed",Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onClick(View v) {
        HashMap postData = new HashMap();
        postData.put("bLogin", "Login");
        postData.put("mobile", "android");
        postData.put("txtEmail", etEmail.getText().toString());
        postData.put("txtPassword", etPassword.getText().toString() );
        PostResponseAsyncTask task = new PostResponseAsyncTask(this);
        task.execute("http:///client/login.php");
    }
}
