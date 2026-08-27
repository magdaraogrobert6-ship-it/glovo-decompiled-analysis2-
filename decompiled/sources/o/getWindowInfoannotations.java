package o;

import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class getWindowInfoannotations {
    public static volatile getWindowInfoannotations serializer;
    public final accessgetVcp read;
    public boolean write = false;

    public getWindowInfoannotations() {
        accessgetVcp accessgetvcp;
        synchronized (accessgetVcp.class) {
            if (accessgetVcp.read == null) {
                accessgetVcp.read = new accessgetVcp(1);
            }
            accessgetvcp = accessgetVcp.read;
        }
        this.read = accessgetvcp;
    }

    public static getWindowInfoannotations write() {
        if (serializer == null) {
            synchronized (getWindowInfoannotations.class) {
                if (serializer == null) {
                    serializer = new getWindowInfoannotations();
                }
            }
        }
        return serializer;
    }

    public final void IconCompatParcelizer(String str, Object... objArr) {
        if (this.write) {
            String.format(java.util.Locale.ENGLISH, str, objArr);
            this.read.getClass();
        }
    }

    public final void RemoteActionCompatParcelizer(String str, Object... objArr) {
        if (this.write) {
            String.format(java.util.Locale.ENGLISH, str, objArr);
            this.read.getClass();
        }
    }

    public final void read(String str, Object... objArr) {
        if (this.write) {
            String str2 = String.format(java.util.Locale.ENGLISH, str, objArr);
            this.read.getClass();
            SentryLogcatAdapter.serializer("FirebasePerformance", str2);
        }
    }

    public final void write(String str, Object... objArr) {
        if (this.write) {
            String str2 = String.format(java.util.Locale.ENGLISH, str, objArr);
            this.read.getClass();
            SentryLogcatAdapter.IconCompatParcelizer("FirebasePerformance", str2);
        }
    }

    public final void read() {
        if (this.write) {
            this.read.getClass();
        }
    }

    public final void read(String str) {
        if (this.write) {
            this.read.getClass();
            SentryLogcatAdapter.IconCompatParcelizer("FirebasePerformance", str);
        }
    }
}
