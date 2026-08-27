package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat$InitCallback;
import java.lang.ref.WeakReference;
import o.MutableRectKt;
import o.getZeroF1C5BW0;

/* JADX INFO: loaded from: classes4.dex */
public final class EmojiInputFilter$InitCallbackImpl extends EmojiCompat$InitCallback implements Runnable {
    public final WeakReference serializer;
    public final WeakReference write;

    @Override // androidx.emoji2.text.EmojiCompat$InitCallback
    public final void onInitialized() {
        Handler handler;
        TextView textView = (TextView) this.serializer.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.serializer.get();
        InputFilter inputFilter = (InputFilter) this.write.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
                    if (text == null) {
                        length = 0;
                    } else {
                        mutableRectKtRemoteActionCompatParcelizer.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceWrite = mutableRectKtRemoteActionCompatParcelizer.write(0, length, 0, text);
                    if (text == charSequenceWrite) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceWrite);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceWrite);
                    textView.setText(charSequenceWrite);
                    if (charSequenceWrite instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceWrite;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    public EmojiInputFilter$InitCallbackImpl(TextView textView, getZeroF1C5BW0 getzerof1c5bw0) {
        this.serializer = new WeakReference(textView);
        this.write = new WeakReference(getzerof1c5bw0);
    }
}
