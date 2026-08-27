package o;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setShowDividers implements Runnable {
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.camera.camera2.internal.FocusMeteringControl serializer;
    public final /* synthetic */ long write;

    public /* synthetic */ setShowDividers(androidx.camera.camera2.internal.FocusMeteringControl focusMeteringControl, long j, int i) {
        this.read = i;
        this.serializer = focusMeteringControl;
        this.write = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        long j = this.write;
        androidx.camera.camera2.internal.FocusMeteringControl focusMeteringControl = this.serializer;
        if (i == 0) {
            focusMeteringControl.MediaSessionCompatQueueItem.execute(new setShowDividers(focusMeteringControl, j, 3));
            return;
        }
        int i2 = 2;
        if (i == 1) {
            focusMeteringControl.MediaSessionCompatQueueItem.execute(new setShowDividers(focusMeteringControl, j, i2));
            return;
        }
        if (i == 2) {
            if (j == focusMeteringControl.RatingCompat) {
                focusMeteringControl.RemoteActionCompatParcelizer();
            }
        } else if (j == focusMeteringControl.RatingCompat) {
            focusMeteringControl.MediaSessionCompatToken = false;
            ScheduledFuture scheduledFuture = focusMeteringControl.write;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                focusMeteringControl.write = null;
            }
            onDrawWithContent ondrawwithcontent = focusMeteringControl.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (ondrawwithcontent != null) {
                ondrawwithcontent.RemoteActionCompatParcelizer(new getTitleMarginStart(false));
                focusMeteringControl.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
            }
        }
    }
}
