package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class TestModifierUpdaterKtTestModifierUpdaterLayout2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ TestModifierUpdaterKtTestModifierUpdaterLayout11 RemoteActionCompatParcelizer;
    public final /* synthetic */ TextView read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ TextView write;

    public TestModifierUpdaterKtTestModifierUpdaterLayout2(TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11, int i, TextView textView, int i2, TextView textView2) {
        this.RemoteActionCompatParcelizer = testModifierUpdaterKtTestModifierUpdaterLayout11;
        this.serializer = i;
        this.write = textView;
        this.IconCompatParcelizer = i2;
        this.read = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        androidx.appcompat.widget.AppCompatTextView appCompatTextView;
        int i = this.serializer;
        TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11 = this.RemoteActionCompatParcelizer;
        testModifierUpdaterKtTestModifierUpdaterLayout11.RemoteActionCompatParcelizer = i;
        testModifierUpdaterKtTestModifierUpdaterLayout11.read = null;
        TextView textView = this.write;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.IconCompatParcelizer == 1 && (appCompatTextView = testModifierUpdaterKtTestModifierUpdaterLayout11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.read;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.read;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
