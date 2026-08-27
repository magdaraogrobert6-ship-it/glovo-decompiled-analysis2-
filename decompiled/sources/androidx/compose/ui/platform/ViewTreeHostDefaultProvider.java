package androidx.compose.ui.platform;

import android.view.View;
import o.FillableData;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeHostDefaultProvider {
    public static final int $stable = 8;
    private final View view;

    public <T> T getHostDefault(FillableData fillableData) {
        return null;
    }

    public ViewTreeHostDefaultProvider(View view) {
        this.view = view;
    }
}
