package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled {
    public static final setIsFirebaseCloudMessagingRegistrationEnabled Companion = new setIsFirebaseCloudMessagingRegistrationEnabled();
    public static final setGraphicModalMaxWidthDp[] f;
    public final List a;
    public final setLargeNotificationIconNameandroid_sdk_base_release b;
    public final long c;
    public final Map d;
    public final List e;

    static {
        setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release.IconCompatParcelizer, 0);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        f = new setGraphicModalMaxWidthDp[]{setwasclosemessagecalled, null, null, new beforeOpened(beforeinappmessageviewclosed, beforeinappmessageviewclosed), new setWasCloseMessageCalled(setPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release.write, 0)};
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        return this.d.hashCode() + d$$ExternalSyntheticOutline0.m((this.b.hashCode() + (iHashCode * 31)) * 31, 31, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled)) {
            return false;
        }
        setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled setisfirebasemessagingserviceonnewtokenregistrationenabled = (setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, setisfirebasemessagingserviceonnewtokenregistrationenabled.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, setisfirebasemessagingserviceonnewtokenregistrationenabled.b}, getCieXyz.write())).booleanValue() || this.c != setisfirebasemessagingserviceonnewtokenregistrationenabled.c) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, setisfirebasemessagingserviceonnewtokenregistrationenabled.d}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeomPolygon(polygon=");
        sb.append(this.a);
        sb.append(", center=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", tags=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, this.d, ')');
    }

    public setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled(List list, setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release, long j, HashMap map) {
        list.getClass();
        this.a = list;
        this.b = setlargenotificationiconnameandroid_sdk_base_release;
        this.c = j;
        this.d = map;
        this.e = new ArrayList();
    }
}
