package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.TimeSeriesType;
import io.sentry.util.network.NetworkBody;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setLastKnownLocation implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        NetworkBody networkBody = new NetworkBody(21);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                if (((Short) networkBody.IconCompatParcelizer) != null) {
                    if (((HashMap) networkBody.RemoteActionCompatParcelizer) != null) {
                        return new setHomeCity(networkBody);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'enabled_sensors_and_frequencies_hertz' is missing");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location_fix_interval_seconds' is missing");
                return null;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 13) {
                    int i = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                    HashMap map = new HashMap(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        TimeSeriesType timeSeriesTypeFindByValue = TimeSeriesType.findByValue(iMediaSessionCompatToken);
                        if (timeSeriesTypeFindByValue != null) {
                            map.put(timeSeriesTypeFindByValue, Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction()));
                        } else {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type TimeSeriesType: "));
                            return null;
                        }
                    }
                    networkBody.RemoteActionCompatParcelizer = map;
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 6) {
                networkBody.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) {
        setHomeCity sethomecity = (setHomeCity) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
        IconCompatParcelizer.read((byte) 13, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sethomecity.read);
        Iterator itWrite = MediaSessionCompatQueueItem.write(sethomecity.write, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 8, (byte) 6);
        while (itWrite.hasNext()) {
            Map.Entry entry = (Map.Entry) itWrite.next();
            TimeSeriesType timeSeriesType = (TimeSeriesType) entry.getKey();
            Short sh = (Short) entry.getValue();
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(timeSeriesType.value);
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(sh.shortValue());
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
