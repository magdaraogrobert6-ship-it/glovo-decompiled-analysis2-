package com.deliveryhero.fwf_evaluator;

import com.deliveryhero.fwf_evaluator.model.EvalResult;
import com.deliveryhero.fwf_evaluator.model.Feature;
import com.deliveryhero.fwf_evaluator.model.User;
import com.deliveryhero.fwf_evaluator.util.ConstantsKt;
import com.deliveryhero.fwf_metrics.MetricProvider;
import com.deliveryhero.fwf_metrics.MetricUtilsKt;
import com.deliveryhero.fwf_tracking.model.FwFEventValue;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.util.Collections;
import java.util.Map;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class Evaluator {
    private final MetricProvider metricProvider;

    public Evaluator(MetricProvider metricProvider) {
        metricProvider.getClass();
        this.metricProvider = metricProvider;
    }

    public final EvalResult evaluateFeature(final Feature feature, final User user, final Object obj) {
        feature.getClass();
        user.getClass();
        obj.getClass();
        Map<String, String> mapSingletonMap = Collections.singletonMap("feature_key", feature.getKey());
        mapSingletonMap.getClass();
        EvalResult evalResult = (EvalResult) this.metricProvider.measureExecutionTime$fwf_client_release(MetricUtilsKt.METRIC_EVALUATION_DURATION, mapSingletonMap, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_evaluator.Evaluator$evaluateFeature$evalResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final EvalResult invoke() {
                if (user.isValid$fwf_client_release()) {
                    return feature.evaluateFeature(user, obj);
                }
                EvalResult fallbackResult = EvalResult.Companion.getFallbackResult(User.getEvaluatedUserAttributes$fwf_client_release$default(user, null, 1, null), obj, ConstantsKt.INVALID_USER_MESSAGE);
                feature.getEventValue().setUserValues(user, feature.getEvalUserId());
                FwFEventValue.setEvaluationValues$default(feature.getEventValue(), fallbackResult, FwFEventValue.FwFEvaluationOutcome.FALLBACK, null, 4, null);
                return fallbackResult;
            }
        });
        MetricProvider metricProvider = this.metricProvider;
        Map mapSingletonMap2 = Collections.singletonMap(FWFConstants.EXPLANATION_TYPE_KIND, evalResult.getExplanation().getKind().name());
        mapSingletonMap2.getClass();
        MetricProvider.incrementCounter$fwf_client_release$default(metricProvider, MetricUtilsKt.METRIC_EVALUATION_COUNT, 0L, onMove.RemoteActionCompatParcelizer(mapSingletonMap2, mapSingletonMap), 2, null);
        if (evalResult.getExplanation().getKind().isErrorKind$fwf_client_release()) {
            MetricProvider.incrementCounter$fwf_client_release$default(this.metricProvider, MetricUtilsKt.METRIC_EVALUATION_ERROR, 0L, onMove.RemoteActionCompatParcelizer(onMove.RemoteActionCompatParcelizer(MetricUtilsKt.getErrorTag(evalResult.getExplanation().getError()), new onViewAttachedToWindowlambda0(FWFConstants.EXPLANATION_TYPE_KIND, evalResult.getExplanation().getKind().name())), mapSingletonMap), 2, null);
        }
        return evalResult;
    }
}
