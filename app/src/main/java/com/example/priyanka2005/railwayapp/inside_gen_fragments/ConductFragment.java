package com.example.priyanka2005.railwayapp.inside_gen_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.listview_activities.InsideGenList;

public class ConductFragment extends Fragment implements View.OnClickListener {
    private CardView conduct1;
    public ConductFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_gen_conduct,container,false );
        conduct1 = (CardView)view.findViewById( R.id.conduct1 );
        conduct1.setOnClickListener( this );
        return view;
    }
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.conduct1:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","conduct1" ) );
                break;

        }
    }
}
