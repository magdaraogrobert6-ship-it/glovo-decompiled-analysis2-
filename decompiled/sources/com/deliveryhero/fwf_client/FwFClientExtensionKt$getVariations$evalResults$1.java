package com.deliveryhero.fwf_client;

import coil3.ExtrasKt;
import com.deliveryhero.fwf_evaluator.model.EvalResult;
import com.deliveryhero.fwf_evaluator.model.User;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFClientExtensionKt$getVariations$evalResults$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ Map<String, Object> $featureKeysFallbacks;
    final /* synthetic */ boolean $forceEvaluation;
    final /* synthetic */ FwFClient $this_getVariations;
    final /* synthetic */ Map<String, String> $trackingMetadata;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FwFClientExtensionKt$getVariations$evalResults$1(FwFClient fwFClient, boolean z, Map<String, ? extends Object> map, Map<String, String> map2, ShortNewsContentCardView<? super FwFClientExtensionKt$getVariations$evalResults$1> shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.$this_getVariations = fwFClient;
        this.$forceEvaluation = z;
        this.$featureKeysFallbacks = map;
        this.$trackingMetadata = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new FwFClientExtensionKt$getVariations$evalResults$1(this.$this_getVariations, this.$forceEvaluation, this.$featureKeysFallbacks, this.$trackingMetadata, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            if (i == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!this.$this_getVariations.getConfig$fwf_client_release().getUseEvaluationsCache$fwf_client_release() || this.$forceEvaluation) {
            FwFClient fwFClient = this.$this_getVariations;
            Map<String, Object> map = this.$featureKeysFallbacks;
            User user$fwf_client_release = fwFClient.getUser$fwf_client_release();
            Map<String, String> map2 = this.$trackingMetadata;
            this.label = 2;
            Object objEvaluateFeatures$fwf_client_release = fwFClient.evaluateFeatures$fwf_client_release(map, user$fwf_client_release, (8 & 4) != 0 ? null : map2, (8 & 8) != 0 ? null : null, this);
            if (objEvaluateFeatures$fwf_client_release != coroutineSingletons) {
                return objEvaluateFeatures$fwf_client_release;
            }
        } else {
            FwFClient fwFClient2 = this.$this_getVariations;
            Map<String, Object> map3 = this.$featureKeysFallbacks;
            User user$fwf_client_release2 = fwFClient2.getUser$fwf_client_release();
            Map<String, String> map4 = this.$trackingMetadata;
            this.label = 1;
            Object evaluations$fwf_client_release = fwFClient2.getEvaluations$fwf_client_release(map3, user$fwf_client_release2, (8 & 4) != 0 ? null : map4, (8 & 8) != 0 ? null : null, this);
            if (evaluations$fwf_client_release != coroutineSingletons) {
                return evaluations$fwf_client_release;
            }
        }
        return coroutineSingletons;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(ShortNewsContentCardView<? super Map<String, EvalResult>> shortNewsContentCardView) {
        return ((FwFClientExtensionKt$getVariations$evalResults$1) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
