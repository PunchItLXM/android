package com.example.camarcherapas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.net.Uri;
import android.content.Intent;

public class Credits extends AppCompatActivity {
    Button github;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        github = findViewById(R.id.github);

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri githubPage=Uri.parse("https://www.github.com/puchitlxm");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, githubPage);
                startActivity(launchBrowser);
            }
        });
    }
}
