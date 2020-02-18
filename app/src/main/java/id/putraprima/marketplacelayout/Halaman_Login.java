package id.putraprima.marketplacelayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Halaman_Login extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_login);
    }

    public void clickLogin(View view){
        Intent intent = new Intent(this, Halaman_Login.class);
        startActivity(intent);
    }

    public void clickRegister(View view){
        Intent intent = new Intent(this, Halaman_Register.class);
        startActivity(intent);
    }
}
