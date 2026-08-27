package o;

import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class setPhoneNumberlambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE RemoteActionCompatParcelizer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(16);
    public final setLineIdlambda20 serializer;
    public final setLastNamelambda0 write;

    public final int hashCode() {
        setLastNamelambda0 setlastnamelambda0 = this.write;
        int iHashCode = setlastnamelambda0 == null ? 0 : setlastnamelambda0.hashCode();
        setLineIdlambda20 setlineidlambda20 = this.serializer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (setlineidlambda20 != null ? setlineidlambda20.hashCode() : 0)) * (-2128831035);
    }

    public setPhoneNumberlambda0(IOParser$Decoder iOParser$Decoder) {
        this.write = (setLastNamelambda0) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.serializer = (setLineIdlambda20) iOParser$Decoder.read;
    }

    public final String toString() {
        return "SensorPropertyValue{message=" + this.write + ", info=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
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
            boolean r2 = r5 instanceof o.setPhoneNumberlambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setPhoneNumberlambda0 r5 = (o.setPhoneNumberlambda0) r5
            o.setLastNamelambda0 r2 = r5.write
            o.setLastNamelambda0 r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            o.setLineIdlambda20 r5 = r5.serializer
            o.setLineIdlambda20 r2 = r4.serializer
            if (r2 == r5) goto L2d
            if (r2 == 0) goto L2c
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            return r1
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPhoneNumberlambda0.equals(java.lang.Object):boolean");
    }
}
