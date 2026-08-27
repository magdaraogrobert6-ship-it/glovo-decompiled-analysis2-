package o;

import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class setTitleOptional {
    public static final Method IconCompatParcelizer;
    public static final Field MediaDescriptionCompat;
    public static final boolean RemoteActionCompatParcelizer;
    public static final Field read;
    public static final Field serializer;
    public static final Field write;

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        boolean z;
        Field field4;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            z = false;
                            field4 = null;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                    field2 = null;
                    field3 = null;
                    z = false;
                    field4 = null;
                    if (z) {
                        IconCompatParcelizer = method;
                        serializer = field;
                        MediaDescriptionCompat = field2;
                        read = field3;
                        write = field4;
                        RemoteActionCompatParcelizer = true;
                        return;
                    }
                    IconCompatParcelizer = null;
                    serializer = null;
                    MediaDescriptionCompat = null;
                    read = null;
                    write = null;
                    RemoteActionCompatParcelizer = false;
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                field = null;
                field2 = null;
                field3 = null;
                z = false;
                field4 = null;
                if (z) {
                    IconCompatParcelizer = method;
                    serializer = field;
                    MediaDescriptionCompat = field2;
                    read = field3;
                    write = field4;
                    RemoteActionCompatParcelizer = true;
                    return;
                }
                IconCompatParcelizer = null;
                serializer = null;
                MediaDescriptionCompat = null;
                read = null;
                write = null;
                RemoteActionCompatParcelizer = false;
            }
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
            method = null;
        }
        if (z) {
            IconCompatParcelizer = method;
            serializer = field;
            MediaDescriptionCompat = field2;
            read = field3;
            write = field4;
            RemoteActionCompatParcelizer = true;
            return;
        }
        IconCompatParcelizer = null;
        serializer = null;
        MediaDescriptionCompat = null;
        read = null;
        write = null;
        RemoteActionCompatParcelizer = false;
    }

    public static android.graphics.Rect IconCompatParcelizer(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && RemoteActionCompatParcelizer) {
            try {
                Object objInvoke = IconCompatParcelizer.invoke(drawable, null);
                if (objInvoke != null) {
                    return new android.graphics.Rect(serializer.getInt(objInvoke), MediaDescriptionCompat.getInt(objInvoke), read.getInt(objInvoke), write.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return getNestedScrollAxes.write;
    }
}
