package com.example.listtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleV);

        List<Name> name = new ArrayList<>();
        name.add(new Name("Alex"));
        name.add(new Name("Alexs"));
        name.add(new Name("Valera"));
        name.add(new Name("Bova"));
        name.add(new Name("Alex"));
        name.add(new Name("Alexs"));
        name.add(new Name("Valera"));
        name.add(new Name("Bova"));
        name.add(new Name("Alex"));
        name.add(new Name("Alexs"));
        name.add(new Name("Valera"));
        name.add(new Name("Bova"));
        name.add(new Name("Alex"));
        name.add(new Name("Alexs"));
        name.add(new Name("Valera"));
        name.add(new Name("Bova"));
        name.add(new Name("Alex"));
        name.add(new Name("Alexs"));
        name.add(new Name("Valera"));
        name.add(new Name("Bova"));

        NameAdapter nameAdapter = new NameAdapter(name);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(nameAdapter);

    }
}