package io.sentry.rrweb;

import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.protocol.createFullyDrawnExecutor;
import io.sentry.protocol.fullyDrawnReporter_delegatelambda00;
import io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.IBrazeActionStep;
import o.component10;
import o.getSecondArg;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class RatingCompat implements IBrazeActionStep {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ RatingCompat(int i) {
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:81:0x011a  */
    public static ComponentActivity MediaDescriptionCompat(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        getsecondarg.write();
        ComponentActivity componentActivity = new ComponentActivity();
        HashMap map = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            if (strPlaybackStateCompat.equals(RemoteMessageConst.DATA)) {
                getsecondarg.write();
                ConcurrentHashMap concurrentHashMap = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    if (strPlaybackStateCompat2.equals("payload")) {
                        getsecondarg.write();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                            String strPlaybackStateCompat3 = getsecondarg.PlaybackStateCompat();
                            strPlaybackStateCompat3.getClass();
                            switch (strPlaybackStateCompat3) {
                                case "duration":
                                    componentActivity.serializer = getsecondarg.MediaSessionCompatToken();
                                    break;
                                case "segmentId":
                                    componentActivity.MediaSessionCompatResultReceiverWrapper = getsecondarg.MediaSessionCompatResultReceiverWrapper();
                                    break;
                                case "height":
                                    Integer numPlaybackStateCompatCustomAction = getsecondarg.PlaybackStateCompatCustomAction();
                                    componentActivity.MediaMetadataCompat = numPlaybackStateCompatCustomAction != null ? numPlaybackStateCompatCustomAction.intValue() : 0;
                                    break;
                                case "container":
                                    String strComponentActivity = getsecondarg.ComponentActivity();
                                    if (strComponentActivity == null) {
                                        strComponentActivity = "";
                                    }
                                    componentActivity.write = strComponentActivity;
                                    break;
                                case "frameCount":
                                    Integer numPlaybackStateCompatCustomAction2 = getsecondarg.PlaybackStateCompatCustomAction();
                                    componentActivity.IconCompatParcelizer = numPlaybackStateCompatCustomAction2 != null ? numPlaybackStateCompatCustomAction2.intValue() : 0;
                                    break;
                                case "top":
                                    Integer numPlaybackStateCompatCustomAction3 = getsecondarg.PlaybackStateCompatCustomAction();
                                    componentActivity.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = numPlaybackStateCompatCustomAction3 != null ? numPlaybackStateCompatCustomAction3.intValue() : 0;
                                    break;
                                case "left":
                                    Integer numPlaybackStateCompatCustomAction4 = getsecondarg.PlaybackStateCompatCustomAction();
                                    componentActivity.MediaBrowserCompatMediaItem = numPlaybackStateCompatCustomAction4 != null ? numPlaybackStateCompatCustomAction4.intValue() : 0;
                                    break;
                                case "size":
                                    Long lParcelableVolumeInfo = getsecondarg.ParcelableVolumeInfo();
                                    componentActivity.MediaSessionCompatToken = lParcelableVolumeInfo == null ? 0L : lParcelableVolumeInfo.longValue();
                                    break;
                                case "width":
                                    Integer numPlaybackStateCompatCustomAction5 = getsecondarg.PlaybackStateCompatCustomAction();
                                    componentActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = numPlaybackStateCompatCustomAction5 != null ? numPlaybackStateCompatCustomAction5.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer numPlaybackStateCompatCustomAction6 = getsecondarg.PlaybackStateCompatCustomAction();
                                    componentActivity.MediaDescriptionCompat = numPlaybackStateCompatCustomAction6 != null ? numPlaybackStateCompatCustomAction6.intValue() : 0;
                                    break;
                                case "encoding":
                                    String strComponentActivity2 = getsecondarg.ComponentActivity();
                                    if (strComponentActivity2 == null) {
                                        strComponentActivity2 = "";
                                    }
                                    componentActivity.RemoteActionCompatParcelizer = strComponentActivity2;
                                    break;
                                case "frameRateType":
                                    String strComponentActivity3 = getsecondarg.ComponentActivity();
                                    if (strComponentActivity3 == null) {
                                        strComponentActivity3 = "";
                                    }
                                    componentActivity.RatingCompat = strComponentActivity3;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap2, strPlaybackStateCompat3);
                                    break;
                            }
                        }
                        componentActivity.MediaSessionCompatQueueItem = concurrentHashMap2;
                        getsecondarg.serializer();
                    } else if (strPlaybackStateCompat2.equals(RemoteMessageConst.Notification.TAG)) {
                        String strComponentActivity4 = getsecondarg.ComponentActivity();
                        componentActivity.ParcelableVolumeInfo = strComponentActivity4 != null ? strComponentActivity4 : "";
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat2);
                    }
                }
                componentActivity.read = concurrentHashMap;
                getsecondarg.serializer();
            } else if (!write.read(componentActivity, strPlaybackStateCompat, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                if (map == null) {
                    map = new HashMap();
                }
                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat);
            }
        }
        componentActivity.ComponentActivity = map;
        getsecondarg.serializer();
        return componentActivity;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    public static PlaybackStateCompatCustomAction MediaSessionCompatQueueItem(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        byte b;
        getsecondarg.write();
        PlaybackStateCompatCustomAction playbackStateCompatCustomAction = new PlaybackStateCompatCustomAction();
        HashMap map = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            if (!strPlaybackStateCompat.equals(RemoteMessageConst.DATA)) {
                if (!write.read(playbackStateCompatCustomAction, strPlaybackStateCompat, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat);
                }
            } else {
                getsecondarg.write();
                ConcurrentHashMap concurrentHashMap = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    if (strPlaybackStateCompat2.equals("payload")) {
                        getsecondarg.write();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                            String strPlaybackStateCompat3 = getsecondarg.PlaybackStateCompat();
                            strPlaybackStateCompat3.getClass();
                            switch (strPlaybackStateCompat3) {
                                case "description":
                                    b = 0;
                                    break;
                                case "endTimestamp":
                                    b = 1;
                                    break;
                                case "startTimestamp":
                                    b = 2;
                                    break;
                                case "op":
                                    b = 3;
                                    break;
                                case "data":
                                    b = 4;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            if (b == 0) {
                                playbackStateCompatCustomAction.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                            } else if (b == 1) {
                                playbackStateCompatCustomAction.IconCompatParcelizer = getsecondarg.MediaBrowserCompatMediaItem();
                            } else if (b == 2) {
                                playbackStateCompatCustomAction.MediaMetadataCompat = getsecondarg.MediaBrowserCompatMediaItem();
                            } else if (b == 3) {
                                playbackStateCompatCustomAction.read = getsecondarg.ComponentActivity();
                            } else if (b != 4) {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap2, strPlaybackStateCompat3);
                            } else {
                                ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                                if (concurrentHashMapRemoteActionCompatParcelizer != null) {
                                    playbackStateCompatCustomAction.serializer = concurrentHashMapRemoteActionCompatParcelizer;
                                }
                            }
                        }
                        playbackStateCompatCustomAction.RatingCompat = concurrentHashMap2;
                        getsecondarg.serializer();
                    } else if (!strPlaybackStateCompat2.equals(RemoteMessageConst.Notification.TAG)) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat2);
                    } else {
                        String strComponentActivity = getsecondarg.ComponentActivity();
                        if (strComponentActivity == null) {
                            strComponentActivity = "";
                        }
                        playbackStateCompatCustomAction.MediaDescriptionCompat = strComponentActivity;
                    }
                }
                playbackStateCompatCustomAction.write = concurrentHashMap;
                getsecondarg.serializer();
            }
        }
        playbackStateCompatCustomAction.MediaSessionCompatQueueItem = map;
        getsecondarg.serializer();
        return playbackStateCompatCustomAction;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    public static MediaBrowserCompatMediaItem serializer(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        byte b;
        getsecondarg.write();
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new MediaBrowserCompatMediaItem();
        HashMap map = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            if (!strPlaybackStateCompat.equals(RemoteMessageConst.DATA)) {
                if (!write.read(mediaBrowserCompatMediaItem, strPlaybackStateCompat, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat);
                }
            } else {
                getsecondarg.write();
                HashMap map2 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    int iHashCode = strPlaybackStateCompat2.hashCode();
                    if (iHashCode != 120) {
                        if (iHashCode != 121) {
                            if (iHashCode != 3355) {
                                if (iHashCode != 3575610) {
                                    if (iHashCode != 768858903) {
                                        if (iHashCode == 1565043768 && strPlaybackStateCompat2.equals("pointerId")) {
                                            b = 5;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strPlaybackStateCompat2.equals("pointerType")) {
                                        b = 4;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strPlaybackStateCompat2.equals("type")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                            } else if (strPlaybackStateCompat2.equals("id")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strPlaybackStateCompat2.equals("y")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strPlaybackStateCompat2.equals("x")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        mediaBrowserCompatMediaItem.MediaDescriptionCompat = getsecondarg.MediaDescriptionCompat();
                    } else if (b == 1) {
                        mediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem = getsecondarg.MediaDescriptionCompat();
                    } else if (b == 2) {
                        mediaBrowserCompatMediaItem.IconCompatParcelizer = getsecondarg.MediaSessionCompatResultReceiverWrapper();
                    } else if (b == 3) {
                        mediaBrowserCompatMediaItem.serializer = (MediaSessionCompatQueueItem) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(8));
                    } else if (b == 4) {
                        mediaBrowserCompatMediaItem.RatingCompat = getsecondarg.MediaSessionCompatResultReceiverWrapper();
                    } else if (b != 5) {
                        if (!component10.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem, strPlaybackStateCompat2, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map2, strPlaybackStateCompat2);
                        }
                    } else {
                        mediaBrowserCompatMediaItem.write = getsecondarg.MediaSessionCompatResultReceiverWrapper();
                    }
                }
                mediaBrowserCompatMediaItem.read = map2;
                getsecondarg.serializer();
            }
        }
        mediaBrowserCompatMediaItem.MediaSessionCompatQueueItem = map;
        getsecondarg.serializer();
        return mediaBrowserCompatMediaItem;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    public static serializer read(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        byte b;
        getsecondarg.write();
        serializer serializerVar = new serializer();
        HashMap map = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            if (!strPlaybackStateCompat.equals(RemoteMessageConst.DATA)) {
                if (!write.read(serializerVar, strPlaybackStateCompat, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat);
                }
            } else {
                getsecondarg.write();
                ConcurrentHashMap concurrentHashMap = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    if (strPlaybackStateCompat2.equals("payload")) {
                        getsecondarg.write();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                            String strPlaybackStateCompat3 = getsecondarg.PlaybackStateCompat();
                            strPlaybackStateCompat3.getClass();
                            switch (strPlaybackStateCompat3) {
                                case "data":
                                    b = 0;
                                    break;
                                case "type":
                                    b = 1;
                                    break;
                                case "category":
                                    b = 2;
                                    break;
                                case "timestamp":
                                    b = 3;
                                    break;
                                case "level":
                                    b = 4;
                                    break;
                                case "message":
                                    b = 5;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            if (b == 0) {
                                ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                                if (concurrentHashMapRemoteActionCompatParcelizer != null) {
                                    serializerVar.read = concurrentHashMapRemoteActionCompatParcelizer;
                                }
                            } else if (b == 1) {
                                serializerVar.write = getsecondarg.ComponentActivity();
                            } else if (b == 2) {
                                serializerVar.serializer = getsecondarg.ComponentActivity();
                            } else if (b == 3) {
                                serializerVar.RemoteActionCompatParcelizer = getsecondarg.MediaBrowserCompatMediaItem();
                            } else if (b == 4) {
                                try {
                                    serializerVar.MediaMetadataCompat = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.valueOf(getsecondarg.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().toUpperCase(Locale.ROOT));
                                } catch (Exception e) {
                                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                                }
                            } else if (b != 5) {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap2, strPlaybackStateCompat3);
                            } else {
                                serializerVar.RatingCompat = getsecondarg.ComponentActivity();
                            }
                        }
                        serializerVar.MediaSessionCompatQueueItem = concurrentHashMap2;
                        getsecondarg.serializer();
                    } else if (!strPlaybackStateCompat2.equals(RemoteMessageConst.Notification.TAG)) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat2);
                    } else {
                        String strComponentActivity = getsecondarg.ComponentActivity();
                        if (strComponentActivity == null) {
                            strComponentActivity = "";
                        }
                        serializerVar.MediaBrowserCompatMediaItem = strComponentActivity;
                    }
                }
                serializerVar.IconCompatParcelizer = concurrentHashMap;
                getsecondarg.serializer();
            }
        }
        serializerVar.MediaDescriptionCompat = map;
        getsecondarg.serializer();
        return serializerVar;
    }

    public static MediaSessionCompatToken RemoteActionCompatParcelizer(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        getsecondarg.write();
        MediaSessionCompatToken mediaSessionCompatToken = new MediaSessionCompatToken();
        HashMap map = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            if (!strPlaybackStateCompat.equals(RemoteMessageConst.DATA)) {
                if (!write.read(mediaSessionCompatToken, strPlaybackStateCompat, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat);
                }
            } else {
                getsecondarg.write();
                HashMap map2 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    if (strPlaybackStateCompat2.equals("pointerId")) {
                        mediaSessionCompatToken.serializer = getsecondarg.MediaSessionCompatResultReceiverWrapper();
                    } else if (!strPlaybackStateCompat2.equals("positions")) {
                        if (!component10.RemoteActionCompatParcelizer(mediaSessionCompatToken, strPlaybackStateCompat2, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map2, strPlaybackStateCompat2);
                        }
                    } else {
                        mediaSessionCompatToken.IconCompatParcelizer = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(9));
                    }
                }
                mediaSessionCompatToken.read = map2;
                getsecondarg.serializer();
            }
        }
        mediaSessionCompatToken.write = map;
        getsecondarg.serializer();
        return mediaSessionCompatToken;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    @Override // o.IBrazeActionStep
    public final Object write(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        int i = 2;
        String strComponentActivity = null;
        HashMap map = null;
        switch (this.IconCompatParcelizer) {
            case 0:
                return RemoteActionCompatParcelizer.values()[getsecondarg.MediaSessionCompatResultReceiverWrapper()];
            case 1:
                getsecondarg.write();
                ArrayList arrayListWrite = null;
                HashMap map2 = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat.getClass();
                    if (strPlaybackStateCompat.equals("rendering_system")) {
                        strComponentActivity = getsecondarg.ComponentActivity();
                    } else if (!strPlaybackStateCompat.equals("windows")) {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map2, strPlaybackStateCompat);
                    } else {
                        arrayListWrite = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new RatingCompat(i));
                    }
                }
                getsecondarg.serializer();
                createFullyDrawnExecutor createfullydrawnexecutor = new createFullyDrawnExecutor(strComponentActivity, arrayListWrite);
                createfullydrawnexecutor.read = map2;
                return createfullydrawnexecutor;
            case 2:
                fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00 = new fullyDrawnReporter_delegatelambda00();
                getsecondarg.write();
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    switch (strPlaybackStateCompat2) {
                        case "rendering_system":
                            fullydrawnreporter_delegatelambda00.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                            break;
                        case "identifier":
                            fullydrawnreporter_delegatelambda00.write = getsecondarg.ComponentActivity();
                            break;
                        case "height":
                            fullydrawnreporter_delegatelambda00.read = getsecondarg.MediaSessionCompatQueueItem();
                            break;
                        case "x":
                            fullydrawnreporter_delegatelambda00.ParcelableVolumeInfo = getsecondarg.MediaSessionCompatQueueItem();
                            break;
                        case "y":
                            fullydrawnreporter_delegatelambda00.MediaSessionCompatToken = getsecondarg.MediaSessionCompatQueueItem();
                            break;
                        case "tag":
                            fullydrawnreporter_delegatelambda00.MediaDescriptionCompat = getsecondarg.ComponentActivity();
                            break;
                        case "type":
                            fullydrawnreporter_delegatelambda00.RatingCompat = getsecondarg.ComponentActivity();
                            break;
                        case "alpha":
                            fullydrawnreporter_delegatelambda00.serializer = getsecondarg.MediaSessionCompatQueueItem();
                            break;
                        case "width":
                            fullydrawnreporter_delegatelambda00.MediaBrowserCompatMediaItem = getsecondarg.MediaSessionCompatQueueItem();
                            break;
                        case "children":
                            fullydrawnreporter_delegatelambda00.IconCompatParcelizer = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, this);
                            break;
                        case "visibility":
                            fullydrawnreporter_delegatelambda00.MediaSessionCompatQueueItem = getsecondarg.ComponentActivity();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat2);
                            break;
                    }
                }
                getsecondarg.serializer();
                fullydrawnreporter_delegatelambda00.MediaMetadataCompat = map;
                return fullydrawnreporter_delegatelambda00;
            case 3:
                return read(getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 4:
                return serializer(getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 5:
                return RemoteActionCompatParcelizer(getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 6:
                return IconCompatParcelizer(getsecondarg, brazeActionParserExternalSyntheticLambda0);
            case 7:
                return MediaSessionCompatQueueItem(getsecondarg, brazeActionParserExternalSyntheticLambda0);
            default:
                return MediaDescriptionCompat(getsecondarg, brazeActionParserExternalSyntheticLambda0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    public static MediaSessionCompatResultReceiverWrapper IconCompatParcelizer(getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        byte b;
        getsecondarg.write();
        MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper = new MediaSessionCompatResultReceiverWrapper();
        HashMap map = null;
        while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
            String strPlaybackStateCompat = getsecondarg.PlaybackStateCompat();
            strPlaybackStateCompat.getClass();
            if (!strPlaybackStateCompat.equals(RemoteMessageConst.DATA)) {
                if (!write.read(mediaSessionCompatResultReceiverWrapper, strPlaybackStateCompat, getsecondarg, brazeActionParserExternalSyntheticLambda0)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    getsecondarg.write(brazeActionParserExternalSyntheticLambda0, map, strPlaybackStateCompat);
                }
            } else {
                getsecondarg.write();
                AbstractMap concurrentHashMap = null;
                while (getsecondarg.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    String strPlaybackStateCompat2 = getsecondarg.PlaybackStateCompat();
                    strPlaybackStateCompat2.getClass();
                    int iHashCode = strPlaybackStateCompat2.hashCode();
                    if (iHashCode != -1221029593) {
                        if (iHashCode != 3211051) {
                            if (iHashCode == 113126854 && strPlaybackStateCompat2.equals("width")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strPlaybackStateCompat2.equals("href")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strPlaybackStateCompat2.equals("height")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        Integer numPlaybackStateCompatCustomAction = getsecondarg.PlaybackStateCompatCustomAction();
                        mediaSessionCompatResultReceiverWrapper.serializer = numPlaybackStateCompatCustomAction != null ? numPlaybackStateCompatCustomAction.intValue() : 0;
                    } else if (b == 1) {
                        String strComponentActivity = getsecondarg.ComponentActivity();
                        if (strComponentActivity == null) {
                            strComponentActivity = "";
                        }
                        mediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer = strComponentActivity;
                    } else if (b != 2) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        getsecondarg.write(brazeActionParserExternalSyntheticLambda0, concurrentHashMap, strPlaybackStateCompat2);
                    } else {
                        Integer numPlaybackStateCompatCustomAction2 = getsecondarg.PlaybackStateCompatCustomAction();
                        mediaSessionCompatResultReceiverWrapper.read = numPlaybackStateCompatCustomAction2 != null ? numPlaybackStateCompatCustomAction2.intValue() : 0;
                    }
                }
                getsecondarg.serializer();
            }
        }
        mediaSessionCompatResultReceiverWrapper.IconCompatParcelizer = map;
        getsecondarg.serializer();
        return mediaSessionCompatResultReceiverWrapper;
    }
}
