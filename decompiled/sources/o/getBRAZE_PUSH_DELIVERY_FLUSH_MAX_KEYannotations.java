package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.DetectionTrigger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class getBRAZE_PUSH_DELIVERY_FLUSH_MAX_KEYannotations implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        IBraze iBraze = new IBraze();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new BrazeUserExternalSyntheticLambda3(iBraze);
            }
            int i = 0;
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        iBraze.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 2:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i2 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList = new ArrayList(i2);
                        while (i < i2) {
                            arrayList.add((BrazeUserExternalSyntheticLambda0) BrazeUserExternalSyntheticLambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        iBraze.serializer = arrayList;
                    }
                    break;
                case 3:
                    if (b != 12) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        iBraze.write = (IBrazeNotificationFactory) IBrazeNotificationFactory.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    }
                    break;
                case 4:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i3 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList2 = new ArrayList(i3);
                        while (i < i3) {
                            FormBody.Builder builder = new FormBody.Builder();
                            while (true) {
                                r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                                if (b2 == 0) {
                                }
                                short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer;
                                if (s != 1) {
                                    if (s != 2) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                    } else if (b2 == 11) {
                                        builder.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                    }
                                } else if (b2 == 11) {
                                    builder.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                }
                                break;
                            }
                            arrayList2.add(new gotoUri(builder));
                            i++;
                        }
                        iBraze.IconCompatParcelizer = arrayList2;
                    }
                    break;
                case 5:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        iBraze.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 6:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        iBraze.MediaMetadataCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 7:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i4 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList3 = new ArrayList(i4);
                        while (i < i4) {
                            r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                            while (true) {
                                r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                                if (b3 == 0) {
                                }
                                short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer;
                                if (s2 != 1) {
                                    if (s2 != 2) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                    } else if (b3 == 4) {
                                        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                    }
                                } else if (b3 == 4) {
                                    r8lambda1mnczrzuv4owduwgkg6cjtsws.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                }
                                break;
                            }
                            arrayList3.add(new addToSubscriptionGroup(r8lambda1mnczrzuv4owduwgkg6cjtsws));
                            i++;
                        }
                        iBraze.MediaBrowserCompatMediaItem = arrayList3;
                    }
                    break;
                case 8:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        iBraze.RatingCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 9:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i5 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList4 = new ArrayList(i5);
                        while (i < i5) {
                            arrayList4.add(r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer());
                            i++;
                        }
                        iBraze.MediaDescriptionCompat = arrayList4;
                    }
                    break;
                case 10:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i6 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList5 = new ArrayList(i6);
                        while (i < i6) {
                            FormBody.Builder builder2 = new FormBody.Builder();
                            while (true) {
                                r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                                if (b4 == 0) {
                                }
                                short s3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer;
                                if (s3 != 1) {
                                    if (s3 != 2) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                    } else if (b4 == 4) {
                                        builder2.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                    }
                                } else if (b4 == 4) {
                                    builder2.serializer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                }
                                break;
                            }
                            arrayList5.add(new removeFromSubscriptionGroup(builder2));
                            i++;
                        }
                        iBraze.MediaSessionCompatQueueItem = arrayList5;
                    }
                    break;
                case 11:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        iBraze.ParcelableVolumeInfo = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 12:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        iBraze.PlaybackStateCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 13:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i7 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList6 = new ArrayList(i7);
                        while (i < i7) {
                            arrayList6.add((isAmazonDevice) isAmazonDevice.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        iBraze.MediaSessionCompatResultReceiverWrapper = arrayList6;
                    }
                    break;
                case 14:
                    if (b != 8) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        DetectionTrigger detectionTriggerFindByValue = DetectionTrigger.findByValue(iMediaSessionCompatToken);
                        if (detectionTriggerFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type DetectionTrigger: "));
                            return null;
                        }
                        iBraze.MediaSessionCompatToken = detectionTriggerFindByValue;
                    }
                    break;
                case 15:
                    if (b != 12) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        iBraze.PlaybackStateCompatCustomAction = (setCustomUserAttributelambda3) setCustomUserAttributelambda3.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
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
        byte b;
        byte b2;
        BrazeUserExternalSyntheticLambda3 brazeUserExternalSyntheticLambda3 = (BrazeUserExternalSyntheticLambda3) obj;
        String str = brazeUserExternalSyntheticLambda3.serializer;
        setCustomUserAttributelambda3 setcustomuserattributelambda3 = brazeUserExternalSyntheticLambda3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        DetectionTrigger detectionTrigger = brazeUserExternalSyntheticLambda3.ParcelableVolumeInfo;
        String str2 = brazeUserExternalSyntheticLambda3.MediaSessionCompatToken;
        String str3 = brazeUserExternalSyntheticLambda3.MediaSessionCompatResultReceiverWrapper;
        String str4 = brazeUserExternalSyntheticLambda3.MediaMetadataCompat;
        String str5 = brazeUserExternalSyntheticLambda3.MediaDescriptionCompat;
        String str6 = brazeUserExternalSyntheticLambda3.RatingCompat;
        IBrazeNotificationFactory iBrazeNotificationFactory = brazeUserExternalSyntheticLambda3.read;
        List list = brazeUserExternalSyntheticLambda3.PlaybackStateCompatCustomAction;
        List list2 = brazeUserExternalSyntheticLambda3.PlaybackStateCompat;
        List list3 = brazeUserExternalSyntheticLambda3.MediaBrowserCompatMediaItem;
        List list4 = brazeUserExternalSyntheticLambda3.MediaSessionCompatQueueItem;
        List list5 = brazeUserExternalSyntheticLambda3.IconCompatParcelizer;
        List list6 = brazeUserExternalSyntheticLambda3.write;
        if (str != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(brazeUserExternalSyntheticLambda3.serializer);
        }
        if (list6 != null) {
            Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 15, list6, (byte) 12);
            while (itWrite.hasNext()) {
                BrazeUserExternalSyntheticLambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (BrazeUserExternalSyntheticLambda0) itWrite.next());
            }
        }
        if (iBrazeNotificationFactory != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
            IBrazeNotificationFactory.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, iBrazeNotificationFactory);
        }
        if (list5 != null) {
            Iterator itWrite2 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 15, list5, (byte) 12);
            while (itWrite2.hasNext()) {
                gotoUri gotouri = (gotoUri) itWrite2.next();
                String str7 = gotouri.RemoteActionCompatParcelizer;
                String str8 = gotouri.read;
                if (str7 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(gotouri.RemoteActionCompatParcelizer);
                }
                if (str8 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str8);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
            }
        }
        if (str6 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str6);
        }
        if (str5 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str5);
        }
        if (list4 != null) {
            Iterator itWrite3 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 15, list4, (byte) 12);
            while (itWrite3.hasNext()) {
                addToSubscriptionGroup addtosubscriptiongroup = (addToSubscriptionGroup) itWrite3.next();
                Double d = addtosubscriptiongroup.read;
                Double d2 = addtosubscriptiongroup.serializer;
                if (d != null) {
                    b2 = 4;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(addtosubscriptiongroup.read.doubleValue());
                } else {
                    b2 = 4;
                }
                if (d2 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, b2, d2);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
            }
        }
        if (str4 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str4);
        }
        if (list3 != null) {
            Iterator itWrite4 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 9, (byte) 15, list3, (byte) 11);
            while (itWrite4.hasNext()) {
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((String) itWrite4.next());
            }
        }
        if (list2 != null) {
            Iterator itWrite5 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 10, (byte) 15, list2, (byte) 12);
            while (itWrite5.hasNext()) {
                removeFromSubscriptionGroup removefromsubscriptiongroup = (removeFromSubscriptionGroup) itWrite5.next();
                Double d3 = removefromsubscriptiongroup.serializer;
                Double d4 = removefromsubscriptiongroup.RemoteActionCompatParcelizer;
                if (d3 != null) {
                    b = 4;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(removefromsubscriptiongroup.serializer.doubleValue());
                } else {
                    b = 4;
                }
                if (d4 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, b, d4);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
            }
        }
        if (str3 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(11, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
        }
        if (str2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(12, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
        }
        if (list != null) {
            Iterator itWrite6 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 13, (byte) 15, list, (byte) 12);
            while (itWrite6.hasNext()) {
                isAmazonDevice.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (isAmazonDevice) itWrite6.next());
            }
        }
        if (detectionTrigger != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(14, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(detectionTrigger.value);
        }
        if (setcustomuserattributelambda3 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(15, (byte) 12);
            setCustomUserAttributelambda3.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomuserattributelambda3);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
