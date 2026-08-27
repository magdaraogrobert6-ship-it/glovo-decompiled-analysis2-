package o;

import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldSkipDump {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final setTransactionSuccessful serializer;

    public /* synthetic */ shouldSkipDump(setTransactionSuccessful settransactionsuccessful) {
        this.serializer = settransactionsuccessful;
    }

    public String serializer(long j) {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        int i = 2 % 2;
        if (j < 0) {
            int i2 = write + 109;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            j = i2 % 2 != 0 ? 1L : 0L;
        }
        long seconds = j - TimeUnit.DAYS.toSeconds(j / ConstantsKt.DEFAULT_PROFILE_TTL);
        long j2 = seconds / 3600;
        long seconds2 = ((seconds - TimeUnit.HOURS.toSeconds(j2)) + 30) / 60;
        if (seconds2 == 60) {
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Long.valueOf(j2 + 1), 0L);
        } else {
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Long.valueOf(j2), Long.valueOf(seconds2));
        }
        long jLongValue = ((Number) onviewattachedtowindowlambda0.serializer).longValue();
        long jLongValue2 = ((Number) onviewattachedtowindowlambda0.write).longValue();
        setTransactionSuccessful settransactionsuccessful = this.serializer;
        String strRemoteActionCompatParcelizer = settransactionsuccessful.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.plurals.min_symbol, (int) jLongValue2);
        String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.symbol_hour);
        if (jLongValue > 0) {
            int i3 = RemoteActionCompatParcelizer + 75;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (jLongValue2 > 0) {
                return String.format(java.util.Locale.getDefault(), "%d%s %d %s", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue), strIconCompatParcelizer, Long.valueOf(jLongValue2), strRemoteActionCompatParcelizer}, 4));
            }
        }
        if (jLongValue > 0) {
            return String.format(java.util.Locale.getDefault(), "%d%s", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue), strIconCompatParcelizer}, 2));
        }
        return String.format(java.util.Locale.getDefault(), "%d %s", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue2), strRemoteActionCompatParcelizer}, 2));
    }
}
