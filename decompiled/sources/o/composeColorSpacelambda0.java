package o;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class composeColorSpacelambda0 implements obtainAndroidColorSpace {
    public final /* synthetic */ View IconCompatParcelizer;
    public final /* synthetic */ ArrayList write;

    @Override // o.obtainAndroidColorSpace
    public final void read() {
    }

    @Override // o.obtainAndroidColorSpace
    public final void serializer() {
    }

    @Override // o.obtainAndroidColorSpace
    public final void serializer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
    }

    public composeColorSpacelambda0(View view, ArrayList arrayList) {
        this.IconCompatParcelizer = view;
        this.write = arrayList;
    }

    @Override // o.obtainAndroidColorSpace
    public final void IconCompatParcelizer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        colorSpaceVerificationHelperExternalSyntheticLambda0.write(this);
        colorSpaceVerificationHelperExternalSyntheticLambda0.read(this);
    }

    @Override // o.obtainAndroidColorSpace
    public final void write(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        colorSpaceVerificationHelperExternalSyntheticLambda0.write(this);
        this.IconCompatParcelizer.setVisibility(8);
        ArrayList arrayList = this.write;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }
}
