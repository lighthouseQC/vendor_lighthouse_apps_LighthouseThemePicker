package com.lighthouse.android.customization.picker

import android.app.Application;

import com.android.wallpaper.module.InjectorProvider;

import com.lighthouse.android.customization.module.lighthouseCustomizationInjector;

public class lighthouseCustomizationPickerApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        InjectorProvider.setInjector(lighthouseCustomizationInjector());
    }

}
