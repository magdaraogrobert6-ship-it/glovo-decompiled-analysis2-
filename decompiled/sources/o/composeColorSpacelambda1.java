package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class composeColorSpacelambda1 extends getSrcBrush {
    public final /* synthetic */ ArrayList IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.transition.FragmentTransitionSupport read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ ArrayList write;

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public final void IconCompatParcelizer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        androidx.transition.FragmentTransitionSupport fragmentTransitionSupport = this.read;
        Object obj = this.RemoteActionCompatParcelizer;
        if (obj != null) {
            fragmentTransitionSupport.read(obj, this.IconCompatParcelizer, null);
        }
        Object obj2 = this.serializer;
        if (obj2 != null) {
            fragmentTransitionSupport.read(obj2, this.write, null);
        }
    }

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public final void write(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        colorSpaceVerificationHelperExternalSyntheticLambda0.write(this);
    }

    public composeColorSpacelambda1(androidx.transition.FragmentTransitionSupport fragmentTransitionSupport, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.read = fragmentTransitionSupport;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = arrayList;
        this.serializer = obj2;
        this.write = arrayList2;
    }
}
