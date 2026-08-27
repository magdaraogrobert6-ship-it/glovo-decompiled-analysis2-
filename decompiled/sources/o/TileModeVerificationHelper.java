package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class TileModeVerificationHelper {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[getComposeTileModeDecal3opZhB0.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[getComposeTileModeDecal3opZhB0.HARDWARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[getComposeTileModeDecal3opZhB0.SOFTWARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[getComposeTileModeDecal3opZhB0.AUTOMATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
