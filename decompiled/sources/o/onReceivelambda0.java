package o;

import com.sentiance.core.model.events.ThriftBool;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class onReceivelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdabdldJQJZuyWL9zb_lMC8Pm4C2q8 read = new r8lambdabdldJQJZuyWL9zb_lMC8Pm4C2q8();
    public final Integer IconCompatParcelizer;
    public final ThriftBool serializer;

    public final int hashCode() {
        return (((this.serializer.hashCode() ^ 16777619) * (-2128831035)) ^ this.IconCompatParcelizer.hashCode()) * (-2128831035);
    }

    public onReceivelambda0(IOParser$Decoder iOParser$Decoder) {
        this.serializer = (ThriftBool) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = (Integer) iOParser$Decoder.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneUsageEvaluationEvent{is_phone_usage=");
        sb.append(this.serializer);
        sb.append(", duration_millis=");
        return IconCompatParcelizer.write(this.IconCompatParcelizer, "}", sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.onReceivelambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.onReceivelambda0 r5 = (o.onReceivelambda0) r5
            com.sentiance.core.model.events.ThriftBool r2 = r5.serializer
            com.sentiance.core.model.events.ThriftBool r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Integer r5 = r5.IconCompatParcelizer
            java.lang.Integer r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onReceivelambda0.equals(java.lang.Object):boolean");
    }
}
