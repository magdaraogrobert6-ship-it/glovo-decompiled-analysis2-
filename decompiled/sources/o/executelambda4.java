package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class executelambda4 {
    public static final HashMap write;
    public final HashMap serializer = new HashMap();
    public final ArrayList IconCompatParcelizer = new ArrayList();
    public final io.sentry.util.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new io.sentry.util.RemoteActionCompatParcelizer();
    public getIntentArrayWithConfiguredBackStacklambda3 MediaBrowserCompatMediaItem = null;
    public getIntentArrayWithConfiguredBackStacklambda3 RatingCompat = null;
    public getIntentArrayWithConfiguredBackStacklambda3 MediaSessionCompatQueueItem = null;
    public BannerDismissSnapshot read = null;

    static {
        HashMap map = new HashMap();
        write = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put(com.adjust.sdk.Constants.LONG, Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    public final void RemoteActionCompatParcelizer() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RemoteActionCompatParcelizer.serializer();
        try {
            Iterator it = this.serializer.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void RemoteActionCompatParcelizer(String str, Object obj) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RemoteActionCompatParcelizer.serializer();
        try {
            this.serializer.put(str, obj);
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Object read(Class cls, String str) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RemoteActionCompatParcelizer.serializer();
        try {
            Object obj = this.serializer.get(str);
            if (cls.isInstance(obj)) {
                uriActionExternalSyntheticLambda4Serializer.close();
                return obj;
            }
            Class cls2 = (Class) write.get(cls.getCanonicalName());
            if (obj == null || !cls.isPrimitive() || cls2 == null || !cls2.isInstance(obj)) {
                uriActionExternalSyntheticLambda4Serializer.close();
                return null;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
            return obj;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Object read(String str) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RemoteActionCompatParcelizer.serializer();
        try {
            Object obj = this.serializer.get(str);
            uriActionExternalSyntheticLambda4Serializer.close();
            return obj;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
