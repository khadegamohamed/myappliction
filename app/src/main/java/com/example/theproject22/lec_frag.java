package com.example.theproject22;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link lec_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class lec_frag extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_ID = "id";
    private static final String ARG_NAME = "name";
   RecyclerView recycle;
    ArrayList<Name> subjects=new ArrayList<>();

    // TODO: Rename and change types of parameters
    private int id;
    private String name;

    public lec_frag() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static lec_frag newInstance(int id, String name) {
        lec_frag fragment = new lec_frag();
        Bundle args = new Bundle();
        args.putInt(ARG_ID,id) ;
        args.putString(ARG_NAME,name);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
          id= getArguments().getInt(ARG_ID);
          name = getArguments().getString(ARG_NAME);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lec_frag, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView=view.findViewById(R.id.rec_lec);
    }

}
