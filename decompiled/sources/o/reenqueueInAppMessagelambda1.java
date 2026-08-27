package o;

/* JADX INFO: loaded from: classes3.dex */
public final class reenqueueInAppMessagelambda1 implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ refreshFeatureFlagslambda0 IconCompatParcelizer;

    public reenqueueInAppMessagelambda1(refreshFeatureFlagslambda0 refreshfeatureflagslambda0) {
        this.IconCompatParcelizer = refreshfeatureflagslambda0;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = read + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessisrendernodecompatiblecp.getClass();
        refreshFeatureFlagslambda0 refreshfeatureflagslambda0 = this.IconCompatParcelizer;
        if (((Boolean) refreshfeatureflagslambda0.write.read()).booleanValue()) {
            int i4 = serializer + 67;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            refreshfeatureflagslambda0.MediaBrowserCompatMediaItem.IconCompatParcelizer(requestBannersRefreshlambda0.ABANDONED, true, null);
        }
        int i6 = serializer + 3;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }
}
