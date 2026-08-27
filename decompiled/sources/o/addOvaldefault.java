package o;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class addOvaldefault extends Drawable {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    public /* synthetic */ addOvaldefault(int i, Object obj) {
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        if (i == 0) {
            ((accessrewindjd) obj).IconCompatParcelizer(canvas);
            return;
        }
        onLocalesChanged onlocaleschanged = (onLocalesChanged) obj;
        if (onlocaleschanged.write) {
            Drawable drawable = onlocaleschanged.RatingCompat;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = onlocaleschanged.RemoteActionCompatParcelizer;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = onlocaleschanged.MediaDescriptionCompat;
        if (drawable3 == null || !onlocaleschanged.MediaMetadataCompat) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        if (this.read != 1) {
            super.getOutline(outline);
            return;
        }
        onLocalesChanged onlocaleschanged = (onLocalesChanged) this.IconCompatParcelizer;
        if (onlocaleschanged.write) {
            if (onlocaleschanged.RatingCompat != null) {
                onlocaleschanged.RemoteActionCompatParcelizer.getOutline(outline);
            }
        } else {
            Drawable drawable = onlocaleschanged.RemoteActionCompatParcelizer;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }
}
