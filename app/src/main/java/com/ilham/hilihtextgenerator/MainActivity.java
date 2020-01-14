package com.ilham.hilihtextgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etIn, etOut;
    Button btnOk;
    private String vokal = "[aueo]";
    private String vokali = "[ai]+[ia]";
    private String vokalu = "[au]+[ua]";
    private String vokale = "[ae]+[ea]";
    private String vokalo = "[ao]+[oa]";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etIn = findViewById(R.id.etInput);
        etOut = findViewById(R.id.etOutput);
        btnOk = findViewById(R.id.btnGenerate);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filterNum = etIn.getText().toString().trim();
                filterNum = filterNum.replaceAll(vokalo, "iwi");
                filterNum = filterNum.replaceAll(vokalu, "iwi");
                filterNum = filterNum.replaceAll(vokali, "iyi");
                filterNum = filterNum.replaceAll(vokale, "iyi");
                filterNum = filterNum.replaceAll(vokal, "i");
                etOut.setText(filterNum);
            }
        });
    }
}
