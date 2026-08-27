package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class EncodeException implements obtainShadowContext, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk {
    public final /* synthetic */ DrawModifierNodeKt IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ EncodeException(DrawModifierNodeKt drawModifierNodeKt, int i) {
        this.read = i;
        this.IconCompatParcelizer = drawModifierNodeKt;
    }

    @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
    public DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
        int i = this.read;
        DrawModifierNodeKt drawModifierNodeKt = this.IconCompatParcelizer;
        if (i != 2) {
            return ((ExtraSupportedSurfaceCombinationsQuirk) drawModifierNodeKt.get()).serializer();
        }
        return ((ExtraSupportedSurfaceCombinationsQuirk) drawModifierNodeKt.get()).RemoteActionCompatParcelizer();
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        int i = this.read;
        DrawModifierNodeKt drawModifierNodeKt = this.IconCompatParcelizer;
        if (i != 0) {
            drawModifierNodeKt.RemoteActionCompatParcelizer(new InvalidConfigException(ondrawwithcontent, 0), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
            return "transformVoidFuture [" + drawModifierNodeKt + "]";
        }
        VideoQualityQuirk.read(false, drawModifierNodeKt, ondrawwithcontent, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        return "nonCancellationPropagating[" + drawModifierNodeKt + "]";
    }
}
