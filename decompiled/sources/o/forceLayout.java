package o;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class forceLayout extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ com.deliveryhero.customerchat.CustomerChatModule write;

    /* JADX WARN: Illegal instructions before constructor call */
    public forceLayout(com.deliveryhero.customerchat.CustomerChatModule customerChatModule, int i) {
        this.RemoteActionCompatParcelizer = i;
        getOnBackInvokedCallback getonbackinvokedcallback = getOnBackInvokedCallback.RemoteActionCompatParcelizer;
        this.write = customerChatModule;
        if (i != 1) {
            super(getonbackinvokedcallback);
        } else {
            super(getonbackinvokedcallback);
        }
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        int i = this.RemoteActionCompatParcelizer;
        com.deliveryhero.customerchat.CustomerChatModule customerChatModule = this.write;
        if (i != 0) {
            isIdentityannotations isidentityannotations = ((onImageAvailable) customerChatModule.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper()).serializer;
            if (isidentityannotations != null) {
                isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "DATASTORE_OPERATION_CACHE_EVENT", "Customer chat configuration cache operation failed", th);
                return;
            }
            return;
        }
        isIdentityannotations isidentityannotations2 = ((onImageAvailable) customerChatModule.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper()).serializer;
        if (isidentityannotations2 != null) {
            isidentityannotations2.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "FETCH_FEATURE_FLAG_EVENT", "Customer Chat Feature flag fetching failed", th);
        }
    }
}
