package io.sentry.protocol;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.IBrazeActionStep;
import o.getSecondArg;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM implements IBrazeActionStep {
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(boolean z) {
        this.write = 0;
    }

    public static IllegalStateException IconCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str) {
        String strM = ff$$ExternalSyntheticOutline0.m("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM);
        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, strM, illegalStateException);
        return illegalStateException;
    }

    public /* synthetic */ r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(int i) {
        this.write = i;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0279  */
    /* JADX WARN: Code duplicated, block: B:200:0x0310  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    @Override // o.IBrazeActionStep
    public final Object write(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        String strComponentActivity = null;
        HashMap map = null;
        HashMap map2 = null;
        HashMap map3 = null;
        ConcurrentHashMap concurrentHashMap = null;
        String strComponentActivity2 = null;
        switch (this.write) {
            case 0:
                return serializer(getsecondarg);
            case 1:
                getsecondarg.write();
                String strComponentActivity3 = null;
                Long lParcelableVolumeInfo = null;
                HashMap map4 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat.getClass();
                    int iHashCode = strPlaybackStateCompat.hashCode();
                    if (iHashCode != -1285004149) {
                        if (iHashCode != -934964668) {
                            if (iHashCode == 50511102 && strPlaybackStateCompat.equals("category")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strPlaybackStateCompat.equals("reason")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strPlaybackStateCompat.equals("quantity")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        lParcelableVolumeInfo = getsecondarg.ParcelableVolumeInfo();
                    } else if (b == 1) {
                        strComponentActivity = getsecondarg.ComponentActivity();
                    } else if (b != 2) {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map4, strPlaybackStateCompat);
                    } else {
                        strComponentActivity3 = getsecondarg.ComponentActivity();
                    }
                }
                getsecondarg.serializer();
                if (strComponentActivity == null) {
                    throw IconCompatParcelizer(brazeActionParserExternalSyntheticLambda0, "reason");
                }
                if (strComponentActivity3 == null) {
                    throw IconCompatParcelizer(brazeActionParserExternalSyntheticLambda0, "category");
                }
                if (lParcelableVolumeInfo == null) {
                    throw IconCompatParcelizer(brazeActionParserExternalSyntheticLambda0, "quantity");
                }
                io.sentry.clientreport.write writeVar = new io.sentry.clientreport.write(strComponentActivity, strComponentActivity3, lParcelableVolumeInfo);
                writeVar.write = map4;
                return writeVar;
            case 2:
                getsecondarg.write();
                Boolean boolRatingCompat = null;
                ConcurrentHashMap concurrentHashMap2 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    if (strPlaybackStateCompat2.equals("result")) {
                        boolRatingCompat = getsecondarg.RatingCompat();
                    } else if (strPlaybackStateCompat2.equals("flag")) {
                        strComponentActivity2 = getsecondarg.ComponentActivity();
                    } else {
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap2, strPlaybackStateCompat2);
                    }
                }
                if (strComponentActivity2 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"flag\"", illegalStateException);
                    throw illegalStateException;
                }
                if (boolRatingCompat == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"result\"", illegalStateException2);
                    throw illegalStateException2;
                }
                boolean zBooleanValue = boolRatingCompat.booleanValue();
                MediaSessionCompatQueueItem mediaSessionCompatQueueItem = new MediaSessionCompatQueueItem();
                mediaSessionCompatQueueItem.write = strComponentActivity2;
                mediaSessionCompatQueueItem.RemoteActionCompatParcelizer = zBooleanValue;
                mediaSessionCompatQueueItem.read = concurrentHashMap2;
                getsecondarg.serializer();
                return mediaSessionCompatQueueItem;
            case 3:
                getsecondarg.write();
                io.sentry.protocol.profiling.write writeVar2 = new io.sentry.protocol.profiling.write();
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat3 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat3.getClass();
                    switch (strPlaybackStateCompat3) {
                        case "frames":
                            b2 = 0;
                            break;
                        case "stacks":
                            b2 = 1;
                            break;
                        case "samples":
                            b2 = 2;
                            break;
                        case "thread_metadata":
                            b2 = 3;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        ArrayList arrayListWrite = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new serializer(24));
                        if (arrayListWrite != null) {
                            writeVar2.serializer = arrayListWrite;
                        }
                    } else if (b2 == 1) {
                        List list = (List) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(4));
                        if (list != null) {
                            writeVar2.write = list;
                        }
                    } else if (b2 == 2) {
                        ArrayList arrayListWrite2 = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(5));
                        if (arrayListWrite2 != null) {
                            writeVar2.RemoteActionCompatParcelizer = arrayListWrite2;
                        }
                    } else if (b2 != 3) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat3);
                    } else {
                        HashMap mapRemoteActionCompatParcelizer = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(6));
                        if (mapRemoteActionCompatParcelizer != null) {
                            writeVar2.IconCompatParcelizer = mapRemoteActionCompatParcelizer;
                        }
                    }
                }
                writeVar2.read = concurrentHashMap;
                getsecondarg.serializer();
                return writeVar2;
            case 4:
                ArrayList arrayList = new ArrayList();
                getsecondarg.RemoteActionCompatParcelizer();
                while (getsecondarg.read()) {
                    ArrayList arrayList2 = new ArrayList();
                    getsecondarg.RemoteActionCompatParcelizer();
                    while (getsecondarg.read()) {
                        arrayList2.add(Integer.valueOf(getsecondarg.MediaSessionCompatResultReceiverWrapper()));
                    }
                    getsecondarg.IconCompatParcelizer();
                    arrayList.add(arrayList2);
                }
                getsecondarg.IconCompatParcelizer();
                return arrayList;
            case 5:
                getsecondarg.write();
                io.sentry.protocol.profiling.IconCompatParcelizer iconCompatParcelizer = new io.sentry.protocol.profiling.IconCompatParcelizer();
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat4 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat4.getClass();
                    int iHashCode2 = strPlaybackStateCompat4.hashCode();
                    if (iHashCode2 != -1562235024) {
                        if (iHashCode2 != 55126294) {
                            if (iHashCode2 == 1302676018 && strPlaybackStateCompat4.equals("stack_id")) {
                                b3 = 2;
                            } else {
                                b3 = -1;
                            }
                        } else if (strPlaybackStateCompat4.equals("timestamp")) {
                            b3 = 1;
                        } else {
                            b3 = -1;
                        }
                    } else if (strPlaybackStateCompat4.equals(CrashHianalyticsData.THREAD_ID)) {
                        b3 = 0;
                    } else {
                        b3 = -1;
                    }
                    if (b3 == 0) {
                        iconCompatParcelizer.IconCompatParcelizer = getsecondarg.ComponentActivity();
                    } else if (b3 == 1) {
                        iconCompatParcelizer.serializer = getsecondarg.MediaBrowserCompatMediaItem();
                    } else if (b3 != 2) {
                        if (map3 == null) {
                            map3 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map3, strPlaybackStateCompat4);
                    } else {
                        iconCompatParcelizer.write = getsecondarg.MediaSessionCompatResultReceiverWrapper();
                    }
                }
                iconCompatParcelizer.read = map3;
                getsecondarg.serializer();
                return iconCompatParcelizer;
            case 6:
                getsecondarg.write();
                io.sentry.protocol.profiling.read readVar = new io.sentry.protocol.profiling.read();
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat5 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat5.getClass();
                    if (strPlaybackStateCompat5.equals(RemoteMessageConst.Notification.PRIORITY)) {
                        readVar.read = getsecondarg.MediaSessionCompatResultReceiverWrapper();
                    } else if (strPlaybackStateCompat5.equals("name")) {
                        readVar.write = getsecondarg.ComponentActivity();
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map2, strPlaybackStateCompat5);
                    }
                }
                readVar.serializer = map2;
                getsecondarg.serializer();
                return readVar;
            case 7:
                return io.sentry.rrweb.MediaMetadataCompat.values()[getsecondarg.MediaSessionCompatResultReceiverWrapper()];
            case 8:
                return io.sentry.rrweb.MediaSessionCompatQueueItem.values()[getsecondarg.MediaSessionCompatResultReceiverWrapper()];
            default:
                getsecondarg.write();
                io.sentry.rrweb.ParcelableVolumeInfo parcelableVolumeInfo = new io.sentry.rrweb.ParcelableVolumeInfo();
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat6 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat6.getClass();
                    int iHashCode3 = strPlaybackStateCompat6.hashCode();
                    if (iHashCode3 != 120) {
                        if (iHashCode3 != 121) {
                            if (iHashCode3 != 3355) {
                                if (iHashCode3 == 665490880 && strPlaybackStateCompat6.equals("timeOffset")) {
                                    b4 = 3;
                                } else {
                                    b4 = -1;
                                }
                            } else if (strPlaybackStateCompat6.equals("id")) {
                                b4 = 2;
                            } else {
                                b4 = -1;
                            }
                        } else if (strPlaybackStateCompat6.equals("y")) {
                            b4 = 1;
                        } else {
                            b4 = -1;
                        }
                    } else if (strPlaybackStateCompat6.equals("x")) {
                        b4 = 0;
                    } else {
                        b4 = -1;
                    }
                    if (b4 == 0) {
                        parcelableVolumeInfo.serializer = getsecondarg.MediaDescriptionCompat();
                    } else if (b4 == 1) {
                        parcelableVolumeInfo.read = getsecondarg.MediaDescriptionCompat();
                    } else if (b4 == 2) {
                        parcelableVolumeInfo.RemoteActionCompatParcelizer = getsecondarg.MediaSessionCompatResultReceiverWrapper();
                    } else if (b4 != 3) {
                        if (map == null) {
                            map = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat6);
                    } else {
                        parcelableVolumeInfo.write = getsecondarg.MediaSessionCompatToken();
                    }
                }
                parcelableVolumeInfo.IconCompatParcelizer = map;
                getsecondarg.serializer();
                return parcelableVolumeInfo;
        }
    }

    public static r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg serializer(getSecondArg getsecondarg) {
        return new r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
    }
}
