package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class CameraUseInconsistentTimebaseQuirk {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[ZslDisablerQuirk.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[ZslDisablerQuirk.READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[ZslDisablerQuirk.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[ZslDisablerQuirk.FIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
