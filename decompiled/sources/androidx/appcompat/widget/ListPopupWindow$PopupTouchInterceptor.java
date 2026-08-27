package androidx.appcompat.widget;

import android.app.Activity;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import kotlinx.coroutines.BuildersKt;
import o.OwnerSnapshotObserveronCommitAffectingLookahead1;
import o.ParentDataModifierNode;
import o.setExpandedActionViewsExclusive;
import o.setItemInvoker;
import o.setOnMenuItemClickListener;

/* JADX INFO: loaded from: classes.dex */
public final class ListPopupWindow$PopupTouchInterceptor implements View.OnTouchListener {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;

    public /* synthetic */ ListPopupWindow$PopupTouchInterceptor(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            FirebaseInAppMessagingDisplay.AnonymousClass4 anonymousClass4 = (FirebaseInAppMessagingDisplay.AnonymousClass4) obj;
            FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = FirebaseInAppMessagingDisplay.this;
            if (motionEvent.getAction() != 4) {
                return false;
            }
            OwnerSnapshotObserveronCommitAffectingLookahead1 ownerSnapshotObserveronCommitAffectingLookahead1 = firebaseInAppMessagingDisplay.IconCompatParcelizer;
            if (ownerSnapshotObserveronCommitAffectingLookahead1 != null) {
                ((DisplayCallbacksImpl) ownerSnapshotObserveronCommitAffectingLookahead1).IconCompatParcelizer(ParentDataModifierNode.UNKNOWN_DISMISS_TYPE);
            }
            Activity activity = anonymousClass4.serializer;
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
            firebaseInAppMessagingDisplay.IconCompatParcelizer(activity);
            firebaseInAppMessagingDisplay.MediaBrowserCompatMediaItem = null;
            firebaseInAppMessagingDisplay.IconCompatParcelizer = null;
            return true;
        }
        setExpandedActionViewsExclusive setexpandedactionviewsexclusive = (setExpandedActionViewsExclusive) obj;
        setOnMenuItemClickListener setonmenuitemclicklistener = setexpandedactionviewsexclusive.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        Handler handler = setexpandedactionviewsexclusive.ResultReceiver;
        setItemInvoker setiteminvoker = setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && setiteminvoker != null && setiteminvoker.isShowing() && x >= 0 && x < setiteminvoker.getWidth() && y >= 0 && y < setiteminvoker.getHeight()) {
            handler.postDelayed(setonmenuitemclicklistener, 250L);
        } else if (action == 1) {
            handler.removeCallbacks(setonmenuitemclicklistener);
        }
        return false;
    }
}
