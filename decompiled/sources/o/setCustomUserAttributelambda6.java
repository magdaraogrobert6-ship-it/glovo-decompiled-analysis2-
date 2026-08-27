package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.ThriftBool;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttributelambda6 implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q = new r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return r8lambdabirsljoagmyxhikohl5z5hht12q.write();
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b == 8) {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue = ThriftBool.findByValue(iMediaSessionCompatToken);
                        if (thriftBoolFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.serializer = thriftBoolFindByValue;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 2:
                    if (b == 8) {
                        int iMediaSessionCompatToken2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue2 = ThriftBool.findByValue(iMediaSessionCompatToken2);
                        if (thriftBoolFindByValue2 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken2, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer = thriftBoolFindByValue2;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 3:
                    if (b == 8) {
                        int iMediaSessionCompatToken3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue3 = ThriftBool.findByValue(iMediaSessionCompatToken3);
                        if (thriftBoolFindByValue3 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken3, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.write = thriftBoolFindByValue3;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 4:
                    if (b == 12) {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.read = (setCustomAttributeToSecondsFromEpoch) setCustomAttributeToSecondsFromEpoch.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 5:
                    if (b == 12) {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat = (setEmailNotificationSubscriptionType) setEmailNotificationSubscriptionType.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 6:
                    if (b == 3) {
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 7:
                    if (b == 15) {
                        int i = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList = new ArrayList(i);
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList.add(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()));
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer = arrayList;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 8:
                    if (b == 8) {
                        int iMediaSessionCompatToken4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue4 = ThriftBool.findByValue(iMediaSessionCompatToken4);
                        if (thriftBoolFindByValue4 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken4, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat = thriftBoolFindByValue4;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 9:
                    if (b == 8) {
                        int iMediaSessionCompatToken5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue5 = ThriftBool.findByValue(iMediaSessionCompatToken5);
                        if (thriftBoolFindByValue5 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken5, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem = thriftBoolFindByValue5;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 10:
                    if (b == 8) {
                        int iMediaSessionCompatToken6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue6 = ThriftBool.findByValue(iMediaSessionCompatToken6);
                        if (thriftBoolFindByValue6 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken6, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem = thriftBoolFindByValue6;
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
        setCustomUserAttributelambda2 setcustomuserattributelambda2 = (setCustomUserAttributelambda2) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
        ThriftBool thriftBool = setcustomuserattributelambda2.IconCompatParcelizer;
        ThriftBool thriftBool2 = setcustomuserattributelambda2.PlaybackStateCompat;
        ThriftBool thriftBool3 = setcustomuserattributelambda2.MediaMetadataCompat;
        ThriftBool thriftBool4 = setcustomuserattributelambda2.MediaDescriptionCompat;
        List list = setcustomuserattributelambda2.MediaBrowserCompatMediaItem;
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setcustomuserattributelambda2.read.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setcustomuserattributelambda2.write.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
        setCustomAttributeToSecondsFromEpoch setcustomattributetosecondsfromepoch = setcustomuserattributelambda2.RemoteActionCompatParcelizer;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setcustomattributetosecondsfromepoch.IconCompatParcelizer.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 3);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setcustomattributetosecondsfromepoch.serializer.byteValue());
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 12);
        setEmailNotificationSubscriptionType setemailnotificationsubscriptiontype = setcustomuserattributelambda2.MediaSessionCompatQueueItem;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setemailnotificationsubscriptiontype.write.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 3);
        IconCompatParcelizer.IconCompatParcelizer(setemailnotificationsubscriptiontype.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
        Byte b = setcustomuserattributelambda2.RatingCompat;
        if (b != null) {
            getBitmapFromCache.read((byte) 3, 6, r8lambdat7xjd1d4humw0psb7whucfgonss, b);
        }
        if (list != null) {
            Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 15, list, (byte) 3);
            while (itWrite.hasNext()) {
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Byte) itWrite.next()).byteValue());
            }
        }
        if (thriftBool4 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool4.value);
        }
        if (thriftBool3 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(9, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool3.value);
        }
        if (thriftBool2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool2.value);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
