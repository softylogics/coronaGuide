package com.example.coronaguide.ui.myths;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.example.coronaguide.R;

public class mythsFragment extends Fragment {

    private mythsViewModel mythsViewModel;
    private TextView textview;
    private Spanned Text;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mythsViewModel =
                ViewModelProviders.of(this).get(mythsViewModel.class);
        View root = inflater.inflate(R.layout.myths_corona, container, false);
        textview = root.findViewById(R.id.linkmyth);
        Text = Html.fromHtml("All Info on this page is taken from this URL on WHO website. <br />" +
                "<a href='https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters</a>");
        mythsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}
