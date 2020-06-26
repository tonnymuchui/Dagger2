package com.dagger2.Utils;

import android.util.Log;

import com.dagger2.Model.Engine;

public class PetrolEngine  implements Engine {

    private static final String TAG = "Car";
    @Override
    public void start() {
        Log.d(TAG, "petrol engine");
    }
}
