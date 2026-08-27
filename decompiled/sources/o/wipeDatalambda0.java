package o;

/* JADX INFO: loaded from: classes3.dex */
public final class wipeDatalambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final stopInstancelambda11 IconCompatParcelizer = new stopInstancelambda11(0);
    public final BrazeCompanionExternalSyntheticLambda4 RemoteActionCompatParcelizer;
    public final BrazeCompanionExternalSyntheticLambda4 serializer;
    public final handleIncomingIntent write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        handleIncomingIntent handleincomingintent = this.write;
        int iHashCode2 = handleincomingintent == null ? 0 : handleincomingintent.hashCode();
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = this.serializer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (brazeCompanionExternalSyntheticLambda4 != null ? brazeCompanionExternalSyntheticLambda4.hashCode() : 0)) * (-2128831035);
    }

    public wipeDatalambda0(stopInstancelambda10 stopinstancelambda10) {
        this.RemoteActionCompatParcelizer = stopinstancelambda10.IconCompatParcelizer;
        this.write = stopinstancelambda10.RemoteActionCompatParcelizer;
        this.serializer = stopinstancelambda10.serializer;
    }

    public final String toString() {
        return "GeofencelessStationaryStateEvent{location=" + this.RemoteActionCompatParcelizer + ", wifi_info=" + this.write + ", stationary_causing_location=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        r5 = r5.serializer;
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
            boolean r2 = r5 instanceof o.wipeDatalambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.wipeDatalambda0 r5 = (o.wipeDatalambda0) r5
            o.BrazeCompanionExternalSyntheticLambda4 r2 = r5.RemoteActionCompatParcelizer
            o.BrazeCompanionExternalSyntheticLambda4 r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L38
        L1b:
            o.handleIncomingIntent r2 = r5.write
            o.handleIncomingIntent r3 = r4.write
            if (r3 == r2) goto L29
            if (r3 == 0) goto L38
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L38
        L29:
            o.BrazeCompanionExternalSyntheticLambda4 r5 = r5.serializer
            o.BrazeCompanionExternalSyntheticLambda4 r2 = r4.serializer
            if (r2 == r5) goto L39
            if (r2 == 0) goto L38
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L38
            goto L39
        L38:
            return r1
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wipeDatalambda0.equals(java.lang.Object):boolean");
    }
}
