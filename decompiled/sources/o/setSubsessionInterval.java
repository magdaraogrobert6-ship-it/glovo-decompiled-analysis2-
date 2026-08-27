package o;

import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.state.data.RiderStatusSyncWorker;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class setSubsessionInterval {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final GetAppStateImpl serializer;

    public setSubsessionInterval(GetAppStateImpl getAppStateImpl) {
        this.serializer = getAppStateImpl;
    }

    public final void write(Calendar calendar) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (calendar == null) {
            return;
        }
        Calendar calendar2 = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        long timeInMillis2 = calendar2.getTimeInMillis();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Scheduling worker for Sync , nextSyncTime is " + calendar.getTime(), new Object[0]);
        long jMax = Math.max(0L, timeInMillis - timeInMillis2);
        androidx.work.impl.WorkManagerImpl workManagerImpl = (androidx.work.impl.WorkManagerImpl) this.serializer.serializer;
        accesssetColorFilterjd accesssetcolorfilterjd = accesssetColorFilterjd.REPLACE;
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(RiderStatusSyncWorker.class);
        setCompositingStrategyaDBOjCE setcompositingstrategyadbojce = setCompositingStrategyaDBOjCE.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setCompositingStrategyaDBOjCE setcompositingstrategyadbojce2 = setCompositingStrategyaDBOjCE.CONNECTED;
        setcompositingstrategyadbojce2.getClass();
        ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).read = new toolingGraphicsLayer(new drawOutlinehn5TExg(null), setcompositingstrategyadbojce2, false, false, false, false, -1L, -1L, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(linkedHashSet));
        workManagerImpl.serializer("rider_safety_status_sync_work", accesssetcolorfilterjd, r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer(jMax, TimeUnit.MILLISECONDS).read(GraphicsLayerScope.EXPONENTIAL, 30000L).RemoteActionCompatParcelizer());
    }
}
