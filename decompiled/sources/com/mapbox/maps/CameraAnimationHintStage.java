package com.mapbox.maps;

import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnimationHintStage implements Serializable {
    private final CameraOptions camera;
    private final long progress;

    public CameraOptions getCamera() {
        return this.camera;
    }

    public long getProgress() {
        return this.progress;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Builder toBuilder() {
        return new Builder().progress(this.progress).camera(this.camera);
    }

    private CameraAnimationHintStage(long j, CameraOptions cameraOptions) {
        this.progress = j;
        this.camera = cameraOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[progress: ");
        af$$ExternalSyntheticOutline1.m(this.progress, ", camera: ", sb);
        sb.append(RecordUtils.fieldToString(this.camera));
        sb.append("]");
        return sb.toString();
    }

    public static final class Builder {
        private CameraOptions camera;
        private long progress;

        public Builder camera(CameraOptions cameraOptions) {
            this.camera = cameraOptions;
            return this;
        }

        public Builder progress(long j) {
            this.progress = j;
            return this;
        }

        public CameraAnimationHintStage build() {
            CameraOptions cameraOptions = this.camera;
            if (cameraOptions != null) {
                return new CameraAnimationHintStage(this.progress, cameraOptions);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("camera shouldn't be null");
            return null;
        }
    }

    public int hashCode() {
        long j = this.progress;
        return Objects.hash(Long.valueOf(j), this.camera);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraAnimationHintStage.class != obj.getClass()) {
            return false;
        }
        CameraAnimationHintStage cameraAnimationHintStage = (CameraAnimationHintStage) obj;
        return this.progress == cameraAnimationHintStage.progress && Objects.equals(this.camera, cameraAnimationHintStage.camera);
    }
}
