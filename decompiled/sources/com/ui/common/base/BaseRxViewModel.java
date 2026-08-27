package com.ui.common.base;

import androidx.lifecycle.ViewModel;
import io.reactivex.disposables.CompositeDisposable;
import o.getPivotOffsetF1C5BW0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseRxViewModel extends ViewModel {
    private final getPivotOffsetF1C5BW0 read;
    private final CompositeDisposable serializer;

    public final CompositeDisposable ParcelableVolumeInfo() {
        return this.serializer;
    }

    public final getPivotOffsetF1C5BW0 PlaybackStateCompat() {
        return this.read;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.serializer.read();
    }

    public BaseRxViewModel(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0) {
        getpivotoffsetf1c5bw0.getClass();
        this.read = getpivotoffsetf1c5bw0;
        this.serializer = new CompositeDisposable();
    }
}
