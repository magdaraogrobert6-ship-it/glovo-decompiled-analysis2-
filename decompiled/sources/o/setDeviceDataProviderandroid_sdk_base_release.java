package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.ThriftBool;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class setDeviceDataProviderandroid_sdk_base_release implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        E$b e$b = new E$b(0);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                if (((ThriftBool) e$b.read) != null) {
                    return new setConfiguredCustomEndpointandroid_sdk_base_release(e$b);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_harsh_driving' is missing");
                return null;
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b == 8) {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue = ThriftBool.findByValue(iMediaSessionCompatToken);
                        if (thriftBoolFindByValue != null) {
                            e$b.read = thriftBoolFindByValue;
                        } else {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 2:
                    if (b == 3) {
                        e$b.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 3:
                    if (b == 3) {
                        e$b.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 4:
                    if (b == 4) {
                        e$b.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 5:
                    if (b == 10) {
                        e$b.MediaMetadataCompat = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 6:
                    if (b == 3) {
                        e$b.MediaDescriptionCompat = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 7:
                    if (b == 3) {
                        e$b.MediaBrowserCompatMediaItem = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
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
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) {
        setConfiguredCustomEndpointandroid_sdk_base_release setconfiguredcustomendpointandroid_sdk_base_release = (setConfiguredCustomEndpointandroid_sdk_base_release) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
        ThriftBool thriftBool = setconfiguredcustomendpointandroid_sdk_base_release.read;
        Byte b = setconfiguredcustomendpointandroid_sdk_base_release.MediaMetadataCompat;
        Byte b2 = setconfiguredcustomendpointandroid_sdk_base_release.RatingCompat;
        Long l = setconfiguredcustomendpointandroid_sdk_base_release.MediaSessionCompatQueueItem;
        Double d = setconfiguredcustomendpointandroid_sdk_base_release.serializer;
        Byte b3 = setconfiguredcustomendpointandroid_sdk_base_release.write;
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool.value);
        Byte b4 = setconfiguredcustomendpointandroid_sdk_base_release.RemoteActionCompatParcelizer;
        if (b4 != null) {
            getBitmapFromCache.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
        }
        if (b3 != null) {
            getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
        }
        if (d != null) {
            af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 4, d);
        }
        if (l != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 10);
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l.longValue());
        }
        if (b2 != null) {
            getBitmapFromCache.read((byte) 3, 6, r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
        }
        if (b != null) {
            getBitmapFromCache.read((byte) 3, 7, r8lambdat7xjd1d4humw0psb7whucfgonss, b);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
