package o;

import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import bo.app.ah$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CombinedModifiertoString1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider IconCompatParcelizer;
    public final /* synthetic */ hashCodeimpl read;
    public final /* synthetic */ int write;

    public /* synthetic */ CombinedModifiertoString1(androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, hashCodeimpl hashcodeimpl, int i) {
        this.write = i;
        this.IconCompatParcelizer = androidTextContextMenuToolbarProvider;
        this.read = hashcodeimpl;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.write;
        hashCodeimpl hashcodeimpl = this.read;
        androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.IconCompatParcelizer;
        int i2 = 8;
        if (i == 0) {
            ComposeUiFlags composeUiFlags = androidTextContextMenuToolbarProvider.RatingCompat;
            CoroutineLiveData$$ExternalSyntheticLambda0 coroutineLiveData$$ExternalSyntheticLambda0 = new CoroutineLiveData$$ExternalSyntheticLambda0(14, hashcodeimpl);
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            androidTextContextMenuToolbarProvider.MediaBrowserCompatMediaItem.serializer("dataBuilder", composeUiFlags, new ah$$ExternalSyntheticLambda0(createinappmessageeventsubscriber, i2, coroutineLiveData$$ExternalSyntheticLambda0));
            Object obj = createinappmessageeventsubscriber.IconCompatParcelizer;
            if (obj != null) {
                return (any) obj;
            }
            removeNodeAtDepth.serializer("result");
            throw null;
        }
        if (i != 1) {
            Object objInvoke = androidTextContextMenuToolbarProvider.RemoteActionCompatParcelizer.invoke();
            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = (androidx.compose.ui.layout.LayoutCoordinates) (((androidx.compose.ui.layout.LayoutCoordinates) objInvoke).isAttached() ? objInvoke : null);
            return layoutCoordinates == null ? androidx.compose.ui.geometry.Rect.Companion.getZero() : hashcodeimpl.RemoteActionCompatParcelizer(layoutCoordinates).m514translatek4lQ0M(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        }
        ComposeUiFlags composeUiFlags2 = androidTextContextMenuToolbarProvider.MediaSessionCompatQueueItem;
        CombinedModifiertoString1 combinedModifiertoString1 = new CombinedModifiertoString1(androidTextContextMenuToolbarProvider, hashcodeimpl, 2);
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
        androidTextContextMenuToolbarProvider.MediaBrowserCompatMediaItem.serializer("positioner", composeUiFlags2, new ah$$ExternalSyntheticLambda0(createinappmessageeventsubscriber2, i2, combinedModifiertoString1));
        Object obj2 = createinappmessageeventsubscriber2.IconCompatParcelizer;
        if (obj2 != null) {
            return (androidx.compose.ui.geometry.Rect) obj2;
        }
        removeNodeAtDepth.serializer("result");
        throw null;
    }
}
