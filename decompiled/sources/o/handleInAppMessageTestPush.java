package o;

/* JADX INFO: loaded from: classes3.dex */
public final class handleInAppMessageTestPush implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte write;

    public final int hashCode() {
        return (this.write.hashCode() ^ 16777619) * (-2128831035);
    }

    public handleInAppMessageTestPush(r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm) {
        this.write = r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer;
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new StringBuilder("ActivityTransitionEvent{activity="), this.write, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof handleInAppMessageTestPush)) {
            return false;
        }
        Object obj2 = ((handleInAppMessageTestPush) obj).write;
        Byte b = this.write;
        return b == obj2 || b.equals(obj2);
    }
}
