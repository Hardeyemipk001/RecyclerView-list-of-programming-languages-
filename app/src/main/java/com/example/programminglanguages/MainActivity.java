package com.example.programminglanguages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        String [] languages =  { "Java","Python","Php","Fortran","Sherifdeen","Javascript","Xamarin","Cobol","Visual Basic","C++","#C","Ruby","kotlin","Dart","Flutter","Swift","Objective-C","Scala","Clojure","Rust"};



        LanguageAdapter languageAdapter = new LanguageAdapter(languages);
        recyclerView.setAdapter(languageAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);



    }
}