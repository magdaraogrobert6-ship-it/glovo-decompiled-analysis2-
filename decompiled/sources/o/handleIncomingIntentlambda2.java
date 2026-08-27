package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class handleIncomingIntentlambda2 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final String serializer;

    public final int hashCode() {
        return (this.serializer.hashCode() ^ 16777619) * (-2128831035);
    }

    public handleIncomingIntentlambda2(r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k) {
        this.serializer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ANREvent{thread_dump="), this.serializer, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof handleIncomingIntentlambda2)) {
            return false;
        }
        Object obj2 = ((handleIncomingIntentlambda2) obj).serializer;
        String str = this.serializer;
        return str == obj2 || str.equals(obj2);
    }
}
