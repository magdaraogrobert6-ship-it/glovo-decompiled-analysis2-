package o;

import com.roadrunner.delivery.accept.countdown.implementation.data.CountdownTimer$startCountdown$1;
import j$.time.DesugarDuration;
import java.time.Clock;
import java.time.Duration;
import java.time.ZonedDateTime;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getCollapsedimpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final Clock read;
    public final shouldSkipDump serializer;

    public getCollapsedimpl(shouldSkipDump shouldskipdump, Clock clock) {
        this.serializer = shouldskipdump;
        this.read = clock;
    }

    public final Flow RemoteActionCompatParcelizer(ZonedDateTime zonedDateTime, int i) {
        int i2 = 2 % 2;
        zonedDateTime.getClass();
        Flow flow = FlowKt.read(new CountdownTimer$startCountdown$1((int) DesugarDuration.toSeconds(Duration.between(ZonedDateTime.now(this.read).withNano(0), zonedDateTime.withNano(0))), i, this, null));
        int i3 = write + 11;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return flow;
    }
}
