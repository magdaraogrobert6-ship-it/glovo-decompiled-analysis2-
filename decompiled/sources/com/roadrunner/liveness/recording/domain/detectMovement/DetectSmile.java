package com.roadrunner.liveness.recording.domain.detectMovement;

import androidx.compose.ui.graphics.Fields;
import com.google.mlkit.vision.face.Face;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.liveness.recording.data.ChallengesRepository;
import o.RoomOpenHelperDelegate;
import o.finishSpinner;
import o.moveSpinner;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DetectSmile {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final SendTestPushUseCase read;
    public boolean write;

    public DetectSmile(SendTestPushUseCase sendTestPushUseCase, int i) {
        this.RemoteActionCompatParcelizer = i;
        sendTestPushUseCase.getClass();
        if (i != 1) {
            this.read = sendTestPushUseCase;
        } else {
            this.read = sendTestPushUseCase;
        }
    }

    public final RoomOpenHelperDelegate RemoteActionCompatParcelizer(Face face) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        SendTestPushUseCase sendTestPushUseCase = this.read;
        if (i2 != 0) {
            float f = face.MediaMetadataCompat;
            finishSpinner finishspinner = ((ChallengesRepository) sendTestPushUseCase.serializer).RemoteActionCompatParcelizer.headMovement;
            if (this.write) {
                if (f <= finishspinner.rightFacing || f >= finishspinner.leftFacing) {
                    return null;
                }
                this.write = false;
                return null;
            }
            if (f >= finishspinner.left) {
                this.write = true;
                return RoomOpenHelperDelegate.HeadLeft;
            }
            if (f > finishspinner.right) {
                return null;
            }
            int i3 = serializer + 73;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                this.write = false;
            } else {
                this.write = true;
            }
            return RoomOpenHelperDelegate.HeadRight;
        }
        float f2 = face.write;
        Float fValueOf = (f2 < 0.0f || f2 > 1.0f) ? null : Float.valueOf(f2);
        if (fValueOf == null) {
            Timber.RemoteActionCompatParcelizer.write(new SmileProbabilityNullException("Smile probability is null. Please check the FaceDetectorOptions for more configuration options", null));
            return null;
        }
        int i4 = IconCompatParcelizer + 27;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        float fFloatValue = fValueOf.floatValue();
        moveSpinner movespinner = ((ChallengesRepository) sendTestPushUseCase.serializer).RemoteActionCompatParcelizer.mouthExpression;
        boolean z = this.write;
        if (!z && fFloatValue > movespinner.smile) {
            this.write = true;
            return RoomOpenHelperDelegate.Smile;
        }
        if ((!z) || fFloatValue >= movespinner.serious) {
            return null;
        }
        this.write = false;
        return null;
    }
}
