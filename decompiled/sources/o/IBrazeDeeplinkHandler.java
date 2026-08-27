package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class IBrazeDeeplinkHandler implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE serializer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(25);
    public final String RemoteActionCompatParcelizer;

    public IBrazeDeeplinkHandler(r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k) {
        this.RemoteActionCompatParcelizer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("ThirdPartyID{third_party_id="), this.RemoteActionCompatParcelizer, "}");
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        return ((str == null ? 0 : str.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IBrazeDeeplinkHandler)) {
            return false;
        }
        Object obj2 = ((IBrazeDeeplinkHandler) obj).RemoteActionCompatParcelizer;
        String str = this.RemoteActionCompatParcelizer;
        return str == obj2 || (str != null && str.equals(obj2));
    }
}
