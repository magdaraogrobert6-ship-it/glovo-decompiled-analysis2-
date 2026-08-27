package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttributelambda5 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte RemoteActionCompatParcelizer;

    public setCustomUserAttributelambda5(r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm) {
        this.RemoteActionCompatParcelizer = r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer;
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new StringBuilder("Discard{reason="), this.RemoteActionCompatParcelizer, "}");
    }

    public final int hashCode() {
        Byte b = this.RemoteActionCompatParcelizer;
        return ((b == null ? 0 : b.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setCustomUserAttributelambda5)) {
            return false;
        }
        Object obj2 = ((setCustomUserAttributelambda5) obj).RemoteActionCompatParcelizer;
        Byte b = this.RemoteActionCompatParcelizer;
        return b == obj2 || (b != null && b.equals(obj2));
    }
}
