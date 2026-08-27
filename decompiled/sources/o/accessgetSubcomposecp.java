package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class accessgetSubcomposecp extends accessgetSubcomposeForceReusecp implements getSupportActionBar {
    public static final int[] MediaBrowserCompatMediaItem = {android.R.attr.state_checked};
    public FrameLayout MediaDescriptionCompat;
    public final MaterialCalendar.AnonymousClass6 MediaSessionCompatQueueItem;
    public Drawable PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public Keep _init_lambda1;
    public final CheckedTextView _init_lambda2;
    public boolean _init_lambda3;
    public final boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public ColorStateList r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    @Override // o.getSupportActionBar
    public Keep getItemData() {
        return this._init_lambda1;
    }

    public void setIconSize(int i) {
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i;
    }

    public void setNeedsEmptyIcon(boolean z) {
        this._init_lambda3 = z;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = (FrameLayout) ((ViewStub) findViewById(com.logistics.rider.glovo.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.MediaDescriptionCompat.removeAllViews();
            this.MediaDescriptionCompat.addView(view);
        }
    }

    @Override // o.getSupportActionBar
    public final void initialize(Keep keep) {
        StateListDrawable stateListDrawable;
        this._init_lambda1 = keep;
        int i = keep.MediaSessionCompatToken;
        if (i > 0) {
            setId(i);
        }
        setVisibility(keep.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.logistics.rider.glovo.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(MediaBrowserCompatMediaItem, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            setBackground(stateListDrawable);
        }
        setCheckable(keep.isCheckable());
        setChecked(keep.isChecked());
        setEnabled(keep.isEnabled());
        setTitle(keep.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        setIcon(keep.getIcon());
        setActionView(keep.getActionView());
        setContentDescription(keep.read);
        setAutoSizeTextTypeWithDefaults.serializer(this, keep.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        Keep keep2 = this._init_lambda1;
        CharSequence charSequence = keep2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        CheckedTextView checkedTextView = this._init_lambda2;
        if (charSequence == null && keep2.getIcon() == null && this._init_lambda1.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.MediaDescriptionCompat;
            if (frameLayout != null) {
                setWindowTitle setwindowtitle = (setWindowTitle) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) setwindowtitle).width = -1;
                this.MediaDescriptionCompat.setLayoutParams(setwindowtitle);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.MediaDescriptionCompat;
        if (frameLayout2 != null) {
            setWindowTitle setwindowtitle2 = (setWindowTitle) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) setwindowtitle2).width = -2;
            this.MediaDescriptionCompat.setLayoutParams(setwindowtitle2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        Keep keep = this._init_lambda1;
        if (keep != null && keep.isCheckable() && this._init_lambda1.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, MediaBrowserCompatMediaItem);
        }
        return iArrOnCreateDrawableState;
    }

    public void setIconPadding(int i) {
        this._init_lambda2.setCompoundDrawablePadding(i);
    }

    public void setMaxLines(int i) {
        this._init_lambda2.setMaxLines(i);
    }

    public void setTextAppearance(int i) {
        this._init_lambda2.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this._init_lambda2.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this._init_lambda2.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.RatingCompat != z) {
            this.RatingCompat = z;
            this.MediaSessionCompatQueueItem.sendAccessibilityEvent(this._init_lambda2, androidx.compose.ui.graphics.Fields.CameraDistance);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this._init_lambda2;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) ? 1 : 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.PlaybackStateCompatCustomAction) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
            }
            int i = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            drawable.setBounds(0, 0, i, i);
        } else if (this._init_lambda3) {
            if (this.PlaybackStateCompat == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = setLeft.read;
                Drawable drawable2 = resources.getDrawable(com.logistics.rider.glovo.R.drawable.navigation_empty_icon, theme);
                this.PlaybackStateCompat = drawable2;
                if (drawable2 != null) {
                    int i2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.PlaybackStateCompat;
        }
        this._init_lambda2.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public accessgetSubcomposecp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = true;
        MaterialCalendar.AnonymousClass6 anonymousClass6 = new MaterialCalendar.AnonymousClass6(5, this);
        this.MediaSessionCompatQueueItem = anonymousClass6;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.logistics.rider.glovo.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.logistics.rider.glovo.R.id.design_menu_item_text);
        this._init_lambda2 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        FocusPropertiesNode.write(checkedTextView, anonymousClass6);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = colorStateList;
        this.PlaybackStateCompatCustomAction = colorStateList != null;
        Keep keep = this._init_lambda1;
        if (keep != null) {
            setIcon(keep.getIcon());
        }
    }
}
