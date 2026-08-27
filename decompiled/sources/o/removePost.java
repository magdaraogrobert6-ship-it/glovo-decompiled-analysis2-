package o;

import androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class removePost implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ removePost(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.write = i;
        this.serializer = textFieldSelectionManager;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.geometry.Rect zero;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        float fIntBitsToFloat;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2;
        androidx.compose.ui.geometry.Rect cursorRect;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3;
        androidx.compose.ui.geometry.Rect cursorRect2;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates4;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates5;
        int i = this.write;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.serializer;
        if (i == 0) {
            return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(6, textFieldSelectionManager);
        }
        if (i == 1) {
            textFieldSelectionManager.MediaSessionCompatQueueItem();
            return createFromParcel.INSTANCE;
        }
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates6 = (androidx.compose.ui.layout.LayoutCoordinates) obj;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState == null) {
            zero = androidx.compose.ui.geometry.Rect.Companion.getZero();
        } else {
            if (legacyTextFieldState.MediaSessionCompatQueueItem) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int iOriginalToTransformed = textFieldSelectionManager.PlaybackStateCompatCustomAction.originalToTransformed(androidx.compose.ui.text.TextRange.m3076getStartimpl(textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE()));
                int iOriginalToTransformed2 = textFieldSelectionManager.PlaybackStateCompatCustomAction.originalToTransformed(androidx.compose.ui.text.TextRange.m3071getEndimpl(textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE()));
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                long jM493getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates5 = legacyTextFieldState2.read()) == null) ? androidx.compose.ui.geometry.Offset.Companion.m493getZeroF1C5BW0() : layoutCoordinates5.mo2220localToRootMKHz9U(textFieldSelectionManager.read(true));
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                long jM493getZeroF1C5BW1 = (legacyTextFieldState3 == null || (layoutCoordinates4 = legacyTextFieldState3.read()) == null) ? androidx.compose.ui.geometry.Offset.Companion.m493getZeroF1C5BW0() : layoutCoordinates4.mo2220localToRootMKHz9U(textFieldSelectionManager.read(false));
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                float fIntBitsToFloat2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates3 = legacyTextFieldState4.read()) == null) {
                    fIntBitsToFloat = 0.0f;
                } else {
                    androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState.serializer();
                    fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates3.mo2220localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits((textLayoutResultProxySerializer == null || (cursorRect2 = textLayoutResultProxySerializer.RemoteActionCompatParcelizer.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32))) & 4294967295L));
                }
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (legacyTextFieldState5 != null && (layoutCoordinates2 = legacyTextFieldState5.read()) != null) {
                    androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer2 = legacyTextFieldState.serializer();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (layoutCoordinates2.mo2220localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits((textLayoutResultProxySerializer2 == null || (cursorRect = textLayoutResultProxySerializer2.RemoteActionCompatParcelizer.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32))) & 4294967295L));
                }
                int i2 = (int) (jM493getZeroF1C5BW0 >> 32);
                int i3 = (int) (jM493getZeroF1C5BW1 >> 32);
                zero = new androidx.compose.ui.geometry.Rect(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), (legacyTextFieldState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer.getDensity() * androidx.compose.ui.unit.Dp.m3673constructorimpl(25.0f)) + Math.max(Float.intBitsToFloat((int) (jM493getZeroF1C5BW0 & 4294967295L)), Float.intBitsToFloat((int) (jM493getZeroF1C5BW1 & 4294967295L))));
            } else {
                zero = androidx.compose.ui.geometry.Rect.Companion.getZero();
            }
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState6 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState6 == null || (layoutCoordinates = legacyTextFieldState6.read()) == null) {
            return null;
        }
        return (layoutCoordinates.isAttached() && layoutCoordinates6.isAttached()) ? androidx.compose.ui.geometry.RectKt.m517Recttz77jQw(layoutCoordinates6.mo2218localPositionOfR5De75A(androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates), zero.m512getTopLeftF1C5BW0()), zero.m510getSizeNHjbRc()) : androidx.compose.ui.geometry.Rect.Companion.getZero();
    }
}
