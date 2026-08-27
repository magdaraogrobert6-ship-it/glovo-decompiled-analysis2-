package o;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onStateChanged implements accessgetHandwritingSlopjd {
    public static final HashMap write = new HashMap();
    public static final Object read = new Object();

    public static onStateChanged write(Context context) {
        onStateChanged viewConfigurationDefaultImpls;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        synchronized (read) {
            HashMap map = write;
            viewConfigurationDefaultImpls = (onStateChanged) map.get(packageName);
            if (viewConfigurationDefaultImpls == null) {
                viewConfigurationDefaultImpls = new ViewConfigurationDefaultImpls(context, packageName);
                map.put(packageName, viewConfigurationDefaultImpls);
            }
        }
        return viewConfigurationDefaultImpls;
    }
}
