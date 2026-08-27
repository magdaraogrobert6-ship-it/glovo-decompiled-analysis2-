package o;

import com.sentiance.core.model.events.C$b;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE IconCompatParcelizer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(5);
    public final r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0 RemoteActionCompatParcelizer;
    public final Byte read;
    public final BrazeCompanionExternalSyntheticLambda4 serializer;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0 r8lambdaverykpfxabvjgz2vb5xglrkr4_0 = this.RemoteActionCompatParcelizer;
        int iHashCode2 = r8lambdaverykpfxabvjgz2vb5xglrkr4_0 == null ? 0 : r8lambdaverykpfxabvjgz2vb5xglrkr4_0.hashCode();
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = this.serializer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (brazeCompanionExternalSyntheticLambda4 != null ? brazeCompanionExternalSyntheticLambda4.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU(C$b c$b) {
        this.read = (Byte) c$b.serializer;
        this.RemoteActionCompatParcelizer = (r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0) c$b.write;
        this.serializer = (BrazeCompanionExternalSyntheticLambda4) c$b.IconCompatParcelizer;
    }

    public final String toString() {
        return "GeofenceEvent{type=" + this.read + ", geofence=" + this.RemoteActionCompatParcelizer + ", location=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
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
            boolean r2 = r5 instanceof o.r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r5 = (o.r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU) r5
            java.lang.Byte r2 = r5.read
            java.lang.Byte r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L38
        L1b:
            o.r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0 r2 = r5.RemoteActionCompatParcelizer
            o.r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0 r3 = r4.RemoteActionCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.equals(java.lang.Object):boolean");
    }
}
