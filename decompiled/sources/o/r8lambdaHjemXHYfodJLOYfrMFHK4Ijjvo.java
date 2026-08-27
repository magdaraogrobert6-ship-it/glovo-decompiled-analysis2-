package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import fwfd.com.fwfsdk.util.FWFHelper;
import io.sentry.HostnameCache$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo implements IBrazeActionStep {
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(int i) {
        this.write = i;
    }

    public static IllegalStateException serializer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str) {
        String strM = ff$$ExternalSyntheticOutline0.m("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM);
        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, strM, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Code duplicated, block: B:588:0x09b4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.IBrazeActionStep
    public final Object write(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        byte b;
        Object obj;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        int i = this.write;
        Object obj2 = RemoteMessageConst.DATA;
        char c = 2;
        String strComponentActivity = null;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer = null;
        BrazeContentCardUtils brazeContentCardUtilsValueOf = null;
        String strComponentActivity2 = null;
        ArrayList arrayListWrite = null;
        ArrayList arrayListWrite2 = null;
        ConcurrentHashMap concurrentHashMap = null;
        ConcurrentHashMap concurrentHashMap2 = null;
        HashMap map = null;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = null;
        ConcurrentHashMap concurrentHashMap3 = null;
        ArrayList arrayList = null;
        ConcurrentHashMap concurrentHashMap4 = null;
        ConcurrentHashMap concurrentHashMap5 = null;
        ConcurrentHashMap concurrentHashMap6 = null;
        ConcurrentHashMap concurrentHashMap7 = null;
        switch (i) {
            case 0:
                return new r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            case 1:
                char c2 = 5;
                getsecondarg.write();
                Date dateSerializer = setNativeShader.serializer();
                ConcurrentHashMap concurrentHashMap8 = new ConcurrentHashMap();
                String strComponentActivity3 = null;
                String strComponentActivity4 = null;
                String strComponentActivity5 = null;
                r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxcoValueOf = null;
                ConcurrentHashMap concurrentHashMap9 = null;
                Date date = dateSerializer;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat.getClass();
                    switch (strPlaybackStateCompat.hashCode()) {
                        case -1008619738:
                            b = strPlaybackStateCompat.equals("origin") ? (byte) 0 : (byte) -1;
                            break;
                        case 3076010:
                            b = strPlaybackStateCompat.equals(obj2) ? (byte) 1 : (byte) -1;
                            break;
                        case 3575610:
                            b = strPlaybackStateCompat.equals("type") ? (byte) 2 : (byte) -1;
                            break;
                        case 50511102:
                            b = strPlaybackStateCompat.equals("category") ? (byte) 3 : (byte) -1;
                            break;
                        case 55126294:
                            b = strPlaybackStateCompat.equals("timestamp") ? (byte) 4 : (byte) -1;
                            break;
                        case 102865796:
                            b = strPlaybackStateCompat.equals("level") ? c2 : (byte) -1;
                            break;
                        case 954925063:
                            b = strPlaybackStateCompat.equals("message") ? (byte) 6 : (byte) -1;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            obj = obj2;
                            strComponentActivity5 = getsecondarg.ComponentActivity();
                            continue;
                            obj2 = obj;
                            c2 = 5;
                            break;
                        case 1:
                            obj = obj2;
                            ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                            if (concurrentHashMapRemoteActionCompatParcelizer != null) {
                                concurrentHashMap8 = concurrentHashMapRemoteActionCompatParcelizer;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            c2 = 5;
                            break;
                        case 2:
                            obj = obj2;
                            strComponentActivity3 = getsecondarg.ComponentActivity();
                            continue;
                            obj2 = obj;
                            c2 = 5;
                            break;
                        case 3:
                            obj = obj2;
                            strComponentActivity4 = getsecondarg.ComponentActivity();
                            continue;
                            obj2 = obj;
                            c2 = 5;
                            break;
                        case 4:
                            obj = obj2;
                            Date dateRemoteActionCompatParcelizer = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                            if (dateRemoteActionCompatParcelizer != null) {
                                date = dateRemoteActionCompatParcelizer;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            c2 = 5;
                            break;
                        case 5:
                            try {
                                r8lambdal32xcezw71g2xzeh1nm3nimxcoValueOf = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.valueOf(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().toUpperCase(java.util.Locale.ROOT));
                            } catch (Exception e) {
                                obj = obj2;
                                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                            }
                            break;
                        case 6:
                            strComponentActivity = getsecondarg.ComponentActivity();
                            break;
                        default:
                            obj = obj2;
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap9, strPlaybackStateCompat);
                            continue;
                            obj2 = obj;
                            c2 = 5;
                            break;
                    }
                    obj = obj2;
                    obj2 = obj;
                    c2 = 5;
                }
                getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1(date);
                getintentarraywithconfiguredbackstacklambda1.serializer = strComponentActivity;
                getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = strComponentActivity3;
                getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer = concurrentHashMap8;
                getintentarraywithconfiguredbackstacklambda1.write = strComponentActivity4;
                getintentarraywithconfiguredbackstacklambda1.MediaDescriptionCompat = strComponentActivity5;
                getintentarraywithconfiguredbackstacklambda1.read = r8lambdal32xcezw71g2xzeh1nm3nimxcoValueOf;
                getintentarraywithconfiguredbackstacklambda1.RatingCompat = concurrentHashMap9;
                getsecondarg.serializer();
                return getintentarraywithconfiguredbackstacklambda1;
            case 2:
                getsecondarg.write();
                io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                StepDataargs_delegatelambda0inlinediterator2 stepDataargs_delegatelambda0inlinediterator2 = new StepDataargs_delegatelambda0inlinediterator2(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2, new File("dummy"), new HashMap(), Double.valueOf(0.0d), FWFHelper.fwfDeviceOS, SentryOptions.empty());
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    switch (strPlaybackStateCompat2) {
                        case "debug_meta":
                            io.sentry.protocol.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (io.sentry.protocol.RemoteActionCompatParcelizer) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(7));
                            if (remoteActionCompatParcelizer == null) {
                                break;
                            } else {
                                stepDataargs_delegatelambda0inlinediterator2.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapRemoteActionCompatParcelizer = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(2));
                            if (mapRemoteActionCompatParcelizer != null) {
                                stepDataargs_delegatelambda0inlinediterator2.serializer.putAll(mapRemoteActionCompatParcelizer);
                            }
                            break;
                        case "profile":
                            io.sentry.protocol.profiling.write writeVar = (io.sentry.protocol.profiling.write) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(3));
                            if (writeVar != null) {
                                stepDataargs_delegatelambda0inlinediterator2.MediaMetadataCompat = writeVar;
                            }
                            break;
                        case "environment":
                            String strComponentActivity6 = getsecondarg.ComponentActivity();
                            if (strComponentActivity6 != null) {
                                stepDataargs_delegatelambda0inlinediterator2.read = strComponentActivity6;
                            }
                            break;
                        case "timestamp":
                            Double dMediaSessionCompatQueueItem = getsecondarg.MediaSessionCompatQueueItem();
                            if (dMediaSessionCompatQueueItem != null) {
                                stepDataargs_delegatelambda0inlinediterator2.ParcelableVolumeInfo = dMediaSessionCompatQueueItem.doubleValue();
                            }
                            break;
                        case "profiler_id":
                            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3 = (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(0));
                            if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3 != null) {
                                stepDataargs_delegatelambda0inlinediterator2.MediaBrowserCompatMediaItem = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3;
                            }
                            break;
                        case "version":
                            String strComponentActivity7 = getsecondarg.ComponentActivity();
                            if (strComponentActivity7 != null) {
                                stepDataargs_delegatelambda0inlinediterator2.PlaybackStateCompat = strComponentActivity7;
                            }
                            break;
                        case "release":
                            String strComponentActivity8 = getsecondarg.ComponentActivity();
                            if (strComponentActivity8 != null) {
                                stepDataargs_delegatelambda0inlinediterator2.MediaDescriptionCompat = strComponentActivity8;
                            }
                            break;
                        case "client_sdk":
                            io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = (io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(19));
                            if (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 != null) {
                                stepDataargs_delegatelambda0inlinediterator2.write = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
                            }
                            break;
                        case "platform":
                            String strComponentActivity9 = getsecondarg.ComponentActivity();
                            if (strComponentActivity9 != null) {
                                stepDataargs_delegatelambda0inlinediterator2.MediaSessionCompatQueueItem = strComponentActivity9;
                            }
                            break;
                        case "sampled_profile":
                            String strComponentActivity10 = getsecondarg.ComponentActivity();
                            if (strComponentActivity10 != null) {
                                stepDataargs_delegatelambda0inlinediterator2.RatingCompat = strComponentActivity10;
                            }
                            break;
                        case "chunk_id":
                            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4 = (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(0));
                            if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4 != null) {
                                stepDataargs_delegatelambda0inlinediterator2.IconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4;
                            }
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap7, strPlaybackStateCompat2);
                            break;
                    }
                }
                stepDataargs_delegatelambda0inlinediterator2.PlaybackStateCompatCustomAction = concurrentHashMap7;
                getsecondarg.serializer();
                return stepDataargs_delegatelambda0inlinediterator2;
            case 3:
                getsecondarg.write();
                StepDataCompanion stepDataCompanion = new StepDataCompanion(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer);
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat3 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat3.getClass();
                    if (!strPlaybackStateCompat3.equals("profiler_id")) {
                        if (concurrentHashMap6 == null) {
                            concurrentHashMap6 = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap6, strPlaybackStateCompat3);
                    } else {
                        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg5 = (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(0));
                        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg5 != null) {
                            stepDataCompanion.write = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg5;
                        }
                    }
                }
                stepDataCompanion.RemoteActionCompatParcelizer = concurrentHashMap6;
                getsecondarg.serializer();
                return stepDataCompanion;
            case 4:
                getsecondarg.write();
                File file = new File("dummy");
                Date dateSerializer2 = setNativeShader.serializer();
                ArrayList arrayList2 = new ArrayList();
                io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg6 = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                ContentCardsActivity contentCardsActivity = new ContentCardsActivity(file, dateSerializer2, arrayList2, "", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg6.toString(), new r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg6, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k.serializer, "op", null).PlaybackStateCompat.toString(), "0", 0, "", new HostnameCache$$ExternalSyntheticLambda0(4), null, null, null, null, null, null, null, null, com.adjust.sdk.Constants.NORMAL, new HashMap());
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat4 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat4.getClass();
                    switch (strPlaybackStateCompat4) {
                        case "device_manufacturer":
                            String strComponentActivity11 = getsecondarg.ComponentActivity();
                            if (strComponentActivity11 == null) {
                                break;
                            } else {
                                contentCardsActivity.MediaMetadataCompat = strComponentActivity11;
                                break;
                            }
                            break;
                        case "android_api_level":
                            Integer numPlaybackStateCompatCustomAction = getsecondarg.PlaybackStateCompatCustomAction();
                            if (numPlaybackStateCompatCustomAction == null) {
                                break;
                            } else {
                                contentCardsActivity.IconCompatParcelizer = numPlaybackStateCompatCustomAction.intValue();
                                break;
                            }
                            break;
                        case "build_id":
                            String strComponentActivity12 = getsecondarg.ComponentActivity();
                            if (strComponentActivity12 == null) {
                                break;
                            } else {
                                contentCardsActivity.serializer = strComponentActivity12;
                                break;
                            }
                            break;
                        case "device_locale":
                            String strComponentActivity13 = getsecondarg.ComponentActivity();
                            if (strComponentActivity13 == null) {
                                break;
                            } else {
                                contentCardsActivity.MediaDescriptionCompat = strComponentActivity13;
                                break;
                            }
                            break;
                        case "profile_id":
                            String strComponentActivity14 = getsecondarg.ComponentActivity();
                            if (strComponentActivity14 == null) {
                                break;
                            } else {
                                contentCardsActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = strComponentActivity14;
                                break;
                            }
                            break;
                        case "device_os_build_number":
                            String strComponentActivity15 = getsecondarg.ComponentActivity();
                            if (strComponentActivity15 == null) {
                                break;
                            } else {
                                contentCardsActivity.MediaSessionCompatQueueItem = strComponentActivity15;
                                break;
                            }
                            break;
                        case "device_model":
                            String strComponentActivity16 = getsecondarg.ComponentActivity();
                            if (strComponentActivity16 == null) {
                                break;
                            } else {
                                contentCardsActivity.RatingCompat = strComponentActivity16;
                                break;
                            }
                            break;
                        case "device_is_emulator":
                            Boolean boolRatingCompat = getsecondarg.RatingCompat();
                            if (boolRatingCompat == null) {
                                break;
                            } else {
                                contentCardsActivity.MediaBrowserCompatMediaItem = boolRatingCompat.booleanValue();
                                break;
                            }
                            break;
                        case "duration_ns":
                            String strComponentActivity17 = getsecondarg.ComponentActivity();
                            if (strComponentActivity17 == null) {
                                break;
                            } else {
                                contentCardsActivity.ParcelableVolumeInfo = strComponentActivity17;
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapRemoteActionCompatParcelizer2 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(2));
                            if (mapRemoteActionCompatParcelizer2 == null) {
                                break;
                            } else {
                                contentCardsActivity.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.putAll(mapRemoteActionCompatParcelizer2);
                                break;
                            }
                            break;
                        case "device_physical_memory_bytes":
                            String strComponentActivity18 = getsecondarg.ComponentActivity();
                            if (strComponentActivity18 == null) {
                                break;
                            } else {
                                contentCardsActivity.MediaSessionCompatToken = strComponentActivity18;
                                break;
                            }
                            break;
                        case "device_cpu_frequencies":
                            List list = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            if (list == null) {
                                break;
                            } else {
                                contentCardsActivity.write = list;
                                break;
                            }
                            break;
                        case "version_code":
                            String strComponentActivity19 = getsecondarg.ComponentActivity();
                            if (strComponentActivity19 == null) {
                                break;
                            } else {
                                contentCardsActivity.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = strComponentActivity19;
                                break;
                            }
                            break;
                        case "version_name":
                            String strComponentActivity20 = getsecondarg.ComponentActivity();
                            if (strComponentActivity20 == null) {
                                break;
                            } else {
                                contentCardsActivity.ResultReceiver = strComponentActivity20;
                                break;
                            }
                            break;
                        case "environment":
                            String strComponentActivity21 = getsecondarg.ComponentActivity();
                            if (strComponentActivity21 == null) {
                                break;
                            } else {
                                contentCardsActivity.MediaSessionCompatResultReceiverWrapper = strComponentActivity21;
                                break;
                            }
                            break;
                        case "timestamp":
                            Date dateRemoteActionCompatParcelizer2 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                            if (dateRemoteActionCompatParcelizer2 == null) {
                                break;
                            } else {
                                contentCardsActivity.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = dateRemoteActionCompatParcelizer2;
                                break;
                            }
                            break;
                        case "transaction_name":
                            String strComponentActivity22 = getsecondarg.ComponentActivity();
                            if (strComponentActivity22 == null) {
                                break;
                            } else {
                                contentCardsActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = strComponentActivity22;
                                break;
                            }
                            break;
                        case "device_os_name":
                            String strComponentActivity23 = getsecondarg.ComponentActivity();
                            if (strComponentActivity23 == null) {
                                break;
                            } else {
                                contentCardsActivity.PlaybackStateCompat = strComponentActivity23;
                                break;
                            }
                            break;
                        case "architecture":
                            String strComponentActivity24 = getsecondarg.ComponentActivity();
                            if (strComponentActivity24 == null) {
                                break;
                            } else {
                                contentCardsActivity.RemoteActionCompatParcelizer = strComponentActivity24;
                                break;
                            }
                            break;
                        case "transaction_id":
                            String strComponentActivity25 = getsecondarg.ComponentActivity();
                            if (strComponentActivity25 == null) {
                                break;
                            } else {
                                contentCardsActivity.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = strComponentActivity25;
                                break;
                            }
                            break;
                        case "device_os_version":
                            String strComponentActivity26 = getsecondarg.ComponentActivity();
                            if (strComponentActivity26 == null) {
                                break;
                            } else {
                                contentCardsActivity.PlaybackStateCompatCustomAction = strComponentActivity26;
                                break;
                            }
                            break;
                        case "truncation_reason":
                            String strComponentActivity27 = getsecondarg.ComponentActivity();
                            if (strComponentActivity27 == null) {
                                break;
                            } else {
                                contentCardsActivity.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = strComponentActivity27;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strComponentActivity28 = getsecondarg.ComponentActivity();
                            if (strComponentActivity28 == null) {
                                break;
                            } else {
                                contentCardsActivity.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = strComponentActivity28;
                                break;
                            }
                            break;
                        case "platform":
                            String strComponentActivity29 = getsecondarg.ComponentActivity();
                            if (strComponentActivity29 == null) {
                                break;
                            } else {
                                contentCardsActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = strComponentActivity29;
                                break;
                            }
                            break;
                        case "sampled_profile":
                            String strComponentActivity30 = getsecondarg.ComponentActivity();
                            if (strComponentActivity30 == null) {
                                break;
                            } else {
                                contentCardsActivity.ComponentActivity = strComponentActivity30;
                                break;
                            }
                            break;
                        case "transactions":
                            ArrayList arrayListWrite3 = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(5));
                            if (arrayListWrite3 == null) {
                                break;
                            } else {
                                contentCardsActivity.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.addAll(arrayListWrite3);
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap5, strPlaybackStateCompat4);
                            break;
                    }
                }
                contentCardsActivity.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = concurrentHashMap5;
                getsecondarg.serializer();
                return contentCardsActivity;
            case 5:
                getsecondarg.write();
                BannerDismissSnapshotCompanion bannerDismissSnapshotCompanion = new BannerDismissSnapshotCompanion(secondArg_delegatelambda0.IconCompatParcelizer, 0L, 0L);
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat5 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat5.getClass();
                    switch (strPlaybackStateCompat5) {
                        case "relative_start_ns":
                            Long lParcelableVolumeInfo = getsecondarg.ParcelableVolumeInfo();
                            if (lParcelableVolumeInfo == null) {
                                break;
                            } else {
                                bannerDismissSnapshotCompanion.RatingCompat = lParcelableVolumeInfo;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long lParcelableVolumeInfo2 = getsecondarg.ParcelableVolumeInfo();
                            if (lParcelableVolumeInfo2 == null) {
                                break;
                            } else {
                                bannerDismissSnapshotCompanion.RemoteActionCompatParcelizer = lParcelableVolumeInfo2;
                                break;
                            }
                            break;
                        case "id":
                            String strComponentActivity31 = getsecondarg.ComponentActivity();
                            if (strComponentActivity31 == null) {
                                break;
                            } else {
                                bannerDismissSnapshotCompanion.serializer = strComponentActivity31;
                                break;
                            }
                            break;
                        case "name":
                            String strComponentActivity32 = getsecondarg.ComponentActivity();
                            if (strComponentActivity32 == null) {
                                break;
                            } else {
                                bannerDismissSnapshotCompanion.write = strComponentActivity32;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strComponentActivity33 = getsecondarg.ComponentActivity();
                            if (strComponentActivity33 == null) {
                                break;
                            } else {
                                bannerDismissSnapshotCompanion.MediaSessionCompatQueueItem = strComponentActivity33;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long lParcelableVolumeInfo3 = getsecondarg.ParcelableVolumeInfo();
                            if (lParcelableVolumeInfo3 == null) {
                                break;
                            } else {
                                bannerDismissSnapshotCompanion.IconCompatParcelizer = lParcelableVolumeInfo3;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long lParcelableVolumeInfo4 = getsecondarg.ParcelableVolumeInfo();
                            if (lParcelableVolumeInfo4 == null) {
                                break;
                            } else {
                                bannerDismissSnapshotCompanion.read = lParcelableVolumeInfo4;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap4, strPlaybackStateCompat5);
                            break;
                    }
                }
                bannerDismissSnapshotCompanion.MediaMetadataCompat = concurrentHashMap4;
                getsecondarg.serializer();
                return bannerDismissSnapshotCompanion;
            case 6:
                BannerDismissSnapshot bannerDismissSnapshot = new BannerDismissSnapshot();
                getsecondarg.write();
                HashMap map2 = null;
                Integer numPlaybackStateCompatCustomAction2 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat6 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat6.getClass();
                    if (!strPlaybackStateCompat6.equals("segment_id")) {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map2, strPlaybackStateCompat6);
                    } else {
                        numPlaybackStateCompatCustomAction2 = getsecondarg.PlaybackStateCompatCustomAction();
                    }
                }
                getsecondarg.serializer();
                getsecondarg.serializer(true);
                List list2 = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                getsecondarg.serializer(false);
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (Object obj3 : list2) {
                        if (obj3 instanceof Map) {
                            Map map3 = (Map) obj3;
                            io.sentry.util.MediaDescriptionCompat mediaDescriptionCompat = new io.sentry.util.MediaDescriptionCompat(map3);
                            for (Map.Entry entry : map3.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str.equals("type")) {
                                    io.sentry.rrweb.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = io.sentry.rrweb.RemoteActionCompatParcelizer.values()[((Integer) value).intValue()];
                                    int i2 = r8lambdaExlx1VvLXt_Mt6gp51UrEu9NqXI.read[remoteActionCompatParcelizer2.ordinal()];
                                    if (i2 == 1) {
                                        Map map4 = (Map) map3.get(RemoteMessageConst.DATA);
                                        if (map4 == null) {
                                            map4 = Collections.EMPTY_MAP;
                                        }
                                        Integer num = (Integer) map4.get("source");
                                        if (num != null) {
                                            io.sentry.rrweb.MediaMetadataCompat mediaMetadataCompat = io.sentry.rrweb.MediaMetadataCompat.values()[num.intValue()];
                                            int i3 = r8lambdaExlx1VvLXt_Mt6gp51UrEu9NqXI.RemoteActionCompatParcelizer[mediaMetadataCompat.ordinal()];
                                            if (i3 == 1) {
                                                arrayList.add(io.sentry.rrweb.RatingCompat.serializer(mediaDescriptionCompat, brazeActionParserExternalSyntheticLambda0));
                                            } else if (i3 != 2) {
                                                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Unsupported rrweb incremental snapshot type %s", mediaMetadataCompat);
                                            } else {
                                                arrayList.add(io.sentry.rrweb.RatingCompat.RemoteActionCompatParcelizer(mediaDescriptionCompat, brazeActionParserExternalSyntheticLambda0));
                                            }
                                        }
                                    } else if (i2 == 2) {
                                        arrayList.add(io.sentry.rrweb.RatingCompat.IconCompatParcelizer(mediaDescriptionCompat, brazeActionParserExternalSyntheticLambda0));
                                    } else if (i2 != 3) {
                                        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Unsupported rrweb event type %s", remoteActionCompatParcelizer2);
                                    } else {
                                        Map map5 = (Map) map3.get(RemoteMessageConst.DATA);
                                        if (map5 == null) {
                                            map5 = Collections.EMPTY_MAP;
                                        }
                                        String str2 = (String) map5.get(RemoteMessageConst.Notification.TAG);
                                        if (str2 != null) {
                                            int iHashCode = str2.hashCode();
                                            if (iHashCode != -226040934) {
                                                if (iHashCode != 112202875) {
                                                    if (iHashCode == 1106718723 && str2.equals("breadcrumb")) {
                                                        b2 = 2;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                } else if (str2.equals("video")) {
                                                    b2 = 1;
                                                } else {
                                                    b2 = -1;
                                                }
                                            } else if (str2.equals("performanceSpan")) {
                                                b2 = 0;
                                            } else {
                                                b2 = -1;
                                            }
                                            if (b2 == 0) {
                                                arrayList.add(io.sentry.rrweb.RatingCompat.MediaSessionCompatQueueItem(mediaDescriptionCompat, brazeActionParserExternalSyntheticLambda0));
                                            } else if (b2 == 1) {
                                                arrayList.add(io.sentry.rrweb.RatingCompat.MediaDescriptionCompat(mediaDescriptionCompat, brazeActionParserExternalSyntheticLambda0));
                                            } else if (b2 != 2) {
                                                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Unsupported rrweb event type %s", remoteActionCompatParcelizer2);
                                            } else {
                                                arrayList.add(io.sentry.rrweb.RatingCompat.read(mediaDescriptionCompat, brazeActionParserExternalSyntheticLambda0));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bannerDismissSnapshot.IconCompatParcelizer = numPlaybackStateCompatCustomAction2;
                bannerDismissSnapshot.write = arrayList;
                bannerDismissSnapshot.read = map2;
                return bannerDismissSnapshot;
            case 7:
                getsecondarg.write();
                initBannerlambda1 initbannerlambda1 = new initBannerlambda1();
                initbannerlambda1.MediaSessionCompatToken = false;
                initbannerlambda1.ParcelableVolumeInfo = null;
                initbannerlambda1.MediaMetadataCompat = false;
                initbannerlambda1.MediaBrowserCompatMediaItem = null;
                initbannerlambda1.IconCompatParcelizer = false;
                initbannerlambda1.MediaDescriptionCompat = null;
                initbannerlambda1.serializer = false;
                initbannerlambda1.write = false;
                initbannerlambda1.RatingCompat = StepDataargs_delegatelambda0inlinediterator1.MANUAL;
                initbannerlambda1.MediaSessionCompatQueueItem = 0;
                initbannerlambda1.RemoteActionCompatParcelizer = true;
                initbannerlambda1.read = false;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat7 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat7.getClass();
                    switch (strPlaybackStateCompat7) {
                        case "is_enable_app_start_profiling":
                            Boolean boolRatingCompat2 = getsecondarg.RatingCompat();
                            if (boolRatingCompat2 == null) {
                                break;
                            } else {
                                initbannerlambda1.RemoteActionCompatParcelizer = boolRatingCompat2.booleanValue();
                                break;
                            }
                            break;
                        case "trace_sampled":
                            Boolean boolRatingCompat3 = getsecondarg.RatingCompat();
                            if (boolRatingCompat3 == null) {
                                break;
                            } else {
                                initbannerlambda1.MediaSessionCompatToken = boolRatingCompat3.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_dir_path":
                            String strComponentActivity34 = getsecondarg.ComponentActivity();
                            if (strComponentActivity34 == null) {
                                break;
                            } else {
                                initbannerlambda1.MediaDescriptionCompat = strComponentActivity34;
                                break;
                            }
                            break;
                        case "is_continuous_profiling_enabled":
                            Boolean boolRatingCompat4 = getsecondarg.RatingCompat();
                            if (boolRatingCompat4 == null) {
                                break;
                            } else {
                                initbannerlambda1.write = boolRatingCompat4.booleanValue();
                                break;
                            }
                            break;
                        case "is_profiling_enabled":
                            Boolean boolRatingCompat5 = getsecondarg.RatingCompat();
                            if (boolRatingCompat5 == null) {
                                break;
                            } else {
                                initbannerlambda1.serializer = boolRatingCompat5.booleanValue();
                                break;
                            }
                            break;
                        case "is_start_profiler_on_app_start":
                            Boolean boolRatingCompat6 = getsecondarg.RatingCompat();
                            if (boolRatingCompat6 == null) {
                                break;
                            } else {
                                initbannerlambda1.read = boolRatingCompat6.booleanValue();
                                break;
                            }
                            break;
                        case "profile_sampled":
                            Boolean boolRatingCompat7 = getsecondarg.RatingCompat();
                            if (boolRatingCompat7 == null) {
                                break;
                            } else {
                                initbannerlambda1.MediaMetadataCompat = boolRatingCompat7.booleanValue();
                                break;
                            }
                            break;
                        case "profile_lifecycle":
                            String strComponentActivity35 = getsecondarg.ComponentActivity();
                            if (strComponentActivity35 == null) {
                                break;
                            } else {
                                try {
                                    initbannerlambda1.RatingCompat = StepDataargs_delegatelambda0inlinediterator1.valueOf(strComponentActivity35);
                                } catch (IllegalArgumentException unused) {
                                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strComponentActivity35), new Object[0]);
                                }
                                break;
                            }
                            break;
                        case "continuous_profile_sampled":
                            Boolean boolRatingCompat8 = getsecondarg.RatingCompat();
                            if (boolRatingCompat8 == null) {
                                break;
                            } else {
                                initbannerlambda1.IconCompatParcelizer = boolRatingCompat8.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_hz":
                            Integer numPlaybackStateCompatCustomAction3 = getsecondarg.PlaybackStateCompatCustomAction();
                            if (numPlaybackStateCompatCustomAction3 == null) {
                                break;
                            } else {
                                initbannerlambda1.MediaSessionCompatQueueItem = numPlaybackStateCompatCustomAction3.intValue();
                                break;
                            }
                            break;
                        case "trace_sample_rate":
                            Double dMediaSessionCompatQueueItem2 = getsecondarg.MediaSessionCompatQueueItem();
                            if (dMediaSessionCompatQueueItem2 == null) {
                                break;
                            } else {
                                initbannerlambda1.ParcelableVolumeInfo = dMediaSessionCompatQueueItem2;
                                break;
                            }
                            break;
                        case "profile_sample_rate":
                            Double dMediaSessionCompatQueueItem3 = getsecondarg.MediaSessionCompatQueueItem();
                            if (dMediaSessionCompatQueueItem3 == null) {
                                break;
                            } else {
                                initbannerlambda1.MediaBrowserCompatMediaItem = dMediaSessionCompatQueueItem3;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap3, strPlaybackStateCompat7);
                            break;
                    }
                }
                initbannerlambda1.MediaSessionCompatResultReceiverWrapper = concurrentHashMap3;
                getsecondarg.serializer();
                return initbannerlambda1;
            case 8:
                getsecondarg.write();
                io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a5 = null;
                r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu = null;
                Date dateRemoteActionCompatParcelizer3 = null;
                HashMap map6 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat8 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat8.getClass();
                    switch (strPlaybackStateCompat8) {
                        case "sdk":
                            b3 = 0;
                            break;
                        case "trace":
                            b3 = 1;
                            break;
                        case "event_id":
                            b3 = 2;
                            break;
                        case "sent_at":
                            b3 = 3;
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    if (b3 == 0) {
                        r8lambdaxj9c8vip9dfevatmzt0ejauc4a5 = (io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(19));
                    } else if (b3 == 1) {
                        r8lambdazwumnezi8cq9pp6w1bgke7nfwtu = (r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new handleCardClicklambda0(0));
                    } else if (b3 == 2) {
                        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(0));
                    } else if (b3 != 3) {
                        if (map6 == null) {
                            map6 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map6, strPlaybackStateCompat8);
                    } else {
                        dateRemoteActionCompatParcelizer3 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                    }
                }
                setOnDismissCallback setondismisscallback = new setOnDismissCallback(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaxj9c8vip9dfevatmzt0ejauc4a5, r8lambdazwumnezi8cq9pp6w1bgke7nfwtu);
                setondismisscallback.serializer = dateRemoteActionCompatParcelizer3;
                setondismisscallback.RemoteActionCompatParcelizer = map6;
                getsecondarg.serializer();
                return setondismisscallback;
            case 9:
                getsecondarg.write();
                r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g = null;
                String strComponentActivity36 = null;
                String strComponentActivity37 = null;
                String strComponentActivity38 = null;
                String strComponentActivity39 = null;
                Integer numPlaybackStateCompatCustomAction4 = null;
                int iMediaSessionCompatResultReceiverWrapper = 0;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat9 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat9.getClass();
                    switch (strPlaybackStateCompat9) {
                        case "item_count":
                            numPlaybackStateCompatCustomAction4 = getsecondarg.PlaybackStateCompatCustomAction();
                            break;
                        case "length":
                            iMediaSessionCompatResultReceiverWrapper = getsecondarg.MediaSessionCompatResultReceiverWrapper();
                            break;
                        case "filename":
                            strComponentActivity37 = getsecondarg.ComponentActivity();
                            break;
                        case "attachment_type":
                            strComponentActivity38 = getsecondarg.ComponentActivity();
                            break;
                        case "type":
                            r8lambdab2eforxin347_5b93fxdqv0g = (r8lambdaB2EfoRxiN347_5B93fxdQV0g) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(11));
                            break;
                        case "content_type":
                            strComponentActivity36 = getsecondarg.ComponentActivity();
                            break;
                        case "platform":
                            strComponentActivity39 = getsecondarg.ComponentActivity();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat9);
                            break;
                    }
                }
                if (r8lambdab2eforxin347_5b93fxdqv0g != null) {
                    BannerViewExternalSyntheticLambda0 bannerViewExternalSyntheticLambda0 = new BannerViewExternalSyntheticLambda0(r8lambdab2eforxin347_5b93fxdqv0g, iMediaSessionCompatResultReceiverWrapper, strComponentActivity36, strComponentActivity37, strComponentActivity38, strComponentActivity39, numPlaybackStateCompatCustomAction4);
                    bannerViewExternalSyntheticLambda0.MediaSessionCompatQueueItem = map;
                    getsecondarg.serializer();
                    return bannerViewExternalSyntheticLambda0;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"type\"", illegalStateException);
                throw illegalStateException;
            case 10:
                getsecondarg.write();
                BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2 = new BannerViewExternalSyntheticLambda2();
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat10 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat10.getClass();
                    switch (strPlaybackStateCompat10) {
                        case "fingerprint":
                            List list3 = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            if (list3 == null) {
                                break;
                            } else {
                                bannerViewExternalSyntheticLambda2.ResultReceiver = list3;
                                break;
                            }
                            break;
                        case "threads":
                            getsecondarg.write();
                            getsecondarg.PlaybackStateCompat();
                            bannerViewExternalSyntheticLambda2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(27)));
                            getsecondarg.serializer();
                            break;
                        case "logger":
                            bannerViewExternalSyntheticLambda2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getsecondarg.ComponentActivity();
                            break;
                        case "timestamp":
                            Date dateRemoteActionCompatParcelizer4 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                            if (dateRemoteActionCompatParcelizer4 == null) {
                                break;
                            } else {
                                bannerViewExternalSyntheticLambda2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = dateRemoteActionCompatParcelizer4;
                                break;
                            }
                            break;
                        case "level":
                            bannerViewExternalSyntheticLambda2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (r8lambdaL32xCEzW71g2Xzeh1NM3NImxco) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(12));
                            break;
                        case "message":
                            bannerViewExternalSyntheticLambda2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (io.sentry.protocol.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(15));
                            break;
                        case "modules":
                            bannerViewExternalSyntheticLambda2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                            break;
                        case "exception":
                            getsecondarg.write();
                            getsecondarg.PlaybackStateCompat();
                            bannerViewExternalSyntheticLambda2.ComponentActivity = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(20)));
                            getsecondarg.serializer();
                            break;
                        case "transaction":
                            bannerViewExternalSyntheticLambda2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getsecondarg.ComponentActivity();
                            break;
                        default:
                            if (!FocusOrderModifierKt.read(bannerViewExternalSyntheticLambda2, strPlaybackStateCompat10, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap2, strPlaybackStateCompat10);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                bannerViewExternalSyntheticLambda2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = concurrentHashMap2;
                getsecondarg.serializer();
                return bannerViewExternalSyntheticLambda2;
            case 11:
                return r8lambdaB2EfoRxiN347_5B93fxdQV0g.valueOfLabel(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().toLowerCase(java.util.Locale.ROOT));
            case 12:
                return r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.valueOf(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().toUpperCase(java.util.Locale.ROOT));
            case 13:
                r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                getsecondarg.write();
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat11 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat11.getClass();
                    switch (strPlaybackStateCompat11) {
                        case "package_name":
                            b4 = 0;
                            break;
                        case "thread_id":
                            b4 = 1;
                            break;
                        case "address":
                            b4 = 2;
                            break;
                        case "class_name":
                            b4 = 3;
                            break;
                        case "type":
                            b4 = 4;
                            break;
                        default:
                            b4 = -1;
                            break;
                    }
                    if (b4 == 0) {
                        r8lambdab5vcmy54sheijpjycpn0kuqsmca.serializer = getsecondarg.ComponentActivity();
                    } else if (b4 == 1) {
                        r8lambdab5vcmy54sheijpjycpn0kuqsmca.IconCompatParcelizer = getsecondarg.ParcelableVolumeInfo();
                    } else if (b4 == 2) {
                        r8lambdab5vcmy54sheijpjycpn0kuqsmca.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                    } else if (b4 == 3) {
                        r8lambdab5vcmy54sheijpjycpn0kuqsmca.read = getsecondarg.ComponentActivity();
                    } else if (b4 != 4) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat11);
                    } else {
                        r8lambdab5vcmy54sheijpjycpn0kuqsmca.write = getsecondarg.MediaSessionCompatResultReceiverWrapper();
                    }
                }
                r8lambdab5vcmy54sheijpjycpn0kuqsmca.MediaBrowserCompatMediaItem = concurrentHashMap;
                getsecondarg.serializer();
                return r8lambdab5vcmy54sheijpjycpn0kuqsmca;
            case 14:
                getsecondarg.write();
                HashMap map7 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat12 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat12.getClass();
                    if (!strPlaybackStateCompat12.equals("items")) {
                        if (map7 == null) {
                            map7 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map7, strPlaybackStateCompat12);
                    } else {
                        arrayListWrite2 = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new handleCardClicklambda0(1));
                    }
                }
                getsecondarg.serializer();
                if (arrayListWrite2 != null) {
                    r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I r8lambdapr0zohngrdffbcgpp9owzbum0i = new r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I(arrayListWrite2);
                    r8lambdapr0zohngrdffbcgpp9owzbum0i.serializer = map7;
                    return r8lambdapr0zohngrdffbcgpp9owzbum0i;
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"items\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"items\"", illegalStateException2);
                throw illegalStateException2;
            case 15:
                getsecondarg.write();
                HashMap map8 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat13 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat13.getClass();
                    if (!strPlaybackStateCompat13.equals("items")) {
                        if (map8 == null) {
                            map8 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map8, strPlaybackStateCompat13);
                    } else {
                        arrayListWrite = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new handleCardClicklambda0(4));
                    }
                }
                getsecondarg.serializer();
                if (arrayListWrite != null) {
                    r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8 r8lambdaezx9vf3n2mjvwrdqvqgqjgg8 = new r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8(arrayListWrite);
                    r8lambdaezx9vf3n2mjvwrdqvqgqjgg8.IconCompatParcelizer = map8;
                    return r8lambdaezx9vf3n2mjvwrdqvqgqjgg8;
                }
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"items\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"items\"", illegalStateException3);
                throw illegalStateException3;
            case 16:
                onCustomEventAction oncustomeventaction = new onCustomEventAction();
                getsecondarg.write();
                onOtherUrlActionlambda1 onotherurlactionlambda1 = null;
                Integer numPlaybackStateCompatCustomAction5 = null;
                Date dateRemoteActionCompatParcelizer5 = null;
                List list4 = null;
                List list5 = null;
                List list6 = null;
                Date dateRemoteActionCompatParcelizer6 = null;
                HashMap map9 = null;
                io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg7 = null;
                while (true) {
                    List list7 = list4;
                    if (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                        String strPlaybackStateCompat14 = getsecondarg.PlaybackStateCompat();
                        strPlaybackStateCompat14.getClass();
                        switch (strPlaybackStateCompat14) {
                            case "replay_id":
                                r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg7 = (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(0));
                                break;
                            case "replay_start_timestamp":
                                dateRemoteActionCompatParcelizer6 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                                break;
                            case "type":
                                strComponentActivity2 = getsecondarg.ComponentActivity();
                                break;
                            case "urls":
                                list6 = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                                break;
                            case "timestamp":
                                dateRemoteActionCompatParcelizer5 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                                break;
                            case "error_ids":
                                list5 = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                                break;
                            case "trace_ids":
                                list4 = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                                continue;
                                break;
                            case "replay_type":
                                onotherurlactionlambda1 = (onOtherUrlActionlambda1) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new handleCardClicklambda0(5));
                                break;
                            case "segment_id":
                                numPlaybackStateCompatCustomAction5 = getsecondarg.PlaybackStateCompatCustomAction();
                                break;
                            default:
                                if (!FocusOrderModifierKt.read(oncustomeventaction, strPlaybackStateCompat14, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                                    if (map9 == null) {
                                        map9 = new HashMap();
                                    }
                                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map9, strPlaybackStateCompat14);
                                    break;
                                }
                                break;
                        }
                        list4 = list7;
                    } else {
                        getsecondarg.serializer();
                        if (strComponentActivity2 != null) {
                            oncustomeventaction.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = strComponentActivity2;
                        }
                        if (onotherurlactionlambda1 != null) {
                            oncustomeventaction.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = onotherurlactionlambda1;
                        }
                        if (numPlaybackStateCompatCustomAction5 != null) {
                            oncustomeventaction.ResultReceiver = numPlaybackStateCompatCustomAction5.intValue();
                        }
                        if (dateRemoteActionCompatParcelizer5 != null) {
                            oncustomeventaction.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = dateRemoteActionCompatParcelizer5;
                        }
                        oncustomeventaction.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg7;
                        oncustomeventaction.ComponentActivity = dateRemoteActionCompatParcelizer6;
                        oncustomeventaction.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = list6;
                        oncustomeventaction.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = list5;
                        oncustomeventaction.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = list7;
                        oncustomeventaction.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = map9;
                        return oncustomeventaction;
                    }
                }
                break;
            case 17:
                getsecondarg.write();
                Date dateRemoteActionCompatParcelizer7 = null;
                Date dateRemoteActionCompatParcelizer8 = null;
                String strComponentActivity40 = null;
                String str3 = null;
                Boolean boolRatingCompat9 = null;
                Long lParcelableVolumeInfo5 = null;
                Double dMediaSessionCompatQueueItem4 = null;
                String strComponentActivity41 = null;
                Integer numPlaybackStateCompatCustomAction6 = null;
                ConcurrentHashMap concurrentHashMap10 = null;
                String strComponentActivity42 = null;
                String strComponentActivity43 = null;
                String strComponentActivity44 = null;
                String strComponentActivity45 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat15 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat15.getClass();
                    switch (strPlaybackStateCompat15.hashCode()) {
                        case -1992012396:
                            b5 = strPlaybackStateCompat15.equals(com.braze.models.inappmessage.InAppMessageBase.DURATION) ? (byte) 0 : (byte) -1;
                            break;
                        case -1897185151:
                            b5 = strPlaybackStateCompat15.equals("started") ? (byte) 1 : (byte) -1;
                            break;
                        case -1294635157:
                            b5 = strPlaybackStateCompat15.equals("errors") ? c : (byte) -1;
                            break;
                        case -892481550:
                            b5 = strPlaybackStateCompat15.equals("status") ? (byte) 3 : (byte) -1;
                            break;
                        case 99455:
                            b5 = strPlaybackStateCompat15.equals("did") ? (byte) 4 : (byte) -1;
                            break;
                        case 113759:
                            b5 = strPlaybackStateCompat15.equals("seq") ? (byte) 5 : (byte) -1;
                            break;
                        case 113870:
                            b5 = strPlaybackStateCompat15.equals("sid") ? (byte) 6 : (byte) -1;
                            break;
                        case 3237136:
                            b5 = strPlaybackStateCompat15.equals("init") ? (byte) 7 : (byte) -1;
                            break;
                        case 55126294:
                            b5 = strPlaybackStateCompat15.equals("timestamp") ? (byte) 8 : (byte) -1;
                            break;
                        case 93152418:
                            b5 = strPlaybackStateCompat15.equals("attrs") ? (byte) 9 : (byte) -1;
                            break;
                        case 213717026:
                            b5 = strPlaybackStateCompat15.equals("abnormal_mechanism") ? (byte) 10 : (byte) -1;
                            break;
                        default:
                            b5 = -1;
                            break;
                    }
                    switch (b5) {
                        case 0:
                            dMediaSessionCompatQueueItem4 = getsecondarg.MediaSessionCompatQueueItem();
                            break;
                        case 1:
                            dateRemoteActionCompatParcelizer8 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                            break;
                        case 2:
                            numPlaybackStateCompatCustomAction6 = getsecondarg.PlaybackStateCompatCustomAction();
                            break;
                        case 3:
                            String strSerializer = io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(getsecondarg.ComponentActivity());
                            if (strSerializer != null) {
                                brazeContentCardUtilsValueOf = BrazeContentCardUtils.valueOf(strSerializer);
                            }
                            break;
                        case 4:
                            strComponentActivity40 = getsecondarg.ComponentActivity();
                            break;
                        case 5:
                            lParcelableVolumeInfo5 = getsecondarg.ParcelableVolumeInfo();
                            break;
                        case 6:
                            String strComponentActivity46 = getsecondarg.ComponentActivity();
                            if (strComponentActivity46 == null || !(strComponentActivity46.length() == 36 || strComponentActivity46.length() == 32)) {
                                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "%s sid is not valid.", strComponentActivity46);
                            } else {
                                str3 = strComponentActivity46;
                            }
                            break;
                        case 7:
                            boolRatingCompat9 = getsecondarg.RatingCompat();
                            break;
                        case 8:
                            dateRemoteActionCompatParcelizer7 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                            break;
                        case 9:
                            getsecondarg.write();
                            while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                                String strPlaybackStateCompat16 = getsecondarg.PlaybackStateCompat();
                                strPlaybackStateCompat16.getClass();
                                switch (strPlaybackStateCompat16) {
                                    case "environment":
                                        b6 = 0;
                                        break;
                                    case "release":
                                        b6 = 1;
                                        break;
                                    case "ip_address":
                                        b6 = c;
                                        break;
                                    case "user_agent":
                                        b6 = 3;
                                        break;
                                    default:
                                        b6 = -1;
                                        break;
                                }
                                if (b6 == 0) {
                                    strComponentActivity43 = getsecondarg.ComponentActivity();
                                } else if (b6 == 1) {
                                    strComponentActivity44 = getsecondarg.ComponentActivity();
                                } else if (b6 == c) {
                                    strComponentActivity41 = getsecondarg.ComponentActivity();
                                } else if (b6 != 3) {
                                    getsecondarg.ResultReceiver();
                                } else {
                                    strComponentActivity42 = getsecondarg.ComponentActivity();
                                }
                            }
                            getsecondarg.serializer();
                            break;
                        case 10:
                            strComponentActivity45 = getsecondarg.ComponentActivity();
                            break;
                        default:
                            ConcurrentHashMap concurrentHashMap11 = concurrentHashMap10;
                            if (concurrentHashMap11 == null) {
                                concurrentHashMap11 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap11, strPlaybackStateCompat15);
                            concurrentHashMap10 = concurrentHashMap11;
                            break;
                    }
                    c = 2;
                }
                ConcurrentHashMap concurrentHashMap12 = concurrentHashMap10;
                if (brazeContentCardUtilsValueOf == null) {
                    throw serializer(brazeActionParserExternalSyntheticLambda0, "status");
                }
                if (dateRemoteActionCompatParcelizer8 == null) {
                    throw serializer(brazeActionParserExternalSyntheticLambda0, "started");
                }
                if (numPlaybackStateCompatCustomAction6 == null) {
                    throw serializer(brazeActionParserExternalSyntheticLambda0, "errors");
                }
                if (strComponentActivity44 != null) {
                    logHtmlClicklambda0 loghtmlclicklambda0 = new logHtmlClicklambda0(brazeContentCardUtilsValueOf, dateRemoteActionCompatParcelizer8, dateRemoteActionCompatParcelizer7, numPlaybackStateCompatCustomAction6.intValue(), strComponentActivity40, str3, boolRatingCompat9, lParcelableVolumeInfo5, dMediaSessionCompatQueueItem4, strComponentActivity41, strComponentActivity42, strComponentActivity43, strComponentActivity44, strComponentActivity45);
                    loghtmlclicklambda0.ParcelableVolumeInfo = concurrentHashMap12;
                    getsecondarg.serializer();
                    return loghtmlclicklambda0;
                }
                throw serializer(brazeActionParserExternalSyntheticLambda0, "release");
            case 18:
                return IconCompatParcelizer(getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 19:
                return defaultCardHandlinglambda0.valueOf(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().toUpperCase(java.util.Locale.ROOT));
            default:
                getsecondarg.write();
                String strComponentActivity47 = null;
                String strComponentActivity48 = null;
                String strComponentActivity49 = null;
                HashMap map10 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat17 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat17.getClass();
                    switch (strPlaybackStateCompat17) {
                        case "comments":
                            b7 = 0;
                            break;
                        case "name":
                            b7 = 1;
                            break;
                        case "email":
                            b7 = 2;
                            break;
                        case "event_id":
                            b7 = 3;
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 0) {
                        strComponentActivity49 = getsecondarg.ComponentActivity();
                    } else if (b7 == 1) {
                        strComponentActivity47 = getsecondarg.ComponentActivity();
                    } else if (b7 == 2) {
                        strComponentActivity48 = getsecondarg.ComponentActivity();
                    } else if (b7 != 3) {
                        if (map10 == null) {
                            map10 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map10, strPlaybackStateCompat17);
                    } else {
                        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer = io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer(getsecondarg);
                    }
                }
                getsecondarg.serializer();
                if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer != null) {
                    handleCardClicklambda2 handlecardclicklambda2 = new handleCardClicklambda2(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer, strComponentActivity47, strComponentActivity48, strComponentActivity49);
                    handlecardclicklambda2.write = map10;
                    return handlecardclicklambda2;
                }
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"event_id\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"event_id\"", illegalStateException4);
                throw illegalStateException4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    public static r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 IconCompatParcelizer(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        getsecondarg.write();
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer = null;
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = null;
        String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k2 = null;
        String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = null;
        defaultCardHandlinglambda0 defaultcardhandlinglambda0 = null;
        String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys3 = null;
        ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer = null;
        ConcurrentHashMap concurrentHashMap = null;
        Map map = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            int i = 0;
            switch (strPlaybackStateCompat) {
                case "span_id":
                    r8lambdayq9qbmke5in5qopvpj_kuggks_k = new r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                    break;
                case "parent_span_id":
                    r8lambdayq9qbmke5in5qopvpj_kuggks_k2 = (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i));
                    break;
                case "description":
                    strR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    break;
                case "origin":
                    strR8lambda54BeH8ZsBru0CXI2CCSP2syNys3 = getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    break;
                case "status":
                    defaultcardhandlinglambda0 = (defaultCardHandlinglambda0) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(19));
                    break;
                case "op":
                    strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    break;
                case "data":
                    map = (Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    break;
                case "tags":
                    concurrentHashMapRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                    break;
                case "trace_id":
                    r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer = io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer(getsecondarg);
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat);
                    break;
            }
        }
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (r8lambdayq9qbmke5in5qopvpj_kuggks_k != null) {
            if (strR8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = "";
            }
            r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = new r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer, r8lambdayq9qbmke5in5qopvpj_kuggks_k, strR8lambda54BeH8ZsBru0CXI2CCSP2syNys, r8lambdayq9qbmke5in5qopvpj_kuggks_k2);
            r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.IconCompatParcelizer = strR8lambda54BeH8ZsBru0CXI2CCSP2syNys2;
            r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatResultReceiverWrapper = defaultcardhandlinglambda0;
            r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.RatingCompat = strR8lambda54BeH8ZsBru0CXI2CCSP2syNys3;
            if (concurrentHashMapRemoteActionCompatParcelizer != null) {
                r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompatCustomAction = concurrentHashMapRemoteActionCompatParcelizer;
            }
            if (map != null) {
                r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.RemoteActionCompatParcelizer = map;
            }
            r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatToken = concurrentHashMap;
            getsecondarg.serializer();
            return r8lambdasv8cpfy2ryceslm1ayxpdavyzp0;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"span_id\"", illegalStateException2);
        throw illegalStateException2;
    }
}
