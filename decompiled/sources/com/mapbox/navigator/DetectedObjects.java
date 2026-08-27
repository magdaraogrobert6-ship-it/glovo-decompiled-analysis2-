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
public final class DetectedObjects implements Serializable {
    private final List<DetectedObject> detectedObjects;
    private final long monotonicTimestampNanoseconds;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private List<DetectedObject> detectedObjects;
        private long monotonicTimestampNanoseconds;

        public final List<DetectedObject> getDetectedObjects() {
            return this.detectedObjects;
        }

        public final long getMonotonicTimestampNanoseconds() {
            return this.monotonicTimestampNanoseconds;
        }

        /* JADX INFO: renamed from: setMonotonicTimestampNanoseconds, reason: collision with other method in class */
        public final /* synthetic */ void m4803setMonotonicTimestampNanoseconds(long j) {
            this.monotonicTimestampNanoseconds = j;
        }

        public final DetectedObjects build() {
            long j = this.monotonicTimestampNanoseconds;
            List<DetectedObject> list = this.detectedObjects;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (list != null) {
                list.getClass();
                return new DetectedObjects(j, list, defaultConstructorMarker);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of DetectedObjects through DetectedObjects.Builder because detectedObjects was null.");
            return null;
        }

        public Builder(long j, List<DetectedObject> list) {
            list.getClass();
            this.monotonicTimestampNanoseconds = j;
            this.detectedObjects = list;
        }

        /* JADX INFO: renamed from: setDetectedObjects, reason: collision with other method in class */
        public final /* synthetic */ void m4802setDetectedObjects(List list) {
            list.getClass();
            this.detectedObjects = list;
        }

        public final Builder setMonotonicTimestampNanoseconds(long j) {
            this.monotonicTimestampNanoseconds = j;
            return this;
        }

        public final Builder setDetectedObjects(List<DetectedObject> list) {
            list.getClass();
            this.detectedObjects = list;
            return this;
        }
    }

    public final List<DetectedObject> getDetectedObjects() {
        return this.detectedObjects;
    }

    public final long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public final Builder toBuilder() {
        return new Builder(this.monotonicTimestampNanoseconds, this.detectedObjects).setMonotonicTimestampNanoseconds(this.monotonicTimestampNanoseconds).setDetectedObjects(this.detectedObjects);
    }

    private DetectedObjects(long j, List<DetectedObject> list) {
        this.monotonicTimestampNanoseconds = j;
        this.detectedObjects = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DetectedObjects)) {
            return false;
        }
        DetectedObjects detectedObjects = (DetectedObjects) obj;
        if (this.monotonicTimestampNanoseconds != detectedObjects.monotonicTimestampNanoseconds) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.detectedObjects, detectedObjects.detectedObjects}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DetectedObjects(monotonicTimestampNanoseconds=");
        sb.append(this.monotonicTimestampNanoseconds);
        sb.append(", detectedObjects=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.detectedObjects, ')');
    }

    public int hashCode() {
        long j = this.monotonicTimestampNanoseconds;
        return Objects.hash(Long.valueOf(j), this.detectedObjects);
    }

    public /* synthetic */ DetectedObjects(long j, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list);
    }
}
