package io.sentry.protocol;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.FocusOrderModifierKt;
import o.IBrazeActionStep;
import o.StepDataCompanion;
import o.defaultCardHandlinglambda0;
import o.getSecondArg;
import o.r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k;
import o.r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements IBrazeActionStep {
    public final /* synthetic */ int read;

    public /* synthetic */ serializer(int i) {
        this.read = i;
    }

    public static IllegalStateException RemoteActionCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str) {
        String strM = ff$$ExternalSyntheticOutline0.m("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM);
        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, strM, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException read(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str) {
        String strM = ff$$ExternalSyntheticOutline0.m("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM);
        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, strM, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Code duplicated, block: B:1062:0x1134  */
    /* JADX WARN: Code duplicated, block: B:415:0x0708  */
    /* JADX WARN: Code duplicated, block: B:685:0x0b27  */
    /* JADX WARN: Code duplicated, block: B:804:0x0d0c  */
    /* JADX WARN: Code duplicated, block: B:932:0x0f3f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r33v0, types: [o.getSecondArg] */
    @Override // o.IBrazeActionStep
    public final Object write(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        byte b;
        Double dValueOf;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        ?? r12;
        byte b9;
        int i = 13;
        int i2 = 1;
        switch (this.read) {
            case 0:
                return RemoteActionCompatParcelizer((getSecondArg) getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 1:
                ArrayList arrayList = new ArrayList();
                getsecondarg.write();
                Date dateRemoteActionCompatParcelizer = null;
                HashMap map = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat.getClass();
                    if (!strPlaybackStateCompat.equals("discarded_events")) {
                        if (!strPlaybackStateCompat.equals("timestamp")) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat);
                        } else {
                            dateRemoteActionCompatParcelizer = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                        }
                    } else {
                        arrayList.addAll(getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(i2)));
                    }
                }
                getsecondarg.serializer();
                if (dateRemoteActionCompatParcelizer != null) {
                    if (!arrayList.isEmpty()) {
                        io.sentry.clientreport.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new io.sentry.clientreport.RemoteActionCompatParcelizer(dateRemoteActionCompatParcelizer, arrayList);
                        remoteActionCompatParcelizer.write = map;
                        return remoteActionCompatParcelizer;
                    }
                    throw RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, "discarded_events");
                }
                throw RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, "timestamp");
            case 2:
                getsecondarg.write();
                io.sentry.profilemeasurements.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new io.sentry.profilemeasurements.RemoteActionCompatParcelizer(SystemUtils.UNKNOWN, new ArrayList());
                ConcurrentHashMap concurrentHashMap = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    if (!strPlaybackStateCompat2.equals("values")) {
                        if (!strPlaybackStateCompat2.equals("unit")) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat2);
                        } else {
                            String strComponentActivity = getsecondarg.ComponentActivity();
                            if (strComponentActivity != null) {
                                remoteActionCompatParcelizer2.RemoteActionCompatParcelizer = strComponentActivity;
                            }
                        }
                    } else {
                        ArrayList arrayListWrite = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new serializer(3));
                        if (arrayListWrite != null) {
                            remoteActionCompatParcelizer2.IconCompatParcelizer = arrayListWrite;
                        }
                    }
                }
                remoteActionCompatParcelizer2.write = concurrentHashMap;
                getsecondarg.serializer();
                return remoteActionCompatParcelizer2;
            case 3:
                getsecondarg.write();
                io.sentry.profilemeasurements.IconCompatParcelizer iconCompatParcelizer = new io.sentry.profilemeasurements.IconCompatParcelizer(0L, 0, 0L);
                ConcurrentHashMap concurrentHashMap2 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat3 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat3.getClass();
                    int iHashCode = strPlaybackStateCompat3.hashCode();
                    if (iHashCode != -1709412534) {
                        if (iHashCode != 55126294) {
                            if (iHashCode == 111972721 && strPlaybackStateCompat3.equals("value")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strPlaybackStateCompat3.equals("timestamp")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strPlaybackStateCompat3.equals("elapsed_since_start_ns")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        String strComponentActivity2 = getsecondarg.ComponentActivity();
                        if (strComponentActivity2 != null) {
                            iconCompatParcelizer.RemoteActionCompatParcelizer = strComponentActivity2;
                        }
                    } else if (b == 1) {
                        try {
                            dValueOf = getsecondarg.MediaSessionCompatQueueItem();
                        } catch (NumberFormatException unused) {
                            Date dateRemoteActionCompatParcelizer2 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                            dValueOf = dateRemoteActionCompatParcelizer2 != null ? Double.valueOf(dateRemoteActionCompatParcelizer2.getTime() / 1000.0d) : null;
                        }
                        if (dValueOf != null) {
                            iconCompatParcelizer.IconCompatParcelizer = dValueOf.doubleValue();
                        }
                        break;
                    } else if (b != 2) {
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap2, strPlaybackStateCompat3);
                    } else {
                        Double dMediaSessionCompatQueueItem = getsecondarg.MediaSessionCompatQueueItem();
                        if (dMediaSessionCompatQueueItem != null) {
                            iconCompatParcelizer.serializer = dMediaSessionCompatQueueItem.doubleValue();
                        }
                    }
                }
                iconCompatParcelizer.read = concurrentHashMap2;
                getsecondarg.serializer();
                return iconCompatParcelizer;
            case 4:
                getsecondarg.write();
                write writeVar = new write();
                ConcurrentHashMap concurrentHashMap3 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat4 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat4.getClass();
                    if (!strPlaybackStateCompat4.equals("name")) {
                        if (!strPlaybackStateCompat4.equals("version")) {
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap3, strPlaybackStateCompat4);
                        } else {
                            writeVar.serializer = getsecondarg.ComponentActivity();
                        }
                    } else {
                        writeVar.read = getsecondarg.ComponentActivity();
                    }
                }
                writeVar.IconCompatParcelizer = concurrentHashMap3;
                getsecondarg.serializer();
                return writeVar;
            case 5:
                return read((getSecondArg) getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 6:
                DebugImage debugImage = new DebugImage();
                getsecondarg.write();
                HashMap map2 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat5 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat5.getClass();
                    switch (strPlaybackStateCompat5) {
                        case "debug_file":
                            debugImage.debugFile = getsecondarg.ComponentActivity();
                            break;
                        case "image_addr":
                            debugImage.imageAddr = getsecondarg.ComponentActivity();
                            break;
                        case "image_size":
                            debugImage.imageSize = getsecondarg.ParcelableVolumeInfo();
                            break;
                        case "code_file":
                            debugImage.codeFile = getsecondarg.ComponentActivity();
                            break;
                        case "arch":
                            debugImage.arch = getsecondarg.ComponentActivity();
                            break;
                        case "type":
                            debugImage.type = getsecondarg.ComponentActivity();
                            break;
                        case "uuid":
                            debugImage.uuid = getsecondarg.ComponentActivity();
                            break;
                        case "debug_id":
                            debugImage.debugId = getsecondarg.ComponentActivity();
                            break;
                        case "code_id":
                            debugImage.codeId = getsecondarg.ComponentActivity();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map2, strPlaybackStateCompat5);
                            break;
                    }
                }
                getsecondarg.serializer();
                debugImage.setUnknown(map2);
                return debugImage;
            case 7:
                RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = new RemoteActionCompatParcelizer();
                getsecondarg.write();
                HashMap map3 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat6 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat6.getClass();
                    if (!strPlaybackStateCompat6.equals("images")) {
                        if (!strPlaybackStateCompat6.equals("sdk_info")) {
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map3, strPlaybackStateCompat6);
                        } else {
                            remoteActionCompatParcelizer3.read = (r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new serializer(18));
                        }
                    } else {
                        remoteActionCompatParcelizer3.RemoteActionCompatParcelizer = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new serializer(6));
                    }
                }
                getsecondarg.serializer();
                remoteActionCompatParcelizer3.write = map3;
                return remoteActionCompatParcelizer3;
            case 8:
                return IconCompatParcelizer(getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 9:
                return RatingCompat.valueOf(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().toUpperCase(Locale.ROOT));
            case 10:
                return serializer(getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 11:
                getsecondarg.write();
                MediaSessionCompatToken mediaSessionCompatToken = new MediaSessionCompatToken();
                ConcurrentHashMap concurrentHashMap4 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat7 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat7.getClass();
                    int iHashCode2 = strPlaybackStateCompat7.hashCode();
                    if (iHashCode2 != -934795532) {
                        if (iHashCode2 != 3053931) {
                            if (iHashCode2 == 1481071862 && strPlaybackStateCompat7.equals("country_code")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (strPlaybackStateCompat7.equals("city")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (strPlaybackStateCompat7.equals("region")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        mediaSessionCompatToken.read = getsecondarg.ComponentActivity();
                    } else if (b2 == 1) {
                        mediaSessionCompatToken.serializer = getsecondarg.ComponentActivity();
                    } else if (b2 != 2) {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap4, strPlaybackStateCompat7);
                    } else {
                        mediaSessionCompatToken.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                    }
                }
                mediaSessionCompatToken.IconCompatParcelizer = concurrentHashMap4;
                getsecondarg.serializer();
                return mediaSessionCompatToken;
            case 12:
                return MediaSessionCompatQueueItem(getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 13:
                getsecondarg.write();
                Number number = null;
                String strComponentActivity3 = null;
                ConcurrentHashMap concurrentHashMap5 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat8 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat8.getClass();
                    if (!strPlaybackStateCompat8.equals("unit")) {
                        if (!strPlaybackStateCompat8.equals("value")) {
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap5, strPlaybackStateCompat8);
                        } else {
                            number = (Number) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                        }
                    } else {
                        strComponentActivity3 = getsecondarg.ComponentActivity();
                    }
                }
                getsecondarg.serializer();
                if (number != null) {
                    PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(strComponentActivity3, number);
                    playbackStateCompat.write = concurrentHashMap5;
                    return playbackStateCompat;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"value\"", illegalStateException);
                throw illegalStateException;
            case 14:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                getsecondarg.write();
                HashMap map4 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat9 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat9.getClass();
                    switch (strPlaybackStateCompat9) {
                        case "description":
                            parcelableVolumeInfo.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                            break;
                        case "exception_id":
                            parcelableVolumeInfo.IconCompatParcelizer = getsecondarg.PlaybackStateCompatCustomAction();
                            break;
                        case "data":
                            parcelableVolumeInfo.write = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                            break;
                        case "meta":
                            parcelableVolumeInfo.MediaSessionCompatQueueItem = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                            break;
                        case "type":
                            parcelableVolumeInfo.MediaDescriptionCompat = getsecondarg.ComponentActivity();
                            break;
                        case "handled":
                            parcelableVolumeInfo.serializer = getsecondarg.RatingCompat();
                            break;
                        case "synthetic":
                            parcelableVolumeInfo.MediaMetadataCompat = getsecondarg.RatingCompat();
                            break;
                        case "is_exception_group":
                            parcelableVolumeInfo.read = getsecondarg.RatingCompat();
                            break;
                        case "help_link":
                            parcelableVolumeInfo.MediaBrowserCompatMediaItem = getsecondarg.ComponentActivity();
                            break;
                        case "parent_id":
                            parcelableVolumeInfo.RatingCompat = getsecondarg.PlaybackStateCompatCustomAction();
                            break;
                        default:
                            if (map4 == null) {
                                map4 = new HashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map4, strPlaybackStateCompat9);
                            break;
                    }
                }
                getsecondarg.serializer();
                parcelableVolumeInfo.PlaybackStateCompat = map4;
                return parcelableVolumeInfo;
            case 15:
                getsecondarg.write();
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = new r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat10 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat10.getClass();
                    int iHashCode3 = strPlaybackStateCompat10.hashCode();
                    if (iHashCode3 != -995427962) {
                        if (iHashCode3 != 954925063) {
                            if (iHashCode3 == 1811591356 && strPlaybackStateCompat10.equals("formatted")) {
                                b3 = 2;
                            } else {
                                b3 = -1;
                            }
                        } else if (strPlaybackStateCompat10.equals("message")) {
                            b3 = 1;
                        } else {
                            b3 = -1;
                        }
                    } else if (strPlaybackStateCompat10.equals("params")) {
                        b3 = 0;
                    } else {
                        b3 = -1;
                    }
                    if (b3 == 0) {
                        List list = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                        if (list != null) {
                            r8lambda54beh8zsbru0cxi2ccsp2synys.serializer = list;
                        }
                    } else if (b3 == 1) {
                        r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                    } else if (b3 != 2) {
                        if (concurrentHashMap6 == null) {
                            concurrentHashMap6 = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap6, strPlaybackStateCompat10);
                    } else {
                        r8lambda54beh8zsbru0cxi2ccsp2synys.read = getsecondarg.ComponentActivity();
                    }
                }
                r8lambda54beh8zsbru0cxi2ccsp2synys.write = concurrentHashMap6;
                getsecondarg.serializer();
                return r8lambda54beh8zsbru0cxi2ccsp2synys;
            case 16:
                return RatingCompat(getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 17:
                getsecondarg.write();
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = new r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat11 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat11.getClass();
                    switch (strPlaybackStateCompat11) {
                        case "fragment":
                            r8lambda7ijbvrn0shyidcazufwejfc7yy.RatingCompat = getsecondarg.ComponentActivity();
                            break;
                        case "method":
                            r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaBrowserCompatMediaItem = getsecondarg.ComponentActivity();
                            break;
                        case "env":
                            Map map5 = (Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            if (map5 != null) {
                                r8lambda7ijbvrn0shyidcazufwejfc7yy.write = Options.Companion.RemoteActionCompatParcelizer(map5);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "url":
                            r8lambda7ijbvrn0shyidcazufwejfc7yy.PlaybackStateCompatCustomAction = getsecondarg.ComponentActivity();
                            break;
                        case "data":
                            r8lambda7ijbvrn0shyidcazufwejfc7yy.RemoteActionCompatParcelizer = getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            break;
                        case "other":
                            Map map6 = (Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            if (map6 != null) {
                                r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaMetadataCompat = Options.Companion.RemoteActionCompatParcelizer(map6);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "headers":
                            Map map7 = (Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            if (map7 != null) {
                                r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaDescriptionCompat = Options.Companion.RemoteActionCompatParcelizer(map7);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "cookies":
                            r8lambda7ijbvrn0shyidcazufwejfc7yy.IconCompatParcelizer = getsecondarg.ComponentActivity();
                            break;
                        case "body_size":
                            r8lambda7ijbvrn0shyidcazufwejfc7yy.serializer = getsecondarg.ParcelableVolumeInfo();
                            break;
                        case "query_string":
                            r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaSessionCompatQueueItem = getsecondarg.ComponentActivity();
                            break;
                        case "api_target":
                            r8lambda7ijbvrn0shyidcazufwejfc7yy.read = getsecondarg.ComponentActivity();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap7, strPlaybackStateCompat11);
                            break;
                    }
                }
                r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaSessionCompatResultReceiverWrapper = concurrentHashMap7;
                getsecondarg.serializer();
                return r8lambda7ijbvrn0shyidcazufwejfc7yy;
            case 18:
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss r8lambdag6thfp3waqf9qgdijrkybt1uzss = new r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                getsecondarg.write();
                HashMap map8 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat12 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat12.getClass();
                    switch (strPlaybackStateCompat12) {
                        case "sdk_name":
                            b4 = 0;
                            break;
                        case "version_patchlevel":
                            b4 = 1;
                            break;
                        case "version_major":
                            b4 = 2;
                            break;
                        case "version_minor":
                            b4 = 3;
                            break;
                        default:
                            b4 = -1;
                            break;
                    }
                    if (b4 == 0) {
                        r8lambdag6thfp3waqf9qgdijrkybt1uzss.IconCompatParcelizer = getsecondarg.ComponentActivity();
                    } else if (b4 == 1) {
                        r8lambdag6thfp3waqf9qgdijrkybt1uzss.RemoteActionCompatParcelizer = getsecondarg.PlaybackStateCompatCustomAction();
                    } else if (b4 == 2) {
                        r8lambdag6thfp3waqf9qgdijrkybt1uzss.read = getsecondarg.PlaybackStateCompatCustomAction();
                    } else if (b4 != 3) {
                        if (map8 == null) {
                            map8 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map8, strPlaybackStateCompat12);
                    } else {
                        r8lambdag6thfp3waqf9qgdijrkybt1uzss.serializer = getsecondarg.PlaybackStateCompatCustomAction();
                    }
                }
                getsecondarg.serializer();
                r8lambdag6thfp3waqf9qgdijrkybt1uzss.write = map8;
                return r8lambdag6thfp3waqf9qgdijrkybt1uzss;
            case 19:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                getsecondarg.write();
                String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = null;
                HashMap map9 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat13 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat13.getClass();
                    switch (strPlaybackStateCompat13) {
                        case "name":
                            b5 = 0;
                            break;
                        case "version":
                            b5 = 1;
                            break;
                        case "packages":
                            b5 = 2;
                            break;
                        case "integrations":
                            b5 = 3;
                            break;
                        default:
                            b5 = -1;
                            break;
                    }
                    if (b5 == 0) {
                        strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    } else if (b5 == 1) {
                        strR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    } else if (b5 == 2) {
                        ArrayList arrayListWrite2 = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new serializer(21));
                        if (arrayListWrite2 != null) {
                            arrayList2.addAll(arrayListWrite2);
                        }
                    } else if (b5 != 3) {
                        if (map9 == null) {
                            map9 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map9, strPlaybackStateCompat13);
                    } else {
                        List list2 = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                        if (list2 != null) {
                            arrayList3.addAll(list2);
                        }
                    }
                }
                getsecondarg.serializer();
                if (strR8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"name\"");
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"name\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (strR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 != null) {
                    r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = new r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys, strR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
                    r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.write = new CopyOnWriteArraySet(arrayList2);
                    r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.serializer = new CopyOnWriteArraySet(arrayList3);
                    r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.read = map9;
                    return r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
                }
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"version\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"version\"", illegalStateException3);
                throw illegalStateException3;
            case 20:
                r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 = new r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                getsecondarg.write();
                HashMap map10 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat14 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat14.getClass();
                    switch (strPlaybackStateCompat14) {
                        case "thread_id":
                            b6 = 0;
                            break;
                        case "module":
                            b6 = 1;
                            break;
                        case "type":
                            b6 = 2;
                            break;
                        case "value":
                            b6 = 3;
                            break;
                        case "mechanism":
                            b6 = 4;
                            break;
                        case "stacktrace":
                            b6 = 5;
                            break;
                        default:
                            b6 = -1;
                            break;
                    }
                    if (b6 == 0) {
                        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.read = getsecondarg.ParcelableVolumeInfo();
                    } else if (b6 == 1) {
                        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.IconCompatParcelizer = getsecondarg.ComponentActivity();
                    } else if (b6 == 2) {
                        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                    } else if (b6 == 3) {
                        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.MediaBrowserCompatMediaItem = getsecondarg.ComponentActivity();
                    } else if (b6 == 4) {
                        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.write = (ParcelableVolumeInfo) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new serializer(14));
                    } else if (b6 != 5) {
                        if (map10 == null) {
                            map10 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map10, strPlaybackStateCompat14);
                    } else {
                        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.serializer = (r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new serializer(25));
                    }
                }
                getsecondarg.serializer();
                r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.MediaDescriptionCompat = map10;
                return r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8;
            case 21:
                getsecondarg.write();
                String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys3 = null;
                String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys4 = null;
                HashMap map11 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat15 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat15.getClass();
                    if (!strPlaybackStateCompat15.equals("name")) {
                        if (!strPlaybackStateCompat15.equals("version")) {
                            if (map11 == null) {
                                map11 = new HashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map11, strPlaybackStateCompat15);
                        } else {
                            strR8lambda54BeH8ZsBru0CXI2CCSP2syNys4 = getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                        }
                    } else {
                        strR8lambda54BeH8ZsBru0CXI2CCSP2syNys3 = getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    }
                }
                getsecondarg.serializer();
                if (strR8lambda54BeH8ZsBru0CXI2CCSP2syNys3 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"name\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (strR8lambda54BeH8ZsBru0CXI2CCSP2syNys4 != null) {
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw r8lambdavcwjfxdisgcircy4i008voij_lw = new r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys3, strR8lambda54BeH8ZsBru0CXI2CCSP2syNys4);
                    r8lambdavcwjfxdisgcircy4i008voij_lw.read = map11;
                    return r8lambdavcwjfxdisgcircy4i008voij_lw;
                }
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"version\"", illegalStateException5);
                throw illegalStateException5;
            case 22:
                getsecondarg.write();
                r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs r8lambdag6d1iybxwil5aesazxszmvuycqs = new r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat16 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat16.getClass();
                    int iHashCode4 = strPlaybackStateCompat16.hashCode();
                    if (iHashCode4 != -339173787) {
                        if (iHashCode4 != 3373707) {
                            if (iHashCode4 == 351608024 && strPlaybackStateCompat16.equals("version")) {
                                b7 = 2;
                            } else {
                                b7 = -1;
                            }
                        } else if (strPlaybackStateCompat16.equals("name")) {
                            b7 = 1;
                        } else {
                            b7 = -1;
                        }
                    } else if (strPlaybackStateCompat16.equals("raw_description")) {
                        b7 = 0;
                    } else {
                        b7 = -1;
                    }
                    if (b7 == 0) {
                        r8lambdag6d1iybxwil5aesazxszmvuycqs.read = getsecondarg.ComponentActivity();
                    } else if (b7 == 1) {
                        r8lambdag6d1iybxwil5aesazxszmvuycqs.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                    } else if (b7 != 2) {
                        if (concurrentHashMap8 == null) {
                            concurrentHashMap8 = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap8, strPlaybackStateCompat16);
                    } else {
                        r8lambdag6d1iybxwil5aesazxszmvuycqs.serializer = getsecondarg.ComponentActivity();
                    }
                }
                r8lambdag6d1iybxwil5aesazxszmvuycqs.write = concurrentHashMap8;
                getsecondarg.serializer();
                return r8lambdag6d1iybxwil5aesazxszmvuycqs;
            case 23:
                getsecondarg.write();
                ConcurrentHashMap concurrentHashMap9 = null;
                Map map12 = null;
                HashMap mapRemoteActionCompatParcelizer = null;
                Double dValueOf2 = null;
                Double dValueOf3 = null;
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer = null;
                r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = null;
                r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k2 = null;
                String strComponentActivity4 = null;
                String strComponentActivity5 = null;
                defaultCardHandlinglambda0 defaultcardhandlinglambda0 = null;
                String strComponentActivity6 = null;
                Map map13 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat17 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat17.getClass();
                    switch (strPlaybackStateCompat17) {
                        case "span_id":
                            r8lambdayq9qbmke5in5qopvpj_kuggks_k = new r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                            break;
                        case "parent_span_id":
                            r8lambdayq9qbmke5in5qopvpj_kuggks_k2 = (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(0));
                            break;
                        case "description":
                            strComponentActivity5 = getsecondarg.ComponentActivity();
                            break;
                        case "start_timestamp":
                            try {
                                dValueOf2 = getsecondarg.MediaSessionCompatQueueItem();
                                break;
                            } catch (NumberFormatException unused2) {
                                Date dateRemoteActionCompatParcelizer3 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                                dValueOf2 = dateRemoteActionCompatParcelizer3 == null ? null : Double.valueOf(dateRemoteActionCompatParcelizer3.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "origin":
                            strComponentActivity6 = getsecondarg.ComponentActivity();
                            break;
                        case "status":
                            defaultcardhandlinglambda0 = (defaultCardHandlinglambda0) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(19));
                            break;
                        case "measurements":
                            mapRemoteActionCompatParcelizer = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, new serializer(i));
                            break;
                        case "op":
                            strComponentActivity4 = getsecondarg.ComponentActivity();
                            break;
                        case "data":
                            map13 = (Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            break;
                        case "tags":
                            map12 = (Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            break;
                        case "timestamp":
                            try {
                                dValueOf3 = getsecondarg.MediaSessionCompatQueueItem();
                                break;
                            } catch (NumberFormatException unused3) {
                                Date dateRemoteActionCompatParcelizer4 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                                dValueOf3 = dateRemoteActionCompatParcelizer4 == null ? null : Double.valueOf(dateRemoteActionCompatParcelizer4.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "trace_id":
                            r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer(getsecondarg);
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap9, strPlaybackStateCompat17);
                            break;
                    }
                }
                if (dValueOf2 == null) {
                    throw read(brazeActionParserExternalSyntheticLambda0, "start_timestamp");
                }
                if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer == null) {
                    throw read(brazeActionParserExternalSyntheticLambda0, "trace_id");
                }
                if (r8lambdayq9qbmke5in5qopvpj_kuggks_k == null) {
                    throw read(brazeActionParserExternalSyntheticLambda0, "span_id");
                }
                if (strComponentActivity4 != null) {
                    r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(dValueOf2, dValueOf3, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer, r8lambdayq9qbmke5in5qopvpj_kuggks_k, r8lambdayq9qbmke5in5qopvpj_kuggks_k2, strComponentActivity4, strComponentActivity5, defaultcardhandlinglambda0, strComponentActivity6, map12 == null ? new HashMap() : map12, mapRemoteActionCompatParcelizer == null ? new HashMap() : mapRemoteActionCompatParcelizer, map13);
                    r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.MediaSessionCompatToken = concurrentHashMap9;
                    getsecondarg.serializer();
                    return r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
                }
                throw read(brazeActionParserExternalSyntheticLambda0, "op");
            case 24:
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = new r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                getsecondarg.write();
                ConcurrentHashMap concurrentHashMap10 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat18 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat18.getClass();
                    switch (strPlaybackStateCompat18) {
                        case "post_context":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            break;
                        case "image_addr":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.RatingCompat = getsecondarg.ComponentActivity();
                            break;
                        case "in_app":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatQueueItem = getsecondarg.RatingCompat();
                            break;
                        case "raw_function":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.ResultReceiver = getsecondarg.ComponentActivity();
                            break;
                        case "lineno":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompatCustomAction = getsecondarg.PlaybackStateCompatCustomAction();
                            break;
                        case "module":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompat = getsecondarg.ComponentActivity();
                            break;
                        case "native":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.write = getsecondarg.RatingCompat();
                            break;
                        case "symbol":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getsecondarg.ComponentActivity();
                            break;
                        case "package":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.IconCompatParcelizer = getsecondarg.ComponentActivity();
                            break;
                        case "filename":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaMetadataCompat = getsecondarg.ComponentActivity();
                            break;
                        case "symbol_addr":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.ComponentActivity = getsecondarg.ComponentActivity();
                            break;
                        case "lock":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = (r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i));
                            break;
                        case "vars":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = (Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            break;
                        case "colno":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.read = getsecondarg.PlaybackStateCompatCustomAction();
                            break;
                        case "instruction_addr":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatToken = getsecondarg.ComponentActivity();
                            break;
                        case "pre_context":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                            break;
                        case "addr_mode":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                            break;
                        case "context_line":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaDescriptionCompat = getsecondarg.ComponentActivity();
                            break;
                        case "function":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaBrowserCompatMediaItem = getsecondarg.ComponentActivity();
                            break;
                        case "abs_path":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.serializer = getsecondarg.ComponentActivity();
                            break;
                        case "platform":
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.ParcelableVolumeInfo = getsecondarg.ComponentActivity();
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap10, strPlaybackStateCompat18);
                            break;
                    }
                }
                r8lambdah6vvr6zuwa2u1fe0kskpogpr28.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = concurrentHashMap10;
                getsecondarg.serializer();
                return r8lambdah6vvr6zuwa2u1fe0kskpogpr28;
            case 25:
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh0 = new r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
                getsecondarg.write();
                ConcurrentHashMap concurrentHashMap11 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat19 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat19.getClass();
                    switch (strPlaybackStateCompat19) {
                        case "frames":
                            b8 = 0;
                            break;
                        case "instruction_addr_adjustment":
                            b8 = 1;
                            break;
                        case "registers":
                            b8 = 2;
                            break;
                        case "snapshot":
                            b8 = 3;
                            break;
                        default:
                            b8 = -1;
                            break;
                    }
                    if (b8 == 0) {
                        r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.read = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new serializer(24));
                    } else if (b8 == 1) {
                        r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.IconCompatParcelizer = (_init_lambda3) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new serializer(26));
                    } else if (b8 == 2) {
                        r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.RemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                    } else if (b8 != 3) {
                        if (concurrentHashMap11 == null) {
                            concurrentHashMap11 = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap11, strPlaybackStateCompat19);
                    } else {
                        r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.serializer = getsecondarg.RatingCompat();
                    }
                }
                r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.write = concurrentHashMap11;
                getsecondarg.serializer();
                return r8lambdaypqlaaoriyrj3iy_tqzuutrvh0;
            case 26:
                return _init_lambda3.valueOf(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().toUpperCase(Locale.ROOT));
            case 27:
                _init_lambda2 _init_lambda2Var = new _init_lambda2();
                getsecondarg.write();
                ConcurrentHashMap concurrentHashMap12 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat20 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat20.getClass();
                    switch (strPlaybackStateCompat20) {
                        case "daemon":
                            _init_lambda2Var.serializer = getsecondarg.RatingCompat();
                            break;
                        case "priority":
                            _init_lambda2Var.RatingCompat = getsecondarg.PlaybackStateCompatCustomAction();
                            break;
                        case "held_locks":
                            HashMap mapRemoteActionCompatParcelizer2 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i));
                            if (mapRemoteActionCompatParcelizer2 != null) {
                                _init_lambda2Var.RemoteActionCompatParcelizer = new HashMap(mapRemoteActionCompatParcelizer2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "id":
                            _init_lambda2Var.IconCompatParcelizer = getsecondarg.ParcelableVolumeInfo();
                            break;
                        case "main":
                            _init_lambda2Var.MediaMetadataCompat = getsecondarg.RatingCompat();
                            break;
                        case "name":
                            _init_lambda2Var.MediaSessionCompatQueueItem = getsecondarg.ComponentActivity();
                            break;
                        case "state":
                            _init_lambda2Var.MediaDescriptionCompat = getsecondarg.ComponentActivity();
                            break;
                        case "crashed":
                            _init_lambda2Var.write = getsecondarg.RatingCompat();
                            break;
                        case "current":
                            _init_lambda2Var.read = getsecondarg.RatingCompat();
                            break;
                        case "stacktrace":
                            _init_lambda2Var.MediaBrowserCompatMediaItem = (r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new serializer(25));
                            break;
                        default:
                            if (concurrentHashMap12 == null) {
                                concurrentHashMap12 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap12, strPlaybackStateCompat20);
                            break;
                    }
                }
                _init_lambda2Var.PlaybackStateCompat = concurrentHashMap12;
                getsecondarg.serializer();
                return _init_lambda2Var;
            case 28:
                getsecondarg.write();
                accessensureViewModelStore accessensureviewmodelstore = new accessensureViewModelStore(new ArrayList(), new HashMap(), new addObserverForBackInvokerlambda0(ensureViewModelStore.CUSTOM.apiName()));
                ConcurrentHashMap concurrentHashMap13 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat21 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat21.getClass();
                    switch (strPlaybackStateCompat21) {
                        case "start_timestamp":
                            try {
                                Double dMediaSessionCompatQueueItem2 = getsecondarg.MediaSessionCompatQueueItem();
                                if (dMediaSessionCompatQueueItem2 != null) {
                                    accessensureviewmodelstore.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = dMediaSessionCompatQueueItem2;
                                }
                                break;
                            } catch (NumberFormatException unused4) {
                                Date dateRemoteActionCompatParcelizer5 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                                if (dateRemoteActionCompatParcelizer5 != null) {
                                    accessensureviewmodelstore.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Double.valueOf(dateRemoteActionCompatParcelizer5.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapRemoteActionCompatParcelizer3 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, new serializer(i));
                            if (mapRemoteActionCompatParcelizer3 != null) {
                                accessensureviewmodelstore.ResultReceiver.putAll(mapRemoteActionCompatParcelizer3);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "type":
                            getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                            break;
                        case "timestamp":
                            try {
                                Double dMediaSessionCompatQueueItem3 = getsecondarg.MediaSessionCompatQueueItem();
                                if (dMediaSessionCompatQueueItem3 != null) {
                                    accessensureviewmodelstore.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = dMediaSessionCompatQueueItem3;
                                }
                                break;
                            } catch (NumberFormatException unused5) {
                                Date dateRemoteActionCompatParcelizer6 = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                                if (dateRemoteActionCompatParcelizer6 != null) {
                                    accessensureviewmodelstore.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = Double.valueOf(dateRemoteActionCompatParcelizer6.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "spans":
                            ArrayList arrayListWrite3 = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new serializer(23));
                            if (arrayListWrite3 != null) {
                                accessensureviewmodelstore.ComponentActivity.addAll(arrayListWrite3);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "transaction_info":
                            accessensureviewmodelstore.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = defaultViewModelProviderFactory_delegatelambda0.read(getsecondarg, brazeActionParserExternalSyntheticLambda0);
                            break;
                        case "transaction":
                            accessensureviewmodelstore.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getsecondarg.ComponentActivity();
                            break;
                        default:
                            if (FocusOrderModifierKt.read(accessensureviewmodelstore, strPlaybackStateCompat21, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                                break;
                            } else {
                                if (concurrentHashMap13 == null) {
                                    concurrentHashMap13 = new ConcurrentHashMap();
                                }
                                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap13, strPlaybackStateCompat21);
                                break;
                            }
                            break;
                    }
                }
                accessensureviewmodelstore.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = concurrentHashMap13;
                getsecondarg.serializer();
                return accessensureviewmodelstore;
            default:
                char c = 6;
                boolean z = false;
                getsecondarg.write();
                addObserverForBackInvoker addobserverforbackinvoker = new addObserverForBackInvoker();
                ConcurrentHashMap concurrentHashMap14 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat22 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat22.getClass();
                    switch (strPlaybackStateCompat22.hashCode()) {
                        case -265713450:
                            r12 = !strPlaybackStateCompat22.equals("username") ? -1 : z;
                            break;
                        case 3355:
                            r12 = !strPlaybackStateCompat22.equals("id") ? -1 : 1;
                            break;
                        case 102225:
                            r12 = !strPlaybackStateCompat22.equals("geo") ? -1 : 2;
                            break;
                        case 3076010:
                            r12 = !strPlaybackStateCompat22.equals(RemoteMessageConst.DATA) ? -1 : 3;
                            break;
                        case 3373707:
                            r12 = !strPlaybackStateCompat22.equals("name") ? -1 : 4;
                            break;
                        case 96619420:
                            r12 = !strPlaybackStateCompat22.equals("email") ? -1 : 5;
                            break;
                        case 1480014044:
                            r12 = !strPlaybackStateCompat22.equals("ip_address") ? -1 : c;
                            break;
                        default:
                            r12 = -1;
                            break;
                    }
                    switch (r12) {
                        case 0:
                            addobserverforbackinvoker.MediaSessionCompatQueueItem = getsecondarg.ComponentActivity();
                            continue;
                            c = 6;
                            z = false;
                            break;
                        case 1:
                            addobserverforbackinvoker.read = getsecondarg.ComponentActivity();
                            continue;
                            c = 6;
                            z = false;
                            break;
                        case 2:
                            getsecondarg.write();
                            MediaSessionCompatToken mediaSessionCompatToken2 = new MediaSessionCompatToken();
                            ConcurrentHashMap concurrentHashMap15 = null;
                            while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                                String strPlaybackStateCompat23 = getsecondarg.PlaybackStateCompat();
                                strPlaybackStateCompat23.getClass();
                                int iHashCode5 = strPlaybackStateCompat23.hashCode();
                                if (iHashCode5 != -934795532) {
                                    if (iHashCode5 != 3053931) {
                                        if (iHashCode5 == 1481071862 && strPlaybackStateCompat23.equals("country_code")) {
                                            b9 = 2;
                                        } else {
                                            b9 = -1;
                                        }
                                    } else if (strPlaybackStateCompat23.equals("city")) {
                                        b9 = 1;
                                    } else {
                                        b9 = -1;
                                    }
                                } else if (strPlaybackStateCompat23.equals("region")) {
                                    b9 = 0;
                                } else {
                                    b9 = -1;
                                }
                                if (b9 == 0) {
                                    mediaSessionCompatToken2.read = getsecondarg.ComponentActivity();
                                } else if (b9 == 1) {
                                    mediaSessionCompatToken2.serializer = getsecondarg.ComponentActivity();
                                } else if (b9 != 2) {
                                    if (concurrentHashMap15 == null) {
                                        concurrentHashMap15 = new ConcurrentHashMap();
                                    }
                                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap15, strPlaybackStateCompat23);
                                } else {
                                    mediaSessionCompatToken2.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                                }
                            }
                            mediaSessionCompatToken2.IconCompatParcelizer = concurrentHashMap15;
                            getsecondarg.serializer();
                            addobserverforbackinvoker.serializer = mediaSessionCompatToken2;
                            continue;
                            c = 6;
                            z = false;
                            break;
                        case 3:
                            addobserverforbackinvoker.write = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                            break;
                        case 4:
                            addobserverforbackinvoker.MediaBrowserCompatMediaItem = getsecondarg.ComponentActivity();
                            break;
                        case 5:
                            addobserverforbackinvoker.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                            break;
                        case 6:
                            addobserverforbackinvoker.IconCompatParcelizer = getsecondarg.ComponentActivity();
                            break;
                        default:
                            if (concurrentHashMap14 == null) {
                                concurrentHashMap14 = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap14, strPlaybackStateCompat22);
                            continue;
                            c = 6;
                            z = false;
                            break;
                    }
                    c = 6;
                    z = false;
                }
                addobserverforbackinvoker.RatingCompat = concurrentHashMap14;
                getsecondarg.serializer();
                return addobserverforbackinvoker;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static MediaSessionCompatResultReceiverWrapper serializer(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        getsecondarg.write();
        String strComponentActivity = null;
        String strComponentActivity2 = null;
        String strComponentActivity3 = null;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer = null;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer2 = null;
        String strComponentActivity4 = null;
        HashMap map = null;
        while (true) {
            byte b = 0;
            if (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
                strPlaybackStateCompat.getClass();
                switch (strPlaybackStateCompat.hashCode()) {
                    case -964729863:
                        if (!strPlaybackStateCompat.equals("associated_event_id")) {
                            b = -1;
                        }
                        break;
                    case -454767501:
                        if (!strPlaybackStateCompat.equals("replay_id")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 116079:
                        if (!strPlaybackStateCompat.equals("url")) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case 3373707:
                        if (!strPlaybackStateCompat.equals("name")) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case 947010237:
                        if (!strPlaybackStateCompat.equals("contact_email")) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    case 954925063:
                        if (!strPlaybackStateCompat.equals("message")) {
                            b = -1;
                        } else {
                            b = 5;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer(getsecondarg);
                } else if (b == 1) {
                    r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer(getsecondarg);
                } else if (b == 2) {
                    strComponentActivity4 = getsecondarg.ComponentActivity();
                } else if (b == 3) {
                    strComponentActivity3 = getsecondarg.ComponentActivity();
                } else if (b == 4) {
                    strComponentActivity2 = getsecondarg.ComponentActivity();
                } else if (b != 5) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat);
                } else {
                    strComponentActivity = getsecondarg.ComponentActivity();
                }
            } else {
                getsecondarg.serializer();
                if (strComponentActivity != null) {
                    MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper = new MediaSessionCompatResultReceiverWrapper();
                    if (strComponentActivity.length() > 4096) {
                        mediaSessionCompatResultReceiverWrapper.read = strComponentActivity.substring(0, Fields.TransformOrigin);
                    } else {
                        mediaSessionCompatResultReceiverWrapper.read = strComponentActivity;
                    }
                    mediaSessionCompatResultReceiverWrapper.serializer = strComponentActivity2;
                    mediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer = strComponentActivity3;
                    mediaSessionCompatResultReceiverWrapper.IconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer;
                    mediaSessionCompatResultReceiverWrapper.write = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer2;
                    mediaSessionCompatResultReceiverWrapper.MediaDescriptionCompat = strComponentActivity4;
                    mediaSessionCompatResultReceiverWrapper.MediaMetadataCompat = map;
                    return mediaSessionCompatResultReceiverWrapper;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    public static PlaybackStateCompatCustomAction MediaSessionCompatQueueItem(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        getsecondarg.write();
        PlaybackStateCompatCustomAction playbackStateCompatCustomAction = new PlaybackStateCompatCustomAction();
        ConcurrentHashMap concurrentHashMap = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            switch (strPlaybackStateCompat) {
                case "npot_support":
                    playbackStateCompatCustomAction.MediaMetadataCompat = getsecondarg.ComponentActivity();
                    break;
                case "vendor_id":
                    playbackStateCompatCustomAction.RatingCompat = getsecondarg.ComponentActivity();
                    break;
                case "multi_threaded_rendering":
                    playbackStateCompatCustomAction.write = getsecondarg.RatingCompat();
                    break;
                case "id":
                    playbackStateCompatCustomAction.RemoteActionCompatParcelizer = getsecondarg.PlaybackStateCompatCustomAction();
                    break;
                case "name":
                    playbackStateCompatCustomAction.read = getsecondarg.ComponentActivity();
                    break;
                case "vendor_name":
                    playbackStateCompatCustomAction.MediaBrowserCompatMediaItem = getsecondarg.ComponentActivity();
                    break;
                case "version":
                    playbackStateCompatCustomAction.MediaSessionCompatQueueItem = getsecondarg.ComponentActivity();
                    break;
                case "api_type":
                    playbackStateCompatCustomAction.serializer = getsecondarg.ComponentActivity();
                    break;
                case "memory_size":
                    playbackStateCompatCustomAction.IconCompatParcelizer = getsecondarg.PlaybackStateCompatCustomAction();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat);
                    break;
            }
        }
        playbackStateCompatCustomAction.MediaDescriptionCompat = concurrentHashMap;
        getsecondarg.serializer();
        return playbackStateCompatCustomAction;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x010d  */
    public static IconCompatParcelizer read(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        byte b;
        byte b2;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        getsecondarg.write();
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            int i = 0;
            switch (strPlaybackStateCompat) {
                case "device":
                    b = 0;
                    break;
                case "spring":
                    b = 1;
                    break;
                case "response":
                    b = 2;
                    break;
                case "profile":
                    b = 3;
                    break;
                case "feedback":
                    b = 4;
                    break;
                case "os":
                    b = 5;
                    break;
                case "app":
                    b = 6;
                    break;
                case "gpu":
                    b = 7;
                    break;
                case "flags":
                    b = 8;
                    break;
                case "trace":
                    b = 9;
                    break;
                case "browser":
                    b = 10;
                    break;
                case "runtime":
                    b = 11;
                    break;
                default:
                    b = -1;
                    break;
            }
            ConcurrentHashMap concurrentHashMap = null;
            switch (b) {
                case 0:
                    iconCompatParcelizer.RemoteActionCompatParcelizer(IconCompatParcelizer(getsecondarg, brazeActionParserExternalSyntheticLambda0));
                    break;
                case 1:
                    iconCompatParcelizer.serializer(_init_lambda4.read(getsecondarg, brazeActionParserExternalSyntheticLambda0));
                    break;
                case 2:
                    iconCompatParcelizer.read(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read(getsecondarg, brazeActionParserExternalSyntheticLambda0));
                    break;
                case 3:
                    getsecondarg.write();
                    StepDataCompanion stepDataCompanion = new StepDataCompanion(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer);
                    while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                        String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                        strPlaybackStateCompat2.getClass();
                        if (!strPlaybackStateCompat2.equals("profiler_id")) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat2);
                        } else {
                            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = (r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(i));
                            if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg != null) {
                                stepDataCompanion.write = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
                            }
                        }
                    }
                    stepDataCompanion.RemoteActionCompatParcelizer = concurrentHashMap;
                    getsecondarg.serializer();
                    iconCompatParcelizer.IconCompatParcelizer(stepDataCompanion, "profile");
                    break;
                case 4:
                    iconCompatParcelizer.IconCompatParcelizer(serializer(getsecondarg, brazeActionParserExternalSyntheticLambda0), "feedback");
                    break;
                case 5:
                    iconCompatParcelizer.write(RatingCompat(getsecondarg, brazeActionParserExternalSyntheticLambda0));
                    break;
                case 6:
                    iconCompatParcelizer.write(RemoteActionCompatParcelizer(getsecondarg, brazeActionParserExternalSyntheticLambda0));
                    break;
                case 7:
                    iconCompatParcelizer.serializer(MediaSessionCompatQueueItem(getsecondarg, brazeActionParserExternalSyntheticLambda0));
                    break;
                case 8:
                    iconCompatParcelizer.IconCompatParcelizer(MediaDescriptionCompat.RemoteActionCompatParcelizer(getsecondarg, brazeActionParserExternalSyntheticLambda0));
                    break;
                case 9:
                    iconCompatParcelizer.serializer(r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo.IconCompatParcelizer(getsecondarg, brazeActionParserExternalSyntheticLambda0));
                    break;
                case 10:
                    getsecondarg.write();
                    write writeVar = new write();
                    while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                        String strPlaybackStateCompat3 = getsecondarg.PlaybackStateCompat();
                        strPlaybackStateCompat3.getClass();
                        if (!strPlaybackStateCompat3.equals("name")) {
                            if (!strPlaybackStateCompat3.equals("version")) {
                                if (concurrentHashMap == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                }
                                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat3);
                            } else {
                                writeVar.serializer = getsecondarg.ComponentActivity();
                            }
                        } else {
                            writeVar.read = getsecondarg.ComponentActivity();
                        }
                    }
                    writeVar.IconCompatParcelizer = concurrentHashMap;
                    getsecondarg.serializer();
                    iconCompatParcelizer.RemoteActionCompatParcelizer(writeVar);
                    break;
                case 11:
                    getsecondarg.write();
                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs r8lambdag6d1iybxwil5aesazxszmvuycqs = new r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
                    while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                        String strPlaybackStateCompat4 = getsecondarg.PlaybackStateCompat();
                        strPlaybackStateCompat4.getClass();
                        int iHashCode = strPlaybackStateCompat4.hashCode();
                        if (iHashCode != -339173787) {
                            if (iHashCode != 3373707) {
                                if (iHashCode == 351608024 && strPlaybackStateCompat4.equals("version")) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strPlaybackStateCompat4.equals("name")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                        } else if (strPlaybackStateCompat4.equals("raw_description")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        if (b2 == 0) {
                            r8lambdag6d1iybxwil5aesazxszmvuycqs.read = getsecondarg.ComponentActivity();
                        } else if (b2 == 1) {
                            r8lambdag6d1iybxwil5aesazxszmvuycqs.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                        } else if (b2 != 2) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat4);
                        } else {
                            r8lambdag6d1iybxwil5aesazxszmvuycqs.serializer = getsecondarg.ComponentActivity();
                        }
                    }
                    r8lambdag6d1iybxwil5aesazxszmvuycqs.write = concurrentHashMap;
                    getsecondarg.serializer();
                    iconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdag6d1iybxwil5aesazxszmvuycqs);
                    break;
                default:
                    Object objR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    if (objR8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
                        iconCompatParcelizer.IconCompatParcelizer(objR8lambda7IJBVrN0sHyidCAZufWEJFc7yY, strPlaybackStateCompat);
                    }
                    break;
            }
        }
        getsecondarg.serializer();
        return iconCompatParcelizer;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    public static read RemoteActionCompatParcelizer(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        getsecondarg.write();
        read readVar = new read();
        ConcurrentHashMap concurrentHashMap = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            switch (strPlaybackStateCompat) {
                case "split_names":
                    List list = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    if (list == null) {
                        break;
                    } else {
                        readVar.PlaybackStateCompatCustomAction = list;
                        break;
                    }
                    break;
                case "device_app_hash":
                    readVar.RatingCompat = getsecondarg.ComponentActivity();
                    break;
                case "start_type":
                    readVar.ParcelableVolumeInfo = getsecondarg.ComponentActivity();
                    break;
                case "view_names":
                    List list2 = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    if (list2 == null) {
                        break;
                    } else {
                        readVar.PlaybackStateCompat = list2;
                        break;
                    }
                    break;
                case "app_version":
                    readVar.read = getsecondarg.ComponentActivity();
                    break;
                case "in_foreground":
                    readVar.MediaSessionCompatQueueItem = getsecondarg.RatingCompat();
                    break;
                case "build_type":
                    readVar.MediaMetadataCompat = getsecondarg.ComponentActivity();
                    break;
                case "app_identifier":
                    readVar.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                    break;
                case "app_start_time":
                    readVar.IconCompatParcelizer = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                    break;
                case "permissions":
                    readVar.MediaDescriptionCompat = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                    break;
                case "app_name":
                    readVar.serializer = getsecondarg.ComponentActivity();
                    break;
                case "app_build":
                    readVar.write = getsecondarg.ComponentActivity();
                    break;
                case "is_split_apks":
                    readVar.MediaBrowserCompatMediaItem = getsecondarg.RatingCompat();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat);
                    break;
            }
        }
        readVar.MediaSessionCompatToken = concurrentHashMap;
        getsecondarg.serializer();
        return readVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    public static ComponentActivity RatingCompat(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        byte b;
        getsecondarg.write();
        ComponentActivity componentActivity = new ComponentActivity();
        ConcurrentHashMap concurrentHashMap = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            switch (strPlaybackStateCompat) {
                case "rooted":
                    b = 0;
                    break;
                case "raw_description":
                    b = 1;
                    break;
                case "name":
                    b = 2;
                    break;
                case "build":
                    b = 3;
                    break;
                case "version":
                    b = 4;
                    break;
                case "kernel_version":
                    b = 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                componentActivity.read = getsecondarg.RatingCompat();
            } else if (b == 1) {
                componentActivity.serializer = getsecondarg.ComponentActivity();
            } else if (b == 2) {
                componentActivity.write = getsecondarg.ComponentActivity();
            } else if (b == 3) {
                componentActivity.IconCompatParcelizer = getsecondarg.ComponentActivity();
            } else if (b == 4) {
                componentActivity.MediaBrowserCompatMediaItem = getsecondarg.ComponentActivity();
            } else if (b != 5) {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat);
            } else {
                componentActivity.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
            }
        }
        componentActivity.RatingCompat = concurrentHashMap;
        getsecondarg.serializer();
        return componentActivity;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:144:0x01e6  */
    public static MediaMetadataCompat IconCompatParcelizer(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        getsecondarg.write();
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat();
        ConcurrentHashMap concurrentHashMap = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            int i = 9;
            switch (strPlaybackStateCompat) {
                case "timezone":
                    mediaMetadataCompat._init_lambda4 = getsecondarg.read(brazeActionParserExternalSyntheticLambda0);
                    break;
                case "boot_time":
                    if (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != io.sentry.vendor.gson.stream.IconCompatParcelizer.STRING) {
                        break;
                    } else {
                        mediaMetadataCompat.write = getsecondarg.RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                        break;
                    }
                    break;
                case "simulator":
                    mediaMetadataCompat._init_lambda3 = getsecondarg.RatingCompat();
                    break;
                case "manufacturer":
                    mediaMetadataCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getsecondarg.ComponentActivity();
                    break;
                case "processor_count":
                    mediaMetadataCompat.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = getsecondarg.PlaybackStateCompatCustomAction();
                    break;
                case "orientation":
                    mediaMetadataCompat.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = (RatingCompat) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new serializer(i));
                    break;
                case "battery_temperature":
                    mediaMetadataCompat.IconCompatParcelizer = getsecondarg.MediaMetadataCompat();
                    break;
                case "family":
                    mediaMetadataCompat.PlaybackStateCompatCustomAction = getsecondarg.ComponentActivity();
                    break;
                case "locale":
                    mediaMetadataCompat.ComponentActivity = getsecondarg.ComponentActivity();
                    break;
                case "online":
                    mediaMetadataCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = getsecondarg.RatingCompat();
                    break;
                case "battery_level":
                    mediaMetadataCompat.serializer = getsecondarg.MediaMetadataCompat();
                    break;
                case "model_id":
                    mediaMetadataCompat.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getsecondarg.ComponentActivity();
                    break;
                case "screen_density":
                    mediaMetadataCompat.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = getsecondarg.MediaMetadataCompat();
                    break;
                case "screen_dpi":
                    mediaMetadataCompat.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = getsecondarg.PlaybackStateCompatCustomAction();
                    break;
                case "free_memory":
                    mediaMetadataCompat.MediaSessionCompatResultReceiverWrapper = getsecondarg.ParcelableVolumeInfo();
                    break;
                case "id":
                    mediaMetadataCompat.ParcelableVolumeInfo = getsecondarg.ComponentActivity();
                    break;
                case "name":
                    mediaMetadataCompat.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = getsecondarg.ComponentActivity();
                    break;
                case "low_memory":
                    mediaMetadataCompat.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getsecondarg.RatingCompat();
                    break;
                case "archs":
                    List list = (List) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        mediaMetadataCompat.read = strArr;
                        break;
                    }
                    break;
                case "brand":
                    mediaMetadataCompat.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                    break;
                case "model":
                    mediaMetadataCompat.ResultReceiver = getsecondarg.ComponentActivity();
                    break;
                case "cpu_description":
                    mediaMetadataCompat.MediaMetadataCompat = getsecondarg.ComponentActivity();
                    break;
                case "processor_frequency":
                    mediaMetadataCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = getsecondarg.MediaSessionCompatQueueItem();
                    break;
                case "connection_type":
                    mediaMetadataCompat.MediaDescriptionCompat = getsecondarg.ComponentActivity();
                    break;
                case "chipset":
                    mediaMetadataCompat.RatingCompat = getsecondarg.ComponentActivity();
                    break;
                case "screen_width_pixels":
                    mediaMetadataCompat.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = getsecondarg.PlaybackStateCompatCustomAction();
                    break;
                case "external_storage_size":
                    mediaMetadataCompat.PlaybackStateCompat = getsecondarg.ParcelableVolumeInfo();
                    break;
                case "storage_size":
                    mediaMetadataCompat.accessensureViewModelStore = getsecondarg.ParcelableVolumeInfo();
                    break;
                case "usable_memory":
                    mediaMetadataCompat._init_lambda1 = getsecondarg.ParcelableVolumeInfo();
                    break;
                case "memory_size":
                    mediaMetadataCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getsecondarg.ParcelableVolumeInfo();
                    break;
                case "charging":
                    mediaMetadataCompat.MediaSessionCompatQueueItem = getsecondarg.RatingCompat();
                    break;
                case "external_free_storage":
                    mediaMetadataCompat.MediaBrowserCompatMediaItem = getsecondarg.ParcelableVolumeInfo();
                    break;
                case "free_storage":
                    mediaMetadataCompat.MediaSessionCompatToken = getsecondarg.ParcelableVolumeInfo();
                    break;
                case "screen_height_pixels":
                    mediaMetadataCompat.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = getsecondarg.PlaybackStateCompatCustomAction();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat);
                    break;
            }
        }
        mediaMetadataCompat._init_lambda2 = concurrentHashMap;
        getsecondarg.serializer();
        return mediaMetadataCompat;
    }
}
