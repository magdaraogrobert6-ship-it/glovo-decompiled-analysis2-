package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class getClientcustomerchat_release {
    public final int read;
    public final byte[] serializer;

    public final int hashCode() {
        return this.read;
    }

    public getClientcustomerchat_release(byte[] bArr) {
        this.read = accessbootstrapIfNeeded.read(bArr);
        this.serializer = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getClientcustomerchat_release)) {
            return false;
        }
        return Arrays.equals(this.serializer, ((getClientcustomerchat_release) obj).serializer);
    }
}
