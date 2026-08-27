package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.extensions.ContextExtensionsKt$getCameraProvider$1;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.StretchedVideoResolutionQuirk;
import o.minIntrinsicWidth;
import o.onItemDismiss;
import o.runCachedlambda1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzsd {
    public static Canvas IconCompatParcelizer = null;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static CanvasDrawScope serializer;
    public static ImageBitmap write;

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Object getCameraProvider(Context context, ContinuationImpl continuationImpl) {
        ContextExtensionsKt$getCameraProvider$1 contextExtensionsKt$getCameraProvider$1;
        int i = 2 % 2;
        if (continuationImpl instanceof ContextExtensionsKt$getCameraProvider$1) {
            contextExtensionsKt$getCameraProvider$1 = (ContextExtensionsKt$getCameraProvider$1) continuationImpl;
            int i2 = contextExtensionsKt$getCameraProvider$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = RemoteActionCompatParcelizer + 15;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                contextExtensionsKt$getCameraProvider$1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                contextExtensionsKt$getCameraProvider$1 = new ContextExtensionsKt$getCameraProvider$1(continuationImpl);
            }
        } else {
            contextExtensionsKt$getCameraProvider$1 = new ContextExtensionsKt$getCameraProvider$1(continuationImpl);
        }
        Object orThrow = contextExtensionsKt$getCameraProvider$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = contextExtensionsKt$getCameraProvider$1.IconCompatParcelizer;
        if (i5 != 0) {
            int i6 = read + 125;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(orThrow);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(orThrow);
            contextExtensionsKt$getCameraProvider$1.IconCompatParcelizer = 1;
            SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(contextExtensionsKt$getCameraProvider$1), CoroutineSingletons.UNDECIDED);
            minIntrinsicWidth minintrinsicwidth = minIntrinsicWidth.IconCompatParcelizer;
            StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkWrite = zzpd.write(context);
            stretchedVideoResolutionQuirkWrite.RemoteActionCompatParcelizer(new runCachedlambda1(safeContinuation, stretchedVideoResolutionQuirkWrite, 1), context.getMainExecutor());
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == coroutineSingletons) {
                int i8 = RemoteActionCompatParcelizer + 89;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        }
        return ((onItemDismiss) orThrow).IconCompatParcelizer;
    }
}
