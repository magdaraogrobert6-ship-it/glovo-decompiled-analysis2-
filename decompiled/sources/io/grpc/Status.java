package io.grpc;

import bo.app.af$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.braze.Constants;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;
import o.constructObjectQuietlylambda0;
import o.invokeMethodQuietly;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdakcTilwmporjFCAWe8ASdQv1Ks;
import o.requireView;

/* JADX INFO: loaded from: classes4.dex */
public final class Status {
    public static final Status IconCompatParcelizer;
    public static final constructObjectQuietlylambda0 MediaBrowserCompatMediaItem;
    public static final List MediaDescriptionCompat;
    public static final Status MediaMetadataCompat;
    public static final Status MediaSessionCompatQueueItem;
    public static final Status MediaSessionCompatResultReceiverWrapper;
    public static final Status ParcelableVolumeInfo;
    public static final Status PlaybackStateCompatCustomAction;
    public static final Status RatingCompat;
    public static final Status RemoteActionCompatParcelizer;
    public static final Status read;
    public static final constructObjectQuietlylambda0 serializer;
    public static final Status write;
    public final String ComponentActivity;
    public final Throwable MediaSessionCompatToken;
    public final invokeMethodQuietly PlaybackStateCompat;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (invokeMethodQuietly invokemethodquietly : invokeMethodQuietly.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(invokemethodquietly.value()), new Status(invokemethodquietly, null, null));
            if (status != null) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Code value duplication between ", status.PlaybackStateCompat.name(), " & ", invokemethodquietly.name());
                return;
            }
        }
        MediaDescriptionCompat = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        RatingCompat = invokeMethodQuietly.OK.toStatus();
        RemoteActionCompatParcelizer = invokeMethodQuietly.CANCELLED.toStatus();
        ParcelableVolumeInfo = invokeMethodQuietly.UNKNOWN.toStatus();
        invokeMethodQuietly.INVALID_ARGUMENT.toStatus();
        read = invokeMethodQuietly.DEADLINE_EXCEEDED.toStatus();
        invokeMethodQuietly.NOT_FOUND.toStatus();
        invokeMethodQuietly.ALREADY_EXISTS.toStatus();
        MediaMetadataCompat = invokeMethodQuietly.PERMISSION_DENIED.toStatus();
        PlaybackStateCompatCustomAction = invokeMethodQuietly.UNAUTHENTICATED.toStatus();
        MediaSessionCompatQueueItem = invokeMethodQuietly.RESOURCE_EXHAUSTED.toStatus();
        IconCompatParcelizer = invokeMethodQuietly.FAILED_PRECONDITION.toStatus();
        invokeMethodQuietly.ABORTED.toStatus();
        invokeMethodQuietly.OUT_OF_RANGE.toStatus();
        invokeMethodQuietly.UNIMPLEMENTED.toStatus();
        write = invokeMethodQuietly.INTERNAL.toStatus();
        MediaSessionCompatResultReceiverWrapper = invokeMethodQuietly.UNAVAILABLE.toStatus();
        invokeMethodQuietly.DATA_LOSS.toStatus();
        serializer = new constructObjectQuietlylambda0("grpc-status", false, new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(10));
        MediaBrowserCompatMediaItem = new constructObjectQuietlylambda0("grpc-message", false, new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(2));
    }

    public static Status serializer(int i) {
        if (i >= 0) {
            List list = MediaDescriptionCompat;
            if (i < list.size()) {
                return (Status) list.get(i);
            }
        }
        return ParcelableVolumeInfo.IconCompatParcelizer("Unknown code " + i);
    }

    public static String serializer(Status status) {
        String str = status.ComponentActivity;
        invokeMethodQuietly invokemethodquietly = status.PlaybackStateCompat;
        if (str == null) {
            return invokemethodquietly.toString();
        }
        return invokemethodquietly + ": " + status.ComponentActivity;
    }

    public final Status IconCompatParcelizer(String str) {
        return TuplesKt.RemoteActionCompatParcelizer(this.ComponentActivity, str) ? this : new Status(this.PlaybackStateCompat, str, this.MediaSessionCompatToken);
    }

    public final boolean IconCompatParcelizer() {
        return invokeMethodQuietly.OK == this.PlaybackStateCompat;
    }

    public final Status RemoteActionCompatParcelizer(Throwable th) {
        return TuplesKt.RemoteActionCompatParcelizer(this.MediaSessionCompatToken, th) ? this : new Status(this.PlaybackStateCompat, this.ComponentActivity, th);
    }

    public final Status read(String str) {
        Throwable th = this.MediaSessionCompatToken;
        String str2 = this.ComponentActivity;
        invokeMethodQuietly invokemethodquietly = this.PlaybackStateCompat;
        return str2 == null ? new Status(invokemethodquietly, str, th) : new Status(invokemethodquietly, af$$ExternalSyntheticOutline0.m(str2, "\n", str), th);
    }

    public static Status IconCompatParcelizer(Throwable th) {
        TextStreamsKt.serializer(th, Constants.BRAZE_PUSH_TITLE_KEY);
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException) cause).RemoteActionCompatParcelizer;
            }
            if (cause instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) cause).RemoteActionCompatParcelizer;
            }
        }
        return ParcelableVolumeInfo.RemoteActionCompatParcelizer(th);
    }

    public final StatusRuntimeException RemoteActionCompatParcelizer() {
        return new StatusRuntimeException(this, null);
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) this.PlaybackStateCompat.name(), "code");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) this.ComponentActivity, "description");
        Throwable th = this.MediaSessionCompatToken;
        Object objSerializer = th;
        if (th != null) {
            objSerializer = requireView.serializer(th);
        }
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(objSerializer, "cause");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public Status(invokeMethodQuietly invokemethodquietly, String str, Throwable th) {
        TextStreamsKt.serializer(invokemethodquietly, "code");
        this.PlaybackStateCompat = invokemethodquietly;
        this.ComponentActivity = str;
        this.MediaSessionCompatToken = th;
    }
}
