package o;

import com.google.android.gms.common.Feature;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getScaledHandwritingSlop implements accessgetNumPad9cp {
    public final /* synthetic */ Feature[] read;
    public final /* synthetic */ int write;

    public /* synthetic */ getScaledHandwritingSlop(Feature[] featureArr, int i) {
        this.write = i;
        this.read = featureArr;
    }

    @Override // o.accessgetNumPad9cp
    public final Feature[] write() {
        int i = this.write;
        Feature[] featureArr = this.read;
        if (i != 0) {
            Feature[] featureArr2 = OptionalModuleUtils.write;
            return featureArr;
        }
        Feature[] featureArr3 = OptionalModuleUtils.write;
        return featureArr;
    }
}
