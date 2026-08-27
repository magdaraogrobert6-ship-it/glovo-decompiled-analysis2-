package androidx.compose.animation.core;

import android.view.ActionMode;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import coil3.disk.DiskLruCache$Editor;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.details.api.PickUpDropOffDetailsUiModel;
import com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ExtendedFabLargeTokens;
import o.FocusPropertiesNode;
import o.PrematureEndOfStreamVideoQuirk;
import o.RadioButtonTokens;
import o.accessgetAllAppscp;
import o.accessgetCancelcp;
import o.accessgetHighcp;
import o.backgroundbw27NRU;
import o.consumeAvailableOffsetMKHz9U;
import o.getExtendedTouchPaddinghWWAJMo;
import o.getPersonMiddleInitial;
import o.onBackPressed;
import o.onBackPressedDispatcher_delegatelambda0;
import o.onShowTranslationui;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.setSpread;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1 implements getPersonMiddleInitial {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // o.getPersonMiddleInitial
    public final void dispose() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        Object obj2 = null;
        switch (i2) {
            case 0:
                ((SeekableTransitionState) ((TransitionState) obj)).read((setSpread) null);
                return;
            case 1:
                onBackPressed onbackpressed = ((onBackPressedDispatcher_delegatelambda0) obj).IconCompatParcelizer;
                if (onbackpressed != null) {
                    onbackpressed.serializer();
                    return;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Launcher has not been initialized");
                    return;
                }
            case 2:
                Transition transition = (Transition) obj;
                transition.onTransitionEnd$animation_core();
                transition.MediaSessionCompatToken.write();
                return;
            case 3:
                ((consumeAvailableOffsetMKHz9U) obj).write = null;
                return;
            case 4:
                RadioButtonTokens radioButtonTokens = (RadioButtonTokens) obj;
                DiskLruCache$Editor diskLruCache$Editor = radioButtonTokens.IconCompatParcelizer;
                if (diskLruCache$Editor != null) {
                    diskLruCache$Editor.read = false;
                }
                radioButtonTokens.IconCompatParcelizer = null;
                return;
            case 5:
                ((ExtendedFabLargeTokens) obj).write = true;
                return;
            case 6:
                ((TextFieldSelectionManager) obj).MediaMetadataCompat();
                return;
            case 7:
                AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = (AndroidTextContextMenuToolbarProvider) obj;
                setSpread setspread = androidTextContextMenuToolbarProvider.MediaBrowserCompatMediaItem;
                OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = setspread.read;
                if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 != null) {
                    int i3 = IconCompatParcelizer + 37;
                    read = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    int i5 = read + 79;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
                setspread.serializer();
                ActionMode actionMode = androidTextContextMenuToolbarProvider.read;
                if (actionMode != null) {
                    int i7 = read + 65;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        actionMode.finish();
                        obj2.hashCode();
                        throw null;
                    }
                    actionMode.finish();
                }
                androidTextContextMenuToolbarProvider.read = null;
                return;
            case 8:
                accessgetHighcp accessgethighcp = (accessgetHighcp) ((onShowTranslationui) ((BasicTextContextMenuProvider) obj).IconCompatParcelizer).getValue();
                if (accessgethighcp != null) {
                    accessgethighcp.read();
                    return;
                }
                return;
            case 9:
                CancellableContinuationImpl cancellableContinuationImpl = ((TooltipStateImpl) obj).IconCompatParcelizer;
                if (cancellableContinuationImpl != null) {
                    cancellableContinuationImpl.serializer((Throwable) null);
                    return;
                }
                return;
            case 10:
                ((accessgetAllAppscp) obj).RemoteActionCompatParcelizer = null;
                return;
            case 11:
                ((DeliveryAcceptButtonUiModelImpl) obj).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.serializer();
                return;
            case 12:
                ((FragmentActivity) obj).getSupportFragmentManager().write("content_sharing_submitted_from_floating_button");
                return;
            case 13:
                PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl = (PickUpDropOffDetailsUiModelImpl) ((PickUpDropOffDetailsUiModel) obj);
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = pickUpDropOffDetailsUiModelImpl.RatingCompat;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = pickUpDropOffDetailsUiModelImpl.PlaybackStateCompat;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                    int i8 = IconCompatParcelizer + 47;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                }
                pickUpDropOffDetailsUiModelImpl.RatingCompat = null;
                pickUpDropOffDetailsUiModelImpl.PlaybackStateCompat = null;
                int i10 = read + 13;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return;
            case 14:
                getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo = (getExtendedTouchPaddinghWWAJMo) obj;
                getextendedtouchpaddinghwwajmo.getClass();
                PrematureEndOfStreamVideoQuirk.write();
                getextendedtouchpaddinghwwajmo.accessensureViewModelStore = null;
                getextendedtouchpaddinghwwajmo.write = null;
                backgroundbw27NRU backgroundbw27nru = getextendedtouchpaddinghwwajmo.serializer;
                if (backgroundbw27nru != null) {
                    backgroundbw27nru.RemoteActionCompatParcelizer.read();
                    return;
                }
                return;
            default:
                View rootView = ((View) obj).getRootView();
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                accessgetCancelcp.write(rootView, null);
                return;
        }
    }
}
