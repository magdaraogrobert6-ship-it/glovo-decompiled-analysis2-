package o;

import androidx.compose.ui.platform.SoftwareKeyboardController;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FrameRateModifierNode implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ preferredFrameRatekI47g10 serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ FrameRateModifierNode(preferredFrameRatekI47g10 preferredframerateki47g10, int i) {
        this.write = i;
        this.serializer = preferredframerateki47g10;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        preferredFrameRatekI47g10 preferredframerateki47g10 = this.serializer;
        switch (i) {
            case 0:
                androidx.compose.ui.node.DelegatableNodeKt.requestAutofill(preferredframerateki47g10);
                return createfromparcel;
            case 1:
                preferredframerateki47g10.serializer.RemoteActionCompatParcelizer(true);
                break;
            case 2:
                preferredframerateki47g10.serializer.write(true);
                break;
            case 3:
                preferredframerateki47g10.serializer.IconCompatParcelizer();
                break;
            case 4:
                androidx.compose.ui.node.DelegatableNodeKt.requestAutofill(preferredframerateki47g10);
                return createfromparcel;
            case 5:
                preferredframerateki47g10.serializer.RatingCompat();
                break;
            case 6:
                preferredframerateki47g10.MediaSessionCompatQueueItem.ParcelableVolumeInfo.invoke(androidx.compose.ui.text.input.ImeAction.m3245boximpl(preferredframerateki47g10.write.m3277getImeActioneUduSuo()));
                break;
            default:
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = preferredframerateki47g10.MediaSessionCompatQueueItem;
                androidx.compose.ui.focus.FocusRequester focusRequester = preferredframerateki47g10.read;
                if (legacyTextFieldState.write()) {
                    SoftwareKeyboardController softwareKeyboardController = legacyTextFieldState.PlaybackStateCompat;
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.show();
                    }
                } else {
                    androidx.compose.ui.focus.FocusRequester.m380requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
