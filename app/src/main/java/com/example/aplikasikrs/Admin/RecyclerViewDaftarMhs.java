package com.example.aplikasikrs.Admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.aplikasikrs.Admin.Adapter.MhsAdapter;
import com.example.aplikasikrs.Admin.Adapter.MhsAdapter;
import com.example.aplikasikrs.Admin.Model.Mahasiswa;
import com.example.aplikasikrs.R;

import java.util.ArrayList;

public class RecyclerViewDaftarMhs extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menucreate,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1){
            Intent intent = new Intent(RecyclerViewDaftarMhs.this, CreateMhsActivity.class);
            startActivity(intent);
        }
        return  true;
    }

    private RecyclerView recyclerView;
    private MhsAdapter mhsAdapter;
    private ArrayList<Mahasiswa> mhsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_daftar_mhs);
        this.setTitle("SI KRS - Hai Admin");
        tambahData();

        recyclerView = findViewById(R.id.rvMhs);
        mhsAdapter = new MhsAdapter(mhsList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewDaftarMhs.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mhsAdapter);
    }

    private void tambahData(){
        mhsList = new ArrayList<>();
        mhsList.add(new Mahasiswa("72170170","Yuli","yulia.cristi@si.ukdw.ac.id","Jl.Bantul",R.drawable.people));
        mhsList.add(new Mahasiswa("72170154","Tita","tita.marita@si.ukdw.ac.id","Jl.Bantul",R.drawable.people));
        mhsList.add(new Mahasiswa("72170110","Shinta","ya.shinta@si.ukdw.ac.id","Jl.Bantul",R.drawable.people));
    }
}

