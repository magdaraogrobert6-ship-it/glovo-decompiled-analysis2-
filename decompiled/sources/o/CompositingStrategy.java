package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositingStrategy extends getSrcBrush {
    public final /* synthetic */ ImageKt serializer;
    public final /* synthetic */ accessgetAutocp write;

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public final void write(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        ((ArrayList) this.serializer.get(this.write.RemoteActionCompatParcelizer)).remove(colorSpaceVerificationHelperExternalSyntheticLambda0);
        colorSpaceVerificationHelperExternalSyntheticLambda0.write(this);
    }

    public CompositingStrategy(accessgetAutocp accessgetautocp, ImageKt imageKt) {
        this.write = accessgetautocp;
        this.serializer = imageKt;
    }
}
