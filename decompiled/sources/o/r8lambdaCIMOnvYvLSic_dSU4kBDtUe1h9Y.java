package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y implements Comparable, Serializable {
    public static final r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y serializer = new r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y(0, 0);
    public final long RemoteActionCompatParcelizer;
    public final long write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y r8lambdacimonvyvlsic_dsu4kbdtue1h9y = (r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y) obj;
        r8lambdacimonvyvlsic_dsu4kbdtue1h9y.getClass();
        long j = r8lambdacimonvyvlsic_dsu4kbdtue1h9y.RemoteActionCompatParcelizer;
        long j2 = this.RemoteActionCompatParcelizer;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.write, r8lambdacimonvyvlsic_dsu4kbdtue1h9y.write);
    }

    public final int hashCode() {
        return Long.hashCode(this.RemoteActionCompatParcelizer ^ this.write);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        BrazeInAppMessageManagerunregisterInAppMessageManager3.serializer(this.RemoteActionCompatParcelizer, bArr, 0, 0, 4);
        bArr[8] = 45;
        BrazeInAppMessageManagerunregisterInAppMessageManager3.serializer(this.RemoteActionCompatParcelizer, bArr, 9, 4, 6);
        bArr[13] = 45;
        BrazeInAppMessageManagerunregisterInAppMessageManager3.serializer(this.RemoteActionCompatParcelizer, bArr, 14, 6, 8);
        bArr[18] = 45;
        BrazeInAppMessageManagerunregisterInAppMessageManager3.serializer(this.write, bArr, 19, 0, 2);
        bArr[23] = 45;
        BrazeInAppMessageManagerunregisterInAppMessageManager3.serializer(this.write, bArr, 24, 2, 8);
        return setCarryoverInAppMessage.RemoteActionCompatParcelizer(bArr);
    }

    public r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y(long j, long j2) {
        this.RemoteActionCompatParcelizer = j;
        this.write = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y)) {
            return false;
        }
        r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y r8lambdacimonvyvlsic_dsu4kbdtue1h9y = (r8lambdaCIMOnvYvLSic_dSU4kBDtUe1h9Y) obj;
        return this.RemoteActionCompatParcelizer == r8lambdacimonvyvlsic_dsu4kbdtue1h9y.RemoteActionCompatParcelizer && this.write == r8lambdacimonvyvlsic_dsu4kbdtue1h9y.write;
    }
}
