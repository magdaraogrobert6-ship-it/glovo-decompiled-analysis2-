package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setLanguagelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o write = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(15);
    public final String IconCompatParcelizer;

    public setLanguagelambda0(r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k) {
        this.IconCompatParcelizer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("SensorID{sensor_id="), this.IconCompatParcelizer, "}");
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        return ((str == null ? 0 : str.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setLanguagelambda0)) {
            return false;
        }
        Object obj2 = ((setLanguagelambda0) obj).IconCompatParcelizer;
        String str = this.IconCompatParcelizer;
        return str == obj2 || (str != null && str.equals(obj2));
    }
}
