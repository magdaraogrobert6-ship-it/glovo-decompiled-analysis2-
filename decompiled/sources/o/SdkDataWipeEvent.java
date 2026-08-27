package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SdkDataWipeEvent {
    public static final SessionStateChangedEvent IconCompatParcelizer = new SessionStateChangedEvent();
    public static final getSessionId RemoteActionCompatParcelizer = new getSessionId();

    public abstract void IconCompatParcelizer(long j, Object obj);

    public abstract void read(long j, Object obj, Object obj2);

    public abstract List write(long j, Object obj);
}
