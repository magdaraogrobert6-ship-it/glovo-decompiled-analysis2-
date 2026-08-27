package o;

import android.os.Bundle;
import com.roadrunner.web.presentation.authWebView.AuthWebFragment;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class getLayoutDirection {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final void RemoteActionCompatParcelizer(Throwable th, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            read(th, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            int i3 = 54 / 0;
        } else {
            read(th, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
        int i4 = RemoteActionCompatParcelizer + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static AuthWebFragment write(String str, String str2, String str3, r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs r8lambdagcpcuhbei3f7gmv4pjjfd18owys) {
        int i = 2 % 2;
        str.getClass();
        str2.getClass();
        str3.getClass();
        AuthWebFragment authWebFragment = new AuthWebFragment();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("url", str), new onViewAttachedToWindowlambda0("analytics_name", str3), new onViewAttachedToWindowlambda0(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, str2), new onViewAttachedToWindowlambda0("back_nav", r8lambdagcpcuhbei3f7gmv4pjjfd18owys.name())};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        authWebFragment.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
        int i2 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return authWebFragment;
    }

    public static final boolean read(Throwable th, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        List listAsList;
        Object objInvoke;
        int i = 2 % 2;
        th.getClass();
        Integer num = r8lambda7GmUMp17UWm7j4LNO1nwTjU10.read;
        androidx.compose.runtime.tooling.DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = r8lambdaAJV8kW28VZgFhlyTLNptIpMUvs.RemoteActionCompatParcelizer;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = instance_delegatelambda0.write;
            } else {
                int i2 = IconCompatParcelizer + 51;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            if (((Throwable) listAsList.get(i4)) instanceof androidx.compose.runtime.tooling.DiagnosticComposeException) {
                return false;
            }
        }
        try {
            BlurKtblur1 blurKtblur1 = (BlurKtblur1) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            if (blurKtblur1 != null) {
                int i5 = IconCompatParcelizer + 51;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    boolean z2 = blurKtblur1.read;
                    List list = blurKtblur1.write;
                    diagnosticComposeException.hashCode();
                    throw null;
                }
                boolean z3 = blurKtblur1.read;
                List list2 = blurKtblur1.write;
                if (z3) {
                    int size2 = list2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        int i7 = IconCompatParcelizer + 11;
                        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        if (((accessgetRectanglecp) list2.get(i6)).IconCompatParcelizer != null) {
                            z = true;
                            break;
                        }
                    }
                } else if (!list2.isEmpty()) {
                    z = true;
                    break;
                }
            }
            if (z) {
                blurKtblur1.getClass();
                diagnosticComposeException = new androidx.compose.runtime.tooling.DiagnosticComposeException(blurKtblur1);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            markOnScreenCardsAsReadlambda1.read(th, diagnosticComposeException);
        }
        return z;
    }
}
