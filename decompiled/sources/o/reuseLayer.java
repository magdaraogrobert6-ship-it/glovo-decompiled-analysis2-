package o;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.stats.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.protobuf.GeneratedMessageLite;
import com.huawei.location.logic.zp;
import io.grpc.Status;
import io.sentry.SentryClient;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashSet;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class reuseLayer {
    public final incrementSensitiveComponentCount MediaBrowserCompatMediaItem;
    public final incrementSensitiveComponentCount MediaMetadataCompat;
    public final getAutofill MediaSessionCompatQueueItem;
    public final getTextInputService MediaSessionCompatResultReceiverWrapper;
    public final SentryClient ParcelableVolumeInfo;
    public com.huawei.wisesecurity.ucs_credential.x RatingCompat;
    public calculatePositionInWindowMKHz9U RemoteActionCompatParcelizer;
    public final onInteropViewLayoutChange read;
    public com.huawei.wisesecurity.ucs_credential.x serializer;
    public final calculateLocalPositionMKHz9U write;
    public decrementKeepScreenOnCount MediaSessionCompatToken = decrementKeepScreenOnCount.Initial;
    public long IconCompatParcelizer = 0;
    public final zza MediaDescriptionCompat = new zza(28, this);

    public void read() {
    }

    public abstract void read(Object obj);

    public abstract void serializer(Object obj);

    public final boolean IconCompatParcelizer() {
        this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        decrementKeepScreenOnCount decrementkeepscreenoncount = this.MediaSessionCompatToken;
        return decrementkeepscreenoncount == decrementKeepScreenOnCount.Starting || decrementkeepscreenoncount == decrementKeepScreenOnCount.Backoff || serializer();
    }

    public void RemoteActionCompatParcelizer() {
        this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        getRectManager.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer == null, "Last call still set", new Object[0]);
        getRectManager.RemoteActionCompatParcelizer(this.RatingCompat == null, "Idle timer still set", new Object[0]);
        decrementKeepScreenOnCount decrementkeepscreenoncount = this.MediaSessionCompatToken;
        decrementKeepScreenOnCount decrementkeepscreenoncount2 = decrementKeepScreenOnCount.Error;
        if (decrementkeepscreenoncount != decrementkeepscreenoncount2) {
            getRectManager.RemoteActionCompatParcelizer(decrementkeepscreenoncount == decrementKeepScreenOnCount.Initial, "Already started", new Object[0]);
            zp zpVar = new zp(this, new resizeGraphicFrameIfAppropriatelambda0(this.IconCompatParcelizer, 7, this));
            JsonUtilsa[] jsonUtilsaArr = {null};
            calculateLocalPositionMKHz9U calculatelocalpositionmkhz9u = this.write;
            androidx.lifecycle.BlockRunner blockRunner = calculatelocalpositionmkhz9u.MediaDescriptionCompat;
            Task taskContinueWithTask = ((zzw) blockRunner.read).continueWithTask(((getTextInputService) blockRunner.serializer).RemoteActionCompatParcelizer, new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(blockRunner, 20, this.ParcelableVolumeInfo));
            taskContinueWithTask.addOnCompleteListener(calculatelocalpositionmkhz9u.MediaMetadataCompat.RemoteActionCompatParcelizer, new PreviewView$1$$ExternalSyntheticLambda2(calculatelocalpositionmkhz9u, jsonUtilsaArr, zpVar, 14));
            this.RemoteActionCompatParcelizer = new calculatePositionInWindowMKHz9U(calculatelocalpositionmkhz9u, jsonUtilsaArr, taskContinueWithTask);
            this.MediaSessionCompatToken = decrementKeepScreenOnCount.Starting;
            return;
        }
        getRectManager.RemoteActionCompatParcelizer(decrementkeepscreenoncount == decrementkeepscreenoncount2, "Should only perform backoff in an error state", new Object[0]);
        this.MediaSessionCompatToken = decrementKeepScreenOnCount.Backoff;
        movegyyYBs movegyyybs = new movegyyYBs(this, 0);
        onInteropViewLayoutChange oninteropviewlayoutchange = this.read;
        com.huawei.wisesecurity.ucs_credential.x xVar = oninteropviewlayoutchange.MediaDescriptionCompat;
        if (xVar != null) {
            xVar.cancel();
            oninteropviewlayoutchange.MediaDescriptionCompat = null;
        }
        long jRandom = oninteropviewlayoutchange.RemoteActionCompatParcelizer + ((long) ((Math.random() - 0.5d) * oninteropviewlayoutchange.RemoteActionCompatParcelizer));
        long jMax = Math.max(0L, new Date().getTime() - oninteropviewlayoutchange.write);
        long jMax2 = Math.max(0L, jRandom - jMax);
        if (oninteropviewlayoutchange.RemoteActionCompatParcelizer > 0) {
            onEndApplyChanges.read("ExponentialBackoff", "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(jMax2), Long.valueOf(oninteropviewlayoutchange.RemoteActionCompatParcelizer), Long.valueOf(jRandom), Long.valueOf(jMax));
        }
        oninteropviewlayoutchange.MediaDescriptionCompat = oninteropviewlayoutchange.read.serializer(oninteropviewlayoutchange.serializer, jMax2, new w4$$ExternalSyntheticLambda0(oninteropviewlayoutchange, 23, movegyyybs));
        long j = (long) (oninteropviewlayoutchange.RemoteActionCompatParcelizer * 1.5d);
        oninteropviewlayoutchange.RemoteActionCompatParcelizer = j;
        if (j < 1000) {
            oninteropviewlayoutchange.RemoteActionCompatParcelizer = 1000L;
        } else {
            long j2 = oninteropviewlayoutchange.IconCompatParcelizer;
            if (j > j2) {
                oninteropviewlayoutchange.RemoteActionCompatParcelizer = j2;
            }
        }
        oninteropviewlayoutchange.IconCompatParcelizer = 60000L;
    }

    public final void read(GeneratedMessageLite generatedMessageLite) {
        this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        onEndApplyChanges.read(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), generatedMessageLite);
        com.huawei.wisesecurity.ucs_credential.x xVar = this.RatingCompat;
        if (xVar != null) {
            xVar.cancel();
            this.RatingCompat = null;
        }
        this.RemoteActionCompatParcelizer.read(generatedMessageLite);
    }

    public final boolean serializer() {
        this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        decrementKeepScreenOnCount decrementkeepscreenoncount = this.MediaSessionCompatToken;
        return decrementkeepscreenoncount == decrementKeepScreenOnCount.Open || decrementkeepscreenoncount == decrementKeepScreenOnCount.Healthy;
    }

    public final void write(decrementKeepScreenOnCount decrementkeepscreenoncount, Status status) {
        onInteropViewLayoutChange oninteropviewlayoutchange = this.read;
        getRectManager.RemoteActionCompatParcelizer(IconCompatParcelizer(), "Only started streams should be closed.", new Object[0]);
        decrementKeepScreenOnCount decrementkeepscreenoncount2 = decrementKeepScreenOnCount.Error;
        getRectManager.RemoteActionCompatParcelizer(decrementkeepscreenoncount == decrementkeepscreenoncount2 || status.IconCompatParcelizer(), "Can't provide an error when not in an error state.", new Object[0]);
        this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        HashSet hashSet = updateDisplayList.write;
        status.getClass();
        Throwable th = status.MediaSessionCompatToken;
        if (th instanceof SSLHandshakeException) {
            th.getMessage().contains("no ciphers available");
        }
        com.huawei.wisesecurity.ucs_credential.x xVar = this.RatingCompat;
        if (xVar != null) {
            xVar.cancel();
            this.RatingCompat = null;
        }
        com.huawei.wisesecurity.ucs_credential.x xVar2 = this.serializer;
        if (xVar2 != null) {
            xVar2.cancel();
            this.serializer = null;
        }
        com.huawei.wisesecurity.ucs_credential.x xVar3 = oninteropviewlayoutchange.MediaDescriptionCompat;
        if (xVar3 != null) {
            xVar3.cancel();
            oninteropviewlayoutchange.MediaDescriptionCompat = null;
        }
        this.IconCompatParcelizer++;
        invokeMethodQuietly invokemethodquietly = status.PlaybackStateCompat;
        if (invokemethodquietly == invokeMethodQuietly.OK) {
            oninteropviewlayoutchange.RemoteActionCompatParcelizer = 0L;
        } else if (invokemethodquietly == invokeMethodQuietly.RESOURCE_EXHAUSTED) {
            onEndApplyChanges.read(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            oninteropviewlayoutchange.RemoteActionCompatParcelizer = oninteropviewlayoutchange.IconCompatParcelizer;
        } else if (invokemethodquietly == invokeMethodQuietly.UNAUTHENTICATED && this.MediaSessionCompatToken != decrementKeepScreenOnCount.Healthy) {
            calculateLocalPositionMKHz9U calculatelocalpositionmkhz9u = this.write;
            synchronized (calculatelocalpositionmkhz9u.MediaSessionCompatQueueItem) {
            }
            synchronized (calculatelocalpositionmkhz9u.RemoteActionCompatParcelizer) {
            }
        } else if (invokemethodquietly == invokeMethodQuietly.UNAVAILABLE && ((th instanceof UnknownHostException) || (th instanceof ConnectException))) {
            oninteropviewlayoutchange.IconCompatParcelizer = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
        }
        if (decrementkeepscreenoncount != decrementkeepscreenoncount2) {
            onEndApplyChanges.read(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            read();
        }
        if (this.RemoteActionCompatParcelizer != null) {
            if (status.IconCompatParcelizer()) {
                onEndApplyChanges.read(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                try {
                    this.RemoteActionCompatParcelizer.read();
                } catch (IllegalStateException e) {
                    onEndApplyChanges.read(getClass().getSimpleName(), "(%x) Closing stream client-side result in exception: [%s]", Integer.valueOf(System.identityHashCode(this)), e);
                }
            }
            this.RemoteActionCompatParcelizer = null;
        }
        this.MediaSessionCompatToken = decrementkeepscreenoncount;
        this.MediaSessionCompatQueueItem.read(status);
    }

    public reuseLayer(calculateLocalPositionMKHz9U calculatelocalpositionmkhz9u, SentryClient sentryClient, getTextInputService gettextinputservice, incrementSensitiveComponentCount incrementsensitivecomponentcount, incrementSensitiveComponentCount incrementsensitivecomponentcount2, incrementSensitiveComponentCount incrementsensitivecomponentcount3, getAutofill getautofill) {
        this.write = calculatelocalpositionmkhz9u;
        this.ParcelableVolumeInfo = sentryClient;
        this.MediaSessionCompatResultReceiverWrapper = gettextinputservice;
        this.MediaMetadataCompat = incrementsensitivecomponentcount2;
        this.MediaBrowserCompatMediaItem = incrementsensitivecomponentcount3;
        this.MediaSessionCompatQueueItem = getautofill;
        this.read = new onInteropViewLayoutChange(gettextinputservice, incrementsensitivecomponentcount);
    }

    public final void write() {
        getRectManager.RemoteActionCompatParcelizer(!IconCompatParcelizer(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        this.MediaSessionCompatToken = decrementKeepScreenOnCount.Initial;
        this.read.RemoteActionCompatParcelizer = 0L;
    }
}
