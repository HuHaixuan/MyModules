package sg.edu.rp.c346.id21007436.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346;
    TextView tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewC346);
        tvC349 = findViewById(R.id.textViewC349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C346DetailActivity.class);
                intent.putExtra("moduleCode", "C346");
                intent.putExtra("moduleName", "Android Programming");
                intent.putExtra("year", "2023");
                intent.putExtra("semester", 1);
                intent.putExtra("moduleCredit", 4);
                intent.putExtra("venue", "E63A");
                startActivity(intent);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C346DetailActivity.class);
                intent.putExtra("moduleCode", "C349");
                intent.putExtra("moduleName", "iPad Programming");
                intent.putExtra("year", "2023");
                intent.putExtra("semester", 1);
                intent.putExtra("moduleCredit", 4);
                intent.putExtra("venue", "W65E");
                startActivity(intent);
            }
        });
    }
}