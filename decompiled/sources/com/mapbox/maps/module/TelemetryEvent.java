package com.mapbox.maps.module;

import com.mapbox.common.FeatureTelemetryCounter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class TelemetryEvent {
    public static final Companion Companion = new Companion(null);
    private final FeatureTelemetryCounter counter;
    private final String name;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TelemetryEvent create(String str) {
            str.getClass();
            return new TelemetryEvent("maps-mobile/".concat(str), null);
        }
    }

    private TelemetryEvent(String str) {
        FeatureTelemetryCounter featureTelemetryCounterCreate;
        this.name = str;
        try {
            featureTelemetryCounterCreate = FeatureTelemetryCounter.create(str);
        } catch (Throwable unused) {
            featureTelemetryCounterCreate = null;
        }
        this.counter = featureTelemetryCounterCreate;
    }

    public final void increment() {
        FeatureTelemetryCounter featureTelemetryCounter = this.counter;
        if (featureTelemetryCounter != null) {
            featureTelemetryCounter.increment();
        }
    }

    public /* synthetic */ TelemetryEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
