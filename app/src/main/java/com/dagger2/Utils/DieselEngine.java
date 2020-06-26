package com.dagger2.Utils;

import android.util.Log;

import com.dagger2.Model.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "diesel engine");
    }
}
