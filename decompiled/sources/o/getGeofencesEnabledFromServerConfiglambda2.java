package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.WrongWayDrivingDetectionState;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "WrongWayDrivingEventsDetector")
public final class getGeofencesEnabledFromServerConfiglambda2 extends r8lambda9v2QuFK54eeNQIaiI9IZ0Hd1X3M {
    private static final Set<TransportChangeType> RemoteActionCompatParcelizer;
    private final parseLonglambda0 IconCompatParcelizer;
    private final BrazeGeofenceManagerCompanion serializer;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.r8lambda9v2QuFK54eeNQIaiI9IZ0Hd1X3M
    public final r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ IconCompatParcelizer(TransportChangeType transportChangeType, ArrayList arrayList) {
        boolean zContains = RemoteActionCompatParcelizer.contains(transportChangeType);
        parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
        if (!zContains) {
            parselonglambda0.IconCompatParcelizer("Wrong way driving detection is not supported for transport type: %s", transportChangeType);
            r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.RemoteActionCompatParcelizer.getClass();
            return r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.read.RemoteActionCompatParcelizer();
        }
        if (arrayList.size() < 2) {
            parselonglambda0.IconCompatParcelizer("Not enough waypoints to detect wrong way driving events.", new Object[0]);
            r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.RemoteActionCompatParcelizer.getClass();
            return r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.read.RemoteActionCompatParcelizer();
        }
        List listWrite = this.serializer.write(arrayList);
        if (listWrite != null) {
            r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.RemoteActionCompatParcelizer.getClass();
            return new r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ(WrongWayDrivingDetectionState.DETECTED, listWrite);
        }
        parselonglambda0.IconCompatParcelizer("Wrong way driving detection could not be completed.", new Object[0]);
        r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.RemoteActionCompatParcelizer.getClass();
        return r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.read.RemoteActionCompatParcelizer();
    }

    static {
        new read(null);
        RemoteActionCompatParcelizer = onContentCardClicked.MediaSessionCompatQueueItem(new TransportChangeType[]{TransportChangeType.TRANSPORT_CAR, TransportChangeType.TRANSPORT_MOTORCYCLE, TransportChangeType.TRANSPORT_BUS, TransportChangeType.TRANSPORT_VEHICLE});
    }

    public getGeofencesEnabledFromServerConfiglambda2(parseLonglambda0 parselonglambda0, BrazeGeofenceManagerCompanion brazeGeofenceManagerCompanion) {
        parselonglambda0.getClass();
        brazeGeofenceManagerCompanion.getClass();
        this.IconCompatParcelizer = parselonglambda0;
        this.serializer = brazeGeofenceManagerCompanion;
    }
}
