package o;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class getReuseSyncDeactivationNjRlDlw implements OnBackAnimationCallback {
    public final /* synthetic */ getSlotToReusedFromOnReuseNjRlDlw read;
    public final /* synthetic */ getReuseScheduleOutOfFrameDeactivationNjRlDlw serializer;

    public final void onBackCancelled() {
        if (this.serializer.read != null) {
            this.read.cancelBackProgress();
        }
    }

    public final void onBackInvoked() {
        this.read.handleBackInvoked();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.serializer.read != null) {
            this.read.updateBackProgress(new r8lambda54BeH8ZsBru0CXI2CCSP2syNys(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.serializer.read != null) {
            this.read.startBackProgress(new r8lambda54BeH8ZsBru0CXI2CCSP2syNys(backEvent));
        }
    }

    public getReuseSyncDeactivationNjRlDlw(getReuseScheduleOutOfFrameDeactivationNjRlDlw getreusescheduleoutofframedeactivationnjrldlw, getSlotToReusedFromOnReuseNjRlDlw getslottoreusedfromonreusenjrldlw) {
        this.serializer = getreusescheduleoutofframedeactivationnjrldlw;
        this.read = getslottoreusedfromonreusenjrldlw;
    }
}
