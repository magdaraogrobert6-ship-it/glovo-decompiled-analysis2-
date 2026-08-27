package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.stats.zza;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class setHasNonEmbeddedTabs extends ListView {
    public zza IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public fetchFocusRectui MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final android.graphics.Rect MediaSessionCompatResultReceiverWrapper;
    public setLogo ParcelableVolumeInfo;
    public int RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public boolean read;
    public boolean serializer;
    public int write;

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.IconCompatParcelizer = null;
        super.onDetachedFromWindow();
    }

    public void setListSelectionHidden(boolean z) {
        this.read = z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        Drawable selector;
        android.graphics.Rect rect = this.MediaSessionCompatResultReceiverWrapper;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public setHasNonEmbeddedTabs(Context context, boolean z) {
        super(context, null, com.logistics.rider.glovo.R.attr.dropDownListViewStyle);
        this.MediaSessionCompatResultReceiverWrapper = new android.graphics.Rect();
        this.RatingCompat = 0;
        this.MediaSessionCompatQueueItem = 0;
        this.MediaDescriptionCompat = 0;
        this.MediaBrowserCompatMediaItem = 0;
        this.RemoteActionCompatParcelizer = z;
        setCacheColorHint(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.RemoteActionCompatParcelizer || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.RemoteActionCompatParcelizer || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.RemoteActionCompatParcelizer || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.RemoteActionCompatParcelizer && this.read) || super.isInTouchMode();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0145  */
    /* JADX WARN: Code duplicated, block: B:82:0x015b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:88:0x0175  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:91:0x017b  */
    public final boolean onForwardedEvent(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zSerializer;
        View childAt;
        View childAt2;
        fetchFocusRectui fetchfocusrectui;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
            } else {
                z = false;
            }
            if (z || z2) {
                this.serializer = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.write - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            fetchfocusrectui = this.MediaMetadataCompat;
            if (z) {
                if (fetchfocusrectui == null) {
                    this.MediaMetadataCompat = new fetchFocusRectui(this);
                }
                fetchFocusRectui fetchfocusrectui2 = this.MediaMetadataCompat;
                boolean z3 = fetchfocusrectui2.RatingCompat;
                fetchfocusrectui2.RatingCompat = true;
                fetchfocusrectui2.onTouch(this, motionEvent);
            } else if (fetchfocusrectui != null) {
                if (fetchfocusrectui.RatingCompat) {
                    fetchfocusrectui.write();
                }
                fetchfocusrectui.RatingCompat = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.serializer = true;
                setHideOnContentScrollEnabled.RemoteActionCompatParcelizer(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.write;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.write = iPointToPosition;
                setHideOnContentScrollEnabled.RemoteActionCompatParcelizer(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                android.graphics.Rect rect = this.MediaSessionCompatResultReceiverWrapper;
                rect.set(left, top, right, bottom);
                rect.left -= this.RatingCompat;
                rect.top -= this.MediaSessionCompatQueueItem;
                rect.right += this.MediaDescriptionCompat;
                rect.bottom += this.MediaBrowserCompatMediaItem;
                if (Build.VERSION.SDK_INT >= 33) {
                    zSerializer = setActionBarVisibilityCallback.serializer(this);
                } else {
                    Field field = setWindowCallback.RemoteActionCompatParcelizer;
                    if (field != null) {
                        try {
                            zSerializer = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zSerializer = false;
                        }
                    } else {
                        zSerializer = false;
                    }
                }
                if (childAt3.isEnabled() != zSerializer) {
                    boolean z5 = !zSerializer;
                    if (Build.VERSION.SDK_INT >= 33) {
                        setActionBarVisibilityCallback.IconCompatParcelizer(this, z5);
                    } else {
                        Field field2 = setWindowCallback.RemoteActionCompatParcelizer;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                setLogo setlogo = this.ParcelableVolumeInfo;
                if (setlogo != null) {
                    setlogo.IconCompatParcelizer = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            this.serializer = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.write - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.serializer = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.write - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        fetchfocusrectui = this.MediaMetadataCompat;
        if (z) {
            if (fetchfocusrectui == null) {
                this.MediaMetadataCompat = new fetchFocusRectui(this);
            }
            fetchFocusRectui fetchfocusrectui3 = this.MediaMetadataCompat;
            boolean z6 = fetchfocusrectui3.RatingCompat;
            fetchfocusrectui3.RatingCompat = true;
            fetchfocusrectui3.onTouch(this, motionEvent);
        } else if (fetchfocusrectui != null) {
            if (fetchfocusrectui.RatingCompat) {
                fetchfocusrectui.write();
            }
            fetchfocusrectui.RatingCompat = false;
        }
        return z;
    }

    public final int serializer(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.IconCompatParcelizer != null) {
            return;
        }
        super.drawableStateChanged();
        setLogo setlogo = this.ParcelableVolumeInfo;
        if (setlogo != null) {
            setlogo.IconCompatParcelizer = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.serializer && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        setLogo setlogo = null;
        if (drawable != null) {
            setLogo setlogo2 = new setLogo();
            Drawable drawable2 = setlogo2.write;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            setlogo2.write = drawable;
            drawable.setCallback(setlogo2);
            setlogo2.IconCompatParcelizer = true;
            setlogo = setlogo2;
        }
        this.ParcelableVolumeInfo = setlogo;
        super.setSelector(setlogo);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.RatingCompat = rect.left;
        this.MediaSessionCompatQueueItem = rect.top;
        this.MediaDescriptionCompat = rect.right;
        this.MediaBrowserCompatMediaItem = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.write = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        zza zzaVar = this.IconCompatParcelizer;
        if (zzaVar != null) {
            setHasNonEmbeddedTabs sethasnonembeddedtabs = (setHasNonEmbeddedTabs) zzaVar.write;
            sethasnonembeddedtabs.IconCompatParcelizer = null;
            sethasnonembeddedtabs.removeCallbacks(zzaVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 3;
        if (actionMasked == 10 && this.IconCompatParcelizer == null) {
            zza zzaVar = new zza(i, this);
            this.IconCompatParcelizer = zzaVar;
            post(zzaVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !setMenu.serializer) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        setMenu.IconCompatParcelizer.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        setMenu.RemoteActionCompatParcelizer.invoke(this, Integer.valueOf(iPointToPosition));
                        setMenu.read.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.serializer && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }
}
