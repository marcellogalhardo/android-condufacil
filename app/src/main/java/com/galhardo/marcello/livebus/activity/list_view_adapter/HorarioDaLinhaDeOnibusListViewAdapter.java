package com.galhardo.marcello.livebus.activity.list_view_adapter;

/**
 * Created by marcello on 26/11/14.
 */


import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.galhardo.marcello.livebus.R;
import com.galhardo.marcello.livebus.activity.HorarioDaLinhaDeOnibusActivity;
import com.galhardo.marcello.livebus.model.HorarioDaLinhaDeOnibus;
import com.galhardo.marcello.livebus.model.LinhaDeOnibus;

public class HorarioDaLinhaDeOnibusListViewAdapter extends BaseAdapter {
    private ArrayList<HorarioDaLinhaDeOnibus> horariosDasLinhasDeOnibus;
    private LayoutInflater inflater;
    private Context context;

    private class ViewHolder {
        TextView textViewLineName;
    }

    public HorarioDaLinhaDeOnibusListViewAdapter(Context context, ArrayList<HorarioDaLinhaDeOnibus> horariosDaLinhaDeOnibus) {
        this.horariosDasLinhasDeOnibus = horariosDaLinhaDeOnibus;
        this.context = context;
        inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return horariosDasLinhasDeOnibus.size();
    }

    @Override
    public HorarioDaLinhaDeOnibus getItem(int position) {
        return horariosDasLinhasDeOnibus.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder;

        if(convertView == null) {
            convertView = inflater.inflate(R.layout.list_view_horario_da_linha_de_onibus, null);
            mViewHolder = new ViewHolder();
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        TextView textViewLineName = (TextView) convertView.findViewById(R.id.list_view_horario_da_linha_de_onibus_nome);
        textViewLineName.setText(horariosDasLinhasDeOnibus.get(position).getHorario());
        mViewHolder.textViewLineName = textViewLineName;
        return convertView;
    }

}