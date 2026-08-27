package o;

import io.sentry.android.core.SentryLogcatAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class invalidateIntrinsicsParent {
    public final int serializer;
    public final HashMap IconCompatParcelizer = new HashMap();
    public final int write = 64;

    public final void serializer(Map map) {
        synchronized (this) {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strIconCompatParcelizer = IconCompatParcelizer(this.serializer, str);
                if (this.IconCompatParcelizer.size() < this.write || this.IconCompatParcelizer.containsKey(strIconCompatParcelizer)) {
                    String str2 = (String) entry.getValue();
                    this.IconCompatParcelizer.put(strIconCompatParcelizer, str2 == null ? "" : IconCompatParcelizer(this.serializer, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                SentryLogcatAdapter.write("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.write, null);
            }
        }
    }

    public static String IconCompatParcelizer(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r1.equals(r5) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean serializer(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.serializer     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = IconCompatParcelizer(r0, r5)     // Catch: java.lang.Throwable -> L62
            java.util.HashMap r1 = r4.IconCompatParcelizer     // Catch: java.lang.Throwable -> L62
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L62
            int r2 = r4.write     // Catch: java.lang.Throwable -> L62
            r3 = 0
            if (r1 < r2) goto L3b
            java.util.HashMap r1 = r4.IconCompatParcelizer     // Catch: java.lang.Throwable -> L62
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L1b
            goto L3b
        L1b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "Ignored entry \""
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L62
            r6.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "\" when adding custom keys. Maximum allowable: "
            r6.append(r5)     // Catch: java.lang.Throwable -> L62
            int r5 = r4.write     // Catch: java.lang.Throwable -> L62
            r6.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "FirebaseCrashlytics"
            r0 = 0
            io.sentry.android.core.SentryLogcatAdapter.write(r6, r5, r0)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r4)
            return r3
        L3b:
            int r5 = r4.serializer     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = IconCompatParcelizer(r5, r6)     // Catch: java.lang.Throwable -> L62
            java.util.HashMap r1 = r4.IconCompatParcelizer     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L4e
            if (r5 != 0) goto L56
            goto L54
        L4e:
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L56
        L54:
            monitor-exit(r4)
            return r3
        L56:
            java.util.HashMap r1 = r4.IconCompatParcelizer     // Catch: java.lang.Throwable -> L62
            if (r6 != 0) goto L5c
            java.lang.String r5 = ""
        L5c:
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r4)
            r5 = 1
            return r5
        L62:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L62
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.invalidateIntrinsicsParent.serializer(java.lang.String, java.lang.String):boolean");
    }

    public invalidateIntrinsicsParent(int i) {
        this.serializer = i;
    }
}
