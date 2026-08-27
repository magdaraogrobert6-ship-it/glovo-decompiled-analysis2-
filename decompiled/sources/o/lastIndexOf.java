package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class lastIndexOf implements Comparable {
    public final byte[] write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        lastIndexOf lastindexof = (lastIndexOf) obj;
        byte[] bArr = this.write;
        int length = bArr.length;
        byte[] bArr2 = lastindexof.write;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = lastindexof.write[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.write);
    }

    public final String toString() {
        return TuplesKt.RemoteActionCompatParcelizer(this.write);
    }

    public lastIndexOf(byte[] bArr) {
        this.write = Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lastIndexOf) {
            return Arrays.equals(this.write, ((lastIndexOf) obj).write);
        }
        return false;
    }
}
