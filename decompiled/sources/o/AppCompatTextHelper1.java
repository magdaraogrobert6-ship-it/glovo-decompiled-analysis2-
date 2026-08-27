package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatTextHelper1 {
    public static boolean read(Context context) {
        return (context == null || context.getPackageManager() == null || !access101.read(context.getPackageManager())) ? false : true;
    }
}
