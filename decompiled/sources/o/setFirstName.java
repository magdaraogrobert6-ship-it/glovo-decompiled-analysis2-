package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setFirstName implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY RemoteActionCompatParcelizer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(22);
    public final Long IconCompatParcelizer;
    public final Long read;
    public final List serializer;
    public final setPushNotificationSubscriptionType write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        List list = this.serializer;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        setPushNotificationSubscriptionType setpushnotificationsubscriptiontype = this.write;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (setpushnotificationsubscriptiontype != null ? setpushnotificationsubscriptiontype.hashCode() : 0)) * (-2128831035);
    }

    public setFirstName(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.IconCompatParcelizer = (Long) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.read = (Long) iscontentcardsunreadvisualindicatorenabled.write;
        ArrayList arrayList = (ArrayList) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.serializer = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.write = (setPushNotificationSubscriptionType) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        return "M7DataCollection{start=" + this.IconCompatParcelizer + ", stop=" + this.read + ", motion_activities=" + this.serializer + ", pedometer=" + this.write + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r5 = r5.write;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof o.setFirstName
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setFirstName r5 = (o.setFirstName) r5
            java.lang.Long r2 = r5.IconCompatParcelizer
            java.lang.Long r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L1b:
            java.lang.Long r2 = r5.read
            java.lang.Long r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L27:
            java.util.List r2 = r5.serializer
            java.util.List r3 = r4.serializer
            if (r3 == r2) goto L35
            if (r3 == 0) goto L44
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L35:
            o.setPushNotificationSubscriptionType r5 = r5.write
            o.setPushNotificationSubscriptionType r2 = r4.write
            if (r2 == r5) goto L45
            if (r2 == 0) goto L44
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L44
            goto L45
        L44:
            return r1
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFirstName.equals(java.lang.Object):boolean");
    }
}
