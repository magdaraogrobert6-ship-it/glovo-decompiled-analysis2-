package o;

import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class preferredFrameRatekI47g10 extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.SemanticsModifierNode {
    public boolean IconCompatParcelizer;
    public androidx.compose.ui.text.input.TransformedText MediaBrowserCompatMediaItem;
    public androidx.compose.ui.text.input.OffsetMapping MediaDescriptionCompat;
    public androidx.compose.ui.text.input.TextFieldValue MediaMetadataCompat;
    public androidx.compose.foundation.text.LegacyTextFieldState MediaSessionCompatQueueItem;
    public boolean RemoteActionCompatParcelizer;
    public androidx.compose.ui.focus.FocusRequester read;
    public androidx.compose.foundation.text.selection.TextFieldSelectionManager serializer;
    public androidx.compose.ui.text.input.ImeOptions write;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        boolean z = this.IconCompatParcelizer;
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, this.MediaMetadataCompat.getAnnotatedString());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.MediaBrowserCompatMediaItem.getText());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m2835setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.MediaMetadataCompat.m3330getSelectiond9O1mEE());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentDataType.Companion.getText());
        androidx.compose.ui.autofill.FillableData fillableDataCreateFromText = androidx.compose.ui.autofill.FillableData_androidKt.createFromText(androidx.compose.ui.autofill.FillableData.Companion, this.MediaMetadataCompat.getAnnotatedString());
        if (fillableDataCreateFromText != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, fillableDataCreateFromText);
        }
        final int i = 0;
        final int i2 = 1;
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.getShouldUpdateFrameRates
            public final /* synthetic */ preferredFrameRatekI47g10 serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i3 = i;
                preferredFrameRatekI47g10 preferredframerateki47g10 = this.serializer;
                if (i3 == 0) {
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = preferredframerateki47g10.MediaSessionCompatQueueItem.MediaBrowserCompatMediaItem;
                    Boolean bool = Boolean.TRUE;
                    ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(bool);
                    ((onShowTranslationui) preferredframerateki47g10.MediaSessionCompatQueueItem.read).setValue(bool);
                    androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = preferredframerateki47g10.MediaSessionCompatQueueItem;
                    CharSequence textValue = ((androidx.compose.ui.autofill.FillableData) obj).getTextValue();
                    textValue.getClass();
                    preferredFrameRatekI47g10.IconCompatParcelizer(legacyTextFieldState, (String) textValue, preferredframerateki47g10.RemoteActionCompatParcelizer);
                    return bool;
                }
                boolean z2 = true;
                if (i3 != 1) {
                    preferredFrameRatekI47g10.IconCompatParcelizer(preferredframerateki47g10.MediaSessionCompatQueueItem, ((androidx.compose.ui.text.AnnotatedString) obj).getText(), preferredframerateki47g10.RemoteActionCompatParcelizer);
                    return Boolean.TRUE;
                }
                List list = (List) obj;
                if (preferredframerateki47g10.MediaSessionCompatQueueItem.serializer() != null) {
                    androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer = preferredframerateki47g10.MediaSessionCompatQueueItem.serializer();
                    textLayoutResultProxySerializer.getClass();
                    list.add(textLayoutResultProxySerializer.RemoteActionCompatParcelizer);
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }, 1, null);
        int iM3278getKeyboardTypePjHm6EE = this.write.m3278getKeyboardTypePjHm6EE();
        androidx.compose.ui.text.input.KeyboardType.Companion companion = androidx.compose.ui.text.input.KeyboardType.Companion;
        if (androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion.m3317getEmailPjHm6EE())) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.Companion.getEmailAddress());
        } else if (androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion.m3320getPasswordPjHm6EE()) || androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion.m3319getNumberPasswordPjHm6EE())) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.Companion.getPassword());
        } else if (androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion.m3321getPhonePjHm6EE())) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.Companion.getPhoneNumber());
        }
        if (!this.RemoteActionCompatParcelizer) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (z) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        boolean z2 = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z2);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.getShouldUpdateFrameRates
            public final /* synthetic */ preferredFrameRatekI47g10 serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i3 = i2;
                preferredFrameRatekI47g10 preferredframerateki47g10 = this.serializer;
                if (i3 == 0) {
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = preferredframerateki47g10.MediaSessionCompatQueueItem.MediaBrowserCompatMediaItem;
                    Boolean bool = Boolean.TRUE;
                    ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(bool);
                    ((onShowTranslationui) preferredframerateki47g10.MediaSessionCompatQueueItem.read).setValue(bool);
                    androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = preferredframerateki47g10.MediaSessionCompatQueueItem;
                    CharSequence textValue = ((androidx.compose.ui.autofill.FillableData) obj).getTextValue();
                    textValue.getClass();
                    preferredFrameRatekI47g10.IconCompatParcelizer(legacyTextFieldState, (String) textValue, preferredframerateki47g10.RemoteActionCompatParcelizer);
                    return bool;
                }
                boolean z3 = true;
                if (i3 != 1) {
                    preferredFrameRatekI47g10.IconCompatParcelizer(preferredframerateki47g10.MediaSessionCompatQueueItem, ((androidx.compose.ui.text.AnnotatedString) obj).getText(), preferredframerateki47g10.RemoteActionCompatParcelizer);
                    return Boolean.TRUE;
                }
                List list = (List) obj;
                if (preferredframerateki47g10.MediaSessionCompatQueueItem.serializer() != null) {
                    androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer = preferredframerateki47g10.MediaSessionCompatQueueItem.serializer();
                    textLayoutResultProxySerializer.getClass();
                    list.add(textLayoutResultProxySerializer.RemoteActionCompatParcelizer);
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        }, 1, null);
        final int i3 = 2;
        if (z2) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.getShouldUpdateFrameRates
                public final /* synthetic */ preferredFrameRatekI47g10 serializer;

                {
                    this.serializer = this;
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    int i4 = i3;
                    preferredFrameRatekI47g10 preferredframerateki47g10 = this.serializer;
                    if (i4 == 0) {
                        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = preferredframerateki47g10.MediaSessionCompatQueueItem.MediaBrowserCompatMediaItem;
                        Boolean bool = Boolean.TRUE;
                        ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(bool);
                        ((onShowTranslationui) preferredframerateki47g10.MediaSessionCompatQueueItem.read).setValue(bool);
                        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = preferredframerateki47g10.MediaSessionCompatQueueItem;
                        CharSequence textValue = ((androidx.compose.ui.autofill.FillableData) obj).getTextValue();
                        textValue.getClass();
                        preferredFrameRatekI47g10.IconCompatParcelizer(legacyTextFieldState, (String) textValue, preferredframerateki47g10.RemoteActionCompatParcelizer);
                        return bool;
                    }
                    boolean z3 = true;
                    if (i4 != 1) {
                        preferredFrameRatekI47g10.IconCompatParcelizer(preferredframerateki47g10.MediaSessionCompatQueueItem, ((androidx.compose.ui.text.AnnotatedString) obj).getText(), preferredframerateki47g10.RemoteActionCompatParcelizer);
                        return Boolean.TRUE;
                    }
                    List list = (List) obj;
                    if (preferredframerateki47g10.MediaSessionCompatQueueItem.serializer() != null) {
                        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer = preferredframerateki47g10.MediaSessionCompatQueueItem.serializer();
                        textLayoutResultProxySerializer.getClass();
                        list.add(textLayoutResultProxySerializer.RemoteActionCompatParcelizer);
                    } else {
                        z3 = false;
                    }
                    return Boolean.valueOf(z3);
                }
            }, 1, null);
            androidx.compose.ui.semantics.SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new waitForFirstLayout(this, 28, semanticsPropertyReceiver), 1, null);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(2, this), 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m2830onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.write.m3277getImeActioneUduSuo(), null, new FrameRateModifierNode(this, 6), 2, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new FrameRateModifierNode(this, 7), 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new FrameRateModifierNode(this, 1), 1, null);
        if (!androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(this.MediaMetadataCompat.m3330getSelectiond9O1mEE()) && !z) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new FrameRateModifierNode(this, 2), 1, null);
            if (this.RemoteActionCompatParcelizer) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new FrameRateModifierNode(this, 3), 1, null);
            }
        }
        if (this.RemoteActionCompatParcelizer) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new FrameRateModifierNode(this, 5), 1, null);
        }
    }

    public static void IconCompatParcelizer(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, String str, boolean z) {
        if (z) {
            androidx.compose.ui.text.input.TextInputSession textInputSession = legacyTextFieldState.MediaDescriptionCompat;
            Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 = legacyTextFieldState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (textInputSession != null) {
                androidx.compose.ui.text.input.TextFieldValue textFieldValueApply = legacyTextFieldState.ComponentActivity.apply(androidx.sqlite.SQLite.read(new androidx.compose.ui.text.input.DeleteAllCommand(), new androidx.compose.ui.text.input.CommitTextCommand(str, 1)));
                textInputSession.updateState(null, textFieldValueApply);
                actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1.invoke(textFieldValueApply);
                return;
            }
            actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1.invoke(new androidx.compose.ui.text.input.TextFieldValue(str, androidx.compose.ui.text.TextRangeKt.TextRange(str.length()), (androidx.compose.ui.text.TextRange) null, 4, (DefaultConstructorMarker) null));
        }
    }
}
