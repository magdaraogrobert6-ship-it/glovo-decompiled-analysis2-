package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class accessgetLaunchedKeysp extends androidx.appcompat.widget.AppCompatTextView implements getSupportActionBar, View.OnClickListener, setSupportActionBar {
    public Drawable IconCompatParcelizer;
    public ActivityResultRegistry MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public handleMessage MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public CharSequence PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public boolean read;
    public onWindowStartingSupportActionMode serializer;
    public Keep write;

    public accessgetLaunchedKeysp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.read = serializer();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.ActionMenuItemView, 0, 0);
        this.RatingCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.MediaDescriptionCompat = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.MediaSessionCompatQueueItem = -1;
        setSaveEnabled(false);
    }

    @Override // o.getSupportActionBar
    public Keep getItemData() {
        return this.write;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setItemInvoker(handleMessage handlemessage) {
        this.MediaMetadataCompat = handlemessage;
    }

    public void setPopupCallback(ActivityResultRegistry activityResultRegistry) {
        this.MediaBrowserCompatMediaItem = activityResultRegistry;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.Button.class.getName();
    }

    @Override // o.getSupportActionBar
    public final void initialize(Keep keep) {
        this.write = keep;
        setIcon(keep.getIcon());
        setTitle(keep.getTitleCondensed());
        setId(keep.MediaSessionCompatToken);
        setVisibility(keep.isVisible() ? 0 : 8);
        setEnabled(keep.isEnabled());
        if (keep.hasSubMenu() && this.serializer == null) {
            this.serializer = new onWindowStartingSupportActionMode(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        onWindowStartingSupportActionMode onwindowstartingsupportactionmode;
        if (this.write.hasSubMenu() && (onwindowstartingsupportactionmode = this.serializer) != null && onwindowstartingsupportactionmode.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.MediaSessionCompatQueueItem = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setTitle(CharSequence charSequence) {
        this.PlaybackStateCompatCustomAction = charSequence;
        write();
    }

    public final void write() {
        boolean z = (!TextUtils.isEmpty(this.PlaybackStateCompatCustomAction)) & (this.IconCompatParcelizer == null || ((this.write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM & 4) == 4 && (this.read || this.RemoteActionCompatParcelizer)));
        setText(z ? this.PlaybackStateCompatCustomAction : null);
        CharSequence charSequence = this.write.read;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z ? null : this.write.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.write.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (TextUtils.isEmpty(charSequence2)) {
            setAutoSizeTextTypeWithDefaults.serializer(this, z ? null : this.write.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        } else {
            setAutoSizeTextTypeWithDefaults.serializer(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.read = serializer();
        write();
    }

    @Override // o.setSupportActionBar
    public final boolean IconCompatParcelizer() {
        return !TextUtils.isEmpty(getText()) && this.write.getIcon() == null;
    }

    @Override // o.setSupportActionBar
    public final boolean RemoteActionCompatParcelizer() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        handleMessage handlemessage = this.MediaMetadataCompat;
        if (handlemessage != null) {
            handlemessage.serializer(this.write);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.MediaSessionCompatQueueItem) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.RatingCompat;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.IconCompatParcelizer == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.IconCompatParcelizer.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    public final boolean serializer() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public void setExpandedFormat(boolean z) {
        if (this.RemoteActionCompatParcelizer != z) {
            this.RemoteActionCompatParcelizer = z;
            Keep keep = this.write;
            if (keep != null) {
                AlertControllerButtonHandler alertControllerButtonHandler = keep.ResultReceiver;
                alertControllerButtonHandler.PlaybackStateCompat = true;
                alertControllerButtonHandler.write(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.IconCompatParcelizer = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.MediaDescriptionCompat;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        write();
    }
}
