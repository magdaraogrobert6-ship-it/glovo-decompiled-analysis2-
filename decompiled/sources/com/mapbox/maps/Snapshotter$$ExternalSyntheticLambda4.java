package com.mapbox.maps;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Snapshotter$$ExternalSyntheticLambda4 implements StyleDataLoadedCallback, StyleLoadedCallback, StyleImageMissingCallback {
    public final /* synthetic */ WeakReference f$0;

    public /* synthetic */ Snapshotter$$ExternalSyntheticLambda4(WeakReference weakReference) {
        this.f$0 = weakReference;
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        Snapshotter._init_$lambda$5(this.f$0, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        Snapshotter._init_$lambda$11(this.f$0, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        Snapshotter._init_$lambda$9(this.f$0, styleLoaded);
    }
}
