package o;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class getModulateAlphaNrFUSI {
    public static boolean serializer = true;

    public static void serializer(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            hasFocusableContent.serializer(viewGroup, z);
        } else if (serializer) {
            try {
                hasFocusableContent.serializer(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                serializer = false;
            }
        }
    }
}
