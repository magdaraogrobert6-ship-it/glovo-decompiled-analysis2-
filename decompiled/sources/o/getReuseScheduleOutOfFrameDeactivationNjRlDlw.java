package o;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class getReuseScheduleOutOfFrameDeactivationNjRlDlw extends getReusedNjRlDlw {
    @Override // o.getReusedNjRlDlw
    public final OnBackInvokedCallback cf_(getSlotToReusedFromOnReuseNjRlDlw getslottoreusedfromonreusenjrldlw) {
        return new getReuseSyncDeactivationNjRlDlw(this, getslottoreusedfromonreusenjrldlw);
    }
}
