package o;

import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.liveness.recording.domain.detectMovement.DetectSmile;

/* JADX INFO: loaded from: classes3.dex */
public final class getProgressViewStartOffset implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final getSharedElementTargetNames write;

    public /* synthetic */ getProgressViewStartOffset(getSharedElementTargetNames getsharedelementtargetnames, int i) {
        this.IconCompatParcelizer = i;
        this.write = getsharedelementtargetnames;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = serializer + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        getSharedElementTargetNames getsharedelementtargetnames = this.write;
        if (i4 == 0) {
            return new DetectSmile((SendTestPushUseCase) getsharedelementtargetnames.write(), 0);
        }
        DetectSmile detectSmile = new DetectSmile((SendTestPushUseCase) getsharedelementtargetnames.write(), 1);
        int i5 = RemoteActionCompatParcelizer + 125;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return detectSmile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
