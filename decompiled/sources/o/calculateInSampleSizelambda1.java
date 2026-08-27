package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class calculateInSampleSizelambda1 {
    public abstract Object serializer();

    public static final long serializer(long j, SnackbarHostKt snackbarHostKt) {
        return snackbarHostKt == SnackbarHostKt.Horizontal ? androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.Constraints.m3628getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m3627getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j)) : androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.Constraints.m3627getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j), androidx.compose.ui.unit.Constraints.m3628getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j));
    }

    public static long write(long j, SnackbarHostKt snackbarHostKt) {
        SnackbarHostKt snackbarHostKt2 = SnackbarHostKt.Horizontal;
        return androidx.compose.ui.unit.ConstraintsKt.Constraints(snackbarHostKt == snackbarHostKt2 ? androidx.compose.ui.unit.Constraints.m3628getMinWidthimpl(j) : androidx.compose.ui.unit.Constraints.m3627getMinHeightimpl(j), snackbarHostKt == snackbarHostKt2 ? androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) : androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j), snackbarHostKt == snackbarHostKt2 ? androidx.compose.ui.unit.Constraints.m3627getMinHeightimpl(j) : androidx.compose.ui.unit.Constraints.m3628getMinWidthimpl(j), snackbarHostKt == snackbarHostKt2 ? androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j) : androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j));
    }

    public static calculateInSampleSizelambda1 IconCompatParcelizer(Class cls) {
        try {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return new calculateInSampleSize(declaredConstructor, cls, 0);
            } catch (NoSuchMethodException unused) {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new calculateInSampleSizelambda2(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
            }
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new getBitmaplambda0(declaredMethod2, cls, iIntValue);
                } catch (Exception unused3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("cannot construct instances of ".concat(cls.getName()));
                    return null;
                }
            } catch (IllegalAccessException unused4) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
                return null;
            } catch (NoSuchMethodException unused5) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new calculateInSampleSize(declaredMethod3, cls, 1);
            } catch (InvocationTargetException e) {
                getRemoteBitmaplambda4.serializer(e);
                throw null;
            }
        } catch (IllegalAccessException unused6) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
            return null;
        }
    }

    public static long IconCompatParcelizer(int i, long j) {
        return androidx.compose.ui.unit.ConstraintsKt.Constraints(0, androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j), (i & 4) != 0 ? androidx.compose.ui.unit.Constraints.m3627getMinHeightimpl(j) : 0, androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j));
    }
}
