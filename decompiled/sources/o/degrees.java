package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class degrees extends DegreesKt {
    public static boolean MediaBrowserCompatMediaItem = true;
    public static boolean MediaDescriptionCompat = true;
    public static boolean read = true;
    public static boolean write = true;

    public void IconCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        if (read) {
            try {
                hasFocusableContent.serializer(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                read = false;
            }
        }
    }

    public void serializer(View view, android.graphics.Matrix matrix) {
        if (MediaDescriptionCompat) {
            try {
                getEpsilonslo4al4.read(view, matrix);
            } catch (NoSuchMethodError unused) {
                MediaDescriptionCompat = false;
            }
        }
    }

    public void serializer(ViewGroup viewGroup, android.graphics.Matrix matrix) {
        if (MediaBrowserCompatMediaItem) {
            try {
                getEpsilonslo4al4.serializer(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                MediaBrowserCompatMediaItem = false;
            }
        }
    }

    public void read(int i, View view) {
        if (Build.VERSION.SDK_INT != 28) {
            if (write) {
                try {
                    io.sentry.android.replay.util.MediaSessionCompatToken.RemoteActionCompatParcelizer(i, view);
                    return;
                } catch (NoSuchMethodError unused) {
                    write = false;
                    return;
                }
            }
            return;
        }
        if (!DegreesKt.IconCompatParcelizer) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                DegreesKt.RemoteActionCompatParcelizer = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            DegreesKt.IconCompatParcelizer = true;
        }
        Field field = DegreesKt.RemoteActionCompatParcelizer;
        if (field != null) {
            try {
                DegreesKt.RemoteActionCompatParcelizer.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused3) {
            }
        }
    }
}
