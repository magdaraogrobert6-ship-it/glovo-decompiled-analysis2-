package o;

import android.content.Context;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl$scan$2$1$1$1$1;
import com.roadrunner.face.verification.navigation.compose.IdentityNavigationHostKt$IdentityNavigationHost$2$1$1$1;
import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;
import com.roadrunner.login.presentation.navigation.LoginNavigationKt$LoginNavigationHost$1$1$1;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getLetterSpacing implements FlowCollector {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ getContentViewGroupParentLayout read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public getLetterSpacing(LetterSpacingSpanEm letterSpacingSpanEm, Context context, getContentViewGroupParentLayout getcontentviewgroupparentlayout, TncComposableFactoryImpl$$ExternalSyntheticLambda0 tncComposableFactoryImpl$$ExternalSyntheticLambda0, executeRequestimpl executerequestimpl, executeRequestimpl executerequestimpl2) {
        this.RatingCompat = letterSpacingSpanEm;
        this.write = context;
        this.read = getcontentviewgroupparentlayout;
        this.MediaMetadataCompat = tncComposableFactoryImpl$$ExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = executerequestimpl;
        this.serializer = executerequestimpl2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.IconCompatParcelizer;
        int i2 = 0;
        int i3 = 1;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i == 0) {
            IndentationFixSpan indentationFixSpan = (IndentationFixSpan) obj;
            Context context = (Context) this.write;
            LetterSpacingSpanEm letterSpacingSpanEm = (LetterSpacingSpanEm) this.RatingCompat;
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery Acceptance Overlay : Should show overlay bottom sheet: " + indentationFixSpan, new Object[0]);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{indentationFixSpan, IndentationFixSpan_androidKt.serializer}, getCieXyz.write())).booleanValue()) {
                letterSpacingSpanEm.serializer();
            } else if (indentationFixSpan instanceof updateDrawState) {
                LetterSpacingSpanEm.read(letterSpacingSpanEm, context, new DragAndDropTargetModifierNode(new LoadingFloatingButtonKt$$ExternalSyntheticLambda0((Object) letterSpacingSpanEm, (Object) this.read, this.MediaMetadataCompat, this.RemoteActionCompatParcelizer, 2), true, -1212751789));
            } else {
                if (!(indentationFixSpan instanceof getEllipsizedRightPadding)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                LetterSpacingSpanEm.read(letterSpacingSpanEm, context, new DragAndDropTargetModifierNode(new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(letterSpacingSpanEm, indentationFixSpan, (executeRequestimpl) this.serializer, 7), true, 338902740));
            }
            return createFromParcel.INSTANCE;
        }
        if (i != 1) {
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.read;
            setStatusBarBackground setstatusbarbackground = (setStatusBarBackground) obj;
            relativeMoveTo relativemoveto = (relativeMoveTo) this.MediaMetadataCompat;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstatusbarbackground, setupForInsets.read}, getCieXyz.write())).booleanValue()) {
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new IdentityNavigationHostKt$IdentityNavigationHost$2$1$1$1((getStatusBarBackground) this.write, relativemoveto, shortNewsContentCardView2, i2), 3);
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstatusbarbackground, setupForInsets.serializer}, getCieXyz.write())).booleanValue()) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new LoginNavigationKt$LoginNavigationHost$1$1$1(relativemoveto, shortNewsContentCardView2, i3), 3);
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setstatusbarbackground, setupForInsets.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.RatingCompat).invoke();
                    } else {
                        if (!(setstatusbarbackground instanceof getInsetDodgeRect)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ReconnectScheduler$schedule$1((PopulateViewStructure_androidKtpopulate7) this.RemoteActionCompatParcelizer, setstatusbarbackground, (androidx.compose.material3.SnackbarHostState) this.serializer, null, 9), 3);
                    }
                }
            }
            return createFromParcel.INSTANCE;
        }
        TextMotionLinearityCompanion textMotionLinearityCompanion = (TextMotionLinearityCompanion) obj;
        cancelPendingWebViewPause cancelpendingwebviewpause = (cancelPendingWebViewPause) this.RatingCompat;
        if (!cancelpendingwebviewpause.IconCompatParcelizer) {
            cancelpendingwebviewpause.IconCompatParcelizer = true;
            getSubpixelTextPositioningui_text getsubpixeltextpositioningui_text = ((BleScanningLifecycleObserverImpl) this.write).write;
            String str = (String) this.MediaMetadataCompat;
            int i4 = textMotionLinearityCompanion.RemoteActionCompatParcelizer;
            getsubpixeltextpositioningui_text.getClass();
            str.getClass();
            decode decodeVar = getsubpixeltextpositioningui_text.serializer;
            safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
            safesetcliptooutline.putAll(getsubpixeltextpositioningui_text.IconCompatParcelizer.write());
            safesetcliptooutline.put("vendor_id", str);
            safesetcliptooutline.put("rssi", String.valueOf(i4));
            safesetcliptooutline.put("timestamp", String.valueOf(getsubpixeltextpositioningui_text.read.instant().toEpochMilli()));
            decodeVar.logEvent("ble_first_detection", safesetcliptooutline.IconCompatParcelizer());
        }
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) ((createInAppMessageEventSubscriber) this.RemoteActionCompatParcelizer).IconCompatParcelizer;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        Integer num = ((getNone4e0Vf04) this.serializer).signalLostTimeoutSeconds;
        if (num != null) {
            ((createInAppMessageEventSubscriber) this.RemoteActionCompatParcelizer).IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(this.read, null, null, new BleScanningLifecycleObserverImpl$scan$2$1$1$1$1(num.intValue(), (BleScanningLifecycleObserverImpl) this.write, (String) this.MediaMetadataCompat, textMotionLinearityCompanion.RemoteActionCompatParcelizer, null), 3);
        }
        TextMotionCompanion textMotionCompanion = ((BleScanningLifecycleObserverImpl) this.write).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i5 = textMotionLinearityCompanion.RemoteActionCompatParcelizer;
        synchronized (textMotionCompanion) {
            textMotionCompanion.RemoteActionCompatParcelizer.add(Integer.valueOf(i5));
        }
        return createFromParcel.INSTANCE;
    }

    public getLetterSpacing(cancelPendingWebViewPause cancelpendingwebviewpause, BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl, String str, createInAppMessageEventSubscriber createinappmessageeventsubscriber, getNone4e0Vf04 getnone4e0vf04, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RatingCompat = cancelpendingwebviewpause;
        this.write = bleScanningLifecycleObserverImpl;
        this.MediaMetadataCompat = str;
        this.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
        this.serializer = getnone4e0vf04;
        this.read = getcontentviewgroupparentlayout;
    }

    public getLetterSpacing(getContentViewGroupParentLayout getcontentviewgroupparentlayout, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getStatusBarBackground getstatusbarbackground, relativeMoveTo relativemoveto, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, androidx.compose.material3.SnackbarHostState snackbarHostState) {
        this.read = getcontentviewgroupparentlayout;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = getstatusbarbackground;
        this.MediaMetadataCompat = relativemoveto;
        this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate7;
        this.serializer = snackbarHostState;
    }
}
