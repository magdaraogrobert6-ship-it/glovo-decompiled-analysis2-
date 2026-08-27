package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.camera.core.ImageCapture$1;

/* JADX INFO: loaded from: classes.dex */
public class setSupportProgressBarIndeterminateVisibility extends getOverflowIcon implements handleMessage, onCreateSupportNavigateUpTaskStack {
    public setDropDownVerticalOffset IconCompatParcelizer;
    public Context MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public IntentSenderRequest MediaSessionCompatQueueItem;
    public boolean PlaybackStateCompat;
    public onSupportActionModeStarted PlaybackStateCompatCustomAction;
    public setSupportProgressBarVisibility RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public int read;
    public AlertControllerButtonHandler serializer;
    public boolean write;

    @Override // o.getOverflowIcon, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof setSupportProgress;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getPopupTheme() {
        return this.MediaMetadataCompat;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void setOnMenuItemClickListener(setSupportProgressBarVisibility setsupportprogressbarvisibility) {
        this.RatingCompat = setsupportprogressbarvisibility;
    }

    public void setOverflowReserved(boolean z) {
        this.PlaybackStateCompat = z;
    }

    @Override // o.onCreateSupportNavigateUpTaskStack
    public final void write(AlertControllerButtonHandler alertControllerButtonHandler) {
        this.serializer = alertControllerButtonHandler;
    }

    public static setSupportProgress IconCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
        setSupportProgress setsupportprogress;
        if (layoutParams == null) {
            return serializer();
        }
        if (layoutParams instanceof setSupportProgress) {
            setSupportProgress setsupportprogress2 = (setSupportProgress) layoutParams;
            setsupportprogress = new setSupportProgress(setsupportprogress2);
            setsupportprogress.serializer = setsupportprogress2.serializer;
        } else {
            setsupportprogress = new setSupportProgress(layoutParams);
        }
        if (((LinearLayout.LayoutParams) setsupportprogress).gravity <= 0) {
            ((LinearLayout.LayoutParams) setsupportprogress).gravity = 16;
        }
        return setsupportprogress;
    }

    @Override // o.getOverflowIcon, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.write) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                setSupportProgress setsupportprogress = (setSupportProgress) childAt.getLayoutParams();
                if (setsupportprogress.serializer) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (read(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) setsupportprogress).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) setsupportprogress).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) setsupportprogress).leftMargin) + ((LinearLayout.LayoutParams) setsupportprogress).rightMargin;
                    read(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                setSupportProgress setsupportprogress2 = (setSupportProgress) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !setsupportprogress2.serializer) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) setsupportprogress2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) setsupportprogress2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            setSupportProgress setsupportprogress3 = (setSupportProgress) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !setsupportprogress3.serializer) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) setsupportprogress3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) setsupportprogress3).rightMargin + iMax + i18;
            }
        }
    }

    @Override // o.getOverflowIcon, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        AlertControllerButtonHandler alertControllerButtonHandler;
        boolean z = this.write;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.write = z2;
        if (z != z2) {
            this.read = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.write && (alertControllerButtonHandler = this.serializer) != null && size != this.read) {
            this.read = size;
            alertControllerButtonHandler.write(true);
        }
        int childCount = getChildCount();
        if (!this.write || childCount <= 0) {
            for (int i6 = 0; i6 < childCount; i6++) {
                setSupportProgress setsupportprogress = (setSupportProgress) getChildAt(i6).getLayoutParams();
                ((LinearLayout.LayoutParams) setsupportprogress).rightMargin = 0;
                ((LinearLayout.LayoutParams) setsupportprogress).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i7 = size2 - (paddingRight + paddingLeft);
        int i8 = this.MediaDescriptionCompat;
        int i9 = i7 / i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i10 = ((i7 % i8) / i9) + i8;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i11 = 0;
        int iMax2 = 0;
        int i12 = 0;
        boolean z3 = false;
        int i13 = 0;
        long j = 0;
        while (true) {
            i3 = this.RemoteActionCompatParcelizer;
            if (i12 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i12);
            int i14 = size3;
            int i15 = i7;
            if (childAt.getVisibility() != 8) {
                boolean z4 = childAt instanceof accessgetLaunchedKeysp;
                int i16 = i11 + 1;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                setSupportProgress setsupportprogress2 = (setSupportProgress) childAt.getLayoutParams();
                setsupportprogress2.IconCompatParcelizer = false;
                setsupportprogress2.RemoteActionCompatParcelizer = 0;
                setsupportprogress2.read = 0;
                setsupportprogress2.write = false;
                ((LinearLayout.LayoutParams) setsupportprogress2).leftMargin = 0;
                ((LinearLayout.LayoutParams) setsupportprogress2).rightMargin = 0;
                setsupportprogress2.RatingCompat = z4 && !TextUtils.isEmpty(((accessgetLaunchedKeysp) childAt).getText());
                int i17 = setsupportprogress2.serializer ? 1 : i9;
                setSupportProgress setsupportprogress3 = (setSupportProgress) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                accessgetLaunchedKeysp accessgetlaunchedkeysp = z4 ? (accessgetLaunchedKeysp) childAt : null;
                boolean z5 = (accessgetlaunchedkeysp == null || TextUtils.isEmpty(accessgetlaunchedkeysp.getText())) ? false : true;
                if (i17 <= 0 || (z5 && i17 < 2)) {
                    i5 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i10, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i5 = measuredWidth / i10;
                    if (measuredWidth % i10 != 0) {
                        i5++;
                    }
                    if (z5 && i5 < 2) {
                        i5 = 2;
                    }
                }
                setsupportprogress3.write = !setsupportprogress3.serializer && z5;
                setsupportprogress3.read = i5;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i10, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i5);
                if (setsupportprogress2.write) {
                    i13++;
                }
                if (setsupportprogress2.serializer) {
                    z3 = true;
                }
                i9 -= i5;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i5 == 1) {
                    j |= (long) (1 << i12);
                }
                i11 = i16;
            }
            i12++;
            size3 = i14;
            i7 = i15;
            mode = mode;
            childMeasureSpec = childMeasureSpec;
        }
        int i18 = mode;
        int i19 = i7;
        int i20 = size3;
        int i21 = childMeasureSpec;
        boolean z6 = z3 && i11 == 2;
        boolean z7 = false;
        while (i13 > 0 && i9 > 0) {
            int i22 = Integer.MAX_VALUE;
            int i23 = 0;
            long j2 = 0;
            for (int i24 = 0; i24 < childCount2; i24++) {
                setSupportProgress setsupportprogress4 = (setSupportProgress) getChildAt(i24).getLayoutParams();
                if (setsupportprogress4.write) {
                    int i25 = setsupportprogress4.read;
                    if (i25 < i22) {
                        j2 = 1 << i24;
                        i22 = i25;
                        i23 = 1;
                    } else if (i25 == i22) {
                        i23++;
                        j2 |= 1 << i24;
                    }
                }
            }
            j |= j2;
            if (i23 > i9) {
                break;
            }
            int i26 = 0;
            while (i26 < childCount2) {
                View childAt2 = getChildAt(i26);
                setSupportProgress setsupportprogress5 = (setSupportProgress) childAt2.getLayoutParams();
                int i27 = iMax2;
                long j3 = 1 << i26;
                if ((j2 & j3) != 0) {
                    if (z6 && setsupportprogress5.RatingCompat && i9 == 1) {
                        childAt2.setPadding(i3 + i10, 0, i3, 0);
                    }
                    setsupportprogress5.read++;
                    setsupportprogress5.IconCompatParcelizer = true;
                    i9--;
                } else if (setsupportprogress5.read == i22 + 1) {
                    j |= j3;
                }
                i26++;
                iMax2 = i27;
            }
            z7 = true;
        }
        int i28 = iMax2;
        boolean z8 = !z3 && i11 == 1;
        if (i9 > 0 && j != 0 && (i9 < i11 - 1 || z8 || iMax > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z8) {
                if ((j & 1) != 0 && !((setSupportProgress) getChildAt(0).getLayoutParams()).RatingCompat) {
                    fBitCount -= 0.5f;
                }
                int i29 = childCount2 - 1;
                if ((j & ((long) (1 << i29))) != 0 && !((setSupportProgress) getChildAt(i29).getLayoutParams()).RatingCompat) {
                    fBitCount -= 0.5f;
                }
            }
            int i30 = fBitCount > 0.0f ? (int) ((i9 * i10) / fBitCount) : 0;
            boolean z9 = z7;
            for (int i31 = 0; i31 < childCount2; i31++) {
                if ((j & ((long) (1 << i31))) != 0) {
                    View childAt3 = getChildAt(i31);
                    setSupportProgress setsupportprogress6 = (setSupportProgress) childAt3.getLayoutParams();
                    if (childAt3 instanceof accessgetLaunchedKeysp) {
                        setsupportprogress6.RemoteActionCompatParcelizer = i30;
                        setsupportprogress6.IconCompatParcelizer = true;
                        if (i31 == 0 && !setsupportprogress6.RatingCompat) {
                            ((LinearLayout.LayoutParams) setsupportprogress6).leftMargin = (-i30) / 2;
                        }
                        z9 = true;
                    } else if (setsupportprogress6.serializer) {
                        setsupportprogress6.RemoteActionCompatParcelizer = i30;
                        setsupportprogress6.IconCompatParcelizer = true;
                        ((LinearLayout.LayoutParams) setsupportprogress6).rightMargin = (-i30) / 2;
                        z9 = true;
                    } else {
                        if (i31 != 0) {
                            ((LinearLayout.LayoutParams) setsupportprogress6).leftMargin = i30 / 2;
                        }
                        if (i31 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) setsupportprogress6).rightMargin = i30 / 2;
                        }
                    }
                }
            }
            z7 = z9;
        }
        if (z7) {
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt4 = getChildAt(i32);
                setSupportProgress setsupportprogress7 = (setSupportProgress) childAt4.getLayoutParams();
                if (setsupportprogress7.IconCompatParcelizer) {
                    i4 = i21;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((setsupportprogress7.read * i10) + setsupportprogress7.RemoteActionCompatParcelizer, 1073741824), i4);
                } else {
                    i4 = i21;
                }
                i32++;
                i21 = i4;
            }
        }
        setMeasuredDimension(i19, i18 != 1073741824 ? i28 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.PlaybackStateCompatCustomAction.MediaMetadataCompat = z;
    }

    public void setPresenter(onSupportActionModeStarted onsupportactionmodestarted) {
        this.PlaybackStateCompatCustomAction = onsupportactionmodestarted;
        onsupportactionmodestarted.PlaybackStateCompatCustomAction = this;
        this.serializer = onsupportactionmodestarted.MediaBrowserCompatMediaItem;
    }

    public static setSupportProgress serializer() {
        setSupportProgress setsupportprogress = new setSupportProgress(-2, -2);
        setsupportprogress.serializer = false;
        ((LinearLayout.LayoutParams) setsupportprogress).gravity = 16;
        return setsupportprogress;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        onSupportActionModeStarted onsupportactionmodestarted = this.PlaybackStateCompatCustomAction;
        onTitleChanged ontitlechanged = onsupportactionmodestarted.MediaSessionCompatResultReceiverWrapper;
        if (ontitlechanged != null) {
            return ontitlechanged.getDrawable();
        }
        if (onsupportactionmodestarted.PlaybackStateCompat) {
            return onsupportactionmodestarted.ParcelableVolumeInfo;
        }
        return null;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        onSupportActionModeStarted onsupportactionmodestarted = this.PlaybackStateCompatCustomAction;
        if (onsupportactionmodestarted != null) {
            onsupportactionmodestarted.MediaDescriptionCompat();
            if (this.PlaybackStateCompatCustomAction.write()) {
                this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
                this.PlaybackStateCompatCustomAction.serializer();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onSupportActionModeStarted onsupportactionmodestarted = this.PlaybackStateCompatCustomAction;
        if (onsupportactionmodestarted != null) {
            onsupportactionmodestarted.RemoteActionCompatParcelizer();
            openOptionsMenu openoptionsmenu = onsupportactionmodestarted.serializer;
            if (openoptionsmenu == null || !openoptionsmenu.serializer()) {
                return;
            }
            openoptionsmenu.MediaMetadataCompat.RemoteActionCompatParcelizer();
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        onSupportActionModeStarted onsupportactionmodestarted = this.PlaybackStateCompatCustomAction;
        onTitleChanged ontitlechanged = onsupportactionmodestarted.MediaSessionCompatResultReceiverWrapper;
        if (ontitlechanged != null) {
            ontitlechanged.setImageDrawable(drawable);
        } else {
            onsupportactionmodestarted.PlaybackStateCompat = true;
            onsupportactionmodestarted.ParcelableVolumeInfo = drawable;
        }
    }

    public setSupportProgressBarIndeterminateVisibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.MediaDescriptionCompat = (int) (56.0f * f);
        this.RemoteActionCompatParcelizer = (int) (f * 4.0f);
        this.MediaBrowserCompatMediaItem = context;
        this.MediaMetadataCompat = 0;
    }

    public Menu getMenu() {
        if (this.serializer == null) {
            Context context = getContext();
            AlertControllerButtonHandler alertControllerButtonHandler = new AlertControllerButtonHandler(context);
            this.serializer = alertControllerButtonHandler;
            alertControllerButtonHandler.RemoteActionCompatParcelizer = new ImageCapture$1(7, this);
            onSupportActionModeStarted onsupportactionmodestarted = new onSupportActionModeStarted(context);
            this.PlaybackStateCompatCustomAction = onsupportactionmodestarted;
            onsupportactionmodestarted.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
            onsupportactionmodestarted.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
            getDrawerToggleDelegate setsupportprogressbarindeterminate = this.IconCompatParcelizer;
            if (setsupportprogressbarindeterminate == null) {
                setsupportprogressbarindeterminate = new setSupportProgressBarIndeterminate();
            }
            onsupportactionmodestarted.write = setsupportprogressbarindeterminate;
            this.serializer.RemoteActionCompatParcelizer(onsupportactionmodestarted, this.MediaBrowserCompatMediaItem);
            onSupportActionModeStarted onsupportactionmodestarted2 = this.PlaybackStateCompatCustomAction;
            onsupportactionmodestarted2.PlaybackStateCompatCustomAction = this;
            this.serializer = onsupportactionmodestarted2.MediaBrowserCompatMediaItem;
        }
        return this.serializer;
    }

    @Override // o.handleMessage
    public final boolean serializer(Keep keep) {
        return this.serializer.RemoteActionCompatParcelizer(keep, null, 0);
    }

    public void setPopupTheme(int i) {
        if (this.MediaMetadataCompat != i) {
            this.MediaMetadataCompat = i;
            if (i == 0) {
                this.MediaBrowserCompatMediaItem = getContext();
            } else {
                this.MediaBrowserCompatMediaItem = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final boolean read(int i) {
        boolean zRemoteActionCompatParcelizer = false;
        if (i == 0) {
            return false;
        }
        android.view.KeyEvent.Callback childAt = getChildAt(i - 1);
        android.view.KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof setSupportActionBar)) {
            zRemoteActionCompatParcelizer = ((setSupportActionBar) childAt).RemoteActionCompatParcelizer();
        }
        return (i <= 0 || !(childAt2 instanceof setSupportActionBar)) ? zRemoteActionCompatParcelizer : ((setSupportActionBar) childAt2).IconCompatParcelizer() | zRemoteActionCompatParcelizer;
    }

    @Override // o.getOverflowIcon
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final /* synthetic */ setWindowTitle generateDefaultLayoutParams() {
        return serializer();
    }

    @Override // o.getOverflowIcon, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return serializer();
    }

    @Override // o.getOverflowIcon
    /* JADX INFO: renamed from: serializer */
    public final /* synthetic */ setWindowTitle generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return IconCompatParcelizer(layoutParams);
    }

    @Override // o.getOverflowIcon, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new setSupportProgress(getContext(), attributeSet);
    }

    @Override // o.getOverflowIcon, android.view.ViewGroup
    public final setWindowTitle generateLayoutParams(AttributeSet attributeSet) {
        return new setSupportProgress(getContext(), attributeSet);
    }

    @Override // o.getOverflowIcon, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return IconCompatParcelizer(layoutParams);
    }
}
