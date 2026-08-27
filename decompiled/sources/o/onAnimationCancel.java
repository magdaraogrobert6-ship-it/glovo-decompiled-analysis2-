package o;

import com.roadrunner.liveness.recording.data.ChallengesRepository;
import com.roadrunner.liveness.recording.domain.LogUnexpectedLivenessError;

/* JADX INFO: loaded from: classes3.dex */
public final class onAnimationCancel implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final mergeJsonObjects read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ onAnimationCancel(mergeJsonObjects mergejsonobjects, int i) {
        this.serializer = i;
        this.read = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.serializer == 0) {
            return new LogUnexpectedLivenessError((ChallengesRepository) this.read.write());
        }
        LogUnexpectedLivenessError logUnexpectedLivenessError = new LogUnexpectedLivenessError((transferSessionPackageI) this.read.write());
        int i4 = IconCompatParcelizer + 33;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return logUnexpectedLivenessError;
    }
}
