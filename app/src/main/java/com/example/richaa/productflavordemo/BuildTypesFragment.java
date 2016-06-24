package com.example.richaa.productflavordemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.view.View.VISIBLE;

public class BuildTypesFragment extends Fragment {


  public BuildTypesFragment() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View inflateView = inflater.inflate(R.layout.fragment_build_types, container, false);
    if(BuildConfig.BUILD_TYPE.equals("debug")){
      View urlSelectorView = inflateView.findViewById(R.id.url_selector);
      urlSelectorView.setVisibility(VISIBLE);
    }
    return inflateView;
  }

}
