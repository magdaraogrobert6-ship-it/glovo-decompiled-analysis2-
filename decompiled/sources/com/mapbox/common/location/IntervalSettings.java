package com.mapbox.common.location;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public class IntervalSettings implements Serializable {
    private final Long interval;
    private final Long maximumInterval;
    private final Long minimumInterval;

    public static final class Builder {
        private Long interval;
        private Long maximumInterval;
        private Long minimumInterval;

        public Builder interval(Long l) {
            this.interval = l;
            return this;
        }

        public Builder maximumInterval(Long l) {
            this.maximumInterval = l;
            return this;
        }

        public Builder minimumInterval(Long l) {
            this.minimumInterval = l;
            return this;
        }

        public IntervalSettings build() {
            return new IntervalSettings(this.minimumInterval, this.maximumInterval, this.interval);
        }
    }

    public Long getInterval() {
        return this.interval;
    }

    public Long getMaximumInterval() {
        return this.maximumInterval;
    }

    public Long getMinimumInterval() {
        return this.minimumInterval;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.minimumInterval, this.maximumInterval, this.interval);
    }

    public Builder toBuilder() {
        return new Builder().minimumInterval(this.minimumInterval).maximumInterval(this.maximumInterval).interval(this.interval);
    }

    private IntervalSettings(Long l, Long l2, Long l3) {
        this.minimumInterval = l;
        this.maximumInterval = l2;
        this.interval = l3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[minimumInterval: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.minimumInterval, sb, ", maximumInterval: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.maximumInterval, sb, ", interval: ");
        sb.append(RecordUtils.fieldToString(this.interval));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntervalSettings intervalSettings = (IntervalSettings) obj;
        return Objects.equals(this.minimumInterval, intervalSettings.minimumInterval) && Objects.equals(this.maximumInterval, intervalSettings.maximumInterval) && Objects.equals(this.interval, intervalSettings.interval);
    }
}
