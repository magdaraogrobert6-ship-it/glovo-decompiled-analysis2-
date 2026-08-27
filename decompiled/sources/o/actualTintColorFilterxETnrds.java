package o;

/* JADX INFO: loaded from: classes.dex */
public final class actualTintColorFilterxETnrds implements toAndroidColorSpace {
    public final /* synthetic */ getLightGray0d7_KjU read;
    public final /* synthetic */ supportsColorMatrixQuery write;

    public actualTintColorFilterxETnrds(supportsColorMatrixQuery supportscolormatrixquery, getLightGray0d7_KjU getlightgray0d7_kju) {
        this.write = supportscolormatrixquery;
        this.read = getlightgray0d7_kju;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_START) {
            this.write.read(this);
            this.read.serializer();
        }
    }
}
