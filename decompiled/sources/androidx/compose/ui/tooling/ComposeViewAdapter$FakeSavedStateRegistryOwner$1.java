package androidx.compose.ui.tooling;

import android.os.Bundle;
import bo.app.a5$$ExternalSyntheticLambda0;
import o.accessregisterComponentCallback;
import o.getLightGray0d7_KjU;
import o.getRed0d7_KjU;
import o.getTransparent0d7_KjU;
import o.getWhite0d7_KjU;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeViewAdapter$FakeSavedStateRegistryOwner$1 implements getTransparent0d7_KjU {
    private final getWhite0d7_KjU controller;
    private final accessregisterComponentCallback lifecycleRegistry;

    public final accessregisterComponentCallback getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }

    @Override // o.getTransparent0d7_KjU
    public getLightGray0d7_KjU getSavedStateRegistry() {
        return this.controller.read;
    }

    @Override // o.accessisRenderNodeCompatiblecp
    public accessregisterComponentCallback getLifecycle() {
        return this.lifecycleRegistry;
    }

    public ComposeViewAdapter$FakeSavedStateRegistryOwner$1() {
        accessregisterComponentCallback accessregistercomponentcallback = new accessregisterComponentCallback(this, false);
        this.lifecycleRegistry = accessregistercomponentcallback;
        getWhite0d7_KjU getwhite0d7_kju = new getWhite0d7_KjU(new getRed0d7_KjU(this, new a5$$ExternalSyntheticLambda0(12, this)));
        getwhite0d7_kju.RemoteActionCompatParcelizer(new Bundle());
        this.controller = getwhite0d7_kju;
        accessregistercomponentcallback.RemoteActionCompatParcelizer(toColorLong8_81llA.RESUMED);
    }
}
