package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class routeUserWithNotificationOpenedIntentlambda2 {
    private final long RemoteActionCompatParcelizer;
    private final long serializer;

    public routeUserWithNotificationOpenedIntentlambda2(long j, long j2) {
        this.RemoteActionCompatParcelizer = j;
        this.serializer = j2;
    }

    public static sendPushActionIntentdefault IconCompatParcelizer(routeUserWithNotificationOpenedIntentlambda2 routeuserwithnotificationopenedintentlambda2, long j, BrazeUser brazeUser) {
        List list = brazeUser.serializer;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jIntValue = ((long) ((Integer) list.get(i3)).intValue()) + j;
            if (jIntValue > routeuserwithnotificationopenedintentlambda2.serializer) {
                break;
            }
            if (i == -1 && jIntValue >= routeuserwithnotificationopenedintentlambda2.RemoteActionCompatParcelizer) {
                i = i3;
            }
            i2 = i3;
        }
        return new sendPushActionIntentdefault(i, i2);
    }
}
