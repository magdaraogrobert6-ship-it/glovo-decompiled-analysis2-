package o;

import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionDialogFragment;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class getTolerance {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static OverlayPermissionDialogFragment write() {
        int i = 2 % 2;
        OverlayPermissionDialogFragment overlayPermissionDialogFragment = new OverlayPermissionDialogFragment();
        int i2 = read + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return overlayPermissionDialogFragment;
    }

    public static String write(Class cls) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        LinkedHashMap linkedHashMap = AndroidPathIterator.write;
        String strRemoteActionCompatParcelizer = (String) linkedHashMap.get(cls);
        if (strRemoteActionCompatParcelizer == null) {
            calculateSize calculatesize = (calculateSize) cls.getAnnotation(calculateSize.class);
            strRemoteActionCompatParcelizer = calculatesize != null ? calculatesize.RemoteActionCompatParcelizer() : null;
            if (strRemoteActionCompatParcelizer != null) {
                int i3 = read + 59;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (strRemoteActionCompatParcelizer.length() > 0) {
                    linkedHashMap.put(cls, strRemoteActionCompatParcelizer);
                }
            }
            DrawableTransformation.serializer((Object) "No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
            int i5 = read + 27;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        strRemoteActionCompatParcelizer.getClass();
        int i6 = RemoteActionCompatParcelizer + 111;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return strRemoteActionCompatParcelizer;
    }
}
