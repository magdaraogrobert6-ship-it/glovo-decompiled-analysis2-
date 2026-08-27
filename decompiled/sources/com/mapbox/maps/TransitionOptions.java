package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public final class TransitionOptions implements Serializable {
    private final Long delay;
    private final Long duration;
    private final Boolean enablePlacementTransitions;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Builder {
        private Long delay;
        private Long duration;
        private Boolean enablePlacementTransitions;

        public Builder delay(Long l) {
            this.delay = l;
            return this;
        }

        public Builder duration(Long l) {
            this.duration = l;
            return this;
        }

        public Builder enablePlacementTransitions(Boolean bool) {
            this.enablePlacementTransitions = bool;
            return this;
        }

        public TransitionOptions build() {
            return new TransitionOptions(this.duration, this.delay, this.enablePlacementTransitions);
        }
    }

    public Long getDelay() {
        return this.delay;
    }

    public Long getDuration() {
        return this.duration;
    }

    public Boolean getEnablePlacementTransitions() {
        return this.enablePlacementTransitions;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.duration, this.delay, this.enablePlacementTransitions);
    }

    public Builder toBuilder() {
        return new Builder().duration(this.duration).delay(this.delay).enablePlacementTransitions(this.enablePlacementTransitions);
    }

    private TransitionOptions(Long l, Long l2, Boolean bool) {
        this.duration = l;
        this.delay = l2;
        this.enablePlacementTransitions = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[duration: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.duration, sb, ", delay: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.delay, sb, ", enablePlacementTransitions: ");
        sb.append(RecordUtils.fieldToString(this.enablePlacementTransitions));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransitionOptions.class != obj.getClass()) {
            return false;
        }
        TransitionOptions transitionOptions = (TransitionOptions) obj;
        return Objects.equals(this.duration, transitionOptions.duration) && Objects.equals(this.delay, transitionOptions.delay) && Objects.equals(this.enablePlacementTransitions, transitionOptions.enablePlacementTransitions);
    }
}
