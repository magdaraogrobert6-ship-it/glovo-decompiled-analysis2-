package o;

import android.location.Location;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.MotionActivity;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.Optional;
import io.socket.parser.IOParser$Decoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TripPayloadUtil")
public class setTickerIfPresent {
    private final component4android_sdk_base_release IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final getVerticalAccuracy read;
    private final getCooldownEnterSeconds serializer;
    private final setSoundIfPresentAndSupportedlambda1 write;

    public setTickerIfPresent(parseLonglambda0 parselonglambda0, getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, component4android_sdk_base_release component4android_sdk_base_releaseVar) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.serializer = getcooldownenterseconds;
        this.read = getverticalaccuracy;
        this.write = setsoundifpresentandsupportedlambda1;
        this.IconCompatParcelizer = component4android_sdk_base_releaseVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x010e  */
    /* JADX WARN: Code duplicated, block: B:32:0x011c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x0258  */
    public final ArrayList read(long j, long j2, boolean z) {
        String str;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa;
        r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A r8lambdadtwa3yx1e9cvszaagaemidzvt8a;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu;
        r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda6;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa2;
        wipeDatalambda0 wipedatalambda0;
        r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A r8lambdadtwa3yx1e9cvszaagaemidzvt8a2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        getCooldownEnterSeconds getcooldownenterseconds = this.serializer;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, Long.valueOf(j), false);
        boolean zIconCompatParcelizer = optionalRemoteActionCompatParcelizer.IconCompatParcelizer();
        component4android_sdk_base_release component4android_sdk_base_releaseVar = this.IconCompatParcelizer;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = this.write;
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        getVerticalAccuracy getverticalaccuracy = this.read;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda7 = null;
        if (!zIconCompatParcelizer) {
            str = "stationary";
        } else if (!Arrays.asList(r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class, wipeDatalambda0.class).contains(getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), getverticalaccuracy))) {
            str = "stationary";
        } else {
            if (!z) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 = optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 == null || (((wipedatalambda0 = (r8lambdaturwertf3otevz1wenzex5tdwa2 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2.serializer).MediaBrowserCompatMediaItem) == null || (brazeCompanionExternalSyntheticLambda6 = wipedatalambda0.RemoteActionCompatParcelizer) == null) && ((r8lambdadtwa3yx1e9cvszaagaemidzvt8a2 = r8lambdaturwertf3otevz1wenzex5tdwa2.addObserverForBackInvoker) == null || (brazeCompanionExternalSyntheticLambda6 = r8lambdadtwa3yx1e9cvszaagaemidzvt8a2.write) == null))) {
                    brazeCompanionExternalSyntheticLambda6 = null;
                }
                if (brazeCompanionExternalSyntheticLambda6 != null) {
                    getverticalaccuracy.getClass();
                    Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda6);
                    locationWrite.setTime(j);
                    locationWrite.setProvider("stationary");
                    parselonglambda0.IconCompatParcelizer("Adding previous stationary location to waypoints (%f, %f)", Double.valueOf(locationWrite.getLatitude()), Double.valueOf(locationWrite.getLongitude()));
                    setsoundifpresentandsupportedlambda1.getClass();
                    arrayList.add(setSoundIfPresentAndSupportedlambda1.read(locationWrite));
                }
            }
            long jRemoteActionCompatParcelizer = optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer();
            Optional optionalWrite = getcooldownenterseconds.write(jRemoteActionCompatParcelizer, list, true);
            if (!optionalWrite.read()) {
                str = "stationary";
                List listAsList = Arrays.asList(setShouldPersistWebView.class, r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class);
                int iMediaSessionCompatQueueItem = ((getCooldownEnterSeconds.read) optionalWrite.write()).MediaSessionCompatQueueItem();
                getverticalaccuracy.getClass();
                if (listAsList.contains(getVerticalAccuracy.write(iMediaSessionCompatQueueItem))) {
                    r8lambdaqtf70aj7a5o7b4yj33reyelsu = (r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) getcooldownenterseconds.write(jRemoteActionCompatParcelizer, new setTickerIfPresentlambda0(((getCooldownEnterSeconds.read) optionalWrite.write()).RemoteActionCompatParcelizer(), ((getCooldownEnterSeconds.read) optionalWrite.write()).serializer())).RemoteActionCompatParcelizer();
                }
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsu == null) {
                    parselonglambda0.IconCompatParcelizer("Geofence exit event is null (tripStartTime: %s)", com.sentiance.sdk.util.x.c(j));
                } else {
                    parselonglambda0.IconCompatParcelizer("Geofence exit event has ingestion time %s (tripStartTime: %s)", com.sentiance.sdk.util.x.c(r8lambdaqtf70aj7a5o7b4yj33reyelsu.write.longValue()), com.sentiance.sdk.util.x.c(j));
                }
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsu != null && r8lambdaqtf70aj7a5o7b4yj33reyelsu.write.longValue() > optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer() && (r8lambdazeccixubf3xvz58yt5bojkwhdu = r8lambdaqtf70aj7a5o7b4yj33reyelsu.serializer.fullyDrawnReporter_delegatelambda0) != null && (brazeCompanionExternalSyntheticLambda5 = r8lambdazeccixubf3xvz58yt5bojkwhdu.serializer) != null) {
                    getverticalaccuracy.getClass();
                    Location locationWrite2 = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda5);
                    hashSet.add(Long.valueOf(locationWrite2.getTime()));
                    locationWrite2.setTime(locationWrite2.getTime() + 1);
                    setsoundifpresentandsupportedlambda1.getClass();
                    arrayList.add(setSoundIfPresentAndSupportedlambda1.read(locationWrite2));
                }
            } else {
                str = "stationary";
            }
            parselonglambda0.IconCompatParcelizer("No moving state following the stationary state", new Object[0]);
            r8lambdaqtf70aj7a5o7b4yj33reyelsu = null;
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsu == null) {
                parselonglambda0.IconCompatParcelizer("Geofence exit event is null (tripStartTime: %s)", com.sentiance.sdk.util.x.c(j));
            } else {
                parselonglambda0.IconCompatParcelizer("Geofence exit event has ingestion time %s (tripStartTime: %s)", com.sentiance.sdk.util.x.c(r8lambdaqtf70aj7a5o7b4yj33reyelsu.write.longValue()), com.sentiance.sdk.util.x.c(j));
            }
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsu != null) {
                getverticalaccuracy.getClass();
                Location locationWrite3 = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda5);
                hashSet.add(Long.valueOf(locationWrite3.getTime()));
                locationWrite3.setTime(locationWrite3.getTime() + 1);
                setsoundifpresentandsupportedlambda1.getClass();
                arrayList.add(setSoundIfPresentAndSupportedlambda1.read(locationWrite3));
            }
        }
        Iterator<getCooldownEnterSeconds.read> it = this.serializer.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(j - 1), Long.valueOf(j2), false, false).iterator();
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3 = it.next().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3 != null && (r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer3.serializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null) {
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda8 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
                if (hashSet.add(brazeCompanionExternalSyntheticLambda8.RemoteActionCompatParcelizer)) {
                    getverticalaccuracy.getClass();
                    Location locationWrite4 = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda8);
                    setsoundifpresentandsupportedlambda1.getClass();
                    arrayList.add(setSoundIfPresentAndSupportedlambda1.read(locationWrite4));
                }
            } else {
                parselonglambda0.IconCompatParcelizer("Unable to deserialise - null Location event", new Object[0]);
            }
        }
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list2 = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        Optional optionalWrite2 = getcooldownenterseconds.write(j2 - 1, list2, true);
        if (optionalWrite2.IconCompatParcelizer() && ((getCooldownEnterSeconds.read) optionalWrite2.write()).serializer() == j2) {
            Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer((getCooldownEnterSeconds.read) optionalWrite2.write(), getverticalaccuracy);
            if (Arrays.asList(r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class, wipeDatalambda0.class).contains(getBitmapFromCache.IconCompatParcelizer((getCooldownEnterSeconds.read) optionalWrite2.write(), getverticalaccuracy))) {
                r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) optionalWrite2.write()).RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
            } else if (clsIconCompatParcelizer == BrazeActivityLifecycleCallbackListeneronActivityCreated2.class) {
                Optional optionalWrite3 = getcooldownenterseconds.write(((getCooldownEnterSeconds.read) optionalWrite2.write()).serializer(), list2, true);
                if (optionalWrite3.IconCompatParcelizer() && getVerticalAccuracy.write(((getCooldownEnterSeconds.read) optionalWrite3.write()).MediaSessionCompatQueueItem()) == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class) {
                    r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) optionalWrite3.write()).RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
                } else {
                    r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = null;
                }
            } else {
                r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = null;
            }
        } else {
            r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = null;
        }
        if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && ((r8lambdadtwa3yx1e9cvszaagaemidzvt8a = (r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer).addObserverForBackInvoker) != null || r8lambdaturwertf3otevz1wenzex5tdwa.MediaBrowserCompatMediaItem != null)) {
            wipeDatalambda0 wipedatalambda1 = r8lambdaturwertf3otevz1wenzex5tdwa.MediaBrowserCompatMediaItem;
            if ((wipedatalambda1 != null && (brazeCompanionExternalSyntheticLambda4 = wipedatalambda1.RemoteActionCompatParcelizer) != null) || (r8lambdadtwa3yx1e9cvszaagaemidzvt8a != null && (brazeCompanionExternalSyntheticLambda4 = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.write) != null)) {
                brazeCompanionExternalSyntheticLambda7 = brazeCompanionExternalSyntheticLambda4;
            }
            if (brazeCompanionExternalSyntheticLambda7 != null) {
                getverticalaccuracy.getClass();
                Location location = new Location(getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda7));
                location.setProvider(str);
                parselonglambda0.IconCompatParcelizer("Adding next stationary location to waypoints (%f, %f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                setsoundifpresentandsupportedlambda1.getClass();
                arrayList.add(setSoundIfPresentAndSupportedlambda1.read(location));
            }
        }
        parselonglambda0.IconCompatParcelizer("Found %d waypoints for trip", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    public final ArrayList read(long j, long j2) {
        int i;
        Byte b;
        long j3 = j - 300000;
        ArrayList arrayList = new ArrayList();
        List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(handleInAppMessageTestPush.class, Long.valueOf(j3), Long.valueOf(j2), true, false);
        List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer2 = this.serializer.RemoteActionCompatParcelizer(setSessionHandlingBlocklist.class, Long.valueOf(j3), Long.valueOf(j2), false, false);
        listRemoteActionCompatParcelizer2.addAll(listRemoteActionCompatParcelizer);
        Iterator<getCooldownEnterSeconds.read> it = listRemoteActionCompatParcelizer2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            getCooldownEnterSeconds.read next = it.next();
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = next.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer == null) {
                b = null;
            } else {
                r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer;
                setSessionHandlingBlocklist setsessionhandlingblocklist = r8lambdaturwertf3otevz1wenzex5tdwa.getDefaultViewModelProviderFactory;
                if (setsessionhandlingblocklist != null) {
                    b = setsessionhandlingblocklist.RemoteActionCompatParcelizer;
                } else {
                    handleInAppMessageTestPush handleinappmessagetestpush = r8lambdaturwertf3otevz1wenzex5tdwa.MediaSessionCompatQueueItem;
                    if (handleinappmessagetestpush != null) {
                        b = handleinappmessagetestpush.write;
                    } else {
                        b = null;
                    }
                }
            }
            if (b != null) {
                this.write.getClass();
                MotionActivity motionActivitySerializer = setSoundIfPresentAndSupportedlambda1.serializer(b);
                if (motionActivitySerializer != null) {
                    long jSerializer = next.serializer();
                    setSessionHandlingBlocklist setsessionhandlingblocklist2 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.getDefaultViewModelProviderFactory;
                    byte bByteValue = setsessionhandlingblocklist2 != null ? setsessionhandlingblocklist2.IconCompatParcelizer.serializer.byteValue() : (byte) 100;
                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 2);
                    IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                    iOParser$Decoder.RemoteActionCompatParcelizer = Byte.valueOf(bByteValue);
                    r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = iOParser$Decoder.serializer();
                    r8lambdadeozq815xuuwmllyyvm_qv79qy.write = motionActivitySerializer;
                    r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = Long.valueOf(jSerializer);
                    arrayList.add(r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new wg$$ExternalSyntheticLambda0(28));
        ArrayList arrayList3 = new ArrayList(arrayList2);
        for (int size = arrayList3.size() - 1; size >= 1; size--) {
            if (((getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) arrayList3.get(size - 1)).equals(arrayList3.get(size))) {
                arrayList3.remove(size);
                i++;
            }
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Found %d motion activities for trip, %d duplicates excluded", Integer.valueOf(arrayList2.size()), Integer.valueOf(i));
        return arrayList3;
    }
}
