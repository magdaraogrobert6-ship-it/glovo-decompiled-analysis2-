package kotlin.collections.unsigned;

import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import io.grpc.LoadBalancer$Helper;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AndroidColorSpace_androidKt;
import o.accessisRenderNodeCompatiblecp;
import o.asComposeColorFilter;
import o.createFromParcel;
import o.getStrokeCapKaPHkGw;
import o.isItemDismissable;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setFromEL8BTi8;
import o.supportsColorMatrixQuery;
import o.toAndroidColorSpace;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UArraysKt {
    public static boolean RemoteActionCompatParcelizer(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean RemoteActionCompatParcelizer(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    public static boolean read(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean write(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, java.lang.Object, o.accessclearShadowCache] */
    public static final Object suspendWithStateAtLeastUnchecked(final supportsColorMatrixQuery supportscolormatrixquery, final toColorLong8_81llA tocolorlong8_81lla, boolean z, MainCoroutineDispatcher mainCoroutineDispatcher, final LayerUtils$getLayer$source$2 layerUtils$getLayer$source$2, HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$1) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(heatmapMapLayerUiModelImpl$1));
        cancellableContinuationImpl.read();
        ?? r7 = new toAndroidColorSpace() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // o.toAndroidColorSpace
            public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
                Object isitemdismissable;
                AndroidColorSpace_androidKt.Companion.getClass();
                AndroidColorSpace_androidKt androidColorSpace_androidKtSerializer = asComposeColorFilter.serializer(tocolorlong8_81lla);
                CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                supportsColorMatrixQuery supportscolormatrixquery2 = supportscolormatrixquery;
                if (androidColorSpace_androidKt != androidColorSpace_androidKtSerializer) {
                    if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
                        supportscolormatrixquery2.read(this);
                        cancellableContinuationImpl2.resumeWith(new isItemDismissable(new LifecycleDestroyedException(null)));
                        return;
                    }
                    return;
                }
                supportscolormatrixquery2.read(this);
                try {
                    layerUtils$getLayer$source$2.invoke();
                    isitemdismissable = createFromParcel.INSTANCE;
                } catch (Throwable th) {
                    isitemdismissable = new isItemDismissable(th);
                }
                cancellableContinuationImpl2.resumeWith(isitemdismissable);
            }
        };
        int i = 0;
        if (z) {
            mainCoroutineDispatcher.dispatch(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new setFromEL8BTi8(supportscolormatrixquery, r7, i));
        } else {
            supportscolormatrixquery.IconCompatParcelizer(r7);
        }
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new getStrokeCapKaPHkGw(mainCoroutineDispatcher, supportscolormatrixquery, r7, i));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }
}
