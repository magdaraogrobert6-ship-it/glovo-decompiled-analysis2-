package o;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.viewsintegration.EmojiInputFilter$InitCallbackImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getZeroF1C5BW0 implements InputFilter {
    public final TextView RemoteActionCompatParcelizer;
    public EmojiInputFilter$InitCallbackImpl serializer;

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.RemoteActionCompatParcelizer;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iIconCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer().IconCompatParcelizer();
        if (iIconCompatParcelizer != 0) {
            if (iIconCompatParcelizer == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return MutableRectKt.RemoteActionCompatParcelizer().write(0, charSequence.length(), 0, charSequence);
            }
            if (iIconCompatParcelizer != 3) {
                return charSequence;
            }
        }
        MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
        if (this.serializer == null) {
            this.serializer = new EmojiInputFilter$InitCallbackImpl(textView, this);
        }
        mutableRectKtRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.serializer);
        return charSequence;
    }

    public getZeroF1C5BW0(TextView textView) {
        this.RemoteActionCompatParcelizer = textView;
    }
}
