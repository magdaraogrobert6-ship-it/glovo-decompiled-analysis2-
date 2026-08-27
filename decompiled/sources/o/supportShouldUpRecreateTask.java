package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class supportShouldUpRecreateTask extends CheckBox implements getPreviouslyFocusedChildHash {
    public final setSplitBackground RemoteActionCompatParcelizer;
    public final supportRequestWindowFeature read;
    public getAccessibilityClassName serializer;
    public final setBackgroundResource write;

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
        setsplitbackground.write(colorStateList);
        setsplitbackground.read();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
        setsplitbackground.IconCompatParcelizer(mode);
        setsplitbackground.read();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public supportShouldUpRecreateTask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setSupportBackgroundTintMode.RemoteActionCompatParcelizer(context);
        setSupportBackgroundTintList.read(this, getContext());
        setBackgroundResource setbackgroundresource = new setBackgroundResource(this);
        this.write = setbackgroundresource;
        setbackgroundresource.serializer(attributeSet, i);
        supportRequestWindowFeature supportrequestwindowfeature = new supportRequestWindowFeature(this);
        this.read = supportrequestwindowfeature;
        supportrequestwindowfeature.read(attributeSet, i);
        setSplitBackground setsplitbackground = new setSplitBackground(this);
        this.RemoteActionCompatParcelizer = setsplitbackground;
        setsplitbackground.RemoteActionCompatParcelizer(attributeSet, i);
        getEmojiTextViewHelper().write(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        supportRequestWindowFeature supportrequestwindowfeature = this.read;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write();
        }
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
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
        supportRequestWindowFeature supportrequestwindowfeature = this.read;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.IconCompatParcelizer();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        supportRequestWindowFeature supportrequestwindowfeature = this.read;
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSplitBackground setsplitbackground = this.RemoteActionCompatParcelizer;
        if (setsplitbackground != null) {
            setsplitbackground.read();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        supportRequestWindowFeature supportrequestwindowfeature = this.read;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.read();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        supportRequestWindowFeature supportrequestwindowfeature = this.read;
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
        supportRequestWindowFeature supportrequestwindowfeature = this.read;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.read(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        supportRequestWindowFeature supportrequestwindowfeature = this.read;
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

    private getAccessibilityClassName getEmojiTextViewHelper() {
        if (this.serializer == null) {
            this.serializer = new getAccessibilityClassName(this);
        }
        return this.serializer;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(coil3.util.IntPair.write(getContext(), i));
    }

    public supportShouldUpRecreateTask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.logistics.rider.glovo.R.attr.checkboxStyle);
    }
}
