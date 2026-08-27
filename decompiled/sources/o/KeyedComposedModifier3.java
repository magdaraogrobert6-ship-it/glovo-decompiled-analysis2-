package o;

import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class KeyedComposedModifier3 implements InputConnection {
    public int IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final androidx.compose.foundation.text.LegacyTextFieldState MediaDescriptionCompat;
    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager MediaMetadataCompat;
    public androidx.compose.ui.text.input.TextFieldValue MediaSessionCompatQueueItem;
    public final androidx.compose.ui.platform.ViewConfiguration MediaSessionCompatResultReceiverWrapper;
    public final boolean RemoteActionCompatParcelizer;
    public final androidx.camera.view.PendingValue read;
    public int serializer;
    public final ArrayList write = new ArrayList();
    public boolean RatingCompat = true;

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.RatingCompat;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.RatingCompat;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.RatingCompat;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return read();
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.RatingCompat;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.write.clear();
        this.serializer = 0;
        this.RatingCompat = false;
        ArrayList arrayList = ((getKey2) this.read.serializer).RemoteActionCompatParcelizer;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object[] objArr = {((java.lang.ref.WeakReference) arrayList.get(i)).get(), this};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.MediaSessionCompatQueueItem.getText(), androidx.compose.ui.text.TextRange.m3074getMinimpl(this.MediaSessionCompatQueueItem.m3330getSelectiond9O1mEE()), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(this.MediaSessionCompatQueueItem.m3330getSelectiond9O1mEE())) {
            return null;
        }
        return androidx.compose.ui.text.input.TextFieldValueKt.getSelectedText(this.MediaSessionCompatQueueItem).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return androidx.compose.ui.text.input.TextFieldValueKt.getTextAfterSelection(this.MediaSessionCompatQueueItem, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return androidx.compose.ui.text.input.TextFieldValueKt.getTextBeforeSelection(this.MediaSessionCompatQueueItem, i).toString();
    }

    public KeyedComposedModifier3(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.camera.view.PendingValue pendingValue, boolean z, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        this.read = pendingValue;
        this.RemoteActionCompatParcelizer = z;
        this.MediaDescriptionCompat = legacyTextFieldState;
        this.MediaMetadataCompat = textFieldSelectionManager;
        this.MediaSessionCompatResultReceiverWrapper = viewConfiguration;
        this.MediaSessionCompatQueueItem = textFieldValue;
    }

    public final void write(int i) {
        sendKeyEvent(new android.view.KeyEvent(0, i));
        sendKeyEvent(new android.view.KeyEvent(1, i));
    }

    public final void IconCompatParcelizer(androidx.compose.ui.text.input.EditCommand editCommand) {
        this.serializer++;
        try {
            this.write.add(editCommand);
        } finally {
            read();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.RatingCompat;
        if (!z) {
            return z;
        }
        this.serializer++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.RatingCompat;
        return z ? this.RemoteActionCompatParcelizer : z;
    }

    public final boolean read() {
        int i = this.serializer - 1;
        this.serializer = i;
        if (i == 0) {
            ArrayList arrayList = this.write;
            if (!arrayList.isEmpty()) {
                ((getKey2) this.read.serializer).MediaDescriptionCompat.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.serializer > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z = this.RatingCompat;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((getKey2) this.read.serializer).serializer.MediaSessionCompatResultReceiverWrapper()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.RatingCompat;
        if (z) {
            IconCompatParcelizer(new androidx.compose.ui.text.input.CommitTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.RatingCompat;
        if (!z) {
            return z;
        }
        IconCompatParcelizer(new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.RatingCompat;
        if (!z) {
            return z;
        }
        IconCompatParcelizer(new androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.RatingCompat;
        if (!z) {
            return z;
        }
        IconCompatParcelizer(new androidx.compose.ui.text.input.FinishComposingTextCommand());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState;
        if (Build.VERSION.SDK_INT < 34 || (legacyTextFieldState = this.MediaDescriptionCompat) == null) {
            return false;
        }
        return InternalComposeUiApi.aZ_(legacyTextFieldState, previewableHandwritingGesture, this.MediaMetadataCompat, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.RatingCompat;
        if (z) {
            IconCompatParcelizer(new androidx.compose.ui.text.input.SetComposingRegionCommand(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.RatingCompat;
        if (z) {
            IconCompatParcelizer(new androidx.compose.ui.text.input.SetComposingTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.RatingCompat;
        if (!z) {
            return z;
        }
        IconCompatParcelizer(new androidx.compose.ui.text.input.SetSelectionCommand(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.MediaBrowserCompatMediaItem = z;
        if (z) {
            this.IconCompatParcelizer = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return retryInAppMessagelambda0.write(this.MediaSessionCompatQueueItem);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            InlineChildren inlineChildren = new InlineChildren(20, this);
            androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.MediaDescriptionCompat;
            int iAY_ = legacyTextFieldState != null ? InternalComposeUiApi.aY_(legacyTextFieldState, handwritingGesture, this.MediaMetadataCompat, this.MediaSessionCompatResultReceiverWrapper, inlineChildren) : 3;
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new brazelogdefault(intConsumer, iAY_, 6));
            } else {
                intConsumer.accept(iAY_);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.RatingCompat;
        if (z) {
            z = false;
            switch (i) {
                case android.R.id.selectAll:
                    IconCompatParcelizer(new androidx.compose.ui.text.input.SetSelectionCommand(0, this.MediaSessionCompatQueueItem.getText().length()));
                    break;
                case android.R.id.cut:
                    write(277);
                    return false;
                case android.R.id.copy:
                    write(278);
                    return false;
                case android.R.id.paste:
                    write(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int iM3261getDefaulteUduSuo;
        boolean z = this.RatingCompat;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    iM3261getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.Companion.m3263getGoeUduSuo();
                    break;
                case 3:
                    iM3261getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.Companion.m3267getSearcheUduSuo();
                    break;
                case 4:
                    iM3261getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.Companion.m3268getSendeUduSuo();
                    break;
                case 5:
                    iM3261getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.Companion.m3264getNexteUduSuo();
                    break;
                case 6:
                    iM3261getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.Companion.m3262getDoneeUduSuo();
                    break;
                case 7:
                    iM3261getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.Companion.m3266getPreviouseUduSuo();
                    break;
                default:
                    SentryLogcatAdapter.IconCompatParcelizer(androidx.compose.ui.text.input.RecordingInputConnection_androidKt.TAG, "IME sends unsupported Editor Action: " + i);
                    iM3261getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.Companion.m3261getDefaulteUduSuo();
                    break;
            }
        } else {
            iM3261getDefaulteUduSuo = androidx.compose.ui.text.input.ImeAction.Companion.m3261getDefaulteUduSuo();
        }
        ((getKey2) this.read.serializer).MediaMetadataCompat.invoke(androidx.compose.ui.text.input.ImeAction.m3245boximpl(iM3261getDefaulteUduSuo));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0060 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:42:0x0056, B:44:0x0060, B:46:0x0066, B:47:0x0069), top: B:54:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0066 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:42:0x0056, B:44:0x0060, B:46:0x0066, B:47:0x0069), top: B:54:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        KeyedComposedModifier1 keyedComposedModifier1;
        boolean z5 = this.RatingCompat;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (i & 1) != 0;
        boolean z8 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z4 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            z2 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z6 = true;
            }
            if (!z4 && !z3 && !z2 && !z6) {
                if (i2 >= 34) {
                    z6 = true;
                }
                z = z6;
                z6 = true;
            }
            keyedComposedModifier1 = ((getKey2) this.read.serializer).write;
            synchronized (keyedComposedModifier1.ParcelableVolumeInfo) {
                keyedComposedModifier1.MediaMetadataCompat = z4;
                keyedComposedModifier1.read = z3;
                keyedComposedModifier1.RatingCompat = z2;
                keyedComposedModifier1.MediaSessionCompatQueueItem = z6;
                if (z7) {
                    keyedComposedModifier1.write = true;
                    if (keyedComposedModifier1.ResultReceiver != null) {
                        keyedComposedModifier1.serializer();
                    }
                }
                keyedComposedModifier1.MediaSessionCompatResultReceiverWrapper = z8;
            }
            return true;
        }
        z = false;
        z2 = z6;
        z4 = true;
        z3 = true;
        z6 = z;
        keyedComposedModifier1 = ((getKey2) this.read.serializer).write;
        synchronized (keyedComposedModifier1.ParcelableVolumeInfo) {
            keyedComposedModifier1.MediaMetadataCompat = z4;
            keyedComposedModifier1.read = z3;
            keyedComposedModifier1.RatingCompat = z2;
            keyedComposedModifier1.MediaSessionCompatQueueItem = z6;
            if (z7) {
                keyedComposedModifier1.write = true;
                if (keyedComposedModifier1.ResultReceiver != null) {
                    keyedComposedModifier1.serializer();
                }
            }
            keyedComposedModifier1.MediaSessionCompatResultReceiverWrapper = z8;
            return true;
        }
    }
}
