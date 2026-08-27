package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.core.model.thrift.ExternalEventType;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TimeAction;

/* JADX INFO: loaded from: classes3.dex */
public final class setEmaillambda3 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setFirstNamelambda1 IconCompatParcelizer = new setFirstNamelambda1();
    public final String MediaMetadataCompat;
    public final TimeAction RemoteActionCompatParcelizer;
    public final String read;
    public final ExternalEventType serializer;
    public final Long write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        String str = this.read;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (str == null ? 0 : str.hashCode())) * (-2128831035)) ^ this.MediaMetadataCompat.hashCode()) * (-2128831035);
    }

    public setEmaillambda3(O$b o$b) {
        this.write = (Long) o$b.write;
        this.RemoteActionCompatParcelizer = (TimeAction) o$b.RemoteActionCompatParcelizer;
        this.serializer = (ExternalEventType) o$b.serializer;
        this.read = (String) o$b.read;
        this.MediaMetadataCompat = (String) o$b.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalEvent{timestamp=");
        sb.append(this.write);
        sb.append(", action=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", type=");
        sb.append(this.serializer);
        sb.append(", label=");
        sb.append(this.read);
        sb.append(", id=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaMetadataCompat, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r5 = r5.MediaMetadataCompat;
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
            boolean r2 = r5 instanceof o.setEmaillambda3
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setEmaillambda3 r5 = (o.setEmaillambda3) r5
            java.lang.Long r2 = r5.write
            java.lang.Long r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
        L1b:
            com.sentiance.core.model.thrift.TimeAction r2 = r5.RemoteActionCompatParcelizer
            com.sentiance.core.model.thrift.TimeAction r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
        L27:
            com.sentiance.core.model.thrift.ExternalEventType r2 = r5.serializer
            com.sentiance.core.model.thrift.ExternalEventType r3 = r4.serializer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
        L33:
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L41
            if (r3 == 0) goto L4e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4e
        L41:
            java.lang.String r5 = r5.MediaMetadataCompat
            java.lang.String r2 = r4.MediaMetadataCompat
            if (r2 == r5) goto L4f
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L4e
            goto L4f
        L4e:
            return r1
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setEmaillambda3.equals(java.lang.Object):boolean");
    }
}
