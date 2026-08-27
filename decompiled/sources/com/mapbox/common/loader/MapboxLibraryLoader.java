package com.mapbox.common.loader;

import androidx.annotation.Keep;
import com.mapbox.common.module.LibraryLoader;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class MapboxLibraryLoader implements LibraryLoader {
    public static final MapboxLibraryLoader INSTANCE = new MapboxLibraryLoader();

    private MapboxLibraryLoader() {
    }

    @Override // com.mapbox.common.module.LibraryLoader
    public void load(String str) {
        str.getClass();
        System.loadLibrary(str);
    }
}
