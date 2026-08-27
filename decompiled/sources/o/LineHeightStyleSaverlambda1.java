package o;

import com.roadrunner.delivery.accept.acceptbutton.domain.AcceptButtonCountdownTimer$startCountdown$1;
import j$.time.DesugarDuration;
import java.time.Clock;
import java.time.Duration;
import java.time.ZonedDateTime;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightStyleSaverlambda1 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final Clock RemoteActionCompatParcelizer;

    public LineHeightStyleSaverlambda1(Clock clock) {
        this.RemoteActionCompatParcelizer = clock;
    }

    public final Flow write(ZonedDateTime zonedDateTime, long j) {
        int i = 2 % 2;
        Flow flow = FlowKt.read(new AcceptButtonCountdownTimer$startCountdown$1(DesugarDuration.toSeconds(Duration.between(ZonedDateTime.now(this.RemoteActionCompatParcelizer).withNano(0), zonedDateTime.withNano(0))), j, null));
        int i2 = read + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return flow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
