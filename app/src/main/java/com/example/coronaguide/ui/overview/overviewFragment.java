package com.example.coronaguide.ui.overview;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.widget.TextView;

import com.example.coronaguide.R;

public class overviewFragment extends Fragment {

    private overviewViewModel overviewViewModel;
    private TextView textview;
    private Spanned Text;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        overviewViewModel =
                ViewModelProviders.of(this).get(overviewViewModel.class);
        View root = inflater.inflate(R.layout.corona_overview, container, false);
        textview = root.findViewById(R.id.linkmyth);
        Text = Html.fromHtml("All Info on this page is taken from this URL on WHO website. <br />" +
                "<a href='https://www.who.int/news-room/q-a-detail/q-a-coronaviruses</a>");
        overviewViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                
            }
        });
        return root;
    }
}
