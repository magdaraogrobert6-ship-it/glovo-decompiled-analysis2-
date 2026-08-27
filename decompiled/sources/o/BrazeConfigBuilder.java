package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TimeSeriesType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeConfigBuilder implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        O$b o$b = new O$b();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return o$b.RatingCompat();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    int i = 0;
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            } else if (b == 13) {
                                int i2 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                                HashMap map = new HashMap(i2);
                                while (i < i2) {
                                    map.put(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()), Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer()));
                                    i++;
                                }
                                o$b.IconCompatParcelizer = map;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                        } else if (b == 15) {
                            int i3 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                            ArrayList arrayList = new ArrayList(i3);
                            for (int i4 = 0; i4 < i3; i4++) {
                                int i5 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList2 = new ArrayList(i5);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    arrayList2.add(Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction()));
                                }
                                arrayList.add(arrayList2);
                            }
                            o$b.read = arrayList;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 15) {
                        int i7 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList3 = new ArrayList(i7);
                        while (i < i7) {
                            arrayList3.add(Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken()));
                            i++;
                        }
                        o$b.serializer = arrayList3;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 10) {
                    o$b.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 8) {
                int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                TimeSeriesType timeSeriesTypeFindByValue = TimeSeriesType.findByValue(iMediaSessionCompatToken);
                if (timeSeriesTypeFindByValue == null) {
                    MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type TimeSeriesType: "));
                    return null;
                }
                o$b.RemoteActionCompatParcelizer = timeSeriesTypeFindByValue;
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        createNotification createnotification = (createNotification) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
        TimeSeriesType timeSeriesType = createnotification.read;
        Map map = createnotification.MediaSessionCompatQueueItem;
        List list = createnotification.IconCompatParcelizer;
        List list2 = createnotification.RemoteActionCompatParcelizer;
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(timeSeriesType.value);
        Long l = createnotification.serializer;
        if (l != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 10);
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l.longValue());
        }
        if (list2 != null) {
            Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 15, list2, (byte) 8);
            while (itWrite.hasNext()) {
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(((Integer) itWrite.next()).intValue());
            }
        }
        if (list != null) {
            Iterator itWrite2 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 15, list, (byte) 15);
            while (itWrite2.hasNext()) {
                List list3 = (List) itWrite2.next();
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 6, list3.size());
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Short) it.next()).shortValue());
                }
            }
        }
        if (map != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 13);
            Iterator itWrite3 = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 3, (byte) 10);
            while (itWrite3.hasNext()) {
                Map.Entry entry = (Map.Entry) itWrite3.next();
                Byte b = (Byte) entry.getKey();
                Long l2 = (Long) entry.getValue();
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b.byteValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l2.longValue());
            }
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
