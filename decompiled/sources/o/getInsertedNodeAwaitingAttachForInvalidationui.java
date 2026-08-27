package o;

/* JADX INFO: loaded from: classes.dex */
public final class getInsertedNodeAwaitingAttachForInvalidationui implements AlignmentHorizontal {
    public final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager serializer;

    @Override // o.AlignmentHorizontal
    public final void serializer() {
    }

    @Override // o.AlignmentHorizontal
    public final void write() {
    }

    @Override // o.AlignmentHorizontal
    public final void write(long j, seekAnimationsanimation_core seekanimationsanimation_core) {
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.serializer;
        long jM111getAdjustedCoordinatesk4lQ0M = androidx.compose.foundation.text.selection.SelectionHandlesKt.m111getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.read(true));
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState == null || (textLayoutResultProxySerializer = legacyTextFieldState.serializer()) == null) {
            return;
        }
        long j2 = textLayoutResultProxySerializer.read(jM111getAdjustedCoordinatesk4lQ0M);
        textFieldSelectionManager.IconCompatParcelizer = j2;
        ((onShowTranslationui) textFieldSelectionManager.write).setValue(androidx.compose.ui.geometry.Offset.m466boximpl(j2));
        textFieldSelectionManager.MediaMetadataCompat = androidx.compose.ui.geometry.Offset.Companion.m493getZeroF1C5BW0();
        ((onShowTranslationui) textFieldSelectionManager.RatingCompat).setValue(AlignmentCompanion.Cursor);
        textFieldSelectionManager.serializer(false);
    }

    @Override // o.AlignmentHorizontal
    public final void IconCompatParcelizer() {
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.serializer;
        ((onShowTranslationui) textFieldSelectionManager.RatingCompat).setValue(null);
        ((onShowTranslationui) textFieldSelectionManager.write).setValue(null);
    }

    @Override // o.AlignmentHorizontal
    public final void RemoteActionCompatParcelizer() {
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.serializer;
        ((onShowTranslationui) textFieldSelectionManager.RatingCompat).setValue(null);
        ((onShowTranslationui) textFieldSelectionManager.write).setValue(null);
    }

    @Override // o.AlignmentHorizontal
    public final void read(long j) {
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer;
        androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.serializer;
        textFieldSelectionManager.MediaMetadataCompat = androidx.compose.ui.geometry.Offset.m482plusMKHz9U(textFieldSelectionManager.MediaMetadataCompat, j);
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState == null || (textLayoutResultProxySerializer = legacyTextFieldState.serializer()) == null) {
            return;
        }
        ((onShowTranslationui) textFieldSelectionManager.write).setValue(androidx.compose.ui.geometry.Offset.m466boximpl(androidx.compose.ui.geometry.Offset.m482plusMKHz9U(textFieldSelectionManager.IconCompatParcelizer, textFieldSelectionManager.MediaMetadataCompat)));
        androidx.compose.ui.text.input.OffsetMapping offsetMapping = textFieldSelectionManager.PlaybackStateCompatCustomAction;
        androidx.compose.ui.geometry.Offset offsetWrite = textFieldSelectionManager.write();
        offsetWrite.getClass();
        int iTransformedToOriginal = offsetMapping.transformedToOriginal(textLayoutResultProxySerializer.IconCompatParcelizer(offsetWrite.m487unboximpl(), true));
        long jTextRange = androidx.compose.ui.text.TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
        if (androidx.compose.ui.text.TextRange.m3069equalsimpl0(jTextRange, textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE())) {
            return;
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if ((legacyTextFieldState2 == null || ((Boolean) ((onShowTranslationui) legacyTextFieldState2.RatingCompat).getValue()).booleanValue()) && (hapticFeedback = textFieldSelectionManager.MediaSessionCompatResultReceiverWrapper) != null) {
            hapticFeedback.mo1501performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion.m1518getTextHandleMove5zf0vsI());
        }
        textFieldSelectionManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.invoke(androidx.compose.foundation.text.selection.TextFieldSelectionManager.serializer(textFieldSelectionManager.MediaDescriptionCompat().getAnnotatedString(), jTextRange));
        textFieldSelectionManager.MediaSessionCompatToken = androidx.compose.ui.text.TextRange.m3064boximpl(jTextRange);
    }

    public getInsertedNodeAwaitingAttachForInvalidationui(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        this.serializer = textFieldSelectionManager;
    }
}
