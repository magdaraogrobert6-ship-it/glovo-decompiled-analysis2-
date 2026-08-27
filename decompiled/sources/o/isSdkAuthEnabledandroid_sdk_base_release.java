package o;

/* JADX INFO: loaded from: classes3.dex */
public final class isSdkAuthEnabledandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte read;

    public final int hashCode() {
        return (this.read.hashCode() ^ 16777619) * (-2128831035);
    }

    public isSdkAuthEnabledandroid_sdk_base_release(r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm) {
        this.read = r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer;
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new StringBuilder("PowerMode{value="), this.read, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof isSdkAuthEnabledandroid_sdk_base_release)) {
            return false;
        }
        Object obj2 = ((isSdkAuthEnabledandroid_sdk_base_release) obj).read;
        Byte b = this.read;
        return b == obj2 || b.equals(obj2);
    }
}
