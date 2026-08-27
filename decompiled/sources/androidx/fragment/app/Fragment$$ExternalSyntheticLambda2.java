package androidx.fragment.app;

import o.toPorterDuffModes9anfk8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Fragment$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ Fragment IconCompatParcelizer;

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = this.IconCompatParcelizer;
        toPorterDuffModes9anfk8 toporterduffmodes9anfk8 = fragment.getLastCustomNonConfigurationInstance;
        toporterduffmodes9anfk8.read.RemoteActionCompatParcelizer(fragment.addOnConfigurationChangedListener);
        fragment.addOnConfigurationChangedListener = null;
    }

    public /* synthetic */ Fragment$$ExternalSyntheticLambda2(Fragment fragment) {
        this.IconCompatParcelizer = fragment;
    }
}
