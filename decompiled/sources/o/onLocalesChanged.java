package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class onLocalesChanged extends FrameLayout {
    public View IconCompatParcelizer;
    public Drawable MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public Drawable RatingCompat;
    public Drawable RemoteActionCompatParcelizer;
    public final int read;
    public View serializer;
    public final boolean write;

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setTabContainer(setCompoundDrawablesRelative setcompounddrawablesrelative) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        boolean z = this.write;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.MediaDescriptionCompat && this.MediaMetadataCompat) {
            return true;
        }
        return (drawable == this.RatingCompat && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.RemoteActionCompatParcelizer;
        if (drawable != null && drawable.isStateful()) {
            this.RemoteActionCompatParcelizer.setState(getDrawableState());
        }
        Drawable drawable2 = this.MediaDescriptionCompat;
        if (drawable2 != null && drawable2.isStateful()) {
            this.MediaDescriptionCompat.setState(getDrawableState());
        }
        Drawable drawable3 = this.RatingCompat;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.RatingCompat.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.RemoteActionCompatParcelizer;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.MediaDescriptionCompat;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.RatingCompat;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.write) {
            Drawable drawable = this.RatingCompat;
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.RemoteActionCompatParcelizer != null) {
                if (this.serializer.getVisibility() == 0) {
                    this.RemoteActionCompatParcelizer.setBounds(this.serializer.getLeft(), this.serializer.getTop(), this.serializer.getRight(), this.serializer.getBottom());
                } else {
                    View view = this.IconCompatParcelizer;
                    if (view == null || view.getVisibility() != 0) {
                        this.RemoteActionCompatParcelizer.setBounds(0, 0, 0, 0);
                    } else {
                        this.RemoteActionCompatParcelizer.setBounds(this.IconCompatParcelizer.getLeft(), this.IconCompatParcelizer.getTop(), this.IconCompatParcelizer.getRight(), this.IconCompatParcelizer.getBottom());
                    }
                }
                z2 = true;
            } else {
                z2 = false;
            }
            this.MediaMetadataCompat = false;
            if (!z2) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.MediaSessionCompatQueueItem || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.serializer == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.read) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.serializer == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.RemoteActionCompatParcelizer);
        }
        this.RemoteActionCompatParcelizer = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.serializer;
            if (view != null) {
                this.RemoteActionCompatParcelizer.setBounds(view.getLeft(), this.serializer.getTop(), this.serializer.getRight(), this.serializer.getBottom());
            }
        }
        setWillNotDraw(!this.write ? !(this.RemoteActionCompatParcelizer == null && this.MediaDescriptionCompat == null) : this.RatingCompat != null);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.RatingCompat;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.RatingCompat);
        }
        this.RatingCompat = drawable;
        boolean z = this.write;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.RatingCompat) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.RemoteActionCompatParcelizer != null || this.MediaDescriptionCompat != null) : this.RatingCompat == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.MediaDescriptionCompat;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.MediaDescriptionCompat);
        }
        this.MediaDescriptionCompat = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.MediaMetadataCompat && this.MediaDescriptionCompat != null) {
                throw null;
            }
        }
        setWillNotDraw(!this.write ? !(this.RemoteActionCompatParcelizer == null && this.MediaDescriptionCompat == null) : this.RatingCompat != null);
        invalidate();
        invalidateOutline();
    }

    public onLocalesChanged(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = true;
        setBackground(new addOvaldefault(1, this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.ActionBar);
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getDrawable(0);
        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getDrawable(2);
        this.read = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == com.logistics.rider.glovo.R.id.split_action_bar) {
            this.write = true;
            this.RatingCompat = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.write ? this.RemoteActionCompatParcelizer != null || this.MediaDescriptionCompat != null : this.RatingCompat != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.serializer = findViewById(com.logistics.rider.glovo.R.id.action_bar);
        this.IconCompatParcelizer = findViewById(com.logistics.rider.glovo.R.id.action_context_bar);
    }

    public void setTransitioning(boolean z) {
        this.MediaSessionCompatQueueItem = z;
        setDescendantFocusability(z ? 393216 : androidx.compose.ui.graphics.Fields.ColorFilter);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.RemoteActionCompatParcelizer;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.MediaDescriptionCompat;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.RatingCompat;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }
}
