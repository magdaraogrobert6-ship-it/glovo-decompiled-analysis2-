package o;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class useConnection implements TemporalQuery {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int read;

    @Override // java.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = 2 % 2;
        int i2 = serializer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        if (i4 != 0) {
            return i4 != 1 ? LocalDateTime.from(temporalAccessor) : ZonedDateTime.from(temporalAccessor);
        }
        ZonedDateTime zonedDateTimeFrom = ZonedDateTime.from(temporalAccessor);
        int i5 = write + 75;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return zonedDateTimeFrom;
    }
}
