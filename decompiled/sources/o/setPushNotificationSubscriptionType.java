package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setPushNotificationSubscriptionType implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o IconCompatParcelizer = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(23);
    public final Short RemoteActionCompatParcelizer;
    public final Byte read;
    public final Byte serializer;
    public final Integer write;

    public final int hashCode() {
        Integer num = this.write;
        int iHashCode = num == null ? 0 : num.hashCode();
        Short sh = this.RemoteActionCompatParcelizer;
        int iHashCode2 = sh == null ? 0 : sh.hashCode();
        Byte b = this.serializer;
        int iHashCode3 = b == null ? 0 : b.hashCode();
        Byte b2 = this.read;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (b2 != null ? b2.hashCode() : 0)) * (-2128831035);
    }

    public setPushNotificationSubscriptionType(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.write = (Integer) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Short) iscontentcardsunreadvisualindicatorenabled.write;
        this.serializer = (Byte) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.read = (Byte) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("M7Pedometer{number_of_steps=");
        sb.append(this.write);
        sb.append(", distance=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", floors_ascended=");
        sb.append(this.serializer);
        sb.append(", floors_descended=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.read, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r5 = r5.read;
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
            boolean r2 = r5 instanceof o.setPushNotificationSubscriptionType
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setPushNotificationSubscriptionType r5 = (o.setPushNotificationSubscriptionType) r5
            java.lang.Integer r2 = r5.write
            java.lang.Integer r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L1d:
            java.lang.Short r2 = r5.RemoteActionCompatParcelizer
            java.lang.Short r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L2b:
            java.lang.Byte r2 = r5.serializer
            java.lang.Byte r3 = r4.serializer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L39:
            java.lang.Byte r5 = r5.read
            java.lang.Byte r2 = r4.read
            if (r2 == r5) goto L49
            if (r2 == 0) goto L48
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L48
            goto L49
        L48:
            return r1
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPushNotificationSubscriptionType.equals(java.lang.Object):boolean");
    }
}
