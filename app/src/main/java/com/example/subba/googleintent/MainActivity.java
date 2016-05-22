package com.example.subba.googleintent;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button   mButton;
    EditText mEdit;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.button);
        mEdit   = (EditText)findViewById(R.id.editText);

        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view) {

                        String q = mEdit.getText().toString();
                        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
                        intent.putExtra(SearchManager.QUERY, q);
                        startActivity(intent);



                    }
                });
    }
}
