package com.deliveryhero.fwf_client;

import com.deliveryhero.fwf_http.HTTPClient;
import com.deliveryhero.fwf_http.HTTPClientConfig;
import com.deliveryhero.fwf_http.HTTPRequestClient;
import com.deliveryhero.fwf_http.IFwFHTTPRequestClient;
import com.deliveryhero.fwf_logger.FwFLogLevel;
import com.deliveryhero.fwf_logger.FwFLogger;
import com.deliveryhero.fwf_logger.IFwFLogging;
import com.deliveryhero.fwf_logger.Logger;
import com.deliveryhero.fwf_metrics.IMetricReporter;
import com.deliveryhero.fwf_metrics.MetricProvider;
import com.deliveryhero.fwf_util.FwFSerializer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonDomain {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MetricProvider metricProvider(IMetricReporter iMetricReporter) {
            return new MetricProvider(iMetricReporter);
        }

        public final FwFSerializer serializer() {
            return new FwFSerializer();
        }

        public final HTTPClient httpClient(FwFClientConfig fwFClientConfig, Logger logger, IFwFHTTPRequestClient iFwFHTTPRequestClient, MetricProvider metricProvider, FwFSerializer fwFSerializer) {
            fwFClientConfig.getClass();
            logger.getClass();
            metricProvider.getClass();
            fwFSerializer.getClass();
            return new HTTPClient(new HTTPClientConfig(fwFClientConfig.getRegion$fwf_client_release(), fwFClientConfig.getSelfHostedUrl$fwf_client_release(), null, fwFClientConfig.getAccessToken$fwf_client_release(), fwFClientConfig.getRequestTimeout$fwf_client_release(), 4, null), logger, iFwFHTTPRequestClient == null ? new HTTPRequestClient() : iFwFHTTPRequestClient, metricProvider, fwFSerializer);
        }

        private Companion() {
        }

        public final Logger logger(FwFClientConfig fwFClientConfig, IFwFLogging iFwFLogging) {
            fwFClientConfig.getClass();
            FwFLogLevel logLevel$fwf_client_release = fwFClientConfig.getLogLevel$fwf_client_release();
            if (iFwFLogging == null) {
                iFwFLogging = new FwFLogger();
            }
            return new Logger(logLevel$fwf_client_release, iFwFLogging);
        }
    }

    public static final Logger logger(FwFClientConfig fwFClientConfig, IFwFLogging iFwFLogging) {
        return Companion.logger(fwFClientConfig, iFwFLogging);
    }

    public static final MetricProvider metricProvider(IMetricReporter iMetricReporter) {
        return Companion.metricProvider(iMetricReporter);
    }

    public static final FwFSerializer serializer() {
        return Companion.serializer();
    }

    public static final HTTPClient httpClient(FwFClientConfig fwFClientConfig, Logger logger, IFwFHTTPRequestClient iFwFHTTPRequestClient, MetricProvider metricProvider, FwFSerializer fwFSerializer) {
        return Companion.httpClient(fwFClientConfig, logger, iFwFHTTPRequestClient, metricProvider, fwFSerializer);
    }
}
