package com.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dagger2.Model.Car;
import com.dagger2.Utils.CarComponent;
import com.dagger2.Utils.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

   @Inject Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);
        car.drive();
    }
}
