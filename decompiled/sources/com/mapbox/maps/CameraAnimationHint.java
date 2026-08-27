package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnimationHint implements Serializable {
    private final List<CameraAnimationHintStage> stages;

    public List<CameraAnimationHintStage> getStages() {
        return this.stages;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.stages);
    }

    public Builder toBuilder() {
        return new Builder().stages(this.stages);
    }

    private CameraAnimationHint(List<CameraAnimationHintStage> list) {
        this.stages = list;
    }

    public String toString() {
        return MediaSessionCompatQueueItem.read(this.stages, new StringBuilder("[stages: "), "]");
    }

    public static final class Builder {
        private List<CameraAnimationHintStage> stages;

        public Builder stages(List<CameraAnimationHintStage> list) {
            this.stages = list;
            return this;
        }

        public CameraAnimationHint build() {
            List<CameraAnimationHintStage> list = this.stages;
            if (list != null) {
                return new CameraAnimationHint(list);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("stages shouldn't be null");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && CameraAnimationHint.class == obj.getClass() && Objects.equals(this.stages, ((CameraAnimationHint) obj).stages);
    }
}
