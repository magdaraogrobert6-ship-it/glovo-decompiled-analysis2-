package o;

import com.roadrunner.home.CreateHomeScope;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class setPositionOnScreengyyYBs implements accesssetMeasurementConstraintsBRTryo0 {
    public final /* synthetic */ Runnable IconCompatParcelizer;
    public final /* synthetic */ TimeUnit MediaSessionCompatQueueItem;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ setCoordinatesAccessed read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ long write;

    public /* synthetic */ setPositionOnScreengyyYBs(setCoordinatesAccessed setcoordinatesaccessed, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.serializer = i;
        this.read = setcoordinatesaccessed;
        this.IconCompatParcelizer = runnable;
        this.write = j;
        this.RemoteActionCompatParcelizer = j2;
        this.MediaSessionCompatQueueItem = timeUnit;
    }

    @Override // o.accesssetMeasurementConstraintsBRTryo0
    public final ScheduledFuture IconCompatParcelizer(CreateHomeScope createHomeScope) {
        int i = this.serializer;
        Runnable runnable = this.IconCompatParcelizer;
        setCoordinatesAccessed setcoordinatesaccessed = this.read;
        return i != 0 ? setcoordinatesaccessed.RemoteActionCompatParcelizer.scheduleWithFixedDelay(new getCoordinatesAccessed(setcoordinatesaccessed, runnable, createHomeScope, 2), this.write, this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem) : setcoordinatesaccessed.RemoteActionCompatParcelizer.scheduleAtFixedRate(new getCoordinatesAccessed(setcoordinatesaccessed, runnable, createHomeScope, 0), this.write, this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem);
    }
}
