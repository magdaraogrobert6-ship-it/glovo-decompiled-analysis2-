package o;

/* JADX INFO: loaded from: classes2.dex */
public final class makeSureStateIsConsistent {
    public static final makeSureStateIsConsistent RemoteActionCompatParcelizer;
    public static final makeSureStateIsConsistent read;
    public final Throwable IconCompatParcelizer;

    public makeSureStateIsConsistent(boolean z, RuntimeException runtimeException) {
        this.IconCompatParcelizer = runtimeException;
    }

    static {
        if (LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.RemoteActionCompatParcelizer) {
            read = null;
            RemoteActionCompatParcelizer = null;
        } else {
            read = new makeSureStateIsConsistent(false, null);
            RemoteActionCompatParcelizer = new makeSureStateIsConsistent(true, null);
        }
    }
}
