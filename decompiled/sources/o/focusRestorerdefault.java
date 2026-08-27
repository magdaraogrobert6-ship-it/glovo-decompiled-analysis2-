package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class focusRestorerdefault extends ClickableSpan {
    public final FocusRestorerKtsaveFocusedChild11 IconCompatParcelizer;
    public final int read;
    public final int serializer;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.read);
        this.IconCompatParcelizer.write.performAction(this.serializer, bundle);
    }

    public focusRestorerdefault(int i, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11, int i2) {
        this.read = i;
        this.IconCompatParcelizer = focusRestorerKtsaveFocusedChild11;
        this.serializer = i2;
    }
}
