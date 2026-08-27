package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class getMinWidthMinor implements ExtraSupportedSurfaceCombinationsQuirk {
    public final getFixedWidthMajor read;
    public final int serializer;
    public final Executor write;

    public getMinWidthMinor(getFixedWidthMajor getfixedwidthmajor, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, int i) {
        this.read = getfixedwidthmajor;
        this.write = previewFreezeAfterHighSpeedRecordingQuirk;
        this.serializer = i;
    }

    @Override // o.ExtraSupportedSurfaceCombinationsQuirk
    public final DrawModifierNodeKt RemoteActionCompatParcelizer() {
        setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
        return VideoQualityQuirk.serializer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(this.read.serializer(this.serializer)), new androidx.camera.view.PendingValue(5, new getTrackDrawable(9)), this.write);
    }

    @Override // o.ExtraSupportedSurfaceCombinationsQuirk
    public final DrawModifierNodeKt serializer() {
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            this.read.write.serializer();
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
            ondrawwithcontent.RemoteActionCompatParcelizer = "invokePostCaptureFuture";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        return ondrawbehind;
    }
}
