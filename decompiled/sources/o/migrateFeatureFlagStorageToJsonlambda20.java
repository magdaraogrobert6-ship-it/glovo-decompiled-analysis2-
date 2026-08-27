package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.DateTime;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TimelineUtil")
public class migrateFeatureFlagStorageToJsonlambda20 {
    private final setHeaderTextColor RemoteActionCompatParcelizer;

    public migrateFeatureFlagStorageToJsonlambda20(parseLonglambda0 parselonglambda0, setHeaderTextColor setheadertextcolor) {
        this.RemoteActionCompatParcelizer = setheadertextcolor;
    }

    public static DateTime read(Long l, List list) {
        accessgetClickLoggedp accessgetclickloggedp;
        long jLongValue = l.longValue();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            accessgetclickloggedp = (accessgetClickLoggedp) it.next();
            if (accessgetclickloggedp.PlaybackStateCompatCustomAction() < jLongValue) {
                return new DateTime(l.longValue(), accessgetclickloggedp.read(), accessgetclickloggedp.serializer());
            }
        }
        DateTime dateTimeNow = DateTime.now();
        accessgetclickloggedp = new accessgetClickLoggedp("", jLongValue - 1, 0L, (short) dateTimeNow.getTimezoneOffsetInMinutes(), dateTimeNow.getTimezoneId(), dateTimeNow.getEpochTime(), dateTimeNow.getEpochTime());
        return new DateTime(l.longValue(), accessgetclickloggedp.read(), accessgetclickloggedp.serializer());
    }

    public final DateTime read(Long l) {
        return read(l, write());
    }

    public final List<accessgetClickLoggedp> write() {
        return this.RemoteActionCompatParcelizer.read(getAssetUrls.read(), new WhereClause(), (Integer) null, migrateSealedSessionsMapToJsonlambda10.RemoteActionCompatParcelizer("event_time", "DESC"));
    }
}
