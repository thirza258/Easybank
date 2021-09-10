package com.example.easybank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private RecyclerView recyclerView;
    private Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ui();
        user();

        relativeLayout.setVisibility(View.VISIBLE);

    }

    public void user() {
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void ui() {

        relativeLayout = findViewById(R.id.relativeLayout);
        recyclerView = findViewById(R.id.recycleView);
        request = findViewById(R.id.request);

        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article(R.drawable.image_currency, "By Claire Robinson", R.string.receive, R.string.smaller));

        articleAdapter adapter = new articleAdapter(this);
        adapter.setArticle(articles);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}