package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.OS;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomEndpointandroid_sdk_base_release implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(15);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return iscontentcardsunreadvisualindicatorenabled.MediaMetadataCompat();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        } else if (b == 10) {
                            iscontentcardsunreadvisualindicatorenabled.read = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 8) {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        OS osFindByValue = OS.findByValue(iMediaSessionCompatToken);
                        if (osFindByValue != null) {
                            iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = osFindByValue;
                        } else {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type OS: "));
                            return null;
                        }
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 6) {
                    iscontentcardsunreadvisualindicatorenabled.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 8) {
                iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        setBadNetworkIntervalandroid_sdk_base_release setbadnetworkintervalandroid_sdk_base_release = (setBadNetworkIntervalandroid_sdk_base_release) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
        Integer num = setbadnetworkintervalandroid_sdk_base_release.serializer;
        Long l = setbadnetworkintervalandroid_sdk_base_release.IconCompatParcelizer;
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(num.intValue());
        Short sh = setbadnetworkintervalandroid_sdk_base_release.write;
        if (sh != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setbadnetworkintervalandroid_sdk_base_release.RemoteActionCompatParcelizer.value);
        if (l != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 10);
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l.longValue());
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
