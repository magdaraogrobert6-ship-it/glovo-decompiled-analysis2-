package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setLocationCustomAttribute implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE write = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(22);
    public final String serializer;

    public setLocationCustomAttribute(r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k) {
        this.serializer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("AppID{app_id="), this.serializer, "}");
    }

    public final int hashCode() {
        String str = this.serializer;
        return ((str == null ? 0 : str.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setLocationCustomAttribute)) {
            return false;
        }
        Object obj2 = ((setLocationCustomAttribute) obj).serializer;
        String str = this.serializer;
        return str == obj2 || (str != null && str.equals(obj2));
    }
}
