package com.example.coronaguide.ui.mask;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MaskViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MaskViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mask fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}