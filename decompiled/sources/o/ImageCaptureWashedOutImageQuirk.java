package o;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureWashedOutImageQuirk implements ImageCaptureMetadata {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final ImageCaptureMetadata serializer;
    public final Object write;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageCaptureWashedOutImageQuirk(ImageCaptureMetadata imageCaptureMetadata, StreamSharing$$ExternalSyntheticLambda0 streamSharing$$ExternalSyntheticLambda0) {
        this(imageCaptureMetadata, (byte) 0);
        this.RemoteActionCompatParcelizer = 1;
        this.write = streamSharing$$ExternalSyntheticLambda0;
    }

    @Override // o.ImageCaptureMetadata
    public final void IconCompatParcelizer() {
        this.serializer.IconCompatParcelizer();
    }

    @Override // o.ImageCaptureMetadata
    public final void IconCompatParcelizer(int i) {
        this.serializer.IconCompatParcelizer(i);
    }

    @Override // o.ImageCaptureMetadata
    public final void IconCompatParcelizer(InitializationException initializationException) {
        this.serializer.IconCompatParcelizer(initializationException);
    }

    @Override // o.ImageCaptureMetadata
    public final void MediaDescriptionCompat() {
        this.serializer.MediaDescriptionCompat();
    }

    @Override // o.ImageCaptureMetadata
    public final DrawModifierNodeKt RemoteActionCompatParcelizer(int i) {
        return this.serializer.RemoteActionCompatParcelizer(i);
    }

    @Override // o.ImageCaptureMetadata
    public DrawModifierNodeKt read(ArrayList arrayList, int i, int i2) {
        int i3 = this.RemoteActionCompatParcelizer;
        ImageCaptureMetadata imageCaptureMetadata = this.serializer;
        if (i3 != 1) {
            return imageCaptureMetadata.read(arrayList, i, i2);
        }
        coil3.util.UtilsKt.IconCompatParcelizer("Only support one capture config.", arrayList.size() == 1);
        DrawModifierNodeKt drawModifierNodeKtRemoteActionCompatParcelizer = imageCaptureMetadata.RemoteActionCompatParcelizer(i);
        return VideoQualityQuirk.write(Collections.singletonList(VideoQualityQuirk.serializer(VideoQualityQuirk.serializer(VideoQualityQuirk.serializer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(drawModifierNodeKtRemoteActionCompatParcelizer), new EncodeException(drawModifierNodeKtRemoteActionCompatParcelizer, 2), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read()), new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 7, arrayList), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read()), new EncodeException(drawModifierNodeKtRemoteActionCompatParcelizer, 3), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read())));
    }

    @Override // o.ImageCaptureMetadata
    public final void read() {
        this.serializer.read();
    }

    @Override // o.ImageCaptureMetadata
    public final void serializer() {
        this.serializer.serializer();
    }

    @Override // o.ImageCaptureMetadata
    public final void serializer(setTitleMarginBottom settitlemarginbottom) {
        this.serializer.serializer(settitlemarginbottom);
    }

    @Override // o.ImageCaptureMetadata
    public final InitializationException write() {
        return this.serializer.write();
    }

    @Override // o.ImageCaptureMetadata
    public final void write(UseCaseAdditionSimulator useCaseAdditionSimulator) {
        this.serializer.write(useCaseAdditionSimulator);
    }

    @Override // o.ImageCaptureMetadata
    public DrawModifierNodeKt IconCompatParcelizer(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        return this.RemoteActionCompatParcelizer != 0 ? this.serializer.IconCompatParcelizer(focusMeteringAction) : ((ImageCaptureMetadata) this.write).IconCompatParcelizer(focusMeteringAction);
    }

    @Override // o.ImageCaptureMetadata
    public DrawModifierNodeKt read(float f) {
        return this.RemoteActionCompatParcelizer != 0 ? this.serializer.read(f) : ((ImageCaptureMetadata) this.write).read(f);
    }

    @Override // o.ImageCaptureMetadata
    public DrawModifierNodeKt read(boolean z) {
        return this.RemoteActionCompatParcelizer != 0 ? this.serializer.read(z) : ((ImageCaptureMetadata) this.write).read(z);
    }

    @Override // o.ImageCaptureMetadata
    public DrawModifierNodeKt serializer(float f) {
        return this.RemoteActionCompatParcelizer != 0 ? this.serializer.serializer(f) : ((ImageCaptureMetadata) this.write).serializer(f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageCaptureWashedOutImageQuirk(ImageCaptureMetadata imageCaptureMetadata) {
        this(imageCaptureMetadata, (byte) 0);
        this.RemoteActionCompatParcelizer = 0;
        this.write = imageCaptureMetadata;
    }

    public ImageCaptureWashedOutImageQuirk(ImageCaptureMetadata imageCaptureMetadata, byte b) {
        this.serializer = imageCaptureMetadata;
    }
}
