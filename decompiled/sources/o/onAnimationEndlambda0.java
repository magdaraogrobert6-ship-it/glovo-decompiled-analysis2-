package o;

import kotlinx.coroutines.JobSupport;

/* JADX INFO: loaded from: classes4.dex */
public class onAnimationEndlambda0 extends JobSupport implements getButtonViews {
    public final boolean IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onAnimationEndlambda0(setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0) {
        super(true);
        boolean z = true;
        RemoteActionCompatParcelizer(setallviewgroupchildrenasnonaccessibilityimportantlambda0);
        createButtonClickListeners createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        getClickableInAppMessageView getclickableinappmessageview = createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper instanceof getClickableInAppMessageView ? (getClickableInAppMessageView) createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper : null;
        if (getclickableinappmessageview == null) {
            z = false;
            break;
        }
        JobSupport jobSupportSerializer = getclickableinappmessageview.serializer();
        while (!jobSupportSerializer.MediaBrowserCompatMediaItem()) {
            createButtonClickListeners createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper2 = jobSupportSerializer.MediaSessionCompatResultReceiverWrapper();
            getClickableInAppMessageView getclickableinappmessageview2 = createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper2 instanceof getClickableInAppMessageView ? (getClickableInAppMessageView) createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper2 : null;
            if (getclickableinappmessageview2 == null) {
                z = false;
                break;
            }
            jobSupportSerializer = getclickableinappmessageview2.serializer();
        }
        this.IconCompatParcelizer = z;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean MediaMetadataCompat() {
        return true;
    }
}
