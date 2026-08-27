package o;

import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.base.activity.ISoftARManager;
import com.huawei.location.router.LocationNaming;
import com.huawei.location.router.RouterTaskHandler;
import com.huawei.location.router.entity.IRouterResponse;
import com.huawei.location.router.entity.RouterRequest;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class BringIntoViewModifierNodeKtbringIntoView2 {
    public boolean IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public toAutofillIdCompat MediaDescriptionCompat;
    public FontResources_androidKt[] MediaMetadataCompat;
    public i$d.a MediaSessionCompatQueueItem;
    public int MediaSessionCompatToken;
    public ISoftARManager PlaybackStateCompat;
    public findViewTreeCompositionContext PlaybackStateCompatCustomAction;
    public FontResources_androidKt[] RatingCompat;
    public FontResources_androidKt[] RemoteActionCompatParcelizer;
    public toViewStructureCompat read;
    public getTheme serializer;
    public FontResources_androidKt[] write;

    public final boolean write(FontResources_androidKt[] fontResources_androidKtArr, boolean z) {
        int iIconCompatParcelizer;
        if (fontResources_androidKtArr != null && fontResources_androidKtArr.length >= 2) {
            FontResources_androidKt fontResources_androidKt = fontResources_androidKtArr[0];
            if (fontResources_androidKt == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SDMSupportManager", "sdm record status[0] first time");
                FontResources_androidKt fontResources_androidKt2 = new FontResources_androidKt();
                fontResources_androidKtArr[0] = fontResources_androidKt2;
                fontResources_androidKt2.serializer = z;
                fontResources_androidKt2.read++;
                return z;
            }
            if (fontResources_androidKt.serializer != z) {
                FontResources_androidKt fontResources_androidKt3 = fontResources_androidKtArr[1];
                if (fontResources_androidKt3 == null) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SDMSupportManager", "sdm record status[1] first time");
                    FontResources_androidKt fontResources_androidKt4 = new FontResources_androidKt();
                    fontResources_androidKtArr[1] = fontResources_androidKt4;
                    fontResources_androidKt4.serializer = z;
                    fontResources_androidKt4.read++;
                } else {
                    fontResources_androidKt3.read++;
                    toViewStructureCompat toviewstructurecompat = this.read;
                    boolean z2 = fontResources_androidKt.write;
                    if (toviewstructurecompat != null) {
                        iIconCompatParcelizer = toviewstructurecompat.IconCompatParcelizer();
                        int iRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
                        if (!(z | z2)) {
                            iIconCompatParcelizer = iRemoteActionCompatParcelizer;
                        }
                    } else {
                        iIconCompatParcelizer = z | z2 ? 3 : 10;
                    }
                    if (fontResources_androidKtArr[1].read >= iIconCompatParcelizer) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SDMSupportManager", "sdm status changed");
                        FontResources_androidKt fontResources_androidKt5 = fontResources_androidKtArr[1];
                        fontResources_androidKtArr[0] = fontResources_androidKt5;
                        fontResources_androidKt5.write = false;
                        fontResources_androidKtArr[1] = null;
                    }
                }
            } else {
                fontResources_androidKt.read++;
                if (fontResources_androidKtArr[1] != null) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SDMSupportManager", "sdm destroy status[1]");
                    fontResources_androidKtArr[1] = null;
                }
            }
            return fontResources_androidKtArr[0].serializer;
        }
        RemoteActionCompatParcelizer();
        return false;
    }

    public final void RemoteActionCompatParcelizer() {
        IRouterResponse iRouterResponseExecute = RouterTaskHandler.getInstance().execute(new RouterRequest(LocationNaming.REQUEST_ADAPTER_SDM, "", UUID.randomUUID().toString(), null));
        if (iRouterResponseExecute instanceof ISoftARManager) {
            this.PlaybackStateCompat = (ISoftARManager) iRouterResponseExecute;
        }
        ISoftARManager iSoftARManager = this.PlaybackStateCompat;
        if (iSoftARManager != null) {
            iSoftARManager.requestActivityUpdates(1000L, this.MediaSessionCompatQueueItem);
        }
        this.RemoteActionCompatParcelizer = new FontResources_androidKt[2];
        this.MediaMetadataCompat = new FontResources_androidKt[2];
        this.write = new FontResources_androidKt[2];
        this.RatingCompat = new FontResources_androidKt[2];
        this.serializer = new getTheme(25, 30);
    }
}
