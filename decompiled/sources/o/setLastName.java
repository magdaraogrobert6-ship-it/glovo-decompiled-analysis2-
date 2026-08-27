package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.events.i$c;
import com.sentiance.core.model.thrift.ThriftBool;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class setLastName implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        i$c i_c = new i$c(0);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return i_c.write();
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        i_c.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    }
                    break;
                case 2:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue = ThriftBool.findByValue(iMediaSessionCompatToken);
                        if (thriftBoolFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        i_c.IconCompatParcelizer = thriftBoolFindByValue;
                    }
                    break;
                case 3:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue2 = ThriftBool.findByValue(iMediaSessionCompatToken2);
                        if (thriftBoolFindByValue2 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken2, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        i_c.serializer = thriftBoolFindByValue2;
                    }
                    break;
                case 4:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue3 = ThriftBool.findByValue(iMediaSessionCompatToken3);
                        if (thriftBoolFindByValue3 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken3, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        i_c.RemoteActionCompatParcelizer = thriftBoolFindByValue3;
                    }
                    break;
                case 5:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue4 = ThriftBool.findByValue(iMediaSessionCompatToken4);
                        if (thriftBoolFindByValue4 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken4, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        i_c.read = thriftBoolFindByValue4;
                    }
                    break;
                case 6:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue5 = ThriftBool.findByValue(iMediaSessionCompatToken5);
                        if (thriftBoolFindByValue5 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken5, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        i_c.RatingCompat = thriftBoolFindByValue5;
                    }
                    break;
                case 7:
                    if (b != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        i_c.MediaMetadataCompat = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    }
                    break;
                case 8:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue6 = ThriftBool.findByValue(iMediaSessionCompatToken6);
                        if (thriftBoolFindByValue6 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken6, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        i_c.MediaDescriptionCompat = thriftBoolFindByValue6;
                    }
                    break;
                case 9:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken7 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue7 = ThriftBool.findByValue(iMediaSessionCompatToken7);
                        if (thriftBoolFindByValue7 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken7, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        i_c.MediaBrowserCompatMediaItem = thriftBoolFindByValue7;
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
        setPhoneNumber setphonenumber = (setPhoneNumber) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
        Byte b = setphonenumber.read;
        ThriftBool thriftBool = setphonenumber.MediaSessionCompatQueueItem;
        ThriftBool thriftBool2 = setphonenumber.RatingCompat;
        Byte b2 = setphonenumber.MediaBrowserCompatMediaItem;
        ThriftBool thriftBool3 = setphonenumber.MediaMetadataCompat;
        ThriftBool thriftBool4 = setphonenumber.MediaDescriptionCompat;
        af$$ExternalSyntheticOutline1.m((byte) 8, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setphonenumber.write.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setphonenumber.RemoteActionCompatParcelizer.value);
        ThriftBool thriftBool5 = setphonenumber.serializer;
        if (thriftBool5 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool5.value);
        }
        if (thriftBool4 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool4.value);
        }
        if (thriftBool3 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool3.value);
        }
        if (b2 != null) {
            getBitmapFromCache.read((byte) 3, 7, r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
        }
        if (thriftBool2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool2.value);
        }
        if (thriftBool != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(9, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool.value);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
