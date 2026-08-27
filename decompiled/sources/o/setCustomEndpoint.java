package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomEndpoint implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final String RemoteActionCompatParcelizer;

    public setCustomEndpoint(r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k) {
        this.RemoteActionCompatParcelizer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("PersonID{person_id="), this.RemoteActionCompatParcelizer, "}");
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        return ((str == null ? 0 : str.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setCustomEndpoint)) {
            return false;
        }
        Object obj2 = ((setCustomEndpoint) obj).RemoteActionCompatParcelizer;
        String str = this.RemoteActionCompatParcelizer;
        return str == obj2 || (str != null && str.equals(obj2));
    }
}
