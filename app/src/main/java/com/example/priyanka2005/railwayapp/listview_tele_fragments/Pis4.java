package com.example.priyanka2005.railwayapp.listview_tele_fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.utils.Constants;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Pis4 extends Fragment {
    public Pis4() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.tele_pis_4,container,false );
        PDFView pdfView= (PDFView) view.findViewById(R.id.pis4);
        new RetrieverClass().execute(new Constants().url_tele_pis4);
        return view;
    } class RetrieverClass extends AsyncTask<String,Void,InputStream> {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream=null;
            try {
                URL url = new URL( strings[0] );
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();

                if(httpURLConnection.getResponseCode() == 200){
                    inputStream = new BufferedInputStream( httpURLConnection.getInputStream() );
                }
            }
            catch (IOException e){
                return null;
            }
            return inputStream;
        }


    }
}
