package o;

import android.location.Location;
import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TimeSeriesType;
import io.socket.parser.IOParser$Decoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class handleNotificationOpenedlambda1 extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ handleNotificationOpenedlambda0 serializer;

    public handleNotificationOpenedlambda1(handleNotificationOpenedlambda0 handlenotificationopenedlambda0) {
        this.serializer = handlenotificationopenedlambda0;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ac  */
    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        removeFromSubscriptionGrouplambda0 removefromsubscriptiongrouplambda0;
        List list;
        String str;
        byte b;
        handleNotificationOpenedlambda0 handlenotificationopenedlambda0;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        handleNotificationOpenedlambda0 handlenotificationopenedlambda1 = this.serializer;
        long j = handlenotificationopenedlambda1.IconCompatParcelizer - 5001;
        long j2 = handlenotificationopenedlambda1.IconCompatParcelizer + DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = handlenotificationopenedlambda1.read.RemoteActionCompatParcelizer(BrazeUser.class, Long.valueOf(j), Long.valueOf(j2), false, false);
        ArrayList arrayList = handleNotificationOpenedlambda0.read(handlenotificationopenedlambda1, listRemoteActionCompatParcelizer);
        if (!arrayList.isEmpty() && ((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) arrayList.get(0)).RemoteActionCompatParcelizer.longValue() > j && (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = handleNotificationOpenedlambda0.RemoteActionCompatParcelizer(handlenotificationopenedlambda1, listRemoteActionCompatParcelizer.get(0).IconCompatParcelizer())) != null) {
            arrayList.add(0, r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer);
        }
        Short shValueOf = handlenotificationopenedlambda1.MediaDescriptionCompat;
        if (shValueOf == null && handlenotificationopenedlambda1.MediaSessionCompatQueueItem != null) {
            shValueOf = Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.RemoteActionCompatParcelizer(handlenotificationopenedlambda1.MediaSessionCompatQueueItem.shortValue() / 100.0f)));
        }
        Short shValueOf2 = handlenotificationopenedlambda1.MediaSessionCompatQueueItem;
        if (shValueOf2 == null && shValueOf != null) {
            shValueOf2 = Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer((float) (((double) (shValueOf.shortValue() / 100.0f)) * 9.800000190734863d)));
        }
        setCountrylambda1 setcountrylambda1 = new setCountrylambda1();
        setcountrylambda1.RemoteActionCompatParcelizer = Long.valueOf(handlenotificationopenedlambda1.IconCompatParcelizer);
        r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM r8lambdaidq_hvsqzrowygs_o3rdceijnlm = new r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM();
        migrateMetadataToJsonlambda30 migratemetadatatojsonlambda30 = new migrateMetadataToJsonlambda30();
        migrateMetadataToJsonlambda30 migratemetadatatojsonlambda31 = new migrateMetadataToJsonlambda30();
        migrateMetadataToJsonlambda30 migratemetadatatojsonlambda32 = new migrateMetadataToJsonlambda30();
        Iterator it = arrayList.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu = (r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) it.next();
            Long l = r8lambdaqtf70aj7a5o7b4yj33reyelsu.RemoteActionCompatParcelizer;
            r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsu.serializer;
            long jLongValue = l.longValue();
            BrazeUser brazeUser = r8lambdaturwertf3otevz1wenzex5tdwa.addMenuProvider;
            if (brazeUser != null) {
                List list2 = brazeUser.serializer;
                Iterator it2 = it;
                Short sh = shValueOf2;
                int i = 0;
                while (true) {
                    List list3 = brazeUser.IconCompatParcelizer;
                    BrazeUser brazeUser2 = brazeUser;
                    if (i >= list2.size()) {
                        handlenotificationopenedlambda0 = handlenotificationopenedlambda1;
                        break;
                    }
                    List list4 = list2;
                    handlenotificationopenedlambda0 = handlenotificationopenedlambda1;
                    long jIntValue = ((long) ((Integer) list2.get(i)).intValue()) + jLongValue;
                    if (jIntValue > j2) {
                        break;
                    }
                    if (jIntValue >= j) {
                        if (j3 == 0) {
                            j3 = jIntValue;
                        }
                        r8lambdaidq_hvsqzrowygs_o3rdceijnlm.add(Integer.valueOf((int) (jIntValue - j3)));
                        float fRemoteActionCompatParcelizer = r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.RemoteActionCompatParcelizer(((Integer) ((List) list3.get(0)).get(i)).intValue());
                        float fRemoteActionCompatParcelizer2 = r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.RemoteActionCompatParcelizer(((Integer) ((List) list3.get(1)).get(i)).intValue());
                        float fRemoteActionCompatParcelizer3 = r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.RemoteActionCompatParcelizer(((Integer) ((List) list3.get(2)).get(i)).intValue());
                        migratemetadatatojsonlambda30.add(Short.valueOf((short) Math.min(Math.max(fRemoteActionCompatParcelizer, -32000.0f), 32000.0f)));
                        migratemetadatatojsonlambda31.add(Short.valueOf((short) Math.min(Math.max(fRemoteActionCompatParcelizer2, -32000.0f), 32000.0f)));
                        migratemetadatatojsonlambda32.add(Short.valueOf((short) Math.min(Math.max(fRemoteActionCompatParcelizer3, -32000.0f), 32000.0f)));
                    }
                    i++;
                    brazeUser = brazeUser2;
                    handlenotificationopenedlambda1 = handlenotificationopenedlambda0;
                    list2 = list4;
                }
                it = it2;
                shValueOf2 = sh;
                handlenotificationopenedlambda1 = handlenotificationopenedlambda0;
            }
        }
        handleNotificationOpenedlambda0 handlenotificationopenedlambda2 = handlenotificationopenedlambda1;
        Short sh2 = shValueOf2;
        O$b o$b = new O$b();
        o$b.write = Long.valueOf(j3);
        o$b.serializer = r8lambdaidq_hvsqzrowygs_o3rdceijnlm;
        o$b.read = Arrays.asList(migratemetadatatojsonlambda30, migratemetadatatojsonlambda31, migratemetadatatojsonlambda32);
        TimeSeriesType timeSeriesType = TimeSeriesType.ACCELEROMETER_ANDROID_G;
        if (timeSeriesType == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'type' cannot be null");
            return null;
        }
        o$b.RemoteActionCompatParcelizer = timeSeriesType;
        setcountrylambda1.write = o$b.RatingCompat();
        if (handlenotificationopenedlambda2.MediaBrowserCompatMediaItem == null) {
            removefromsubscriptiongrouplambda0 = null;
        } else {
            setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = handlenotificationopenedlambda2.write;
            getVerticalAccuracy getverticalaccuracy = handlenotificationopenedlambda2.serializer;
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = handlenotificationopenedlambda2.MediaBrowserCompatMediaItem;
            getverticalaccuracy.getClass();
            Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
            setsoundifpresentandsupportedlambda1.getClass();
            removefromsubscriptiongrouplambda0 = setSoundIfPresentAndSupportedlambda1.read(locationWrite);
        }
        setcountrylambda1.read = removefromsubscriptiongrouplambda0;
        List<r8lambdaR6dAybf4g5pc5sZkFujTnBDSk> list5 = handlenotificationopenedlambda2.MediaMetadataCompat;
        if (list5 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (r8lambdaR6dAybf4g5pc5sZkFujTnBDSk r8lambdar6daybf4g5pc5szkfujtnbdsk : list5) {
                BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4();
                String str2 = r8lambdar6daybf4g5pc5szkfujtnbdsk.read;
                if (str2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'name' cannot be null");
                    return null;
                }
                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer = str2;
                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer = r8lambdar6daybf4g5pc5szkfujtnbdsk.IconCompatParcelizer;
                String str3 = r8lambdar6daybf4g5pc5szkfujtnbdsk.serializer;
                if (str3 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'version' cannot be null");
                    return null;
                }
                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write = str3;
                arrayList2.add(brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer());
            }
            list = arrayList2;
        }
        setcountrylambda1.MediaSessionCompatQueueItem = list;
        setcountrylambda1.MediaDescriptionCompat = shValueOf;
        setcountrylambda1.MediaMetadataCompat = sh2;
        setcountrylambda1.RatingCompat = handlenotificationopenedlambda2.PlaybackStateCompatCustomAction;
        setcountrylambda1.serializer = handlenotificationopenedlambda2.MediaSessionCompatResultReceiverWrapper;
        setcountrylambda1.PlaybackStateCompatCustomAction = handlenotificationopenedlambda2.ParcelableVolumeInfo;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda2 = handlenotificationopenedlambda2.write;
        String str4 = handlenotificationopenedlambda2.MediaSessionCompatToken;
        setsoundifpresentandsupportedlambda2.getClass();
        if (str4 == null) {
            str = null;
        } else {
            int iHashCode = str4.hashCode();
            str = com.adjust.sdk.Constants.LOW;
            if (iHashCode != -1078030475) {
                if (iHashCode != 107348) {
                    if (iHashCode == 3202466 && str4.equals(com.adjust.sdk.Constants.HIGH)) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str4.equals(com.adjust.sdk.Constants.LOW)) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str4.equals(com.adjust.sdk.Constants.MEDIUM)) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                str = com.adjust.sdk.Constants.MEDIUM;
            } else if (b != 1) {
                if (b != 2) {
                    str = null;
                } else {
                    str = com.adjust.sdk.Constants.HIGH;
                }
            }
        }
        setcountrylambda1.MediaBrowserCompatMediaItem = str;
        setCustomWebViewActivityClass setcustomwebviewactivityclass = setcountrylambda1.read();
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda3 = handlenotificationopenedlambda2.write;
        String str5 = handlenotificationopenedlambda2.RatingCompat;
        setsoundifpresentandsupportedlambda3.getClass();
        r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
        r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = setcustomwebviewactivityclass;
        setContentCardsUnreadVisualIndicatorEnabled setcontentcardsunreadvisualindicatorenabledRatingCompat = r8lambdayc78smgbbb6fudfjq0u5z3_ls.RatingCompat();
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        iOParser$Decoder.RemoteActionCompatParcelizer(str5);
        iOParser$Decoder.read = setcontentcardsunreadvisualindicatorenabledRatingCompat;
        return new Pair(setsoundifpresentandsupportedlambda3.write(iOParser$Decoder.MediaDescriptionCompat(), setcustomwebviewactivityclass.IconCompatParcelizer), null);
    }
}
