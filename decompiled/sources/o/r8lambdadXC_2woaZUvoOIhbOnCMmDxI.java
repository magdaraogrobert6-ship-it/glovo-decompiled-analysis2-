package o;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdadXC_2woaZUvoOIhbOnCMmDxI extends getSrcBrush {
    public final ViewGroup read;
    public boolean serializer = false;

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public final void read() {
        getModulateAlphaNrFUSI.serializer(this.read, false);
    }

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public final void serializer() {
        getModulateAlphaNrFUSI.serializer(this.read, true);
    }

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public final void serializer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        getModulateAlphaNrFUSI.serializer(this.read, false);
        this.serializer = true;
    }

    public r8lambdadXC_2woaZUvoOIhbOnCMmDxI(ViewGroup viewGroup) {
        this.read = viewGroup;
    }

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public final void write(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        if (!this.serializer) {
            getModulateAlphaNrFUSI.serializer(this.read, false);
        }
        colorSpaceVerificationHelperExternalSyntheticLambda0.write(this);
    }
}
