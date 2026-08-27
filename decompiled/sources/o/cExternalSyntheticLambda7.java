package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hmf.tasks.a.d$a;
import io.grpc.internal.CallTracer;
import io.sentry.MovePreviousSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.io.TextStreamsKt;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class cExternalSyntheticLambda7 extends JsonUtilsExternalSyntheticLambda1 {
    public final requestPushPermissionPromptlambda2 IconCompatParcelizer;
    public final isNullOrEmpty MediaBrowserCompatMediaItem;
    public final getMd5Hash MediaDescriptionCompat;
    public r8lambday78CcsNUxER22a2WVqifR2BmBdo MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final /* synthetic */ hasTooManyZipEntrieslambda0 PlaybackStateCompat;
    public final incrementPermissionRequestCountlambda0 RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public FormBody.Builder serializer;
    public List write;

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc RemoteActionCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final void IconCompatParcelizer(List list) {
        this.PlaybackStateCompat.addOnNewIntentListener.write();
        this.write = list;
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = this.MediaMetadataCompat;
        r8lambday78ccsnuxer22a2wvqifr2bmbdo.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TextStreamsKt.serializer(it.next(), "newAddressGroups contains null entry");
        }
        TextStreamsKt.read("newAddressGroups is empty", !list.isEmpty());
        r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.execute(new d$a(r8lambday78ccsnuxer22a2wvqifr2bmbdo, 12, Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final void MediaDescriptionCompat() {
        this.PlaybackStateCompat.addOnNewIntentListener.write();
        TextStreamsKt.RemoteActionCompatParcelizer("not started", this.MediaSessionCompatQueueItem);
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = this.MediaMetadataCompat;
        if (r8lambday78ccsnuxer22a2wvqifr2bmbdo.IconCompatParcelizer != null) {
            return;
        }
        r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.execute(new MovePreviousSession(13, r8lambday78ccsnuxer22a2wvqifr2bmbdo));
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final void RatingCompat() {
        FormBody.Builder builder;
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = this.PlaybackStateCompat;
        hastoomanyzipentrieslambda0.addOnNewIntentListener.write();
        if (this.MediaMetadataCompat == null) {
            this.RemoteActionCompatParcelizer = true;
            return;
        }
        if (!this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = true;
        } else {
            if (!hastoomanyzipentrieslambda0.addOnTrimMemoryListener || (builder = this.serializer) == null) {
                return;
            }
            builder.RatingCompat();
            this.serializer = null;
        }
        if (!hastoomanyzipentrieslambda0.addOnTrimMemoryListener) {
            this.serializer = hastoomanyzipentrieslambda0.addOnNewIntentListener.read(new replacePrefetchedUrlsWithLocalAssets(new isAutomaticGeofenceRequestsEnabled(11, this)), 5L, TimeUnit.SECONDS, hastoomanyzipentrieslambda0.addOnPictureInPictureModeChangedListener.RemoteActionCompatParcelizer.MediaSessionCompatToken);
        } else {
            r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = this.MediaMetadataCompat;
            r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.execute(new r8lambdaclfS62tZC2OFo9lifeMcE91mC8(r8lambday78ccsnuxer22a2wvqifr2bmbdo, hasTooManyZipEntrieslambda0.RemoteActionCompatParcelizer, 0));
        }
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final getPrettyPrintedStringlambda0 serializer() {
        return this.IconCompatParcelizer.serializer;
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final void serializer(wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4) {
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = this.PlaybackStateCompat;
        hastoomanyzipentrieslambda0.addOnNewIntentListener.write();
        TextStreamsKt.RemoteActionCompatParcelizer("already started", !this.MediaSessionCompatQueueItem);
        TextStreamsKt.RemoteActionCompatParcelizer("already shutdown", !this.RemoteActionCompatParcelizer);
        TextStreamsKt.RemoteActionCompatParcelizer("Channel is being terminated", !hastoomanyzipentrieslambda0.addOnTrimMemoryListener);
        this.MediaSessionCompatQueueItem = true;
        List list = this.IconCompatParcelizer.write;
        String strWrite = hastoomanyzipentrieslambda0.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.write();
        WebContentUtils webContentUtils = hastoomanyzipentrieslambda0.MediaBrowserCompatMediaItem;
        getMD5_HASH_OF_THE_STRING_NULLannotations getmd5_hash_of_the_string_nullannotations = hastoomanyzipentrieslambda0.addOnPictureInPictureModeChangedListener;
        ScheduledExecutorService scheduledExecutorService = getmd5_hash_of_the_string_nullannotations.RemoteActionCompatParcelizer.MediaSessionCompatToken;
        DelegatingNode delegatingNode = hastoomanyzipentrieslambda0.onBackPressedDispatcher_delegatelambda0;
        getMethodQuietlylambda1 getmethodquietlylambda1 = hastoomanyzipentrieslambda0.addOnNewIntentListener;
        logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0 = new logPurchaseWithJSONlambda0(this, 3, wouldpushpermissionpromptdisplaylambda4);
        r8lambdau5EmWqwr5N5wkL4k3k2Ai1wBwnU r8lambdau5emwqwr5n5wkl4k3k2ai1wbwnu = hastoomanyzipentrieslambda0.ResultReceiver;
        hastoomanyzipentrieslambda0.PlaybackStateCompat.getClass();
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = new r8lambday78CcsNUxER22a2WVqifR2BmBdo(list, strWrite, webContentUtils, getmd5_hash_of_the_string_nullannotations, scheduledExecutorService, delegatingNode, getmethodquietlylambda1, logpurchasewithjsonlambda0, r8lambdau5emwqwr5n5wkl4k3k2ai1wbwnu, new CallTracer(), this.MediaBrowserCompatMediaItem, this.RatingCompat, this.MediaDescriptionCompat, hastoomanyzipentrieslambda0.getActivityResultRegistry);
        isNullOrEmpty isnullorempty = hastoomanyzipentrieslambda0.ComponentActivity;
        getPermissionRequestCount getpermissionrequestcount = getPermissionRequestCount.CT_INFO;
        long jWrite = hastoomanyzipentrieslambda0.addOnUserLeaveHintListener.write();
        TextStreamsKt.serializer(getpermissionrequestcount, "severity");
        isnullorempty.serializer(new r8lambdaqYSwZub08pyNNYVE4xV_lcKzRA("Child Subchannel started", getpermissionrequestcount, jWrite, r8lambday78ccsnuxer22a2wvqifr2bmbdo));
        this.MediaMetadataCompat = r8lambday78ccsnuxer22a2wvqifr2bmbdo;
        hastoomanyzipentrieslambda0.addOnContextAvailableListener.add(r8lambday78ccsnuxer22a2wvqifr2bmbdo);
    }

    public final String toString() {
        return this.RatingCompat.toString();
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final List write() {
        this.PlaybackStateCompat.addOnNewIntentListener.write();
        TextStreamsKt.RemoteActionCompatParcelizer("not started", this.MediaSessionCompatQueueItem);
        return this.write;
    }

    public cExternalSyntheticLambda7(hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0, requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2) {
        this.PlaybackStateCompat = hastoomanyzipentrieslambda0;
        List list = requestpushpermissionpromptlambda2.write;
        this.write = list;
        java.util.logging.Logger logger = hasTooManyZipEntrieslambda0.MediaMetadataCompat;
        this.IconCompatParcelizer = requestpushpermissionpromptlambda2;
        incrementPermissionRequestCountlambda0 incrementpermissionrequestcountlambda0 = new incrementPermissionRequestCountlambda0("Subchannel", hastoomanyzipentrieslambda0.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.write(), incrementPermissionRequestCountlambda0.write.incrementAndGet());
        this.RatingCompat = incrementpermissionrequestcountlambda0;
        WebContentUtils webContentUtils = hastoomanyzipentrieslambda0.addOnUserLeaveHintListener;
        isNullOrEmpty isnullorempty = new isNullOrEmpty(incrementpermissionrequestcountlambda0, webContentUtils.write(), c8$$ExternalSyntheticOutline0.m("Subchannel for ", list));
        this.MediaBrowserCompatMediaItem = isnullorempty;
        this.MediaDescriptionCompat = new getMd5Hash(isnullorempty, webContentUtils);
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final Object MediaBrowserCompatMediaItem() {
        TextStreamsKt.RemoteActionCompatParcelizer("Subchannel is not started", this.MediaSessionCompatQueueItem);
        return this.MediaMetadataCompat;
    }
}
