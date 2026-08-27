package o;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetReuseSyncDeactivationcp extends ViewOutlineProvider {
    public final android.graphics.Rect RemoteActionCompatParcelizer = new android.graphics.Rect();
    public final /* synthetic */ accessgetReuseDeactivationViaHostcp read;

    public accessgetReuseSyncDeactivationcp(accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp) {
        this.read = accessgetreusedeactivationviahostcp;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, android.graphics.Outline outline) {
        accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp = this.read;
        if (accessgetreusedeactivationviahostcp.ResultReceiver == null) {
            return;
        }
        if (accessgetreusedeactivationviahostcp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
            accessgetreusedeactivationviahostcp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new SubcomposeSlotReusePolicy(accessgetreusedeactivationviahostcp.ResultReceiver);
        }
        RectF rectF = accessgetreusedeactivationviahostcp.MediaBrowserCompatMediaItem;
        android.graphics.Rect rect = this.RemoteActionCompatParcelizer;
        rectF.round(rect);
        accessgetreusedeactivationviahostcp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setBounds(rect);
        accessgetreusedeactivationviahostcp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getOutline(outline);
    }
}
