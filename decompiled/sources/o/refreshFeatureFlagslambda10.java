package o;

import android.content.Context;
import com.roadrunner.twofa.presentation.compose.SmsBroadcastReceiverKt$SmsBroadcastReceiver$1$1$broadcast$1;
import java.util.Iterator;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class refreshFeatureFlagslambda10 implements getPersonMiddleInitial {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ refreshFeatureFlagslambda10(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.write = obj;
        this.serializer = obj2;
    }

    @Override // o.getPersonMiddleInitial
    public final void dispose() {
        switch (this.IconCompatParcelizer) {
            case 0:
                ((accessisRenderNodeCompatiblecp) this.write).getLifecycle().read((reenqueueInAppMessagelambda1) this.serializer);
                return;
            case 1:
                ((getLifecycle) this.write).serializer((addOnPictureInPictureModeChangedListener) this.serializer);
                return;
            case 2:
                ArrangementHorizontal arrangementHorizontal = (ArrangementHorizontal) this.write;
                arrangementHorizontal.IconCompatParcelizer.RemoteActionCompatParcelizer((placeSpaceBetweenfoundation_layout) this.serializer);
                return;
            case 3:
                androidx.compose.animation.core.Transition transition = (androidx.compose.animation.core.Transition) this.write;
                transition.RemoteActionCompatParcelizer.remove((requiredSize3ABfNKs) this.serializer);
                return;
            case 4:
                ((getCurrent) this.write).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.serializer);
                return;
            case 5:
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) this.write;
                Button button = (Button) populateViewStructure_androidKtpopulate7.getValue();
                if (button != null) {
                    CheckboxKt checkboxKt = new CheckboxKt(button);
                    androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) this.serializer;
                    if (mutableInteractionSourceImpl != null) {
                        mutableInteractionSourceImpl.write(checkboxKt);
                    }
                    populateViewStructure_androidKtpopulate7.setValue(null);
                    return;
                }
                return;
            case 6:
                ((androidx.compose.foundation.text.TextLinkScope) this.write).write.remove((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.serializer);
                return;
            case 7:
                ((accessunregisterComponentCallback) this.write).RemoteActionCompatParcelizer((unregisterComponentCallback) this.serializer);
                return;
            case 8:
                ((cubicTo) this.write).MediaBrowserCompatMediaItem.RatingCompat.read((AndroidPath_androidKt) this.serializer);
                return;
            case 9:
                Iterator it = ((List) ((onViewAttachedToWindow) this.write).getValue()).iterator();
                while (it.hasNext()) {
                    ((AndroidPathMeasure) this.serializer).serializer().IconCompatParcelizer((cubicTo) it.next());
                }
                return;
            case 10:
                ((supportsColorMatrixQuery) this.write).read((toAndroidColorSpace) this.serializer);
                return;
            case 11:
                com.huawei.wisesecurity.ucs_credential.p0 p0Var = (com.huawei.wisesecurity.ucs_credential.p0) this.write;
                getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo = (getExtendedTouchPaddinghWWAJMo) this.serializer;
                p0Var.getClass();
                getextendedtouchpaddinghwwajmo.getClass();
                PrematureEndOfStreamVideoQuirk.write();
                getextendedtouchpaddinghwwajmo.IconCompatParcelizer = null;
                getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer = null;
                getWrapper getwrapper = getextendedtouchpaddinghwwajmo.PlaybackStateCompatCustomAction;
                synchronized (getwrapper.read) {
                    setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = getwrapper.RemoteActionCompatParcelizer;
                    if (setcontentinsetstartwithnavigation != null) {
                        setcontentinsetstartwithnavigation.read(null, null);
                    }
                    if (getwrapper.MediaBrowserCompatMediaItem != null) {
                        getwrapper.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = values.INACTIVE;
                        getwrapper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    }
                    getwrapper.MediaMetadataCompat = null;
                    getwrapper.MediaBrowserCompatMediaItem = null;
                    break;
                }
                getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo2 = (getExtendedTouchPaddinghWWAJMo) this.serializer;
                getextendedtouchpaddinghwwajmo2.getClass();
                PrematureEndOfStreamVideoQuirk.write();
                getextendedtouchpaddinghwwajmo2.accessensureViewModelStore = null;
                getextendedtouchpaddinghwwajmo2.write = null;
                backgroundbw27NRU backgroundbw27nru = getextendedtouchpaddinghwwajmo2.serializer;
                if (backgroundbw27nru != null) {
                    backgroundbw27nru.RemoteActionCompatParcelizer.read();
                    return;
                }
                return;
            case 12:
                ((androidx.fragment.app.FragmentActivity) this.write).getLifecycle().read((addFeatureKeys) this.serializer);
                return;
            case 13:
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Unregistering SMS broadcast receiver", new Object[0]);
                ((Context) this.write).unregisterReceiver((SmsBroadcastReceiverKt$SmsBroadcastReceiver$1$1$broadcast$1) this.serializer);
                return;
            default:
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Unregistering SMS broadcast receiver", new Object[0]);
                ((Context) this.write).unregisterReceiver((SmsBroadcastReceiverKt$SmsBroadcastReceiver$1$1$broadcast$1) this.serializer);
                return;
        }
    }
}
