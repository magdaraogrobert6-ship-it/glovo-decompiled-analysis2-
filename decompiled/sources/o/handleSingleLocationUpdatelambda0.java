package o;

import android.content.Intent;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class handleSingleLocationUpdatelambda0 implements Runnable {
    final /* synthetic */ r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE read;
    final /* synthetic */ Intent write;

    @Override // java.lang.Runnable
    public final void run() {
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer;
        r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE r8lambdagoo4v9me2cu2x5ntv9kk0biysle = this.read;
        r8lambdagoo4v9me2cu2x5ntv9kk0biysle.read.IconCompatParcelizer("Activity transition received", new Object[0]);
        ActivityTransitionResult activityTransitionResultExtractResult = ActivityTransitionResult.extractResult(this.write);
        if (activityTransitionResultExtractResult == null) {
            r8lambdagoo4v9me2cu2x5ntv9kk0biysle.read.IconCompatParcelizer("Could not extract result from intent", new Object[0]);
            r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaBrowserCompatMediaItem.IconCompatParcelizer();
            return;
        }
        List<ActivityTransitionEvent> transitionEvents = activityTransitionResultExtractResult.getTransitionEvents();
        if (!transitionEvents.isEmpty() && (r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer = r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE.serializer(r8lambdagoo4v9me2cu2x5ntv9kk0biysle, (ActivityTransitionEvent) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, transitionEvents))) != null) {
            r8lambdagoo4v9me2cu2x5ntv9kk0biysle.IconCompatParcelizer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer);
        }
        r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaBrowserCompatMediaItem.IconCompatParcelizer();
    }

    public handleSingleLocationUpdatelambda0(r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE r8lambdagoo4v9me2cu2x5ntv9kk0biysle, Intent intent) {
        this.read = r8lambdagoo4v9me2cu2x5ntv9kk0biysle;
        this.write = intent;
    }
}
