package com.deliveryhero.fwf_tracking;

import com.deliveryhero.fwf_tracking.model.FwFTrackingCallback;
import com.deliveryhero.fwf_tracking.model.FwFTrackingConfig;
import com.deliveryhero.fwf_util.FwFSerializer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidDomain {
    public static final Companion Companion = new Companion(null);

    public static final FwFEventValueTransformerImpl eventValueTransformer(FwFTrackingConfig fwFTrackingConfig) {
        return Companion.eventValueTransformer(fwFTrackingConfig);
    }

    public static final ExposureHandler exposureHandler(FwFSerializer fwFSerializer, FwFTrackingCallback fwFTrackingCallback) {
        return Companion.exposureHandler(fwFSerializer, fwFTrackingCallback);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FwFEventValueTransformerImpl eventValueTransformer(FwFTrackingConfig fwFTrackingConfig) {
            if (fwFTrackingConfig != null) {
                return new FwFEventValueTransformerImpl(fwFTrackingConfig);
            }
            return null;
        }

        public final ExposureHandler exposureHandler(FwFSerializer fwFSerializer, FwFTrackingCallback fwFTrackingCallback) {
            fwFSerializer.getClass();
            if (fwFTrackingCallback != null) {
                return new ExposureHandlerImpl(fwFTrackingCallback, fwFSerializer);
            }
            return null;
        }
    }
}
