package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class handleCardClicklambda0 implements IBrazeActionStep {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ handleCardClicklambda0(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public static IllegalStateException IconCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str) {
        String strM = ff$$ExternalSyntheticOutline0.m("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM);
        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, strM, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:139:0x0248  */
    /* JADX WARN: Code duplicated, block: B:216:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    @Override // o.IBrazeActionStep
    public final Object write(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            getsecondarg.write();
            String strComponentActivity = null;
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = null;
            String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            String strComponentActivity2 = null;
            String strComponentActivity3 = null;
            String strComponentActivity4 = null;
            String strComponentActivity5 = null;
            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = null;
            String strComponentActivity6 = null;
            String strComponentActivity7 = null;
            while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
                strPlaybackStateCompat.getClass();
                switch (strPlaybackStateCompat) {
                    case "replay_id":
                        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                        break;
                    case "user_id":
                        strComponentActivity2 = getsecondarg.ComponentActivity();
                        break;
                    case "environment":
                        strComponentActivity = getsecondarg.ComponentActivity();
                        break;
                    case "sample_rand":
                        strComponentActivity6 = getsecondarg.ComponentActivity();
                        break;
                    case "sample_rate":
                        strComponentActivity4 = getsecondarg.ComponentActivity();
                        break;
                    case "release":
                        strComponentActivity7 = getsecondarg.ComponentActivity();
                        break;
                    case "trace_id":
                        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                        break;
                    case "sampled":
                        strComponentActivity5 = getsecondarg.ComponentActivity();
                        break;
                    case "public_key":
                        strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                        break;
                    case "transaction":
                        strComponentActivity3 = getsecondarg.ComponentActivity();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat);
                        break;
                }
            }
            if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg == null) {
                throw IconCompatParcelizer(brazeActionParserExternalSyntheticLambda0, "trace_id");
            }
            if (strR8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
                r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu = new r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, strR8lambda54BeH8ZsBru0CXI2CCSP2syNys, strComponentActivity7, strComponentActivity, strComponentActivity2, strComponentActivity3, strComponentActivity4, strComponentActivity5, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2, strComponentActivity6);
                r8lambdazwumnezi8cq9pp6w1bgke7nfwtu.RatingCompat = concurrentHashMap;
                getsecondarg.serializer();
                return r8lambdazwumnezi8cq9pp6w1bgke7nfwtu;
            }
            throw IconCompatParcelizer(brazeActionParserExternalSyntheticLambda0, "public_key");
        }
        String str = "Missing required field \"timestamp\"";
        if (i != 1) {
            if (i == 2) {
                getsecondarg.write();
                String strComponentActivity8 = null;
                Object objR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
                HashMap map = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    if (!strPlaybackStateCompat2.equals("type")) {
                        if (!strPlaybackStateCompat2.equals("value")) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat2);
                        } else {
                            objR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                        }
                    } else {
                        strComponentActivity8 = getsecondarg.ComponentActivity();
                    }
                }
                getsecondarg.serializer();
                if (strComponentActivity8 != null) {
                    r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE r8lambdaz6sxsca7yw0kiv7vx_twlisurke = new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(strComponentActivity8, objR8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    r8lambdaz6sxsca7yw0kiv7vx_twlisurke.IconCompatParcelizer = map;
                    return r8lambdaz6sxsca7yw0kiv7vx_twlisurke;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"type\"", illegalStateException);
                throw illegalStateException;
            }
            if (i == 3) {
                return logClicklambda0.valueOf(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().toUpperCase(java.util.Locale.ROOT));
            }
            if (i != 4) {
                return onOtherUrlActionlambda1.valueOf(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().toUpperCase(java.util.Locale.ROOT));
            }
            getsecondarg.write();
            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3 = null;
            Double dMediaSessionCompatQueueItem = null;
            String strComponentActivity9 = null;
            String strComponentActivity10 = null;
            HashMap map2 = null;
            Double dMediaSessionCompatQueueItem2 = null;
            HashMap mapRemoteActionCompatParcelizer = null;
            r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = null;
            String strComponentActivity11 = null;
            while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                String strPlaybackStateCompat3 = getsecondarg.PlaybackStateCompat();
                strPlaybackStateCompat3.getClass();
                switch (strPlaybackStateCompat3) {
                    case "span_id":
                        r8lambdayq9qbmke5in5qopvpj_kuggks_k = (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(0));
                        break;
                    case "name":
                        strComponentActivity10 = getsecondarg.ComponentActivity();
                        break;
                    case "type":
                        strComponentActivity9 = getsecondarg.ComponentActivity();
                        break;
                    case "unit":
                        strComponentActivity11 = getsecondarg.ComponentActivity();
                        break;
                    case "timestamp":
                        dMediaSessionCompatQueueItem = getsecondarg.MediaSessionCompatQueueItem();
                        break;
                    case "value":
                        dMediaSessionCompatQueueItem2 = getsecondarg.MediaSessionCompatQueueItem();
                        break;
                    case "attributes":
                        mapRemoteActionCompatParcelizer = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, new handleCardClicklambda0(2));
                        break;
                    case "trace_id":
                        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3 = (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(false));
                        break;
                    default:
                        HashMap map3 = map2;
                        if (map3 == null) {
                            map3 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map3, strPlaybackStateCompat3);
                        map2 = map3;
                        break;
                }
            }
            HashMap map4 = map2;
            getsecondarg.serializer();
            if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (dMediaSessionCompatQueueItem == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"timestamp\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"timestamp\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (strComponentActivity9 == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"type\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"type\"", illegalStateException4);
                throw illegalStateException4;
            }
            String str2 = strComponentActivity10;
            if (str2 == null) {
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"name\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"name\"", illegalStateException5);
                throw illegalStateException5;
            }
            Double d = dMediaSessionCompatQueueItem2;
            if (d != null) {
                setBannerHeightlambda0 setbannerheightlambda0 = new setBannerHeightlambda0();
                setbannerheightlambda0.read = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3;
                setbannerheightlambda0.write = dMediaSessionCompatQueueItem;
                setbannerheightlambda0.IconCompatParcelizer = str2;
                setbannerheightlambda0.MediaDescriptionCompat = strComponentActivity9;
                setbannerheightlambda0.MediaBrowserCompatMediaItem = d;
                setbannerheightlambda0.serializer = mapRemoteActionCompatParcelizer;
                setbannerheightlambda0.RemoteActionCompatParcelizer = r8lambdayq9qbmke5in5qopvpj_kuggks_k;
                setbannerheightlambda0.MediaMetadataCompat = strComponentActivity11;
                setbannerheightlambda0.MediaSessionCompatQueueItem = map4;
                return setbannerheightlambda0;
            }
            IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"value\"");
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"value\"", illegalStateException6);
            throw illegalStateException6;
        }
        getsecondarg.write();
        Double dMediaSessionCompatQueueItem3 = null;
        String strComponentActivity12 = null;
        logClicklambda0 logclicklambda0 = null;
        HashMap map5 = null;
        HashMap mapRemoteActionCompatParcelizer2 = null;
        Integer numPlaybackStateCompatCustomAction = null;
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k2 = null;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4 = null;
        while (true) {
            String str3 = str;
            if (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                String strPlaybackStateCompat4 = getsecondarg.PlaybackStateCompat();
                strPlaybackStateCompat4.getClass();
                switch (strPlaybackStateCompat4) {
                    case "span_id":
                        r8lambdayq9qbmke5in5qopvpj_kuggks_k2 = (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(0));
                        break;
                    case "severity_number":
                        numPlaybackStateCompatCustomAction = getsecondarg.PlaybackStateCompatCustomAction();
                        break;
                    case "body":
                        strComponentActivity12 = getsecondarg.ComponentActivity();
                        break;
                    case "timestamp":
                        dMediaSessionCompatQueueItem3 = getsecondarg.MediaSessionCompatQueueItem();
                        break;
                    case "level":
                        logclicklambda0 = (logClicklambda0) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new handleCardClicklambda0(3));
                        break;
                    case "attributes":
                        mapRemoteActionCompatParcelizer2 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, new handleCardClicklambda0(2));
                        break;
                    case "trace_id":
                        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4 = (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(false));
                        break;
                    default:
                        if (map5 == null) {
                            map5 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map5, strPlaybackStateCompat4);
                        break;
                }
                str = str3;
            } else {
                getsecondarg.serializer();
                if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4 == null) {
                    IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"trace_id\"");
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"trace_id\"", illegalStateException7);
                    throw illegalStateException7;
                }
                if (dMediaSessionCompatQueueItem3 == null) {
                    IllegalStateException illegalStateException8 = new IllegalStateException(str3);
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, str3, illegalStateException8);
                    throw illegalStateException8;
                }
                if (strComponentActivity12 == null) {
                    IllegalStateException illegalStateException9 = new IllegalStateException("Missing required field \"body\"");
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"body\"", illegalStateException9);
                    throw illegalStateException9;
                }
                if (logclicklambda0 != null) {
                    r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY r8lambdawgrr1ctqcsomiguyjgvk752ezy = new r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4, dMediaSessionCompatQueueItem3, strComponentActivity12, logclicklambda0);
                    r8lambdawgrr1ctqcsomiguyjgvk752ezy.RemoteActionCompatParcelizer = mapRemoteActionCompatParcelizer2;
                    r8lambdawgrr1ctqcsomiguyjgvk752ezy.serializer = numPlaybackStateCompatCustomAction;
                    r8lambdawgrr1ctqcsomiguyjgvk752ezy.read = r8lambdayq9qbmke5in5qopvpj_kuggks_k2;
                    r8lambdawgrr1ctqcsomiguyjgvk752ezy.RatingCompat = map5;
                    return r8lambdawgrr1ctqcsomiguyjgvk752ezy;
                }
                IllegalStateException illegalStateException10 = new IllegalStateException("Missing required field \"level\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"level\"", illegalStateException10);
                throw illegalStateException10;
            }
        }
    }
}
