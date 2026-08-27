package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.ondevice.timeline.TimelineTransportType;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class getImageProperty extends r8lambdaYWOQ3gpsLjVFVvkWRMRtjqcgLQY {
    private final setHeaderTextColor write;

    public getImageProperty(setHeaderTextColor setheadertextcolor) {
        setheadertextcolor.getClass();
        this.write = setheadertextcolor;
    }

    @Override // o.r8lambdaYWOQ3gpsLjVFVvkWRMRtjqcgLQY
    public final TimelineTransportType read(List<? extends TimelineTransportType> list) {
        TransportChangeType transportChangeType;
        list.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i = getTimestampProperty.IconCompatParcelizer[((TimelineTransportType) it.next()).ordinal()];
            if (i == 1) {
                transportChangeType = TransportChangeType.TRANSPORT_CAR;
            } else if (i == 2) {
                transportChangeType = TransportChangeType.TRANSPORT_BIKING;
            } else {
                if (i != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                transportChangeType = TransportChangeType.TRANSPORT_MOTORCYCLE;
            }
            arrayList.add(Integer.valueOf(transportChangeType.value));
        }
        List list2 = this.write.read((isPushPrimer) InAppMessageFull.read(), WhereClause.serializer("type").read(arrayList), (Integer) 1, migrateSealedSessionsMapToJsonlambda10.RemoteActionCompatParcelizer("event_time", "DESC"));
        list2.getClass();
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) onContentCardDismissed.MediaMetadataCompat(list2);
        TransportChangeType transportChangeType2 = r8lambdali8uu9krigfjg6en6xj7af4cwaq != null ? r8lambdali8uu9krigfjg6en6xj7af4cwaq.read() : null;
        int i2 = transportChangeType2 == null ? -1 : getTimestampProperty.write[transportChangeType2.ordinal()];
        if (i2 == 1) {
            return TimelineTransportType.CAR;
        }
        if (i2 == 2) {
            return TimelineTransportType.BIKE;
        }
        if (i2 != 3) {
            return null;
        }
        return TimelineTransportType.MOTORCYCLE;
    }
}
