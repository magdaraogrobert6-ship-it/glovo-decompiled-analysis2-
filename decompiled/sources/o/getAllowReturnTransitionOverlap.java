package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class getAllowReturnTransitionOverlap implements getColorIntegerOrNulllambda0 {
    private static int read = 1;
    private static int serializer;
    public final isEqualTo IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ getAllowReturnTransitionOverlap(isEqualTo isequalto, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = isequalto;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        isEqualTo isequalto = this.IconCompatParcelizer;
        if (i3 == 0) {
            return new SaveHeatmapUrlImpl((Set) isequalto.write());
        }
        Object objWrite = isequalto.write();
        objWrite.getClass();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        for (q5 q5Var : (Set) objWrite) {
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = q5Var.read;
            r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic r8lambdaaj64ozvyd1y4rkhljsx10f9buic = new r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(1, q5Var.serializer);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map5.get(r8lambdaucgighn8fiyv_vccodeafjfpedk);
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null && !r8lambdaunavo3sxub_pc9xroryotnrlvsm.equals(r8lambdaaj64ozvyd1y4rkhljsx10f9buic)) {
                getOffVariationName.read("Default deserializers provider for ", r8lambdaucgighn8fiyv_vccodeafjfpedk, " is already registered: ", r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                int i4 = read + 5;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            }
            map5.put(r8lambdaucgighn8fiyv_vccodeafjfpedk, r8lambdaaj64ozvyd1y4rkhljsx10f9buic);
        }
        return new prepareInAppMessageWithZippedAssetHtml(map, map2, map3, map4, map5, false);
    }
}
