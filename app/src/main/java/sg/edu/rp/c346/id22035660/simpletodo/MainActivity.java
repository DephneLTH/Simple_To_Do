package sg.edu.rp.c346.id22035660.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etInput;
    Button btnAdd;
    Button btnClear;
    ListView tvList;
    ArrayList<String> alText;
    ArrayAdapter<String> aaText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.editTextInput);
        btnAdd = findViewById(R.id.btnAdd);
        btnClear = findViewById(R.id.btnClear);
        tvList = findViewById(R.id.tvList);

        alText = new ArrayList<>();
        aaText = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alText);
        tvList.setAdapter(aaText);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = etInput.getText().toString();
                alText.add(a);
                aaText.notifyDataSetChanged();
                etInput.getText().clear();    }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alText.clear();
                aaText.notifyDataSetChanged();    }
        });
    }
}
