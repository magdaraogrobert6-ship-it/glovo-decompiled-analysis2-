package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class setExpandedActionViewsExclusive implements invalidateOptionsMenu {
    public static final Method MediaBrowserCompatMediaItem;
    public static final Method MediaMetadataCompat;
    public android.graphics.Rect ComponentActivity;
    public final Context MediaDescriptionCompat;
    public ListAdapter MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public setHasNonEmbeddedTabs PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public View RatingCompat;
    public final Handler ResultReceiver;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public AdapterView.OnItemSelectedListener r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public AdapterView.OnItemClickListener r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public setOverflowReserved r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final setItemInvoker r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final int MediaSessionCompatToken = -2;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -2;
    public final int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1002;
    public int ParcelableVolumeInfo = 0;
    public final int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Integer.MAX_VALUE;
    public final setOnMenuItemClickListener r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new setOnMenuItemClickListener(this, 1);
    public final ListPopupWindow$PopupTouchInterceptor accessensureViewModelStore = new ListPopupWindow$PopupTouchInterceptor(0, this);
    public final setPresenter _init_lambda1 = new setPresenter(this);
    public final setOnMenuItemClickListener r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new setOnMenuItemClickListener(this, 0);
    public final android.graphics.Rect _init_lambda3 = new android.graphics.Rect();

    public final void RemoteActionCompatParcelizer(int i) {
        this.PlaybackStateCompatCustomAction = i;
    }

    @Override // o.invalidateOptionsMenu
    public final setHasNonEmbeddedTabs a_() {
        return this.PlaybackStateCompat;
    }

    public final int write() {
        return this.PlaybackStateCompatCustomAction;
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                MediaBrowserCompatMediaItem = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                MediaMetadataCompat = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", android.graphics.Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public final Drawable IconCompatParcelizer() {
        return this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getBackground();
    }

    public final void IconCompatParcelizer(Drawable drawable) {
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setBackgroundDrawable(drawable);
    }

    @Override // o.invalidateOptionsMenu
    public final void RemoteActionCompatParcelizer() {
        setItemInvoker setiteminvoker = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        setiteminvoker.dismiss();
        setiteminvoker.setContentView(null);
        this.PlaybackStateCompat = null;
        this.ResultReceiver.removeCallbacks(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
    }

    @Override // o.invalidateOptionsMenu
    public final void b_() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        setHasNonEmbeddedTabs sethasnonembeddedtabs;
        setHasNonEmbeddedTabs sethasnonembeddedtabs2 = this.PlaybackStateCompat;
        Context context = this.MediaDescriptionCompat;
        setItemInvoker setiteminvoker = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (sethasnonembeddedtabs2 == null) {
            setHasNonEmbeddedTabs sethasnonembeddedtabsWrite = write(context, !this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            this.PlaybackStateCompat = sethasnonembeddedtabsWrite;
            sethasnonembeddedtabsWrite.setAdapter(this.MediaSessionCompatQueueItem);
            this.PlaybackStateCompat.setOnItemClickListener(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
            this.PlaybackStateCompat.setFocusable(true);
            this.PlaybackStateCompat.setFocusableInTouchMode(true);
            this.PlaybackStateCompat.setOnItemSelectedListener(new getPopupTheme(this));
            this.PlaybackStateCompat.setOnScrollListener(this._init_lambda1);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (onItemSelectedListener != null) {
                this.PlaybackStateCompat.setOnItemSelectedListener(onItemSelectedListener);
            }
            setiteminvoker.setContentView(this.PlaybackStateCompat);
        }
        Drawable background = setiteminvoker.getBackground();
        android.graphics.Rect rect = this._init_lambda3;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                this.MediaSessionCompatResultReceiverWrapper = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iRemoteActionCompatParcelizer = setOverflowIcon.RemoteActionCompatParcelizer(setiteminvoker, this.RatingCompat, this.MediaSessionCompatResultReceiverWrapper, setiteminvoker.getInputMethodMode() == 2);
        int i3 = this.MediaSessionCompatToken;
        if (i3 == -1) {
            paddingBottom = iRemoteActionCompatParcelizer + i;
        } else {
            int i4 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iSerializer = this.PlaybackStateCompat.serializer(iMakeMeasureSpec, iRemoteActionCompatParcelizer);
            paddingBottom = iSerializer + (iSerializer > 0 ? this.PlaybackStateCompat.getPaddingBottom() + this.PlaybackStateCompat.getPaddingTop() + i : 0);
        }
        boolean z = setiteminvoker.getInputMethodMode() == 2;
        setiteminvoker.setWindowLayoutType(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        if (setiteminvoker.isShowing()) {
            if (this.RatingCompat.isAttachedToWindow()) {
                int width = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.RatingCompat.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    if (z) {
                        setiteminvoker.setWidth(i5 == -1 ? -1 : 0);
                        setiteminvoker.setHeight(0);
                    } else {
                        setiteminvoker.setWidth(i5 == -1 ? -1 : 0);
                        setiteminvoker.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                setiteminvoker.setOutsideTouchable(true);
                setiteminvoker.update(this.RatingCompat, this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper, width < 0 ? -1 : width, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int width2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.RatingCompat.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        setiteminvoker.setWidth(width2);
        setiteminvoker.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = MediaBrowserCompatMediaItem;
            if (method != null) {
                try {
                    method.invoke(setiteminvoker, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            setPopupTheme.write(setiteminvoker, true);
        }
        setiteminvoker.setOutsideTouchable(true);
        setiteminvoker.setTouchInterceptor(this.accessensureViewModelStore);
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
            setiteminvoker.setOverlapAnchor(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = MediaMetadataCompat;
            if (method2 != null) {
                try {
                    method2.invoke(setiteminvoker, this.ComponentActivity);
                } catch (Exception e) {
                    SentryLogcatAdapter.read("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            setPopupTheme.read(setiteminvoker, this.ComponentActivity);
        }
        setiteminvoker.showAsDropDown(this.RatingCompat, this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper, this.ParcelableVolumeInfo);
        this.PlaybackStateCompat.setSelection(-1);
        if ((!this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 || this.PlaybackStateCompat.isInTouchMode()) && (sethasnonembeddedtabs = this.PlaybackStateCompat) != null) {
            sethasnonembeddedtabs.setListSelectionHidden(true);
            sethasnonembeddedtabs.requestLayout();
        }
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
            return;
        }
        this.ResultReceiver.post(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
    }

    public final void read(int i) {
        Drawable background = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getBackground();
        if (background == null) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
            return;
        }
        android.graphics.Rect rect = this._init_lambda3;
        background.getPadding(rect);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = rect.left + rect.right + i;
    }

    @Override // o.invalidateOptionsMenu
    public final boolean serializer() {
        return this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing();
    }

    public setHasNonEmbeddedTabs write(Context context, boolean z) {
        return new setHasNonEmbeddedTabs(context, z);
    }

    public final void write(int i) {
        this.MediaSessionCompatResultReceiverWrapper = i;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
    }

    public setExpandedActionViewsExclusive(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.MediaDescriptionCompat = context;
        this.ResultReceiver = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.ListPopupWindow, i, 0);
        this.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.MediaSessionCompatResultReceiverWrapper = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        setItemInvoker setiteminvoker = new setItemInvoker(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.PopupWindow, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            setiteminvoker.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        setiteminvoker.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : coil3.util.IntPair.write(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = setiteminvoker;
        setiteminvoker.setInputMethodMode(1);
    }

    public final int MediaBrowserCompatMediaItem() {
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            return this.MediaSessionCompatResultReceiverWrapper;
        }
        return 0;
    }

    public void read(ListAdapter listAdapter) {
        setOverflowReserved setoverflowreserved = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (setoverflowreserved == null) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new setOverflowReserved(this);
        } else {
            ListAdapter listAdapter2 = this.MediaSessionCompatQueueItem;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(setoverflowreserved);
            }
        }
        this.MediaSessionCompatQueueItem = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        }
        setHasNonEmbeddedTabs sethasnonembeddedtabs = this.PlaybackStateCompat;
        if (sethasnonembeddedtabs != null) {
            sethasnonembeddedtabs.setAdapter(this.MediaSessionCompatQueueItem);
        }
    }
}
