package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class wakeScreenIfAppropriatelambda0 {
    private final BrazeNotificationUtilsExternalSyntheticLambda34 IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final boolean read;
    private final String serializer;

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String serializer() {
        return this.serializer;
    }

    public wakeScreenIfAppropriatelambda0(String str, BrazeNotificationUtilsExternalSyntheticLambda34 brazeNotificationUtilsExternalSyntheticLambda34) {
        this(UUID.randomUUID().toString(), str, false, brazeNotificationUtilsExternalSyntheticLambda34);
    }

    public wakeScreenIfAppropriatelambda0(String str, String str2, boolean z, BrazeNotificationUtilsExternalSyntheticLambda34 brazeNotificationUtilsExternalSyntheticLambda34) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.read = z;
        this.IconCompatParcelizer = brazeNotificationUtilsExternalSyntheticLambda34;
    }
}
