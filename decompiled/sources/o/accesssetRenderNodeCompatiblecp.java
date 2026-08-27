package o;

/* JADX INFO: loaded from: classes.dex */
public final class accesssetRenderNodeCompatiblecp {
    public toAndroidColorSpace RemoteActionCompatParcelizer;
    public toColorLong8_81llA write;

    public final void IconCompatParcelizer(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        toColorLong8_81llA targetState = androidColorSpace_androidKt.getTargetState();
        toColorLong8_81llA tocolorlong8_81lla = this.write;
        tocolorlong8_81lla.getClass();
        if (targetState != null && targetState.compareTo(tocolorlong8_81lla) < 0) {
            tocolorlong8_81lla = targetState;
        }
        this.write = tocolorlong8_81lla;
        this.RemoteActionCompatParcelizer.onStateChanged(accessisrendernodecompatiblecp, androidColorSpace_androidKt);
        this.write = targetState;
    }
}
