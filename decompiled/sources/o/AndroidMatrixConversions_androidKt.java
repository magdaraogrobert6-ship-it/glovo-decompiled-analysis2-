package o;

import android.app.Application;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class AndroidMatrixConversions_androidKt {
    public static final List RemoteActionCompatParcelizer = androidx.sqlite.SQLite.read(Application.class, getBitmapui_graphics.class);
    public static final List read;

    public static final androidx.lifecycle.ViewModel serializer(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (androidx.lifecycle.ViewModel) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(c8$$ExternalSyntheticOutline0.m(cls, "Failed to access "), e);
            return null;
        } catch (InstantiationException e2) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(d$$ExternalSyntheticOutline0.m(cls, "A ", " cannot be instantiated."), e2);
            return null;
        } catch (InvocationTargetException e3) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(c8$$ExternalSyntheticOutline0.m(cls, "An exception happened in constructor of "), e3.getCause());
            return null;
        }
    }

    public static final Constructor serializer(List list, Class cls) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listRatingCompat = onContentCardClicked.RatingCompat(parameterTypes);
            if (list.equals(listRatingCompat)) {
                return constructor;
            }
            if (list.size() == listRatingCompat.size() && listRatingCompat.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    static {
        int iSerializer = getQueryParameterslambda2.serializer();
        read = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{getBitmapui_graphics.class}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }
}
