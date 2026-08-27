package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.events.ThriftBool;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushDelivery implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q = new r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return r8lambdabirsljoagmyxhikohl5z5hht12q.serializer();
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    }
                    break;
                case 2:
                    if (b != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    }
                    break;
                case 3:
                    if (b != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    }
                    break;
                case 4:
                    if (b != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    }
                    break;
                case 5:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue = ThriftBool.findByValue(iMediaSessionCompatToken);
                        if (thriftBoolFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.write = thriftBoolFindByValue;
                    }
                    break;
                case 6:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.read = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                    }
                    break;
                case 7:
                    if (b != 10) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    }
                    break;
                case 8:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue2 = ThriftBool.findByValue(iMediaSessionCompatToken2);
                        if (thriftBoolFindByValue2 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken2, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat = thriftBoolFindByValue2;
                    }
                    break;
                case 9:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue3 = ThriftBool.findByValue(iMediaSessionCompatToken3);
                        if (thriftBoolFindByValue3 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken3, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem = thriftBoolFindByValue3;
                    }
                    break;
                case 10:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue4 = ThriftBool.findByValue(iMediaSessionCompatToken4);
                        if (thriftBoolFindByValue4 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken4, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem = thriftBoolFindByValue4;
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
        publishBrazePushAction publishbrazepushaction = (publishBrazePushAction) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
        Byte b = publishbrazepushaction.RemoteActionCompatParcelizer;
        ThriftBool thriftBool = publishbrazepushaction.ParcelableVolumeInfo;
        ThriftBool thriftBool2 = publishbrazepushaction.MediaSessionCompatQueueItem;
        ThriftBool thriftBool3 = publishbrazepushaction.MediaDescriptionCompat;
        Long l = publishbrazepushaction.RatingCompat;
        Integer num = publishbrazepushaction.MediaMetadataCompat;
        af$$ExternalSyntheticOutline1.m((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b);
        af$$ExternalSyntheticOutline1.m((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, publishbrazepushaction.write);
        af$$ExternalSyntheticOutline1.m((byte) 3, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, publishbrazepushaction.serializer);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(publishbrazepushaction.read.byteValue());
        ThriftBool thriftBool4 = publishbrazepushaction.MediaBrowserCompatMediaItem;
        if (thriftBool4 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool4.value);
        }
        if (num != null) {
            SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 6, (byte) 8, num);
        }
        if (l != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, (byte) 10);
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l.longValue());
        }
        if (thriftBool3 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool3.value);
        }
        if (thriftBool2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(9, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool2.value);
        }
        if (thriftBool != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool.value);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
