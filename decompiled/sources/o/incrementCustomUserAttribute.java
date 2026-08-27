package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class incrementCustomUserAttribute implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o IconCompatParcelizer = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(20);
    public final String read;

    public incrementCustomUserAttribute(r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k) {
        this.read = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("LocationID{location_id="), this.read, "}");
    }

    public final int hashCode() {
        String str = this.read;
        return ((str == null ? 0 : str.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof incrementCustomUserAttribute)) {
            return false;
        }
        Object obj2 = ((incrementCustomUserAttribute) obj).read;
        String str = this.read;
        return str == obj2 || (str != null && str.equals(obj2));
    }
}
