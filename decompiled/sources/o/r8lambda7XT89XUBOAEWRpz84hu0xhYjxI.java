package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.ThriftBool;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda7XT89XUBOAEWRpz84hu0xhYjxI implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8(r8lambdayc78smgbbb6fudfjq0u5z3_ls);
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue = ThriftBool.findByValue(iMediaSessionCompatToken);
                        if (thriftBoolFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = thriftBoolFindByValue;
                    }
                    break;
                case 2:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue2 = ThriftBool.findByValue(iMediaSessionCompatToken2);
                        if (thriftBoolFindByValue2 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken2, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = thriftBoolFindByValue2;
                    }
                    break;
                case 3:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue3 = ThriftBool.findByValue(iMediaSessionCompatToken3);
                        if (thriftBoolFindByValue3 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken3, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = thriftBoolFindByValue3;
                    }
                    break;
                case 4:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue4 = ThriftBool.findByValue(iMediaSessionCompatToken4);
                        if (thriftBoolFindByValue4 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken4, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = thriftBoolFindByValue4;
                    }
                    break;
                case 5:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue5 = ThriftBool.findByValue(iMediaSessionCompatToken5);
                        if (thriftBoolFindByValue5 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken5, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = thriftBoolFindByValue5;
                    }
                    break;
                case 6:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        ThriftBool thriftBoolFindByValue6 = ThriftBool.findByValue(iMediaSessionCompatToken6);
                        if (thriftBoolFindByValue6 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken6, "Unexpected value for enum-type ThriftBool: "));
                            return null;
                        }
                        r8lambdayc78smgbbb6fudfjq0u5z3_ls.read = thriftBoolFindByValue6;
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
        r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8 r8lambdacmobxhcmrg5haij_oobybfwnnj8 = (r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8) obj;
        ThriftBool thriftBool = r8lambdacmobxhcmrg5haij_oobybfwnnj8.serializer;
        ThriftBool thriftBool2 = r8lambdacmobxhcmrg5haij_oobybfwnnj8.MediaBrowserCompatMediaItem;
        ThriftBool thriftBool3 = r8lambdacmobxhcmrg5haij_oobybfwnnj8.MediaDescriptionCompat;
        ThriftBool thriftBool4 = r8lambdacmobxhcmrg5haij_oobybfwnnj8.read;
        ThriftBool thriftBool5 = r8lambdacmobxhcmrg5haij_oobybfwnnj8.write;
        ThriftBool thriftBool6 = r8lambdacmobxhcmrg5haij_oobybfwnnj8.IconCompatParcelizer;
        if (thriftBool != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(r8lambdacmobxhcmrg5haij_oobybfwnnj8.serializer.value);
        }
        if (thriftBool6 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool6.value);
        }
        if (thriftBool5 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool5.value);
        }
        if (thriftBool4 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool4.value);
        }
        if (thriftBool3 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool3.value);
        }
        if (thriftBool2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(thriftBool2.value);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
