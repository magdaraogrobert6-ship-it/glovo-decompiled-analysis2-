package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.graphics.Fields;
import androidx.core.provider.CallbackWrapper$2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.TransitionValuesMaps;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import o.FocusPropertiesNode;
import o.FocusRestorerKtsaveFocusedChild11;
import o.FocusRestorerNodeonExit1;
import o.floorslo4al4;
import o.getExponentimpl;
import o.getHasFocus;
import o.getIntrinsicSizeNHjbRc;
import o.getSignificandimpl;
import o.getSignslo4al4;
import o.isNaNimpl;
import o.isNormalizedimpl;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.roundslo4al4;
import o.toByteimpl;
import o.toIntimpl;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect ComponentActivity;
    public final roundslo4al4 IconCompatParcelizer;
    public final getSignificandimpl MediaBrowserCompatMediaItem;
    public final getExponentimpl MediaDescriptionCompat;
    public final LinearLayoutManagerImpl MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public final RecyclerViewImpl MediaSessionCompatToken;
    public Parcelable ParcelableVolumeInfo;
    public RecyclerView.ItemAnimator PlaybackStateCompat;
    public final toIntimpl PlaybackStateCompatCustomAction;
    public final roundslo4al4 RatingCompat;
    public final isNaNimpl RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public final Rect r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final ScrollEventAdapter r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean read;
    public final TransitionValuesMaps serializer;
    public int write;

    public final class LinearLayoutManagerImpl extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void RemoteActionCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.RemoteActionCompatParcelizer(getintrinsicsizenhjbrc, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean serializer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, int i, Bundle bundle) {
            ViewPager2.this.serializer.getClass();
            return super.serializer(recycler, getintrinsicsizenhjbrc, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void write(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
            int iRemoteActionCompatParcelizer;
            int iRemoteActionCompatParcelizer2;
            ViewPager2 viewPager2 = (ViewPager2) ViewPager2.this.serializer.RatingCompat;
            if (viewPager2.getOrientation() == 1) {
                viewPager2.MediaMetadataCompat.getClass();
                iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view);
            } else {
                iRemoteActionCompatParcelizer = 0;
            }
            if (viewPager2.getOrientation() == 0) {
                viewPager2.MediaMetadataCompat.getClass();
                iRemoteActionCompatParcelizer2 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view);
            } else {
                iRemoteActionCompatParcelizer2 = 0;
            }
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(FocusRestorerNodeonExit1.serializer(iRemoteActionCompatParcelizer, 1, iRemoteActionCompatParcelizer2, 1, false));
        }

        public LinearLayoutManagerImpl() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void read(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
            super.read(recycler, getintrinsicsizenhjbrc, focusRestorerKtsaveFocusedChild11);
            ViewPager2.this.serializer.getClass();
        }
    }

    public final class RecyclerViewImpl extends RecyclerView {
        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.serializer.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus && super.onTouchEvent(motionEvent);
        }

        public RecyclerViewImpl(Context context) {
            super(context, null);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.write);
            accessibilityEvent.setToIndex(viewPager2.write);
            accessibilityEvent.setSource((ViewPager2) viewPager2.serializer.RatingCompat);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }
    }

    public int getCurrentItem() {
        return this.write;
    }

    public int getOffscreenPageLimit() {
        return this.MediaSessionCompatQueueItem;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator() { // from class: androidx.viewpager2.widget.ViewPager2.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel, null);
                savedState.serializer = parcel.readInt();
                savedState.RemoteActionCompatParcelizer = parcel.readInt();
                savedState.write = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState(parcel, classLoader);
                savedState.serializer = parcel.readInt();
                savedState.RemoteActionCompatParcelizer = parcel.readInt();
                savedState.write = parcel.readParcelable(classLoader);
                return savedState;
            }
        };
        public int RemoteActionCompatParcelizer;
        public int serializer;
        public Parcelable write;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.serializer);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeParcelable(this.write, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.MediaSessionCompatToken.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.MediaSessionCompatToken.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.serializer.getClass();
        this.serializer.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.Adapter getAdapter() {
        return this.MediaSessionCompatToken.getAdapter();
    }

    public int getItemDecorationCount() {
        return this.MediaSessionCompatToken.getItemDecorationCount();
    }

    public int getOrientation() {
        return this.MediaMetadataCompat.ResultReceiver == 1 ? 1 : 0;
    }

    public int getScrollState() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaDescriptionCompat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RecyclerViewImpl recyclerViewImpl = this.MediaSessionCompatToken;
        int measuredWidth = recyclerViewImpl.getMeasuredWidth();
        int measuredHeight = recyclerViewImpl.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.ComponentActivity;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        recyclerViewImpl.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.read) {
            serializer();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.MediaSessionCompatToken, i, i2);
        int measuredWidth = this.MediaSessionCompatToken.getMeasuredWidth();
        int measuredHeight = this.MediaSessionCompatToken.getMeasuredHeight();
        int measuredState = this.MediaSessionCompatToken.getMeasuredState();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight + paddingLeft + measuredWidth, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        TransitionValuesMaps transitionValuesMaps = this.serializer;
        transitionValuesMaps.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        transitionValuesMaps.getClass();
        ViewPager2 viewPager2 = (ViewPager2) transitionValuesMaps.RatingCompat;
        if (i != 8192 && i != 4096) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return false;
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            viewPager2.setCurrentItemInternal(currentItem);
        }
        return true;
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerViewImpl recyclerViewImpl = this.MediaSessionCompatToken;
        RecyclerView.Adapter adapter2 = recyclerViewImpl.getAdapter();
        TransitionValuesMaps transitionValuesMaps = this.serializer;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver((isNaNimpl) transitionValuesMaps.MediaMetadataCompat);
        } else {
            transitionValuesMaps.getClass();
        }
        isNaNimpl isnanimpl = this.RemoteActionCompatParcelizer;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(isnanimpl);
        }
        recyclerViewImpl.setAdapter(adapter);
        this.write = 0;
        read();
        transitionValuesMaps.ParcelableVolumeInfo();
        if (adapter != null) {
            adapter.registerAdapterDataObserver((isNaNimpl) transitionValuesMaps.MediaMetadataCompat);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(isnanimpl);
        }
    }

    public void setCurrentItem(int i) {
        Object obj = this.MediaDescriptionCompat.read;
        setCurrentItemInternal(i);
    }

    public void setOrientation(int i) {
        this.MediaMetadataCompat.MediaSessionCompatQueueItem(i);
        this.serializer.ParcelableVolumeInfo();
    }

    public void setUserInputEnabled(boolean z) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = z;
        this.serializer.ParcelableVolumeInfo();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.serializer.RatingCompat;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) getHasFocus.write(itemCount, itemCount2, 0).IconCompatParcelizer);
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            return;
        }
        if (viewPager2.write > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.write < itemCount3 - 1) {
            accessibilityNodeInfo.addAction(Fields.TransformOrigin);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.serializer.ParcelableVolumeInfo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).serializer;
            sparseArray.put(this.MediaSessionCompatToken.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        read();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        RecyclerViewImpl recyclerViewImpl = this.MediaSessionCompatToken;
        if (orientation == 0) {
            height = recyclerViewImpl.getWidth() - recyclerViewImpl.getPaddingLeft();
            paddingBottom = recyclerViewImpl.getPaddingRight();
        } else {
            height = recyclerViewImpl.getHeight() - recyclerViewImpl.getPaddingTop();
            paddingBottom = recyclerViewImpl.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.MediaSessionCompatResultReceiverWrapper = savedState.RemoteActionCompatParcelizer;
        this.ParcelableVolumeInfo = savedState.write;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public final void serializer() {
        toIntimpl tointimpl = this.PlaybackStateCompatCustomAction;
        if (tointimpl == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Design assumption violated.");
            return;
        }
        LinearLayoutManagerImpl linearLayoutManagerImpl = this.MediaMetadataCompat;
        View viewSerializer = tointimpl.serializer(linearLayoutManagerImpl);
        if (viewSerializer == null) {
            return;
        }
        linearLayoutManagerImpl.getClass();
        int iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewSerializer);
        if (iRemoteActionCompatParcelizer != this.write && getScrollState() == 0) {
            this.RatingCompat.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
        }
        this.read = false;
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ComponentActivity = new Rect();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new Rect();
        roundslo4al4 roundslo4al4Var = new roundslo4al4();
        this.IconCompatParcelizer = roundslo4al4Var;
        int i = 0;
        this.read = false;
        this.RemoteActionCompatParcelizer = new isNaNimpl(i, this);
        this.MediaSessionCompatResultReceiverWrapper = -1;
        this.PlaybackStateCompat = null;
        this.ResultReceiver = false;
        int i2 = 1;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
        this.MediaSessionCompatQueueItem = -1;
        TransitionValuesMaps transitionValuesMaps = new TransitionValuesMaps(this);
        this.serializer = transitionValuesMaps;
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.MediaSessionCompatToken = recyclerViewImpl;
        recyclerViewImpl.setId(View.generateViewId());
        recyclerViewImpl.setDescendantFocusability(Fields.RenderEffect);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl();
        this.MediaMetadataCompat = linearLayoutManagerImpl;
        recyclerViewImpl.setLayoutManager(linearLayoutManagerImpl);
        recyclerViewImpl.setScrollingTouchSlop(1);
        int[] iArr = getSignslo4al4.ViewPager2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        FocusPropertiesNode.IconCompatParcelizer(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            recyclerViewImpl.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            isNormalizedimpl isnormalizedimpl = new isNormalizedimpl();
            if (recyclerViewImpl.addMenuProvider == null) {
                recyclerViewImpl.addMenuProvider = new ArrayList();
            }
            recyclerViewImpl.addMenuProvider.add(isnormalizedimpl);
            ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = scrollEventAdapter;
            this.MediaDescriptionCompat = new getExponentimpl(i, scrollEventAdapter);
            toIntimpl tointimpl = new toIntimpl(this);
            this.PlaybackStateCompatCustomAction = tointimpl;
            tointimpl.attachToRecyclerView(recyclerViewImpl);
            recyclerViewImpl.addOnScrollListener(scrollEventAdapter);
            roundslo4al4 roundslo4al4Var2 = new roundslo4al4();
            this.RatingCompat = roundslo4al4Var2;
            scrollEventAdapter.IconCompatParcelizer = roundslo4al4Var2;
            roundslo4al4 roundslo4al4Var3 = new roundslo4al4(this, i);
            roundslo4al4 roundslo4al4Var4 = new roundslo4al4(this, i2);
            ((ArrayList) roundslo4al4Var2.write).add(roundslo4al4Var3);
            ((ArrayList) roundslo4al4Var2.write).add(roundslo4al4Var4);
            recyclerViewImpl.setImportantForAccessibility(2);
            transitionValuesMaps.MediaMetadataCompat = new isNaNimpl(i2, transitionValuesMaps);
            ViewPager2 viewPager2 = (ViewPager2) transitionValuesMaps.RatingCompat;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) roundslo4al4Var2.write).add(roundslo4al4Var);
            getSignificandimpl getsignificandimpl = new getSignificandimpl();
            this.MediaBrowserCompatMediaItem = getsignificandimpl;
            ((ArrayList) roundslo4al4Var2.write).add(getsignificandimpl);
            attachViewToParent(recyclerViewImpl, 0, recyclerViewImpl.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        RecyclerViewImpl recyclerViewImpl = this.MediaSessionCompatToken;
        savedState.serializer = recyclerViewImpl.getId();
        int i = this.MediaSessionCompatResultReceiverWrapper;
        if (i == -1) {
            i = this.write;
        }
        savedState.RemoteActionCompatParcelizer = i;
        Parcelable parcelable = this.ParcelableVolumeInfo;
        if (parcelable != null) {
            savedState.write = parcelable;
            return savedState;
        }
        recyclerViewImpl.getAdapter();
        return savedState;
    }

    public final void read() {
        RecyclerView.Adapter adapter;
        if (this.MediaSessionCompatResultReceiverWrapper == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.ParcelableVolumeInfo != null) {
            this.ParcelableVolumeInfo = null;
        }
        int iMax = Math.max(0, Math.min(this.MediaSessionCompatResultReceiverWrapper, adapter.getItemCount() - 1));
        this.write = iMax;
        this.MediaSessionCompatResultReceiverWrapper = -1;
        this.MediaSessionCompatToken.scrollToPosition(iMax);
        this.serializer.ParcelableVolumeInfo();
    }

    public final void setCurrentItemInternal(int i) {
        roundslo4al4 roundslo4al4Var;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.MediaSessionCompatResultReceiverWrapper != -1) {
                this.MediaSessionCompatResultReceiverWrapper = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        int i2 = this.write;
        ScrollEventAdapter scrollEventAdapter = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if ((iMin == i2 && scrollEventAdapter.MediaDescriptionCompat == 0) || iMin == i2) {
            return;
        }
        double d = i2;
        this.write = iMin;
        this.serializer.ParcelableVolumeInfo();
        if (scrollEventAdapter.MediaDescriptionCompat != 0) {
            scrollEventAdapter.RemoteActionCompatParcelizer();
            floorslo4al4 floorslo4al4Var = scrollEventAdapter.MediaBrowserCompatMediaItem;
            d = ((double) floorslo4al4Var.IconCompatParcelizer) + ((double) floorslo4al4Var.read);
        }
        scrollEventAdapter.getClass();
        scrollEventAdapter.read = 2;
        boolean z = scrollEventAdapter.MediaSessionCompatResultReceiverWrapper != iMin;
        scrollEventAdapter.MediaSessionCompatResultReceiverWrapper = iMin;
        scrollEventAdapter.RemoteActionCompatParcelizer(2);
        if (z && (roundslo4al4Var = scrollEventAdapter.IconCompatParcelizer) != null) {
            roundslo4al4Var.RemoteActionCompatParcelizer(iMin);
        }
        double d2 = iMin;
        double dAbs = Math.abs(d2 - d);
        RecyclerViewImpl recyclerViewImpl = this.MediaSessionCompatToken;
        if (dAbs <= 3.0d) {
            recyclerViewImpl.smoothScrollToPosition(iMin);
        } else {
            recyclerViewImpl.scrollToPosition(d2 > d ? iMin - 3 : iMin + 3);
            recyclerViewImpl.post(new CallbackWrapper$2(iMin, recyclerViewImpl));
        }
    }

    public void setPageTransformer(toByteimpl tobyteimpl) {
        boolean z = this.ResultReceiver;
        if (tobyteimpl != null) {
            if (!z) {
                this.PlaybackStateCompat = this.MediaSessionCompatToken.getItemAnimator();
                this.ResultReceiver = true;
            }
            this.MediaSessionCompatToken.setItemAnimator(null);
        } else if (z) {
            this.MediaSessionCompatToken.setItemAnimator(this.PlaybackStateCompat);
            this.PlaybackStateCompat = null;
            this.ResultReceiver = false;
        }
        this.MediaBrowserCompatMediaItem.getClass();
        if (tobyteimpl == null) {
            return;
        }
        this.MediaBrowserCompatMediaItem.getClass();
        this.MediaBrowserCompatMediaItem.getClass();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.MediaSessionCompatQueueItem = i;
            this.MediaSessionCompatToken.requestLayout();
        }
    }
}
