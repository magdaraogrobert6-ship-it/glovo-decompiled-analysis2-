package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.view.WindowInsetsCompat$Impl;
import androidx.transition.Transition$3;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public class onDestroy extends ViewGroup implements getScope {
    public static final FocusRequesterModifierKt RemoteActionCompatParcelizer;
    public static final android.graphics.Rect read;
    public static final int[] write = {com.logistics.rider.glovo.R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public int ComponentActivity;
    public onLocalesChanged IconCompatParcelizer;
    public final onPrepareSupportNavigateUpTaskStack MediaBrowserCompatMediaItem;
    public FocusRequesterModifierKt MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public onPostCreate MediaSessionCompatQueueItem;
    public final android.graphics.Rect MediaSessionCompatResultReceiverWrapper;
    public setActionBarHideOffset MediaSessionCompatToken;
    public OverScroller ParcelableVolumeInfo;
    public setContentHeight PlaybackStateCompat;
    public ViewPropertyAnimator PlaybackStateCompatCustomAction;
    public final android.graphics.Rect RatingCompat;
    public boolean ResultReceiver;
    public int accessensureViewModelStore;
    public final android.graphics.Rect r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public FocusRequesterModifierKt r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final onPostResume r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public FocusRequesterModifierKt r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public FocusRequesterModifierKt r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final android.graphics.Rect r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final Transition$3 r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final onPrepareSupportNavigateUpTaskStack r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public Drawable r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final FocusPropertiesImplonEnter1 r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public int serializer;

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof onSupportActionModeFinished;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z;
    }

    public void setOverlayMode(boolean z) {
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new onSupportActionModeFinished(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        FocusPropertiesImplonEnter1 focusPropertiesImplonEnter1 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        return focusPropertiesImplonEnter1.RemoteActionCompatParcelizer | focusPropertiesImplonEnter1.serializer;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        run runVar;
        PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.serializer = i;
        this.ComponentActivity = getActionBarHideOffset();
        read();
        onPostCreate onpostcreate = this.MediaSessionCompatQueueItem;
        if (onpostcreate == null || (predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 = (runVar = (run) onpostcreate).MediaSessionCompatQueueItem) == null) {
            return;
        }
        predictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1.serializer();
        runVar.MediaSessionCompatQueueItem = null;
    }

    public final void read() {
        removeCallbacks(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        removeCallbacks(this.MediaBrowserCompatMediaItem);
        ViewPropertyAnimator viewPropertyAnimator = this.PlaybackStateCompatCustomAction;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void setActionBarVisibilityCallback(onPostCreate onpostcreate) {
        this.MediaSessionCompatQueueItem = onpostcreate;
        if (getWindowToken() != null) {
            ((run) this.MediaSessionCompatQueueItem).MediaMetadataCompat = this.accessensureViewModelStore;
            int i = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                requestApplyInsets();
            }
        }
    }

    public final void IconCompatParcelizer() {
        onSupportActionModeStarted onsupportactionmodestarted;
        MediaMetadataCompat();
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = ((setFilters) this.MediaSessionCompatToken).PlaybackStateCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (setsupportprogressbarindeterminatevisibility == null || (onsupportactionmodestarted = setsupportprogressbarindeterminatevisibility.PlaybackStateCompatCustomAction) == null) {
            return;
        }
        onsupportactionmodestarted.RemoteActionCompatParcelizer();
        openOptionsMenu openoptionsmenu = onsupportactionmodestarted.serializer;
        if (openoptionsmenu == null || !openoptionsmenu.serializer()) {
            return;
        }
        openoptionsmenu.MediaMetadataCompat.RemoteActionCompatParcelizer();
    }

    public final boolean MediaBrowserCompatMediaItem() {
        MediaMetadataCompat();
        return ((setFilters) this.MediaSessionCompatToken).PlaybackStateCompat.RatingCompat();
    }

    public final boolean MediaSessionCompatQueueItem() {
        MediaMetadataCompat();
        return ((setFilters) this.MediaSessionCompatToken).PlaybackStateCompat.MediaMetadataCompat();
    }

    public final boolean RemoteActionCompatParcelizer() {
        onSupportActionModeStarted onsupportactionmodestarted;
        MediaMetadataCompat();
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = ((setFilters) this.MediaSessionCompatToken).PlaybackStateCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (setsupportprogressbarindeterminatevisibility == null || (onsupportactionmodestarted = setsupportprogressbarindeterminatevisibility.PlaybackStateCompatCustomAction) == null) {
            return false;
        }
        return onsupportactionmodestarted.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null || onsupportactionmodestarted.write();
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != null) {
            if (this.IconCompatParcelizer.getVisibility() == 0) {
                translationY = (int) (this.IconCompatParcelizer.getTranslationY() + this.IconCompatParcelizer.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setBounds(0, translationY, getWidth(), this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getIntrinsicHeight() + translationY);
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new onSupportActionModeFinished(-1, -1);
    }

    public CharSequence getTitle() {
        MediaMetadataCompat();
        return ((setFilters) this.MediaSessionCompatToken).PlaybackStateCompat.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        MediaMetadataCompat();
        FocusRequesterModifierKt focusRequesterModifierKtWrite = FocusRequesterModifierKt.write(this, windowInsets);
        boolean z = read(this.IconCompatParcelizer, new android.graphics.Rect(focusRequesterModifierKtWrite.read(), focusRequesterModifierKtWrite.RemoteActionCompatParcelizer(), focusRequesterModifierKtWrite.serializer(), focusRequesterModifierKtWrite.write()), false);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        android.graphics.Rect rect = this.RatingCompat;
        accessgetCancelcp.RemoteActionCompatParcelizer(this, focusRequesterModifierKtWrite, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKtWrite.IconCompatParcelizer;
        FocusRequesterModifierKt focusRequesterModifierKtInset = windowInsetsCompat$Impl.inset(i, i2, i3, i4);
        this.MediaDescriptionCompat = focusRequesterModifierKtInset;
        if (!this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.equals(focusRequesterModifierKtInset)) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = this.MediaDescriptionCompat;
            z = true;
        }
        android.graphics.Rect rect2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (rect2.equals(rect)) {
            if (z) {
            }
            return windowInsetsCompat$Impl.consumeDisplayCutout().IconCompatParcelizer.consumeSystemWindowInsets().IconCompatParcelizer.consumeStableInsets().IconCompatParcelizer();
        }
        rect2.set(rect);
        requestLayout();
        return windowInsetsCompat$Impl.consumeDisplayCutout().IconCompatParcelizer.consumeSystemWindowInsets().IconCompatParcelizer.consumeStableInsets().IconCompatParcelizer();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RemoteActionCompatParcelizer(getContext());
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        read();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00da  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        FocusRequesterModifierKt focusRequesterModifierKt;
        int i3;
        FocusRequesterModifier getfocusrequester;
        MediaMetadataCompat();
        measureChildWithMargins(this.IconCompatParcelizer, i, 0, i2, 0);
        onSupportActionModeFinished onsupportactionmodefinished = (onSupportActionModeFinished) this.IconCompatParcelizer.getLayoutParams();
        int iMax = Math.max(0, this.IconCompatParcelizer.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).leftMargin + ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).rightMargin);
        int iMax2 = Math.max(0, this.IconCompatParcelizer.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).topMargin + ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.IconCompatParcelizer.getMeasuredState());
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        boolean z = (getWindowSystemUiVisibility() & androidx.compose.ui.graphics.Fields.RotationX) != 0;
        if (z) {
            measuredHeight = this.serializer;
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && this.IconCompatParcelizer.getTabContainer() != null) {
                measuredHeight += this.serializer;
            }
        } else {
            measuredHeight = this.IconCompatParcelizer.getVisibility() != 8 ? this.IconCompatParcelizer.getMeasuredHeight() : 0;
        }
        android.graphics.Rect rect = this.RatingCompat;
        android.graphics.Rect rect2 = this.MediaSessionCompatResultReceiverWrapper;
        rect2.set(rect);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = this.MediaDescriptionCompat;
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 || z) {
            setRight setrightIconCompatParcelizer = setRight.IconCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read(), this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer() + measuredHeight, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer(), this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write());
            focusRequesterModifierKt = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                getfocusrequester = new pinFocusedChild(focusRequesterModifierKt);
            } else if (i3 >= 35) {
                getfocusrequester = new FocusRequesterNode(focusRequesterModifierKt);
            } else if (i3 >= 34) {
                getfocusrequester = new FocusRequesterModifierNode(focusRequesterModifierKt);
            } else if (i3 >= 31) {
                getfocusrequester = new C0165focusRequester(focusRequesterModifierKt);
            } else if (i3 >= 30) {
                getfocusrequester = new FocusRequesterModifierNodeKt(focusRequesterModifierKt);
            } else if (i3 >= 29) {
                getfocusrequester = new FocusRequesterKt(focusRequesterModifierKt);
            } else {
                getfocusrequester = new getFocusRequester(focusRequesterModifierKt);
            }
            getfocusrequester.write(setrightIconCompatParcelizer);
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getfocusrequester.RemoteActionCompatParcelizer();
        } else {
            onPostResume onpostresume = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            FocusRequesterModifierKt focusRequesterModifierKt2 = RemoteActionCompatParcelizer;
            android.graphics.Rect rect3 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            accessgetCancelcp.RemoteActionCompatParcelizer(onpostresume, focusRequesterModifierKt2, rect3);
            if (rect3.equals(read)) {
                setRight setrightIconCompatParcelizer2 = setRight.IconCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read(), this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer() + measuredHeight, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer(), this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write());
                focusRequesterModifierKt = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    getfocusrequester = new pinFocusedChild(focusRequesterModifierKt);
                } else if (i3 >= 35) {
                    getfocusrequester = new FocusRequesterNode(focusRequesterModifierKt);
                } else if (i3 >= 34) {
                    getfocusrequester = new FocusRequesterModifierNode(focusRequesterModifierKt);
                } else if (i3 >= 31) {
                    getfocusrequester = new C0165focusRequester(focusRequesterModifierKt);
                } else if (i3 >= 30) {
                    getfocusrequester = new FocusRequesterModifierNodeKt(focusRequesterModifierKt);
                } else if (i3 >= 29) {
                    getfocusrequester = new FocusRequesterKt(focusRequesterModifierKt);
                } else {
                    getfocusrequester = new getFocusRequester(focusRequesterModifierKt);
                }
                getfocusrequester.write(setrightIconCompatParcelizer2);
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getfocusrequester.RemoteActionCompatParcelizer();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer.inset(0, measuredHeight, 0, 0);
            }
        }
        read(this.PlaybackStateCompat, rect2, true);
        if (!this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.equals(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) {
            FocusRequesterModifierKt focusRequesterModifierKt3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = focusRequesterModifierKt3;
            FocusPropertiesNode.write(this.PlaybackStateCompat, focusRequesterModifierKt3);
        }
        measureChildWithMargins(this.PlaybackStateCompat, i, 0, i2, 0);
        onSupportActionModeFinished onsupportactionmodefinished2 = (onSupportActionModeFinished) this.PlaybackStateCompat.getLayoutParams();
        int iMax3 = Math.max(iMax, this.PlaybackStateCompat.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished2).leftMargin + ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished2).rightMargin);
        int iMax4 = Math.max(iMax2, this.PlaybackStateCompat.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished2).topMargin + ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.PlaybackStateCompat.getMeasuredState());
        int paddingLeft = getPaddingLeft();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + paddingLeft + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.ComponentActivity + i2;
        this.ComponentActivity = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        MediaMetadataCompat();
        int i2 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & androidx.compose.ui.graphics.Fields.RotationX) != 0;
        onPostCreate onpostcreate = this.MediaSessionCompatQueueItem;
        if (onpostcreate != null) {
            run runVar = (run) onpostcreate;
            runVar.read = !z2;
            if (z || !z2) {
                if (runVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                    runVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
                    runVar.RatingCompat(true);
                }
            } else if (!runVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                runVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                runVar.RatingCompat(true);
            }
        }
        if (((i ^ i2) & androidx.compose.ui.graphics.Fields.RotationX) == 0 || this.MediaSessionCompatQueueItem == null) {
            return;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.accessensureViewModelStore = i;
        onPostCreate onpostcreate = this.MediaSessionCompatQueueItem;
        if (onpostcreate != null) {
            ((run) onpostcreate).MediaMetadataCompat = i;
        }
    }

    public final boolean serializer() {
        onSupportActionModeStarted onsupportactionmodestarted;
        MediaMetadataCompat();
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = ((setFilters) this.MediaSessionCompatToken).PlaybackStateCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        return (setsupportprogressbarindeterminatevisibility == null || (onsupportactionmodestarted = setsupportprogressbarindeterminatevisibility.PlaybackStateCompatCustomAction) == null || !onsupportactionmodestarted.RemoteActionCompatParcelizer()) ? false : true;
    }

    public void setActionBarHideOffset(int i) {
        read();
        this.IconCompatParcelizer.setTranslationY(-Math.max(0, Math.min(i, this.IconCompatParcelizer.getHeight())));
    }

    public void setIcon(int i) {
        MediaMetadataCompat();
        setFilters setfilters = (setFilters) this.MediaSessionCompatToken;
        setfilters.RatingCompat = i != 0 ? coil3.util.IntPair.write(setfilters.PlaybackStateCompat.getContext(), i) : null;
        setfilters.serializer();
    }

    public void setLogo(int i) {
        MediaMetadataCompat();
        setFilters setfilters = (setFilters) this.MediaSessionCompatToken;
        setfilters.MediaMetadataCompat = i != 0 ? coil3.util.IntPair.write(setfilters.PlaybackStateCompat.getContext(), i) : null;
        setfilters.serializer();
    }

    public final void setMenu(Menu menu, getDrawerToggleDelegate getdrawertoggledelegate) {
        MediaMetadataCompat();
        setFilters setfilters = (setFilters) this.MediaSessionCompatToken;
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        if (setfilters.write == null) {
            setfilters.write = new onSupportActionModeStarted(toolbar.getContext());
        }
        onSupportActionModeStarted onsupportactionmodestarted = setfilters.write;
        onsupportactionmodestarted.write = getdrawertoggledelegate;
        AlertControllerButtonHandler alertControllerButtonHandler = (AlertControllerButtonHandler) menu;
        if (alertControllerButtonHandler == null && toolbar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
            return;
        }
        toolbar.ensureMenuView();
        AlertControllerButtonHandler alertControllerButtonHandler2 = toolbar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.serializer;
        if (alertControllerButtonHandler2 == alertControllerButtonHandler) {
            return;
        }
        if (alertControllerButtonHandler2 != null) {
            alertControllerButtonHandler2.write(toolbar.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
            alertControllerButtonHandler2.write(toolbar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
        if (toolbar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
            toolbar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new setAllCaps(toolbar);
        }
        onsupportactionmodestarted.MediaMetadataCompat = true;
        Context context = toolbar.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (alertControllerButtonHandler != null) {
            alertControllerButtonHandler.RemoteActionCompatParcelizer(onsupportactionmodestarted, context);
            alertControllerButtonHandler.RemoteActionCompatParcelizer(toolbar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, toolbar.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        } else {
            onsupportactionmodestarted.IconCompatParcelizer(context, (AlertControllerButtonHandler) null);
            toolbar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(toolbar.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, (AlertControllerButtonHandler) null);
            onsupportactionmodestarted.MediaDescriptionCompat();
            toolbar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.MediaDescriptionCompat();
        }
        toolbar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.setPopupTheme(toolbar.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        toolbar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.setPresenter(onsupportactionmodestarted);
        toolbar.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = onsupportactionmodestarted;
        toolbar.MediaBrowserCompatMediaItem();
    }

    public final void setMenuPrepared() {
        MediaMetadataCompat();
        ((setFilters) this.MediaSessionCompatToken).MediaSessionCompatQueueItem = true;
    }

    public void setWindowCallback(Window.Callback callback) {
        MediaMetadataCompat();
        ((setFilters) this.MediaSessionCompatToken).PlaybackStateCompatCustomAction = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        MediaMetadataCompat();
        setFilters setfilters = (setFilters) this.MediaSessionCompatToken;
        if (setfilters.MediaSessionCompatToken) {
            return;
        }
        androidx.appcompat.widget.Toolbar toolbar = setfilters.PlaybackStateCompat;
        setfilters.ParcelableVolumeInfo = charSequence;
        if ((setfilters.IconCompatParcelizer & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (setfilters.MediaSessionCompatToken) {
                FocusPropertiesNode.read(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final boolean write() {
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility;
        MediaMetadataCompat();
        androidx.appcompat.widget.Toolbar toolbar = ((setFilters) this.MediaSessionCompatToken).PlaybackStateCompat;
        return toolbar.getVisibility() == 0 && (setsupportprogressbarindeterminatevisibility = toolbar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) != null && setsupportprogressbarindeterminatevisibility.PlaybackStateCompat;
    }

    public onDestroy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.accessensureViewModelStore = 0;
        this.RatingCompat = new android.graphics.Rect();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new android.graphics.Rect();
        this.MediaSessionCompatResultReceiverWrapper = new android.graphics.Rect();
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        new android.graphics.Rect();
        FocusRequesterModifierKt focusRequesterModifierKt = FocusRequesterModifierKt.read;
        this.MediaDescriptionCompat = focusRequesterModifierKt;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = focusRequesterModifierKt;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = focusRequesterModifierKt;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = focusRequesterModifierKt;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new Transition$3(1, this);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new onPrepareSupportNavigateUpTaskStack(this, 0);
        this.MediaBrowserCompatMediaItem = new onPrepareSupportNavigateUpTaskStack(this, 1);
        RemoteActionCompatParcelizer(context);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new FocusPropertiesImplonEnter1();
        onPostResume onpostresume = new onPostResume(context);
        onpostresume.setWillNotDraw(true);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = onpostresume;
        addView(onpostresume);
    }

    public static boolean read(View view, android.graphics.Rect rect, boolean z) {
        boolean z2;
        onSupportActionModeFinished onsupportactionmodefinished = (onSupportActionModeFinished) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final void RemoteActionCompatParcelizer(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(write);
        this.serializer = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.ParcelableVolumeInfo = new OverScroller(context);
    }

    public int getActionBarHideOffset() {
        onLocalesChanged onlocaleschanged = this.IconCompatParcelizer;
        if (onlocaleschanged != null) {
            return -((int) onlocaleschanged.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                onSupportActionModeFinished onsupportactionmodefinished = (onSupportActionModeFinished) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) onsupportactionmodefinished).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.IconCompatParcelizer.getVisibility() != 0) {
            return false;
        }
        return this.ResultReceiver;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.ResultReceiver || this.MediaMetadataCompat) {
            return;
        }
        if (this.ComponentActivity <= this.IconCompatParcelizer.getHeight()) {
            read();
            postDelayed(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, 600L);
        } else {
            read();
            postDelayed(this.MediaBrowserCompatMediaItem, 600L);
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.ResultReceiver) {
            this.ResultReceiver = z;
            if (z) {
                return;
            }
            read();
            setActionBarHideOffset(0);
        }
    }

    static {
        FocusRequesterModifier getfocusrequester;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            getfocusrequester = new pinFocusedChild();
        } else if (i >= 35) {
            getfocusrequester = new FocusRequesterNode();
        } else if (i >= 34) {
            getfocusrequester = new FocusRequesterModifierNode();
        } else if (i >= 31) {
            getfocusrequester = new C0165focusRequester();
        } else if (i >= 30) {
            getfocusrequester = new FocusRequesterModifierNodeKt();
        } else if (i >= 29) {
            getfocusrequester = new FocusRequesterKt();
        } else {
            getfocusrequester = new getFocusRequester();
        }
        getfocusrequester.write(setRight.IconCompatParcelizer(0, 1, 0, 1));
        RemoteActionCompatParcelizer = getfocusrequester.RemoteActionCompatParcelizer();
        read = new android.graphics.Rect();
    }

    public final void MediaMetadataCompat() {
        setActionBarHideOffset wrapper;
        if (this.PlaybackStateCompat == null) {
            this.PlaybackStateCompat = (setContentHeight) findViewById(com.logistics.rider.glovo.R.id.action_bar_activity_content);
            this.IconCompatParcelizer = (onLocalesChanged) findViewById(com.logistics.rider.glovo.R.id.action_bar_container);
            android.view.KeyEvent.Callback callbackFindViewById = findViewById(com.logistics.rider.glovo.R.id.action_bar);
            if (callbackFindViewById instanceof setActionBarHideOffset) {
                wrapper = (setActionBarHideOffset) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof androidx.appcompat.widget.Toolbar)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((androidx.appcompat.widget.Toolbar) callbackFindViewById).getWrapper();
            }
            this.MediaSessionCompatToken = wrapper;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.ResultReceiver || !z) {
            return false;
        }
        this.ParcelableVolumeInfo.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.ParcelableVolumeInfo.getFinalY() > this.IconCompatParcelizer.getHeight()) {
            read();
            this.MediaBrowserCompatMediaItem.run();
        } else {
            read();
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.run();
        }
        this.MediaMetadataCompat = true;
        return true;
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // o.getScope
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new onSupportActionModeFinished(layoutParams);
    }

    public final void read(int i) {
        MediaMetadataCompat();
        if (i == 2) {
            this.MediaSessionCompatToken.getClass();
        } else if (i == 5) {
            this.MediaSessionCompatToken.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // o.FocusPropertiesElement
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void setIcon(Drawable drawable) {
        MediaMetadataCompat();
        setFilters setfilters = (setFilters) this.MediaSessionCompatToken;
        setfilters.RatingCompat = drawable;
        setfilters.serializer();
    }

    @Override // o.FocusPropertiesElement
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // o.FocusPropertiesElement
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }
}
