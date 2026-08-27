package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class reuseComposition implements AbstractComposeViewExternalSyntheticLambda0 {
    public final /* synthetic */ accessgetF12cp RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ reuseComposition(accessgetF12cp accessgetf12cp, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = accessgetf12cp;
    }

    @Override // o.AbstractComposeViewExternalSyntheticLambda0
    public final Object write() {
        int i = this.read;
        accessgetF12cp accessgetf12cp = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return accessgetf12cp.read("FIREBASE_ML_SDK", new accessgetButton10cp("json"), precompose.serializer);
        }
        int i2 = 3;
        if (i == 1) {
            return accessgetf12cp.read("FIREBASE_ML_SDK", new accessgetButton10cp("json"), new toMotionEventScopeubNVwUQ(i2));
        }
        int i3 = 2;
        if (i == 2) {
            return accessgetf12cp.read("FIREBASE_ML_SDK", new accessgetButton10cp("proto"), new toMotionEventScopeubNVwUQ(i3));
        }
        if (i != 3) {
            return i != 4 ? accessgetf12cp.read("FIREBASE_ML_SDK", new accessgetButton10cp("proto"), precompose.read) : accessgetf12cp.read("FIREBASE_ML_SDK", new accessgetButton10cp("proto"), setApproachMeasureRequiredui.read);
        }
        return accessgetf12cp.read("FIREBASE_ML_SDK", new accessgetButton10cp("json"), setApproachMeasureRequiredui.IconCompatParcelizer);
    }
}
