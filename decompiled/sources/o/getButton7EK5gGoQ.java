package o;

import android.content.Context;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class getButton7EK5gGoQ {
    public static getButton7EK5gGoQ serializer;
    public final getButtonBEK5gGoQ IconCompatParcelizer;
    public final getButtonYEK5gGoQ read;
    public static final Object RemoteActionCompatParcelizer = new Object();
    public static final HashSet write = new HashSet(Arrays.asList("GET", "HEAD", "POST", "PUT"));

    public static getButton7EK5gGoQ write(Context context) {
        getButton7EK5gGoQ getbutton7ek5ggoq;
        synchronized (RemoteActionCompatParcelizer) {
            if (serializer == null) {
                serializer = new getButton7EK5gGoQ(context);
            }
            getbutton7ek5ggoq = serializer;
        }
        return getbutton7ek5ggoq;
    }

    public final void RemoteActionCompatParcelizer(String str, String str2, String str3, HashMap map, String str4) {
        if (str2 != null && !write.contains(str2)) {
            getButtonThumbLeftEK5gGoQ.serializer("Unsupport http method " + str2 + ". Drop the hit.");
            return;
        }
        if (getCalendarEK5gGoQ.IconCompatParcelizer().serializer != 2) {
            getButtonYEK5gGoQ getbuttonyek5ggoq = this.read;
            synchronized (getbuttonyek5ggoq.serializer) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                double dMin = getbuttonyek5ggoq.RemoteActionCompatParcelizer;
                if (dMin < 60.0d) {
                    double d = (jCurrentTimeMillis - getbuttonyek5ggoq.read) / 2000.0d;
                    if (d > 0.0d) {
                        dMin = Math.min(60.0d, dMin + d);
                        getbuttonyek5ggoq.RemoteActionCompatParcelizer = dMin;
                    }
                }
                getbuttonyek5ggoq.read = jCurrentTimeMillis;
                if (dMin < 1.0d) {
                    getButtonThumbLeftEK5gGoQ.serializer("No more tokens available.");
                    getButtonThumbLeftEK5gGoQ.serializer("Too many hits sent too quickly (rate throttled).");
                    return;
                }
                getbuttonyek5ggoq.RemoteActionCompatParcelizer = dMin - 1.0d;
            }
        }
        getButtonBEK5gGoQ getbuttonbek5ggoq = this.IconCompatParcelizer;
        getbuttonbek5ggoq.MediaDescriptionCompat.getClass();
        getbuttonbek5ggoq.read.add(new getButtonCEK5gGoQ(getbuttonbek5ggoq, getbuttonbek5ggoq, System.currentTimeMillis(), str, str2, str3, map, str4));
    }

    public getButton7EK5gGoQ(Context context) {
        if (getButtonBEK5gGoQ.serializer == null) {
            getButtonBEK5gGoQ.serializer = new getButtonBEK5gGoQ(context);
        }
        getButtonBEK5gGoQ getbuttonbek5ggoq = getButtonBEK5gGoQ.serializer;
        getButtonYEK5gGoQ getbuttonyek5ggoq = new getButtonYEK5gGoQ();
        this.IconCompatParcelizer = getbuttonbek5ggoq;
        this.read = getbuttonyek5ggoq;
    }
}
