package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes4.dex */
public class setCheckable extends android.widget.RadioButton implements getPreviouslyFocusedChildHash {
    public getAccessibilityClassName IconCompatParcelizer;
    public final supportRequestWindowFeature RemoteActionCompatParcelizer;
    public final setSplitBackground serializer;
    public final setBackgroundResource write;

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.serializer.IconCompatParcelizer();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.serializer.RemoteActionCompatParcelizer();
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        setSplitBackground setsplitbackground = this.serializer;
        setsplitbackground.write(colorStateList);
        setsplitbackground.read();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        setSplitBackground setsplitbackground = this.serializer;
        setsplitbackground.IconCompatParcelizer(mode);
        setsplitbackground.read();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write();
        }
        setSplitBackground setsplitbackground = this.serializer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().RemoteActionCompatParcelizer(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.IconCompatParcelizer();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.serializer(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        setBackgroundResource setbackgroundresource = this.write;
        if (setbackgroundresource != null) {
            if (setbackgroundresource.write) {
                setbackgroundresource.write = false;
            } else {
                setbackgroundresource.write = true;
                setbackgroundresource.write();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.serializer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.serializer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.read();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.serializer();
        }
        return null;
    }

    @Override // o.getPreviouslyFocusedChildHash
    public ColorStateList getSupportButtonTintList() {
        setBackgroundResource setbackgroundresource = this.write;
        if (setbackgroundresource != null) {
            return setbackgroundresource.read;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        setBackgroundResource setbackgroundresource = this.write;
        if (setbackgroundresource != null) {
            return setbackgroundresource.IconCompatParcelizer;
        }
        return null;
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().serializer(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().serializer(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.read(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write(mode);
        }
    }

    @Override // o.getPreviouslyFocusedChildHash
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        setBackgroundResource setbackgroundresource = this.write;
        if (setbackgroundresource != null) {
            setbackgroundresource.read = colorStateList;
            setbackgroundresource.serializer = true;
            setbackgroundresource.write();
        }
    }

    @Override // o.getPreviouslyFocusedChildHash
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        setBackgroundResource setbackgroundresource = this.write;
        if (setbackgroundresource != null) {
            setbackgroundresource.IconCompatParcelizer = mode;
            setbackgroundresource.RemoteActionCompatParcelizer = true;
            setbackgroundresource.write();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCheckable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.radioButtonStyle);
        setSupportBackgroundTintMode.RemoteActionCompatParcelizer(context);
        setSupportBackgroundTintList.read(this, getContext());
        setBackgroundResource setbackgroundresource = new setBackgroundResource(this);
        this.write = setbackgroundresource;
        setbackgroundresource.serializer(attributeSet, com.logistics.rider.glovo.R.attr.radioButtonStyle);
        supportRequestWindowFeature supportrequestwindowfeature = new supportRequestWindowFeature(this);
        this.RemoteActionCompatParcelizer = supportrequestwindowfeature;
        supportrequestwindowfeature.read(attributeSet, com.logistics.rider.glovo.R.attr.radioButtonStyle);
        setSplitBackground setsplitbackground = new setSplitBackground(this);
        this.serializer = setsplitbackground;
        setsplitbackground.RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.radioButtonStyle);
        getEmojiTextViewHelper().write(attributeSet, com.logistics.rider.glovo.R.attr.radioButtonStyle);
    }

    private getAccessibilityClassName getEmojiTextViewHelper() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new getAccessibilityClassName(this);
        }
        return this.IconCompatParcelizer;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(coil3.util.IntPair.write(getContext(), i));
    }

    public setCheckable(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
