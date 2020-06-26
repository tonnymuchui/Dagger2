package com.dagger2.Model;

import com.dagger2.Utils.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine petrolEngine);
}
