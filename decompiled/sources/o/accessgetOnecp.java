package o;

import com.google.android.gms.common.Feature;
import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetOnecp {
    public final Feature IconCompatParcelizer;
    public final accessgetNumPadDividecp serializer;

    public final /* synthetic */ Feature IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final /* synthetic */ accessgetNumPadDividecp RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer, this.IconCompatParcelizer});
    }

    public final String toString() {
        accessgetGreencp accessgetgreencp = new accessgetGreencp(this);
        accessgetgreencp.IconCompatParcelizer(this.serializer, "key");
        accessgetgreencp.IconCompatParcelizer(this.IconCompatParcelizer, com.deliveryhero.fwf_cache.UtilKt.FEATURE_CACHE_KEY_PREFIX);
        return accessgetgreencp.toString();
    }

    public /* synthetic */ accessgetOnecp(accessgetNumPadDividecp accessgetnumpaddividecp, Feature feature) {
        this.serializer = accessgetnumpaddividecp;
        this.IconCompatParcelizer = feature;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof accessgetOnecp)) {
            return false;
        }
        accessgetOnecp accessgetonecp = (accessgetOnecp) obj;
        return TuplesKt.write(this.serializer, accessgetonecp.serializer) && TuplesKt.write(this.IconCompatParcelizer, accessgetonecp.IconCompatParcelizer);
    }
}
