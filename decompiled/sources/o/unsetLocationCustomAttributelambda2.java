package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class unsetLocationCustomAttributelambda2 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw read = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(18);
    public final String write;

    public unsetLocationCustomAttributelambda2(r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k) {
        this.write = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("InstallID{install_id="), this.write, "}");
    }

    public final int hashCode() {
        String str = this.write;
        return ((str == null ? 0 : str.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof unsetLocationCustomAttributelambda2)) {
            return false;
        }
        Object obj2 = ((unsetLocationCustomAttributelambda2) obj).write;
        String str = this.write;
        return str == obj2 || (str != null && str.equals(obj2));
    }
}
