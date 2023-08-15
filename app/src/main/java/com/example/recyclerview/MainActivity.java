package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PersonAdapter personAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> personList = new ArrayList<>();
        personList.add("Dariela Castillo");
        personList.add("Jennifer Castillo");
        personList.add("Viviana Castillo");
        personList.add("Nelson Castillo");
        personList.add("Aurora Carranza");

        personAdapter = new PersonAdapter(personList);
        recyclerView.setAdapter(personAdapter);
    }
}
