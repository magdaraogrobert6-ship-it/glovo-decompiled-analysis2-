package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.customview.view.AbsSavedState;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.agconnect.config.impl.m;
import com.logistics.rider.glovo.R;
import io.sentry.SentryUUID;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.FocusPropertiesexit1;
import o.FocusRequesterModifierKt;
import o.FocusRestorerNode;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.ScaleFactorKt;
import o.SubcomposeLayoutKtSubcomposeLayout2;
import o.SubcomposeSlotReusePolicy;
import o.VerticalRulerCompanion;
import o.accessgetCancelcp;
import o.accessgetParentWidth;
import o.cancelFocusChange;
import o.getActiveFocusTargetNode;
import o.getDeactivateOutOfFrameNjRlDlw;
import o.handleMotionFrameOfReferencePlacement;
import o.isActive;
import o.place;
import o.place70tqf50;
import o.placeAutoMirroredaW9wMui;
import o.placeRelative70tqf50default;
import o.placeRelativeWithLayeraW9wMdefault;
import o.placeRelativeWithLayerdefault;
import o.placeRelativedefault;
import o.placeWithLayerdefault;
import o.placedefault;
import o.processDragGesture;
import o.setMeasuredSizeozmzZPI;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements cancelFocusChange {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public boolean ComponentActivity;
    public int IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final ColorStateList MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final ArrayList MediaSessionCompatResultReceiverWrapper;
    public final long MediaSessionCompatToken;
    public ValueAnimator ParcelableVolumeInfo;
    public final ValueAnimator.AnimatorUpdateListener PlaybackStateCompat;
    public final TimeInterpolator PlaybackStateCompatCustomAction;
    public FocusRequesterModifierKt RatingCompat;
    public boolean ResultReceiver;
    public WeakReference r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public Drawable r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public int[] r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public Behavior read;
    public final float serializer;
    public int write;

    public static class BaseBehavior<T extends AppBarLayout> extends place {
        public boolean IconCompatParcelizer;
        public SavedState MediaSessionCompatQueueItem;
        public WeakReference RemoteActionCompatParcelizer;
        public int read;
        public ValueAnimator serializer;
        public int write;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.RatingCompat = -1;
            this.PlaybackStateCompat = -1;
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new placeRelative70tqf50default();
            public boolean MediaDescriptionCompat;
            public boolean RatingCompat;
            public int RemoteActionCompatParcelizer;
            public boolean read;
            public float write;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.RatingCompat = parcel.readByte() != 0;
                this.MediaDescriptionCompat = parcel.readByte() != 0;
                this.RemoteActionCompatParcelizer = parcel.readInt();
                this.write = parcel.readFloat();
                this.read = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.RatingCompat ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.RemoteActionCompatParcelizer);
                parcel.writeFloat(this.write);
                parcel.writeByte(this.read ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
        public final void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View childAt;
            FocusPropertiesNode.read(FocusRestorerNode.ParcelableVolumeInfo.read(), coordinatorLayout);
            boolean z = false;
            FocusPropertiesNode.serializer(0, coordinatorLayout);
            FocusPropertiesNode.read(FocusRestorerNode.MediaSessionCompatQueueItem.read(), coordinatorLayout);
            FocusPropertiesNode.serializer(0, coordinatorLayout);
            if (appBarLayout.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).MediaDescriptionCompat instanceof ScrollingViewBehavior) {
                    break;
                } else {
                    i++;
                }
            }
            View view = childAt;
            if (view == null) {
                return;
            }
            int childCount2 = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                if (((placeAutoMirroredaW9wMui) appBarLayout.getChildAt(i2).getLayoutParams()).RemoteActionCompatParcelizer != 0) {
                    if (FocusPropertiesNode.serializer(coordinatorLayout) == null) {
                        FocusPropertiesNode.write(coordinatorLayout, new placeRelativeWithLayeraW9wMdefault(this));
                    }
                    boolean z2 = true;
                    if (RemoteActionCompatParcelizer() != (-appBarLayout.getTotalScrollRange())) {
                        FocusPropertiesNode.read(coordinatorLayout, FocusRestorerNode.ParcelableVolumeInfo, new placeRelativeWithLayerdefault(appBarLayout, false));
                        z = true;
                    }
                    if (RemoteActionCompatParcelizer() == 0) {
                        z2 = z;
                    } else if (view.canScrollVertically(-1)) {
                        int i3 = -appBarLayout.getDownNestedPreScrollRange();
                        if (i3 != 0) {
                            FocusPropertiesNode.read(coordinatorLayout, FocusRestorerNode.MediaSessionCompatQueueItem, new placeWithLayerdefault(this, coordinatorLayout, appBarLayout, view, i3));
                        } else {
                            z2 = z;
                        }
                    } else {
                        FocusPropertiesNode.read(coordinatorLayout, FocusRestorerNode.MediaSessionCompatQueueItem, new placeRelativeWithLayerdefault(appBarLayout, true));
                    }
                    this.IconCompatParcelizer = z2;
                    return;
                }
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.MediaSessionCompatQueueItem;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            serializer(coordinatorLayout, appBarLayout, i2);
                        } else {
                            RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            serializer(coordinatorLayout, appBarLayout, 0);
                        } else {
                            RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.RatingCompat) {
                RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.MediaDescriptionCompat) {
                RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.RemoteActionCompatParcelizer);
                int i3 = -childAt.getBottom();
                if (this.MediaSessionCompatQueueItem.read) {
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.MediaSessionCompatQueueItem.write) + i3;
                }
                RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
            this.MediaSessionCompatQueueItem = null;
            int iRemoteActionCompatParcelizer = getActiveFocusTargetNode.RemoteActionCompatParcelizer(serializer(), -appBarLayout.getTotalScrollRange(), 0);
            isActive isactive = this.MediaSessionCompatResultReceiverWrapper;
            if (isactive == null) {
                this.MediaSessionCompatToken = iRemoteActionCompatParcelizer;
            } else if (isactive.read != iRemoteActionCompatParcelizer) {
                isactive.read = iRemoteActionCompatParcelizer;
                isactive.serializer();
            }
            RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout, serializer(), 0, true);
            appBarLayout.IconCompatParcelizer = serializer();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                appBarLayout.postInvalidateOnAnimation();
            }
            IconCompatParcelizer(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.write(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.MediaSessionCompatQueueItem = (SavedState) parcelable;
            } else {
                this.MediaSessionCompatQueueItem = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedState = read(absSavedState, (AppBarLayout) view);
            return savedState == null ? absSavedState : savedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.write == 0 || i == 1) {
                read(coordinatorLayout, appBarLayout);
                if (appBarLayout.MediaSessionCompatQueueItem) {
                    appBarLayout.RemoteActionCompatParcelizer(appBarLayout.serializer(view2));
                }
            }
            this.RemoteActionCompatParcelizer = new WeakReference(view2);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x005a  */
        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX WARN: Instruction removed from duplicated block: B:26:0x005c, please report this as an issue */
        public static void RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zSerializer;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((placeAutoMirroredaW9wMui) childAt.getLayoutParams()).RemoteActionCompatParcelizer;
                if ((i4 & 1) != 0) {
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    int minimumHeight = childAt.getMinimumHeight();
                    if (i2 <= 0 || (i4 & 12) == 0) {
                        if ((i4 & 2) != 0) {
                            zSerializer = (-i) >= (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset();
                        }
                    } else {
                        if ((-i) >= (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        }
                    }
                }
            }
            if (appBarLayout.MediaSessionCompatQueueItem) {
                zSerializer = appBarLayout.serializer(IconCompatParcelizer(coordinatorLayout));
            }
            boolean zRemoteActionCompatParcelizer = appBarLayout.RemoteActionCompatParcelizer(zSerializer);
            if (!z) {
                if (zRemoteActionCompatParcelizer) {
                    List list = (List) ((processDragGesture) coordinatorLayout.RatingCompat.IconCompatParcelizer).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) ((View) arrayList.get(i5)).getLayoutParams()).MediaDescriptionCompat;
                        if (behavior instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) behavior).read == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // o.place
        public final int RemoteActionCompatParcelizer() {
            return serializer() + this.read;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout, RemoteActionCompatParcelizer() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                IconCompatParcelizer(coordinatorLayout, appBarLayout);
            }
        }

        public final SavedState read(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iSerializer = serializer();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iSerializer;
                if (childAt.getTop() + iSerializer <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.serializer;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = iSerializer == 0;
                    savedState.MediaDescriptionCompat = z;
                    savedState.RatingCompat = !z && (-iSerializer) >= appBarLayout.getTotalScrollRange();
                    savedState.RemoteActionCompatParcelizer = i;
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    savedState.read = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.write = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void read(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                placeAutoMirroredaW9wMui placeautomirroredaw9wmui = (placeAutoMirroredaW9wMui) childAt.getLayoutParams();
                if ((placeautomirroredaw9wmui.RemoteActionCompatParcelizer & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) placeautomirroredaw9wmui).topMargin;
                    bottom += ((LinearLayout.LayoutParams) placeautomirroredaw9wmui).bottomMargin;
                }
                int i2 = -iRemoteActionCompatParcelizer;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                placeAutoMirroredaW9wMui placeautomirroredaw9wmui2 = (placeAutoMirroredaW9wMui) childAt2.getLayoutParams();
                int i3 = placeautomirroredaw9wmui2.RemoteActionCompatParcelizer;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap weakHashMap3 = FocusPropertiesNode.RatingCompat;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iRemoteActionCompatParcelizer < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) placeautomirroredaw9wmui2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) placeautomirroredaw9wmui2).bottomMargin;
                    }
                    if (iRemoteActionCompatParcelizer < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    serializer(coordinatorLayout, appBarLayout, getActiveFocusTargetNode.RemoteActionCompatParcelizer(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public final void serializer(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int downNestedPreScrollRange;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    iArr[1] = RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout, RemoteActionCompatParcelizer() - i, i3, i4);
                }
            }
            if (appBarLayout.MediaSessionCompatQueueItem) {
                appBarLayout.RemoteActionCompatParcelizer(appBarLayout.serializer(view));
            }
        }

        public final void serializer(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(RemoteActionCompatParcelizer() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            ValueAnimator valueAnimator = this.serializer;
            if (iRemoteActionCompatParcelizer == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.serializer.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.serializer = valueAnimator2;
                valueAnimator2.setInterpolator(handleMotionFrameOfReferencePlacement.read);
                this.serializer.addUpdateListener(new placedefault(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.serializer.setDuration(Math.min(iRound, 600));
            this.serializer.setIntValues(iRemoteActionCompatParcelizer, i);
            this.serializer.start();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i & 2) == 0) {
                z = false;
            } else {
                if (!appBarLayout.MediaSessionCompatQueueItem) {
                    if (appBarLayout.getTotalScrollRange() != 0) {
                        if (coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()) {
                        }
                    }
                    z = false;
                }
                z = true;
            }
            if (z && (valueAnimator = this.serializer) != null) {
                valueAnimator.cancel();
            }
            this.RemoteActionCompatParcelizer = null;
            this.write = i2;
            return z;
        }

        public static View IconCompatParcelizer(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof FocusPropertiesexit1) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:69:0x015c  */
        /* JADX WARN: Code duplicated, block: B:71:0x016c  */
        /* JADX WARN: Code duplicated, block: B:75:0x017e  */
        /* JADX WARN: Code duplicated, block: B:77:0x0185  */
        /* JADX WARN: Code duplicated, block: B:93:0x016f A[SYNTHETIC] */
        @Override // o.place
        public final int RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            boolean z;
            List list;
            int i4;
            View view2;
            CoordinatorLayout.Behavior behavior;
            int i5;
            m mVar;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            int i6 = 0;
            if (i2 != 0 && iRemoteActionCompatParcelizer >= i2 && iRemoteActionCompatParcelizer <= i3) {
                int iRemoteActionCompatParcelizer2 = getActiveFocusTargetNode.RemoteActionCompatParcelizer(i, i2, i3);
                if (iRemoteActionCompatParcelizer != iRemoteActionCompatParcelizer2) {
                    if (!appBarLayout.MediaBrowserCompatMediaItem) {
                        top = iRemoteActionCompatParcelizer2;
                        break;
                    }
                    int iAbs = Math.abs(iRemoteActionCompatParcelizer2);
                    int childCount = appBarLayout.getChildCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 < childCount) {
                            View childAt = appBarLayout.getChildAt(i7);
                            placeAutoMirroredaW9wMui placeautomirroredaw9wmui = (placeAutoMirroredaW9wMui) childAt.getLayoutParams();
                            Interpolator interpolator = placeautomirroredaw9wmui.read;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = placeautomirroredaw9wmui.RemoteActionCompatParcelizer;
                                if ((i8 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) placeautomirroredaw9wmui).topMargin + ((LinearLayout.LayoutParams) placeautomirroredaw9wmui).bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iRemoteActionCompatParcelizer2);
                                    break;
                                }
                            }
                        }
                        top = iRemoteActionCompatParcelizer2;
                        break;
                    }
                    isActive isactive = this.MediaSessionCompatResultReceiverWrapper;
                    if (isactive != null) {
                        if (isactive.read != top) {
                            isactive.read = top;
                            isactive.serializer();
                            z = true;
                        }
                        this.read = iRemoteActionCompatParcelizer2 - top;
                        if (z) {
                            for (i5 = 0; i5 < appBarLayout.getChildCount(); i5++) {
                                placeAutoMirroredaW9wMui placeautomirroredaw9wmui2 = (placeAutoMirroredaW9wMui) appBarLayout.getChildAt(i5).getLayoutParams();
                                mVar = placeautomirroredaw9wmui2.write;
                                if (mVar == null && (placeautomirroredaw9wmui2.RemoteActionCompatParcelizer & 1) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i5);
                                    float fSerializer = serializer();
                                    Rect rect = (Rect) mVar.read;
                                    Rect rect2 = (Rect) mVar.RemoteActionCompatParcelizer;
                                    childAt2.getDrawingRect(rect2);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                    rect2.offset(0, -appBarLayout.getTopInset());
                                    float fAbs = rect2.top - Math.abs(fSerializer);
                                    if (fAbs <= 0.0f) {
                                        float fAbs2 = Math.abs(fAbs / rect2.height());
                                        float f2 = 1.0f - (fAbs2 >= 0.0f ? fAbs2 > 1.0f ? 1.0f : fAbs2 : 0.0f);
                                        float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (f2 * f2)));
                                        childAt2.setTranslationY(fHeight);
                                        childAt2.getDrawingRect(rect);
                                        rect.offset(0, (int) (-fHeight));
                                        WeakHashMap weakHashMap3 = FocusPropertiesNode.RatingCompat;
                                        childAt2.setClipBounds(rect);
                                    } else {
                                        WeakHashMap weakHashMap4 = FocusPropertiesNode.RatingCompat;
                                        childAt2.setClipBounds(null);
                                        childAt2.setTranslationY(0.0f);
                                    }
                                }
                            }
                        }
                        if (!z && appBarLayout.MediaBrowserCompatMediaItem && (list = (List) ((processDragGesture) coordinatorLayout.RatingCompat.IconCompatParcelizer).get(appBarLayout)) != null && !list.isEmpty()) {
                            for (i4 = 0; i4 < list.size(); i4++) {
                                view2 = (View) list.get(i4);
                                behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).MediaDescriptionCompat;
                                if (behavior != null) {
                                    behavior.onDependentViewChanged(coordinatorLayout, view2, appBarLayout);
                                }
                            }
                        }
                        appBarLayout.IconCompatParcelizer = serializer();
                        if (!appBarLayout.willNotDraw()) {
                            WeakHashMap weakHashMap5 = FocusPropertiesNode.RatingCompat;
                            appBarLayout.postInvalidateOnAnimation();
                        }
                        RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout, iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer2 < iRemoteActionCompatParcelizer ? -1 : 1, false);
                        i6 = iRemoteActionCompatParcelizer - iRemoteActionCompatParcelizer2;
                    } else {
                        this.MediaSessionCompatToken = top;
                    }
                    z = false;
                    this.read = iRemoteActionCompatParcelizer2 - top;
                    if (z) {
                        while (i5 < appBarLayout.getChildCount()) {
                            placeAutoMirroredaW9wMui placeautomirroredaw9wmui3 = (placeAutoMirroredaW9wMui) appBarLayout.getChildAt(i5).getLayoutParams();
                            mVar = placeautomirroredaw9wmui3.write;
                            if (mVar == null) {
                            }
                        }
                    }
                    if (!z) {
                        while (i4 < list.size()) {
                            view2 = (View) list.get(i4);
                            behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).MediaDescriptionCompat;
                            if (behavior != null) {
                                behavior.onDependentViewChanged(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.IconCompatParcelizer = serializer();
                    if (!appBarLayout.willNotDraw()) {
                        WeakHashMap weakHashMap6 = FocusPropertiesNode.RatingCompat;
                        appBarLayout.postInvalidateOnAnimation();
                    }
                    RemoteActionCompatParcelizer(coordinatorLayout, appBarLayout, iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer2 < iRemoteActionCompatParcelizer ? -1 : 1, false);
                    i6 = iRemoteActionCompatParcelizer - iRemoteActionCompatParcelizer2;
                }
            } else {
                this.read = 0;
            }
            IconCompatParcelizer(coordinatorLayout, appBarLayout);
            return i6;
        }

        public BaseBehavior() {
            this.RatingCompat = -1;
            this.PlaybackStateCompat = -1;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            serializer(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof placeAutoMirroredaW9wMui;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public int getPendingAction() {
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    }

    public Drawable getStatusBarForeground() {
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void setLiftOnScroll(boolean z) {
        this.MediaSessionCompatQueueItem = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
        if (view != null) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.ComponentActivity = z;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        place70tqf50.serializer(this, f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final placeAutoMirroredaW9wMui generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        placeAutoMirroredaW9wMui placeautomirroredaw9wmui = new placeAutoMirroredaW9wMui(context, attributeSet);
        placeautomirroredaw9wmui.RemoteActionCompatParcelizer = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.AppBarLayout_Layout);
        placeautomirroredaw9wmui.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(1, 0);
        placeautomirroredaw9wmui.write = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new m(2);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            placeautomirroredaw9wmui.read = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return placeautomirroredaw9wmui;
    }

    @Override // o.cancelFocusChange
    public CoordinatorLayout.Behavior getBehavior() {
        Behavior behavior = new Behavior();
        this.read = behavior;
        return behavior;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
        WeakReference weakReference = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.ScrollingViewBehavior_Layout);
            this.read = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).MediaDescriptionCompat;
            if (behavior instanceof BaseBehavior) {
                int bottom = view2.getBottom();
                int top = view.getTop();
                int i = ((BaseBehavior) behavior).read;
                int i2 = this.serializer;
                int iWrite = write(view2);
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                view.offsetTopAndBottom((((bottom - top) + i) + i2) - iWrite);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.MediaSessionCompatQueueItem) {
                return false;
            }
            appBarLayout.RemoteActionCompatParcelizer(appBarLayout.serializer(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                FocusPropertiesNode.write(FocusRestorerNode.ParcelableVolumeInfo.read(), coordinatorLayout);
                FocusPropertiesNode.read(FocusRestorerNode.MediaSessionCompatQueueItem.read(), coordinatorLayout);
                FocusPropertiesNode.serializer(0, coordinatorLayout);
                FocusPropertiesNode.write(coordinatorLayout, (AccessibilityDelegateCompat) null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutWrite = write(coordinatorLayout.read(view));
            if (appBarLayoutWrite != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.write;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutWrite.setExpanded(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public static AppBarLayout write(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior() {
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.IconCompatParcelizer);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof SubcomposeSlotReusePolicy) {
            SubcomposeLayoutKtSubcomposeLayout2.serializer(this, (SubcomposeSlotReusePolicy) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        boolean z2 = false;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                int childCount = getChildCount();
                while (true) {
                    childCount--;
                    if (childCount < 0) {
                        break;
                    } else {
                        getChildAt(childCount).offsetTopAndBottom(topInset);
                    }
                }
            }
        }
        RemoteActionCompatParcelizer();
        this.MediaBrowserCompatMediaItem = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((placeAutoMirroredaW9wMui) getChildAt(i5).getLayoutParams()).read != null) {
                this.MediaBrowserCompatMediaItem = true;
                break;
            }
        }
        Drawable drawable = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.ComponentActivity) {
            return;
        }
        if (this.MediaSessionCompatQueueItem) {
            z2 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i6 = 0; i6 < childCount3; i6++) {
            int i7 = ((placeAutoMirroredaW9wMui) getChildAt(i6).getLayoutParams()).RemoteActionCompatParcelizer;
            if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                z2 = true;
                break;
            }
        }
        if (this.ResultReceiver != z2) {
            this.ResultReceiver = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        int measuredHeight2 = getMeasuredHeight();
                        measuredHeight = getActiveFocusTargetNode.RemoteActionCompatParcelizer(getTopInset() + measuredHeight2, 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        RemoteActionCompatParcelizer();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof SubcomposeSlotReusePolicy) {
            ((SubcomposeSlotReusePolicy) background).MediaBrowserCompatMediaItem(f);
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    private ColorStateList getBackgroundCSL() {
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) background).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return placeRelativedefault.write(background);
        }
        return null;
    }

    public final void RemoteActionCompatParcelizer(float f, float f2) {
        ValueAnimator valueAnimator = this.ParcelableVolumeInfo;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.ParcelableVolumeInfo = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.MediaSessionCompatToken);
        this.ParcelableVolumeInfo.setInterpolator(this.PlaybackStateCompatCustomAction);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.PlaybackStateCompat;
        if (animatorUpdateListener != null) {
            this.ParcelableVolumeInfo.addUpdateListener(animatorUpdateListener);
        }
        this.ParcelableVolumeInfo.start();
    }

    public final boolean RemoteActionCompatParcelizer(boolean z) {
        if (this.ComponentActivity || this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == z) {
            return false;
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z;
        refreshDrawableState();
        if (!this.MediaSessionCompatQueueItem || !(getBackground() instanceof SubcomposeSlotReusePolicy)) {
            return true;
        }
        if (this.MediaMetadataCompat != null) {
            RemoteActionCompatParcelizer(z ? 0.0f : 255.0f, z ? 255.0f : 0.0f);
            return true;
        }
        float f = this.serializer;
        RemoteActionCompatParcelizer(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        placeAutoMirroredaW9wMui placeautomirroredaw9wmui = new placeAutoMirroredaW9wMui(-1, -2);
        placeautomirroredaw9wmui.RemoteActionCompatParcelizer = 1;
        return placeautomirroredaw9wmui;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public final int getTopInset() {
        FocusRequesterModifierKt focusRequesterModifierKt = this.RatingCompat;
        if (focusRequesterModifierKt != null) {
            return focusRequesterModifierKt.RemoteActionCompatParcelizer();
        }
        return 0;
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(IntPair.write(getContext(), i));
    }

    public final void RemoteActionCompatParcelizer() {
        Behavior behavior = this.read;
        BaseBehavior.SavedState savedState = (behavior == null || this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == -1 || this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != 0) ? null : behavior.read(AbsSavedState.serializer, this);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = -1;
        this.write = -1;
        this.MediaDescriptionCompat = -1;
        if (savedState != null) {
            Behavior behavior2 = this.read;
            if (behavior2.MediaSessionCompatQueueItem != null) {
                return;
            }
            behavior2.MediaSessionCompatQueueItem = savedState;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new int[4];
        }
        int[] iArr = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.ResultReceiver;
        iArr[0] = z ? R.attr.state_liftable : -2130970086;
        iArr[1] = (z && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) ? R.attr.state_lifted : -2130970087;
        iArr[2] = z ? R.attr.state_collapsible : -2130970082;
        iArr[3] = (z && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) ? R.attr.state_collapsed : -2130970081;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = -1;
        this.write = -1;
        this.MediaDescriptionCompat = -1;
        int i = 0;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
        this.MediaSessionCompatResultReceiverWrapper = new ArrayList();
        Context context2 = getContext();
        int i2 = 1;
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArray = getDeactivateOutOfFrameNjRlDlw.read(context3, attributeSet, place70tqf50.serializer, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArray.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArray.getResourceId(0, 0)));
            }
            typedArray.recycle();
            TypedArray typedArray2 = getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, setMeasuredSizeozmzZPI.AppBarLayout, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArray2.getDrawable(0);
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            setBackground(drawable);
            ColorStateList colorStateListIconCompatParcelizer = ScaleFactorKt.IconCompatParcelizer(context2, typedArray2, 6);
            this.MediaMetadataCompat = colorStateListIconCompatParcelizer;
            ColorStateList backgroundCSL = getBackgroundCSL();
            if (backgroundCSL != null) {
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy();
                subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(backgroundCSL);
                if (colorStateListIconCompatParcelizer != null) {
                    subcomposeSlotReusePolicy.setAlpha(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY ? 255 : 0);
                    subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(colorStateListIconCompatParcelizer);
                    this.PlaybackStateCompat = new accessgetParentWidth(this, i2, subcomposeSlotReusePolicy);
                } else {
                    subcomposeSlotReusePolicy.write(context2);
                    this.PlaybackStateCompat = new accessgetParentWidth(this, i, subcomposeSlotReusePolicy);
                }
                setBackground(subcomposeSlotReusePolicy);
            }
            this.MediaSessionCompatToken = SentryUUID.write(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.PlaybackStateCompatCustomAction = SentryUUID.IconCompatParcelizer(context2, R.attr.motionEasingStandardInterpolator, handleMotionFrameOfReferencePlacement.write);
            if (typedArray2.hasValue(4)) {
                setExpanded(typedArray2.getBoolean(4, false), false, false);
            }
            if (typedArray2.hasValue(3)) {
                place70tqf50.serializer(this, typedArray2.getDimensionPixelSize(3, 0));
            }
            if (typedArray2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArray2.getBoolean(2, false));
            }
            if (typedArray2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArray2.getBoolean(1, false));
            }
            this.serializer = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.MediaSessionCompatQueueItem = typedArray2.getBoolean(5, false);
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typedArray2.getResourceId(7, -1);
            setStatusBarForeground(typedArray2.getDrawable(8));
            typedArray2.recycle();
            accessgetCancelcp.write(this, new PinnableContainerKtLocalPinnableContainer1(13, this));
        } catch (Throwable th) {
            typedArray.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.write;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                placeAutoMirroredaW9wMui placeautomirroredaw9wmui = (placeAutoMirroredaW9wMui) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = placeautomirroredaw9wmui.RemoteActionCompatParcelizer;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) placeautomirroredaw9wmui).topMargin + ((LinearLayout.LayoutParams) placeautomirroredaw9wmui).bottomMargin;
                    if ((i3 & 8) != 0) {
                        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = FocusPropertiesNode.RatingCompat;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = FocusPropertiesNode.RatingCompat;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.write = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.MediaDescriptionCompat;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                placeAutoMirroredaW9wMui placeautomirroredaw9wmui = (placeAutoMirroredaW9wMui) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = ((LinearLayout.LayoutParams) placeautomirroredaw9wmui).topMargin;
                int i4 = ((LinearLayout.LayoutParams) placeautomirroredaw9wmui).bottomMargin;
                int i5 = placeautomirroredaw9wmui.RemoteActionCompatParcelizer;
                if ((i5 & 1) == 0) {
                    break;
                }
                minimumHeight += i3 + i4 + measuredHeight;
                if ((i5 & 2) != 0) {
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.MediaDescriptionCompat = iMax;
        return iMax;
    }

    public final int getTotalScrollRange() {
        int i = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                placeAutoMirroredaW9wMui placeautomirroredaw9wmui = (placeAutoMirroredaW9wMui) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = placeautomirroredaw9wmui.RemoteActionCompatParcelizer;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) placeautomirroredaw9wmui).topMargin + ((LinearLayout.LayoutParams) placeautomirroredaw9wmui).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = iMax;
        return iMax;
    }

    public final boolean serializer(View view) {
        int i;
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null && (i = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            }
            if (viewFindViewById != null) {
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.setState(getDrawableState());
                }
                Drawable drawable3 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.setVisible(getVisibility() == 0, false);
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.setCallback(this);
            }
            if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        placeAutoMirroredaW9wMui placeautomirroredaw9wmui = new placeAutoMirroredaW9wMui(-1, -2);
        placeautomirroredaw9wmui.RemoteActionCompatParcelizer = 1;
        return placeautomirroredaw9wmui;
    }

    public final void setExpanded(boolean z, boolean z2, boolean z3) {
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        setExpanded(z, isLaidOut(), true);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return IconCompatParcelizer(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return IconCompatParcelizer(layoutParams);
    }

    public static placeAutoMirroredaW9wMui IconCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            placeAutoMirroredaW9wMui placeautomirroredaw9wmui = new placeAutoMirroredaW9wMui((LinearLayout.LayoutParams) layoutParams);
            placeautomirroredaw9wmui.RemoteActionCompatParcelizer = 1;
            return placeautomirroredaw9wmui;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            placeAutoMirroredaW9wMui placeautomirroredaw9wmui2 = new placeAutoMirroredaW9wMui((ViewGroup.MarginLayoutParams) layoutParams);
            placeautomirroredaw9wmui2.RemoteActionCompatParcelizer = 1;
            return placeautomirroredaw9wmui2;
        }
        placeAutoMirroredaW9wMui placeautomirroredaw9wmui3 = new placeAutoMirroredaW9wMui(layoutParams);
        placeautomirroredaw9wmui3.RemoteActionCompatParcelizer = 1;
        return placeautomirroredaw9wmui3;
    }
}
