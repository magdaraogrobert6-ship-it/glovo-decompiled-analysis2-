package o;

/* JADX INFO: loaded from: classes3.dex */
public final class isPushWakeScreenForNotificationEnabledandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte serializer;

    public final int hashCode() {
        return (this.serializer.hashCode() ^ 16777619) * (-2128831035);
    }

    public isPushWakeScreenForNotificationEnabledandroid_sdk_base_release(r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm) {
        this.serializer = r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer;
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new StringBuilder("FlightMode{value="), this.serializer, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof isPushWakeScreenForNotificationEnabledandroid_sdk_base_release)) {
            return false;
        }
        Object obj2 = ((isPushWakeScreenForNotificationEnabledandroid_sdk_base_release) obj).serializer;
        Byte b = this.serializer;
        return b == obj2 || b.equals(obj2);
    }
}
