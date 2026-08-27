package kotlinx.coroutines.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import o.displayInAppMessagelambda1;
import o.isItemDismissable;

/* JADX INFO: loaded from: classes4.dex */
public final class ExceptionsConstructorKt {
    public static final int RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(Throwable.class, -1);

    static {
        try {
            int i = FastServiceLoaderKt.write;
            int i2 = WeakMapCtorCache.write;
        } catch (Throwable unused) {
            int i3 = WeakMapCtorCache.write;
        }
    }

    public static final int RemoteActionCompatParcelizer(Class cls, int i) {
        Object isitemdismissable;
        displayInAppMessagelambda1.serializer(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
        } while (cls != null);
        isitemdismissable = Integer.valueOf(i2);
        if (isitemdismissable instanceof isItemDismissable) {
            isitemdismissable = Integer.valueOf(i);
        }
        return ((Number) isitemdismissable).intValue();
    }
}
