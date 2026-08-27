package o;

/* JADX INFO: loaded from: classes.dex */
public enum getComposeTileModeDecal3opZhB0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean useSoftwareRendering(int i, boolean z, int i2) {
        int i3 = TileModeVerificationHelper.RemoteActionCompatParcelizer[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
