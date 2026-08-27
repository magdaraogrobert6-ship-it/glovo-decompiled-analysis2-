package o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class drawLineNGM6Ib0default extends Drawable.ConstantState {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object write;

    public /* synthetic */ drawLineNGM6Ib0default(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        return this.RemoteActionCompatParcelizer != 1 ? super.canApplyTheme() : ((Drawable.ConstantState) this.write).canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        if (this.RemoteActionCompatParcelizer != 0) {
            return ((Drawable.ConstantState) this.write).getChangingConfigurations();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        if (this.RemoteActionCompatParcelizer == 0) {
            return new drawImage9jGpkUEdefault(this);
        }
        getMediumfv9h1I getmediumfv9h1i = new getMediumfv9h1I(null);
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.write).newDrawable();
        getmediumfv9h1i.MediaDescriptionCompat = drawableNewDrawable;
        drawableNewDrawable.setCallback(getmediumfv9h1i.serializer);
        return getmediumfv9h1i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        if (this.RemoteActionCompatParcelizer != 0) {
            getMediumfv9h1I getmediumfv9h1i = new getMediumfv9h1I(null);
            Drawable drawableNewDrawable = ((Drawable.ConstantState) this.write).newDrawable(resources);
            getmediumfv9h1i.MediaDescriptionCompat = drawableNewDrawable;
            drawableNewDrawable.setCallback(getmediumfv9h1i.serializer);
            return getmediumfv9h1i;
        }
        return new drawImage9jGpkUEdefault(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        if (this.RemoteActionCompatParcelizer != 1) {
            return super.newDrawable(resources, theme);
        }
        getMediumfv9h1I getmediumfv9h1i = new getMediumfv9h1I(null);
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.write).newDrawable(resources, theme);
        getmediumfv9h1i.MediaDescriptionCompat = drawableNewDrawable;
        drawableNewDrawable.setCallback(getmediumfv9h1i.serializer);
        return getmediumfv9h1i;
    }
}
