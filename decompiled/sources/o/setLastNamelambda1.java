package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.LocationProvider;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class setLastNamelambda1 implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
        r8lambdat7xjd1d4humw0psb7whucfgonss.getClass();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return r8lambdayc78smgbbb6fudfjq0u5z3_ls.read();
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                    }
                    break;
                case 2:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                    }
                    break;
                case 3:
                    if (b != 6) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    }
                    break;
                case 4:
                    if (b != 6) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    }
                    break;
                case 5:
                    if (b != 6) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    }
                    break;
                case 6:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        LocationProvider locationProviderFindByValue = LocationProvider.findByValue(iMediaSessionCompatToken);
                        if (locationProviderFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type LocationProvider: "));
                            return null;
                        }
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.read = locationProviderFindByValue;
                    }
                    break;
                default:
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    break;
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) {
        setHomeCitylambda1 sethomecitylambda1 = (setHomeCitylambda1) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
        Integer num = sethomecitylambda1.RemoteActionCompatParcelizer;
        LocationProvider locationProvider = sethomecitylambda1.MediaDescriptionCompat;
        Short sh = sethomecitylambda1.MediaSessionCompatQueueItem;
        Short sh2 = sethomecitylambda1.serializer;
        SweepGradientShader9KIMszodefault.write(num, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(sethomecitylambda1.write.intValue());
        Short sh3 = sethomecitylambda1.IconCompatParcelizer;
        if (sh3 != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, sh3);
        }
        if (sh2 != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, sh2);
        }
        if (sh != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, sh);
        }
        if (locationProvider != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(locationProvider.value);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
