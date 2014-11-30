package com.galhardo.marcello.livebus.activity;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TabHost;

import com.galhardo.marcello.livebus.R;
import com.galhardo.marcello.livebus.activity.list_view_adapter.HorarioDaLinhaDeOnibusListViewAdapter;
import com.galhardo.marcello.livebus.database.DatabaseHelper;
import com.galhardo.marcello.livebus.database.HorarioDaLinhaDeOnibusDAO;
import com.galhardo.marcello.livebus.model.HorarioDaLinhaDeOnibus;

import java.util.ArrayList;

public class HorarioDaLinhaDeOnibusActivity extends ActionBarActivity  {
    public static final String PARAMETRO_LINHA_DE_ONIBUS_ID = "linha_de_onibus_id";
    public static final String PARAMETRO_NOME_DA_LINHA = "nome_da_linha";
    public static final String ABA_IDA_NOME = "Ida";
    public static final String ABA_VOLTA_NOME = "Volta";
    public static final int ABA_IDA_CODIGO = 1;
    public static final int ABA_VOLTA_CODIGO = 2;
    private Context context;
    private ListView listViewHorarioDaLinhaDeOnibusIda;
    private ListView listViewHorarioDaLinhaDeOnibusVolta;
    private long linhaDeOnibusIdSelecionado;
    private String nomeDaLinha;
    private DatabaseHelper databaseHelper;
    private HorarioDaLinhaDeOnibusDAO horarioDaLinhaDeOnibusDAO;
    private ArrayList<HorarioDaLinhaDeOnibus> horariosDaLinhaDeOnibus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_de_linha_de_onibus);
        this.obterParametros();
        this.context = getApplicationContext();
        this.configurarActionBar();
        this.databaseHelper = new DatabaseHelper(this);
        this.horarioDaLinhaDeOnibusDAO = new HorarioDaLinhaDeOnibusDAO(databaseHelper.getWritableDatabase());
        this.configurarTabs();
        this.carregarHorarioDaLinhaSelecionada();
        this.configurarListView();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void configurarActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(this.nomeDaLinha);
        actionBar.setIcon(R.drawable.ic_launcher);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
    }

    public void obterParametros() {
        Bundle bundle = getIntent().getExtras();
        this.linhaDeOnibusIdSelecionado = bundle.getLong(PARAMETRO_LINHA_DE_ONIBUS_ID);
        this.nomeDaLinha = bundle.getString(PARAMETRO_NOME_DA_LINHA);
    }

    public void carregarHorarioDaLinhaSelecionada() {
        this.horariosDaLinhaDeOnibus = horarioDaLinhaDeOnibusDAO.obterTodosAondeLinhaDeOnibusE(this.linhaDeOnibusIdSelecionado);
    }

    public void configurarTabs() {
        TabHost abas = (TabHost) findViewById(android.R.id.tabhost);
        abas.setup();

        TabHost.TabSpec aba = abas.newTabSpec(ABA_IDA_NOME);
        aba.setContent(R.id.list_view_horario_de_linha_de_onibus_ida);
        aba.setIndicator(getString(R.string.list_view_horario_de_linha_de_onibus_ida));
        abas.addTab(aba);

        aba = abas.newTabSpec(ABA_VOLTA_NOME);
        aba.setContent(R.id.list_view_horario_de_linha_de_onibus_volta);
        aba.setIndicator(getString(R.string.list_view_horario_de_linha_de_onibus_volta));
        abas.addTab(aba);
    }

    public void configurarListView() {
        this.listViewHorarioDaLinhaDeOnibusIda = (ListView) findViewById(R.id.list_view_horario_de_linha_de_onibus_ida);
        this.listViewHorarioDaLinhaDeOnibusIda.setAdapter(
                new HorarioDaLinhaDeOnibusListViewAdapter(this.context, this.horariosDaLinhaDeOnibus, ABA_IDA_CODIGO));

        this.listViewHorarioDaLinhaDeOnibusVolta = (ListView) findViewById(R.id.list_view_horario_de_linha_de_onibus_volta);
        this.listViewHorarioDaLinhaDeOnibusVolta.setAdapter(
                new HorarioDaLinhaDeOnibusListViewAdapter(this.context, this.horariosDaLinhaDeOnibus, ABA_VOLTA_CODIGO));
    }

}
