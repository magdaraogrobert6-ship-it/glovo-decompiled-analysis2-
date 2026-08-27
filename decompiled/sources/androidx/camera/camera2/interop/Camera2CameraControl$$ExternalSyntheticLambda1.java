package androidx.camera.camera2.interop;

import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import bo.app.m1$$ExternalSyntheticOutline0;
import o.CacheDrawModifierNodeImpl1;
import o.DrawModifierNodeKt;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.VideoQualityQuirk;
import o.getLastBaselineToBottomHeight;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.setContentDrawScopeui;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Camera2CameraControl$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ CacheDrawModifierNodeImpl1 IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ onDrawWithContent serializer;

    public /* synthetic */ Camera2CameraControl$$ExternalSyntheticLambda1(CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1, onDrawWithContent ondrawwithcontent, int i) {
        this.read = i;
        this.IconCompatParcelizer = cacheDrawModifierNodeImpl1;
        this.serializer = ondrawwithcontent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        onDrawWithContent ondrawwithcontent = this.serializer;
        CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1 = this.IconCompatParcelizer;
        if (i != 0) {
            cacheDrawModifierNodeImpl1.write = true;
            CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
            onDrawWithContent ondrawwithcontent2 = (onDrawWithContent) cacheDrawModifierNodeImpl1.IconCompatParcelizer;
            if (ondrawwithcontent2 != null) {
                ondrawwithcontent2.serializer(cameraControl$OperationCanceledException);
                cacheDrawModifierNodeImpl1.IconCompatParcelizer = null;
            }
            cacheDrawModifierNodeImpl1.IconCompatParcelizer = ondrawwithcontent;
            if (cacheDrawModifierNodeImpl1.read) {
                Camera2CameraControlImpl camera2CameraControlImpl = (Camera2CameraControlImpl) cacheDrawModifierNodeImpl1.RemoteActionCompatParcelizer;
                camera2CameraControlImpl.getClass();
                onDrawWithContent ondrawwithcontent3 = new onDrawWithContent();
                ondrawwithcontent3.IconCompatParcelizer = new setContentDrawScopeui();
                onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent3);
                ondrawwithcontent3.read = ondrawbehind;
                ondrawwithcontent3.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
                try {
                    camera2CameraControlImpl.MediaDescriptionCompat.execute(new getLastBaselineToBottomHeight(camera2CameraControlImpl, ondrawwithcontent3, 0));
                    ondrawwithcontent3.RemoteActionCompatParcelizer = "updateSessionConfigAsync";
                } catch (Exception e) {
                    ondrawbehind.write(e);
                }
                VideoQualityQuirk.write((DrawModifierNodeKt) ondrawbehind).RemoteActionCompatParcelizer(new Preview$$ExternalSyntheticLambda0(10, cacheDrawModifierNodeImpl1), (PreviewFreezeAfterHighSpeedRecordingQuirk) cacheDrawModifierNodeImpl1.MediaMetadataCompat);
                cacheDrawModifierNodeImpl1.write = false;
                return;
            }
            return;
        }
        cacheDrawModifierNodeImpl1.write = true;
        CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
        onDrawWithContent ondrawwithcontent4 = (onDrawWithContent) cacheDrawModifierNodeImpl1.IconCompatParcelizer;
        if (ondrawwithcontent4 != null) {
            ondrawwithcontent4.serializer(cameraControl$OperationCanceledException2);
            cacheDrawModifierNodeImpl1.IconCompatParcelizer = null;
        }
        cacheDrawModifierNodeImpl1.IconCompatParcelizer = ondrawwithcontent;
        if (cacheDrawModifierNodeImpl1.read) {
            Camera2CameraControlImpl camera2CameraControlImpl2 = (Camera2CameraControlImpl) cacheDrawModifierNodeImpl1.RemoteActionCompatParcelizer;
            camera2CameraControlImpl2.getClass();
            onDrawWithContent ondrawwithcontent5 = new onDrawWithContent();
            ondrawwithcontent5.IconCompatParcelizer = new setContentDrawScopeui();
            onDrawBehind ondrawbehind2 = new onDrawBehind(ondrawwithcontent5);
            ondrawwithcontent5.read = ondrawbehind2;
            ondrawwithcontent5.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
            try {
                camera2CameraControlImpl2.MediaDescriptionCompat.execute(new getLastBaselineToBottomHeight(camera2CameraControlImpl2, ondrawwithcontent5, 0));
                ondrawwithcontent5.RemoteActionCompatParcelizer = "updateSessionConfigAsync";
            } catch (Exception e2) {
                ondrawbehind2.write(e2);
            }
            VideoQualityQuirk.write((DrawModifierNodeKt) ondrawbehind2).RemoteActionCompatParcelizer(new Preview$$ExternalSyntheticLambda0(10, cacheDrawModifierNodeImpl1), (PreviewFreezeAfterHighSpeedRecordingQuirk) cacheDrawModifierNodeImpl1.MediaMetadataCompat);
            cacheDrawModifierNodeImpl1.write = false;
        }
    }
}
