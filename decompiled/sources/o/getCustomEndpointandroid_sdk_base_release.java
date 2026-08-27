package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.com.microsoft.thrifty.ThriftException;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.TransportMode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getCustomEndpointandroid_sdk_base_release implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        getAutomaticGeofenceRequestsEnabledandroid_sdk_base_release getautomaticgeofencerequestsenabledandroid_sdk_base_release = new getAutomaticGeofenceRequestsEnabledandroid_sdk_base_release();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return getautomaticgeofencerequestsenabledandroid_sdk_base_release.IconCompatParcelizer();
            }
            int iWrite = 0;
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b == 11) {
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 2:
                    if (b == 10) {
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 3:
                    if (b == 10) {
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.serializer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 4:
                    if (b == 8) {
                        int iMediaSessionCompatToken = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        DetectionTrigger detectionTriggerFindByValue = DetectionTrigger.findByValue(iMediaSessionCompatToken);
                        if (detectionTriggerFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken, "Unexpected value for enum-type DetectionTrigger: "));
                            return null;
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.IconCompatParcelizer = detectionTriggerFindByValue;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 5:
                    if (b == 8) {
                        int iMediaSessionCompatToken2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        DetectionTrigger detectionTriggerFindByValue2 = DetectionTrigger.findByValue(iMediaSessionCompatToken2);
                        if (detectionTriggerFindByValue2 == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken2, "Unexpected value for enum-type DetectionTrigger: "));
                            return null;
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.read = detectionTriggerFindByValue2;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 6:
                    if (b == 8) {
                        int iMediaSessionCompatToken3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                        TransportMode transportModeFindByValue = TransportMode.findByValue(iMediaSessionCompatToken3);
                        if (transportModeFindByValue == null) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ThriftException.Kind.PROTOCOL_ERROR, c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatToken3, "Unexpected value for enum-type TransportMode: "));
                            return null;
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaBrowserCompatMediaItem = transportModeFindByValue;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 7:
                    if (b == 15) {
                        int i = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList = new ArrayList(i);
                        while (iWrite < i) {
                            arrayList.add((createNotification) createNotification.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            iWrite++;
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaSessionCompatQueueItem = arrayList;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 8:
                    if (b == 15) {
                        int i2 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList2 = new ArrayList(i2);
                        while (iWrite < i2) {
                            arrayList2.add((removeFromSubscriptionGrouplambda0) removeFromSubscriptionGrouplambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            iWrite++;
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.RatingCompat = arrayList2;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 9:
                    if (b == 15) {
                        int i3 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList3 = new ArrayList(i3);
                        while (iWrite < i3) {
                            arrayList3.add((getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            iWrite++;
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaMetadataCompat = arrayList3;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 10:
                    if (b == 13) {
                        int i4 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map = new HashMap(i4);
                        while (iWrite < i4) {
                            iWrite = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite, 1);
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaDescriptionCompat = map;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 11:
                    if (b == 3) {
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaSessionCompatToken = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 12:
                    if (b == 13) {
                        int i5 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map2 = new HashMap(i5);
                        for (int i6 = 0; i6 < i5; i6++) {
                            String strRemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            int i7 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                            ArrayList arrayList4 = new ArrayList(i7);
                            for (int i8 = 0; i8 < i7; i8++) {
                                arrayList4.add((setFirstName) setFirstName.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            }
                            map2.put(strRemoteActionCompatParcelizer, arrayList4);
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.PlaybackStateCompat = map2;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 13:
                    if (b == 15) {
                        int i9 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList5 = new ArrayList(i9);
                        while (iWrite < i9) {
                            arrayList5.add((setDefaultNotificationChannelDescriptionlambda0) setDefaultNotificationChannelDescriptionlambda0.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            iWrite++;
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.ParcelableVolumeInfo = arrayList5;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 14:
                    if (b == 15) {
                        int i10 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList6 = new ArrayList(i10);
                        while (iWrite < i10) {
                            r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                            while (true) {
                                r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                                if (b2 == 0) {
                                }
                                short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer;
                                if (s != 1) {
                                    if (s != 2) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                    } else if (b2 == 10) {
                                        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                    }
                                } else if (b2 == 3) {
                                    r8lambda1mnczrzuv4owduwgkg6cjtsws.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                                }
                                break;
                            }
                            arrayList6.add(r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer());
                            iWrite++;
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.PlaybackStateCompatCustomAction = arrayList6;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 15:
                    if (b == 3) {
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaSessionCompatResultReceiverWrapper = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 16:
                    if (b == 3) {
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 17:
                    if (b == 15) {
                        int i11 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList7 = new ArrayList(i11);
                        while (iWrite < i11) {
                            arrayList7.add((setCustomWebViewActivityClass) setCustomWebViewActivityClass.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            iWrite++;
                        }
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = arrayList7;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 18:
                    if (b == 2) {
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.ComponentActivity = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 19:
                    if (b == 11) {
                        getautomaticgeofencerequestsenabledandroid_sdk_base_release.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
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
        getBadNetworkIntervalandroid_sdk_base_release getbadnetworkintervalandroid_sdk_base_release = (getBadNetworkIntervalandroid_sdk_base_release) obj;
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
        String str = getbadnetworkintervalandroid_sdk_base_release.IconCompatParcelizer;
        String str2 = getbadnetworkintervalandroid_sdk_base_release.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Boolean bool = getbadnetworkintervalandroid_sdk_base_release.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        Byte b = getbadnetworkintervalandroid_sdk_base_release.ComponentActivity;
        Byte b2 = getbadnetworkintervalandroid_sdk_base_release.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        Byte b3 = getbadnetworkintervalandroid_sdk_base_release.PlaybackStateCompat;
        List list = getbadnetworkintervalandroid_sdk_base_release.ResultReceiver;
        List list2 = getbadnetworkintervalandroid_sdk_base_release.PlaybackStateCompatCustomAction;
        List list3 = getbadnetworkintervalandroid_sdk_base_release.MediaSessionCompatToken;
        Map map = getbadnetworkintervalandroid_sdk_base_release.ParcelableVolumeInfo;
        Map map2 = getbadnetworkintervalandroid_sdk_base_release.MediaSessionCompatResultReceiverWrapper;
        List list4 = getbadnetworkintervalandroid_sdk_base_release.RatingCompat;
        List list5 = getbadnetworkintervalandroid_sdk_base_release.MediaMetadataCompat;
        List list6 = getbadnetworkintervalandroid_sdk_base_release.MediaSessionCompatQueueItem;
        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 10);
        IconCompatParcelizer.serializer(getbadnetworkintervalandroid_sdk_base_release.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 10);
        IconCompatParcelizer.serializer(getbadnetworkintervalandroid_sdk_base_release.read, r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(getbadnetworkintervalandroid_sdk_base_release.RemoteActionCompatParcelizer.value);
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 8);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(getbadnetworkintervalandroid_sdk_base_release.MediaBrowserCompatMediaItem.value);
        TransportMode transportMode = getbadnetworkintervalandroid_sdk_base_release.MediaDescriptionCompat;
        if (transportMode != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 8);
            r8lambdat7xjd1d4humw0psb7whucfgonss.read(transportMode.value);
        }
        if (list6 != null) {
            Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 15, list6, (byte) 12);
            while (itWrite.hasNext()) {
                createNotification.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (createNotification) itWrite.next());
            }
        }
        if (list5 != null) {
            Iterator itWrite2 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 8, (byte) 15, list5, (byte) 12);
            while (itWrite2.hasNext()) {
                removeFromSubscriptionGrouplambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (removeFromSubscriptionGrouplambda0) itWrite2.next());
            }
        }
        if (list4 != null) {
            Iterator itWrite3 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 9, (byte) 15, list4, (byte) 12);
            while (itWrite3.hasNext()) {
                getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) itWrite3.next());
            }
        }
        if (map2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, (byte) 13);
            Iterator itWrite4 = MediaSessionCompatQueueItem.write(map2, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 11);
            while (itWrite4.hasNext()) {
                Map.Entry entry = (Map.Entry) itWrite4.next();
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str4);
            }
        }
        if (b3 != null) {
            getBitmapFromCache.read((byte) 3, 11, r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
        }
        if (map != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(12, (byte) 13);
            Iterator itWrite5 = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 11, (byte) 15);
            while (itWrite5.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itWrite5.next();
                String str5 = (String) entry2.getKey();
                List list7 = (List) entry2.getValue();
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str5);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 12, list7.size());
                Iterator it = list7.iterator();
                while (it.hasNext()) {
                    setFirstName.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (setFirstName) it.next());
                }
            }
        }
        if (list3 != null) {
            Iterator itWrite6 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 13, (byte) 15, list3, (byte) 12);
            while (itWrite6.hasNext()) {
                setDefaultNotificationChannelDescriptionlambda0 setdefaultnotificationchanneldescriptionlambda0 = (setDefaultNotificationChannelDescriptionlambda0) itWrite6.next();
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                af$$ExternalSyntheticOutline1.m((byte) 10, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, setdefaultnotificationchanneldescriptionlambda0.RemoteActionCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setdefaultnotificationchanneldescriptionlambda0.write.longValue());
                Byte b4 = setdefaultnotificationchanneldescriptionlambda0.read;
                if (b4 != null) {
                    getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
            }
        }
        if (list2 != null) {
            Iterator itWrite7 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 14, (byte) 15, list2, (byte) 12);
            while (itWrite7.hasNext()) {
                setCustomUserAttributelambda4 setcustomuserattributelambda4 = (setCustomUserAttributelambda4) itWrite7.next();
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                af$$ExternalSyntheticOutline1.m((byte) 10, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomuserattributelambda4.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setcustomuserattributelambda4.serializer.longValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
            }
        }
        if (b2 != null) {
            getBitmapFromCache.read((byte) 3, 15, r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
        }
        if (b != null) {
            getBitmapFromCache.read((byte) 3, 16, r8lambdat7xjd1d4humw0psb7whucfgonss, b);
        }
        if (list != null) {
            Iterator itWrite8 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 17, (byte) 15, list, (byte) 12);
            while (itWrite8.hasNext()) {
                setCustomWebViewActivityClass.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (setCustomWebViewActivityClass) itWrite8.next());
            }
        }
        if (bool != null) {
            MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 18, (byte) 2, bool);
        }
        if (str2 != null) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(19, (byte) 11);
            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
        }
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
    }
}
