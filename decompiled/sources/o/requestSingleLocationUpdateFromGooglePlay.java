package o;

import android.content.Context;
import android.location.Location;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.sentiance.sdk.crashdetection.api.CrashDetectionApi;
import com.sentiance.sdk.crashdetection.api.VehicleCrashListener;
import io.sentry.android.replay.ReplayCache$rotate$1$1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class requestSingleLocationUpdateFromGooglePlay implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ Object write;

    public /* synthetic */ requestSingleLocationUpdateFromGooglePlay(long j, Location location, VehicleCrashListener vehicleCrashListener) {
        this.RemoteActionCompatParcelizer = 2;
        this.read = j;
        this.write = location;
        this.IconCompatParcelizer = vehicleCrashListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        long j = this.read;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.write;
        if (i == 0) {
            removeGeofencesRegisteredWithGeofencingClientlambda22.serializer(j, (Context) obj, (removeGeofencesRegisteredWithGeofencingClientlambda22) obj2);
            return;
        }
        if (i == 1) {
            String str = (String) obj;
            checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates = ((CrashlyticsCore) obj2).RemoteActionCompatParcelizer;
            markNodeAndSubtreeAsPlaced marknodeandsubtreeasplaced = checkchildrenplaceorderforupdates.MediaBrowserCompatMediaItem;
            if (marknodeandsubtreeasplaced == null || !marknodeandsubtreeasplaced.RemoteActionCompatParcelizer.get()) {
                ((getPerformMeasureBlockui) checkchildrenplaceorderforupdates.MediaSessionCompatToken.read).IconCompatParcelizer(j, str);
                return;
            }
            return;
        }
        if (i == 2) {
            CrashDetectionApi.lambda$invokeDummyVehicleCrash$2(j, (Location) obj2, (VehicleCrashListener) obj);
            return;
        }
        io.sentry.android.replay.capture.write writeVar = (io.sentry.android.replay.capture.write) obj2;
        io.sentry.android.replay.PlaybackStateCompatCustomAction playbackStateCompatCustomAction = (io.sentry.android.replay.PlaybackStateCompatCustomAction) obj;
        io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = writeVar.write;
        if (mediaBrowserCompatMediaItem != null) {
            playbackStateCompatCustomAction.invoke(mediaBrowserCompatMediaItem, Long.valueOf(j));
        }
        long jIconCompatParcelizer = writeVar.ResultReceiver.IconCompatParcelizer() - writeVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.getSessionReplay().read;
        io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem2 = writeVar.write;
        writeVar.ComponentActivity.setValue(writeVar, io.sentry.android.replay.capture.RemoteActionCompatParcelizer.read[2], mediaBrowserCompatMediaItem2 != null ? mediaBrowserCompatMediaItem2.read(jIconCompatParcelizer) : null);
        ArrayList arrayList = writeVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        onContentCardDismissed.write((List) arrayList, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new ReplayCache$rotate$1$1(jIconCompatParcelizer, writeVar, cancelpendingwebviewpause, 2));
        if (cancelpendingwebviewpause.IconCompatParcelizer) {
            int i2 = 0;
            for (Object obj3 : arrayList) {
                if (i2 < 0) {
                    androidx.sqlite.SQLite.serializer();
                    throw null;
                }
                io.sentry.android.replay.capture.RatingCompat ratingCompat = (io.sentry.android.replay.capture.RatingCompat) obj3;
                ratingCompat.read.ResultReceiver = i2;
                List<io.sentry.rrweb.IconCompatParcelizer> list = ratingCompat.RemoteActionCompatParcelizer.write;
                if (list != null) {
                    for (io.sentry.rrweb.IconCompatParcelizer iconCompatParcelizer : list) {
                        if (iconCompatParcelizer instanceof io.sentry.rrweb.ComponentActivity) {
                            ((io.sentry.rrweb.ComponentActivity) iconCompatParcelizer).MediaSessionCompatResultReceiverWrapper = i2;
                        }
                    }
                }
                i2++;
            }
        }
    }

    public /* synthetic */ requestSingleLocationUpdateFromGooglePlay(CrashlyticsCore crashlyticsCore, long j, String str) {
        this.RemoteActionCompatParcelizer = 1;
        this.write = crashlyticsCore;
        this.read = j;
        this.IconCompatParcelizer = str;
    }

    public /* synthetic */ requestSingleLocationUpdateFromGooglePlay(Object obj, Object obj2, long j, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
        this.read = j;
    }
}
