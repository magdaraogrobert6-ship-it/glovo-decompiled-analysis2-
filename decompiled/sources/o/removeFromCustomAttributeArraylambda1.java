package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class removeFromCustomAttributeArraylambda1 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final String write;

    public final int hashCode() {
        return (this.write.hashCode() ^ 16777619) * (-2128831035);
    }

    public removeFromCustomAttributeArraylambda1(r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k) {
        this.write = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("WifiInfo{ssid="), this.write, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof removeFromCustomAttributeArraylambda1)) {
            return false;
        }
        Object obj2 = ((removeFromCustomAttributeArraylambda1) obj).write;
        String str = this.write;
        return str == obj2 || str.equals(obj2);
    }
}
