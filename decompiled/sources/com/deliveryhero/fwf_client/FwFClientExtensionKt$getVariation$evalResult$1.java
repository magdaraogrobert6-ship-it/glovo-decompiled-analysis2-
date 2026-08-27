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
public final class FwFClientExtensionKt$getVariation$evalResult$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ Object $fallback;
    final /* synthetic */ String $featureKey;
    final /* synthetic */ boolean $forceEvaluation;
    final /* synthetic */ FwFClient $this_getVariation;
    final /* synthetic */ Map<String, String> $trackingMetadata;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FwFClientExtensionKt$getVariation$evalResult$1(FwFClient fwFClient, boolean z, String str, Object obj, Map<String, String> map, ShortNewsContentCardView<? super FwFClientExtensionKt$getVariation$evalResult$1> shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.$this_getVariation = fwFClient;
        this.$forceEvaluation = z;
        this.$featureKey = str;
        this.$fallback = obj;
        this.$trackingMetadata = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new FwFClientExtensionKt$getVariation$evalResult$1(this.$this_getVariation, this.$forceEvaluation, this.$featureKey, this.$fallback, this.$trackingMetadata, shortNewsContentCardView);
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
        if (!this.$this_getVariation.getConfig$fwf_client_release().getUseEvaluationsCache$fwf_client_release() || this.$forceEvaluation) {
            FwFClient fwFClient = this.$this_getVariation;
            String str = this.$featureKey;
            Object obj2 = this.$fallback;
            User user$fwf_client_release = fwFClient.getUser$fwf_client_release();
            Map<String, String> map = this.$trackingMetadata;
            this.label = 2;
            Object objEvaluateFeature$fwf_client_release = fwFClient.evaluateFeature$fwf_client_release(str, obj2, user$fwf_client_release, (16 & 8) != 0 ? null : map, (16 & 16) != 0 ? null : null, this);
            if (objEvaluateFeature$fwf_client_release != coroutineSingletons) {
                return objEvaluateFeature$fwf_client_release;
            }
        } else {
            FwFClient fwFClient2 = this.$this_getVariation;
            String str2 = this.$featureKey;
            Object obj3 = this.$fallback;
            User user$fwf_client_release2 = fwFClient2.getUser$fwf_client_release();
            Map<String, String> map2 = this.$trackingMetadata;
            this.label = 1;
            Object evaluation$fwf_client_release = fwFClient2.getEvaluation$fwf_client_release(str2, obj3, user$fwf_client_release2, (16 & 8) != 0 ? null : map2, (16 & 16) != 0 ? null : null, this);
            if (evaluation$fwf_client_release != coroutineSingletons) {
                return evaluation$fwf_client_release;
            }
        }
        return coroutineSingletons;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(ShortNewsContentCardView<? super EvalResult> shortNewsContentCardView) {
        return ((FwFClientExtensionKt$getVariation$evalResult$1) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
