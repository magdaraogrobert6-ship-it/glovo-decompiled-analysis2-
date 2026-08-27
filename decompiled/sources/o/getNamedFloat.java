package o;

import android.util.TypedValue;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class getNamedFloat extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ getFloat IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getNamedFloat(getFloat getfloat, int i) {
        super(0);
        this.serializer = i;
        this.IconCompatParcelizer = getfloat;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.serializer;
        getFloat getfloat = this.IconCompatParcelizer;
        if (i != 0) {
            int i2 = getFloat.IconCompatParcelizer;
            return Float.valueOf(TypedValue.applyDimension(1, 11.0f, getfloat.getResources().getDisplayMetrics()));
        }
        int i3 = getFloat.IconCompatParcelizer;
        return Float.valueOf(TypedValue.applyDimension(1, 3.0f, getfloat.getResources().getDisplayMetrics()));
    }
}
