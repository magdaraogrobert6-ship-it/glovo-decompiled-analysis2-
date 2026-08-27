package o;

import com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class initlambda20 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final Clock write;

    public initlambda20(Clock clock) {
        this.write = clock;
    }

    public final Flow RemoteActionCompatParcelizer(Instant instant) {
        int i = 2 % 2;
        instant.getClass();
        long millis = Duration.between(this.write.instant(), instant).toMillis();
        if (millis < 0) {
            int i2 = serializer + 91;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            millis = 0;
        }
        if (millis <= 0) {
            return FlowKt.serializer();
        }
        Flow flow = FlowKt.read(new LogTooLongNavigationLoading$invoke$2(millis, null, 1));
        int i4 = serializer + 23;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return flow;
    }
}
