package o;

import android.content.res.Configuration;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class isUnspecifiedFK8aYYsannotations {
    public static android.graphics.Typeface read(Configuration configuration, android.graphics.Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return android.graphics.Typeface.create(typeface, getActiveFocusTargetNode.RemoteActionCompatParcelizer(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
