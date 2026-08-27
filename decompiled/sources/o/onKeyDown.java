package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public class onKeyDown extends ViewGroup {
    public boolean ComponentActivity;
    public onSupportActionModeStarted IconCompatParcelizer;
    public setSupportProgressBarIndeterminateVisibility MediaBrowserCompatMediaItem;
    public View MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final int MediaSessionCompatResultReceiverWrapper;
    public TextView MediaSessionCompatToken;
    public CharSequence ParcelableVolumeInfo;
    public CharSequence PlaybackStateCompat;
    public LinearLayout PlaybackStateCompatCustomAction;
    public final Context RatingCompat;
    public View RemoteActionCompatParcelizer;
    public final int ResultReceiver;
    public final InternalPointerEvent r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public getRedirectui r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public TextView r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final int read;
    public int serializer;
    public View write;

    public int getContentHeight() {
        return this.serializer;
    }

    public CharSequence getSubtitle() {
        return this.PlaybackStateCompat;
    }

    public CharSequence getTitle() {
        return this.ParcelableVolumeInfo;
    }

    public void setContentHeight(int i) {
        this.serializer = i;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public static int write(int i, int i2, View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.PlaybackStateCompat = charSequence;
        RemoteActionCompatParcelizer();
    }

    public void setTitle(CharSequence charSequence) {
        this.ParcelableVolumeInfo = charSequence;
        RemoteActionCompatParcelizer();
        FocusPropertiesNode.read(this, charSequence);
    }

    public onKeyDown(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.actionModeStyle);
        InternalPointerEvent internalPointerEvent = new InternalPointerEvent();
        internalPointerEvent.read = this;
        internalPointerEvent.RemoteActionCompatParcelizer = false;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = internalPointerEvent;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(com.logistics.rider.glovo.R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.RatingCompat = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.RatingCompat = context;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.ActionMode, com.logistics.rider.glovo.R.attr.actionModeStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = coil3.util.IntPair.write(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.ResultReceiver = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.serializer = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.read = typedArrayObtainStyledAttributes.getResourceId(2, com.logistics.rider.glovo.R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, onUserLeaveHint.ActionBar, com.logistics.rider.glovo.R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        onSupportActionModeStarted onsupportactionmodestarted = this.IconCompatParcelizer;
        if (onsupportactionmodestarted != null) {
            Configuration configuration2 = onsupportactionmodestarted.IconCompatParcelizer.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            onsupportactionmodestarted.RatingCompat = i;
            AlertControllerButtonHandler alertControllerButtonHandler = onsupportactionmodestarted.MediaBrowserCompatMediaItem;
            if (alertControllerButtonHandler != null) {
                alertControllerButtonHandler.write(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onSupportActionModeStarted onsupportactionmodestarted = this.IconCompatParcelizer;
        if (onsupportactionmodestarted != null) {
            onsupportactionmodestarted.RemoteActionCompatParcelizer();
            openOptionsMenu openoptionsmenu = this.IconCompatParcelizer.serializer;
            if (openoptionsmenu == null || !openoptionsmenu.serializer()) {
                return;
            }
            openoptionsmenu.MediaMetadataCompat.RemoteActionCompatParcelizer();
        }
    }

    public static int serializer(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.PlaybackStateCompatCustomAction == null) {
            LayoutInflater.from(getContext()).inflate(com.logistics.rider.glovo.R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.PlaybackStateCompatCustomAction = linearLayout;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (TextView) linearLayout.findViewById(com.logistics.rider.glovo.R.id.action_bar_title);
            this.MediaSessionCompatToken = (TextView) this.PlaybackStateCompatCustomAction.findViewById(com.logistics.rider.glovo.R.id.action_bar_subtitle);
            int i = this.ResultReceiver;
            if (i != 0) {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setTextAppearance(getContext(), i);
            }
            int i2 = this.MediaSessionCompatResultReceiverWrapper;
            if (i2 != 0) {
                this.MediaSessionCompatToken.setTextAppearance(getContext(), i2);
            }
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setText(this.ParcelableVolumeInfo);
        this.MediaSessionCompatToken.setText(this.PlaybackStateCompat);
        boolean zIsEmpty = TextUtils.isEmpty(this.ParcelableVolumeInfo);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.PlaybackStateCompat);
        int i3 = 0;
        this.MediaSessionCompatToken.setVisibility(!zIsEmpty2 ? 0 : 8);
        LinearLayout linearLayout2 = this.PlaybackStateCompatCustomAction;
        if (zIsEmpty && zIsEmpty2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.PlaybackStateCompatCustomAction.getParent() == null) {
            addView(this.PlaybackStateCompatCustomAction);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public int getAnimatedVisibility() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null ? this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer : getVisibility();
    }

    public final getRedirectui read(int i, long j) {
        getRedirectui getredirectui = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (getredirectui != null) {
            getredirectui.serializer();
        }
        InternalPointerEvent internalPointerEvent = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (i != 0) {
            getRedirectui getredirectuiWrite = FocusPropertiesNode.write(this);
            getredirectuiWrite.RemoteActionCompatParcelizer(0.0f);
            getredirectuiWrite.RemoteActionCompatParcelizer(j);
            ((onKeyDown) internalPointerEvent.read).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getredirectuiWrite;
            internalPointerEvent.IconCompatParcelizer = i;
            getredirectuiWrite.IconCompatParcelizer(internalPointerEvent);
            return getredirectuiWrite;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        getRedirectui getredirectuiWrite2 = FocusPropertiesNode.write(this);
        getredirectuiWrite2.RemoteActionCompatParcelizer(1.0f);
        getredirectuiWrite2.RemoteActionCompatParcelizer(j);
        ((onKeyDown) internalPointerEvent.read).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getredirectuiWrite2;
        internalPointerEvent.IconCompatParcelizer = i;
        getredirectuiWrite2.IconCompatParcelizer(internalPointerEvent);
        return getredirectuiWrite2;
    }

    public final void read() {
        removeAllViews();
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompatMediaItem = null;
        this.IconCompatParcelizer = null;
        View view = this.RemoteActionCompatParcelizer;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.MediaDescriptionCompat;
        if (view2 != null) {
            removeView(view2);
        }
        this.MediaDescriptionCompat = view;
        if (view != null && (linearLayout = this.PlaybackStateCompatCustomAction) != null) {
            removeView(linearLayout);
            this.PlaybackStateCompatCustomAction = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.ComponentActivity) {
            requestLayout();
        }
        this.ComponentActivity = z;
    }

    public final void serializer(handleOnBackPressed handleonbackpressed) {
        View view = this.write;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.read, (ViewGroup) this, false);
            this.write = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.write);
        }
        View viewFindViewById = this.write.findViewById(com.logistics.rider.glovo.R.id.action_mode_close_button);
        this.RemoteActionCompatParcelizer = viewFindViewById;
        viewFindViewById.setOnClickListener(new androidx.appcompat.widget.Toolbar.AnonymousClass4(2, handleonbackpressed));
        AlertControllerButtonHandler alertControllerButtonHandler = handleonbackpressed.read();
        onSupportActionModeStarted onsupportactionmodestarted = this.IconCompatParcelizer;
        if (onsupportactionmodestarted != null) {
            onsupportactionmodestarted.RemoteActionCompatParcelizer();
            openOptionsMenu openoptionsmenu = onsupportactionmodestarted.serializer;
            if (openoptionsmenu != null && openoptionsmenu.serializer()) {
                openoptionsmenu.MediaMetadataCompat.RemoteActionCompatParcelizer();
            }
        }
        onSupportActionModeStarted onsupportactionmodestarted2 = new onSupportActionModeStarted(getContext());
        this.IconCompatParcelizer = onsupportactionmodestarted2;
        onsupportactionmodestarted2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
        onsupportactionmodestarted2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        alertControllerButtonHandler.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.RatingCompat);
        onSupportActionModeStarted onsupportactionmodestarted3 = this.IconCompatParcelizer;
        onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack = onsupportactionmodestarted3.PlaybackStateCompatCustomAction;
        if (oncreatesupportnavigateuptaskstack == null) {
            onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack2 = (onCreateSupportNavigateUpTaskStack) onsupportactionmodestarted3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.inflate(onsupportactionmodestarted3.MediaSessionCompatQueueItem, (ViewGroup) this, false);
            onsupportactionmodestarted3.PlaybackStateCompatCustomAction = oncreatesupportnavigateuptaskstack2;
            oncreatesupportnavigateuptaskstack2.write(onsupportactionmodestarted3.MediaBrowserCompatMediaItem);
            onsupportactionmodestarted3.MediaDescriptionCompat();
        }
        onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack3 = onsupportactionmodestarted3.PlaybackStateCompatCustomAction;
        if (oncreatesupportnavigateuptaskstack != oncreatesupportnavigateuptaskstack3) {
            ((setSupportProgressBarIndeterminateVisibility) oncreatesupportnavigateuptaskstack3).setPresenter(onsupportactionmodestarted3);
        }
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = (setSupportProgressBarIndeterminateVisibility) oncreatesupportnavigateuptaskstack3;
        this.MediaBrowserCompatMediaItem = setsupportprogressbarindeterminatevisibility;
        setsupportprogressbarindeterminatevisibility.setBackground(null);
        addView(this.MediaBrowserCompatMediaItem, layoutParams);
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            getRedirectui getredirectui = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (getredirectui != null) {
                getredirectui.serializer();
            }
            super.setVisibility(i);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.MediaMetadataCompat = false;
        }
        if (!this.MediaMetadataCompat) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.MediaMetadataCompat = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.MediaMetadataCompat = false;
        return true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.serializer;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.write;
        if (view != null) {
            int iWrite = write(paddingLeft, iMakeMeasureSpec, view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.write.getLayoutParams();
            paddingLeft = iWrite - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = this.MediaBrowserCompatMediaItem;
        if (setsupportprogressbarindeterminatevisibility != null && setsupportprogressbarindeterminatevisibility.getParent() == this) {
            paddingLeft = write(paddingLeft, iMakeMeasureSpec, this.MediaBrowserCompatMediaItem);
        }
        LinearLayout linearLayout = this.PlaybackStateCompatCustomAction;
        if (linearLayout != null && this.MediaDescriptionCompat == null) {
            if (this.ComponentActivity) {
                this.PlaybackStateCompatCustomAction.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.PlaybackStateCompatCustomAction.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.PlaybackStateCompatCustomAction.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = write(paddingLeft, iMakeMeasureSpec, linearLayout);
            }
        }
        View view2 = this.MediaDescriptionCompat;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.MediaDescriptionCompat.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.serializer > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.MediaSessionCompatQueueItem = false;
        }
        if (!this.MediaSessionCompatQueueItem) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.MediaSessionCompatQueueItem = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.MediaSessionCompatQueueItem = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        boolean z2 = getLayoutDirection() == 1;
        if (z2) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.write;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.write.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingLeft - i5 : paddingLeft + i5;
            int iSerializer = serializer(this.write, i7, paddingTop, paddingTop2, z2) + i7;
            paddingLeft = z2 ? iSerializer - i6 : iSerializer + i6;
        }
        LinearLayout linearLayout = this.PlaybackStateCompatCustomAction;
        if (linearLayout != null && this.MediaDescriptionCompat == null && linearLayout.getVisibility() != 8) {
            paddingLeft += serializer(this.PlaybackStateCompatCustomAction, paddingLeft, paddingTop, paddingTop2, z2);
        }
        View view2 = this.MediaDescriptionCompat;
        if (view2 != null) {
            serializer(view2, paddingLeft, paddingTop, paddingTop2, z2);
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = this.MediaBrowserCompatMediaItem;
        if (setsupportprogressbarindeterminatevisibility != null) {
            serializer(setsupportprogressbarindeterminatevisibility, paddingRight, paddingTop, paddingTop2, !z2);
        }
    }

    public onKeyDown(Context context) {
        this(context, null);
    }
}
