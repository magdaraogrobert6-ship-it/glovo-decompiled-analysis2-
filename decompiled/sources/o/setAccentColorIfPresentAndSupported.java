package o;

import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.TimeSeriesType;
import com.sentiance.core.model.thrift.TransportMode;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.sensorstream.SensorType;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes3.dex */
final class setAccentColorIfPresentAndSupported implements Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>>, routeUserWithNotificationOpenedIntentlambda0, routeUserWithNotificationOpenedIntentlambda4, routeUserWithNotificationOpenedIntentlambda1 {
    private int ComponentActivity = 0;
    private final Map<Long, String> IconCompatParcelizer;
    private final parseLonglambda0 MediaBrowserCompatMediaItem;
    private final Byte MediaDescriptionCompat;
    private final DetectionTrigger MediaMetadataCompat;
    private final long MediaSessionCompatQueueItem;
    private final ConfigurationManager MediaSessionCompatResultReceiverWrapper;
    private final getTrackingStringandroid_sdk_base_releaseannotations MediaSessionCompatToken;
    private final boolean ParcelableVolumeInfo;
    private final routeUserWithNotificationOpenedIntentlambda3 PlaybackStateCompat;
    private final setTickerIfPresent PlaybackStateCompatCustomAction;
    private final DetectionTrigger RatingCompat;
    private final getCooldownEnterSeconds RemoteActionCompatParcelizer;
    private final sendPushActionIntentlambda0 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final component4android_sdk_base_release read;
    private final getVerticalAccuracy serializer;
    private final setSoundIfPresentAndSupportedlambda1 write;

    @Override // o.routeUserWithNotificationOpenedIntentlambda1
    public final boolean write() {
        return !serializer();
    }

    private boolean serializer() {
        return !this.MediaSessionCompatResultReceiverWrapper.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    public static createNotification write(setAccentColorIfPresentAndSupported setaccentcolorifpresentandsupported, createNotification createnotification) {
        sendNotificationOpenedBroadcast handlecancelnotificationactionlambda1;
        TimeSeriesType timeSeriesType = createnotification.read;
        SensorType sensorTypeFromTimeSeriesType = SensorType.fromTimeSeriesType(timeSeriesType);
        sendNotificationOpenedBroadcast sendnotificationopenedbroadcast = null;
        Short sh = sensorTypeFromTimeSeriesType == null ? null : setaccentcolorifpresentandsupported.MediaSessionCompatResultReceiverWrapper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().get(sensorTypeFromTimeSeriesType);
        if (sh != null) {
            sendPushActionIntentlambda0 sendpushactionintentlambda0 = setaccentcolorifpresentandsupported.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            short sShortValue = sh.shortValue();
            sendpushactionintentlambda0.getClass();
            timeSeriesType.getClass();
            int i = sendNotificationOpenedBroadcastlambda0.RemoteActionCompatParcelizer[timeSeriesType.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                handlecancelnotificationactionlambda1 = new handleCancelNotificationActionlambda1(new onPauselambda0(sShortValue));
            } else {
                if (i == 4) {
                    handlecancelnotificationactionlambda1 = new logBaiduNotificationClick(new NotificationTrampolineActivityonResume7(sShortValue));
                } else if (i != 5) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                if (sendnotificationopenedbroadcast != null) {
                    setaccentcolorifpresentandsupported.MediaBrowserCompatMediaItem.IconCompatParcelizer("Resampling %s data", timeSeriesType);
                    return sendnotificationopenedbroadcast.read(createnotification);
                }
            }
            sendnotificationopenedbroadcast = handlecancelnotificationactionlambda1;
            if (sendnotificationopenedbroadcast != null) {
                setaccentcolorifpresentandsupported.MediaBrowserCompatMediaItem.IconCompatParcelizer("Resampling %s data", timeSeriesType);
                return sendnotificationopenedbroadcast.read(createnotification);
            }
        }
        return createnotification;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Map.Entry<Long, String> entry = read(this.IconCompatParcelizer);
        return entry != null && entry.getKey().longValue() < this.MediaSessionCompatQueueItem;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:243:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v34 */
    @Override // java.util.Iterator
    public final Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility> next() {
        long jLongValue;
        boolean z;
        parseLonglambda0 parselonglambda0;
        byte b;
        byte b2;
        DetectionTrigger detectionTrigger;
        TransportMode transportModeWrite;
        long j;
        getShouldPersistWebView getshouldpersistwebview;
        parseLonglambda0 parselonglambda1;
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy;
        r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A r8lambda2l1vxswbmfutp9a4iejxpq7zf7a;
        Iterator<getCooldownEnterSeconds.read> it;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b3;
        retryInAppMessage retryinappmessage;
        setCustomUserAttributelambda4 setcustomuserattributelambda4IconCompatParcelizer;
        boolean z2;
        byte b4;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa;
        r8lambdaE7oIx09KQauliA8paOfGanE2_e8 r8lambdae7oix09kqaulia8paofgane2_e8;
        String str;
        setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release;
        ?? r8;
        String str2;
        Map.Entry<Long, String> entry = read(this.IconCompatParcelizer);
        getBadNetworkIntervalandroid_sdk_base_release getbadnetworkintervalandroid_sdk_base_releaseIconCompatParcelizer = null;
        if (entry == null || !hasNext()) {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer("Requested next trip payload, but there are no more trips to be built.", new Object[0]);
            return null;
        }
        Long key = entry.getKey();
        long jLongValue2 = key.longValue();
        long j2 = this.MediaSessionCompatQueueItem;
        long jLongValue3 = entry.getKey().longValue();
        Iterator<Long> it2 = this.IconCompatParcelizer.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                jLongValue = this.MediaSessionCompatQueueItem;
                break;
            }
            Long next = it2.next();
            if (next.longValue() > jLongValue3) {
                jLongValue = next.longValue();
                break;
            }
        }
        long jMin = Math.min(j2, jLongValue);
        String value = entry.getValue();
        boolean z3 = true;
        this.ComponentActivity++;
        ConfigurationManager configurationManager = this.MediaSessionCompatResultReceiverWrapper;
        synchronized (configurationManager) {
            String strIconCompatParcelizer = ConfigurationManager.IconCompatParcelizer((byte) 1);
            z = configurationManager.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4().contains(strIconCompatParcelizer) || configurationManager.MediaMetadataCompat().contains(strIconCompatParcelizer);
        }
        if (!z) {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer("Requested next trip payload, but it is not being requested on any network.", new Object[0]);
            return null;
        }
        long jR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = this.MediaSessionCompatResultReceiverWrapper.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        long j3 = jR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus > 0 ? jMin + jR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus : jMin;
        DetectionTrigger detectionTrigger2 = this.MediaMetadataCompat;
        DetectionTrigger detectionTrigger3 = this.RatingCompat;
        byte bByteValue = this.MediaDescriptionCompat.byteValue();
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = this.write;
        component4android_sdk_base_release component4android_sdk_base_releaseVar = this.read;
        parseLonglambda0 parselonglambda2 = this.MediaBrowserCompatMediaItem;
        if (serializer()) {
            parselonglambda2.IconCompatParcelizer("Building trip %s for duration %s to %s, with sensor and event data ending at %s", value, com.sentiance.sdk.util.x.c(jLongValue2), com.sentiance.sdk.util.x.c(jMin), com.sentiance.sdk.util.x.c(j3));
            ArrayList arrayList3 = new ArrayList();
            parseLonglambda0 parselonglambda3 = parselonglambda2;
            component4android_sdk_base_release component4android_sdk_base_releaseVar2 = component4android_sdk_base_releaseVar;
            DetectionTrigger detectionTrigger4 = detectionTrigger3;
            Iterator<getCooldownEnterSeconds.read> it3 = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdaE7oIx09KQauliA8paOfGanE2_e8.class, key, Long.valueOf(j3), false, false).iterator();
            while (it3.hasNext()) {
                getCooldownEnterSeconds.read next2 = it3.next();
                if (!serializer()) {
                    break;
                }
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = next2.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar2);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (r8lambdae7oix09kqaulia8paofgane2_e8 = (r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer).getActivityResultRegistry) != null) {
                    String str3 = r8lambdae7oix09kqaulia8paofgane2_e8.MediaDescriptionCompat;
                    setsoundifpresentandsupportedlambda1.getClass();
                    if (str3 != null) {
                        int iHashCode = str3.hashCode();
                        if (iHashCode != -1078030475) {
                            if (iHashCode != 107348) {
                                if (iHashCode == 3202466 && str3.equals(com.adjust.sdk.Constants.HIGH)) {
                                    r8 = 2;
                                } else {
                                    r8 = -1;
                                }
                            } else if (str3.equals(com.adjust.sdk.Constants.LOW)) {
                                r8 = z3;
                            } else {
                                r8 = -1;
                            }
                        } else if (str3.equals(com.adjust.sdk.Constants.MEDIUM)) {
                            r8 = 0;
                        } else {
                            r8 = -1;
                        }
                        if (r8 == 0) {
                            str2 = com.adjust.sdk.Constants.MEDIUM;
                        } else if (r8 == z3) {
                            str2 = com.adjust.sdk.Constants.LOW;
                        } else if (r8 != 2) {
                            str = null;
                        } else {
                            str2 = com.adjust.sdk.Constants.HIGH;
                        }
                        str = str2;
                    } else {
                        str = null;
                    }
                    setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda2 = this.write;
                    getCooldownEnterSeconds getcooldownenterseconds = this.RemoteActionCompatParcelizer;
                    component4android_sdk_base_release component4android_sdk_base_releaseVar3 = this.read;
                    getVerticalAccuracy getverticalaccuracy = this.serializer;
                    long jSerializer = next2.serializer();
                    r8lambdaE7oIx09KQauliA8paOfGanE2_e8 r8lambdae7oix09kqaulia8paofgane2_e9 = r8lambdaturwertf3otevz1wenzex5tdwa.getActivityResultRegistry;
                    Iterator<getCooldownEnterSeconds.read> it4 = it3;
                    Long l = key;
                    component4android_sdk_base_release component4android_sdk_base_releaseVar4 = component4android_sdk_base_releaseVar2;
                    long j4 = j3;
                    long j5 = jLongValue2;
                    handleNotificationOpenedlambda1 handlenotificationopenedlambda1 = new handleNotificationOpenedlambda1(new handleNotificationOpenedlambda0(setsoundifpresentandsupportedlambda2, getcooldownenterseconds, component4android_sdk_base_releaseVar3, getverticalaccuracy, jSerializer, value, r8lambdae7oix09kqaulia8paofgane2_e9.read, r8lambdae7oix09kqaulia8paofgane2_e9.IconCompatParcelizer, r8lambdae7oix09kqaulia8paofgane2_e9.MediaSessionCompatResultReceiverWrapper, r8lambdae7oix09kqaulia8paofgane2_e9.serializer, r8lambdae7oix09kqaulia8paofgane2_e9.RemoteActionCompatParcelizer, r8lambdae7oix09kqaulia8paofgane2_e9.MediaBrowserCompatMediaItem, r8lambdae7oix09kqaulia8paofgane2_e9.RatingCompat, str));
                    if (handlenotificationopenedlambda1.hasNext() && (setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release = ((incrementCustomUserAttributedefault) ((getCustomLocationProviderNamesandroid_sdk_base_release) handlenotificationopenedlambda1.next().first).IconCompatParcelizer.get(0)).write.RemoteActionCompatParcelizer.read.serializer) != null) {
                        arrayList3.add(setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release.read.MediaMetadataCompat);
                    }
                    it3 = it4;
                    key = l;
                    component4android_sdk_base_releaseVar2 = component4android_sdk_base_releaseVar4;
                    j3 = j4;
                    jLongValue2 = j5;
                    z3 = true;
                }
            }
            component4android_sdk_base_release component4android_sdk_base_releaseVar5 = component4android_sdk_base_releaseVar2;
            Long l2 = key;
            long j6 = j3;
            long j7 = jLongValue2;
            ConfigurationManager configurationManager2 = this.MediaSessionCompatResultReceiverWrapper;
            if (!configurationManager2.read((byte) 0) && (!configurationManager2.read((byte) 1) || arrayList3.isEmpty())) {
                j = j7;
                parselonglambda3.IconCompatParcelizer("Skipping building payload for trip ID %s, because it has no crash events.", new Object[0]);
            } else {
                ArrayList arrayList4 = this.PlaybackStateCompatCustomAction.read(j7, j6, this.ParcelableVolumeInfo);
                ArrayList arrayList5 = this.PlaybackStateCompatCustomAction.read(j7, j6);
                ArrayList arrayList6 = new ArrayList();
                long j8 = j7 - 1;
                Iterator<getCooldownEnterSeconds.read> it5 = this.RemoteActionCompatParcelizer.write(Arrays.asList(retryInAppMessage.class, setStaticExternalIEventMessengerandroid_sdk_base_release.class), Long.valueOf(j8), Long.valueOf(j6), false, false).iterator();
                setCustomUserAttributelambda4 setcustomuserattributelambda4 = null;
                while (it5.hasNext()) {
                    getCooldownEnterSeconds.read next3 = it5.next();
                    if (!serializer()) {
                        break;
                    }
                    component4android_sdk_base_release component4android_sdk_base_releaseVar6 = component4android_sdk_base_releaseVar5;
                    r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 = next3.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar6);
                    if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 == null) {
                        arrayList = arrayList3;
                        arrayList4 = arrayList4;
                        it = it5;
                        arrayList2 = arrayList5;
                    } else {
                        it = it5;
                        Long l3 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer;
                        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa2 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2.serializer;
                        arrayList = arrayList3;
                        retryInAppMessage retryinappmessage2 = r8lambdaturwertf3otevz1wenzex5tdwa2.addOnPictureInPictureUiStateChangedListener;
                        if (retryinappmessage2 != null) {
                            arrayList2 = arrayList5;
                            Boolean bool = retryinappmessage2.serializer;
                            if (bool != null) {
                                arrayList4 = arrayList4;
                                b3 = 1;
                                if (retryinappmessage2.read.byteValue() != 1 || !bool.booleanValue()) {
                                    retryinappmessage = r8lambdaturwertf3otevz1wenzex5tdwa2.addOnPictureInPictureUiStateChangedListener;
                                    if (retryinappmessage != null) {
                                        if (retryinappmessage.read.byteValue() == b3) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        l3.getClass();
                                        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                                        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = l3;
                                        if (z2) {
                                            b4 = 1;
                                        } else {
                                            b4 = 2;
                                        }
                                        r8lambda1mnczrzuv4owduwgkg6cjtsws.write = Byte.valueOf(b4);
                                        setcustomuserattributelambda4IconCompatParcelizer = r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer();
                                    } else if (r8lambdaturwertf3otevz1wenzex5tdwa2.defaultViewModelProviderFactory_delegatelambda0 != null) {
                                        l3.getClass();
                                        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws2 = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                                        r8lambda1mnczrzuv4owduwgkg6cjtsws2.IconCompatParcelizer = l3;
                                        r8lambda1mnczrzuv4owduwgkg6cjtsws2.write = (byte) 1;
                                        setcustomuserattributelambda4IconCompatParcelizer = r8lambda1mnczrzuv4owduwgkg6cjtsws2.IconCompatParcelizer();
                                    }
                                }
                                if (setcustomuserattributelambda4IconCompatParcelizer != null) {
                                    if (setcustomuserattributelambda4 != null || !setcustomuserattributelambda4.write.equals(setcustomuserattributelambda4IconCompatParcelizer.write)) {
                                        arrayList6.add(setcustomuserattributelambda4IconCompatParcelizer);
                                    }
                                    setcustomuserattributelambda4 = setcustomuserattributelambda4IconCompatParcelizer;
                                }
                                component4android_sdk_base_releaseVar5 = component4android_sdk_base_releaseVar6;
                                it5 = it;
                                arrayList3 = arrayList;
                                arrayList5 = arrayList2;
                                arrayList4 = arrayList4;
                            }
                        } else {
                            arrayList2 = arrayList5;
                        }
                        b3 = 1;
                        retryinappmessage = r8lambdaturwertf3otevz1wenzex5tdwa2.addOnPictureInPictureUiStateChangedListener;
                        if (retryinappmessage != null) {
                            if (retryinappmessage.read.byteValue() == b3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            l3.getClass();
                            r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws3 = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                            r8lambda1mnczrzuv4owduwgkg6cjtsws3.IconCompatParcelizer = l3;
                            if (z2) {
                                b4 = 1;
                            } else {
                                b4 = 2;
                            }
                            r8lambda1mnczrzuv4owduwgkg6cjtsws3.write = Byte.valueOf(b4);
                            setcustomuserattributelambda4IconCompatParcelizer = r8lambda1mnczrzuv4owduwgkg6cjtsws3.IconCompatParcelizer();
                        } else if (r8lambdaturwertf3otevz1wenzex5tdwa2.defaultViewModelProviderFactory_delegatelambda0 != null) {
                            l3.getClass();
                            r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws4 = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                            r8lambda1mnczrzuv4owduwgkg6cjtsws4.IconCompatParcelizer = l3;
                            r8lambda1mnczrzuv4owduwgkg6cjtsws4.write = (byte) 1;
                            setcustomuserattributelambda4IconCompatParcelizer = r8lambda1mnczrzuv4owduwgkg6cjtsws4.IconCompatParcelizer();
                        }
                        if (setcustomuserattributelambda4IconCompatParcelizer != null) {
                            if (setcustomuserattributelambda4 != null) {
                                arrayList6.add(setcustomuserattributelambda4IconCompatParcelizer);
                            } else {
                                arrayList6.add(setcustomuserattributelambda4IconCompatParcelizer);
                            }
                            setcustomuserattributelambda4 = setcustomuserattributelambda4IconCompatParcelizer;
                        }
                        component4android_sdk_base_releaseVar5 = component4android_sdk_base_releaseVar6;
                        it5 = it;
                        arrayList3 = arrayList;
                        arrayList5 = arrayList2;
                        arrayList4 = arrayList4;
                    }
                    setcustomuserattributelambda4IconCompatParcelizer = null;
                    if (setcustomuserattributelambda4IconCompatParcelizer != null) {
                        if (setcustomuserattributelambda4 != null) {
                            arrayList6.add(setcustomuserattributelambda4IconCompatParcelizer);
                        } else {
                            arrayList6.add(setcustomuserattributelambda4IconCompatParcelizer);
                        }
                        setcustomuserattributelambda4 = setcustomuserattributelambda4IconCompatParcelizer;
                    }
                    component4android_sdk_base_releaseVar5 = component4android_sdk_base_releaseVar6;
                    it5 = it;
                    arrayList3 = arrayList;
                    arrayList5 = arrayList2;
                    arrayList4 = arrayList4;
                }
                ArrayList arrayList7 = arrayList3;
                ArrayList arrayList8 = arrayList4;
                ArrayList arrayList9 = arrayList5;
                component4android_sdk_base_release component4android_sdk_base_releaseVar7 = component4android_sdk_base_releaseVar5;
                ArrayList arrayList10 = new ArrayList();
                Iterator<getCooldownEnterSeconds.read> it6 = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.class, Long.valueOf(j8), Long.valueOf(j6), false, false).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        parselonglambda0 = parselonglambda3;
                        b = 2;
                        b2 = 1;
                        parselonglambda0.IconCompatParcelizer("Found %d call events for trip", Integer.valueOf(arrayList10.size()));
                        break;
                    }
                    getCooldownEnterSeconds.read next4 = it6.next();
                    if (!serializer()) {
                        parselonglambda0 = parselonglambda3;
                        b = 2;
                        b2 = 1;
                        break;
                    }
                    r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3 = next4.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar7);
                    if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3 == null || (r8lambda2l1vxswbmfutp9a4iejxpq7zf7a = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3.serializer.enterPictureInPictureMode) == null) {
                        parselonglambda1 = parselonglambda3;
                        parselonglambda1.IconCompatParcelizer("Unable to deserialise - null CallEvent", new Object[0]);
                        r8lambdadeozq815xuuwmllyyvm_qv79qy = null;
                    } else {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 6);
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.write = Long.valueOf(next4.serializer());
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = Byte.valueOf(r8lambda2l1vxswbmfutp9a4iejxpq7zf7a.serializer.byteValue() == 1 ? (byte) 1 : (byte) 2);
                        Byte b5 = r8lambda2l1vxswbmfutp9a4iejxpq7zf7a.read;
                        if (b5 != null) {
                            byte bByteValue2 = b5.byteValue();
                            r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = Byte.valueOf(bByteValue2 == 2 ? (byte) 2 : bByteValue2 == 1 ? (byte) 1 : (byte) 3);
                        }
                        parselonglambda1 = parselonglambda3;
                    }
                    setDefaultNotificationChannelDescriptionlambda0 setdefaultnotificationchanneldescriptionlambda0Write = r8lambdadeozq815xuuwmllyyvm_qv79qy == null ? null : r8lambdadeozq815xuuwmllyyvm_qv79qy.write();
                    if (setdefaultnotificationchanneldescriptionlambda0Write != null) {
                        arrayList10.add(setdefaultnotificationchanneldescriptionlambda0Write);
                    }
                    parselonglambda3 = parselonglambda1;
                }
                List list = (List) this.PlaybackStateCompat.RemoteActionCompatParcelizer(j7, j6).stream().map(new Function() { // from class: o.sendPushActionIntentlambda1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return setAccentColorIfPresentAndSupported.write(this.serializer, (createNotification) obj);
                    }
                }).collect(Collectors.toList());
                if (hasNext()) {
                    if (detectionTrigger != DetectionTrigger.EXTERNAL) {
                        detectionTrigger = detectionTrigger2;
                        b = b2;
                    }
                    detectionTrigger = detectionTrigger2;
                    bByteValue = b;
                    detectionTrigger4 = detectionTrigger;
                } else {
                    detectionTrigger = detectionTrigger2;
                }
                r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r8lambdaxnkp5mxo9act549dmvgqnyhj0iIconCompatParcelizer = this.MediaSessionCompatToken.IconCompatParcelizer(j7);
                Map map = r8lambdaxnkp5mxo9act549dmvgqnyhj0iIconCompatParcelizer == null ? null : r8lambdaxnkp5mxo9act549dmvgqnyhj0iIconCompatParcelizer.IconCompatParcelizer;
                if (r8lambdaxnkp5mxo9act549dmvgqnyhj0iIconCompatParcelizer == null) {
                    transportModeWrite = null;
                } else {
                    Byte b6 = r8lambdaxnkp5mxo9act549dmvgqnyhj0iIconCompatParcelizer.read;
                    setsoundifpresentandsupportedlambda1.getClass();
                    transportModeWrite = setSoundIfPresentAndSupportedlambda1.write(b6);
                }
                DetectionTrigger detectionTrigger5 = detectionTrigger;
                List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getShouldPersistWebView.class, l2, Long.valueOf(j6), false, false);
                HashMap map2 = new HashMap();
                for (getCooldownEnterSeconds.read readVar : listRemoteActionCompatParcelizer) {
                    if (!serializer()) {
                        break;
                    }
                    r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer4 = readVar.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar7);
                    if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer4 != null && (getshouldpersistwebview = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer4.serializer.PlaybackStateCompatCustomAction) != null) {
                        for (Map.Entry entry2 : getshouldpersistwebview.serializer.entrySet()) {
                            map2.put((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                }
                HashMap map3 = new HashMap();
                if (map != null) {
                    for (Map.Entry entry3 : map.entrySet()) {
                        map3.put((String) entry3.getKey(), (String) entry3.getValue());
                    }
                }
                for (Map.Entry entry4 : map2.entrySet()) {
                    map3.put((String) entry4.getKey(), (String) entry4.getValue());
                }
                parseLonglambda0 parselonglambda4 = parselonglambda0;
                j = j7;
                migrateFeatureFlagStorageToJsonlambda21 migratefeatureflagstoragetojsonlambda21 = new migrateFeatureFlagStorageToJsonlambda21(value, detectionTrigger5, detectionTrigger4, Byte.valueOf(bByteValue), arrayList8, arrayList9, arrayList6, arrayList10, list, arrayList7, j, jMin, map3.size() == 0 ? null : map3, transportModeWrite);
                if (serializer()) {
                    if (list != null) {
                        parselonglambda4.IconCompatParcelizer("Sensor frequencies for trip: %s", (Map) list.stream().collect(Collectors.toMap(new H3Core$$ExternalSyntheticLambda2(9), new H3Core$$ExternalSyntheticLambda2(10))));
                    }
                    getbadnetworkintervalandroid_sdk_base_releaseIconCompatParcelizer = migratefeatureflagstoragetojsonlambda21.RemoteActionCompatParcelizer().IconCompatParcelizer();
                }
            }
            getbadnetworkintervalandroid_sdk_base_releaseIconCompatParcelizer = null;
        } else {
            j = jLongValue2;
        }
        if (getbadnetworkintervalandroid_sdk_base_releaseIconCompatParcelizer == null) {
            return null;
        }
        setCategoryIfPresentAndSupportedlambda0 setcategoryifpresentandsupportedlambda0 = new setCategoryIfPresentAndSupportedlambda0(j, jMin, value, this.ParcelableVolumeInfo);
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda3 = this.write;
        setsoundifpresentandsupportedlambda3.getClass();
        return new Pair<>(setsoundifpresentandsupportedlambda3.write(getbadnetworkintervalandroid_sdk_base_releaseIconCompatParcelizer, getbadnetworkintervalandroid_sdk_base_releaseIconCompatParcelizer.serializer), setcategoryifpresentandsupportedlambda0);
    }

    public setAccentColorIfPresentAndSupported(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, Map map, getVerticalAccuracy getverticalaccuracy, long j, DetectionTrigger detectionTrigger, DetectionTrigger detectionTrigger2, Byte b, parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager, getTrackingStringandroid_sdk_base_releaseannotations gettrackingstringandroid_sdk_base_releaseannotations, boolean z, setTickerIfPresent settickerifpresent, sendPushActionIntentlambda0 sendpushactionintentlambda0) {
        this.write = setsoundifpresentandsupportedlambda1;
        this.RemoteActionCompatParcelizer = getcooldownenterseconds;
        this.read = component4android_sdk_base_releaseVar;
        this.serializer = getverticalaccuracy;
        this.IconCompatParcelizer = map;
        this.MediaSessionCompatQueueItem = j;
        this.MediaMetadataCompat = detectionTrigger;
        this.RatingCompat = detectionTrigger2;
        this.MediaDescriptionCompat = b;
        this.MediaBrowserCompatMediaItem = parselonglambda0;
        this.MediaSessionCompatResultReceiverWrapper = configurationManager;
        this.MediaSessionCompatToken = gettrackingstringandroid_sdk_base_releaseannotations;
        this.PlaybackStateCompatCustomAction = settickerifpresent;
        this.ParcelableVolumeInfo = z;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = sendpushactionintentlambda0;
        this.PlaybackStateCompat = new routeUserWithNotificationOpenedIntentlambda3(parselonglambda0, getcooldownenterseconds, component4android_sdk_base_releaseVar, configurationManager, this, this, this);
    }

    private Map.Entry<Long, String> read(Map<Long, String> map) {
        int i = 0;
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            if (i == this.ComponentActivity) {
                return entry;
            }
            i++;
        }
        return null;
    }

    @Override // o.routeUserWithNotificationOpenedIntentlambda4
    public final long write(long j, long j2) {
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(j2), false).RemoteActionCompatParcelizer();
        return readVarRemoteActionCompatParcelizer != null ? Math.min(j, readVarRemoteActionCompatParcelizer.serializer()) : j;
    }

    @Override // o.routeUserWithNotificationOpenedIntentlambda0
    public final List<SensorType> RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatResultReceiverWrapper.write(this.MediaMetadataCompat);
    }
}
