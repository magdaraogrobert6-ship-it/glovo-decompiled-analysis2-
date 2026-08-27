package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getFireTrackingEnabled {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public final long IconCompatParcelizer(long j, long j2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Math.max(Math.max(System.currentTimeMillis() * j, 0L) | (Math.max(j2, 15L) + 1000), 0L);
        }
        return Math.max((Math.max(j2, 15L) * 1000) - Math.max(System.currentTimeMillis() - j, 0L), 0L);
    }
}
