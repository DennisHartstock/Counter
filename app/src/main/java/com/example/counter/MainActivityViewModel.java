package com.example.counter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int count;
    private final MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public MutableLiveData<Integer> getCurrentCount() {
        countLiveData.setValue(count);
        return countLiveData;
    }

    public void getDecreasedCount() {
        --count;
        countLiveData.setValue(count);
    }

    public void getIncreasedCount() {
        ++count;
        countLiveData.setValue(count);
    }
}
