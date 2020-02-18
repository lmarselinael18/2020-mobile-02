package id.putraprima.marketplacelayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Halaman_Register extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_register);
    }

    public void clickNext(View view){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
