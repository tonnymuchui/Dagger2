package com.dagger2.Model;

import com.dagger2.Utils.DieselEngine;
import com.dagger2.Utils.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine dieselEngine);
}
