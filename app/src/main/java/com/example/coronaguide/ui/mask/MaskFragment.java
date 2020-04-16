package com.example.coronaguide.ui.mask;

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

public class MaskFragment extends Fragment {

    private MaskViewModel maskViewModel;
    TextView textview;
    private Spanned Text;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        maskViewModel =
                ViewModelProviders.of(this).get(MaskViewModel.class);
        View root = inflater.inflate(R.layout.mask_guidelines, container, false);
        textview = root.findViewById(R.id.linkmask);
        Text = Html.fromHtml("All Info on this page is taken from this URL on WHO website. <br />" +
                "<a href='https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/when-and-how-to-use-masks</a>");
        maskViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}
