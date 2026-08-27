package o;

import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzz;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class NestedScrollConnectionDefaultImpls {
    public final zzz RemoteActionCompatParcelizer;

    public static void RemoteActionCompatParcelizer(KeyInputModifierKt keyInputModifierKt, zzz zzzVar, Object obj, Object obj2) throws zzll {
        KeyInputNode.RemoteActionCompatParcelizer(keyInputModifierKt, (getNestedCoroutineScope) zzzVar.IconCompatParcelizer, 1, obj);
        KeyInputNode.RemoteActionCompatParcelizer(keyInputModifierKt, (getNestedCoroutineScope) zzzVar.write, 2, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    /* JADX WARN: Code duplicated, block: B:44:0x0121  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125  */
    /* JADX WARN: Code duplicated, block: B:47:0x0135  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0153  */
    /* JADX WARN: Code duplicated, block: B:52:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x0164  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:55:0x017d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    /* JADX WARN: Code duplicated, block: B:58:0x018c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0194  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fe  */
    public static int read(zzz zzzVar, Object obj, Object obj2) {
        int iIconCompatParcelizer;
        int iRemoteActionCompatParcelizer;
        int iIconCompatParcelizer2;
        int iIconCompatParcelizer3;
        int iRemoteActionCompatParcelizer2;
        int iIconCompatParcelizer4;
        getNestedCoroutineScope getnestedcoroutinescope = (getNestedCoroutineScope) zzzVar.IconCompatParcelizer;
        getNestedCoroutineScope getnestedcoroutinescope2 = (getNestedCoroutineScope) zzzVar.write;
        int i = KeyInputNode.RemoteActionCompatParcelizer;
        int iIconCompatParcelizer5 = 8;
        int iIconCompatParcelizer6 = KeyInputModifierKt.IconCompatParcelizer(8);
        getNestedCoroutineScope getnestedcoroutinescope3 = getNestedCoroutineScope.zzj;
        if (getnestedcoroutinescope == getnestedcoroutinescope3) {
            Charset charset = accessonPreScrollOzD1aCkjd.write;
            iIconCompatParcelizer6 += iIconCompatParcelizer6;
        }
        getParentConnection getparentconnection = getParentConnection.INT;
        switch (getnestedcoroutinescope.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iIconCompatParcelizer = 8;
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset2 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue + iIntValue) ^ (iIntValue >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue + jLongValue) ^ (jLongValue >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 1:
                ((Float) obj).getClass();
                iIconCompatParcelizer = 4;
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset3 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue2 + iIntValue2) ^ (iIntValue2 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue2 + jLongValue2) ^ (jLongValue2 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 2:
                iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(((Long) obj).longValue());
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset4 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue3 + iIntValue3) ^ (iIntValue3 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue3 + jLongValue3) ^ (jLongValue3 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 3:
                iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(((Long) obj).longValue());
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset5 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue4 + iIntValue4) ^ (iIntValue4 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue4 + jLongValue4) ^ (jLongValue4 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 4:
                iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj).intValue());
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset6 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue5 + iIntValue5) ^ (iIntValue5 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue5 + jLongValue5) ^ (jLongValue5 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 5:
                ((Long) obj).getClass();
                iIconCompatParcelizer = 8;
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset7 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue6 + iIntValue6) ^ (iIntValue6 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue6 + jLongValue6) ^ (jLongValue6 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 6:
                ((Integer) obj).getClass();
                iIconCompatParcelizer = 4;
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset8 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue7 + iIntValue7) ^ (iIntValue7 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue7 + jLongValue7) ^ (jLongValue7 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 7:
                ((Boolean) obj).getClass();
                iIconCompatParcelizer = 1;
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset9 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue8 + iIntValue8) ^ (iIntValue8 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue8 + jLongValue8) ^ (jLongValue8 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 8:
                if (obj instanceof onPreviewKeyEvent) {
                    iRemoteActionCompatParcelizer = ((onPreviewKeyEvent) obj).RemoteActionCompatParcelizer();
                    iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                    iIconCompatParcelizer = iRemoteActionCompatParcelizer + iIconCompatParcelizer2;
                } else {
                    iIconCompatParcelizer = KeyInputModifierKt.write((String) obj);
                }
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset10 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue9 + iIntValue9) ^ (iIntValue9 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue9 + jLongValue9) ^ (jLongValue9 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 9:
                iIconCompatParcelizer = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj)).getLifecycleRegistry1();
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset11 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue10 + iIntValue10) ^ (iIntValue10 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue10 + jLongValue10) ^ (jLongValue10 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 10:
                iRemoteActionCompatParcelizer = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj)).getLifecycleRegistry1();
                iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                iIconCompatParcelizer = iRemoteActionCompatParcelizer + iIconCompatParcelizer2;
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset12 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue11 + iIntValue11) ^ (iIntValue11 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue11 + jLongValue11) ^ (jLongValue11 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 11:
                if (obj instanceof onPreviewKeyEvent) {
                    iRemoteActionCompatParcelizer = ((onPreviewKeyEvent) obj).RemoteActionCompatParcelizer();
                    iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                } else {
                    iRemoteActionCompatParcelizer = ((byte[]) obj).length;
                    iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                }
                iIconCompatParcelizer = iRemoteActionCompatParcelizer + iIconCompatParcelizer2;
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset13 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue12 + iIntValue12) ^ (iIntValue12 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue12 + jLongValue12) ^ (jLongValue12 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 12:
                iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj).intValue());
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset14 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue13 + iIntValue13) ^ (iIntValue13 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue13 + jLongValue13) ^ (jLongValue13 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 13:
                iIconCompatParcelizer = obj instanceof accessonPostFlingRZ2iAVYjd ? KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj).zza()) : KeyInputModifierKt.IconCompatParcelizer(((Integer) obj).intValue());
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset15 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue14 + iIntValue14) ^ (iIntValue14 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue14 + jLongValue14) ^ (jLongValue14 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 14:
                ((Integer) obj).getClass();
                iIconCompatParcelizer = 4;
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset16 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue15 + iIntValue15) ^ (iIntValue15 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue15 + jLongValue15) ^ (jLongValue15 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 15:
                ((Long) obj).getClass();
                iIconCompatParcelizer = 8;
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset17 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue16 + iIntValue16) ^ (iIntValue16 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue16 + jLongValue16) ^ (jLongValue16 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer((iIntValue17 + iIntValue17) ^ (iIntValue17 >> 31));
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset18 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue18 + iIntValue18) ^ (iIntValue18 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue17 + jLongValue17) ^ (jLongValue17 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer((jLongValue18 + jLongValue18) ^ (jLongValue18 >> 63));
                iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(16);
                if (getnestedcoroutinescope2 == getnestedcoroutinescope3) {
                    Charset charset19 = accessonPreScrollOzD1aCkjd.write;
                    iIconCompatParcelizer3 += iIconCompatParcelizer3;
                }
                switch (getnestedcoroutinescope2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 1:
                        ((Float) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 2:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 3:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Long) obj2).longValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 4:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 5:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 6:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iIconCompatParcelizer5 = 1;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 8:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                            iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.write((String) obj2);
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 9:
                        iIconCompatParcelizer5 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 10:
                        iRemoteActionCompatParcelizer2 = ((SoftwareKeyboardInterceptionModifierKt) ((getOnPreKeyEvent) obj2)).getLifecycleRegistry1();
                        iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 11:
                        if (obj2 instanceof onPreviewKeyEvent) {
                            iRemoteActionCompatParcelizer2 = ((onPreviewKeyEvent) obj2).RemoteActionCompatParcelizer();
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        } else {
                            iRemoteActionCompatParcelizer2 = ((byte[]) obj2).length;
                            iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
                        }
                        iIconCompatParcelizer5 = iIconCompatParcelizer4 + iRemoteActionCompatParcelizer2;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 12:
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 13:
                        if (obj2 instanceof accessonPostFlingRZ2iAVYjd) {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((accessonPostFlingRZ2iAVYjd) obj2).zza());
                        } else {
                            iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(((Integer) obj2).intValue());
                        }
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 14:
                        ((Integer) obj2).getClass();
                        iIconCompatParcelizer5 = 4;
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 15:
                        ((Long) obj2).getClass();
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((iIntValue19 + iIntValue19) ^ (iIntValue19 >> 31));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer((jLongValue19 + jLongValue19) ^ (jLongValue19 >> 63));
                        return iIconCompatParcelizer5 + iIconCompatParcelizer3 + iIconCompatParcelizer + iIconCompatParcelizer6;
                    default:
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            default:
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public NestedScrollConnectionDefaultImpls(getNestedCoroutineScope getnestedcoroutinescope, getNestedCoroutineScope getnestedcoroutinescope2) {
        this.RemoteActionCompatParcelizer = new zzz(getnestedcoroutinescope, getnestedcoroutinescope2);
    }
}
