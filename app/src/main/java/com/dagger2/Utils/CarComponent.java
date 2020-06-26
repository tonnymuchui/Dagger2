package com.dagger2.Utils;

import com.dagger2.MainActivity;
import com.dagger2.Model.Car;
import com.dagger2.Model.DieselEngineModule;
import com.dagger2.Model.PetrolEngineModule;
import com.dagger2.Model.WheelsModule;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
