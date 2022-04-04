package com.example.counter;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int count;

    public int getCurrentCount() {
        return count;
    }

    public int getDecreasedCount() {
        return --count;
    }

    public int getIncreasedCount() {
        return ++count;
    }
}
