package o;

/* JADX INFO: loaded from: classes3.dex */
public final class onActivityPausedlambda1 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte IconCompatParcelizer;

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035);
    }

    public onActivityPausedlambda1(r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm) {
        this.IconCompatParcelizer = r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer;
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new StringBuilder("LocationPermissionEvent{status="), this.IconCompatParcelizer, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof onActivityPausedlambda1)) {
            return false;
        }
        Object obj2 = ((onActivityPausedlambda1) obj).IconCompatParcelizer;
        Byte b = this.IconCompatParcelizer;
        return b == obj2 || b.equals(obj2);
    }
}
