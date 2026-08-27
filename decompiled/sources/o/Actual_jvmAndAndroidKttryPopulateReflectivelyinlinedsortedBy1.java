package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.foundation.text.LegacyTextFieldState RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = legacyTextFieldState;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = (androidx.compose.ui.layout.LayoutCoordinates) obj;
            androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState.serializer();
            if (textLayoutResultProxySerializer != null) {
                textLayoutResultProxySerializer.write = layoutCoordinates;
            }
            return createfromparcel;
        }
        if (i != 1) {
            if (i == 2) {
                legacyTextFieldState.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(((androidx.compose.ui.text.input.ImeAction) obj).m3251unboximpl());
                return createfromparcel;
            }
            if (i == 3) {
                return Boolean.valueOf(legacyTextFieldState.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(((androidx.compose.ui.text.input.ImeAction) obj).m3251unboximpl()));
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            ((onShowTranslationui) legacyTextFieldState.RatingCompat).setValue(bool);
            return createfromparcel;
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = legacyTextFieldState.MediaBrowserCompatMediaItem;
        androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) obj;
        String text = textFieldValue.getText();
        androidx.compose.ui.text.AnnotatedString annotatedString = legacyTextFieldState.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        String text2 = annotatedString != null ? annotatedString.getText() : null;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{text, text2}, getCieXyz.write())).booleanValue()) {
            ((onShowTranslationui) legacyTextFieldState.IconCompatParcelizer).setValue(alignKFBX0sM.None);
            onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
            if (((Boolean) onshowtranslationui.getValue()).booleanValue()) {
                onshowtranslationui.setValue(Boolean.FALSE);
            } else {
                ((onShowTranslationui) legacyTextFieldState.read).setValue(Boolean.FALSE);
            }
        }
        androidx.compose.ui.text.TextRange.Companion companion = androidx.compose.ui.text.TextRange.Companion;
        ((onShowTranslationui) legacyTextFieldState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).setValue(androidx.compose.ui.text.TextRange.m3064boximpl(companion.m3081getZerod9O1mEE()));
        ((onShowTranslationui) legacyTextFieldState.serializer).setValue(androidx.compose.ui.text.TextRange.m3064boximpl(companion.m3081getZerod9O1mEE()));
        legacyTextFieldState.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.invoke(textFieldValue);
        getHandleruiannotations gethandleruiannotations = legacyTextFieldState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        getCreditCardSecurityCode getcreditcardsecuritycode = gethandleruiannotations.IconCompatParcelizer;
        if (getcreditcardsecuritycode != null) {
            getcreditcardsecuritycode.IconCompatParcelizer(gethandleruiannotations, (Object) null);
        }
        return createfromparcel;
    }
}
