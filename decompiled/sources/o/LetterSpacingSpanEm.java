package o;

import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import bo.app.a5$$ExternalSyntheticLambda0;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LetterSpacingSpanEm implements isPunctuationStartBoundary, asFrameworkPaint {
    private static int MediaSessionCompatToken = 0;
    private static int ParcelableVolumeInfo = 1;
    public androidx.compose.ui.platform.ComposeView IconCompatParcelizer;
    public final getEllipsizedLeftPaddingdefault MediaBrowserCompatMediaItem;
    public final isPunctuationui_text MediaDescriptionCompat;
    public final getEllipsizedLeftPadding MediaMetadataCompat;
    public final WindowManager MediaSessionCompatResultReceiverWrapper;
    public onCanceled RatingCompat;
    public final updateMeasureState read;
    public final SignInDataStore serializer;
    public final accessisEllipsisMW5ApA write;
    public final getFilterQualityfv9h1I MediaSessionCompatQueueItem = new getFilterQualityfv9h1I();
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new BrazeUser$$ExternalSyntheticLambda28(24, this));

    @Override // o.asFrameworkPaint
    public final getFilterQualityfv9h1I getViewModelStore() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 35;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaSessionCompatQueueItem;
        }
        throw null;
    }

    public LetterSpacingSpanEm(WindowManager windowManager, accessisEllipsisMW5ApA accessisellipsismw5apa, isPunctuationui_text ispunctuationui_text, updateMeasureState updatemeasurestate, getEllipsizedLeftPaddingdefault getellipsizedleftpaddingdefault, getEllipsizedLeftPadding getellipsizedleftpadding, SignInDataStore signInDataStore) {
        this.MediaSessionCompatResultReceiverWrapper = windowManager;
        this.write = accessisellipsismw5apa;
        this.MediaDescriptionCompat = ispunctuationui_text;
        this.read = updatemeasurestate;
        this.MediaBrowserCompatMediaItem = getellipsizedleftpaddingdefault;
        this.MediaMetadataCompat = getellipsizedleftpadding;
        this.serializer = signInDataStore;
    }

    public final void serializer() {
        accessregisterComponentCallback accessregistercomponentcallback;
        int i = 2 % 2;
        androidx.compose.ui.platform.ComposeView composeView = this.IconCompatParcelizer;
        if (composeView == null) {
            return;
        }
        try {
            composeView.disposeComposition();
            onCanceled oncanceled = this.RatingCompat;
            if (oncanceled != null && (accessregistercomponentcallback = oncanceled.write) != null) {
                int i2 = ParcelableVolumeInfo + 49;
                MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                toColorLong8_81llA tocolorlong8_81lla = accessregistercomponentcallback.RatingCompat;
                if (tocolorlong8_81lla != null) {
                    int i4 = ParcelableVolumeInfo + 107;
                    MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    if (tocolorlong8_81lla.isAtLeast(toColorLong8_81llA.CREATED)) {
                        int i6 = ParcelableVolumeInfo + 123;
                        MediaSessionCompatToken = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        onCanceled oncanceled2 = this.RatingCompat;
                        if (oncanceled2 != null) {
                            AndroidColorSpace_androidKt androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_DESTROY;
                            androidColorSpace_androidKt.getClass();
                            oncanceled2.write.serializer(androidColorSpace_androidKt);
                        }
                    }
                }
            }
            this.MediaSessionCompatResultReceiverWrapper.removeView(this.IconCompatParcelizer);
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Delivery Acceptance Overlay : Failed to remove view accept from WindowManager", new Object[0]);
        }
        this.IconCompatParcelizer = null;
        this.RatingCompat = null;
        this.MediaSessionCompatQueueItem.read();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery Acceptance Overlay : Hiding accept overlay view", new Object[0]);
    }

    public static final void read(LetterSpacingSpanEm letterSpacingSpanEm, Context context, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 101;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            androidx.compose.ui.platform.ComposeView composeView = letterSpacingSpanEm.IconCompatParcelizer;
            obj.hashCode();
            throw null;
        }
        if (letterSpacingSpanEm.IconCompatParcelizer != null) {
            return;
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery Acceptance Overlay : Showing accept overlay view", new Object[0]);
        androidx.compose.ui.platform.ComposeView composeView2 = new androidx.compose.ui.platform.ComposeView(context, null, 0, 6, null);
        composeView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        coil3.util.UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView2, false, new DragAndDropTargetModifierNode(new GapComposerKt$$ExternalSyntheticLambda0(composeView2, 18, dragAndDropTargetModifierNode), true, 529060539)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        onCanceled oncanceled = new onCanceled(1);
        accessregisterComponentCallback accessregistercomponentcallback = new accessregisterComponentCallback(oncanceled, true);
        oncanceled.write = accessregistercomponentcallback;
        getWhite0d7_KjU getwhite0d7_kju = new getWhite0d7_KjU(new getRed0d7_KjU(oncanceled, new a5$$ExternalSyntheticLambda0(12, oncanceled)));
        oncanceled.read = getwhite0d7_kju;
        getwhite0d7_kju.RemoteActionCompatParcelizer(null);
        AndroidColorSpace_androidKt androidColorSpace_androidKt = AndroidColorSpace_androidKt.ON_CREATE;
        androidColorSpace_androidKt.getClass();
        accessregistercomponentcallback.serializer(androidColorSpace_androidKt);
        composeView2.setTag(com.logistics.rider.glovo.R.id.view_tree_lifecycle_owner, oncanceled);
        composeView2.setTag(com.logistics.rider.glovo.R.id.view_tree_view_model_store_owner, letterSpacingSpanEm);
        composeView2.setTag(com.logistics.rider.glovo.R.id.view_tree_saved_state_registry_owner, oncanceled);
        AndroidColorSpace_androidKt androidColorSpace_androidKt2 = AndroidColorSpace_androidKt.ON_START;
        androidColorSpace_androidKt2.getClass();
        accessregistercomponentcallback.serializer(androidColorSpace_androidKt2);
        AndroidColorSpace_androidKt androidColorSpace_androidKt3 = AndroidColorSpace_androidKt.ON_RESUME;
        androidColorSpace_androidKt3.getClass();
        accessregistercomponentcallback.serializer(androidColorSpace_androidKt3);
        letterSpacingSpanEm.RatingCompat = oncanceled;
        letterSpacingSpanEm.IconCompatParcelizer = composeView2;
        try {
            letterSpacingSpanEm.MediaSessionCompatResultReceiverWrapper.addView(letterSpacingSpanEm.IconCompatParcelizer, new WindowManager.LayoutParams(-1, -1, 2038, 8, -2));
            int i3 = MediaSessionCompatToken + 103;
            ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Delivery Acceptance Overlay : Failed to add the accept screen overlay to the window manager.", new Object[0]);
        }
    }
}
