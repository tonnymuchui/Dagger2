package com.dagger2.Utils;

import com.dagger2.MainActivity;
import com.dagger2.Model.Car;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
