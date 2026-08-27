package o;

import com.mapbox.common.HttpHeaders;
import io.grpc.Status;
import io.sentry.MovePreviousSession;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda4JvXn8cf5aij3slyZU_izDVcP_4 {
    public static final ReflectionUtils IconCompatParcelizer;
    public static final long MediaBrowserCompatMediaItem;
    public static final constructObjectQuietlylambda0 MediaDescriptionCompat;
    public static final ReflectionUtils MediaMetadataCompat;
    public static final ReflectionUtils MediaSessionCompatResultReceiverWrapper;
    public static final WebContentUtils MediaSessionCompatToken;
    public static final WebContentUtils ParcelableVolumeInfo;
    public static final r8lambdaAav62xW_IYtPevqtIsBJqr4XKiU PlaybackStateCompat;
    public static final ReflectionUtils PlaybackStateCompatCustomAction;
    public static final handleUrlOverride RatingCompat;
    public static final ReflectionUtils RemoteActionCompatParcelizer;
    public static final ReflectionUtils r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final WebContentUtils r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public static final constructObjectQuietlylambda0 read;
    public static final ReflectionUtils serializer;
    public static final mergeJsonObjectslambda00 write;
    public static final java.util.logging.Logger ResultReceiver = java.util.logging.Logger.getLogger(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.class.getName());
    public static final Set MediaSessionCompatQueueItem = Collections.unmodifiableSet(EnumSet.of(invokeMethodQuietly.OK, invokeMethodQuietly.INVALID_ARGUMENT, invokeMethodQuietly.NOT_FOUND, invokeMethodQuietly.ALREADY_EXISTS, invokeMethodQuietly.FAILED_PRECONDITION, invokeMethodQuietly.ABORTED, invokeMethodQuietly.OUT_OF_RANGE, invokeMethodQuietly.DATA_LOSS));

    static {
        Charset.forName("US-ASCII");
        MediaSessionCompatResultReceiverWrapper = new ReflectionUtils("grpc-timeout", new WebContentUtils(12));
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA.IconCompatParcelizer;
        MediaMetadataCompat = new ReflectionUtils("grpc-encoding", r8lambdakctilwmporjfcawe8asdqv1ks);
        int i = 11;
        MediaDescriptionCompat = requestPushPermissionPrompt.RemoteActionCompatParcelizer("grpc-accept-encoding", new WebContentUtils(i));
        serializer = new ReflectionUtils(HttpHeaders.CONTENT_ENCODING, r8lambdakctilwmporjfcawe8asdqv1ks);
        read = requestPushPermissionPrompt.RemoteActionCompatParcelizer("accept-encoding", new WebContentUtils(i));
        IconCompatParcelizer = new ReflectionUtils("content-length", r8lambdakctilwmporjfcawe8asdqv1ks);
        RemoteActionCompatParcelizer = new ReflectionUtils("content-type", r8lambdakctilwmporjfcawe8asdqv1ks);
        PlaybackStateCompatCustomAction = new ReflectionUtils("te", r8lambdakctilwmporjfcawe8asdqv1ks);
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ReflectionUtils(HttpHeaders.USER_AGENT, r8lambdakctilwmporjfcawe8asdqv1ks);
        visitSelfAndAncestors5BbP62I.RemoteActionCompatParcelizer.getClass();
        MediaBrowserCompatMediaItem = 20000000000L;
        RatingCompat = new handleUrlOverride();
        int i2 = 0;
        write = new mergeJsonObjectslambda00("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", i2);
        PlaybackStateCompat = new r8lambdaAav62xW_IYtPevqtIsBJqr4XKiU();
        ParcelableVolumeInfo = new WebContentUtils(i2);
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new WebContentUtils(9);
        MediaSessionCompatToken = new WebContentUtils(10);
    }

    public static r8lambdaHMza2HwvD2qpEDNMeHrXqzjzano RemoteActionCompatParcelizer(wouldPushPermissionPromptDisplaylambda0 wouldpushpermissionpromptdisplaylambda0, boolean z) {
        getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda2;
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 = wouldpushpermissionpromptdisplaylambda0.write;
        Status status = wouldpushpermissionpromptdisplaylambda0.RemoteActionCompatParcelizer;
        if (jsonUtilsExternalSyntheticLambda1 == null) {
            getlocalhtmlurlfromremoteurllambda2 = null;
        } else {
            r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) jsonUtilsExternalSyntheticLambda1.MediaBrowserCompatMediaItem();
            getlocalhtmlurlfromremoteurllambda2 = r8lambday78ccsnuxer22a2wvqifr2bmbdo.IconCompatParcelizer;
            if (getlocalhtmlurlfromremoteurllambda2 == null) {
                r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.execute(new MovePreviousSession(13, r8lambday78ccsnuxer22a2wvqifr2bmbdo));
                getlocalhtmlurlfromremoteurllambda2 = null;
            }
        }
        if (getlocalhtmlurlfromremoteurllambda2 != null) {
            JsonUtilsd jsonUtilsd = wouldpushpermissionpromptdisplaylambda0.read;
            return jsonUtilsd == null ? getlocalhtmlurlfromremoteurllambda2 : new getVALID_CURRENCY_CODES(jsonUtilsd, getlocalhtmlurlfromremoteurllambda2);
        }
        if (!status.IconCompatParcelizer()) {
            if (wouldpushpermissionpromptdisplaylambda0.serializer) {
                return new getVALID_CURRENCY_CODES(RemoteActionCompatParcelizer(status), r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.DROPPED);
            }
            if (!z) {
                return new getVALID_CURRENCY_CODES(RemoteActionCompatParcelizer(status), r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.PROCESSED);
            }
        }
        return null;
    }

    public static JsonUtilsExternalSyntheticLambda1[] read(mergeJsonObjectslambda10 mergejsonobjectslambda10, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa, int i, boolean z) {
        List list = mergejsonobjectslambda10.MediaDescriptionCompat;
        int size = list.size();
        JsonUtilsExternalSyntheticLambda1[] jsonUtilsExternalSyntheticLambda1Arr = new JsonUtilsExternalSyntheticLambda1[size + 1];
        mergeJsonObjectslambda10 mergejsonobjectslambda11 = mergeJsonObjectslambda10.RemoteActionCompatParcelizer;
        JsonUtilsc jsonUtilsc = new JsonUtilsc(mergejsonobjectslambda10, i, z);
        for (int i2 = 0; i2 < list.size(); i2++) {
            jsonUtilsExternalSyntheticLambda1Arr[i2] = ((JsonUtilsd) list.get(i2)).RemoteActionCompatParcelizer(jsonUtilsc, r8lambdaqn1du6uas6agx4srbugfttxtpwa);
        }
        jsonUtilsExternalSyntheticLambda1Arr[size] = PlaybackStateCompat;
        return jsonUtilsExternalSyntheticLambda1Arr;
    }

    public static URI write(String str) {
        TextStreamsKt.serializer(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid authority: ".concat(str), e);
        }
    }

    public static String IconCompatParcelizer(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static Status RemoteActionCompatParcelizer(Status status) {
        TextStreamsKt.write(status != null);
        if (!MediaSessionCompatQueueItem.contains(status.PlaybackStateCompat)) {
            return status;
        }
        return Status.write.IconCompatParcelizer("Inappropriate status code from control plane: " + status.PlaybackStateCompat + " " + status.ComponentActivity).RemoteActionCompatParcelizer(status.MediaSessionCompatToken);
    }

    public static void serializer(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            ResultReceiver.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e);
        }
    }

    public static accessgetDistanceFromEdgeAndFlagsp IconCompatParcelizer(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(java.util.Locale.ROOT, str, 0);
        return new accessgetDistanceFromEdgeAndFlagsp(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    public static Status RemoteActionCompatParcelizer(int i) {
        invokeMethodQuietly invokemethodquietly;
        if ((i >= 100 && i < 200) || i == 400) {
            invokemethodquietly = invokeMethodQuietly.INTERNAL;
        } else if (i == 401) {
            invokemethodquietly = invokeMethodQuietly.UNAUTHENTICATED;
        } else if (i == 403) {
            invokemethodquietly = invokeMethodQuietly.PERMISSION_DENIED;
        } else if (i == 404) {
            invokemethodquietly = invokeMethodQuietly.UNIMPLEMENTED;
        } else if (i == 429) {
            invokemethodquietly = invokeMethodQuietly.UNAVAILABLE;
        } else if (i != 431) {
            switch (i) {
                case 502:
                case 503:
                case 504:
                    invokemethodquietly = invokeMethodQuietly.UNAVAILABLE;
                    break;
                default:
                    invokemethodquietly = invokeMethodQuietly.UNKNOWN;
                    break;
            }
        } else {
            invokemethodquietly = invokeMethodQuietly.INTERNAL;
        }
        return invokemethodquietly.toStatus().IconCompatParcelizer("HTTP status code " + i);
    }
}
