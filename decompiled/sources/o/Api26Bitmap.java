package o;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import bo.app.n$$ExternalSyntheticLambda3;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.Perseus;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Api26Bitmap implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer = 1;
    public final /* synthetic */ Object write;

    public /* synthetic */ Api26Bitmap(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.ui.focus.FocusRequester focusRequester, boolean z, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.OffsetMapping offsetMapping) {
        this.write = legacyTextFieldState;
        this.read = focusRequester;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = textFieldSelectionManager;
        this.MediaDescriptionCompat = offsetMapping;
    }

    public /* synthetic */ Api26Bitmap(cancelPendingWebViewPause cancelpendingwebviewpause, cancelPendingWebViewPause cancelpendingwebviewpause2, toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0, boolean z, BrazeContentCardsManager brazeContentCardsManager) {
        this.write = cancelpendingwebviewpause;
        this.read = cancelpendingwebviewpause2;
        this.IconCompatParcelizer = toandroidtilemode0vamqd0;
        this.RemoteActionCompatParcelizer = z;
        this.MediaDescriptionCompat = brazeContentCardsManager;
    }

    public /* synthetic */ Api26Bitmap(boolean z, CustomerChatManagerImpl customerChatManagerImpl, SurfaceUtils surfaceUtils, n$$ExternalSyntheticLambda3 n__externalsyntheticlambda3, SessionDao_Impl$$ExternalSyntheticLambda1 sessionDao_Impl$$ExternalSyntheticLambda1) {
        this.RemoteActionCompatParcelizer = z;
        this.write = customerChatManagerImpl;
        this.read = surfaceUtils;
        this.IconCompatParcelizer = n__externalsyntheticlambda3;
        this.MediaDescriptionCompat = sessionDao_Impl$$ExternalSyntheticLambda1;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        setSpotShadowColor setspotshadowcolor;
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.MediaDescriptionCompat;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.read;
        Object obj5 = this.write;
        boolean z = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            cubicTo cubicto = (cubicTo) obj;
            cubicto.getClass();
            ((cancelPendingWebViewPause) obj5).IconCompatParcelizer = true;
            ((cancelPendingWebViewPause) obj4).IconCompatParcelizer = true;
            ((toAndroidTileMode0vamqd0) obj3).write(cubicto, z, (BrazeContentCardsManager) obj2);
            return createfromparcel;
        }
        Object obj6 = null;
        if (i2 != 1) {
            CustomerChatManagerImpl customerChatManagerImpl = (CustomerChatManagerImpl) obj5;
            SurfaceUtils surfaceUtils = (SurfaceUtils) obj4;
            n$$ExternalSyntheticLambda3 n__externalsyntheticlambda3 = (n$$ExternalSyntheticLambda3) obj3;
            SessionDao_Impl$$ExternalSyntheticLambda1 sessionDao_Impl$$ExternalSyntheticLambda1 = (SessionDao_Impl$$ExternalSyntheticLambda1) obj2;
            LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image11 = (LayerSnapshotV22toBitmap2image11) obj;
            layerSnapshotV22toBitmap2image11.getClass();
            layerSnapshotV22toBitmap2image11.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = Boolean.valueOf(z);
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) customerChatManagerImpl.IconCompatParcelizer;
            layerSnapshotV22toBitmap2image11.MediaSessionCompatQueueItem = Boolean.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ANDROID_16_WEBVIEW_CRASH_FIX_ENABLED));
            layerSnapshotV22toBitmap2image11.MediaDescriptionCompat = Boolean.valueOf(firebaseRemoteConfigImpl.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
            switch (fireGlobalChangeEntries.IconCompatParcelizer[customerChatManagerImpl.serializer.serializer().ordinal()]) {
                case 1:
                    setspotshadowcolor = SurfaceVerificationHelper.INSTANCE;
                    break;
                case 2:
                    setspotshadowcolor = lockCanvasFallback.INSTANCE;
                    break;
                case 3:
                    setspotshadowcolor = isLockHardwareCanvasAvailable.INSTANCE;
                    break;
                case 4:
                    setspotshadowcolor = ViewLayer.INSTANCE;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    setspotshadowcolor = lockCanvas.INSTANCE;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
            }
            setspotshadowcolor.getClass();
            layerSnapshotV22toBitmap2image11.ComponentActivity = setspotshadowcolor;
            String strSerializer = Perseus.serializer();
            strSerializer.getClass();
            layerSnapshotV22toBitmap2image11.MediaBrowserCompatMediaItem = strSerializer;
            layerSnapshotV22toBitmap2image11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new LayerSnapshotV28GraphicsLayerPicture(surfaceUtils, n__externalsyntheticlambda3, sessionDao_Impl$$ExternalSyntheticLambda1);
            return createfromparcel;
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = (androidx.compose.foundation.text.LegacyTextFieldState) obj5;
        androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) obj4;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) obj3;
        androidx.compose.ui.text.input.OffsetMapping offsetMapping = (androidx.compose.ui.text.input.OffsetMapping) obj2;
        androidx.compose.ui.geometry.Offset offset = (androidx.compose.ui.geometry.Offset) obj;
        if (legacyTextFieldState.write()) {
            SoftwareKeyboardController softwareKeyboardController = legacyTextFieldState.PlaybackStateCompat;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.show();
            }
        } else {
            androidx.compose.ui.focus.FocusRequester.m380requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        if (legacyTextFieldState.write() && z) {
            if (legacyTextFieldState.IconCompatParcelizer() != alignKFBX0sM.Selection) {
                int i3 = MediaMetadataCompat + 123;
                MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    legacyTextFieldState.serializer();
                    obj6.hashCode();
                    throw null;
                }
                androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState.serializer();
                if (textLayoutResultProxySerializer != null) {
                    long jM487unboximpl = offset.m487unboximpl();
                    androidx.compose.ui.text.input.EditProcessor editProcessor = legacyTextFieldState.ComponentActivity;
                    legacyTextFieldState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.invoke(androidx.compose.ui.text.input.TextFieldValue.m3325copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (androidx.compose.ui.text.AnnotatedString) null, androidx.compose.ui.text.TextRangeKt.TextRange(offsetMapping.transformedToOriginal(textLayoutResultProxySerializer.IconCompatParcelizer(jM487unboximpl, true))), (androidx.compose.ui.text.TextRange) null, 5, (Object) null));
                    if (legacyTextFieldState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.MediaMetadataCompat.length() > 0) {
                        int i4 = MediaMetadataCompat + 65;
                        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            ((onShowTranslationui) legacyTextFieldState.IconCompatParcelizer).setValue(alignKFBX0sM.Cursor);
                            obj6.hashCode();
                            throw null;
                        }
                        ((onShowTranslationui) legacyTextFieldState.IconCompatParcelizer).setValue(alignKFBX0sM.Cursor);
                    }
                }
            } else {
                textFieldSelectionManager.write(offset);
            }
        }
        int i5 = MediaSessionCompatQueueItem + 27;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
