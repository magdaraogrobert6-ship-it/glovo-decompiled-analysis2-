package o;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzq;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetScp extends BaseGmsClient {
    public static volatile setMeasurementConstraintsBRTryo0 r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final Set r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account MediaBrowserCompatMediaItem() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set MediaDescriptionCompat() {
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Executor RatingCompat() {
        return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public accessgetScp(Context context, Looper looper, int i, MetricsBatchProcessor metricsBatchProcessor, accessgetNumPad4cp accessgetnumpad4cp, accessgetNumPadDeletecp accessgetnumpaddeletecp, int i2) {
        zzq zzqVar = zzq.read(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(accessgetnumpad4cp);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(accessgetnumpaddeletecp);
        super(context, looper, zzqVar, googleApiAvailability, i, new accessgetSpacebarcp(accessgetnumpad4cp), new accessgetSpacebarcp(accessgetnumpaddeletecp), (String) metricsBatchProcessor.read);
        Set set = (Set) metricsBatchProcessor.serializer;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = set;
        if (r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ == null) {
            synchronized (accessgetScp.class) {
                if (r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ == null) {
                    context.getPackageName();
                    r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = setMeasurementConstraintsBRTryo0.IconCompatParcelizer(context);
                }
            }
        }
    }
}
