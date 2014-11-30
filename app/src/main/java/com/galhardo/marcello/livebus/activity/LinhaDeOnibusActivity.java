package com.galhardo.marcello.livebus.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.galhardo.marcello.livebus.R;
import com.galhardo.marcello.livebus.activity.list_view_adapter.LinhaDeOnibusListViewAdapter;
import com.galhardo.marcello.livebus.database.DatabaseHelper;
import com.galhardo.marcello.livebus.data_acess_object.LinhaDeOnibusDAO;
import com.galhardo.marcello.livebus.model.LinhaDeOnibus;

public class LinhaDeOnibusActivity extends ActionBarActivity {
    private ListView listViewLinhaDeOnibus;
    private Context context;
    private DatabaseHelper databaseHelper;
    private LinhaDeOnibusDAO linhaDeOnibusDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linha_de_onibus);
        this.context = getApplicationContext();
        configurarActionBar();
        this.databaseHelper = new DatabaseHelper(this);
        this.linhaDeOnibusDAO = new LinhaDeOnibusDAO(databaseHelper.getWritableDatabase());
        configurarReferenciaDaUi();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_linha_de_onibus, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onDestroy() {
        databaseHelper.close();
        super.onDestroy();
    }

    public void configurarActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.app_name);
        actionBar.setIcon(R.drawable.ic_launcher);
    }

    public void configurarReferenciaDaUi() {
        this.configurarListView();

    }

    public void configurarListView() {
        this.listViewLinhaDeOnibus = (ListView) findViewById(R.id.list_view_linha_de_onibus);
        this.listViewLinhaDeOnibus.setAdapter(
                new LinhaDeOnibusListViewAdapter(this.context, linhaDeOnibusDAO.obterTodos()));

        this.listViewLinhaDeOnibus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListAdapter adapter = LinhaDeOnibusActivity.this.listViewLinhaDeOnibus.getAdapter();
                LinhaDeOnibus linhaDeOnibus = (LinhaDeOnibus) adapter.getItem(position);

                Intent intent = new Intent(LinhaDeOnibusActivity.this, HorarioDaLinhaDeOnibusActivity.class);
                intent.putExtra(HorarioDaLinhaDeOnibusActivity.PARAMETRO_NOME_DA_LINHA, linhaDeOnibus.getNomeDaLinha());
                intent.putExtra(HorarioDaLinhaDeOnibusActivity.PARAMETRO_NOME_DA_VIACAO, linhaDeOnibus.getNomeDaCompanhia());
                intent.putExtra(HorarioDaLinhaDeOnibusActivity.PARAMETRO_LINHA_DE_ONIBUS_ID, linhaDeOnibus.get_id());
                startActivity(intent);
            }
        });
    }

}
