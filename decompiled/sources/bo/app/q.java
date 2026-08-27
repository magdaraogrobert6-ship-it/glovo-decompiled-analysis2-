package bo.app;

import com.braze.models.Banner;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.Map;
import java.util.Set;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final com.braze.storage.a a;

    public q(com.braze.storage.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public final boolean a(Banner banner, Long l, Map map) {
        Long l2;
        if (l == null || (l2 = (Long) map.get(banner.getPlacementId())) == null) {
            return true;
        }
        long jLongValue = l2.longValue();
        if (jLongValue <= l.longValue()) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q$$ExternalSyntheticLambda1(banner, jLongValue, l, 0), 6, (Object) null);
        return false;
    }

    public static final String b(Banner banner) {
        String placementId = banner.getPlacementId();
        long expirationTimestampSeconds = banner.getExpirationTimestampSeconds();
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Filtering expired banner for placement ", placementId, expirationTimestampSeconds, ": expirationTimestampSeconds=");
        sbM.append(", now=");
        sbM.append(jNowInSeconds);
        return sbM.toString();
    }

    public static final String a(Banner banner, long j, Long l) {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Filtering stale banner for placement ", banner.getPlacementId(), j, ": lastRequestTime=");
        sbM.append(" > responseRequestTime=");
        sbM.append(l);
        return sbM.toString();
    }

    public final boolean a(Banner banner, Set set) {
        String stableKey = banner.getStableKey();
        if (stableKey == null || !set.contains(stableKey)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q$$ExternalSyntheticLambda2(banner, stableKey), 6, (Object) null);
        return false;
    }

    public static final String a(Banner banner, String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Filtering dismissed banner for placement ", banner.getPlacementId(), ": stableKey=", str, " has an unacknowledged pending dismissal");
    }

    public final boolean a(Banner banner) {
        if (!banner.isExpired()) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda6(banner, 5), 6, (Object) null);
        return false;
    }
}
