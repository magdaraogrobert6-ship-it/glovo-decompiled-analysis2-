package o;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.perf.transport.RateLimiter$RateLimiterImpl;
import com.google.firebase.perf.v1.PerfSession;
import java.util.List;
import java.util.Random;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class recalculateWindowViewTransforms {
    public final RateLimiter$RateLimiterImpl IconCompatParcelizer;
    public final double RemoteActionCompatParcelizer;
    public final double read;
    public final RateLimiter$RateLimiterImpl serializer;
    public final accesssetAddChangeCallbackMethodcp write;

    public static boolean RemoteActionCompatParcelizer(List list) {
        return list.size() > 0 && ((PerfSession) list.get(0)).getSessionVerbosityCount() > 0 && ((PerfSession) list.get(0)).getSessionVerbosity(0) == get_autofillManagerui.GAUGES_AND_SYSTEM_EVENTS;
    }

    public recalculateWindowViewTransforms(Context context, rotateRad0AR0LA0default rotaterad0ar0la0default) {
        getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4 = new getIntentArrayWithConfiguredBackStacklambda4(29);
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer = accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = null;
        this.serializer = null;
        if (0.0d > dNextDouble || dNextDouble >= 1.0d) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            this.read = dNextDouble;
            this.RemoteActionCompatParcelizer = dNextDouble2;
            this.write = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer;
            this.IconCompatParcelizer = new RateLimiter$RateLimiterImpl(rotaterad0ar0la0default, getintentarraywithconfiguredbackstacklambda4, accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer, "Trace");
            this.serializer = new RateLimiter$RateLimiterImpl(rotaterad0ar0la0default, getintentarraywithconfiguredbackstacklambda4, accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer, "Network");
            RangesKt.serializer(context);
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        throw null;
    }
}
