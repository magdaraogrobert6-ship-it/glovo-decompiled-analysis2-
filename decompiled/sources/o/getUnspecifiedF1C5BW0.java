package o;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class getUnspecifiedF1C5BW0 implements KeyListener {
    public final KeyListener serializer;

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.serializer.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.serializer.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, android.view.KeyEvent keyEvent) {
        return this.serializer.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, android.view.KeyEvent keyEvent) {
        return this.serializer.onKeyUp(view, editable, i, keyEvent);
    }

    public getUnspecifiedF1C5BW0(KeyListener keyListener) {
        this.serializer = keyListener;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[RETURN] */
    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, android.view.KeyEvent keyEvent) {
        boolean z;
        if (i == 67) {
            z = androidx.emoji2.text.EmojiProcessor.read(editable, keyEvent, false);
        } else {
            if (i == 112) {
                z = androidx.emoji2.text.EmojiProcessor.read(editable, keyEvent, true);
            }
            if (this.serializer.onKeyDown(view, editable, i, keyEvent)) {
                return true;
            }
            return false;
        }
        if (z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        if (this.serializer.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }
}
