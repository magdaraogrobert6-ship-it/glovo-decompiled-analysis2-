package o;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2CameraFactory extends PreviewExternalSyntheticLambda0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final Object read;

    public Camera2CameraFactory(Surface surface) {
        super(PreviewExternalSyntheticLambda0.IconCompatParcelizer, 0);
        this.read = surface;
    }

    @Override // o.PreviewExternalSyntheticLambda0
    public final DrawModifierNodeKt RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        return i != 0 ? VideoQualityQuirk.read((Surface) obj) : ((androidx.camera.core.SurfaceRequest) obj).PlaybackStateCompatCustomAction;
    }

    public Camera2CameraFactory(Surface surface, android.util.Size size, int i) {
        super(size, i);
        this.read = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2CameraFactory(androidx.camera.core.SurfaceRequest surfaceRequest, android.util.Size size) {
        super(size, 34);
        this.read = surfaceRequest;
    }
}
