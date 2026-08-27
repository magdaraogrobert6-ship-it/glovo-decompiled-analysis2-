package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.ThriftBool;
import java.io.IOException;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttributeToNow implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        FormBody.Builder builder = new FormBody.Builder();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return builder.IconCompatParcelizer();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 3) {
                    builder.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 8) {
                int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                ThriftBool thriftBoolFindByValue = ThriftBool.findByValue(iMediaSessionCompatToken);
                if (thriftBoolFindByValue == null) {
                    MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type ThriftBool: "));
                    return null;
                }
                builder.serializer = thriftBoolFindByValue;
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        setEmailNotificationSubscriptionType setemailnotificationsubscriptiontype = (setEmailNotificationSubscriptionType) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setemailnotificationsubscriptiontype.write.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 3);
        IconCompatParcelizer.IconCompatParcelizer(setemailnotificationsubscriptiontype.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
    }
}
