package com.example.easytravel.Actividades.Administrador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easytravel.Adaptadores.EmpresaAdapter;
import com.example.easytravel.Adaptadores.HotelesAdapter;
import com.example.easytravel.Modelos.Empresa;
import com.example.easytravel.Modelos.Hotel;
import com.example.easytravel.R;

import java.util.List;

public class ActivityAdmin extends AppCompatActivity {
    private HotelesAdapter hotelesAdapter;
    private Button empresasBoton;
    private RecyclerView empresaRecyclerView;
    private EmpresaAdapter empresaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        empresasBoton = findViewById(R.id.empresasBoton);
        empresaRecyclerView = findViewById(R.id.empresaRecyclerView);
        empresaRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        empresaAdapter = new EmpresaAdapter();

        // Crear adaptador de hoteles sin argumentos
        hotelesAdapter = new HotelesAdapter();


    }
}
