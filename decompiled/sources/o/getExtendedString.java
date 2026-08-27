package o;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class getExtendedString extends ClickableSpan {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public getExtendedString(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            view.getClass();
            this.write.invoke();
        } else {
            view.getClass();
            this.write.invoke();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        textPaint.getClass();
        textPaint.setColor(this.read);
        textPaint.setUnderlineText(false);
        int i4 = serializer + 91;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
