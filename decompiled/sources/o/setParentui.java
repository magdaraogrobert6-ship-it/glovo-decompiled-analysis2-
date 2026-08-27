package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class setParentui extends RippleDrawable {
    public final boolean IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public androidx.compose.ui.graphics.Color read;

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.RemoteActionCompatParcelizer;
    }

    public setParentui(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.IconCompatParcelizer = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final android.graphics.Rect getDirtyBounds() {
        if (!this.IconCompatParcelizer) {
            this.RemoteActionCompatParcelizer = true;
        }
        android.graphics.Rect dirtyBounds = super.getDirtyBounds();
        this.RemoteActionCompatParcelizer = false;
        return dirtyBounds;
    }
}
