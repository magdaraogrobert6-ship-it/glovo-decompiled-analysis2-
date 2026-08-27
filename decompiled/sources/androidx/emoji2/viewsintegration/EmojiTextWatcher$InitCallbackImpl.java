package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat$InitCallback;
import java.lang.ref.WeakReference;
import o.isUnspecifiedk4lQ0Mannotations;

/* JADX INFO: loaded from: classes4.dex */
public final class EmojiTextWatcher$InitCallbackImpl extends EmojiCompat$InitCallback implements Runnable {
    public final WeakReference RemoteActionCompatParcelizer;

    @Override // androidx.emoji2.text.EmojiCompat$InitCallback
    public final void onInitialized() {
        Handler handler;
        EditText editText = (EditText) this.RemoteActionCompatParcelizer.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        isUnspecifiedk4lQ0Mannotations.RemoteActionCompatParcelizer((EditText) this.RemoteActionCompatParcelizer.get(), 1);
    }

    public EmojiTextWatcher$InitCallbackImpl(EditText editText) {
        this.RemoteActionCompatParcelizer = new WeakReference(editText);
    }
}
