package o;

/* JADX INFO: loaded from: classes.dex */
public final class clearShadowCache extends obtainViewLayerContainer implements toAndroidColorSpace {
    public final /* synthetic */ accessunregisterComponentCallback IconCompatParcelizer;
    public final accessisRenderNodeCompatiblecp read;

    @Override // o.obtainViewLayerContainer
    public final boolean read(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        return this.read == accessisrendernodecompatiblecp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clearShadowCache(accessunregisterComponentCallback accessunregistercomponentcallback, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, unregisterComponentCallback unregistercomponentcallback) {
        super(accessunregistercomponentcallback, unregistercomponentcallback);
        this.IconCompatParcelizer = accessunregistercomponentcallback;
        this.read = accessisrendernodecompatiblecp;
    }

    @Override // o.obtainViewLayerContainer
    public final boolean IconCompatParcelizer() {
        return ((accessregisterComponentCallback) this.read.getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED);
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2 = this.read;
        toColorLong8_81llA tocolorlong8_81lla = ((accessregisterComponentCallback) accessisrendernodecompatiblecp2.getLifecycle()).RatingCompat;
        if (tocolorlong8_81lla == toColorLong8_81llA.DESTROYED) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.write);
            return;
        }
        toColorLong8_81llA tocolorlong8_81lla2 = null;
        while (tocolorlong8_81lla2 != tocolorlong8_81lla) {
            serializer(IconCompatParcelizer());
            tocolorlong8_81lla2 = tocolorlong8_81lla;
            tocolorlong8_81lla = ((accessregisterComponentCallback) accessisrendernodecompatiblecp2.getLifecycle()).RatingCompat;
        }
    }

    @Override // o.obtainViewLayerContainer
    public final void serializer() {
        this.read.getLifecycle().read(this);
    }
}
