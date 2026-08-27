package o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class compareTo41bOqos extends Drawable.ConstantState {
    public final Drawable.ConstantState write;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.write.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.write.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        getNonefv9h1I getnonefv9h1i = new getNonefv9h1I();
        getnonefv9h1i.MediaDescriptionCompat = (VectorDrawable) this.write.newDrawable();
        return getnonefv9h1i;
    }

    public compareTo41bOqos(Drawable.ConstantState constantState) {
        this.write = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        getNonefv9h1I getnonefv9h1i = new getNonefv9h1I();
        getnonefv9h1i.MediaDescriptionCompat = (VectorDrawable) this.write.newDrawable(resources);
        return getnonefv9h1i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        getNonefv9h1I getnonefv9h1i = new getNonefv9h1I();
        getnonefv9h1i.MediaDescriptionCompat = (VectorDrawable) this.write.newDrawable(resources, theme);
        return getnonefv9h1i;
    }
}
