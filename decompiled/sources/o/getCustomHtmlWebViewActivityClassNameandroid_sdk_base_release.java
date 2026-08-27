package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.events.I$b;
import com.sentiance.core.model.thrift.TimeSeriesType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getCustomHtmlWebViewActivityClassNameandroid_sdk_base_release implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        I$b i$b = new I$b(0);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                if (((Boolean) i$b.IconCompatParcelizer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'screen_events' is missing");
                    return null;
                }
                if (((Boolean) i$b.read) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'call_events' is missing");
                    return null;
                }
                if (((Boolean) i$b.serializer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'bluetooth_events' is missing");
                    return null;
                }
                if (((Boolean) i$b.RemoteActionCompatParcelizer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'crash_detection' is missing");
                    return null;
                }
                if (((Short) i$b.write) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location_fix_interval' is missing");
                    return null;
                }
                if (((ArrayList) i$b.MediaDescriptionCompat) != null) {
                    return new getDefaultNotificationChannelNameandroid_sdk_base_release(i$b);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'enabled_sensors' is missing");
                return null;
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b == 2) {
                        i$b.IconCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 2:
                    if (b == 2) {
                        i$b.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 3:
                    if (b == 2) {
                        i$b.serializer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 4:
                    if (b == 2) {
                        i$b.RemoteActionCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 5:
                    if (b == 6) {
                        i$b.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 6:
                    if (b == 15) {
                        int i = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList = new ArrayList(i);
                        for (int i2 = 0; i2 < i; i2++) {
                            int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                            TimeSeriesType timeSeriesTypeFindByValue = TimeSeriesType.findByValue(iMediaSessionCompatToken);
                            if (timeSeriesTypeFindByValue == null) {
                                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type TimeSeriesType: "));
                                return null;
                            }
                            arrayList.add(timeSeriesTypeFindByValue);
                        }
                        i$b.MediaDescriptionCompat = arrayList;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 7:
                    if (b == 13) {
                        int i3 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map = new HashMap(i3);
                        for (int i4 = 0; i4 < i3; i4++) {
                            int iMediaSessionCompatToken2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                            TimeSeriesType timeSeriesTypeFindByValue2 = TimeSeriesType.findByValue(iMediaSessionCompatToken2);
                            if (timeSeriesTypeFindByValue2 == null) {
                                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken2, "Unexpected value for enum-type TimeSeriesType: "));
                                return null;
                            }
                            map.put(timeSeriesTypeFindByValue2, Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction()));
                        }
                        i$b.RatingCompat = map;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 8:
                    if (b == 2) {
                        i$b.MediaMetadataCompat = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 9:
                    if (b == 2) {
                        i$b.MediaBrowserCompatMediaItem = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 10:
                    if (b == 2) {
                        i$b.MediaSessionCompatResultReceiverWrapper = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 11:
                    if (b == 12) {
                        i$b.PlaybackStateCompat = (requestBannersRefreshdefault) requestBannersRefreshdefault.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 12:
                    if (b == 13) {
                        int i5 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map2 = new HashMap(i5);
                        for (int i6 = 0; i6 < i5; i6++) {
                            map2.put(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()), Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction()));
                        }
                        i$b.MediaSessionCompatQueueItem = map2;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                default:
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    break;
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        getDefaultNotificationChannelNameandroid_sdk_base_release getdefaultnotificationchannelnameandroid_sdk_base_release = (getDefaultNotificationChannelNameandroid_sdk_base_release) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
        Boolean bool = getdefaultnotificationchannelnameandroid_sdk_base_release.RemoteActionCompatParcelizer;
        requestBannersRefreshdefault requestbannersrefreshdefault = getdefaultnotificationchannelnameandroid_sdk_base_release.PlaybackStateCompat;
        Boolean bool2 = getdefaultnotificationchannelnameandroid_sdk_base_release.PlaybackStateCompatCustomAction;
        Boolean bool3 = getdefaultnotificationchannelnameandroid_sdk_base_release.MediaMetadataCompat;
        Boolean bool4 = getdefaultnotificationchannelnameandroid_sdk_base_release.MediaDescriptionCompat;
        Map map = getdefaultnotificationchannelnameandroid_sdk_base_release.MediaSessionCompatResultReceiverWrapper;
        Map map2 = getdefaultnotificationchannelnameandroid_sdk_base_release.RatingCompat;
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(bool.booleanValue() ? (byte) 1 : (byte) 0);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 2);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getdefaultnotificationchannelnameandroid_sdk_base_release.write.booleanValue() ? (byte) 1 : (byte) 0);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 2);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getdefaultnotificationchannelnameandroid_sdk_base_release.serializer.booleanValue() ? (byte) 1 : (byte) 0);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 2);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(getdefaultnotificationchannelnameandroid_sdk_base_release.IconCompatParcelizer.booleanValue() ? (byte) 1 : (byte) 0);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 6);
        IconCompatParcelizer.read((byte) 15, 6, r8lambdat7xjd1d4humw0psb7whucfgonss, getdefaultnotificationchannelnameandroid_sdk_base_release.MediaBrowserCompatMediaItem);
        List list = getdefaultnotificationchannelnameandroid_sdk_base_release.MediaSessionCompatQueueItem;
        r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 8, list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(((TimeSeriesType) it.next()).value);
        }
        if (map2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, (byte) 13);
            Iterator itWrite = MediaSessionCompatQueueItem.write(map2, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 8, (byte) 6);
            while (itWrite.hasNext()) {
                Map.Entry entry = (Map.Entry) itWrite.next();
                TimeSeriesType timeSeriesType = (TimeSeriesType) entry.getKey();
                Short sh = (Short) entry.getValue();
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(timeSeriesType.value);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(sh.shortValue());
            }
        }
        if (bool4 != null) {
            MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 8, (byte) 2, bool4);
        }
        if (bool3 != null) {
            MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 9, (byte) 2, bool3);
        }
        if (bool2 != null) {
            MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 10, (byte) 2, bool2);
        }
        if (requestbannersrefreshdefault != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(11, (byte) 12);
            requestBannersRefreshdefault.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, requestbannersrefreshdefault);
        }
        if (map != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(12, (byte) 13);
            Iterator itWrite2 = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 3, (byte) 6);
            while (itWrite2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itWrite2.next();
                Byte b = (Byte) entry2.getKey();
                Short sh2 = (Short) entry2.getValue();
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b.byteValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(sh2.shortValue());
            }
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
