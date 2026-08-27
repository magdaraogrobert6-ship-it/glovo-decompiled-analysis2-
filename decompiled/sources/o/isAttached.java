package o;

/* JADX INFO: loaded from: classes.dex */
public final class isAttached implements AlignmentHorizontal {
    public final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager IconCompatParcelizer;
    public final /* synthetic */ boolean serializer;

    @Override // o.AlignmentHorizontal
    public final void serializer() {
    }

    @Override // o.AlignmentHorizontal
    public final void write(long j, seekAnimationsanimation_core seekanimationsanimation_core) {
    }

    @Override // o.AlignmentHorizontal
    public final void IconCompatParcelizer() {
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.IconCompatParcelizer;
        ((onShowTranslationui) textFieldSelectionManager.RatingCompat).setValue(null);
        ((onShowTranslationui) textFieldSelectionManager.write).setValue(null);
        textFieldSelectionManager.serializer(true);
    }

    @Override // o.AlignmentHorizontal
    public final void RemoteActionCompatParcelizer() {
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.IconCompatParcelizer;
        ((onShowTranslationui) textFieldSelectionManager.RatingCompat).setValue(null);
        ((onShowTranslationui) textFieldSelectionManager.write).setValue(null);
        textFieldSelectionManager.serializer(true);
    }

    @Override // o.AlignmentHorizontal
    public final void read(long j) {
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.IconCompatParcelizer;
        long jM482plusMKHz9U = androidx.compose.ui.geometry.Offset.m482plusMKHz9U(textFieldSelectionManager.MediaMetadataCompat, j);
        textFieldSelectionManager.MediaMetadataCompat = jM482plusMKHz9U;
        ((onShowTranslationui) textFieldSelectionManager.write).setValue(androidx.compose.ui.geometry.Offset.m466boximpl(androidx.compose.ui.geometry.Offset.m482plusMKHz9U(textFieldSelectionManager.IconCompatParcelizer, jM482plusMKHz9U)));
        androidx.compose.ui.text.input.TextFieldValue textFieldValueMediaDescriptionCompat = textFieldSelectionManager.MediaDescriptionCompat();
        androidx.compose.ui.geometry.Offset offsetWrite = textFieldSelectionManager.write();
        offsetWrite.getClass();
        androidx.compose.foundation.text.selection.TextFieldSelectionManager.IconCompatParcelizer(textFieldSelectionManager, textFieldValueMediaDescriptionCompat, offsetWrite.m487unboximpl(), false, this.serializer, getNodeannotations.read, true, androidx.compose.ui.hapticfeedback.HapticFeedbackType.m1502boximpl(androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion.m1518getTextHandleMove5zf0vsI()));
        textFieldSelectionManager.serializer(false);
    }

    public isAttached(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        this.IconCompatParcelizer = textFieldSelectionManager;
        this.serializer = z;
    }

    @Override // o.AlignmentHorizontal
    public final void write() {
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer;
        boolean z = this.serializer;
        AlignmentCompanion alignmentCompanion = z ? AlignmentCompanion.SelectionStart : AlignmentCompanion.SelectionEnd;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.IconCompatParcelizer;
        ((onShowTranslationui) textFieldSelectionManager.RatingCompat).setValue(alignmentCompanion);
        long jM111getAdjustedCoordinatesk4lQ0M = androidx.compose.foundation.text.selection.SelectionHandlesKt.m111getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.read(z));
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState == null || (textLayoutResultProxySerializer = legacyTextFieldState.serializer()) == null) {
            return;
        }
        long j = textLayoutResultProxySerializer.read(jM111getAdjustedCoordinatesk4lQ0M);
        textFieldSelectionManager.IconCompatParcelizer = j;
        ((onShowTranslationui) textFieldSelectionManager.write).setValue(androidx.compose.ui.geometry.Offset.m466boximpl(j));
        textFieldSelectionManager.MediaMetadataCompat = androidx.compose.ui.geometry.Offset.Companion.m493getZeroF1C5BW0();
        textFieldSelectionManager.ComponentActivity = -1;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState2 != null) {
            ((onShowTranslationui) legacyTextFieldState2.RatingCompat).setValue(Boolean.TRUE);
        }
        textFieldSelectionManager.serializer(false);
    }
}
