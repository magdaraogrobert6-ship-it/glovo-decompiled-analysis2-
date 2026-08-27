package com.incognia.internal;

import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.sentiance.sdk.payload.submission.PayloadSubmitter;
import o.CacheDrawModifierNodeImpl1;
import o.DrawModifierNodeKt;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.VideoQualityQuirk;
import o.getLastBaselineToBottomHeight;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.parseNonBlankStringlambda0;
import o.setContentDrawScopeui;
import o.setTextFuture;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pNP$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ pNP$$ExternalSyntheticLambda5(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.$r8$classId;
        if (i == 0) {
            pNP.mbG((Throwable) this.f$0, this.f$1);
            return;
        }
        int i2 = 0;
        if (i == 1) {
            Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) this.f$0;
            boolean z = this.f$1;
            camera2CameraImpl.ComponentActivity = z;
            if (z) {
                if (camera2CameraImpl._init_lambda1 == setTextFuture.PENDING_OPEN || camera2CameraImpl._init_lambda1 == setTextFuture.OPENING_WITH_ERROR) {
                    camera2CameraImpl.read(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                PayloadSubmitter.read((PayloadSubmitter) this.f$0, this.f$1);
                return;
            } else {
                parseNonBlankStringlambda0.write((parseNonBlankStringlambda0) this.f$0, this.f$1);
                return;
            }
        }
        CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1 = (CacheDrawModifierNodeImpl1) this.f$0;
        boolean z2 = this.f$1;
        if (cacheDrawModifierNodeImpl1.read == z2) {
            return;
        }
        cacheDrawModifierNodeImpl1.read = z2;
        if (!z2) {
            CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("The camera control has became inactive.");
            onDrawWithContent ondrawwithcontent = (onDrawWithContent) cacheDrawModifierNodeImpl1.IconCompatParcelizer;
            if (ondrawwithcontent != null) {
                ondrawwithcontent.serializer(cameraControl$OperationCanceledException);
                cacheDrawModifierNodeImpl1.IconCompatParcelizer = null;
                return;
            }
            return;
        }
        if (cacheDrawModifierNodeImpl1.write) {
            Camera2CameraControlImpl camera2CameraControlImpl = (Camera2CameraControlImpl) cacheDrawModifierNodeImpl1.RemoteActionCompatParcelizer;
            camera2CameraControlImpl.getClass();
            onDrawWithContent ondrawwithcontent2 = new onDrawWithContent();
            ondrawwithcontent2.IconCompatParcelizer = new setContentDrawScopeui();
            onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent2);
            ondrawwithcontent2.read = ondrawbehind;
            ondrawwithcontent2.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
            try {
                camera2CameraControlImpl.MediaDescriptionCompat.execute(new getLastBaselineToBottomHeight(camera2CameraControlImpl, ondrawwithcontent2, i2));
                ondrawwithcontent2.RemoteActionCompatParcelizer = "updateSessionConfigAsync";
            } catch (Exception e) {
                ondrawbehind.write(e);
            }
            VideoQualityQuirk.write((DrawModifierNodeKt) ondrawbehind).RemoteActionCompatParcelizer(new Preview$$ExternalSyntheticLambda0(10, cacheDrawModifierNodeImpl1), (PreviewFreezeAfterHighSpeedRecordingQuirk) cacheDrawModifierNodeImpl1.MediaMetadataCompat);
            cacheDrawModifierNodeImpl1.write = false;
        }
    }
}
