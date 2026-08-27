package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class EditProcessor {
    public static final int $stable = 8;
    private EditingBuffer mBuffer;
    private TextFieldValue mBufferState;

    public final EditingBuffer getMBuffer$ui_text() {
        return this.mBuffer;
    }

    public final TextFieldValue getMBufferState$ui_text() {
        return this.mBufferState;
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, EditCommand editCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text() + ", composition=" + this.mBuffer.m3242getCompositionMzsxiRA$ui_text() + ", selection=" + ((Object) TextRange.m3079toStringimpl(this.mBuffer.m3243getSelectiond9O1mEE$ui_text())) + "):");
        sb.append('\n');
        onContentCardDismissed.IconCompatParcelizer(list, sb, new Navigator$$ExternalSyntheticLambda1(editCommand, 14, this), 60);
        return sb.toString();
    }

    public final TextFieldValue apply(List<? extends EditCommand> list) {
        EditCommand editCommand;
        try {
            int size = list.size();
            int i = 0;
            editCommand = null;
            while (i < size) {
                try {
                    EditCommand editCommand2 = list.get(i);
                    try {
                        editCommand2.applyTo(this.mBuffer);
                        i++;
                        editCommand = editCommand2;
                    } catch (Exception e) {
                        e = e;
                        editCommand = editCommand2;
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(generateBatchErrorMessage(list, editCommand), e);
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            AnnotatedString annotatedString$ui_text = this.mBuffer.toAnnotatedString$ui_text();
            long jM3243getSelectiond9O1mEE$ui_text = this.mBuffer.m3243getSelectiond9O1mEE$ui_text();
            TextRange textRangeM3064boximpl = TextRange.m3064boximpl(jM3243getSelectiond9O1mEE$ui_text);
            textRangeM3064boximpl.m3080unboximpl();
            TextRange textRange = TextRange.m3075getReversedimpl(this.mBufferState.m3330getSelectiond9O1mEE()) ? null : textRangeM3064boximpl;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text, textRange != null ? textRange.m3080unboximpl() : TextRangeKt.TextRange(TextRange.m3073getMaximpl(jM3243getSelectiond9O1mEE$ui_text), TextRange.m3074getMinimpl(jM3243getSelectiond9O1mEE$ui_text)), this.mBuffer.m3242getCompositionMzsxiRA$ui_text(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e3) {
            e = e3;
            editCommand = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence generateBatchErrorMessage$lambda$0$0(EditCommand editCommand, EditProcessor editProcessor, EditCommand editCommand2) {
        String str;
        if (editCommand == editCommand2) {
            str = " > ";
        } else {
            str = "   ";
        }
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str);
        sbM.append(editProcessor.toStringForLog(editCommand2));
        return sbM.toString();
    }

    public final void reset(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        TextFieldValue textFieldValueM3325copy3r_uNRQ$default;
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textFieldValue.m3329getCompositionMzsxiRA(), this.mBuffer.m3242getCompositionMzsxiRA$ui_text()}, getCieXyz.write())).booleanValue();
        boolean z = true;
        boolean z2 = false;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mBufferState.getAnnotatedString().getText(), textFieldValue.getAnnotatedString().getText()}, getCieXyz.write())).booleanValue()) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m3330getSelectiond9O1mEE(), (DefaultConstructorMarker) null);
        } else if (TextRange.m3069equalsimpl0(this.mBufferState.m3330getSelectiond9O1mEE(), textFieldValue.m3330getSelectiond9O1mEE())) {
            z = false;
        } else {
            this.mBuffer.setSelection$ui_text(TextRange.m3074getMinimpl(textFieldValue.m3330getSelectiond9O1mEE()), TextRange.m3073getMaximpl(textFieldValue.m3330getSelectiond9O1mEE()));
            z2 = true;
            z = false;
        }
        if (textFieldValue.m3329getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text();
        } else if (!TextRange.m3070getCollapsedimpl(textFieldValue.m3329getCompositionMzsxiRA().m3080unboximpl())) {
            this.mBuffer.setComposition$ui_text(TextRange.m3074getMinimpl(textFieldValue.m3329getCompositionMzsxiRA().m3080unboximpl()), TextRange.m3073getMaximpl(textFieldValue.m3329getCompositionMzsxiRA().m3080unboximpl()));
        }
        if (z || !(z2 || zBooleanValue)) {
            this.mBuffer.commitComposition$ui_text();
            textFieldValueM3325copy3r_uNRQ$default = TextFieldValue.m3325copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        } else {
            textFieldValueM3325copy3r_uNRQ$default = textFieldValue;
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValueM3325copy3r_uNRQ$default;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValueM3325copy3r_uNRQ$default);
        }
    }

    public EditProcessor() {
        TextFieldValue textFieldValue = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m3081getZerod9O1mEE(), (TextRange) null, (DefaultConstructorMarker) null);
        this.mBufferState = textFieldValue;
        this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), this.mBufferState.m3330getSelectiond9O1mEE(), (DefaultConstructorMarker) null);
    }

    private final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingRegionCommand) {
            return ((SetComposingRegionCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteSurroundingTextCommand) {
            return ((DeleteSurroundingTextCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return ((DeleteSurroundingTextInCodePointsCommand) editCommand).toString();
        }
        if (editCommand instanceof SetSelectionCommand) {
            return ((SetSelectionCommand) editCommand).toString();
        }
        if (editCommand instanceof FinishComposingTextCommand) {
            return ((FinishComposingTextCommand) editCommand).toString();
        }
        if (editCommand instanceof BackspaceCommand) {
            return ((BackspaceCommand) editCommand).toString();
        }
        if (editCommand instanceof MoveCursorCommand) {
            return ((MoveCursorCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteAllCommand) {
            return ((DeleteAllCommand) editCommand).toString();
        }
        String strIconCompatParcelizer = displayInAppMessagelambda1.serializer(editCommand.getClass()).IconCompatParcelizer();
        if (strIconCompatParcelizer == null) {
            strIconCompatParcelizer = "{anonymous EditCommand}";
        }
        return "Unknown EditCommand: ".concat(strIconCompatParcelizer);
    }
}
