package androidx.compose.ui.tooling;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.accessgetInstancedelegatecp;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getInAppMessageStackannotations;
import o.getSidePaddingValue;
import o.onItemDismisslambda0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public final class ComposableInvoker {
    public static final int $stable = 0;
    private static final int BITS_PER_INT = 31;
    public static final ComposableInvoker INSTANCE = new ComposableInvoker();
    private static final int SLOTS_PER_INT = 10;

    private ComposableInvoker() {
    }

    private final boolean areParameterTypesCompatible(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            int length = clsArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    break;
                }
                Class<?> cls = clsArr[i];
                Class<?> cls2 = clsArr2[i2];
                if (!Options.Companion.read(cls).equals(Options.Companion.read(cls2)) && !cls.isAssignableFrom(cls2)) {
                    z = false;
                }
                arrayList.add(Boolean.valueOf(z));
                i++;
                i2++;
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final <T> T[] dup(T t, int i) {
        Object[] objArr = {0, Integer.valueOf(i)};
        int iWrite = BackspaceCommand.write();
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, 10));
        Iterator<T> it = ensuresubscribedtoinappmessageeventslambda7.iterator();
        while (it.hasNext()) {
            ((getSidePaddingValue) it).RemoteActionCompatParcelizer();
            arrayList.add(t);
        }
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }

    private final Method findComposableMethod(Class<?> cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int iChangedParamCount = changedParamCount(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(iChangedParamCount)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, 10));
                getInAppMessageStackannotations it = ensuresubscribedtoinappmessageeventslambda7.iterator();
                while (it.RemoteActionCompatParcelizer) {
                    it.RemoteActionCompatParcelizer();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0(3);
                ArrayList arrayList3 = applydisplaycutoutmarginstocontentarealambda0.write;
                applydisplaycutoutmarginstocontentarealambda0.serializer(clsArr);
                applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(getBirthDateFull.class);
                applydisplaycutoutmarginstocontentarealambda0.serializer(clsArr2);
                return findCompatibleComposeMethod(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{method.getName(), str}, getCieXyz.write())).booleanValue()) {
                    if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(method.getName(), str + '-', false)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    private final int defaultParamCount(int i) {
        return (int) Math.ceil(((double) i) / 31.0d);
    }

    private final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                return !name.equals("int") ? null : 0;
            case 3039496:
                return !name.equals("byte") ? null : (byte) 0;
            case 3052374:
                return !name.equals("char") ? null : (char) 0;
            case 3327612:
                return !name.equals(Constants.LONG) ? null : 0L;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                return !name.equals("short") ? null : (short) 0;
            default:
                return null;
        }
    }

    private final Object invokeComposableMethod(Method method, Object obj, getBirthDateFull getbirthdatefull, Object... objArr) {
        Object defaultValue;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i = length - 1;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{parameterTypes[length], getBirthDateFull.class}, getCieXyz.write())).booleanValue()) {
                break;
            }
            if (i < 0) {
                length = -1;
                break;
            }
            length = i;
        }
        int i2 = length + 1;
        int iChangedParamCount = changedParamCount(length, obj == null ? 0 : 1) + i2;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iChangedParamCount ? defaultParamCount(length) : 0) + iChangedParamCount != length2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("params don't add up to total params");
            return null;
        }
        Object[] objArr2 = new Object[length2];
        int i3 = 0;
        while (i3 < length2) {
            if (i3 >= 0 && i3 < length) {
                defaultValue = (i3 < 0 || i3 >= objArr.length) ? INSTANCE.getDefaultValue(method.getParameterTypes()[i3]) : objArr[i3];
            } else if (i3 == length) {
                defaultValue = getbirthdatefull;
            } else if (i2 <= i3 && i3 < iChangedParamCount) {
                defaultValue = 0;
            } else {
                if (iChangedParamCount > i3 || i3 >= length2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Unexpected index");
                    return null;
                }
                defaultValue = 2097151;
            }
            objArr2[i3] = defaultValue;
            i3++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x004c  */
    private final Method findCompatibleComposeMethod(Method[] methodArr, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Method method : methodArr) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, method.getName()}, getCieXyz.write())).booleanValue()) {
                if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(method.getName(), str + '-', false)) {
                    continue;
                } else if (INSTANCE.areParameterTypesCompatible(method.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                    if (method != null) {
                        return method;
                    }
                    throw new NoSuchMethodException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, " not found"));
                }
            } else if (INSTANCE.areParameterTypesCompatible(method.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                if (method != null) {
                    return method;
                }
                throw new NoSuchMethodException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, " not found"));
            }
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, " not found"));
    }

    @ExperimentalComposeUiApi
    public final void invokeComposable(String str, String str2, getBirthDateFull getbirthdatefull, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method methodFindComposableMethod = findComposableMethod(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodFindComposableMethod != null) {
                methodFindComposableMethod.setAccessible(true);
                if (Modifier.isStatic(methodFindComposableMethod.getModifiers())) {
                    invokeComposableMethod(methodFindComposableMethod, null, getbirthdatefull, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    invokeComposableMethod(methodFindComposableMethod, cls.getConstructor(null).newInstance(null), getbirthdatefull, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e) {
            PreviewLogger.Companion.logWarning$ui_tooling$default(PreviewLogger.Companion, "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null, 2, null);
            throw e;
        }
    }

    private final int changedParamCount(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i + i2)) / 10.0d);
    }
}
