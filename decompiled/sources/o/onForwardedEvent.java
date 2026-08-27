package o;

import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class onForwardedEvent implements onDetachedFromWindow {
    public final onDrawBehind IconCompatParcelizer;
    public final getTrackDrawable read;
    public final onDrawWithContent serializer;

    @Override // o.onDetachedFromWindow
    public final boolean RemoteActionCompatParcelizer(TotalCaptureResult totalCaptureResult) {
        getTrackDrawable gettrackdrawable = this.read;
        if (gettrackdrawable != null) {
            int i = gettrackdrawable.IconCompatParcelizer;
            boolean zRemoteActionCompatParcelizer = (i == 10 || i == 13) ? abandonFocus.RemoteActionCompatParcelizer(totalCaptureResult, false) : abandonFocus.RemoteActionCompatParcelizer(totalCaptureResult, true);
            if (!zRemoteActionCompatParcelizer) {
                return false;
            }
        }
        this.serializer.RemoteActionCompatParcelizer(totalCaptureResult);
        return true;
    }

    public onForwardedEvent(getTrackDrawable gettrackdrawable) {
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        try {
            this.serializer = ondrawwithcontent;
            ondrawwithcontent.RemoteActionCompatParcelizer = "waitFor3AResult";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        this.IconCompatParcelizer = ondrawbehind;
        this.read = gettrackdrawable;
    }
}
