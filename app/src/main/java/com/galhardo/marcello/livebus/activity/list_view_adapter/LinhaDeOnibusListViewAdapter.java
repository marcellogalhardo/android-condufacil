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
import com.galhardo.marcello.livebus.model.LinhaDeOnibus;

public class LinhaDeOnibusListViewAdapter extends BaseAdapter {
    private ArrayList<LinhaDeOnibus> linhasDeOnibus;
    private LayoutInflater inflater;
    private Context context;

    private class ViewHolder {
        TextView textViewLineName;
    }

    public LinhaDeOnibusListViewAdapter(Context context, ArrayList<LinhaDeOnibus> linhasDeOnibus) {
        this.linhasDeOnibus = linhasDeOnibus;
        this.context = context;
        inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return linhasDeOnibus.size();
    }

    @Override
    public LinhaDeOnibus getItem(int position) {
        return linhasDeOnibus.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder;

        if(convertView == null) {
            convertView = inflater.inflate(R.layout.list_view_linha_de_onibus, null);
            mViewHolder = new ViewHolder();
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        TextView textViewLineName = (TextView) convertView.findViewById(R.id.list_view_linha_de_onibus_nome);
        textViewLineName.setText(linhasDeOnibus.get(position).getNomeDaLinha());
        mViewHolder.textViewLineName = textViewLineName;

        return convertView;
    }

}