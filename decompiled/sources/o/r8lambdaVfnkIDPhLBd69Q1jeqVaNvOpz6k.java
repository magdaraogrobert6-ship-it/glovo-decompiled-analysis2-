package o;

import android.app.job.JobInfo;
import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k {
    public static float RemoteActionCompatParcelizer(float f) {
        return (float) (((double) f) / 9.800000190734863d);
    }

    public static short serializer(float f) {
        float f2 = (f * 1000.0f) / 10.0f;
        if (f2 > 32767.0f) {
            return Short.MAX_VALUE;
        }
        if (f2 < -32768.0f) {
            return Short.MIN_VALUE;
        }
        return (short) f2;
    }

    public static final void read(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.getClass();
        builder.setRequiredNetwork(networkRequest);
    }
}
