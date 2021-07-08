package rafael.flores.app_003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Evento:onCreate",Toast.LENGTH_LONG);
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"Evento:onStop",Toast.LENGTH_LONG);
    }

}