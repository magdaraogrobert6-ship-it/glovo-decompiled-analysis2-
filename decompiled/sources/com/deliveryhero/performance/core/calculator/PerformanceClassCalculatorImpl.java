package com.deliveryhero.performance.core.calculator;

import android.app.Application;
import android.content.Context;
import androidx.cardview.widget.CardView$1;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowKt;
import o.InnerShadowRendererProviderCompanion;
import o.PlatformShadowContext;
import o.getOffsetRKDOV3M;
import o.isAdapterPositionOnScreen;
import o.lerpNonNull;
import o.performCustomExitMxy_nc0;
import o.transparentCopyui_graphics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class PerformanceClassCalculatorImpl {
    public final Extras$Key read;
    public final isAdapterPositionOnScreen serializer;
    public final CardView$1 write;

    public PerformanceClassCalculatorImpl(Application application) {
        Extras$Key extras$Key = new Extras$Key(15, new InnerShadowRendererProviderCompanion(application));
        CardView$1 cardView$1 = new CardView$1(extras$Key, 17, new CardView$1(application, extras$Key));
        application.getClass();
        this.read = extras$Key;
        this.write = cardView$1;
        this.serializer = new isAdapterPositionOnScreen(new SingleProcessDataStore$file$2(5, this));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d9 A[Catch: Exception -> 0x00eb, TryCatch #0 {Exception -> 0x00eb, blocks: (B:14:0x002f, B:19:0x003f, B:35:0x0096, B:37:0x009f, B:39:0x00a3, B:56:0x00d0, B:60:0x00db, B:57:0x00d3, B:58:0x00d6, B:59:0x00d9, B:22:0x0047, B:29:0x007a, B:31:0x007e, B:25:0x004e), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum load(ContinuationImpl continuationImpl) {
        transparentCopyui_graphics transparentcopyui_graphics;
        PerformanceClassCalculatorImpl performanceClassCalculatorImpl;
        lerpNonNull lerpnonnull;
        PerformanceClassCalculatorImpl performanceClassCalculatorImpl2;
        int i;
        int i2;
        if (continuationImpl instanceof transparentCopyui_graphics) {
            transparentcopyui_graphics = (transparentCopyui_graphics) continuationImpl;
            int i3 = transparentcopyui_graphics.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transparentcopyui_graphics.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                transparentcopyui_graphics = new transparentCopyui_graphics(this, continuationImpl);
            }
        } else {
            transparentcopyui_graphics = new transparentCopyui_graphics(this, continuationImpl);
        }
        Object objFirst = transparentcopyui_graphics.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = transparentcopyui_graphics.RemoteActionCompatParcelizer;
        int i5 = 1;
        try {
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirst);
                CardView$1 cardView$1 = this.write;
                transparentcopyui_graphics.serializer = this;
                transparentcopyui_graphics.RemoteActionCompatParcelizer = 1;
                CardView$1 cardView$2 = (CardView$1) cardView$1.IconCompatParcelizer;
                objFirst = FlowKt.first(new HeatmapDataStore$get$$inlined$map$1(((performCustomExitMxy_nc0) getOffsetRKDOV3M.serializer.getValue((Context) cardView$2.RemoteActionCompatParcelizer, getOffsetRKDOV3M.write[0])).serializer(), cardView$2, i5), transparentcopyui_graphics);
                if (objFirst != coroutineSingletons) {
                    performanceClassCalculatorImpl = this;
                }
            }
            if (i4 == 1) {
                performanceClassCalculatorImpl = (PerformanceClassCalculatorImpl) transparentcopyui_graphics.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lerpNonNull lerpnonnull2 = (lerpNonNull) transparentcopyui_graphics.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(objFirst);
                    return lerpnonnull2;
                }
                performanceClassCalculatorImpl = transparentcopyui_graphics.IconCompatParcelizer;
                performanceClassCalculatorImpl2 = (PerformanceClassCalculatorImpl) transparentcopyui_graphics.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            }
            PlatformShadowContext platformShadowContext = (PlatformShadowContext) objFirst;
            performanceClassCalculatorImpl.getClass();
            i = platformShadowContext.serializer;
            if (i > 0 || (i2 = platformShadowContext.RemoteActionCompatParcelizer) <= 0) {
                lerpnonnull = lerpNonNull.UNKNOWN;
            } else {
                long j = platformShadowContext.RatingCompat;
                if (j <= 0) {
                    lerpnonnull = lerpNonNull.UNKNOWN;
                } else if (i < 8 || i2 < 2000 || j < 4294967296L) {
                    lerpnonnull = lerpNonNull.LOW;
                } else {
                    lerpnonnull = (i2 < 2500 || (4294967296L <= j && j < 6442450944L)) ? lerpNonNull.MID : lerpNonNull.HIGH;
                }
            }
            CardView$1 cardView$3 = performanceClassCalculatorImpl2.write;
            transparentcopyui_graphics.serializer = lerpnonnull;
            transparentcopyui_graphics.IconCompatParcelizer = null;
            transparentcopyui_graphics.RemoteActionCompatParcelizer = 3;
            return cardView$3.store(lerpnonnull, transparentcopyui_graphics) == coroutineSingletons ? coroutineSingletons : lerpnonnull;
            lerpnonnull = (lerpNonNull) objFirst;
            if (lerpnonnull == null) {
                Extras$Key extras$Key = performanceClassCalculatorImpl.read;
                transparentcopyui_graphics.serializer = performanceClassCalculatorImpl;
                transparentcopyui_graphics.IconCompatParcelizer = performanceClassCalculatorImpl;
                transparentcopyui_graphics.RemoteActionCompatParcelizer = 2;
                extras$Key.getClass();
                objFirst = YieldKt.coroutineScope(new PerformanceMetaDataProviderImpl$loadMetaData$2(extras$Key, null), transparentcopyui_graphics);
                if (objFirst != coroutineSingletons) {
                    performanceClassCalculatorImpl2 = performanceClassCalculatorImpl;
                    PlatformShadowContext platformShadowContext2 = (PlatformShadowContext) objFirst;
                    performanceClassCalculatorImpl.getClass();
                    i = platformShadowContext2.serializer;
                    if (i > 0) {
                        lerpnonnull = lerpNonNull.UNKNOWN;
                    } else {
                        lerpnonnull = lerpNonNull.UNKNOWN;
                    }
                    CardView$1 cardView$4 = performanceClassCalculatorImpl2.write;
                    transparentcopyui_graphics.serializer = lerpnonnull;
                    transparentcopyui_graphics.IconCompatParcelizer = null;
                    transparentcopyui_graphics.RemoteActionCompatParcelizer = 3;
                    if (cardView$4.store(lerpnonnull, transparentcopyui_graphics) == coroutineSingletons) {
                    }
                }
            }
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to calculate performance class", new Object[0]);
            return lerpNonNull.UNKNOWN;
        }
    }
}
