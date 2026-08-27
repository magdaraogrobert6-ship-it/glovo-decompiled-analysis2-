package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setLanguage implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw RemoteActionCompatParcelizer = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(22);
    public final setCustomUserAttributelambda5 IconCompatParcelizer;
    public final setCustomUserAttributeToSecondsFromEpoch read;
    public final setLineId serializer;
    public final removeFromSubscriptionGrouplambda0 write;

    public final int hashCode() {
        setLineId setlineid = this.serializer;
        int iHashCode = setlineid == null ? 0 : setlineid.hashCode();
        setCustomUserAttributeToSecondsFromEpoch setcustomuserattributetosecondsfromepoch = this.read;
        int iHashCode2 = setcustomuserattributetosecondsfromepoch == null ? 0 : setcustomuserattributetosecondsfromepoch.hashCode();
        removeFromSubscriptionGrouplambda0 removefromsubscriptiongrouplambda0 = this.write;
        int iHashCode3 = removefromsubscriptiongrouplambda0 == null ? 0 : removefromsubscriptiongrouplambda0.hashCode();
        setCustomUserAttributelambda5 setcustomuserattributelambda5 = this.IconCompatParcelizer;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (setcustomuserattributelambda5 != null ? setcustomuserattributelambda5.hashCode() : 0)) * (-2128831035);
    }

    public setLanguage(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.serializer = (setLineId) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.read = (setCustomUserAttributeToSecondsFromEpoch) iscontentcardsunreadvisualindicatorenabled.write;
        this.write = (removeFromSubscriptionGrouplambda0) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = (setCustomUserAttributelambda5) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        return "StationaryEventProperty{stationary_start=" + this.serializer + ", stationary_end=" + this.read + ", waypoint=" + this.write + ", stationary_discard=" + this.IconCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r5 = r5.IconCompatParcelizer;
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
            boolean r2 = r5 instanceof o.setLanguage
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setLanguage r5 = (o.setLanguage) r5
            o.setLineId r2 = r5.serializer
            o.setLineId r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L1d:
            o.setCustomUserAttributeToSecondsFromEpoch r2 = r5.read
            o.setCustomUserAttributeToSecondsFromEpoch r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L2b:
            o.removeFromSubscriptionGrouplambda0 r2 = r5.write
            o.removeFromSubscriptionGrouplambda0 r3 = r4.write
            if (r3 == r2) goto L39
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L39:
            o.setCustomUserAttributelambda5 r5 = r5.IconCompatParcelizer
            o.setCustomUserAttributelambda5 r2 = r4.IconCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.setLanguage.equals(java.lang.Object):boolean");
    }
}
