package sg.edu.rp.c346.id21007436.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class C346DetailActivity extends AppCompatActivity {
    TextView tvDetails;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346_detail);

        tvDetails = findViewById(R.id.textView);
        btnBack = findViewById(R.id.button);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra( "moduleCode");
        String moduleName = intentReceived.getStringExtra( "moduleName");
        String year = intentReceived.getStringExtra( "year");
        int semester = intentReceived.getIntExtra("value", 1);
        int credit = intentReceived.getIntExtra("value", 4);
        String venue = intentReceived.getStringExtra( "venue");
        tvDetails.setText("Module Code: " + moduleCode + "\nModule Name: " + moduleName +
                "\nAcademic Year: " + year + "\nSemester: " + semester + "\nModule Credit: " + credit
        + "\nVenue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(C346DetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}