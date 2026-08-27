package o;

import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class setRotationX {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public static volatile setRotationX serializer;
    public final int read;

    public static setRotationX read() {
        setRotationX setrotationx;
        synchronized (RemoteActionCompatParcelizer) {
            if (serializer == null) {
                serializer = new setRotationX(3);
            }
            setrotationx = serializer;
        }
        return setrotationx;
    }

    public setRotationX(int i) {
        this.read = i;
    }

    public final void IconCompatParcelizer(String str, String str2) {
        if (this.read <= 5) {
            SentryLogcatAdapter.IconCompatParcelizer(str, str2);
        }
    }

    public final void serializer(String str, String str2) {
        if (this.read <= 6) {
            SentryLogcatAdapter.serializer(str, str2);
        }
    }

    public static String IconCompatParcelizer(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void IconCompatParcelizer(String str, String str2, Throwable th) {
        if (this.read <= 6) {
            SentryLogcatAdapter.read(str, str2, th);
        }
    }
}
