package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class handleIncomingIntent implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final String IconCompatParcelizer;

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035);
    }

    public handleIncomingIntent(r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k) {
        this.IconCompatParcelizer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("WifiInfo{ssid="), this.IconCompatParcelizer, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof handleIncomingIntent)) {
            return false;
        }
        Object obj2 = ((handleIncomingIntent) obj).IconCompatParcelizer;
        String str = this.IconCompatParcelizer;
        return str == obj2 || str.equals(obj2);
    }
}
