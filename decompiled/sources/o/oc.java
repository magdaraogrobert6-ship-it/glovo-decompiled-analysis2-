package o;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class oc {
    private static int read = 0;
    private static int serializer = 1;
    public final Application IconCompatParcelizer;

    public oc(Application application) {
        this.IconCompatParcelizer = application;
    }

    public final String read() {
        String packageName;
        int i = 2 % 2;
        ComponentName componentNameResolveActivity = new Intent("android.intent.action.VIEW", Uri.parse("geo:0.0?q=0,0")).resolveActivity(this.IconCompatParcelizer.getPackageManager());
        Object obj = null;
        if (componentNameResolveActivity != null) {
            packageName = componentNameResolveActivity.getPackageName();
            int i2 = serializer + 43;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 3 / 4;
            }
        } else {
            packageName = null;
        }
        if (componentNameResolveActivity != null) {
            int i4 = read + 55;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                String className = componentNameResolveActivity.getClassName();
                if (className != null && (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) className, (CharSequence) "com.android.internal.app.ResolverActivity", false))) {
                    int i5 = read + 43;
                    serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return packageName;
                    }
                    obj.hashCode();
                    throw null;
                }
            } else {
                componentNameResolveActivity.getClassName();
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }
}
