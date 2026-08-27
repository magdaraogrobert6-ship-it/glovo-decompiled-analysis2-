package com.mapbox.common;

import androidx.annotation.Keep;
import androidx.sqlite.SQLite;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes5.dex */
public final class PlatformMetrics {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Keep
        public final List<MetricsSource> getPlatformMetricsSources(MetricsServiceType metricsServiceType) {
            metricsServiceType.getClass();
            Object[] objArr = {MemoryMetricsSource.Companion.getInstance()};
            int iSerializer = getQueryParameterslambda2.serializer();
            return (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        }

        private Companion() {
        }
    }

    @Keep
    public static final List<MetricsSource> getPlatformMetricsSources(MetricsServiceType metricsServiceType) {
        return Companion.getPlatformMetricsSources(metricsServiceType);
    }
}
