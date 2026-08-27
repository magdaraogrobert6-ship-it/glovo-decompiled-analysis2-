package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class PerceptionData implements Serializable {
    private final List<PerceptionFeature> features;
    private final long monotonicTimestampNanoseconds;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private List<PerceptionFeature> features;
        private long monotonicTimestampNanoseconds;

        public final List<PerceptionFeature> getFeatures() {
            return this.features;
        }

        public final long getMonotonicTimestampNanoseconds() {
            return this.monotonicTimestampNanoseconds;
        }

        /* JADX INFO: renamed from: setMonotonicTimestampNanoseconds, reason: collision with other method in class */
        public final /* synthetic */ void m4821setMonotonicTimestampNanoseconds(long j) {
            this.monotonicTimestampNanoseconds = j;
        }

        public final PerceptionData build() {
            long j = this.monotonicTimestampNanoseconds;
            List<PerceptionFeature> list = this.features;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (list != null) {
                list.getClass();
                return new PerceptionData(j, list, defaultConstructorMarker);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of PerceptionData through PerceptionData.Builder because features was null.");
            return null;
        }

        public Builder(long j, List<PerceptionFeature> list) {
            list.getClass();
            this.monotonicTimestampNanoseconds = j;
            this.features = list;
        }

        /* JADX INFO: renamed from: setFeatures, reason: collision with other method in class */
        public final /* synthetic */ void m4820setFeatures(List list) {
            list.getClass();
            this.features = list;
        }

        public final Builder setMonotonicTimestampNanoseconds(long j) {
            this.monotonicTimestampNanoseconds = j;
            return this;
        }

        public final Builder setFeatures(List<PerceptionFeature> list) {
            list.getClass();
            this.features = list;
            return this;
        }
    }

    public final List<PerceptionFeature> getFeatures() {
        return this.features;
    }

    public final long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public final Builder toBuilder() {
        return new Builder(this.monotonicTimestampNanoseconds, this.features).setMonotonicTimestampNanoseconds(this.monotonicTimestampNanoseconds).setFeatures(this.features);
    }

    private PerceptionData(long j, List<PerceptionFeature> list) {
        this.monotonicTimestampNanoseconds = j;
        this.features = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PerceptionData)) {
            return false;
        }
        PerceptionData perceptionData = (PerceptionData) obj;
        if (this.monotonicTimestampNanoseconds != perceptionData.monotonicTimestampNanoseconds) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.features, perceptionData.features}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PerceptionData(monotonicTimestampNanoseconds=");
        sb.append(this.monotonicTimestampNanoseconds);
        sb.append(", features=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.features, ')');
    }

    public int hashCode() {
        long j = this.monotonicTimestampNanoseconds;
        return Objects.hash(Long.valueOf(j), this.features);
    }

    public /* synthetic */ PerceptionData(long j, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list);
    }
}
