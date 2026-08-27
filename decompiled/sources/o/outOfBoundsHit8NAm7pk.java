package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class outOfBoundsHit8NAm7pk implements Comparable {
    public final byte[] IconCompatParcelizer;
    public final byte[] RemoteActionCompatParcelizer;
    public final int read;
    public final visitNodes write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        outOfBoundsHit8NAm7pk outofboundshit8nam7pk = (outOfBoundsHit8NAm7pk) obj;
        int iCompare = Integer.compare(this.read, outofboundshit8nam7pk.read);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.write.compareTo(outofboundshit8nam7pk.write);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iIconCompatParcelizer = com.google.firebase.firestore.util.Util.IconCompatParcelizer(this.RemoteActionCompatParcelizer, outofboundshit8nam7pk.RemoteActionCompatParcelizer);
        return iIconCompatParcelizer != 0 ? iIconCompatParcelizer : com.google.firebase.firestore.util.Util.IconCompatParcelizer(this.IconCompatParcelizer, outofboundshit8nam7pk.IconCompatParcelizer);
    }

    public outOfBoundsHit8NAm7pk(int i, visitNodes visitnodes, byte[] bArr, byte[] bArr2) {
        this.read = i;
        if (visitnodes == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null documentKey");
            throw null;
        }
        this.write = visitnodes;
        if (bArr == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null arrayValue");
            throw null;
        }
        this.RemoteActionCompatParcelizer = bArr;
        if (bArr2 != null) {
            this.IconCompatParcelizer = bArr2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null directionalValue");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof outOfBoundsHit8NAm7pk)) {
            return false;
        }
        outOfBoundsHit8NAm7pk outofboundshit8nam7pk = (outOfBoundsHit8NAm7pk) obj;
        return this.read == outofboundshit8nam7pk.read && this.write.equals(outofboundshit8nam7pk.write) && Arrays.equals(this.RemoteActionCompatParcelizer, outofboundshit8nam7pk.RemoteActionCompatParcelizer) && Arrays.equals(this.IconCompatParcelizer, outofboundshit8nam7pk.IconCompatParcelizer);
    }

    public final String toString() {
        return "IndexEntry{indexId=" + this.read + ", documentKey=" + this.write + ", arrayValue=" + Arrays.toString(this.RemoteActionCompatParcelizer) + ", directionalValue=" + Arrays.toString(this.IconCompatParcelizer) + "}";
    }

    public final int hashCode() {
        int i = this.read;
        int iHashCode = this.write.RemoteActionCompatParcelizer.hashCode();
        return ((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ Arrays.hashCode(this.RemoteActionCompatParcelizer)) * 1000003) ^ Arrays.hashCode(this.IconCompatParcelizer);
    }
}
