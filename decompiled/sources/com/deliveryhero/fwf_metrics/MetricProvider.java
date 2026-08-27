package com.deliveryhero.fwf_metrics;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onMove;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricProvider {
    private final IMetricReporter metricReporter;

    private final String getFullMetricName(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(MetricProviderKt.METRIC_PREFIX, str);
    }

    public final void incrementCounter$fwf_client_release(String str, long j, Map<String, String> map) {
        str.getClass();
        map.getClass();
        IMetricReporter iMetricReporter = this.metricReporter;
        if (iMetricReporter != null) {
            iMetricReporter.incrementCounter(getFullMetricName(str), j, getTags(map));
        }
    }

    public final <T> T measureExecutionTime$fwf_client_release(String str, Map<String, String> map, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        str.getClass();
        map.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        IMetricReporter iMetricReporter = this.metricReporter;
        if (iMetricReporter == null) {
            return (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
        T t = (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        iMetricReporter.recordHistogramMetric(getFullMetricName(str), BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(DefaultInAppMessageViewWrapper.serializer(jWrite)), getTags(map));
        return t;
    }

    public final void recordGaugeMetric$fwf_client_release(String str, double d, Map<String, String> map) {
        str.getClass();
        map.getClass();
        IMetricReporter iMetricReporter = this.metricReporter;
        if (iMetricReporter != null) {
            iMetricReporter.recordGaugeMetric(getFullMetricName(str), d, getTags(map));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object measureExecutionTime$fwf_client_release$default(MetricProvider metricProvider, String str, Map map, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 2) != 0) {
            map = SimpleItemTouchHelperCallback.serializer;
        }
        return metricProvider.measureExecutionTime$fwf_client_release(str, map, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object measureExecutionTimeSuspend$fwf_client_release$default(MetricProvider metricProvider, String str, Map map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
        if ((i & 2) != 0) {
            map = SimpleItemTouchHelperCallback.serializer;
        }
        return metricProvider.measureExecutionTimeSuspend$fwf_client_release(str, map, r8lambdaunavo3sxub_pc9xroryotnrlvsm, shortNewsContentCardView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void recordGaugeMetric$fwf_client_release$default(MetricProvider metricProvider, String str, double d, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = SimpleItemTouchHelperCallback.serializer;
        }
        metricProvider.recordGaugeMetric$fwf_client_release(str, d, map);
    }

    public /* synthetic */ MetricProvider(IMetricReporter iMetricReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iMetricReporter);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object measureExecutionTimeSuspend$fwf_client_release(String str, Map<String, String> map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super T> shortNewsContentCardView) {
        MetricProvider$measureExecutionTimeSuspend$1 metricProvider$measureExecutionTimeSuspend$1;
        MetricProvider metricProvider;
        Map<String, String> map2;
        String str2;
        long j;
        IMetricReporter iMetricReporter;
        if (shortNewsContentCardView instanceof MetricProvider$measureExecutionTimeSuspend$1) {
            metricProvider$measureExecutionTimeSuspend$1 = (MetricProvider$measureExecutionTimeSuspend$1) shortNewsContentCardView;
            int i = metricProvider$measureExecutionTimeSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metricProvider$measureExecutionTimeSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                metricProvider$measureExecutionTimeSuspend$1 = new MetricProvider$measureExecutionTimeSuspend$1(this, shortNewsContentCardView);
            }
        } else {
            metricProvider$measureExecutionTimeSuspend$1 = new MetricProvider$measureExecutionTimeSuspend$1(this, shortNewsContentCardView);
        }
        Object obj = metricProvider$measureExecutionTimeSuspend$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metricProvider$measureExecutionTimeSuspend$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            IMetricReporter iMetricReporter2 = this.metricReporter;
            if (iMetricReporter2 != null) {
                long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                metricProvider$measureExecutionTimeSuspend$1.L$0 = this;
                metricProvider$measureExecutionTimeSuspend$1.L$1 = str;
                metricProvider$measureExecutionTimeSuspend$1.L$2 = map;
                metricProvider$measureExecutionTimeSuspend$1.L$3 = iMetricReporter2;
                metricProvider$measureExecutionTimeSuspend$1.J$0 = jWrite;
                metricProvider$measureExecutionTimeSuspend$1.label = 1;
                Object objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(metricProvider$measureExecutionTimeSuspend$1);
                if (objInvoke != obj2) {
                    metricProvider = this;
                    map2 = map;
                    str2 = str;
                    j = jWrite;
                    obj = objInvoke;
                    iMetricReporter = iMetricReporter2;
                }
            } else {
                metricProvider$measureExecutionTimeSuspend$1.label = 2;
                Object objInvoke2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(metricProvider$measureExecutionTimeSuspend$1);
                if (objInvoke2 != obj2) {
                    return objInvoke2;
                }
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = metricProvider$measureExecutionTimeSuspend$1.J$0;
        iMetricReporter = (IMetricReporter) metricProvider$measureExecutionTimeSuspend$1.L$3;
        map2 = (Map) metricProvider$measureExecutionTimeSuspend$1.L$2;
        str2 = (String) metricProvider$measureExecutionTimeSuspend$1.L$1;
        metricProvider = (MetricProvider) metricProvider$measureExecutionTimeSuspend$1.L$0;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        iMetricReporter.recordHistogramMetric(metricProvider.getFullMetricName(str2), BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(DefaultInAppMessageViewWrapper.serializer(j)), metricProvider.getTags(map2));
        return obj;
    }

    private final Map<String, String> getTags(Map<String, String> map) {
        if (map.isEmpty()) {
            return MetricUtilsKt.getDefaultTags();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return onMove.RemoteActionCompatParcelizer(linkedHashMap, MetricUtilsKt.getDefaultTags());
    }

    public MetricProvider(IMetricReporter iMetricReporter) {
        this.metricReporter = iMetricReporter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MetricProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void incrementCounter$fwf_client_release$default(MetricProvider metricProvider, String str, long j, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 1;
        }
        if ((i & 4) != 0) {
            map = SimpleItemTouchHelperCallback.serializer;
        }
        metricProvider.incrementCounter$fwf_client_release(str, j, map);
    }
}
