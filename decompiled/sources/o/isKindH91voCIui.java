package o;

/* JADX INFO: loaded from: classes.dex */
public final class isKindH91voCIui implements AlignmentHorizontal {
    public androidx.compose.ui.text.TextRange IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer = true;
    public seekAnimationsanimation_core serializer = getNodeannotations.write;
    public final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager write;

    @Override // o.AlignmentHorizontal
    public final void IconCompatParcelizer() {
        read();
    }

    @Override // o.AlignmentHorizontal
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // o.AlignmentHorizontal
    public final void serializer() {
        read();
    }

    @Override // o.AlignmentHorizontal
    public final void write() {
    }

    public final void read() {
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.write;
        ((onShowTranslationui) textFieldSelectionManager.RatingCompat).setValue(null);
        ((onShowTranslationui) textFieldSelectionManager.write).setValue(null);
        this.serializer = getNodeannotations.write;
        textFieldSelectionManager.serializer(true);
        androidx.compose.ui.text.TextRange textRange = this.IconCompatParcelizer;
        boolean zM3070getCollapsedimpl = androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(textRange != null ? textRange.m3080unboximpl() : textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE());
        textFieldSelectionManager.serializer(zM3070getCollapsedimpl ? alignKFBX0sM.Cursor : alignKFBX0sM.Selection);
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState != null) {
            ((onShowTranslationui) legacyTextFieldState.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).setValue(Boolean.valueOf(!zM3070getCollapsedimpl && onReset.IconCompatParcelizer(textFieldSelectionManager, true)));
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState2 != null) {
            ((onShowTranslationui) legacyTextFieldState2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss).setValue(Boolean.valueOf(!zM3070getCollapsedimpl && onReset.IconCompatParcelizer(textFieldSelectionManager, false)));
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState3 != null) {
            ((onShowTranslationui) legacyTextFieldState3.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4).setValue(Boolean.valueOf(zM3070getCollapsedimpl && onReset.IconCompatParcelizer(textFieldSelectionManager, true)));
        }
        if (this.RemoteActionCompatParcelizer) {
            androidx.compose.foundation.text.selection.TextFieldSelectionManager.write(textFieldSelectionManager, textFieldSelectionManager.RemoteActionCompatParcelizer);
        }
        textFieldSelectionManager.RemoteActionCompatParcelizer = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ac  */
    @Override // o.AlignmentHorizontal
    public final void read(long j) {
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer;
        androidx.compose.ui.text.TextRange textRange;
        int iIconCompatParcelizer;
        long jIconCompatParcelizer;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.write;
        if (!textFieldSelectionManager.RemoteActionCompatParcelizer() || textFieldSelectionManager.MediaDescriptionCompat().getText().length() == 0) {
            return;
        }
        textFieldSelectionManager.MediaMetadataCompat = androidx.compose.ui.geometry.Offset.m482plusMKHz9U(textFieldSelectionManager.MediaMetadataCompat, j);
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState != null && (textLayoutResultProxySerializer = legacyTextFieldState.serializer()) != null) {
            ((onShowTranslationui) textFieldSelectionManager.write).setValue(androidx.compose.ui.geometry.Offset.m466boximpl(androidx.compose.ui.geometry.Offset.m482plusMKHz9U(textFieldSelectionManager.IconCompatParcelizer, textFieldSelectionManager.MediaMetadataCompat)));
            if (textFieldSelectionManager.RemoteActionCompatParcelizer == null) {
                androidx.compose.ui.geometry.Offset offsetWrite = textFieldSelectionManager.write();
                offsetWrite.getClass();
                if (textLayoutResultProxySerializer.m102isPositionOnTextk4lQ0M(offsetWrite.m487unboximpl())) {
                    textRange = textFieldSelectionManager.RemoteActionCompatParcelizer;
                    if (textRange != null) {
                        iIconCompatParcelizer = androidx.compose.ui.text.TextRange.m3076getStartimpl(textRange.m3080unboximpl());
                    } else {
                        iIconCompatParcelizer = textLayoutResultProxySerializer.IconCompatParcelizer(textFieldSelectionManager.IconCompatParcelizer, false);
                    }
                    androidx.compose.ui.geometry.Offset offsetWrite2 = textFieldSelectionManager.write();
                    offsetWrite2.getClass();
                    int iIconCompatParcelizer2 = textLayoutResultProxySerializer.IconCompatParcelizer(offsetWrite2.m487unboximpl(), false);
                    if (textFieldSelectionManager.RemoteActionCompatParcelizer != null && iIconCompatParcelizer == iIconCompatParcelizer2) {
                        return;
                    }
                    androidx.compose.ui.text.input.TextFieldValue textFieldValueMediaDescriptionCompat = textFieldSelectionManager.MediaDescriptionCompat();
                    androidx.compose.ui.geometry.Offset offsetWrite3 = textFieldSelectionManager.write();
                    offsetWrite3.getClass();
                    jIconCompatParcelizer = androidx.compose.foundation.text.selection.TextFieldSelectionManager.IconCompatParcelizer(textFieldSelectionManager, textFieldValueMediaDescriptionCompat, offsetWrite3.m487unboximpl(), false, false, this.serializer, true, androidx.compose.ui.hapticfeedback.HapticFeedbackType.m1502boximpl(androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion.m1518getTextHandleMove5zf0vsI()));
                } else {
                    int iTransformedToOriginal = textFieldSelectionManager.PlaybackStateCompatCustomAction.transformedToOriginal(textLayoutResultProxySerializer.IconCompatParcelizer(textFieldSelectionManager.IconCompatParcelizer, true));
                    androidx.compose.ui.text.input.OffsetMapping offsetMapping = textFieldSelectionManager.PlaybackStateCompatCustomAction;
                    androidx.compose.ui.geometry.Offset offsetWrite4 = textFieldSelectionManager.write();
                    offsetWrite4.getClass();
                    seekAnimationsanimation_core seekanimationsanimation_core = iTransformedToOriginal == offsetMapping.transformedToOriginal(textLayoutResultProxySerializer.IconCompatParcelizer(offsetWrite4.m487unboximpl(), true)) ? getNodeannotations.write : getNodeannotations.RatingCompat;
                    androidx.compose.ui.text.input.TextFieldValue textFieldValueMediaDescriptionCompat2 = textFieldSelectionManager.MediaDescriptionCompat();
                    androidx.compose.ui.geometry.Offset offsetWrite5 = textFieldSelectionManager.write();
                    offsetWrite5.getClass();
                    jIconCompatParcelizer = androidx.compose.foundation.text.selection.TextFieldSelectionManager.IconCompatParcelizer(textFieldSelectionManager, textFieldValueMediaDescriptionCompat2, offsetWrite5.m487unboximpl(), false, false, seekanimationsanimation_core, true, androidx.compose.ui.hapticfeedback.HapticFeedbackType.m1502boximpl(androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion.m1518getTextHandleMove5zf0vsI()));
                }
            } else {
                textRange = textFieldSelectionManager.RemoteActionCompatParcelizer;
                if (textRange != null) {
                    iIconCompatParcelizer = androidx.compose.ui.text.TextRange.m3076getStartimpl(textRange.m3080unboximpl());
                } else {
                    iIconCompatParcelizer = textLayoutResultProxySerializer.IconCompatParcelizer(textFieldSelectionManager.IconCompatParcelizer, false);
                }
                androidx.compose.ui.geometry.Offset offsetWrite6 = textFieldSelectionManager.write();
                offsetWrite6.getClass();
                int iIconCompatParcelizer3 = textLayoutResultProxySerializer.IconCompatParcelizer(offsetWrite6.m487unboximpl(), false);
                if (textFieldSelectionManager.RemoteActionCompatParcelizer != null) {
                }
                androidx.compose.ui.text.input.TextFieldValue textFieldValueMediaDescriptionCompat3 = textFieldSelectionManager.MediaDescriptionCompat();
                androidx.compose.ui.geometry.Offset offsetWrite7 = textFieldSelectionManager.write();
                offsetWrite7.getClass();
                jIconCompatParcelizer = androidx.compose.foundation.text.selection.TextFieldSelectionManager.IconCompatParcelizer(textFieldSelectionManager, textFieldValueMediaDescriptionCompat3, offsetWrite7.m487unboximpl(), false, false, this.serializer, true, androidx.compose.ui.hapticfeedback.HapticFeedbackType.m1502boximpl(androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion.m1518getTextHandleMove5zf0vsI()));
            }
            this.IconCompatParcelizer = androidx.compose.ui.text.TextRange.m3064boximpl(jIconCompatParcelizer);
            if (!androidx.compose.ui.text.TextRange.m3068equalsimpl(jIconCompatParcelizer, textFieldSelectionManager.RemoteActionCompatParcelizer)) {
                this.RemoteActionCompatParcelizer = false;
            }
        }
        textFieldSelectionManager.serializer(false);
    }

    @Override // o.AlignmentHorizontal
    public final void write(long j, seekAnimationsanimation_core seekanimationsanimation_core) {
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer;
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer2;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.write;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = textFieldSelectionManager.RatingCompat;
        if (textFieldSelectionManager.RemoteActionCompatParcelizer()) {
            onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
            if (((AlignmentCompanion) onshowtranslationui.getValue()) != null) {
                return;
            }
            onshowtranslationui.setValue(AlignmentCompanion.SelectionEnd);
            textFieldSelectionManager.ComponentActivity = -1;
            this.RemoteActionCompatParcelizer = true;
            this.serializer = seekanimationsanimation_core;
            textFieldSelectionManager.MediaMetadataCompat();
            androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (legacyTextFieldState == null || (textLayoutResultProxySerializer2 = legacyTextFieldState.serializer()) == null || !textLayoutResultProxySerializer2.m102isPositionOnTextk4lQ0M(j)) {
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (legacyTextFieldState2 != null && (textLayoutResultProxySerializer = legacyTextFieldState2.serializer()) != null) {
                    int iTransformedToOriginal = textFieldSelectionManager.PlaybackStateCompatCustomAction.transformedToOriginal(textLayoutResultProxySerializer.IconCompatParcelizer(j, true));
                    androidx.compose.ui.text.input.TextFieldValue textFieldValueSerializer = androidx.compose.foundation.text.selection.TextFieldSelectionManager.serializer(textFieldSelectionManager.MediaDescriptionCompat().getAnnotatedString(), androidx.compose.ui.text.TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                    textFieldSelectionManager.RemoteActionCompatParcelizer(false);
                    androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback = textFieldSelectionManager.MediaSessionCompatResultReceiverWrapper;
                    if (hapticFeedback != null) {
                        hapticFeedback.mo1501performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion.m1514getLongPress5zf0vsI());
                    }
                    textFieldSelectionManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.invoke(textFieldValueSerializer);
                    textFieldSelectionManager.MediaSessionCompatToken = androidx.compose.ui.text.TextRange.m3064boximpl(textFieldValueSerializer.m3330getSelectiond9O1mEE());
                }
                this.RemoteActionCompatParcelizer = false;
            } else {
                if (textFieldSelectionManager.MediaDescriptionCompat().getText().length() == 0) {
                    return;
                }
                textFieldSelectionManager.RemoteActionCompatParcelizer(false);
                long jIconCompatParcelizer = androidx.compose.foundation.text.selection.TextFieldSelectionManager.IconCompatParcelizer(textFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue.m3325copy3r_uNRQ$default(textFieldSelectionManager.MediaDescriptionCompat(), (androidx.compose.ui.text.AnnotatedString) null, androidx.compose.ui.text.TextRange.Companion.m3081getZerod9O1mEE(), (androidx.compose.ui.text.TextRange) null, 5, (Object) null), j, true, false, this.serializer, true, androidx.compose.ui.hapticfeedback.HapticFeedbackType.m1502boximpl(androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion.m1514getLongPress5zf0vsI()));
                textFieldSelectionManager.RemoteActionCompatParcelizer = androidx.compose.ui.text.TextRange.m3064boximpl(jIconCompatParcelizer);
                this.IconCompatParcelizer = androidx.compose.ui.text.TextRange.m3064boximpl(jIconCompatParcelizer);
            }
            textFieldSelectionManager.serializer(alignKFBX0sM.None);
            textFieldSelectionManager.IconCompatParcelizer = j;
            ((onShowTranslationui) textFieldSelectionManager.write).setValue(androidx.compose.ui.geometry.Offset.m466boximpl(j));
            textFieldSelectionManager.MediaMetadataCompat = androidx.compose.ui.geometry.Offset.Companion.m493getZeroF1C5BW0();
        }
    }

    public isKindH91voCIui(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        this.write = textFieldSelectionManager;
    }
}
