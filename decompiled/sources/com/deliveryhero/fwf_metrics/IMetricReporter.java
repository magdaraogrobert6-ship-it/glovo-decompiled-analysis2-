package com.deliveryhero.fwf_metrics;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface IMetricReporter {
    void incrementCounter(String str, long j, Map<String, String> map);

    void recordGaugeMetric(String str, double d, Map<String, String> map);

    void recordHistogramMetric(String str, long j, Map<String, String> map);
}
