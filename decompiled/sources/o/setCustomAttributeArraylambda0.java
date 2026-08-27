package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.OS;
import io.socket.parser.IOParser$Decoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomAttributeArraylambda0 implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        setCustomUserAttributelambda1 setcustomuserattributelambda1 = new setCustomUserAttributelambda1();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new setCustomUserAttributedefault(setcustomuserattributelambda1);
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b == 11) {
                        setcustomuserattributelambda1.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 2:
                    if (b == 11) {
                        setcustomuserattributelambda1.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        setcustomuserattributelambda1.MediaDescriptionCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        setcustomuserattributelambda1.MediaSessionCompatQueueItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        setcustomuserattributelambda1.RatingCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 6:
                    if (b == 8) {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        OS osFindByValue = OS.findByValue(iMediaSessionCompatToken);
                        if (osFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type OS: "));
                            return null;
                        }
                        setcustomuserattributelambda1.MediaBrowserCompatMediaItem = osFindByValue;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        setcustomuserattributelambda1.MediaMetadataCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        setcustomuserattributelambda1.ParcelableVolumeInfo = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        setcustomuserattributelambda1.MediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        setcustomuserattributelambda1.PlaybackStateCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 11:
                    if (b == 2) {
                        setcustomuserattributelambda1.PlaybackStateCompatCustomAction = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 12:
                    if (b == 2) {
                        setcustomuserattributelambda1.MediaSessionCompatResultReceiverWrapper = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 13:
                    if (b == 2) {
                        setcustomuserattributelambda1.ComponentActivity = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 14:
                    if (b == 2) {
                        setcustomuserattributelambda1.ResultReceiver = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 15:
                    if (b == 6) {
                        setcustomuserattributelambda1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 16:
                    if (b == 6) {
                        setcustomuserattributelambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 17:
                    if (b == 12) {
                        setcustomuserattributelambda1.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (setEmaillambda0) setEmaillambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 18:
                    if (b == 11) {
                        setcustomuserattributelambda1.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 19:
                    if (b == 6) {
                        setcustomuserattributelambda1.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 20:
                    if (b == 11) {
                        setcustomuserattributelambda1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 21:
                    if (b == 12) {
                        setcustomuserattributelambda1.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = (setCustomAttributelambda0) setCustomAttributelambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 22:
                    if (b == 11) {
                        setcustomuserattributelambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 23:
                    if (b == 11) {
                        setcustomuserattributelambda1.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 24:
                    if (b == 15) {
                        int i = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList = new ArrayList(i);
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList.add((getAdmMessagingRegistrationEnabledandroid_sdk_base_release) getAdmMessagingRegistrationEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                        }
                        setcustomuserattributelambda1.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = arrayList;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 25:
                    if (b == 6) {
                        setcustomuserattributelambda1.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 26:
                    if (b != 12) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        break;
                    } else {
                        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                        while (true) {
                            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                            byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                            if (b2 == 0) {
                                setcustomuserattributelambda1.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new setAttributionData(iOParser$Decoder);
                                break;
                            } else {
                                short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer;
                                if (s != 1) {
                                    if (s != 2) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                    } else if (b2 == 6) {
                                        iOParser$Decoder.read = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                    }
                                } else if (b2 == 6) {
                                    iOParser$Decoder.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                }
                            }
                        }
                    }
                    break;
                case 27:
                    if (b == 11) {
                        setcustomuserattributelambda1.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 28:
                    if (b == 11) {
                        setcustomuserattributelambda1.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 29:
                    if (b == 11) {
                        setcustomuserattributelambda1.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
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
        setCustomUserAttributedefault setcustomuserattributedefault = (setCustomUserAttributedefault) obj;
        String str = setcustomuserattributedefault.RemoteActionCompatParcelizer;
        String str2 = setcustomuserattributedefault.write;
        String str3 = setcustomuserattributedefault.read;
        String str4 = setcustomuserattributedefault.IconCompatParcelizer;
        setAttributionData setattributiondata = setcustomuserattributedefault.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        Short sh = setcustomuserattributedefault.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        String str5 = setcustomuserattributedefault.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        String str6 = setcustomuserattributedefault.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        setCustomAttributelambda0 setcustomattributelambda0 = setcustomuserattributedefault.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        String str7 = setcustomuserattributedefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        Short sh2 = setcustomuserattributedefault.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        String str8 = setcustomuserattributedefault.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        setEmaillambda0 setemaillambda0 = setcustomuserattributedefault.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        Short sh3 = setcustomuserattributedefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        Short sh4 = setcustomuserattributedefault.ComponentActivity;
        Boolean bool = setcustomuserattributedefault.ResultReceiver;
        Boolean bool2 = setcustomuserattributedefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        Boolean bool3 = setcustomuserattributedefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Boolean bool4 = setcustomuserattributedefault.MediaSessionCompatResultReceiverWrapper;
        String str9 = setcustomuserattributedefault.MediaSessionCompatToken;
        String str10 = setcustomuserattributedefault.PlaybackStateCompat;
        String str11 = setcustomuserattributedefault.ParcelableVolumeInfo;
        String str12 = setcustomuserattributedefault.PlaybackStateCompatCustomAction;
        OS os = setcustomuserattributedefault.MediaBrowserCompatMediaItem;
        String str13 = setcustomuserattributedefault.MediaSessionCompatQueueItem;
        String str14 = setcustomuserattributedefault.MediaDescriptionCompat;
        String str15 = setcustomuserattributedefault.MediaMetadataCompat;
        String str16 = setcustomuserattributedefault.RatingCompat;
        List list = setcustomuserattributedefault.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (str != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomuserattributedefault.RemoteActionCompatParcelizer);
        }
        if (str16 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str16);
        }
        if (str15 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str15);
        }
        if (str14 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str14);
        }
        if (str13 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str13);
        }
        if (os != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(os.value);
        }
        if (str12 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str12);
        }
        if (str11 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str11);
        }
        if (str10 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(9, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str10);
        }
        if (str9 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str9);
        }
        if (bool4 != null) {
            MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 11, (byte) 2, bool4);
        }
        if (bool3 != null) {
            MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 12, (byte) 2, bool3);
        }
        if (bool2 != null) {
            MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 13, (byte) 2, bool2);
        }
        if (bool != null) {
            MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 14, (byte) 2, bool);
        }
        if (sh4 != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 15, r8lambdat7xjd1d4humw0psb7whucfgonss, sh4);
        }
        if (sh3 != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 16, r8lambdat7xjd1d4humw0psb7whucfgonss, sh3);
        }
        if (setemaillambda0 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(17, (byte) 12);
            setEmaillambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setemaillambda0);
        }
        if (str8 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(18, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str8);
        }
        if (sh2 != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 19, r8lambdat7xjd1d4humw0psb7whucfgonss, sh2);
        }
        if (str7 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(20, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str7);
        }
        if (setcustomattributelambda0 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(21, (byte) 12);
            setCustomAttributelambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomattributelambda0);
        }
        if (str6 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(22, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str6);
        }
        if (str5 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(23, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str5);
        }
        if (list != null) {
            Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 24, (byte) 15, list, (byte) 12);
            while (itWrite.hasNext()) {
                getAdmMessagingRegistrationEnabledandroid_sdk_base_release getadmmessagingregistrationenabledandroid_sdk_base_release = (getAdmMessagingRegistrationEnabledandroid_sdk_base_release) itWrite.next();
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(getadmmessagingregistrationenabledandroid_sdk_base_release.IconCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(getadmmessagingregistrationenabledandroid_sdk_base_release.serializer);
                String str17 = getadmmessagingregistrationenabledandroid_sdk_base_release.write;
                if (str17 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str17);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
            }
        }
        if (sh != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 25, r8lambdat7xjd1d4humw0psb7whucfgonss, sh);
        }
        if (setattributiondata != null) {
            Short sh5 = setattributiondata.read;
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(26, (byte) 12);
            Short sh6 = setattributiondata.RemoteActionCompatParcelizer;
            if (sh5 != null) {
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 1, r8lambdat7xjd1d4humw0psb7whucfgonss, sh5);
            }
            if (sh6 != null) {
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh6);
            }
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
        }
        if (str4 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(27, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str4);
        }
        if (str3 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(28, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
        }
        if (str2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(29, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
