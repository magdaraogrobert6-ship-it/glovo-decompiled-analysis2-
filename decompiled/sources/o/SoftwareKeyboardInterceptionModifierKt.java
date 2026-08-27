package o;

import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzmb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SoftwareKeyboardInterceptionModifierKt extends getOnPreKeyEvent {
    private static final Map serializer = new ConcurrentHashMap();
    protected NestedScrollNode read;
    private int zzb;

    public static Object write(Method method, SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt, Object... objArr) {
        try {
            return method.invoke(softwareKeyboardInterceptionModifierKt, objArr);
        } catch (IllegalAccessException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public final zzmb ComponentDialog() {
        return (zzmb) RemoteActionCompatParcelizer(5);
    }

    public abstract Object RemoteActionCompatParcelizer(int i);

    public final zzmb getOnBackPressedDispatcherannotations() {
        zzmb zzmbVar = (zzmb) RemoteActionCompatParcelizer(5);
        zzmbVar.serializer(this);
        return zzmbVar;
    }

    public final boolean startActivityForResult() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public static SoftwareKeyboardInterceptionModifierKt RemoteActionCompatParcelizer(Class cls) {
        Map map = serializer;
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = (SoftwareKeyboardInterceptionModifierKt) map.get(cls);
        if (softwareKeyboardInterceptionModifierKt == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                softwareKeyboardInterceptionModifierKt = (SoftwareKeyboardInterceptionModifierKt) map.get(cls);
            } catch (ClassNotFoundException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (softwareKeyboardInterceptionModifierKt != null) {
            return softwareKeyboardInterceptionModifierKt;
        }
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt2 = (SoftwareKeyboardInterceptionModifierKt) ((SoftwareKeyboardInterceptionModifierKt) resetDispatcherFields.read(cls)).RemoteActionCompatParcelizer(6);
        if (softwareKeyboardInterceptionModifierKt2 != null) {
            map.put(cls, softwareKeyboardInterceptionModifierKt2);
            return softwareKeyboardInterceptionModifierKt2;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        return null;
    }

    public final void RemoteActionCompatParcelizer(KeyInputModifierKt keyInputModifierKt) {
        getDispatcher getdispatcherIconCompatParcelizer = setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(getClass());
        getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq = keyInputModifierKt.RemoteActionCompatParcelizer;
        if (getzenkakuhankaruek5ggoq == null) {
            getzenkakuhankaruek5ggoq = new getZenkakuHankaruEK5gGoQ(keyInputModifierKt);
        }
        getdispatcherIconCompatParcelizer.serializer(this, getzenkakuhankaruek5ggoq);
    }

    public final void setPictureInPictureParams() {
        setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(getClass()).IconCompatParcelizer(this);
        reportFullyDrawn();
    }

    public static void write(Class cls, SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt) {
        softwareKeyboardInterceptionModifierKt.reportFullyDrawn();
        serializer.put(cls, softwareKeyboardInterceptionModifierKt);
    }

    public SoftwareKeyboardInterceptionModifierKt() {
        this.IconCompatParcelizer = 0;
        this.zzb = -1;
        this.read = NestedScrollNode.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = getCalculateNestedScrollScopeui.read;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        getCalculateNestedScrollScopeui.IconCompatParcelizer(this, sb, 0);
        return sb.toString();
    }

    public final int hashCode() {
        if (startActivityForResult()) {
            return setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(getClass()).serializer(this);
        }
        int i = this.IconCompatParcelizer;
        if (i != 0) {
            return i;
        }
        int iSerializer = setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(getClass()).serializer(this);
        this.IconCompatParcelizer = iSerializer;
        return iSerializer;
    }

    public final void reportFullyDrawn() {
        this.zzb &= Integer.MAX_VALUE;
    }

    @Override // o.getOnPreKeyEvent
    public final int IconCompatParcelizer(getDispatcher getdispatcher) {
        if (startActivityForResult()) {
            int iSerializer = getdispatcher.serializer((getOnPreKeyEvent) this);
            if (iSerializer >= 0) {
                return iSerializer;
            }
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m(String.valueOf(iSerializer).length() + 42, iSerializer);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iSerializer2 = getdispatcher.serializer((getOnPreKeyEvent) this);
        if (iSerializer2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iSerializer2;
            return iSerializer2;
        }
        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m(String.valueOf(iSerializer2).length() + 42, iSerializer2);
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(getClass()).read(this, (SoftwareKeyboardInterceptionModifierKt) obj);
    }

    public final int getLifecycleRegistry1() {
        if (startActivityForResult()) {
            int iSerializer = setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(getClass()).serializer((getOnPreKeyEvent) this);
            if (iSerializer >= 0) {
                return iSerializer;
            }
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m(String.valueOf(iSerializer).length() + 42, iSerializer);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iSerializer2 = setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(getClass()).serializer((getOnPreKeyEvent) this);
        if (iSerializer2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iSerializer2;
            return iSerializer2;
        }
        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m(String.valueOf(iSerializer2).length() + 42, iSerializer2);
        return 0;
    }

    public final void r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }
}
