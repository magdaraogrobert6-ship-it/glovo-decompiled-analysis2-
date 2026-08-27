package o;

import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setIsSessionStartBasedTimeoutEnabled {
    public static final setLargeNotificationIcon Companion = new setLargeNotificationIcon();
    public final setLargeNotificationIconNameandroid_sdk_base_release a;
    public final double b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iRemoteActionCompatParcelizer + r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIsSessionStartBasedTimeoutEnabled)) {
            return false;
        }
        setIsSessionStartBasedTimeoutEnabled setissessionstartbasedtimeoutenabled = (setIsSessionStartBasedTimeoutEnabled) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, setissessionstartbasedtimeoutenabled.a}, getCieXyz.write())).booleanValue() && Double.compare(this.b, setissessionstartbasedtimeoutenabled.b) == 0 && this.c == setissessionstartbasedtimeoutenabled.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearestPoint(point=");
        sb.append(this.a);
        sb.append(", distanceFromStationary=");
        sb.append(this.b);
        sb.append(", isInPolygon=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.c, ')');
    }

    public setIsSessionStartBasedTimeoutEnabled(int i, setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release, double d, boolean z) {
        if (7 == (i & 7)) {
            this.a = setlargenotificationiconnameandroid_sdk_base_release;
            this.b = d;
            this.c = z;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, setIsPushWakeScreenForNotificationEnabled.write);
        throw null;
    }

    public setIsSessionStartBasedTimeoutEnabled(setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release, double d, boolean z) {
        setlargenotificationiconnameandroid_sdk_base_release.getClass();
        this.a = setlargenotificationiconnameandroid_sdk_base_release;
        this.b = d;
        this.c = z;
    }
}
