package o;

/* JADX INFO: loaded from: classes.dex */
public final class CameraNoResponseWhenEnablingFlashQuirk implements CaptureIntentPreviewQuirk {
    public final String IconCompatParcelizer;
    public final Camera2DeviceSurfaceManager write;

    public final int hashCode() {
        return this.write.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public CameraNoResponseWhenEnablingFlashQuirk(String str, Camera2DeviceSurfaceManager camera2DeviceSurfaceManager) {
        camera2DeviceSurfaceManager.getClass();
        this.IconCompatParcelizer = str;
        this.write = camera2DeviceSurfaceManager;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraNoResponseWhenEnablingFlashQuirk)) {
            return false;
        }
        CameraNoResponseWhenEnablingFlashQuirk cameraNoResponseWhenEnablingFlashQuirk = (CameraNoResponseWhenEnablingFlashQuirk) obj;
        if (!this.IconCompatParcelizer.equals(cameraNoResponseWhenEnablingFlashQuirk.IconCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, cameraNoResponseWhenEnablingFlashQuirk.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.IconCompatParcelizer + ", featureRequiring=" + this.write + ')';
    }
}
