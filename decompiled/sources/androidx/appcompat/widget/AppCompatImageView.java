package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import coil3.util.IntPair;
import o.getNestedScrollAxes;
import o.resizeGraphicFrameIfAppropriate;
import o.setSupportBackgroundTintList;
import o.setSupportBackgroundTintMode;
import o.setSupportCompoundDrawablesTintList;
import o.supportRequestWindowFeature;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    public boolean RemoteActionCompatParcelizer;
    public final supportRequestWindowFeature serializer;
    public final resizeGraphicFrameIfAppropriate write;

    public ColorStateList getSupportImageTintList() {
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist;
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = this.write;
        if (resizegraphicframeifappropriate == null || (setsupportcompounddrawablestintlist = (setSupportCompoundDrawablesTintList) resizegraphicframeifappropriate.write) == null) {
            return null;
        }
        return (ColorStateList) setsupportcompounddrawablestintlist.write;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist;
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = this.write;
        if (resizegraphicframeifappropriate == null || (setsupportcompounddrawablestintlist = (setSupportCompoundDrawablesTintList) resizegraphicframeifappropriate.write) == null) {
            return null;
        }
        return (PorterDuff.Mode) setsupportcompounddrawablestintlist.IconCompatParcelizer;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.write.read).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setSupportBackgroundTintMode.RemoteActionCompatParcelizer(context);
        this.RemoteActionCompatParcelizer = false;
        setSupportBackgroundTintList.read(this, getContext());
        supportRequestWindowFeature supportrequestwindowfeature = new supportRequestWindowFeature(this);
        this.serializer = supportrequestwindowfeature;
        supportrequestwindowfeature.read(attributeSet, i);
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = new resizeGraphicFrameIfAppropriate(this);
        this.write = resizegraphicframeifappropriate;
        resizegraphicframeifappropriate.serializer(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write();
        }
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = this.write;
        if (resizegraphicframeifappropriate != null) {
            resizegraphicframeifappropriate.serializer();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.IconCompatParcelizer();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.serializer(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = this.write;
        if (resizegraphicframeifappropriate != null) {
            resizegraphicframeifappropriate.serializer();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = this.write;
        if (resizegraphicframeifappropriate != null) {
            resizegraphicframeifappropriate.serializer();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.read();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.serializer();
        }
        return null;
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = this.write;
        if (resizegraphicframeifappropriate != null) {
            ImageView imageView = (ImageView) resizegraphicframeifappropriate.read;
            if (i != 0) {
                Drawable drawableWrite = IntPair.write(imageView.getContext(), i);
                if (drawableWrite != null) {
                    getNestedScrollAxes.RemoteActionCompatParcelizer(drawableWrite);
                }
                imageView.setImageDrawable(drawableWrite);
            } else {
                imageView.setImageDrawable(null);
            }
            resizegraphicframeifappropriate.serializer();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.read(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        supportRequestWindowFeature supportrequestwindowfeature = this.serializer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = this.write;
        if (resizegraphicframeifappropriate != null) {
            if (((setSupportCompoundDrawablesTintList) resizegraphicframeifappropriate.write) == null) {
                resizegraphicframeifappropriate.write = new setSupportCompoundDrawablesTintList();
            }
            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = (setSupportCompoundDrawablesTintList) resizegraphicframeifappropriate.write;
            setsupportcompounddrawablestintlist.write = colorStateList;
            setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer = true;
            resizegraphicframeifappropriate.serializer();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = this.write;
        if (resizegraphicframeifappropriate != null) {
            if (((setSupportCompoundDrawablesTintList) resizegraphicframeifappropriate.write) == null) {
                resizegraphicframeifappropriate.write = new setSupportCompoundDrawablesTintList();
            }
            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = (setSupportCompoundDrawablesTintList) resizegraphicframeifappropriate.write;
            setsupportcompounddrawablestintlist.IconCompatParcelizer = mode;
            setsupportcompounddrawablestintlist.serializer = true;
            resizegraphicframeifappropriate.serializer();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = this.write;
        if (resizegraphicframeifappropriate != null && drawable != null && !this.RemoteActionCompatParcelizer) {
            resizegraphicframeifappropriate.serializer = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (resizegraphicframeifappropriate != null) {
            resizegraphicframeifappropriate.serializer();
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            ImageView imageView = (ImageView) resizegraphicframeifappropriate.read;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(resizegraphicframeifappropriate.serializer);
            }
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
