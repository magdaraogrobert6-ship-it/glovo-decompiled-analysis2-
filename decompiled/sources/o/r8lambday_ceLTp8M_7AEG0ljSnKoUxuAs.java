package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TransportMode;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambday_ceLTp8M_7AEG0ljSnKoUxuAs implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        O$b o$b = new O$b();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return o$b.MediaDescriptionCompat();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            } else if (b == 3) {
                                o$b.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                        } else if (b == 13) {
                            int i = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                            HashMap map = new HashMap(i);
                            int iWrite = 0;
                            while (iWrite < i) {
                                iWrite = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite, 1);
                            }
                            o$b.read = map;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 8) {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        TransportMode transportModeFindByValue = TransportMode.findByValue(iMediaSessionCompatToken);
                        if (transportModeFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type TransportMode: "));
                            return null;
                        }
                        o$b.serializer = transportModeFindByValue;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 8) {
                    int iMediaSessionCompatToken2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                    DetectionTrigger detectionTriggerFindByValue = DetectionTrigger.findByValue(iMediaSessionCompatToken2);
                    if (detectionTriggerFindByValue == null) {
                        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken2, "Unexpected value for enum-type DetectionTrigger: "));
                        return null;
                    }
                    o$b.RemoteActionCompatParcelizer = detectionTriggerFindByValue;
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 10) {
                o$b.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) {
        r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 r8lambdasscpazklpwhzf7qziwqx9zu4wp4 = (r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
        Long l = r8lambdasscpazklpwhzf7qziwqx9zu4wp4.RemoteActionCompatParcelizer;
        Byte b = r8lambdasscpazklpwhzf7qziwqx9zu4wp4.RatingCompat;
        Map map = r8lambdasscpazklpwhzf7qziwqx9zu4wp4.write;
        IconCompatParcelizer.serializer(l, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(r8lambdasscpazklpwhzf7qziwqx9zu4wp4.serializer.value);
        TransportMode transportMode = r8lambdasscpazklpwhzf7qziwqx9zu4wp4.read;
        if (transportMode != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(transportMode.value);
        }
        if (map != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 13);
            Iterator itWrite = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
            while (itWrite.hasNext()) {
                Map.Entry entry = (Map.Entry) itWrite.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
            }
        }
        if (b != null) {
            getBitmapFromCache.read((byte) 3, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, b);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
