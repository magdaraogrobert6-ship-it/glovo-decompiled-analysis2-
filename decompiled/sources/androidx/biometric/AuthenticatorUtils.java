package androidx.biometric;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import com.roadrunner.delivery.inappcamera.extensions.ContextExtensionsKt$getCameraProvider$1;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.StretchedVideoResolutionQuirk;
import o.minIntrinsicWidth;
import o.onItemDismiss;
import o.runCachedlambda1;

/* JADX INFO: loaded from: classes.dex */
public abstract class AuthenticatorUtils {
    private static int read = 1;
    private static int write;

    public static boolean read(int i) {
        int i2 = 2 % 2;
        if ((i & Fields.CompositingStrategy) == 0) {
            return false;
        }
        int i3 = write + 9;
        int i4 = i3 % Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 37;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }

    public static boolean serializer(int i) {
        int i2 = 2 % 2;
        if (i != 15 && i != 255) {
            int i3 = write;
            int i4 = i3 + 1;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (i == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i != 32783) {
                int i5 = i3 + 57;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i != 33023) {
                    return i == 0;
                }
            } else {
                if (Build.VERSION.SDK_INT <= 29) {
                    return false;
                }
                int i7 = read + 47;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return true;
            }
        }
        int i9 = read + 49;
        write = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 93 / 0;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public static final Object getCameraProvider(Context context, ContinuationImpl continuationImpl) {
        ContextExtensionsKt$getCameraProvider$1 contextExtensionsKt$getCameraProvider$1;
        int i = 2 % 2;
        if (continuationImpl instanceof ContextExtensionsKt$getCameraProvider$1) {
            int i2 = read + 71;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            contextExtensionsKt$getCameraProvider$1 = (ContextExtensionsKt$getCameraProvider$1) continuationImpl;
            int i4 = contextExtensionsKt$getCameraProvider$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 63;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                contextExtensionsKt$getCameraProvider$1.serializer = i4 - Integer.MIN_VALUE;
            } else {
                contextExtensionsKt$getCameraProvider$1 = new ContextExtensionsKt$getCameraProvider$1(continuationImpl);
            }
        } else {
            contextExtensionsKt$getCameraProvider$1 = new ContextExtensionsKt$getCameraProvider$1(continuationImpl);
        }
        Object orThrow = contextExtensionsKt$getCameraProvider$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = contextExtensionsKt$getCameraProvider$1.serializer;
        if (i7 != 0) {
            int i8 = write + 23;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0 ? i7 != 1 : i7 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(orThrow);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(orThrow);
            contextExtensionsKt$getCameraProvider$1.serializer = 1;
            SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(contextExtensionsKt$getCameraProvider$1), CoroutineSingletons.UNDECIDED);
            minIntrinsicWidth minintrinsicwidth = minIntrinsicWidth.IconCompatParcelizer;
            StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkWrite = zzpd.write(context);
            stretchedVideoResolutionQuirkWrite.RemoteActionCompatParcelizer(new runCachedlambda1(safeContinuation, stretchedVideoResolutionQuirkWrite, 0), context.getMainExecutor());
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Object obj = ((onItemDismiss) orThrow).IconCompatParcelizer;
        int i9 = write + 39;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return obj;
        }
        throw null;
    }
}
