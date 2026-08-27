package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getHasAlpha implements toAndroidColorSpace, AutoCloseable {
    public boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final getBitmapui_graphics read;

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public getHasAlpha(String str, getBitmapui_graphics getbitmapui_graphics) {
        this.RemoteActionCompatParcelizer = str;
        this.read = getbitmapui_graphics;
    }

    public final void IconCompatParcelizer(supportsColorMatrixQuery supportscolormatrixquery, getLightGray0d7_KjU getlightgray0d7_kju) {
        getlightgray0d7_kju.getClass();
        supportscolormatrixquery.getClass();
        if (this.IconCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Already attached to lifecycleOwner");
            return;
        }
        this.IconCompatParcelizer = true;
        supportscolormatrixquery.IconCompatParcelizer(this);
        getlightgray0d7_kju.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) this.read.read.serializer);
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
            this.IconCompatParcelizer = false;
            accessisrendernodecompatiblecp.getLifecycle().read(this);
        }
    }
}
