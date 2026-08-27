package o;

import androidx.room.RoomDatabase$$ExternalSyntheticLambda4;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class writeGlobalPartnerParametersI {
    private static int serializer = 1;
    private static int write;
    public final addGlobalPartnerParameterI RemoteActionCompatParcelizer;
    public final ConcurrentHashMap IconCompatParcelizer = new ConcurrentHashMap();
    public volatile long read = Long.MIN_VALUE;

    public writeGlobalPartnerParametersI(addGlobalPartnerParameterI addglobalpartnerparameteri) {
        this.RemoteActionCompatParcelizer = addglobalpartnerparameteri;
    }

    public final boolean serializer(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i = 2 % 2;
        long jLongValue = ((Number) this.RemoteActionCompatParcelizer.get()).longValue();
        if (jLongValue != this.read) {
            int i2 = write + 121;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.IconCompatParcelizer.clear();
            this.read = jLongValue;
        }
        Object objComputeIfAbsent = this.IconCompatParcelizer.computeIfAbsent(str, new writeEventMetadataI(new RoomDatabase$$ExternalSyntheticLambda4(2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), 0));
        objComputeIfAbsent.getClass();
        boolean zBooleanValue = ((Boolean) objComputeIfAbsent).booleanValue();
        int i4 = write + 7;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zBooleanValue;
    }
}
