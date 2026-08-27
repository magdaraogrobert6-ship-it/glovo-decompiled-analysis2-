package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.CustomEventSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class addToSubscriptionGrouplambda0 implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q = new r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                if (((String) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'id' is missing");
                    return null;
                }
                if (((Long) r8lambdabirsljoagmyxhikohl5z5hht12q.serializer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'created_at' is missing");
                    return null;
                }
                if (((Long) r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'event_start_time' is missing");
                    return null;
                }
                if (((String) r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
                    return null;
                }
                if (((CustomEventSource) r8lambdabirsljoagmyxhikohl5z5hht12q.write) != null) {
                    return new addAliaslambda0(r8lambdabirsljoagmyxhikohl5z5hht12q);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'source' is missing");
                return null;
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 2:
                    if (b != 10) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.serializer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    }
                    break;
                case 3:
                    if (b != 10) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    }
                    break;
                case 4:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 5:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        CustomEventSource customEventSourceFindByValue = CustomEventSource.findByValue(iMediaSessionCompatToken);
                        if (customEventSourceFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type CustomEventSource: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.write = customEventSourceFindByValue;
                    }
                    break;
                case 6:
                    if (b != 10) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.read = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    }
                    break;
                case 7:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 8:
                    if (b != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    }
                    break;
                case 9:
                    if (b != 12) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat = (setHomeCitylambda1) setHomeCitylambda1.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    }
                    break;
                case 10:
                    if (b != 13) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map = new HashMap(i);
                        int iWrite = 0;
                        while (iWrite < i) {
                            iWrite = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite, 1);
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem = map;
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
        addAliaslambda0 addaliaslambda0 = (addAliaslambda0) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
        String str = addaliaslambda0.IconCompatParcelizer;
        setHomeCitylambda1 sethomecitylambda1 = addaliaslambda0.MediaMetadataCompat;
        Byte b = addaliaslambda0.RatingCompat;
        String str2 = addaliaslambda0.MediaBrowserCompatMediaItem;
        Map map = addaliaslambda0.MediaSessionCompatToken;
        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 10);
        IconCompatParcelizer.serializer(addaliaslambda0.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 10);
        IconCompatParcelizer.serializer(addaliaslambda0.write, r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 11);
        r8lambdat7xjd1d4humw0psb7whucfgonss.write(addaliaslambda0.serializer);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(addaliaslambda0.MediaSessionCompatQueueItem.value);
        Long l = addaliaslambda0.MediaDescriptionCompat;
        if (l != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 10);
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l.longValue());
        }
        if (str2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
        }
        if (b != null) {
            getBitmapFromCache.read((byte) 3, 8, r8lambdat7xjd1d4humw0psb7whucfgonss, b);
        }
        if (sethomecitylambda1 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(9, (byte) 12);
            setHomeCitylambda1.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, sethomecitylambda1);
        }
        if (map != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, (byte) 13);
            Iterator itWrite = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
            while (itWrite.hasNext()) {
                Map.Entry entry = (Map.Entry) itWrite.next();
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str4);
            }
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
