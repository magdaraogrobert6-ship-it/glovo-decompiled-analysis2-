package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class parseFourDigits {
    public final long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final long serializer;

    public final long IconCompatParcelizer() {
        return this.read;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final long read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long serializer() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return Long.hashCode(this.IconCompatParcelizer) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.read), 31, this.serializer);
    }

    public parseFourDigits(long j, long j2, long j3, long j4) {
        this.RemoteActionCompatParcelizer = j;
        this.read = j2;
        this.serializer = j3;
        this.IconCompatParcelizer = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parseFourDigits)) {
            return false;
        }
        parseFourDigits parsefourdigits = (parseFourDigits) obj;
        return this.RemoteActionCompatParcelizer == parsefourdigits.RemoteActionCompatParcelizer && this.read == parsefourdigits.read && this.serializer == parsefourdigits.serializer && this.IconCompatParcelizer == parsefourdigits.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "ImageMetric(p50=", ", p75=");
        sbM.append(this.read);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", p95=", this.serializer, ", max=");
        return c8$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", sbM);
    }
}
