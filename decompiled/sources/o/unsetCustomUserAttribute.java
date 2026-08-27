package o;

/* JADX INFO: loaded from: classes3.dex */
public final class unsetCustomUserAttribute implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw read = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(23);
    public final Byte IconCompatParcelizer;
    public final setPhoneNumber RemoteActionCompatParcelizer;
    public final setEmailNotificationSubscriptionTypelambda0 serializer;
    public final setCustomUserAttributelambda2 write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public unsetCustomUserAttribute(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.IconCompatParcelizer = (Byte) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.serializer = (setEmailNotificationSubscriptionTypelambda0) iscontentcardsunreadvisualindicatorenabled.write;
        this.RemoteActionCompatParcelizer = (setPhoneNumber) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.write = (setCustomUserAttributelambda2) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        return "StatusUpdate{trigger=" + this.IconCompatParcelizer + ", sdk_status=" + this.serializer + ", app_status=" + this.RemoteActionCompatParcelizer + ", device_status=" + this.write + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
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
            boolean r2 = r5 instanceof o.unsetCustomUserAttribute
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.unsetCustomUserAttribute r5 = (o.unsetCustomUserAttribute) r5
            java.lang.Byte r2 = r5.IconCompatParcelizer
            java.lang.Byte r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L1b:
            o.setEmailNotificationSubscriptionTypelambda0 r2 = r5.serializer
            o.setEmailNotificationSubscriptionTypelambda0 r3 = r4.serializer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L27:
            o.setPhoneNumber r2 = r5.RemoteActionCompatParcelizer
            o.setPhoneNumber r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L33:
            o.setCustomUserAttributelambda2 r5 = r5.write
            o.setCustomUserAttributelambda2 r2 = r4.write
            if (r2 == r5) goto L41
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L40
            goto L41
        L40:
            return r1
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unsetCustomUserAttribute.equals(java.lang.Object):boolean");
    }
}
