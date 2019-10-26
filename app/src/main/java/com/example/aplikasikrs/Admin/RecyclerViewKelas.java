package com.example.aplikasikrs.Admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.aplikasikrs.Admin.Adapter.KelasAdapter;
import com.example.aplikasikrs.Admin.Model.Kelas;
import com.example.aplikasikrs.R;

import java.util.ArrayList;

public class RecyclerViewKelas extends AppCompatActivity{
    private RecyclerView recyclerView;
        private KelasAdapter kelasAdapter;
        private ArrayList<Kelas> kelasList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_recycler_view_kelas);

            this.setTitle("SI KRS - Hai Dosen");

            tambahData();

            recyclerView = findViewById(R.id.rvKelas);
            kelasAdapter = new KelasAdapter(kelasList);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewKelas.this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(kelasAdapter);
        }

        public void tambahData() {
            kelasList = new ArrayList<>();
            kelasList.add(new Kelas("SI001", "Pemrograman Mobile", "3", "Jumat", "Argo Wibowo", "30"));
            kelasList.add(new Kelas("SI002", "Datawarehouse", "3", "Jumat", "Yetli Oslan", "40"));
            kelasList.add(new Kelas("SI003", "IMK", "3", "Jumat", "Umi Proboyekti", "50"));
        }
}
