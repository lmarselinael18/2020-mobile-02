package id.putraprima.marketplacelayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }

    public void clickServiceProvider(View view){
        Intent intent = new Intent(this, Halaman_Login.class);
        startActivity(intent);
    }

}
