package com.kainsday.practice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FragTuesday extends Fragment {


    private static final String url = "https://ghibliapi.herokuapp.com/films";

    private TestAdapter adapter;

    private RecyclerView recyclerView;

    private RecyclerView rv_main;
    private ArrayList<WordItemData> list = new ArrayList<>();



    public static FragTuesday newInstance() {
        FragTuesday fragTuesday = new FragTuesday();
        return fragTuesday;


    }

    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.frag_tuesday, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rv_main);
        return view;

    }

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if (AppHelper.requestQueue == null) {
            AppHelper.requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());

        }

        StringRequest request = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {

                        Gson gson = new Gson();

                        ArrayList<TestItem> itemList = new ArrayList<>();

                        TestItem[] items = gson.fromJson(response, TestItem[].class);


                        System.out.println(items);

                        for(TestItem item : items) {
                            itemList.add(item);
                        }

                        list = WordItemData.createContactsList(5);
                        recyclerView.setHasFixedSize(true);
                        adapter = new TestAdapter(getActivity().getApplicationContext(),itemList);
                        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
                        recyclerView.setAdapter(adapter);



                    }


                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                    }
                }

        ) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String, String>();

                return params;
            }
        };



    }

}







