package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class getProduct {
    public final byte[] IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;

    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.IconCompatParcelizer) ^ this.RemoteActionCompatParcelizer;
    }

    public getProduct(byte[] bArr, int i) {
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.RemoteActionCompatParcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getProduct)) {
            return false;
        }
        getProduct getproduct = (getProduct) obj;
        if (getproduct.RemoteActionCompatParcelizer != this.RemoteActionCompatParcelizer) {
            return false;
        }
        return Arrays.equals(this.IconCompatParcelizer, getproduct.IconCompatParcelizer);
    }
}
