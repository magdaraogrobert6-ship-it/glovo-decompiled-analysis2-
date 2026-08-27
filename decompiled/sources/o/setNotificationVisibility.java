package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class setNotificationVisibility implements setPushDeliveryEnabled {
    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    @Override // o.setPushDeliveryEnabled
    public final boolean serializer(Context context, StackTraceElement stackTraceElement) {
        boolean z;
        boolean zContentEquals = stackTraceElement.getMethodName().contentEquals("onCreate");
        if (zContentEquals) {
            try {
                ComponentName componentName = new ComponentName(context.getPackageName(), stackTraceElement.getClassName());
                if ((Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getProviderInfo(componentName, PackageManager.ComponentInfoFlags.of(128L)) : context.getPackageManager().getProviderInfo(componentName, androidx.compose.ui.graphics.Fields.SpotShadowColor)) != null) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (PackageManager.NameNotFoundException | UnsupportedOperationException unused) {
            }
        } else {
            z = false;
        }
        return zContentEquals && z;
    }
}
