package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaHRoBInzy5p0D_Sd1bkVgpTt9zlE extends r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk {
    private final List<int[]> serializer;

    public final ArrayList read() {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : this.serializer) {
            float[] fArr = new float[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                fArr[i] = iArr[i];
            }
            arrayList.add(fArr);
        }
        return arrayList;
    }

    public r8lambdaHRoBInzy5p0D_Sd1bkVgpTt9zlE(List<int[]> list) {
        this.serializer = list;
    }
}
