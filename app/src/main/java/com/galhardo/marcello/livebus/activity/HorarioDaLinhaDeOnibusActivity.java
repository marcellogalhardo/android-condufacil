package com.galhardo.marcello.livebus.activity;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import com.galhardo.marcello.livebus.R;
import com.galhardo.marcello.livebus.activity.list_view_adapter.HorarioDaLinhaDeOnibusListViewAdapter;
import com.galhardo.marcello.livebus.database.DatabaseHelper;
import com.galhardo.marcello.livebus.data_acess_object.HorarioDaLinhaDeOnibusDAO;
import com.galhardo.marcello.livebus.model.HorarioDaLinhaDeOnibus;

import java.util.ArrayList;

public class HorarioDaLinhaDeOnibusActivity extends ActionBarActivity {
    public static final String LIVE_BUS_MOBILE = "live_bus_mobile";
    public static final String PARAMETRO_LINHA_DE_ONIBUS_ID = "linha_de_onibus_id";
    public static final String PARAMETRO_NOME_DA_LINHA = "nome_da_linha";
    public static final String PARAMETRO_NOME_DA_VIACAO = "nome_da_viacao";
    public static final String ABA_IDA_NOME = "Ida";
    public static final String ABA_VOLTA_NOME = "Volta";
    public static final String ABA_CIRCULAR_NOME = "Circular";
    private Context context;
    private ListView listViewHorarioDaLinhaDeOnibusIda;
    private ListView listViewHorarioDaLinhaDeOnibusVolta;
    private ListView listViewHorarioDaLinhaDeOnibusCircular;
    private long linhaDeOnibusIdSelecionado;
    private String nomeDaLinha;
    private String nomeDaViacao;
    private DatabaseHelper databaseHelper;
    private HorarioDaLinhaDeOnibusDAO horarioDaLinhaDeOnibusDAO;
    private ArrayList<HorarioDaLinhaDeOnibus> horariosDaLinhaDeOnibusIda;
    private ArrayList<HorarioDaLinhaDeOnibus> horariosDaLinhaDeOnibusVolta;
    private ArrayList<HorarioDaLinhaDeOnibus> horariosDaLinhaDeOnibusCircular;
    private TabHost abas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_da_linha_de_onibus);
        this.obterParametros();
        this.context = getApplicationContext();
        this.configurarActionBar();
        this.databaseHelper = new DatabaseHelper(this);
        this.horarioDaLinhaDeOnibusDAO = new HorarioDaLinhaDeOnibusDAO(databaseHelper.getWritableDatabase());
        this.carregarHorarioDaLinhaSelecionada();
        this.configurarListView();
        this.configurarTabs();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_horario_da_linha_de_onibus, menu);
        return super.onCreateOptionsMenu(menu);
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
        this.nomeDaViacao = bundle.getString(PARAMETRO_NOME_DA_VIACAO);
    }

    public void carregarHorarioDaLinhaSelecionada() {
        this.horariosDaLinhaDeOnibusIda = horarioDaLinhaDeOnibusDAO.obterTodosOsHorariosDeIdaAondeLinhaDeOnibusE(this.linhaDeOnibusIdSelecionado);
        this.horariosDaLinhaDeOnibusVolta = horarioDaLinhaDeOnibusDAO.obterTodosOsHorariosDeVoltaAondeLinhaDeOnibusE(this.linhaDeOnibusIdSelecionado);
        this.horariosDaLinhaDeOnibusCircular = horarioDaLinhaDeOnibusDAO.obterTodosOsHorariosCircularAondeLinhaDeOnibusE(this.linhaDeOnibusIdSelecionado);
    }

    public void configurarTabs() {
        abas = (TabHost) findViewById(android.R.id.tabhost);
        abas.setup();
        TabHost.TabSpec aba;

        if (!horariosDaLinhaDeOnibusIda.isEmpty()) {
            aba = abas.newTabSpec(ABA_IDA_NOME);
            aba.setContent(R.id.list_view_horario_de_linha_de_onibus_ida);
            aba.setIndicator(getString(R.string.list_view_horario_de_linha_de_onibus_ida));
            abas.addTab(aba);
        }

        if (!horariosDaLinhaDeOnibusVolta.isEmpty()) {
            aba = abas.newTabSpec(ABA_VOLTA_NOME);
            aba.setContent(R.id.list_view_horario_de_linha_de_onibus_volta);
            aba.setIndicator(getString(R.string.list_view_horario_de_linha_de_onibus_volta));
            abas.addTab(aba);
        }

        if (!horariosDaLinhaDeOnibusCircular.isEmpty()) {
            aba = abas.newTabSpec(ABA_CIRCULAR_NOME);
            aba.setContent(R.id.list_view_horario_de_linha_de_onibus_circular);
            aba.setIndicator(getString(R.string.list_view_horario_de_linha_de_onibus_circular));
            abas.addTab(aba);
        }
    }

    public void configurarListView() {
        this.listViewHorarioDaLinhaDeOnibusIda = (ListView) findViewById(R.id.list_view_horario_de_linha_de_onibus_ida);
        this.listViewHorarioDaLinhaDeOnibusIda.setAdapter(
                new HorarioDaLinhaDeOnibusListViewAdapter(this.context, this.horariosDaLinhaDeOnibusIda));

        this.listViewHorarioDaLinhaDeOnibusVolta = (ListView) findViewById(R.id.list_view_horario_de_linha_de_onibus_volta);
        this.listViewHorarioDaLinhaDeOnibusVolta.setAdapter(
                new HorarioDaLinhaDeOnibusListViewAdapter(this.context, this.horariosDaLinhaDeOnibusVolta));

        this.listViewHorarioDaLinhaDeOnibusCircular = (ListView) findViewById(R.id.list_view_horario_de_linha_de_onibus_circular);
        this.listViewHorarioDaLinhaDeOnibusCircular.setAdapter(
                new HorarioDaLinhaDeOnibusListViewAdapter(this.context, this.horariosDaLinhaDeOnibusCircular));
    }

}
