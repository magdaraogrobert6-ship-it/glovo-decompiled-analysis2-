package o;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContent implements accessclearShadowCache {
    public final ObjectListtoString1 RemoteActionCompatParcelizer;
    public final accessisRenderNodeCompatiblecp serializer;

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_DESTROY)
    public void onDestroy(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        this.RemoteActionCompatParcelizer.RatingCompat(accessisrendernodecompatiblecp);
    }

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_START)
    public void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(accessisrendernodecompatiblecp);
    }

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_STOP)
    public void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        this.RemoteActionCompatParcelizer.write(accessisrendernodecompatiblecp);
    }

    public AnimatedContent(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, ObjectListtoString1 objectListtoString1) {
        this.serializer = accessisrendernodecompatiblecp;
        this.RemoteActionCompatParcelizer = objectListtoString1;
    }
}
