package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getConfig_sVssgQ implements toAndroidColorSpace {
    public final readPixels write;

    public getConfig_sVssgQ(readPixels readpixels) {
        this.write = readpixels;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        if (androidColorSpace_androidKt != AndroidColorSpace_androidKt.ON_CREATE) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(androidColorSpace_androidKt, "Next event must be ON_CREATE, it was ");
        } else {
            accessisrendernodecompatiblecp.getLifecycle().read(this);
            this.write.IconCompatParcelizer();
        }
    }
}
