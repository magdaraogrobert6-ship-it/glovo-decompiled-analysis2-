package com.deliveryhero.perseus.hits.usecase;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusApp$init$1;
import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.di.TelemetryModule$runTelemetryUseCase$2$2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.accessgetIntersectcp;
import o.getStrokeLineWidth;
import o.onAddedToParentLayer;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setStroke;
import o.setStrokeAlpha;

/* JADX INFO: loaded from: classes2.dex */
public final class RunTelemetryUseCase {
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final PerseusApp$init$1 RemoteActionCompatParcelizer;
    public final accessgetIntersectcp read;
    public final accessgetIntersectcp serializer;
    public final TelemetryModule$runTelemetryUseCase$2$2 write;

    public RunTelemetryUseCase(PerseusApp$init$1 perseusApp$init$1, TelemetryModule$runTelemetryUseCase$2$2 telemetryModule$runTelemetryUseCase$2$2, accessgetIntersectcp accessgetintersectcp, onAddedToParentLayer onaddedtoparentlayer, accessgetIntersectcp accessgetintersectcp2) {
        onAddedToParentLayer onaddedtoparentlayer2 = new onAddedToParentLayer(29);
        this.RemoteActionCompatParcelizer = perseusApp$init$1;
        this.write = telemetryModule$runTelemetryUseCase$2$2;
        this.serializer = accessgetintersectcp;
        this.read = accessgetintersectcp2;
        this.IconCompatParcelizer = onaddedtoparentlayer2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object run(ContinuationImpl continuationImpl) {
        setStroke setstroke;
        long j;
        long telemetryDelay;
        if (continuationImpl instanceof setStroke) {
            setstroke = (setStroke) continuationImpl;
            int i = setstroke.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                setstroke.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                setstroke = new setStroke(this, continuationImpl);
            }
        } else {
            setstroke = new setStroke(this, continuationImpl);
        }
        Object objInvoke = setstroke.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setstroke.RemoteActionCompatParcelizer;
        try {
            try {
                if (i2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                    PerseusApp$init$1 perseusApp$init$1 = this.RemoteActionCompatParcelizer;
                    setstroke.serializer = 300L;
                    setstroke.RemoteActionCompatParcelizer = 1;
                    objInvoke = perseusApp$init$1.invoke(setstroke);
                    if (objInvoke == coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = setstroke.serializer;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                        this.serializer.invoke(new Integer(((Number) objInvoke).intValue()));
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = getStrokeLineWidth.write;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(null);
                        return new setStrokeAlpha(j, true);
                    } catch (Throwable th) {
                        th = th;
                        this.read.invoke(th);
                        getStrokeLineWidth.write.invoke(th);
                        return new setStrokeAlpha(j, false);
                    }
                }
                long j2 = setstroke.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                PerseusParamsConfig perseusParamsConfig = (PerseusParamsConfig) objInvoke;
                telemetryDelay = perseusParamsConfig.getTelemetryDelay();
                TelemetryModule$runTelemetryUseCase$2$2 telemetryModule$runTelemetryUseCase$2$2 = this.write;
                Object objInvoke2 = this.IconCompatParcelizer.invoke();
                Integer num = new Integer((int) perseusParamsConfig.getRetentionTime());
                setstroke.serializer = telemetryDelay;
                setstroke.RemoteActionCompatParcelizer = 2;
                objInvoke = telemetryModule$runTelemetryUseCase$2$2.invoke(objInvoke2, num, setstroke);
                if (objInvoke != coroutineSingletons) {
                    j = telemetryDelay;
                    this.serializer.invoke(new Integer(((Number) objInvoke).intValue()));
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = getStrokeLineWidth.write;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(null);
                    return new setStrokeAlpha(j, true);
                }
                return coroutineSingletons;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
            j = telemetryDelay;
        }
    }
}
