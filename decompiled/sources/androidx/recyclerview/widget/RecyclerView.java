package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ScrollingView;
import androidx.customview.view.AbsSavedState;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.util.serializer;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlinx.coroutines.BuildersKt;
import o.BlendModeColorFilter;
import o.BlendModeColorFilterHelper;
import o.BlendModeColorFilterHelperExternalSyntheticApiModelOutline0;
import o.BlendModeColorFilterHelperExternalSyntheticApiModelOutline1;
import o.BlendModeColorFilterxETnrds;
import o.BlockGraphicsLayerElement;
import o.BlockGraphicsLayerModifier;
import o.BlockGraphicsLayerModifiermeasure1;
import o.BlurEffect;
import o.Brush;
import o.ContextMenuSpec;
import o.DrawableTransformation;
import o.EmptyContentCardsAdapterNetworkUnavailableViewHolder;
import o.FocusPropertiesNode;
import o.FocusPropertiesexit1;
import o.FocusPropertiesonExit1;
import o.FocusRestorerKtsaveFocusedChild11;
import o.FocusRestorerNodeonExit1;
import o.InfiniteAnimationPolicyDefaultImpls;
import o.InterfaceC0185m;
import o.accessgetLightencp;
import o.accessgetModulatecp;
import o.accessgetOverlaycp;
import o.accessgetSoftlightcp;
import o.applyToPq9zytI;
import o.createBlendModeColorFilter;
import o.freeFocus;
import o.getBeyondBoundsLayoutParent;
import o.getEnterannotations;
import o.getExit;
import o.getHasFocus;
import o.getIntrinsicSizeNHjbRc;
import o.getLayerBlock;
import o.getOffVariationName;
import o.getSoftlight0nO6VwU;
import o.getSrcAtop0nO6VwU;
import o.getSrcIn0nO6VwU;
import o.getSrcOut0nO6VwU;
import o.getSrcOver0nO6VwU;
import o.getXor0nO6VwU;
import o.horizontalGradient8A3gB4default;
import o.invalidateLayerBlock;
import o.is1dFocusSearch3ESFkO8;
import o.isActive;
import o.isAppSetIdReadingEnabled;
import o.isImportantForBounds;
import o.linearGradientmHitzGk;
import o.processDragGesture;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.radialGradientP_VxKsdefault;
import o.releaseFocus;
import o.resizeGraphicFrameIfAppropriatelambda0;
import o.seekAnimationsanimation_core;
import o.setLayerBlock;
import o.sweepGradientUv8p0NAdefault;
import o.verticalGradient8A3gB4;
import o.verticalGradient8A3gB4default;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, FocusPropertiesexit1 {
    public static final getSrcOut0nO6VwU MediaBrowserCompatMediaItem;
    public static boolean MediaDescriptionCompat = false;
    public static final horizontalGradient8A3gB4default MediaMetadataCompat;
    public static boolean MediaSessionCompatQueueItem = false;
    public static final Class[] read;
    public boolean ComponentActivity;
    public Adapter MediaSessionCompatResultReceiverWrapper;
    public EdgeEffect MediaSessionCompatToken;
    public final accessgetModulatecp ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public final AccessibilityManager PlaybackStateCompatCustomAction;
    public verticalGradient8A3gB4default RatingCompat;
    public boolean ResultReceiver;
    public ItemAnimator _init_lambda1;
    public BlendModeColorFilterHelperExternalSyntheticApiModelOutline1 _init_lambda2;
    public final getSrcAtop0nO6VwU _init_lambda3;
    public final AnonymousClass7 _init_lambda4;
    public boolean accessensureViewModelStore;
    public boolean addContentView;
    public ArrayList addMenuProvider;
    public boolean addObserverForBackInvoker;
    public final ArrayList addObserverForBackInvokerlambda0;
    public final invalidateLayerBlock addOnConfigurationChangedListener;
    public final int[] addOnContextAvailableListener;
    public final int addOnMultiWindowModeChangedListener;
    public final int[] addOnNewIntentListener;
    public final ArrayList addOnPictureInPictureModeChangedListener;
    public getLayerBlock addOnPictureInPictureUiStateChangedListener;
    public final ArrayList addOnTrimMemoryListener;
    public SavedState addOnUserLeaveHintListener;
    public int createFullyDrawnExecutor;
    public int defaultViewModelProviderFactory_delegatelambda0;
    public boolean ensureViewModelStore;
    public final float enterPictureInPictureMode;
    public int fullyDrawnReporter_delegatelambda0;
    public LayoutManager fullyDrawnReporter_delegatelambda00;
    public boolean getActivityResultRegistry;
    public final isActive getDefaultViewModelCreationExtras;
    public final ArrayList getDefaultViewModelProviderFactory;
    public boolean getFullyDrawnReporter;
    public final Recycler getLastCustomNonConfigurationInstance;
    public BlurEffect getLifecycle;
    public final int[] getNavigationEventDispatcher;
    public final float getOnBackPressedDispatcher;
    public int getOnBackPressedInput;
    public final float getSavedStateRegistry;
    public boolean getSavedStateRegistryControllerannotations;
    public EdgeEffect getViewModelStore;
    public final int[] initializeViewTreeOwners;
    public FocusPropertiesonExit1 invalidateMenu;
    public int menuHostHelperlambda0;
    public int onActivityResult;
    public ArrayList onBackPressed;
    public final boolean onBackPressedDispatcher_delegatelambda0;
    public boolean onBackPressedDispatcher_delegatelambda00;
    public final int onBackPressedDispatcher_delegatelambda010;
    public EdgeEffect onBackPressedInput_delegatelambda0;
    public int onConfigurationChanged;
    public EdgeEffect onCreate;
    public final getIntrinsicSizeNHjbRc onCreatePanelMenu;
    public final RectF onMenuItemSelected;
    public final Rect onMultiWindowModeChanged;
    public final Rect onNewIntent;
    public int onPanelClosed;
    public final getSrcAtop0nO6VwU onPictureInPictureModeChanged;
    public VelocityTracker onPictureInPictureUiStateChanged;
    public final ViewFlinger onPreparePanel;
    public final AnonymousClass7 onRequestPermissionsResult;
    public final verticalGradient8A3gB4 onRetainNonConfigurationInstance;
    public final getEnterannotations r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final ChildHelper r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public BlendModeColorFilterHelper r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public GapWorker r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public boolean r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public static final int[] RemoteActionCompatParcelizer = {R.attr.nestedScrollingEnabled};
    public static final float write = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean serializer = true;
    public static final boolean IconCompatParcelizer = true;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$7, reason: invalid class name */
    public final class AnonymousClass7 implements getExit {
        /* JADX WARN: Code duplicated, block: B:11:0x0028  */
        public void processAppeared(ViewHolder viewHolder, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls2) {
            viewHolder.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            accessgetSoftlightcp accessgetsoftlightcp = (accessgetSoftlightcp) recyclerView._init_lambda1;
            if (infiniteAnimationPolicyDefaultImpls != null) {
                accessgetsoftlightcp.getClass();
                int i = infiniteAnimationPolicyDefaultImpls.serializer;
                int i2 = infiniteAnimationPolicyDefaultImpls2.serializer;
                if (i == i2 && infiniteAnimationPolicyDefaultImpls.RemoteActionCompatParcelizer == infiniteAnimationPolicyDefaultImpls2.RemoteActionCompatParcelizer) {
                    accessgetsoftlightcp.write(viewHolder);
                    viewHolder.MediaSessionCompatQueueItem.setAlpha(0.0f);
                    accessgetsoftlightcp.MediaDescriptionCompat.add(viewHolder);
                } else if (!accessgetsoftlightcp.IconCompatParcelizer(viewHolder, i, infiniteAnimationPolicyDefaultImpls.RemoteActionCompatParcelizer, i2, infiniteAnimationPolicyDefaultImpls2.RemoteActionCompatParcelizer)) {
                    return;
                }
            } else {
                accessgetsoftlightcp.write(viewHolder);
                viewHolder.MediaSessionCompatQueueItem.setAlpha(0.0f);
                accessgetsoftlightcp.MediaDescriptionCompat.add(viewHolder);
            }
            recyclerView.postAnimationRunner();
        }

        public /* synthetic */ AnonymousClass7() {
        }

        public ViewHolder findViewHolder(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            int iWrite = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
            ViewHolder viewHolder = null;
            for (int i2 = 0; i2 < iWrite; i2++) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(i2));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == i) {
                    if (!((ArrayList) recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read).contains(childViewHolderInt.MediaSessionCompatQueueItem)) {
                        viewHolder = childViewHolderInt;
                        break;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
            if (viewHolder == null) {
                return null;
            }
            if (!((ArrayList) recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read).contains(viewHolder.MediaSessionCompatQueueItem)) {
                return viewHolder;
            }
            boolean z = RecyclerView.MediaSessionCompatQueueItem;
            return null;
        }

        public void markViewHoldersUpdated(int i, int i2, Object obj) {
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            int iWrite = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
            int i5 = i2 + i;
            for (int i6 = 0; i6 < iWrite; i6++) {
                View viewWrite = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(i6);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(viewWrite);
                if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) >= i && i4 < i5) {
                    childViewHolderInt.addFlags(2);
                    childViewHolderInt.addChangePayload(obj);
                    ((BlockGraphicsLayerElement) viewWrite.getLayoutParams()).IconCompatParcelizer = true;
                }
            }
            Recycler recycler = recyclerView.getLastCustomNonConfigurationInstance;
            ArrayList arrayList = recycler.write;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    recyclerView.ensureViewModelStore = true;
                    return;
                }
                ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
                if (viewHolder != null && (i3 = viewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) >= i && i3 < i5) {
                    viewHolder.addFlags(2);
                    recycler.write(size);
                }
            }
        }

        public void offsetPositionsForAdd(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            int iWrite = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
            for (int i3 = 0; i3 < iWrite; i3++) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(i3));
                if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus >= i) {
                    if (RecyclerView.MediaDescriptionCompat) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.offsetPosition(i2, false);
                    recyclerView.onCreatePanelMenu.PlaybackStateCompatCustomAction = true;
                }
            }
            ArrayList arrayList = recyclerView.getLastCustomNonConfigurationInstance.write;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ViewHolder viewHolder = (ViewHolder) arrayList.get(i4);
                if (viewHolder != null && viewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus >= i) {
                    if (RecyclerView.MediaDescriptionCompat) {
                        viewHolder.toString();
                    }
                    viewHolder.offsetPosition(i2, false);
                }
            }
            recyclerView.requestLayout();
            recyclerView.addObserverForBackInvoker = true;
        }

        public void offsetPositionsForMove(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            RecyclerView recyclerView = RecyclerView.this;
            int iWrite = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
            int i10 = -1;
            if (i < i2) {
                i4 = i;
                i3 = i2;
                i5 = -1;
            } else {
                i3 = i;
                i4 = i2;
                i5 = 1;
            }
            for (int i11 = 0; i11 < iWrite; i11++) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(i11));
                if (childViewHolderInt != null && (i9 = childViewHolderInt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) >= i4 && i9 <= i3) {
                    if (RecyclerView.MediaDescriptionCompat) {
                        childViewHolderInt.toString();
                    }
                    if (childViewHolderInt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == i) {
                        childViewHolderInt.offsetPosition(i2 - i, false);
                    } else {
                        childViewHolderInt.offsetPosition(i5, false);
                    }
                    recyclerView.onCreatePanelMenu.PlaybackStateCompatCustomAction = true;
                }
            }
            ArrayList arrayList = recyclerView.getLastCustomNonConfigurationInstance.write;
            if (i < i2) {
                i7 = i;
                i6 = i2;
            } else {
                i6 = i;
                i7 = i2;
                i10 = 1;
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ViewHolder viewHolder = (ViewHolder) arrayList.get(i12);
                if (viewHolder != null && (i8 = viewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) >= i7 && i8 <= i6) {
                    if (i8 == i) {
                        viewHolder.offsetPosition(i2 - i, false);
                    } else {
                        viewHolder.offsetPosition(i10, false);
                    }
                    if (RecyclerView.MediaDescriptionCompat) {
                        viewHolder.toString();
                    }
                }
            }
            recyclerView.requestLayout();
            recyclerView.addObserverForBackInvoker = true;
        }

        public void processDisappeared(ViewHolder viewHolder, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.getLastCustomNonConfigurationInstance.serializer(viewHolder);
            recyclerView.addAnimatingView(viewHolder);
            viewHolder.setIsRecyclable(false);
            accessgetSoftlightcp accessgetsoftlightcp = (accessgetSoftlightcp) recyclerView._init_lambda1;
            accessgetsoftlightcp.getClass();
            int i = infiniteAnimationPolicyDefaultImpls.serializer;
            int i2 = infiniteAnimationPolicyDefaultImpls.RemoteActionCompatParcelizer;
            View view = viewHolder.MediaSessionCompatQueueItem;
            int left = infiniteAnimationPolicyDefaultImpls2 == null ? view.getLeft() : infiniteAnimationPolicyDefaultImpls2.serializer;
            int top = infiniteAnimationPolicyDefaultImpls2 == null ? view.getTop() : infiniteAnimationPolicyDefaultImpls2.RemoteActionCompatParcelizer;
            if (viewHolder.isRemoved() || (i == left && i2 == top)) {
                accessgetsoftlightcp.write(viewHolder);
                accessgetsoftlightcp.MediaSessionCompatToken.add(viewHolder);
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                if (!accessgetsoftlightcp.IconCompatParcelizer(viewHolder, i, i2, left, top)) {
                    return;
                }
            }
            recyclerView.postAnimationRunner();
        }

        @Override // o.getExit
        public float read() {
            float f;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem()) {
                f = recyclerView.getOnBackPressedDispatcher;
            } else {
                if (!recyclerView.fullyDrawnReporter_delegatelambda00.RatingCompat()) {
                    return 0.0f;
                }
                f = recyclerView.getSavedStateRegistry;
            }
            return -f;
        }

        public void read(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
        }

        @Override // o.getExit
        public void serializer() {
            RecyclerView.this.stopScroll();
        }

        @Override // o.getExit
        public boolean startDifferentialMotionFling(float f) {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem()) {
                i2 = (int) f;
                i = 0;
            } else if (recyclerView.fullyDrawnReporter_delegatelambda00.RatingCompat()) {
                i = (int) f;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            recyclerView.stopScroll();
            return recyclerView.fling(i, i2, 0, Integer.MAX_VALUE);
        }

        public void write(accessgetOverlaycp accessgetoverlaycp) {
            int i = accessgetoverlaycp.read;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 1) {
                recyclerView.fullyDrawnReporter_delegatelambda00.read(accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.write);
                return;
            }
            if (i == 2) {
                recyclerView.fullyDrawnReporter_delegatelambda00.IconCompatParcelizer(accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.write);
            } else if (i == 4) {
                recyclerView.fullyDrawnReporter_delegatelambda00.IconCompatParcelizer(recyclerView, accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.write);
            } else {
                if (i != 8) {
                    return;
                }
                recyclerView.fullyDrawnReporter_delegatelambda00.write(accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.write);
            }
        }
    }

    public abstract class Adapter {
        private final getXor0nO6VwU serializer = new getXor0nO6VwU();
        private boolean IconCompatParcelizer = false;
        private getSrcIn0nO6VwU write = getSrcIn0nO6VwU.ALLOW;

        public int findRelativeAdapterPositionIn(Adapter adapter, ViewHolder viewHolder, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final getSrcIn0nO6VwU getStateRestorationPolicy() {
            return this.write;
        }

        public final boolean hasStableIds() {
            return this.IconCompatParcelizer;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(ViewHolder viewHolder, int i);

        public void onBindViewHolder(ViewHolder viewHolder, int i, List<Object> list) {
            onBindViewHolder(viewHolder, i);
        }

        public abstract ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(ViewHolder viewHolder) {
            return false;
        }

        public void onViewAttachedToWindow(ViewHolder viewHolder) {
        }

        public void onViewDetachedFromWindow(ViewHolder viewHolder) {
        }

        public void onViewRecycled(ViewHolder viewHolder) {
        }

        public boolean canRestoreState() {
            int iOrdinal = this.write.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return false;
                }
            } else if (getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final boolean hasObservers() {
            return this.serializer.write();
        }

        public final void notifyDataSetChanged() {
            this.serializer.RemoteActionCompatParcelizer();
        }

        public final void notifyItemMoved(int i, int i2) {
            this.serializer.read(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.serializer.serializer(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.serializer.RemoteActionCompatParcelizer(i, i2);
        }

        public void registerAdapterDataObserver(BlendModeColorFilterxETnrds blendModeColorFilterxETnrds) {
            this.serializer.registerObserver(blendModeColorFilterxETnrds);
        }

        public void setStateRestorationPolicy(getSrcIn0nO6VwU getsrcin0no6vwu) {
            this.write = getsrcin0no6vwu;
            this.serializer.serializer();
        }

        public void unregisterAdapterDataObserver(BlendModeColorFilterxETnrds blendModeColorFilterxETnrds) {
            this.serializer.unregisterObserver(blendModeColorFilterxETnrds);
        }

        public final void notifyItemInserted(int i) {
            this.serializer.serializer(i, 1);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.serializer.read(i, i2, null);
        }

        public final void notifyItemRemoved(int i) {
            this.serializer.RemoteActionCompatParcelizer(i, 1);
        }

        public final void notifyItemChanged(int i) {
            this.serializer.read(i, 1, null);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            } else {
                this.IconCompatParcelizer = z;
            }
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.serializer.read(i, i2, obj);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.serializer.read(i, 1, obj);
        }

        public final void bindViewHolder(ViewHolder viewHolder, int i) {
            boolean z = viewHolder.MediaBrowserCompatMediaItem == null;
            if (z) {
                viewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
                if (hasStableIds()) {
                    viewHolder.RatingCompat = getItemId(i);
                }
                viewHolder.setFlags(1, 519);
                if (releaseFocus.serializer()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(viewHolder.PlaybackStateCompatCustomAction)));
                }
            }
            viewHolder.MediaBrowserCompatMediaItem = this;
            if (RecyclerView.MediaSessionCompatQueueItem) {
                if (viewHolder.MediaSessionCompatQueueItem.getParent() == null && viewHolder.MediaSessionCompatQueueItem.isAttachedToWindow() != viewHolder.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + viewHolder.isTmpDetached() + ", attached to window: " + viewHolder.MediaSessionCompatQueueItem.isAttachedToWindow() + ", holder: " + viewHolder);
                }
                if (viewHolder.MediaSessionCompatQueueItem.getParent() == null && viewHolder.MediaSessionCompatQueueItem.isAttachedToWindow()) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(viewHolder, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                    return;
                }
            }
            onBindViewHolder(viewHolder, i, viewHolder.getUnmodifiedPayloads());
            if (z) {
                viewHolder.clearPayload();
                ViewGroup.LayoutParams layoutParams = viewHolder.MediaSessionCompatQueueItem.getLayoutParams();
                if (layoutParams instanceof BlockGraphicsLayerElement) {
                    ((BlockGraphicsLayerElement) layoutParams).IconCompatParcelizer = true;
                }
                Trace.endSection();
            }
        }

        public final ViewHolder createViewHolder(ViewGroup viewGroup, int i) {
            try {
                if (releaseFocus.serializer()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
                }
                ViewHolder viewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (viewHolderOnCreateViewHolder.MediaSessionCompatQueueItem.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                viewHolderOnCreateViewHolder.PlaybackStateCompatCustomAction = i;
                Trace.endSection();
                return viewHolderOnCreateViewHolder;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public abstract class ItemAnimator {
        public long ComponentActivity;
        public long MediaSessionCompatResultReceiverWrapper;
        public long PlaybackStateCompat;
        public AnonymousClass7 ResultReceiver;
        public long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        public ArrayList r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

        public abstract void IconCompatParcelizer(ViewHolder viewHolder);

        public abstract boolean IconCompatParcelizer();

        public abstract boolean read(ViewHolder viewHolder, ViewHolder viewHolder2, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls2);

        public abstract void serializer();

        public static void serializer(ViewHolder viewHolder) {
            int i = viewHolder.MediaMetadataCompat;
            if (!viewHolder.isInvalid() && (i & 4) == 0) {
                viewHolder.getOldPosition();
                viewHolder.getAbsoluteAdapterPosition();
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0069  */
        /* JADX WARN: Code duplicated, block: B:32:0x0077  */
        public final void dispatchAnimationFinished(ViewHolder viewHolder) {
            AnonymousClass7 anonymousClass7 = this.ResultReceiver;
            if (anonymousClass7 != null) {
                RecyclerView recyclerView = RecyclerView.this;
                boolean z = true;
                viewHolder.setIsRecyclable(true);
                if (viewHolder.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null && viewHolder.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                    viewHolder.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                }
                viewHolder.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
                if (viewHolder.shouldBeKeptAsChild()) {
                    return;
                }
                View view = viewHolder.MediaSessionCompatQueueItem;
                Recycler recycler = recyclerView.getLastCustomNonConfigurationInstance;
                recyclerView.startInterceptRequestLayout();
                ChildHelper childHelper = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda0 = (resizeGraphicFrameIfAppropriatelambda0) childHelper.write;
                AnonymousClass7 anonymousClass8 = (AnonymousClass7) childHelper.serializer;
                int i = childHelper.IconCompatParcelizer;
                if (i != 1) {
                    if (i == 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot call removeViewIfHidden within removeViewIfHidden");
                        return;
                    }
                    try {
                        childHelper.IconCompatParcelizer = 2;
                        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
                        if (iIndexOfChild == -1) {
                            childHelper.write(view);
                        } else if (resizegraphicframeifappropriatelambda0.IconCompatParcelizer(iIndexOfChild)) {
                            resizegraphicframeifappropriatelambda0.write(iIndexOfChild);
                            childHelper.write(view);
                            anonymousClass8.read(iIndexOfChild);
                        } else {
                            childHelper.IconCompatParcelizer = 0;
                        }
                        childHelper.IconCompatParcelizer = 0;
                        if (z) {
                            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                            recycler.serializer(childViewHolderInt);
                            recycler.read(childViewHolderInt);
                            if (RecyclerView.MediaDescriptionCompat) {
                                Objects.toString(view);
                                recyclerView.toString();
                            }
                        }
                        recyclerView.stopInterceptRequestLayout(!z);
                        if (z && viewHolder.isTmpDetached()) {
                            recyclerView.removeDetachedView(viewHolder.MediaSessionCompatQueueItem, false);
                            return;
                        }
                    } catch (Throwable th) {
                        childHelper.IconCompatParcelizer = 0;
                        throw th;
                    }
                }
                if (((View) childHelper.MediaSessionCompatQueueItem) != view) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot call removeViewIfHidden within removeView(At) for a different view");
                    return;
                }
                z = false;
                if (z) {
                    ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    recycler.serializer(childViewHolderInt2);
                    recycler.read(childViewHolderInt2);
                    if (RecyclerView.MediaDescriptionCompat) {
                        Objects.toString(view);
                        recyclerView.toString();
                    }
                }
                recyclerView.stopInterceptRequestLayout(!z);
                if (z) {
                }
            }
        }
    }

    public abstract class LayoutManager {
        public final boolean _init_lambda1;
        public int _init_lambda2;
        public boolean _init_lambda3;
        public final boolean _init_lambda4;
        public final verticalGradient8A3gB4 accessensureViewModelStore;
        public LinearSmoothScroller addObserverForBackInvoker;
        public final verticalGradient8A3gB4 addObserverForBackInvokerlambda0;
        public boolean createFullyDrawnExecutor;
        public boolean defaultViewModelProviderFactory_delegatelambda0;
        public RecyclerView ensureViewModelStore;
        public int getSavedStateRegistryControllerannotations;
        public int menuHostHelperlambda0;
        public ChildHelper r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        public int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        public int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

        public abstract int IconCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc);

        public abstract BlockGraphicsLayerElement IconCompatParcelizer();

        public void IconCompatParcelizer(int i, int i2) {
        }

        public void IconCompatParcelizer(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public abstract void IconCompatParcelizer(RecyclerView recyclerView, int i);

        public void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            ParcelableVolumeInfo(i);
        }

        public abstract boolean MediaBrowserCompatMediaItem();

        public abstract int MediaDescriptionCompat(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc);

        public abstract int MediaSessionCompatQueueItem(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc);

        public void ParcelableVolumeInfo(int i) {
        }

        public boolean ParcelableVolumeInfo() {
            return false;
        }

        public void PlaybackStateCompat(int i) {
        }

        public boolean PlaybackStateCompatCustomAction() {
            return false;
        }

        public abstract void RatingCompat(int i);

        public abstract boolean RatingCompat();

        public abstract int RemoteActionCompatParcelizer(int i, Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc);

        public abstract void RemoteActionCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc);

        public boolean q_() {
            return false;
        }

        public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
            return false;
        }

        public Parcelable r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
            return null;
        }

        public void r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        }

        public abstract int read(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc);

        public void read(int i, int i2) {
        }

        public void read(int i, isActive isactive) {
        }

        public abstract void read(Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc);

        public void read(RecyclerView recyclerView) {
        }

        public abstract int serializer(int i, Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc);

        public abstract int serializer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc);

        public void serializer(RecyclerView recyclerView) {
        }

        public boolean serializer(BlockGraphicsLayerElement blockGraphicsLayerElement) {
            return blockGraphicsLayerElement != null;
        }

        public abstract int write(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc);

        public View write(View view, int i, Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
            return null;
        }

        public void write() {
        }

        public void write(int i, int i2) {
        }

        public void write(int i, int i2, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, isActive isactive) {
        }

        public void write(Parcelable parcelable) {
        }

        public static BlockGraphicsLayerModifier read(Context context, AttributeSet attributeSet, int i, int i2) {
            BlockGraphicsLayerModifier blockGraphicsLayerModifier = new BlockGraphicsLayerModifier();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, accessgetLightencp.RecyclerView, i, i2);
            blockGraphicsLayerModifier.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInt(0, 1);
            blockGraphicsLayerModifier.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(10, 1);
            blockGraphicsLayerModifier.serializer = typedArrayObtainStyledAttributes.getBoolean(9, false);
            blockGraphicsLayerModifier.read = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return blockGraphicsLayerModifier;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001b  */
        /* JADX WARN: Code duplicated, block: B:14:0x001f  */
        /* JADX WARN: Code duplicated, block: B:22:0x002f  */
        public static int write(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public void read(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.ensureViewModelStore;
            Recycler recycler = recyclerView.getLastCustomNonConfigurationInstance;
            if (accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.ensureViewModelStore.canScrollVertically(-1) && !this.ensureViewModelStore.canScrollHorizontally(-1) && !this.ensureViewModelStore.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            Adapter adapter = this.ensureViewModelStore.MediaSessionCompatResultReceiverWrapper;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public final void read(Recycler recycler) {
            ArrayList arrayList;
            int size = recycler.serializer.size();
            int i = size - 1;
            while (true) {
                arrayList = recycler.serializer;
                if (i < 0) {
                    break;
                }
                View view = ((ViewHolder) arrayList.get(i)).MediaSessionCompatQueueItem;
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.ensureViewModelStore.removeDetachedView(view, false);
                    }
                    ItemAnimator itemAnimator = this.ensureViewModelStore._init_lambda1;
                    if (itemAnimator != null) {
                        itemAnimator.IconCompatParcelizer(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.ResultReceiver = null;
                    childViewHolderInt2.MediaDescriptionCompat = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    recycler.read(childViewHolderInt2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList arrayList2 = recycler.IconCompatParcelizer;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.ensureViewModelStore.invalidate();
            }
        }

        public final void serializer(View view, Recycler recycler) {
            ChildHelper childHelper = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            AnonymousClass7 anonymousClass7 = (AnonymousClass7) childHelper.serializer;
            int i = childHelper.IconCompatParcelizer;
            if (i == 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i == 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                childHelper.IconCompatParcelizer = 1;
                childHelper.MediaSessionCompatQueueItem = view;
                int iIndexOfChild = RecyclerView.this.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (((resizeGraphicFrameIfAppropriatelambda0) childHelper.write).write(iIndexOfChild)) {
                        childHelper.write(view);
                    }
                    anonymousClass7.read(iIndexOfChild);
                }
                childHelper.IconCompatParcelizer = 0;
                childHelper.MediaSessionCompatQueueItem = null;
                recycler.serializer(view);
            } catch (Throwable th) {
                childHelper.IconCompatParcelizer = 0;
                childHelper.MediaSessionCompatQueueItem = null;
                throw th;
            }
        }

        public final void IconCompatParcelizer(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.ensureViewModelStore = null;
                this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = null;
                this.menuHostHelperlambda0 = 0;
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = 0;
            } else {
                this.ensureViewModelStore = recyclerView;
                this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                this.menuHostHelperlambda0 = recyclerView.getWidth();
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = recyclerView.getHeight();
            }
            this.getSavedStateRegistryControllerannotations = 1073741824;
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = 1073741824;
        }

        public void read(Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
            if (this.ensureViewModelStore.canScrollVertically(-1) || this.ensureViewModelStore.canScrollHorizontally(-1)) {
                focusRestorerKtsaveFocusedChild11.write(8192);
                focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(true);
                focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(67108864, true);
            }
            if (this.ensureViewModelStore.canScrollVertically(1) || this.ensureViewModelStore.canScrollHorizontally(1)) {
                focusRestorerKtsaveFocusedChild11.write(Fields.TransformOrigin);
                focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(true);
                focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(67108864, true);
            }
            focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer(getHasFocus.write(RemoteActionCompatParcelizer(recycler, getintrinsicsizenhjbrc), serializer(recycler, getintrinsicsizenhjbrc), 0));
        }

        public static int IconCompatParcelizer(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public static int IconCompatParcelizer(View view) {
            return view.getTop() - ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.top;
        }

        public static int RemoteActionCompatParcelizer(View view) {
            return ((BlockGraphicsLayerElement) view.getLayoutParams()).MediaMetadataCompat.getLayoutPosition();
        }

        public static int a_(View view) {
            return view.getRight() + ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.right;
        }

        public static int serializer(View view) {
            return view.getBottom() + ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.bottom;
        }

        public static int write(View view) {
            return view.getLeft() - ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.left;
        }

        public static void write(View view, int i, int i2, int i3, int i4) {
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
            Rect rect = blockGraphicsLayerElement.serializer;
            int i5 = rect.left;
            int i6 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).leftMargin;
            int i7 = rect.top;
            int i8 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).topMargin;
            int i9 = rect.right;
            view.layout(i + i5 + i6, i2 + i7 + i8, (i3 - i9) - ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).bottomMargin);
        }

        public static boolean write(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public void IconCompatParcelizer(Rect rect, int i, int i2) {
            int iWidth = rect.width();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int iHeight = rect.height();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            RecyclerView recyclerView = this.ensureViewModelStore;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            this.ensureViewModelStore.setMeasuredDimension(IconCompatParcelizer(i, paddingRight + paddingLeft + iWidth, recyclerView.getMinimumWidth()), IconCompatParcelizer(i2, paddingBottom + paddingTop + iHeight, this.ensureViewModelStore.getMinimumHeight()));
        }

        public final void MediaMetadataCompat(int i, int i2) {
            this.menuHostHelperlambda0 = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.getSavedStateRegistryControllerannotations = mode;
            if (mode == 0 && !RecyclerView.serializer) {
                this.menuHostHelperlambda0 = 0;
            }
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = mode2;
            if (mode2 != 0 || RecyclerView.serializer) {
                return;
            }
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = 0;
        }

        public final View MediaSessionCompatResultReceiverWrapper(int i) {
            ChildHelper childHelper = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            if (childHelper != null) {
                return childHelper.serializer(i);
            }
            return null;
        }

        public int RemoteActionCompatParcelizer(Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView == null || recyclerView.MediaSessionCompatResultReceiverWrapper == null || !MediaBrowserCompatMediaItem()) {
                return 1;
            }
            return this.ensureViewModelStore.MediaSessionCompatResultReceiverWrapper.getItemCount();
        }

        public final void RemoteActionCompatParcelizer(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.ensureViewModelStore != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.ensureViewModelStore.onMenuItemSelected;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public final int ResultReceiver() {
            RecyclerView recyclerView = this.ensureViewModelStore;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public final int getPaddingBottom() {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int getPaddingEnd() {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            return recyclerView.getPaddingEnd();
        }

        public final int getPaddingLeft() {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int getPaddingRight() {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int getPaddingStart() {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            return recyclerView.getPaddingStart();
        }

        public final int getPaddingTop() {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void offsetChildrenHorizontal(int i) {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView != null) {
                int iIconCompatParcelizer = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer();
                for (int i2 = 0; i2 < iIconCompatParcelizer; i2++) {
                    recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void offsetChildrenVertical(int i) {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView != null) {
                int iIconCompatParcelizer = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer();
                for (int i2 = 0; i2 < iIconCompatParcelizer; i2++) {
                    recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer(i2).offsetTopAndBottom(i);
                }
            }
        }

        public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
            ChildHelper childHelper = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            if (childHelper != null) {
                return childHelper.IconCompatParcelizer();
            }
            return 0;
        }

        public final void r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public final void read(int i, Recycler recycler) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i);
            if (MediaSessionCompatResultReceiverWrapper(i) != null) {
                this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatQueueItem(i);
            }
            recycler.serializer(viewMediaSessionCompatResultReceiverWrapper);
        }

        public void read(String str) {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i = this.menuHostHelperlambda0;
            int paddingRight = getPaddingRight();
            int i2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            int paddingBottom = getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i3 = left - paddingLeft;
            int iMin = Math.min(0, i3);
            int i4 = top - paddingTop;
            int iMin2 = Math.min(0, i4);
            int i5 = (iWidth + left) - (i - paddingRight);
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, (iHeight + top) - (i2 - paddingBottom));
            if (this.ensureViewModelStore.getLayoutDirection() == 1) {
                iMin = iMax != 0 ? iMax : Math.max(iMin, i5);
            } else if (iMin == 0) {
                iMin = Math.min(i3, iMax);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i4, iMax2);
            }
            int[] iArr = {iMin, iMin2};
            int i6 = iArr[0];
            int i7 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int i8 = this.menuHostHelperlambda0;
                    int paddingRight2 = getPaddingRight();
                    int i9 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                    int paddingBottom2 = getPaddingBottom();
                    Rect rect2 = this.ensureViewModelStore.onMultiWindowModeChanged;
                    IconCompatParcelizer(focusedChild, rect2);
                    if (rect2.left - i6 < i8 - paddingRight2 && rect2.right - i6 > paddingLeft2 && rect2.top - i7 < i9 - paddingBottom2 && rect2.bottom - i7 > paddingTop2) {
                        if (i6 == 0) {
                        }
                        if (z) {
                            recyclerView.scrollBy(i6, i7);
                            return true;
                        }
                        recyclerView.smoothScrollBy$1(i6, i7, false);
                        return true;
                    }
                }
            } else if (i6 == 0 || i7 != 0) {
                if (z) {
                    recyclerView.scrollBy(i6, i7);
                    return true;
                }
                recyclerView.smoothScrollBy$1(i6, i7, false);
                return true;
            }
            return false;
        }

        public int serializer(Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView == null || recyclerView.MediaSessionCompatResultReceiverWrapper == null || !RatingCompat()) {
                return 1;
            }
            return this.ensureViewModelStore.MediaSessionCompatResultReceiverWrapper.getItemCount();
        }

        public final boolean serializer(View view, int i, int i2, BlockGraphicsLayerElement blockGraphicsLayerElement) {
            return (this._init_lambda4 && write(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).width) && write(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).height)) ? false : true;
        }

        public final void serializer(View view, Rect rect) {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public LayoutManager() {
            BlendModeColorFilterHelperExternalSyntheticApiModelOutline0 blendModeColorFilterHelperExternalSyntheticApiModelOutline0 = new BlendModeColorFilterHelperExternalSyntheticApiModelOutline0(this, 0);
            BlendModeColorFilterHelperExternalSyntheticApiModelOutline0 blendModeColorFilterHelperExternalSyntheticApiModelOutline1 = new BlendModeColorFilterHelperExternalSyntheticApiModelOutline0(this, 1);
            this.accessensureViewModelStore = new verticalGradient8A3gB4(blendModeColorFilterHelperExternalSyntheticApiModelOutline0);
            this.addObserverForBackInvokerlambda0 = new verticalGradient8A3gB4(blendModeColorFilterHelperExternalSyntheticApiModelOutline1);
            this.defaultViewModelProviderFactory_delegatelambda0 = false;
            this._init_lambda3 = false;
            this._init_lambda4 = true;
            this._init_lambda1 = true;
        }

        public final void IconCompatParcelizer(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
                return;
            }
            ChildHelper childHelper = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            if (((ArrayList) childHelper.read).contains(childViewHolderInt.MediaSessionCompatQueueItem)) {
                return;
            }
            RecyclerView recyclerView = this.ensureViewModelStore;
            write(recyclerView.getLastCustomNonConfigurationInstance, recyclerView.onCreatePanelMenu, view, focusRestorerKtsaveFocusedChild11);
        }

        public final void PlaybackStateCompatCustomAction(int i, int i2) {
            int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            if (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == 0) {
                this.ensureViewModelStore.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i7++) {
                View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i7);
                Rect rect = this.ensureViewModelStore.onMultiWindowModeChanged;
                IconCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.ensureViewModelStore.onMultiWindowModeChanged.set(i6, i4, i3, i5);
            IconCompatParcelizer(this.ensureViewModelStore.onMultiWindowModeChanged, i, i2);
        }

        public final void RemoteActionCompatParcelizer(RecyclerView recyclerView) {
            MediaMetadataCompat(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        final boolean RemoteActionCompatParcelizer(View view, int i, int i2, BlockGraphicsLayerElement blockGraphicsLayerElement) {
            return (!view.isLayoutRequested() && this._init_lambda4 && write(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).width) && write(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).height)) ? false : true;
        }

        public BlockGraphicsLayerElement read(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof BlockGraphicsLayerElement) {
                return new BlockGraphicsLayerElement((BlockGraphicsLayerElement) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new BlockGraphicsLayerElement((ViewGroup.MarginLayoutParams) layoutParams) : new BlockGraphicsLayerElement(layoutParams);
        }

        public final void write(LinearSmoothScroller linearSmoothScroller) {
            LinearSmoothScroller linearSmoothScroller2 = this.addObserverForBackInvoker;
            if (linearSmoothScroller2 != null && linearSmoothScroller != linearSmoothScroller2 && linearSmoothScroller2.PlaybackStateCompat) {
                linearSmoothScroller2.RemoteActionCompatParcelizer();
            }
            this.addObserverForBackInvoker = linearSmoothScroller;
            RecyclerView recyclerView = this.ensureViewModelStore;
            ViewFlinger viewFlinger = recyclerView.onPreparePanel;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.write.abortAnimation();
            if (linearSmoothScroller.PlaybackStateCompatCustomAction) {
                SentryLogcatAdapter.IconCompatParcelizer("RecyclerView", "An instance of " + linearSmoothScroller.getClass().getSimpleName() + " was started more than once. Each instance of" + linearSmoothScroller.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            linearSmoothScroller.RatingCompat = recyclerView;
            linearSmoothScroller.MediaDescriptionCompat = this;
            int i = linearSmoothScroller.MediaSessionCompatResultReceiverWrapper;
            if (i == -1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid target position");
                return;
            }
            recyclerView.onCreatePanelMenu.PlaybackStateCompat = i;
            linearSmoothScroller.PlaybackStateCompat = true;
            linearSmoothScroller.MediaMetadataCompat = true;
            linearSmoothScroller.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = recyclerView.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem(i);
            linearSmoothScroller.RatingCompat.onPreparePanel.serializer();
            linearSmoothScroller.PlaybackStateCompatCustomAction = true;
        }

        public View MediaBrowserCompatMediaItem(int i) {
            int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            for (int i2 = 0; i2 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i2++) {
                View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i2);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(viewMediaSessionCompatResultReceiverWrapper);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.ensureViewModelStore.onCreatePanelMenu.write || !childViewHolderInt.isRemoved())) {
                    return viewMediaSessionCompatResultReceiverWrapper;
                }
            }
            return null;
        }

        public final void addViewInt(View view, int i, boolean z) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                processDragGesture processdraggesture = (processDragGesture) this.ensureViewModelStore.onRetainNonConfigurationInstance.read;
                linearGradientmHitzGk lineargradientmhitzgk = (linearGradientmHitzGk) processdraggesture.get(childViewHolderInt);
                if (lineargradientmhitzgk == null) {
                    lineargradientmhitzgk = linearGradientmHitzGk.read();
                    processdraggesture.put(childViewHolderInt, lineargradientmhitzgk);
                }
                lineargradientmhitzgk.serializer |= 1;
            } else {
                this.ensureViewModelStore.onRetainNonConfigurationInstance.read(childViewHolderInt);
            }
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer(view, i, view.getLayoutParams(), false);
            } else {
                ViewParent parent = view.getParent();
                RecyclerView recyclerView = this.ensureViewModelStore;
                ChildHelper childHelper = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                if (parent == recyclerView) {
                    resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda0 = (resizeGraphicFrameIfAppropriatelambda0) childHelper.write;
                    int iIndexOfChild = RecyclerView.this.indexOfChild(view);
                    int i2 = (iIndexOfChild == -1 || resizegraphicframeifappropriatelambda0.IconCompatParcelizer(iIndexOfChild)) ? -1 : iIndexOfChild - resizegraphicframeifappropriatelambda0.read(iIndexOfChild);
                    if (i == -1) {
                        i = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer();
                    }
                    if (i2 == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.ensureViewModelStore.indexOfChild(view) + this.ensureViewModelStore.exceptionLabel());
                    }
                    if (i2 != i) {
                        LayoutManager layoutManager = this.ensureViewModelStore.fullyDrawnReporter_delegatelambda00;
                        View viewMediaSessionCompatResultReceiverWrapper = layoutManager.MediaSessionCompatResultReceiverWrapper(i2);
                        if (viewMediaSessionCompatResultReceiverWrapper == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + layoutManager.ensureViewModelStore.toString());
                        }
                        layoutManager.MediaSessionCompatResultReceiverWrapper(i2);
                        layoutManager.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer(i2);
                        BlockGraphicsLayerElement blockGraphicsLayerElement2 = (BlockGraphicsLayerElement) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams();
                        ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(viewMediaSessionCompatResultReceiverWrapper);
                        boolean zIsRemoved = childViewHolderInt2.isRemoved();
                        RecyclerView recyclerView2 = layoutManager.ensureViewModelStore;
                        if (zIsRemoved) {
                            processDragGesture processdraggesture2 = (processDragGesture) recyclerView2.onRetainNonConfigurationInstance.read;
                            linearGradientmHitzGk lineargradientmhitzgk2 = (linearGradientmHitzGk) processdraggesture2.get(childViewHolderInt2);
                            if (lineargradientmhitzgk2 == null) {
                                lineargradientmhitzgk2 = linearGradientmHitzGk.read();
                                processdraggesture2.put(childViewHolderInt2, lineargradientmhitzgk2);
                            }
                            lineargradientmhitzgk2.serializer = 1 | lineargradientmhitzgk2.serializer;
                        } else {
                            recyclerView2.onRetainNonConfigurationInstance.read(childViewHolderInt2);
                        }
                        layoutManager.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper, i, blockGraphicsLayerElement2, childViewHolderInt2.isRemoved());
                    }
                } else {
                    childHelper.addView(view, i, false);
                    blockGraphicsLayerElement.IconCompatParcelizer = true;
                    LinearSmoothScroller linearSmoothScroller = this.addObserverForBackInvoker;
                    if (linearSmoothScroller != null && linearSmoothScroller.PlaybackStateCompat) {
                        linearSmoothScroller.RatingCompat.getClass();
                        ViewHolder childViewHolderInt3 = RecyclerView.getChildViewHolderInt(view);
                        if ((childViewHolderInt3 != null ? childViewHolderInt3.getLayoutPosition() : -1) == linearSmoothScroller.MediaSessionCompatResultReceiverWrapper) {
                            linearSmoothScroller.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = view;
                        }
                    }
                }
            }
            if (blockGraphicsLayerElement.read) {
                if (RecyclerView.MediaDescriptionCompat) {
                    Objects.toString(blockGraphicsLayerElement.MediaMetadataCompat);
                }
                childViewHolderInt.MediaSessionCompatQueueItem.invalidate();
                blockGraphicsLayerElement.read = false;
            }
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0089 A[PHI: r8
  0x0089: PHI (r8v8 int) = (r8v5 int), (r8v19 int) binds: [B:26:0x007c, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean serializer(Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, int i, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            float f;
            if (this.ensureViewModelStore != null) {
                int iHeight = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                int iWidth = this.menuHostHelperlambda0;
                Rect rect = new Rect();
                if (this.ensureViewModelStore.getMatrix().isIdentity() && this.ensureViewModelStore.getGlobalVisibleRect(rect)) {
                    iHeight = rect.height();
                    iWidth = rect.width();
                }
                if (i == 4096) {
                    if (this.ensureViewModelStore.canScrollVertically(1)) {
                        paddingTop = (iHeight - getPaddingTop()) - getPaddingBottom();
                    } else {
                        paddingTop = 0;
                    }
                    if (this.ensureViewModelStore.canScrollHorizontally(1)) {
                        paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
                    } else {
                        paddingLeft = 0;
                    }
                } else if (i != 8192) {
                    paddingTop = 0;
                    paddingLeft = 0;
                } else {
                    if (this.ensureViewModelStore.canScrollVertically(-1)) {
                        paddingTop = -((iHeight - getPaddingTop()) - getPaddingBottom());
                    } else {
                        paddingTop = 0;
                    }
                    if (this.ensureViewModelStore.canScrollHorizontally(-1)) {
                        paddingLeft = -((iWidth - getPaddingLeft()) - getPaddingRight());
                    } else {
                        paddingLeft = 0;
                    }
                }
                if (paddingTop != 0 || paddingLeft != 0) {
                    if (bundle != null) {
                        f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                        if (f < 0.0f) {
                            if (RecyclerView.MediaSessionCompatQueueItem) {
                                throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                            }
                        }
                    } else {
                        f = 1.0f;
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                        if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                            paddingLeft = (int) (paddingLeft * f);
                            paddingTop = (int) (paddingTop * f);
                        }
                        this.ensureViewModelStore.smoothScrollBy$1(paddingLeft, paddingTop, true);
                        return true;
                    }
                    RecyclerView recyclerView = this.ensureViewModelStore;
                    Adapter adapter = recyclerView.MediaSessionCompatResultReceiverWrapper;
                    if (adapter != null) {
                        if (i == 4096) {
                            recyclerView.smoothScrollToPosition(adapter.getItemCount() - 1);
                            return true;
                        }
                        if (i != 8192) {
                            return true;
                        }
                        recyclerView.smoothScrollToPosition(0);
                        return true;
                    }
                }
            }
            return false;
        }

        public final void IconCompatParcelizer(Recycler recycler) {
            int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            while (true) {
                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus--;
                if (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus < 0) {
                    return;
                }
                View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(viewMediaSessionCompatResultReceiverWrapper);
                if (childViewHolderInt.shouldIgnore()) {
                    if (RecyclerView.MediaDescriptionCompat) {
                        childViewHolderInt.toString();
                    }
                } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.ensureViewModelStore.MediaSessionCompatResultReceiverWrapper.hasStableIds()) {
                    MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    recycler.scrapView(viewMediaSessionCompatResultReceiverWrapper);
                    this.ensureViewModelStore.onRetainNonConfigurationInstance.read(childViewHolderInt);
                } else {
                    if (MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) != null) {
                        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatQueueItem(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    }
                    recycler.read(childViewHolderInt);
                }
            }
        }

        public final void r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
            int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            while (true) {
                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus--;
                if (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus < 0) {
                    return;
                } else {
                    this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatQueueItem(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                }
            }
        }

        public final void write(Recycler recycler) {
            int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            while (true) {
                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus--;
                if (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus < 0) {
                    return;
                }
                if (!RecyclerView.getChildViewHolderInt(MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)).shouldIgnore()) {
                    read(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, recycler);
                }
            }
        }

        public BlockGraphicsLayerElement generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new BlockGraphicsLayerElement(context, attributeSet);
        }

        public void write(Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(FocusRestorerNodeonExit1.serializer(MediaBrowserCompatMediaItem() ? RemoteActionCompatParcelizer(view) : 0, 1, RatingCompat() ? RemoteActionCompatParcelizer(view) : 0, 1, false));
        }

        public boolean RemoteActionCompatParcelizer(int i, Bundle bundle) {
            RecyclerView recyclerView = this.ensureViewModelStore;
            return serializer(recyclerView.getLastCustomNonConfigurationInstance, recyclerView.onCreatePanelMenu, i, bundle);
        }
    }

    public final class Recycler {
        public ArrayList IconCompatParcelizer;
        public final List MediaBrowserCompatMediaItem;
        public int MediaDescriptionCompat;
        public int RemoteActionCompatParcelizer;
        public isImportantForBounds read;
        public final ArrayList serializer;
        public final ArrayList write;

        public final int IconCompatParcelizer(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = recyclerView.onCreatePanelMenu;
            if (i >= 0 && i < getintrinsicsizenhjbrc.serializer()) {
                return !getintrinsicsizenhjbrc.write ? i : recyclerView.ParcelableVolumeInfo.read(i, 0);
            }
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "invalid position ", ". State item count is ");
            sbM.append(getintrinsicsizenhjbrc.serializer());
            sbM.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM.toString());
        }

        public final void IconCompatParcelizer() {
            ArrayList arrayList = this.write;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                write(size);
            }
            arrayList.clear();
            if (RecyclerView.IconCompatParcelizer) {
                isActive isactive = RecyclerView.this.getDefaultViewModelCreationExtras;
                int[] iArr = (int[]) isactive.RemoteActionCompatParcelizer;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                isactive.read = 0;
            }
        }

        public final void RemoteActionCompatParcelizer() {
            LayoutManager layoutManager = RecyclerView.this.fullyDrawnReporter_delegatelambda00;
            this.MediaDescriptionCompat = this.RemoteActionCompatParcelizer + (layoutManager != null ? layoutManager._init_lambda2 : 0);
            ArrayList arrayList = this.write;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0 || arrayList.size() <= this.MediaDescriptionCompat) {
                    return;
                } else {
                    write(size);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:63:0x00c5 A[LOOP:2: B:58:0x00b8->B:63:0x00c5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:87:0x00c8 A[EDGE_INSN: B:87:0x00c8->B:64:0x00c8 BREAK  A[LOOP:1: B:53:0x00a3->B:91:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x00c8 A[EDGE_INSN: B:88:0x00c8->B:64:0x00c8 BREAK  A[LOOP:1: B:53:0x00a3->B:91:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x00c8 A[EDGE_INSN: B:89:0x00c8->B:64:0x00c8 BREAK  A[LOOP:1: B:53:0x00a3->B:91:?, LOOP_LABEL: LOOP:1: B:53:0x00a3->B:91:?], SYNTHETIC] */
        public final void read(ViewHolder viewHolder) {
            boolean z;
            boolean z2;
            int i;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            isActive isactive = recyclerView.getDefaultViewModelCreationExtras;
            boolean z3 = false;
            if (viewHolder.isScrap() || viewHolder.MediaSessionCompatQueueItem.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(viewHolder.isScrap());
                sb.append(" isAttached:");
                sb.append(viewHolder.MediaSessionCompatQueueItem.getParent() != null);
                sb.append(recyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (viewHolder.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(viewHolder);
                DrawableTransformation.read(sb2, (Object) recyclerView.exceptionLabel());
                return;
            }
            if (viewHolder.shouldIgnore()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.exceptionLabel()));
                return;
            }
            boolean zDoesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
            Adapter adapter = recyclerView.MediaSessionCompatResultReceiverWrapper;
            boolean z4 = adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder);
            boolean z5 = RecyclerView.MediaSessionCompatQueueItem;
            ArrayList arrayList = this.write;
            if (z5 && arrayList.contains(viewHolder)) {
                StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                sb3.append(viewHolder);
                DrawableTransformation.read(sb3, (Object) recyclerView.exceptionLabel());
                return;
            }
            if (z4 || viewHolder.isRecyclable()) {
                if (this.MediaDescriptionCompat <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.MediaDescriptionCompat && size > 0) {
                        write(0);
                        size--;
                    }
                    if (RecyclerView.IconCompatParcelizer && size > 0) {
                        int i4 = viewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        if (((int[]) isactive.RemoteActionCompatParcelizer) != null) {
                            int i5 = isactive.read;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5 * 2) {
                                    loop1: while (true) {
                                        size--;
                                        if (size >= 0) {
                                            break;
                                        }
                                        i = ((ViewHolder) arrayList.get(size)).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                        if (((int[]) isactive.RemoteActionCompatParcelizer) != null) {
                                            break;
                                        }
                                        i2 = isactive.read;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < i2 * 2) {
                                                break loop1;
                                            } else if (((int[]) isactive.RemoteActionCompatParcelizer)[i3] == i) {
                                                break;
                                            } else {
                                                i3 += 2;
                                            }
                                        }
                                    }
                                    size++;
                                } else if (((int[]) isactive.RemoteActionCompatParcelizer)[i6] != i4) {
                                    i6 += 2;
                                }
                            }
                        } else {
                            loop1: while (true) {
                                size--;
                                if (size >= 0) {
                                    break;
                                    break;
                                }
                                i = ((ViewHolder) arrayList.get(size)).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                if (((int[]) isactive.RemoteActionCompatParcelizer) != null) {
                                    break;
                                    break;
                                }
                                i2 = isactive.read;
                                i3 = 0;
                                while (true) {
                                    if (i3 < i2 * 2) {
                                        break loop1;
                                        break loop1;
                                    } else if (((int[]) isactive.RemoteActionCompatParcelizer)[i3] == i) {
                                        break;
                                    } else {
                                        i3 += 2;
                                    }
                                }
                            }
                            size++;
                        }
                    }
                    arrayList.add(size, viewHolder);
                    z = true;
                }
                if (!z) {
                    read(viewHolder, true);
                    z3 = true;
                }
                boolean z6 = z3;
                z3 = z;
                z2 = z6;
            } else {
                if (RecyclerView.MediaDescriptionCompat) {
                    recyclerView.exceptionLabel();
                }
                z2 = false;
            }
            recyclerView.onRetainNonConfigurationInstance.serializer(viewHolder);
            if (z3 || z2 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1890765613, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{viewHolder.MediaSessionCompatQueueItem}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1890765614);
            viewHolder.MediaBrowserCompatMediaItem = null;
            viewHolder.PlaybackStateCompat = null;
        }

        public final void write(int i) {
            boolean z = RecyclerView.MediaSessionCompatQueueItem;
            ArrayList arrayList = this.write;
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i);
            if (RecyclerView.MediaDescriptionCompat) {
                Objects.toString(viewHolder);
            }
            read(viewHolder, true);
            arrayList.remove(i);
        }

        public Recycler() {
            ArrayList arrayList = new ArrayList();
            this.serializer = arrayList;
            this.IconCompatParcelizer = null;
            this.write = new ArrayList();
            this.MediaBrowserCompatMediaItem = Collections.unmodifiableList(arrayList);
            this.RemoteActionCompatParcelizer = 2;
            this.MediaDescriptionCompat = 2;
        }

        public final void read(ViewHolder viewHolder, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            View view = viewHolder.MediaSessionCompatQueueItem;
            RecyclerView recyclerView = RecyclerView.this;
            verticalGradient8A3gB4default verticalgradient8a3gb4default = recyclerView.RatingCompat;
            if (verticalgradient8a3gb4default != null) {
                AccessibilityDelegateCompat accessibilityDelegateCompatIconCompatParcelizer = verticalgradient8a3gb4default.IconCompatParcelizer();
                FocusPropertiesNode.write(view, accessibilityDelegateCompatIconCompatParcelizer instanceof sweepGradientUv8p0NAdefault ? (AccessibilityDelegateCompat) ((sweepGradientUv8p0NAdefault) accessibilityDelegateCompatIconCompatParcelizer).IconCompatParcelizer.remove(view) : null);
            }
            if (z) {
                ArrayList arrayList = recyclerView.getDefaultViewModelProviderFactory;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                    return;
                } else {
                    Adapter adapter = recyclerView.MediaSessionCompatResultReceiverWrapper;
                    if (adapter != null) {
                        adapter.onViewRecycled(viewHolder);
                    }
                    if (recyclerView.onCreatePanelMenu != null) {
                        recyclerView.onRetainNonConfigurationInstance.serializer(viewHolder);
                    }
                    if (RecyclerView.MediaDescriptionCompat) {
                        Objects.toString(viewHolder);
                    }
                }
            }
            viewHolder.MediaBrowserCompatMediaItem = null;
            viewHolder.PlaybackStateCompat = null;
            isImportantForBounds isimportantforbounds = read();
            isimportantforbounds.getClass();
            int itemViewType = viewHolder.getItemViewType();
            ArrayList arrayList2 = isimportantforbounds.write(itemViewType).RemoteActionCompatParcelizer;
            if (((BlockGraphicsLayerModifiermeasure1) isimportantforbounds.RemoteActionCompatParcelizer.get(itemViewType)).read <= arrayList2.size()) {
                Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1890765613, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{viewHolder.MediaSessionCompatQueueItem}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1890765614);
            } else if (RecyclerView.MediaSessionCompatQueueItem && arrayList2.contains(viewHolder)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("this scrap item already exists");
            } else {
                viewHolder.resetInternal();
                arrayList2.add(viewHolder);
            }
        }

        public final void maybeSendPoolingContainerAttach() {
            RecyclerView recyclerView;
            Adapter adapter;
            isImportantForBounds isimportantforbounds = this.read;
            if (isimportantforbounds == null || (adapter = (recyclerView = RecyclerView.this).MediaSessionCompatResultReceiverWrapper) == null || !recyclerView.accessensureViewModelStore) {
                return;
            }
            isimportantforbounds.IconCompatParcelizer.add(adapter);
        }

        public final void read(Adapter adapter, boolean z) {
            isImportantForBounds isimportantforbounds = this.read;
            if (isimportantforbounds != null) {
                SparseArray sparseArray = isimportantforbounds.RemoteActionCompatParcelizer;
                Set set = isimportantforbounds.IconCompatParcelizer;
                set.remove(adapter);
                if (set.size() != 0 || z) {
                    return;
                }
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList arrayList = ((BlockGraphicsLayerModifiermeasure1) sparseArray.get(sparseArray.keyAt(i))).RemoteActionCompatParcelizer;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1890765613, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{((ViewHolder) arrayList.get(i2)).MediaSessionCompatQueueItem}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1890765614);
                    }
                }
            }
        }

        public final void serializer(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            read(childViewHolderInt);
            if (recyclerView._init_lambda1 == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView._init_lambda1.IconCompatParcelizer(childViewHolderInt);
        }

        public final void serializer(ViewHolder viewHolder) {
            if (viewHolder.MediaDescriptionCompat) {
                this.IconCompatParcelizer.remove(viewHolder);
            } else {
                this.serializer.remove(viewHolder);
            }
            viewHolder.ResultReceiver = null;
            viewHolder.MediaDescriptionCompat = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0192  */
        /* JADX WARN: Code duplicated, block: B:104:0x0198  */
        /* JADX WARN: Code duplicated, block: B:114:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:128:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:130:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:131:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:133:0x0205  */
        /* JADX WARN: Code duplicated, block: B:135:0x020d  */
        /* JADX WARN: Code duplicated, block: B:140:0x0230  */
        /* JADX WARN: Code duplicated, block: B:187:0x030f A[EDGE_INSN: B:187:0x030f->B:188:0x0310 BREAK  A[LOOP:6: B:182:0x02f7->B:186:0x030c]] */
        /* JADX WARN: Code duplicated, block: B:219:0x03a7  */
        /* JADX WARN: Code duplicated, block: B:225:0x03ca  */
        /* JADX WARN: Code duplicated, block: B:227:0x03d0  */
        /* JADX WARN: Code duplicated, block: B:231:0x03dc  */
        /* JADX WARN: Code duplicated, block: B:233:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:240:0x0414  */
        /* JADX WARN: Code duplicated, block: B:242:0x0420  */
        /* JADX WARN: Code duplicated, block: B:248:0x0430  */
        /* JADX WARN: Code duplicated, block: B:249:0x0441  */
        /* JADX WARN: Code duplicated, block: B:252:0x0449  */
        /* JADX WARN: Code duplicated, block: B:256:0x0464  */
        /* JADX WARN: Code duplicated, block: B:259:0x0472  */
        /* JADX WARN: Code duplicated, block: B:281:0x04b8  */
        /* JADX WARN: Code duplicated, block: B:284:0x04bd  */
        /* JADX WARN: Code duplicated, block: B:288:0x04c8  */
        /* JADX WARN: Code duplicated, block: B:289:0x04d4  */
        /* JADX WARN: Code duplicated, block: B:291:0x04da  */
        /* JADX WARN: Code duplicated, block: B:292:0x04e6  */
        /* JADX WARN: Code duplicated, block: B:295:0x04ed A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:297:0x04f0  */
        /* JADX WARN: Code duplicated, block: B:308:0x00c0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:313:0x00ed A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:318:0x018f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0080 A[EDGE_INSN: B:35:0x0080->B:36:0x0081 BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
        /* JADX WARN: Code duplicated, block: B:42:0x008e  */
        /* JADX WARN: Code duplicated, block: B:44:0x0095  */
        /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:70:0x0106  */
        /* JADX WARN: Code duplicated, block: B:72:0x010c  */
        /* JADX WARN: Code duplicated, block: B:77:0x012b  */
        /* JADX WARN: Code duplicated, block: B:80:0x0134 A[EDGE_INSN: B:80:0x0134->B:101:0x0190 BREAK  A[LOOP:1: B:43:0x0093->B:55:0x00bd]] */
        /* JADX WARN: Code duplicated, block: B:81:0x0143  */
        /* JADX WARN: Code duplicated, block: B:83:0x0155  */
        /* JADX WARN: Code duplicated, block: B:85:0x015b  */
        /* JADX WARN: Code duplicated, block: B:87:0x0161  */
        /* JADX WARN: Code duplicated, block: B:89:0x0168  */
        public final ViewHolder tryGetViewHolderForPositionByDeadline(int i, long j) {
            ViewHolder viewHolderCreateViewHolder;
            boolean z;
            ArrayList arrayList;
            ArrayList arrayList2;
            int itemViewType;
            boolean z2;
            long nanoTime;
            long j2;
            AccessibilityManager accessibilityManager;
            boolean z3;
            boolean z4;
            long j3;
            ViewGroup.LayoutParams layoutParams;
            BlockGraphicsLayerElement blockGraphicsLayerElement;
            int i2;
            RecyclerView recyclerViewFindNestedRecyclerView;
            ViewHolder viewHolder;
            int size;
            int i3;
            ArrayList arrayList3;
            int size2;
            int i4;
            View view;
            int size3;
            int i5;
            ViewHolder viewHolder2;
            ViewHolder childViewHolderInt;
            ChildHelper childHelper;
            resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda0;
            int iIndexOfChild;
            resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda1;
            int iIndexOfChild2;
            int i6;
            ViewHolder childViewHolderInt2;
            int i7;
            ViewHolder viewHolder3;
            int size4;
            int i8;
            RecyclerView recyclerView = RecyclerView.this;
            getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = recyclerView.onCreatePanelMenu;
            if (i >= 0 && i < getintrinsicsizenhjbrc.serializer()) {
                AccessibilityDelegateCompat accessibilityDelegateCompat = null;
                if (getintrinsicsizenhjbrc.write) {
                    ArrayList arrayList4 = this.IconCompatParcelizer;
                    if (arrayList4 != null && (size4 = arrayList4.size()) != 0) {
                        int i9 = 0;
                        while (true) {
                            if (i9 < size4) {
                                viewHolderCreateViewHolder = (ViewHolder) this.IconCompatParcelizer.get(i9);
                                if (!viewHolderCreateViewHolder.wasReturnedFromScrap() && viewHolderCreateViewHolder.getLayoutPosition() == i) {
                                    viewHolderCreateViewHolder.addFlags(32);
                                    break;
                                }
                                i9++;
                            } else if (recyclerView.MediaSessionCompatResultReceiverWrapper.hasStableIds() && (i8 = recyclerView.ParcelableVolumeInfo.read(i, 0)) > 0 && i8 < recyclerView.MediaSessionCompatResultReceiverWrapper.getItemCount()) {
                                long itemId = recyclerView.MediaSessionCompatResultReceiverWrapper.getItemId(i8);
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size4) {
                                        viewHolderCreateViewHolder = null;
                                        break;
                                    }
                                    ViewHolder viewHolder4 = (ViewHolder) this.IconCompatParcelizer.get(i10);
                                    if (!viewHolder4.wasReturnedFromScrap() && viewHolder4.getItemId() == itemId) {
                                        viewHolder4.addFlags(32);
                                        viewHolderCreateViewHolder = viewHolder4;
                                        break;
                                    }
                                    i10++;
                                }
                            } else {
                                viewHolderCreateViewHolder = null;
                                break;
                            }
                        }
                    } else {
                        viewHolderCreateViewHolder = null;
                        break;
                    }
                    if (viewHolderCreateViewHolder != null) {
                        z = true;
                    }
                    arrayList = this.serializer;
                    arrayList2 = this.write;
                    if (viewHolderCreateViewHolder == null) {
                        size = arrayList.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                viewHolder3 = (ViewHolder) arrayList.get(i3);
                                if (viewHolder3.wasReturnedFromScrap() && viewHolder3.getLayoutPosition() == i && !viewHolder3.isInvalid() && (getintrinsicsizenhjbrc.write || !viewHolder3.isRemoved())) {
                                    viewHolder3.addFlags(32);
                                    viewHolderCreateViewHolder = viewHolder3;
                                    break;
                                }
                                i3++;
                            } else {
                                arrayList3 = (ArrayList) recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read;
                                size2 = arrayList3.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size2) {
                                        view = null;
                                        break;
                                    }
                                    view = (View) arrayList3.get(i4);
                                    childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                                    if (childViewHolderInt2.getLayoutPosition() != i && !childViewHolderInt2.isInvalid() && !childViewHolderInt2.isRemoved()) {
                                        break;
                                    }
                                    i4++;
                                }
                                if (view != null) {
                                    childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                                    childHelper = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                    resizegraphicframeifappropriatelambda0 = (resizeGraphicFrameIfAppropriatelambda0) childHelper.write;
                                    iIndexOfChild = RecyclerView.this.indexOfChild(view);
                                    if (iIndexOfChild >= 0) {
                                        if (resizegraphicframeifappropriatelambda0.IconCompatParcelizer(iIndexOfChild)) {
                                            resizegraphicframeifappropriatelambda0.RemoteActionCompatParcelizer(iIndexOfChild);
                                            childHelper.write(view);
                                            ChildHelper childHelper2 = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                            resizegraphicframeifappropriatelambda1 = (resizeGraphicFrameIfAppropriatelambda0) childHelper2.write;
                                            iIndexOfChild2 = RecyclerView.this.indexOfChild(view);
                                            if (iIndexOfChild2 == -1 && !resizegraphicframeifappropriatelambda1.IconCompatParcelizer(iIndexOfChild2)) {
                                                i6 = iIndexOfChild2 - resizegraphicframeifappropriatelambda1.read(iIndexOfChild2);
                                            } else {
                                                i6 = -1;
                                            }
                                            if (i6 != -1) {
                                                recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(i6);
                                                scrapView(view);
                                                childViewHolderInt.addFlags(8224);
                                                viewHolderCreateViewHolder = childViewHolderInt;
                                                break;
                                            }
                                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                            sb.append(childViewHolderInt);
                                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, recyclerView.exceptionLabel());
                                            return null;
                                        }
                                        FieldType$$ExternalSyntheticBUOutline0.IconCompatParcelizer(view, "trying to unhide a view that was not hidden");
                                        return null;
                                    }
                                    Gson$$ExternalSyntheticBUOutline0.m(view, "view is not a child, cannot hide ");
                                    return null;
                                }
                                size3 = arrayList2.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size3) {
                                        viewHolderCreateViewHolder = null;
                                        break;
                                    }
                                    viewHolder2 = (ViewHolder) arrayList2.get(i5);
                                    if (viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i && !viewHolder2.isAttachedToTransitionOverlay()) {
                                        arrayList2.remove(i5);
                                        if (RecyclerView.MediaDescriptionCompat) {
                                            viewHolder2.toString();
                                        }
                                        viewHolderCreateViewHolder = viewHolder2;
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                        if (viewHolderCreateViewHolder != null) {
                            if (viewHolderCreateViewHolder.isRemoved()) {
                                if (!RecyclerView.MediaSessionCompatQueueItem && !getintrinsicsizenhjbrc.write) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("should not receive a removed view unless it is pre layout".concat(recyclerView.exceptionLabel()));
                                    return null;
                                }
                                if (getintrinsicsizenhjbrc.write) {
                                    z = true;
                                } else {
                                    viewHolderCreateViewHolder.addFlags(4);
                                    if (viewHolderCreateViewHolder.isScrap()) {
                                        recyclerView.removeDetachedView(viewHolderCreateViewHolder.MediaSessionCompatQueueItem, false);
                                        viewHolderCreateViewHolder.unScrap();
                                    } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                                        viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                                    }
                                    read(viewHolderCreateViewHolder);
                                    viewHolderCreateViewHolder = null;
                                }
                            } else {
                                i7 = viewHolderCreateViewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                if (i7 < 0 && i7 < recyclerView.MediaSessionCompatResultReceiverWrapper.getItemCount()) {
                                    if ((getintrinsicsizenhjbrc.write || recyclerView.MediaSessionCompatResultReceiverWrapper.getItemViewType(viewHolderCreateViewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) == viewHolderCreateViewHolder.getItemViewType()) && (!recyclerView.MediaSessionCompatResultReceiverWrapper.hasStableIds() || viewHolderCreateViewHolder.getItemId() == recyclerView.MediaSessionCompatResultReceiverWrapper.getItemId(viewHolderCreateViewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus))) {
                                        z = true;
                                    } else {
                                        viewHolderCreateViewHolder.addFlags(4);
                                        if (viewHolderCreateViewHolder.isScrap()) {
                                            recyclerView.removeDetachedView(viewHolderCreateViewHolder.MediaSessionCompatQueueItem, false);
                                            viewHolderCreateViewHolder.unScrap();
                                        } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                                            viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                                        }
                                        read(viewHolderCreateViewHolder);
                                        viewHolderCreateViewHolder = null;
                                    }
                                } else {
                                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolderCreateViewHolder + recyclerView.exceptionLabel());
                                }
                            }
                        }
                    }
                    if (viewHolderCreateViewHolder == null) {
                        i2 = recyclerView.ParcelableVolumeInfo.read(i, 0);
                        if (i2 < 0 && i2 < recyclerView.MediaSessionCompatResultReceiverWrapper.getItemCount()) {
                            int itemViewType2 = recyclerView.MediaSessionCompatResultReceiverWrapper.getItemViewType(i2);
                            if (recyclerView.MediaSessionCompatResultReceiverWrapper.hasStableIds()) {
                                long itemId2 = recyclerView.MediaSessionCompatResultReceiverWrapper.getItemId(i2);
                                int size5 = arrayList.size() - 1;
                                while (true) {
                                    if (size5 >= 0) {
                                        ViewHolder viewHolder5 = (ViewHolder) arrayList.get(size5);
                                        if (viewHolder5.getItemId() == itemId2 && !viewHolder5.wasReturnedFromScrap()) {
                                            if (itemViewType2 == viewHolder5.getItemViewType()) {
                                                viewHolder5.addFlags(32);
                                                if (viewHolder5.isRemoved() && !getintrinsicsizenhjbrc.write) {
                                                    viewHolder5.setFlags(2, 14);
                                                }
                                                viewHolderCreateViewHolder = viewHolder5;
                                                break;
                                            }
                                            arrayList.remove(size5);
                                            recyclerView.removeDetachedView(viewHolder5.MediaSessionCompatQueueItem, false);
                                            ViewHolder childViewHolderInt3 = RecyclerView.getChildViewHolderInt(viewHolder5.MediaSessionCompatQueueItem);
                                            childViewHolderInt3.ResultReceiver = null;
                                            childViewHolderInt3.MediaDescriptionCompat = false;
                                            childViewHolderInt3.clearReturnedFromScrapFlag();
                                            read(childViewHolderInt3);
                                        }
                                        size5--;
                                    } else {
                                        int size6 = arrayList2.size() - 1;
                                        while (true) {
                                            if (size6 >= 0) {
                                                ViewHolder viewHolder6 = (ViewHolder) arrayList2.get(size6);
                                                if (viewHolder6.getItemId() != itemId2 || viewHolder6.isAttachedToTransitionOverlay()) {
                                                    size6--;
                                                } else {
                                                    if (itemViewType2 == viewHolder6.getItemViewType()) {
                                                        arrayList2.remove(size6);
                                                        viewHolderCreateViewHolder = viewHolder6;
                                                        break;
                                                    }
                                                    write(size6);
                                                }
                                            }
                                            viewHolderCreateViewHolder = null;
                                            break;
                                        }
                                    }
                                }
                                if (viewHolderCreateViewHolder != null) {
                                    viewHolderCreateViewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2;
                                    z = true;
                                }
                            }
                            if (viewHolderCreateViewHolder == null) {
                                boolean z5 = RecyclerView.MediaSessionCompatQueueItem;
                                BlockGraphicsLayerModifiermeasure1 blockGraphicsLayerModifiermeasure1 = (BlockGraphicsLayerModifiermeasure1) read().RemoteActionCompatParcelizer.get(itemViewType2);
                                if (blockGraphicsLayerModifiermeasure1 == null) {
                                    viewHolder = null;
                                    break;
                                }
                                ArrayList arrayList5 = blockGraphicsLayerModifiermeasure1.RemoteActionCompatParcelizer;
                                if (!arrayList5.isEmpty()) {
                                    int size7 = arrayList5.size() - 1;
                                    while (true) {
                                        if (size7 < 0) {
                                            viewHolder = null;
                                            break;
                                        }
                                        if (!((ViewHolder) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                            viewHolder = (ViewHolder) arrayList5.remove(size7);
                                            break;
                                        }
                                        size7--;
                                    }
                                } else {
                                    viewHolder = null;
                                    break;
                                }
                                if (viewHolder != null) {
                                    viewHolder.resetInternal();
                                    boolean z6 = RecyclerView.MediaSessionCompatQueueItem;
                                }
                                viewHolderCreateViewHolder = viewHolder;
                            }
                            if (viewHolderCreateViewHolder == null) {
                                long nanoTime2 = recyclerView.getNanoTime();
                                if (j != Long.MAX_VALUE) {
                                    long j4 = this.read.write(itemViewType2).write;
                                    if (j4 != 0 && j4 + nanoTime2 >= j) {
                                        return null;
                                    }
                                }
                                viewHolderCreateViewHolder = recyclerView.MediaSessionCompatResultReceiverWrapper.createViewHolder(recyclerView, itemViewType2);
                                if (RecyclerView.IconCompatParcelizer && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(viewHolderCreateViewHolder.MediaSessionCompatQueueItem)) != null) {
                                    viewHolderCreateViewHolder.ParcelableVolumeInfo = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                                }
                                long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                                BlockGraphicsLayerModifiermeasure1 blockGraphicsLayerModifiermeasure1Write = this.read.write(itemViewType2);
                                long j5 = blockGraphicsLayerModifiermeasure1Write.write;
                                if (j5 != 0) {
                                    nanoTime3 = (nanoTime3 / 4) + ((j5 / 4) * 3);
                                }
                                blockGraphicsLayerModifiermeasure1Write.write = nanoTime3;
                            }
                        } else {
                            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i, i2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                            sbM.append(getintrinsicsizenhjbrc.serializer());
                            sbM.append(recyclerView.exceptionLabel());
                            throw new IndexOutOfBoundsException(sbM.toString());
                        }
                    }
                    if (z && !getintrinsicsizenhjbrc.write && viewHolderCreateViewHolder.hasAnyOfTheFlags(8192)) {
                        viewHolderCreateViewHolder.setFlags(0, 8192);
                        if (getintrinsicsizenhjbrc.ParcelableVolumeInfo) {
                            ItemAnimator.serializer(viewHolderCreateViewHolder);
                            ItemAnimator itemAnimator = recyclerView._init_lambda1;
                            viewHolderCreateViewHolder.getUnmodifiedPayloads();
                            itemAnimator.getClass();
                            InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls = new InfiniteAnimationPolicyDefaultImpls();
                            infiniteAnimationPolicyDefaultImpls.read(viewHolderCreateViewHolder);
                            recyclerView.recordAnimationInfoIfBouncedHiddenView(viewHolderCreateViewHolder, infiniteAnimationPolicyDefaultImpls);
                        }
                    }
                    if (!getintrinsicsizenhjbrc.write && viewHolderCreateViewHolder.isBound()) {
                        viewHolderCreateViewHolder.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
                    } else {
                        if (viewHolderCreateViewHolder.isBound() || viewHolderCreateViewHolder.needsUpdate() || viewHolderCreateViewHolder.isInvalid()) {
                            if (!RecyclerView.MediaSessionCompatQueueItem && viewHolderCreateViewHolder.isRemoved()) {
                                StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                                sb2.append(viewHolderCreateViewHolder);
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb2, recyclerView.exceptionLabel());
                                return null;
                            }
                            int i11 = recyclerView.ParcelableVolumeInfo.read(i, 0);
                            viewHolderCreateViewHolder.MediaBrowserCompatMediaItem = null;
                            viewHolderCreateViewHolder.PlaybackStateCompat = recyclerView;
                            itemViewType = viewHolderCreateViewHolder.getItemViewType();
                            long nanoTime4 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                j3 = this.read.write(itemViewType).serializer;
                                if (j3 != 0 || j3 + nanoTime4 < j) {
                                }
                            }
                            if (viewHolderCreateViewHolder.isTmpDetached()) {
                                recyclerView.attachViewToParent(viewHolderCreateViewHolder.MediaSessionCompatQueueItem, recyclerView.getChildCount(), viewHolderCreateViewHolder.MediaSessionCompatQueueItem.getLayoutParams());
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            recyclerView.MediaSessionCompatResultReceiverWrapper.bindViewHolder(viewHolderCreateViewHolder, i11);
                            if (z2) {
                                recyclerView.detachViewFromParent(viewHolderCreateViewHolder.MediaSessionCompatQueueItem);
                            }
                            nanoTime = recyclerView.getNanoTime() - nanoTime4;
                            BlockGraphicsLayerModifiermeasure1 blockGraphicsLayerModifiermeasure1Write2 = this.read.write(viewHolderCreateViewHolder.getItemViewType());
                            j2 = blockGraphicsLayerModifiermeasure1Write2.serializer;
                            if (j2 != 0) {
                                nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                            }
                            blockGraphicsLayerModifiermeasure1Write2.serializer = nanoTime;
                            accessibilityManager = recyclerView.PlaybackStateCompatCustomAction;
                            if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                                View view2 = viewHolderCreateViewHolder.MediaSessionCompatQueueItem;
                                if (view2.getImportantForAccessibility() == 0) {
                                    z3 = true;
                                    view2.setImportantForAccessibility(1);
                                } else {
                                    z3 = true;
                                }
                                verticalGradient8A3gB4default verticalgradient8a3gb4default = recyclerView.RatingCompat;
                                if (verticalgradient8a3gb4default != null) {
                                    AccessibilityDelegateCompat accessibilityDelegateCompatIconCompatParcelizer = verticalgradient8a3gb4default.IconCompatParcelizer();
                                    if (accessibilityDelegateCompatIconCompatParcelizer instanceof sweepGradientUv8p0NAdefault) {
                                        sweepGradientUv8p0NAdefault sweepgradientuv8p0nadefault = (sweepGradientUv8p0NAdefault) accessibilityDelegateCompatIconCompatParcelizer;
                                        View.AccessibilityDelegate accessibilityDelegateSerializer = FocusPropertiesNode.serializer(view2);
                                        if (accessibilityDelegateSerializer != null) {
                                            if (accessibilityDelegateSerializer instanceof is1dFocusSearch3ESFkO8) {
                                                accessibilityDelegateCompat = ((is1dFocusSearch3ESFkO8) accessibilityDelegateSerializer).RemoteActionCompatParcelizer;
                                            } else {
                                                accessibilityDelegateCompat = new AccessibilityDelegateCompat(accessibilityDelegateSerializer);
                                            }
                                        }
                                        if (accessibilityDelegateCompat != null && accessibilityDelegateCompat != sweepgradientuv8p0nadefault) {
                                            sweepgradientuv8p0nadefault.IconCompatParcelizer.put(view2, accessibilityDelegateCompat);
                                        }
                                    }
                                    FocusPropertiesNode.write(view2, accessibilityDelegateCompatIconCompatParcelizer);
                                }
                            } else {
                                z3 = true;
                            }
                            if (getintrinsicsizenhjbrc.write) {
                                viewHolderCreateViewHolder.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
                            }
                            z4 = z3;
                        }
                        layoutParams = viewHolderCreateViewHolder.MediaSessionCompatQueueItem.getLayoutParams();
                        if (layoutParams == null) {
                            blockGraphicsLayerElement = (BlockGraphicsLayerElement) recyclerView.generateDefaultLayoutParams();
                            viewHolderCreateViewHolder.MediaSessionCompatQueueItem.setLayoutParams(blockGraphicsLayerElement);
                        } else if (!recyclerView.checkLayoutParams(layoutParams)) {
                            blockGraphicsLayerElement = (BlockGraphicsLayerElement) recyclerView.generateLayoutParams(layoutParams);
                            viewHolderCreateViewHolder.MediaSessionCompatQueueItem.setLayoutParams(blockGraphicsLayerElement);
                        } else {
                            blockGraphicsLayerElement = (BlockGraphicsLayerElement) layoutParams;
                        }
                        blockGraphicsLayerElement.MediaMetadataCompat = viewHolderCreateViewHolder;
                        if (z || !z4) {
                            z3 = false;
                        }
                        blockGraphicsLayerElement.read = z3;
                        return viewHolderCreateViewHolder;
                    }
                    z4 = false;
                    z3 = true;
                    layoutParams = viewHolderCreateViewHolder.MediaSessionCompatQueueItem.getLayoutParams();
                    if (layoutParams == null) {
                        blockGraphicsLayerElement = (BlockGraphicsLayerElement) recyclerView.generateDefaultLayoutParams();
                        viewHolderCreateViewHolder.MediaSessionCompatQueueItem.setLayoutParams(blockGraphicsLayerElement);
                    } else if (!recyclerView.checkLayoutParams(layoutParams)) {
                        blockGraphicsLayerElement = (BlockGraphicsLayerElement) recyclerView.generateLayoutParams(layoutParams);
                        viewHolderCreateViewHolder.MediaSessionCompatQueueItem.setLayoutParams(blockGraphicsLayerElement);
                    } else {
                        blockGraphicsLayerElement = (BlockGraphicsLayerElement) layoutParams;
                    }
                    blockGraphicsLayerElement.MediaMetadataCompat = viewHolderCreateViewHolder;
                    if (z) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    blockGraphicsLayerElement.read = z3;
                    return viewHolderCreateViewHolder;
                }
                viewHolderCreateViewHolder = null;
                z = false;
                arrayList = this.serializer;
                arrayList2 = this.write;
                if (viewHolderCreateViewHolder == null) {
                    size = arrayList.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            viewHolder3 = (ViewHolder) arrayList.get(i3);
                            if (viewHolder3.wasReturnedFromScrap()) {
                            }
                            i3++;
                        } else {
                            arrayList3 = (ArrayList) recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read;
                            size2 = arrayList3.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    view = null;
                                    break;
                                }
                                view = (View) arrayList3.get(i4);
                                childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                                if (childViewHolderInt2.getLayoutPosition() != i) {
                                }
                                i4++;
                            }
                            if (view != null) {
                                childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                                childHelper = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                resizegraphicframeifappropriatelambda0 = (resizeGraphicFrameIfAppropriatelambda0) childHelper.write;
                                iIndexOfChild = RecyclerView.this.indexOfChild(view);
                                if (iIndexOfChild >= 0) {
                                    if (resizegraphicframeifappropriatelambda0.IconCompatParcelizer(iIndexOfChild)) {
                                        resizegraphicframeifappropriatelambda0.RemoteActionCompatParcelizer(iIndexOfChild);
                                        childHelper.write(view);
                                        ChildHelper childHelper3 = recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                        resizegraphicframeifappropriatelambda1 = (resizeGraphicFrameIfAppropriatelambda0) childHelper3.write;
                                        iIndexOfChild2 = RecyclerView.this.indexOfChild(view);
                                        if (iIndexOfChild2 == -1) {
                                            i6 = -1;
                                        } else {
                                            i6 = iIndexOfChild2 - resizegraphicframeifappropriatelambda1.read(iIndexOfChild2);
                                        }
                                        if (i6 != -1) {
                                            recyclerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(i6);
                                            scrapView(view);
                                            childViewHolderInt.addFlags(8224);
                                            viewHolderCreateViewHolder = childViewHolderInt;
                                            break;
                                        }
                                        StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                        sb3.append(childViewHolderInt);
                                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb3, recyclerView.exceptionLabel());
                                        return null;
                                    }
                                    FieldType$$ExternalSyntheticBUOutline0.IconCompatParcelizer(view, "trying to unhide a view that was not hidden");
                                    return null;
                                }
                                Gson$$ExternalSyntheticBUOutline0.m(view, "view is not a child, cannot hide ");
                                return null;
                            }
                            size3 = arrayList2.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size3) {
                                    viewHolderCreateViewHolder = null;
                                    break;
                                }
                                viewHolder2 = (ViewHolder) arrayList2.get(i5);
                                if (viewHolder2.isInvalid()) {
                                }
                                i5++;
                            }
                        }
                    }
                    if (viewHolderCreateViewHolder != null) {
                        if (viewHolderCreateViewHolder.isRemoved()) {
                            if (!RecyclerView.MediaSessionCompatQueueItem) {
                            }
                            if (getintrinsicsizenhjbrc.write) {
                                viewHolderCreateViewHolder.addFlags(4);
                                if (viewHolderCreateViewHolder.isScrap()) {
                                    recyclerView.removeDetachedView(viewHolderCreateViewHolder.MediaSessionCompatQueueItem, false);
                                    viewHolderCreateViewHolder.unScrap();
                                } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                                    viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                                }
                                read(viewHolderCreateViewHolder);
                                viewHolderCreateViewHolder = null;
                            } else {
                                z = true;
                            }
                        } else {
                            i7 = viewHolderCreateViewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            if (i7 < 0) {
                            }
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolderCreateViewHolder + recyclerView.exceptionLabel());
                        }
                    }
                }
                if (viewHolderCreateViewHolder == null) {
                    i2 = recyclerView.ParcelableVolumeInfo.read(i, 0);
                    if (i2 < 0) {
                    }
                    StringBuilder sbM2 = m1$$ExternalSyntheticOutline0.m(i, i2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                    sbM2.append(getintrinsicsizenhjbrc.serializer());
                    sbM2.append(recyclerView.exceptionLabel());
                    throw new IndexOutOfBoundsException(sbM2.toString());
                }
                if (z) {
                    viewHolderCreateViewHolder.setFlags(0, 8192);
                    if (getintrinsicsizenhjbrc.ParcelableVolumeInfo) {
                        ItemAnimator.serializer(viewHolderCreateViewHolder);
                        ItemAnimator itemAnimator2 = recyclerView._init_lambda1;
                        viewHolderCreateViewHolder.getUnmodifiedPayloads();
                        itemAnimator2.getClass();
                        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls2 = new InfiniteAnimationPolicyDefaultImpls();
                        infiniteAnimationPolicyDefaultImpls2.read(viewHolderCreateViewHolder);
                        recyclerView.recordAnimationInfoIfBouncedHiddenView(viewHolderCreateViewHolder, infiniteAnimationPolicyDefaultImpls2);
                    }
                }
                if (!getintrinsicsizenhjbrc.write) {
                    if (viewHolderCreateViewHolder.isBound()) {
                        if (!RecyclerView.MediaSessionCompatQueueItem) {
                        }
                        int i12 = recyclerView.ParcelableVolumeInfo.read(i, 0);
                        viewHolderCreateViewHolder.MediaBrowserCompatMediaItem = null;
                        viewHolderCreateViewHolder.PlaybackStateCompat = recyclerView;
                        itemViewType = viewHolderCreateViewHolder.getItemViewType();
                        long nanoTime5 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j3 = this.read.write(itemViewType).serializer;
                            if (j3 != 0) {
                            }
                        }
                        if (viewHolderCreateViewHolder.isTmpDetached()) {
                            recyclerView.attachViewToParent(viewHolderCreateViewHolder.MediaSessionCompatQueueItem, recyclerView.getChildCount(), viewHolderCreateViewHolder.MediaSessionCompatQueueItem.getLayoutParams());
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        recyclerView.MediaSessionCompatResultReceiverWrapper.bindViewHolder(viewHolderCreateViewHolder, i12);
                        if (z2) {
                            recyclerView.detachViewFromParent(viewHolderCreateViewHolder.MediaSessionCompatQueueItem);
                        }
                        nanoTime = recyclerView.getNanoTime() - nanoTime5;
                        BlockGraphicsLayerModifiermeasure1 blockGraphicsLayerModifiermeasure1Write3 = this.read.write(viewHolderCreateViewHolder.getItemViewType());
                        j2 = blockGraphicsLayerModifiermeasure1Write3.serializer;
                        if (j2 != 0) {
                            nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                        }
                        blockGraphicsLayerModifiermeasure1Write3.serializer = nanoTime;
                        accessibilityManager = recyclerView.PlaybackStateCompatCustomAction;
                        if (accessibilityManager == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (getintrinsicsizenhjbrc.write) {
                            viewHolderCreateViewHolder.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
                        }
                        z4 = z3;
                    } else {
                        if (!RecyclerView.MediaSessionCompatQueueItem) {
                        }
                        int i13 = recyclerView.ParcelableVolumeInfo.read(i, 0);
                        viewHolderCreateViewHolder.MediaBrowserCompatMediaItem = null;
                        viewHolderCreateViewHolder.PlaybackStateCompat = recyclerView;
                        itemViewType = viewHolderCreateViewHolder.getItemViewType();
                        long nanoTime6 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j3 = this.read.write(itemViewType).serializer;
                            if (j3 != 0) {
                            }
                        }
                        if (viewHolderCreateViewHolder.isTmpDetached()) {
                            recyclerView.attachViewToParent(viewHolderCreateViewHolder.MediaSessionCompatQueueItem, recyclerView.getChildCount(), viewHolderCreateViewHolder.MediaSessionCompatQueueItem.getLayoutParams());
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        recyclerView.MediaSessionCompatResultReceiverWrapper.bindViewHolder(viewHolderCreateViewHolder, i13);
                        if (z2) {
                            recyclerView.detachViewFromParent(viewHolderCreateViewHolder.MediaSessionCompatQueueItem);
                        }
                        nanoTime = recyclerView.getNanoTime() - nanoTime6;
                        BlockGraphicsLayerModifiermeasure1 blockGraphicsLayerModifiermeasure1Write4 = this.read.write(viewHolderCreateViewHolder.getItemViewType());
                        j2 = blockGraphicsLayerModifiermeasure1Write4.serializer;
                        if (j2 != 0) {
                            nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                        }
                        blockGraphicsLayerModifiermeasure1Write4.serializer = nanoTime;
                        accessibilityManager = recyclerView.PlaybackStateCompatCustomAction;
                        if (accessibilityManager == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (getintrinsicsizenhjbrc.write) {
                            viewHolderCreateViewHolder.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
                        }
                        z4 = z3;
                    }
                } else if (viewHolderCreateViewHolder.isBound()) {
                    if (!RecyclerView.MediaSessionCompatQueueItem) {
                    }
                    int i14 = recyclerView.ParcelableVolumeInfo.read(i, 0);
                    viewHolderCreateViewHolder.MediaBrowserCompatMediaItem = null;
                    viewHolderCreateViewHolder.PlaybackStateCompat = recyclerView;
                    itemViewType = viewHolderCreateViewHolder.getItemViewType();
                    long nanoTime7 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j3 = this.read.write(itemViewType).serializer;
                        if (j3 != 0) {
                        }
                    }
                    if (viewHolderCreateViewHolder.isTmpDetached()) {
                        recyclerView.attachViewToParent(viewHolderCreateViewHolder.MediaSessionCompatQueueItem, recyclerView.getChildCount(), viewHolderCreateViewHolder.MediaSessionCompatQueueItem.getLayoutParams());
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    recyclerView.MediaSessionCompatResultReceiverWrapper.bindViewHolder(viewHolderCreateViewHolder, i14);
                    if (z2) {
                        recyclerView.detachViewFromParent(viewHolderCreateViewHolder.MediaSessionCompatQueueItem);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime7;
                    BlockGraphicsLayerModifiermeasure1 blockGraphicsLayerModifiermeasure1Write5 = this.read.write(viewHolderCreateViewHolder.getItemViewType());
                    j2 = blockGraphicsLayerModifiermeasure1Write5.serializer;
                    if (j2 != 0) {
                        nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                    }
                    blockGraphicsLayerModifiermeasure1Write5.serializer = nanoTime;
                    accessibilityManager = recyclerView.PlaybackStateCompatCustomAction;
                    if (accessibilityManager == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (getintrinsicsizenhjbrc.write) {
                        viewHolderCreateViewHolder.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
                    }
                    z4 = z3;
                } else {
                    if (!RecyclerView.MediaSessionCompatQueueItem) {
                    }
                    int i15 = recyclerView.ParcelableVolumeInfo.read(i, 0);
                    viewHolderCreateViewHolder.MediaBrowserCompatMediaItem = null;
                    viewHolderCreateViewHolder.PlaybackStateCompat = recyclerView;
                    itemViewType = viewHolderCreateViewHolder.getItemViewType();
                    long nanoTime8 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j3 = this.read.write(itemViewType).serializer;
                        if (j3 != 0) {
                        }
                    }
                    if (viewHolderCreateViewHolder.isTmpDetached()) {
                        recyclerView.attachViewToParent(viewHolderCreateViewHolder.MediaSessionCompatQueueItem, recyclerView.getChildCount(), viewHolderCreateViewHolder.MediaSessionCompatQueueItem.getLayoutParams());
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    recyclerView.MediaSessionCompatResultReceiverWrapper.bindViewHolder(viewHolderCreateViewHolder, i15);
                    if (z2) {
                        recyclerView.detachViewFromParent(viewHolderCreateViewHolder.MediaSessionCompatQueueItem);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime8;
                    BlockGraphicsLayerModifiermeasure1 blockGraphicsLayerModifiermeasure1Write6 = this.read.write(viewHolderCreateViewHolder.getItemViewType());
                    j2 = blockGraphicsLayerModifiermeasure1Write6.serializer;
                    if (j2 != 0) {
                        nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                    }
                    blockGraphicsLayerModifiermeasure1Write6.serializer = nanoTime;
                    accessibilityManager = recyclerView.PlaybackStateCompatCustomAction;
                    if (accessibilityManager == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (getintrinsicsizenhjbrc.write) {
                        viewHolderCreateViewHolder.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
                    }
                    z4 = z3;
                }
                layoutParams = viewHolderCreateViewHolder.MediaSessionCompatQueueItem.getLayoutParams();
                if (layoutParams == null) {
                    blockGraphicsLayerElement = (BlockGraphicsLayerElement) recyclerView.generateDefaultLayoutParams();
                    viewHolderCreateViewHolder.MediaSessionCompatQueueItem.setLayoutParams(blockGraphicsLayerElement);
                } else if (!recyclerView.checkLayoutParams(layoutParams)) {
                    blockGraphicsLayerElement = (BlockGraphicsLayerElement) recyclerView.generateLayoutParams(layoutParams);
                    viewHolderCreateViewHolder.MediaSessionCompatQueueItem.setLayoutParams(blockGraphicsLayerElement);
                } else {
                    blockGraphicsLayerElement = (BlockGraphicsLayerElement) layoutParams;
                }
                blockGraphicsLayerElement.MediaMetadataCompat = viewHolderCreateViewHolder;
                if (z) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                blockGraphicsLayerElement.read = z3;
                return viewHolderCreateViewHolder;
            }
            StringBuilder sbM3 = m1$$ExternalSyntheticOutline0.m(i, i, "Invalid item position ", "(", "). Item count:");
            sbM3.append(getintrinsicsizenhjbrc.serializer());
            sbM3.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM3.toString());
        }

        public final isImportantForBounds read() {
            if (this.read == null) {
                isImportantForBounds isimportantforbounds = new isImportantForBounds();
                isimportantforbounds.RemoteActionCompatParcelizer = new SparseArray();
                isimportantforbounds.read = 0;
                isimportantforbounds.IconCompatParcelizer = Collections.newSetFromMap(new IdentityHashMap());
                this.read = isimportantforbounds;
                maybeSendPoolingContainerAttach();
            }
            return this.read;
        }

        public final void scrapView(View view) {
            ItemAnimator itemAnimator;
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && (itemAnimator = recyclerView._init_lambda1) != null) {
                accessgetSoftlightcp accessgetsoftlightcp = (accessgetSoftlightcp) itemAnimator;
                if (childViewHolderInt.getUnmodifiedPayloads().isEmpty() && accessgetsoftlightcp.PlaybackStateCompatCustomAction && !childViewHolderInt.isInvalid()) {
                    if (this.IconCompatParcelizer == null) {
                        this.IconCompatParcelizer = new ArrayList();
                    }
                    childViewHolderInt.setScrapContainer(this, true);
                    this.IconCompatParcelizer.add(childViewHolderInt);
                    return;
                }
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.MediaSessionCompatResultReceiverWrapper.hasStableIds()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.exceptionLabel()));
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.serializer.add(childViewHolderInt);
            }
        }
    }

    public final class ViewFlinger implements Runnable {
        public boolean IconCompatParcelizer;
        public boolean RatingCompat;
        public int RemoteActionCompatParcelizer;
        public Interpolator read;
        public int serializer;
        public OverScroller write;

        public final void read(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.RemoteActionCompatParcelizer = 0;
            this.serializer = 0;
            Interpolator interpolator = this.read;
            getSrcOut0nO6VwU getsrcout0no6vwu = RecyclerView.MediaBrowserCompatMediaItem;
            if (interpolator != getsrcout0no6vwu) {
                this.read = getsrcout0no6vwu;
                this.write = new OverScroller(recyclerView.getContext(), getsrcout0no6vwu);
            }
            this.write.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            serializer();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            int[] iArr = recyclerView.getNavigationEventDispatcher;
            if (recyclerView.fullyDrawnReporter_delegatelambda00 == null) {
                recyclerView.removeCallbacks(this);
                this.write.abortAnimation();
                return;
            }
            this.RatingCompat = false;
            this.IconCompatParcelizer = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.write;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = this.serializer;
                int i7 = this.RemoteActionCompatParcelizer;
                this.serializer = currX;
                this.RemoteActionCompatParcelizer = currY;
                int iConsumeFlingInStretch = RecyclerView.consumeFlingInStretch(currX - i6, recyclerView.onBackPressedInput_delegatelambda0, recyclerView.getViewModelStore, recyclerView.getWidth());
                int iConsumeFlingInStretch2 = RecyclerView.consumeFlingInStretch(currY - i7, recyclerView.onCreate, recyclerView.MediaSessionCompatToken, recyclerView.getHeight());
                int[] iArr2 = recyclerView.getNavigationEventDispatcher;
                iArr2[0] = 0;
                iArr2[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(iArr2, iConsumeFlingInStretch, null, iConsumeFlingInStretch2, 1)) {
                    iConsumeFlingInStretch -= iArr[0];
                    iConsumeFlingInStretch2 -= iArr[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInStretch, iConsumeFlingInStretch2);
                }
                if (recyclerView.MediaSessionCompatResultReceiverWrapper != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    recyclerView.scrollStep(iArr, iConsumeFlingInStretch, iConsumeFlingInStretch2);
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    int i10 = iConsumeFlingInStretch2 - i9;
                    LinearSmoothScroller linearSmoothScroller = recyclerView.fullyDrawnReporter_delegatelambda00.addObserverForBackInvoker;
                    if (linearSmoothScroller != null && !linearSmoothScroller.MediaMetadataCompat && linearSmoothScroller.PlaybackStateCompat) {
                        int iSerializer = recyclerView.onCreatePanelMenu.serializer();
                        if (iSerializer == 0) {
                            linearSmoothScroller.RemoteActionCompatParcelizer();
                        } else if (linearSmoothScroller.MediaSessionCompatResultReceiverWrapper >= iSerializer) {
                            linearSmoothScroller.MediaSessionCompatResultReceiverWrapper = iSerializer - 1;
                            linearSmoothScroller.onAnimation(i8, i9);
                        } else {
                            linearSmoothScroller.onAnimation(i8, i9);
                        }
                    }
                    i4 = i8;
                    i = iConsumeFlingInStretch - i8;
                    i2 = i10;
                    i3 = i9;
                } else {
                    i = iConsumeFlingInStretch;
                    i2 = iConsumeFlingInStretch2;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.addObserverForBackInvokerlambda0.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.getNavigationEventDispatcher;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i11 = i3;
                recyclerView.dispatchNestedScroll(i4, i3, i, i2, null, 1, iArr3);
                int i12 = i - iArr[0];
                int i13 = i2 - iArr[1];
                if (i4 != 0 || i11 != 0) {
                    recyclerView.dispatchOnScrolled(i4, i11);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                LinearSmoothScroller linearSmoothScroller2 = recyclerView.fullyDrawnReporter_delegatelambda00.addObserverForBackInvoker;
                if ((linearSmoothScroller2 == null || !linearSmoothScroller2.MediaMetadataCompat) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i12 < 0) {
                            i5 = -currVelocity;
                        } else {
                            i5 = i12 > 0 ? currVelocity : 0;
                        }
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        if (i5 < 0) {
                            recyclerView.ensureLeftGlow();
                            if (recyclerView.onBackPressedInput_delegatelambda0.isFinished()) {
                                recyclerView.onBackPressedInput_delegatelambda0.onAbsorb(-i5);
                            }
                        } else if (i5 > 0) {
                            recyclerView.ensureRightGlow();
                            if (recyclerView.getViewModelStore.isFinished()) {
                                recyclerView.getViewModelStore.onAbsorb(i5);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.ensureTopGlow();
                            if (recyclerView.onCreate.isFinished()) {
                                recyclerView.onCreate.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.ensureBottomGlow();
                            if (recyclerView.MediaSessionCompatToken.isFinished()) {
                                recyclerView.MediaSessionCompatToken.onAbsorb(currVelocity);
                            }
                        }
                        if (i5 != 0 || currVelocity != 0) {
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.IconCompatParcelizer) {
                        isActive isactive = recyclerView.getDefaultViewModelCreationExtras;
                        int[] iArr4 = (int[]) isactive.RemoteActionCompatParcelizer;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        isactive.read = 0;
                    }
                } else {
                    serializer();
                    GapWorker gapWorker = recyclerView.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    if (gapWorker != null) {
                        gapWorker.postFromTraversal(recyclerView, i4, i11);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    createBlendModeColorFilter.RemoteActionCompatParcelizer(recyclerView, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            LinearSmoothScroller linearSmoothScroller3 = recyclerView.fullyDrawnReporter_delegatelambda00.addObserverForBackInvoker;
            if (linearSmoothScroller3 != null && linearSmoothScroller3.MediaMetadataCompat) {
                linearSmoothScroller3.onAnimation(0, 0);
            }
            this.IconCompatParcelizer = false;
            if (!this.RatingCompat) {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                recyclerView.postOnAnimation(this);
            }
        }

        public ViewFlinger() {
            getSrcOut0nO6VwU getsrcout0no6vwu = RecyclerView.MediaBrowserCompatMediaItem;
            this.read = getsrcout0no6vwu;
            this.IconCompatParcelizer = false;
            this.RatingCompat = false;
            this.write = new OverScroller(RecyclerView.this.getContext(), getsrcout0no6vwu);
        }

        public final void write(int i, int i2, int i3, Interpolator interpolator) {
            int height;
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                if (z) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / height) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.MediaBrowserCompatMediaItem;
            }
            if (this.read != interpolator) {
                this.read = interpolator;
                this.write = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.RemoteActionCompatParcelizer = 0;
            this.serializer = 0;
            recyclerView.setScrollState(2);
            this.write.startScroll(0, 0, i, i2, i4);
            serializer();
        }

        public final void serializer() {
            if (this.IconCompatParcelizer) {
                this.RatingCompat = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            recyclerView.postOnAnimation(this);
        }
    }

    public abstract class ViewHolder {
        private static final List<Object> IconCompatParcelizer = Collections.EMPTY_LIST;
        Adapter MediaBrowserCompatMediaItem;
        int MediaMetadataCompat;
        public final View MediaSessionCompatQueueItem;
        WeakReference<RecyclerView> ParcelableVolumeInfo;
        RecyclerView PlaybackStateCompat;
        int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
        int MediaSessionCompatToken = -1;
        long RatingCompat = -1;
        int PlaybackStateCompatCustomAction = -1;
        int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = -1;
        ViewHolder r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        ViewHolder r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
        List<Object> MediaSessionCompatResultReceiverWrapper = null;
        List<Object> r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
        private int read = 0;
        Recycler ResultReceiver = null;
        boolean MediaDescriptionCompat = false;
        private int RemoteActionCompatParcelizer = 0;
        int ComponentActivity = -1;

        public void clearOldPosition() {
            this.MediaSessionCompatToken = -1;
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = -1;
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter getBindingAdapter() {
            return this.MediaBrowserCompatMediaItem;
        }

        public final long getItemId() {
            return this.RatingCompat;
        }

        public final int getItemViewType() {
            return this.PlaybackStateCompatCustomAction;
        }

        public final int getOldPosition() {
            return this.MediaSessionCompatToken;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.MediaMetadataCompat) != 0;
        }

        public boolean isBound() {
            return (this.MediaMetadataCompat & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.MediaMetadataCompat & 4) != 0;
        }

        public boolean isRemoved() {
            return (this.MediaMetadataCompat & 8) != 0;
        }

        public boolean isScrap() {
            return this.ResultReceiver != null;
        }

        public boolean isTmpDetached() {
            return (this.MediaMetadataCompat & Fields.RotationX) != 0;
        }

        public boolean isUpdated() {
            return (this.MediaMetadataCompat & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.MediaMetadataCompat & 2) != 0;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.MediaMetadataCompat & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.MediaMetadataCompat & Fields.SpotShadowColor) != 0;
        }

        public boolean wasReturnedFromScrap() {
            return (this.MediaMetadataCompat & 32) != 0;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.MediaSessionCompatQueueItem.getParent() == null || this.MediaSessionCompatQueueItem.getParent() == this.PlaybackStateCompat) ? false : true;
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i = this.RemoteActionCompatParcelizer;
            if (recyclerView.isComputingLayout()) {
                this.ComponentActivity = i;
                recyclerView.addOnTrimMemoryListener.add(this);
            } else {
                this.MediaSessionCompatQueueItem.setImportantForAccessibility(i);
            }
            this.RemoteActionCompatParcelizer = 0;
        }

        public void setScrapContainer(Recycler recycler, boolean z) {
            this.ResultReceiver = recycler;
            this.MediaDescriptionCompat = z;
        }

        public void unScrap() {
            this.ResultReceiver.serializer(this);
        }

        public void addFlags(int i) {
            this.MediaMetadataCompat = i | this.MediaMetadataCompat;
        }

        public ViewHolder(View view) {
            if (view != null) {
                this.MediaSessionCompatQueueItem = view;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("itemView may not be null");
                throw null;
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(Fields.RotationZ);
                return;
            }
            if ((1024 & this.MediaMetadataCompat) == 0) {
                if (this.MediaSessionCompatResultReceiverWrapper == null) {
                    ArrayList arrayList = new ArrayList();
                    this.MediaSessionCompatResultReceiverWrapper = arrayList;
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Collections.unmodifiableList(arrayList);
                }
                this.MediaSessionCompatResultReceiverWrapper.add(obj);
            }
        }

        public void clearPayload() {
            List<Object> list = this.MediaSessionCompatResultReceiverWrapper;
            if (list != null) {
                list.clear();
            }
            this.MediaMetadataCompat &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.MediaMetadataCompat &= -33;
        }

        public void clearTmpDetachFlag() {
            this.MediaMetadataCompat &= -257;
        }

        public void resetInternal() {
            if (RecyclerView.MediaSessionCompatQueueItem && isTmpDetached()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Attempting to reset temp-detached ViewHolder: ", this, ". ViewHolders should be fully detached before resetting.");
                return;
            }
            this.MediaMetadataCompat = 0;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
            this.MediaSessionCompatToken = -1;
            this.RatingCompat = -1L;
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = -1;
            this.read = 0;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
            clearPayload();
            this.RemoteActionCompatParcelizer = 0;
            this.ComponentActivity = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void stopIgnoring() {
            this.MediaMetadataCompat &= -129;
        }

        public String toString() {
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbM.append(Integer.toHexString(hashCode()));
            sbM.append(" position=");
            sbM.append(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            sbM.append(" id=");
            sbM.append(this.RatingCompat);
            sbM.append(", oldPos=");
            sbM.append(this.MediaSessionCompatToken);
            sbM.append(", pLpos:");
            sbM.append(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
            StringBuilder sb = new StringBuilder(sbM.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.MediaDescriptionCompat ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.read + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.MediaSessionCompatQueueItem.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final int getLayoutPosition() {
            int i = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            return i == -1 ? this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus : i;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            return i == -1 ? this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus : i;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.MediaSessionCompatToken == -1) {
                this.MediaSessionCompatToken = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            }
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == -1) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            }
            if (z) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY += i;
            }
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus += i;
            if (this.MediaSessionCompatQueueItem.getLayoutParams() != null) {
                ((BlockGraphicsLayerElement) this.MediaSessionCompatQueueItem.getLayoutParams()).IconCompatParcelizer = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.ComponentActivity;
            if (i != -1) {
                this.RemoteActionCompatParcelizer = i;
            } else {
                this.RemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.getImportantForAccessibility();
            }
            if (!recyclerView.isComputingLayout()) {
                this.MediaSessionCompatQueueItem.setImportantForAccessibility(4);
            } else {
                this.ComponentActivity = 4;
                recyclerView.addOnTrimMemoryListener.add(this);
            }
        }

        public void saveOldPosition() {
            if (this.MediaSessionCompatToken == -1) {
                this.MediaSessionCompatToken = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            }
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.MediaMetadataCompat & 16) != 0) {
                return false;
            }
            View view = this.MediaSessionCompatQueueItem;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            return view.hasTransientState();
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.PlaybackStateCompat;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.MediaBrowserCompatMediaItem == null || (recyclerView = this.PlaybackStateCompat) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.PlaybackStateCompat.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.MediaBrowserCompatMediaItem, this, adapterPositionInRecyclerView);
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.MediaMetadataCompat & Fields.RotationZ) != 0) {
                return IconCompatParcelizer;
            }
            List<Object> list = this.MediaSessionCompatResultReceiverWrapper;
            return (list == null || list.size() == 0) ? IconCompatParcelizer : this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.MediaMetadataCompat & Fields.RotationY) != 0 || isInvalid();
        }

        public final boolean isRecyclable() {
            if ((this.MediaMetadataCompat & 16) != 0) {
                return false;
            }
            View view = this.MediaSessionCompatQueueItem;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            return !view.hasTransientState();
        }

        public void setFlags(int i, int i2) {
            this.MediaMetadataCompat = (i & i2) | ((~i2) & this.MediaMetadataCompat);
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.read;
            int i2 = z ? i - 1 : i + 1;
            this.read = i2;
            if (i2 < 0) {
                this.read = 0;
                if (RecyclerView.MediaSessionCompatQueueItem) {
                    FieldType$$ExternalSyntheticBUOutline0.IconCompatParcelizer(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                    return;
                } else {
                    SentryLogcatAdapter.serializer("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z && i2 == 1) {
                this.MediaMetadataCompat |= 16;
            } else if (z && i2 == 0) {
                this.MediaMetadataCompat &= -17;
            }
            if (RecyclerView.MediaDescriptionCompat) {
                toString();
            }
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        MediaSessionCompatQueueItem = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        MediaDescriptionCompat = z;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public Adapter getAdapter() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.ComponentActivity;
    }

    public verticalGradient8A3gB4default getCompatAccessibilityDelegate() {
        return this.RatingCompat;
    }

    public BlendModeColorFilterHelper getEdgeEffectFactory() {
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    }

    public ItemAnimator getItemAnimator() {
        return this._init_lambda1;
    }

    public LayoutManager getLayoutManager() {
        return this.fullyDrawnReporter_delegatelambda00;
    }

    public int getMaxFlingVelocity() {
        return this.onBackPressedDispatcher_delegatelambda010;
    }

    public int getMinFlingVelocity() {
        return this.addOnMultiWindowModeChangedListener;
    }

    public getLayerBlock getOnFlingListener() {
        return this.addOnPictureInPictureUiStateChangedListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.getActivityResultRegistry;
    }

    public int getScrollState() {
        return this.onConfigurationChanged;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.accessensureViewModelStore;
    }

    public final boolean isComputingLayout() {
        return this.menuHostHelperlambda0 > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.addContentView;
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        Adapter adapter2 = this.MediaSessionCompatResultReceiverWrapper;
        invalidateLayerBlock invalidatelayerblock = this.addOnConfigurationChangedListener;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(invalidatelayerblock);
            this.MediaSessionCompatResultReceiverWrapper.onDetachedFromRecyclerView(this);
        }
        ItemAnimator itemAnimator = this._init_lambda1;
        if (itemAnimator != null) {
            itemAnimator.serializer();
        }
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        Recycler recycler = this.getLastCustomNonConfigurationInstance;
        if (layoutManager != null) {
            layoutManager.write(recycler);
            this.fullyDrawnReporter_delegatelambda00.read(recycler);
        }
        recycler.serializer.clear();
        recycler.IconCompatParcelizer();
        accessgetModulatecp accessgetmodulatecp = this.ParcelableVolumeInfo;
        accessgetmodulatecp.read((ArrayList) accessgetmodulatecp.write);
        accessgetmodulatecp.read((ArrayList) accessgetmodulatecp.read);
        accessgetmodulatecp.IconCompatParcelizer = 0;
        Adapter adapter3 = this.MediaSessionCompatResultReceiverWrapper;
        this.MediaSessionCompatResultReceiverWrapper = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(invalidatelayerblock);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager2 = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager2 != null) {
            layoutManager2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        }
        Adapter adapter4 = this.MediaSessionCompatResultReceiverWrapper;
        recycler.serializer.clear();
        recycler.IconCompatParcelizer();
        recycler.read(adapter3, true);
        isImportantForBounds isimportantforbounds = recycler.read();
        if (adapter3 != null) {
            isimportantforbounds.read--;
        }
        if (isimportantforbounds.read == 0) {
            SparseArray sparseArray = isimportantforbounds.RemoteActionCompatParcelizer;
            for (int i = 0; i < sparseArray.size(); i++) {
                BlockGraphicsLayerModifiermeasure1 blockGraphicsLayerModifiermeasure1 = (BlockGraphicsLayerModifiermeasure1) sparseArray.valueAt(i);
                Iterator it = blockGraphicsLayerModifiermeasure1.RemoteActionCompatParcelizer.iterator();
                while (it.hasNext()) {
                    Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1890765613, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{((ViewHolder) it.next()).MediaSessionCompatQueueItem}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1890765614);
                }
                blockGraphicsLayerModifiermeasure1.RemoteActionCompatParcelizer.clear();
            }
        }
        if (adapter4 != null) {
            isimportantforbounds.read++;
        }
        recycler.maybeSendPoolingContainerAttach();
        this.onCreatePanelMenu.PlaybackStateCompatCustomAction = true;
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setHasFixedSize(boolean z) {
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = z;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setOnFlingListener(getLayerBlock getlayerblock) {
        this.addOnPictureInPictureUiStateChangedListener = getlayerblock;
    }

    @Deprecated
    public void setOnScrollListener(BlurEffect blurEffect) {
        this.getLifecycle = blurEffect;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.getActivityResultRegistry = z;
    }

    @Deprecated
    public void setRecyclerListener(setLayerBlock setlayerblock) {
    }

    public final void stopScroll() {
        LinearSmoothScroller linearSmoothScroller;
        setScrollState(0);
        ViewFlinger viewFlinger = this.onPreparePanel;
        RecyclerView.this.removeCallbacks(viewFlinger);
        viewFlinger.write.abortAnimation();
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager == null || (linearSmoothScroller = layoutManager.addObserverForBackInvoker) == null) {
            return;
        }
        linearSmoothScroller.RemoteActionCompatParcelizer();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Brush();
        public Parcelable write;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.write, 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.write = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public final void addAnimatingView(ViewHolder viewHolder) {
        View view = viewHolder.MediaSessionCompatQueueItem;
        boolean z = view.getParent() == this;
        this.getLastCustomNonConfigurationInstance.serializer(getChildViewHolder(view));
        boolean zIsTmpDetached = viewHolder.isTmpDetached();
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (zIsTmpDetached) {
            childHelper.IconCompatParcelizer(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            childHelper.addView(view, -1, true);
            return;
        }
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild < 0) {
            Gson$$ExternalSyntheticBUOutline0.m(view, "view is not a child, cannot hide ");
        } else {
            ((resizeGraphicFrameIfAppropriatelambda0) childHelper.write).serializer(iIndexOfChild);
            childHelper.serializer(view);
        }
    }

    public final void clearOldPositions() {
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iWrite = childHelper.write();
        for (int i = 0; i < iWrite; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(childHelper.write(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        Recycler recycler = this.getLastCustomNonConfigurationInstance;
        ArrayList arrayList = recycler.serializer;
        ArrayList arrayList2 = recycler.write;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ViewHolder) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ViewHolder) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = recycler.IconCompatParcelizer;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((ViewHolder) recycler.IconCompatParcelizer.get(i4)).clearOldPosition();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x032c  */
    /* JADX WARN: Code duplicated, block: B:183:0x037a  */
    /* JADX WARN: Code duplicated, block: B:185:0x037d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0395  */
    /* JADX WARN: Code duplicated, block: B:193:0x039b  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:205:0x03bb A[LOOP:4: B:198:0x03a7->B:205:0x03bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:211:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:214:0x03d8 A[LOOP:5: B:207:0x03c4->B:214:0x03d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:246:0x03be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x03be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03db A[EDGE_INSN: B:249:0x03db->B:215:0x03db BREAK  A[LOOP:5: B:207:0x03c4->B:214:0x03d8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x03d5 A[SYNTHETIC] */
    public final void dispatchLayout() {
        ViewHolder viewHolder;
        int i;
        int iSerializer;
        int i2;
        int iMin;
        ViewHolder viewHolderFindViewHolderForAdapterPosition;
        ViewHolder viewHolderFindViewHolderForAdapterPosition2;
        int i3;
        View viewFindViewById;
        processDragGesture processdraggesture;
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls;
        int i4;
        if (this.MediaSessionCompatResultReceiverWrapper == null) {
            SentryLogcatAdapter.IconCompatParcelizer("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.fullyDrawnReporter_delegatelambda00 == null) {
            SentryLogcatAdapter.serializer("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = this.onCreatePanelMenu;
        getintrinsicsizenhjbrc.RatingCompat = false;
        int i5 = 1;
        boolean z = this.getSavedStateRegistryControllerannotations && !(this.createFullyDrawnExecutor == getWidth() && this.defaultViewModelProviderFactory_delegatelambda0 == getHeight());
        this.createFullyDrawnExecutor = 0;
        this.defaultViewModelProviderFactory_delegatelambda0 = 0;
        this.getSavedStateRegistryControllerannotations = false;
        if (getintrinsicsizenhjbrc.MediaMetadataCompat == 1) {
            dispatchLayoutStep1();
            this.fullyDrawnReporter_delegatelambda00.RemoteActionCompatParcelizer(this);
            dispatchLayoutStep2();
        } else {
            accessgetModulatecp accessgetmodulatecp = this.ParcelableVolumeInfo;
            if ((((ArrayList) accessgetmodulatecp.read).isEmpty() || ((ArrayList) accessgetmodulatecp.write).isEmpty()) && !z && this.fullyDrawnReporter_delegatelambda00.menuHostHelperlambda0 == getWidth() && this.fullyDrawnReporter_delegatelambda00.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == getHeight()) {
                this.fullyDrawnReporter_delegatelambda00.RemoteActionCompatParcelizer(this);
            } else {
                this.fullyDrawnReporter_delegatelambda00.RemoteActionCompatParcelizer(this);
                dispatchLayoutStep2();
            }
        }
        getintrinsicsizenhjbrc.RemoteActionCompatParcelizer(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        getintrinsicsizenhjbrc.MediaMetadataCompat = 1;
        boolean z2 = getintrinsicsizenhjbrc.ParcelableVolumeInfo;
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        Recycler recycler = this.getLastCustomNonConfigurationInstance;
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.onRetainNonConfigurationInstance;
        if (z2) {
            int iIconCompatParcelizer = childHelper.IconCompatParcelizer() - 1;
            while (iIconCompatParcelizer >= 0) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(childHelper.serializer(iIconCompatParcelizer));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this._init_lambda1.getClass();
                    InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls2 = new InfiniteAnimationPolicyDefaultImpls();
                    infiniteAnimationPolicyDefaultImpls2.read(childViewHolderInt);
                    ContextMenuSpec contextMenuSpec = (ContextMenuSpec) verticalgradient8a3gb4.RemoteActionCompatParcelizer;
                    processDragGesture processdraggesture2 = (processDragGesture) verticalgradient8a3gb4.read;
                    ViewHolder viewHolder2 = (ViewHolder) contextMenuSpec.write(changedHolderKey);
                    if (viewHolder2 == null || viewHolder2.shouldIgnore()) {
                        verticalgradient8a3gb4.IconCompatParcelizer(childViewHolderInt, infiniteAnimationPolicyDefaultImpls2);
                    } else {
                        linearGradientmHitzGk lineargradientmhitzgk = (linearGradientmHitzGk) processdraggesture2.get(viewHolder2);
                        int i6 = (lineargradientmhitzgk == null || (lineargradientmhitzgk.serializer & i5) == 0) ? 0 : i5;
                        linearGradientmHitzGk lineargradientmhitzgk2 = (linearGradientmHitzGk) processdraggesture2.get(childViewHolderInt);
                        int i7 = (lineargradientmhitzgk2 == null || (lineargradientmhitzgk2.serializer & i5) == 0) ? 0 : i5;
                        if (i6 == 0 || viewHolder2 != childViewHolderInt) {
                            InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsWrite = verticalgradient8a3gb4.write(viewHolder2, 4);
                            verticalgradient8a3gb4.IconCompatParcelizer(childViewHolderInt, infiniteAnimationPolicyDefaultImpls2);
                            InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsWrite2 = verticalgradient8a3gb4.write(childViewHolderInt, 8);
                            if (infiniteAnimationPolicyDefaultImplsWrite == null) {
                                int iIconCompatParcelizer2 = childHelper.IconCompatParcelizer();
                                for (int i8 = 0; i8 < iIconCompatParcelizer2; i8++) {
                                    ViewHolder childViewHolderInt2 = getChildViewHolderInt(childHelper.serializer(i8));
                                    if (childViewHolderInt2 != childViewHolderInt && getChangedHolderKey(childViewHolderInt2) == changedHolderKey) {
                                        Adapter adapter = this.MediaSessionCompatResultReceiverWrapper;
                                        if (adapter == null || !adapter.hasStableIds()) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(childViewHolderInt2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(childViewHolderInt);
                                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, exceptionLabel());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(childViewHolderInt2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(childViewHolderInt);
                                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb2, exceptionLabel());
                                        return;
                                    }
                                }
                                SentryLogcatAdapter.serializer("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder2 + " cannot be found but it is necessary for " + childViewHolderInt + exceptionLabel());
                            } else {
                                viewHolder2.setIsRecyclable(false);
                                if (i6 != 0) {
                                    addAnimatingView(viewHolder2);
                                }
                                if (viewHolder2 != childViewHolderInt) {
                                    if (i7 != 0) {
                                        addAnimatingView(childViewHolderInt);
                                    }
                                    viewHolder2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = childViewHolderInt;
                                    addAnimatingView(viewHolder2);
                                    recycler.serializer(viewHolder2);
                                    childViewHolderInt.setIsRecyclable(false);
                                    childViewHolderInt.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = viewHolder2;
                                }
                                if (this._init_lambda1.read(viewHolder2, childViewHolderInt, infiniteAnimationPolicyDefaultImplsWrite, infiniteAnimationPolicyDefaultImplsWrite2)) {
                                    postAnimationRunner();
                                }
                            }
                        } else {
                            verticalgradient8a3gb4.IconCompatParcelizer(childViewHolderInt, infiniteAnimationPolicyDefaultImpls2);
                        }
                    }
                }
                iIconCompatParcelizer--;
                i5 = 1;
            }
            processDragGesture processdraggesture3 = (processDragGesture) verticalgradient8a3gb4.read;
            int i9 = processdraggesture3.MediaMetadataCompat - 1;
            while (i9 >= 0) {
                ViewHolder viewHolder3 = (ViewHolder) processdraggesture3.IconCompatParcelizer(i9);
                linearGradientmHitzGk lineargradientmhitzgk3 = (linearGradientmHitzGk) processdraggesture3.RemoteActionCompatParcelizer(i9);
                int i10 = lineargradientmhitzgk3.serializer;
                AnonymousClass7 anonymousClass7 = this.onRequestPermissionsResult;
                if ((i10 & 3) == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.fullyDrawnReporter_delegatelambda00.serializer(viewHolder3.MediaSessionCompatQueueItem, recyclerView.getLastCustomNonConfigurationInstance);
                } else if ((i10 & 1) != 0) {
                    InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls3 = lineargradientmhitzgk3.write;
                    if (infiniteAnimationPolicyDefaultImpls3 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.fullyDrawnReporter_delegatelambda00.serializer(viewHolder3.MediaSessionCompatQueueItem, recyclerView2.getLastCustomNonConfigurationInstance);
                    } else {
                        anonymousClass7.processDisappeared(viewHolder3, infiniteAnimationPolicyDefaultImpls3, lineargradientmhitzgk3.read);
                    }
                } else if ((i10 & 14) == 14) {
                    anonymousClass7.processAppeared(viewHolder3, lineargradientmhitzgk3.write, lineargradientmhitzgk3.read);
                } else {
                    if ((i10 & 12) == 12) {
                        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls4 = lineargradientmhitzgk3.write;
                        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls5 = lineargradientmhitzgk3.read;
                        anonymousClass7.getClass();
                        viewHolder3.setIsRecyclable(false);
                        RecyclerView recyclerView3 = RecyclerView.this;
                        boolean z3 = recyclerView3.ResultReceiver;
                        ItemAnimator itemAnimator = recyclerView3._init_lambda1;
                        if (!z3) {
                            accessgetSoftlightcp accessgetsoftlightcp = (accessgetSoftlightcp) itemAnimator;
                            accessgetsoftlightcp.getClass();
                            int i11 = infiniteAnimationPolicyDefaultImpls4.serializer;
                            int i12 = infiniteAnimationPolicyDefaultImpls5.serializer;
                            if (i11 == i12) {
                                processdraggesture = processdraggesture3;
                                if (infiniteAnimationPolicyDefaultImpls4.RemoteActionCompatParcelizer == infiniteAnimationPolicyDefaultImpls5.RemoteActionCompatParcelizer) {
                                    accessgetsoftlightcp.dispatchAnimationFinished(viewHolder3);
                                }
                            } else {
                                processdraggesture = processdraggesture3;
                            }
                            if (accessgetsoftlightcp.IconCompatParcelizer(viewHolder3, i11, infiniteAnimationPolicyDefaultImpls4.RemoteActionCompatParcelizer, i12, infiniteAnimationPolicyDefaultImpls5.RemoteActionCompatParcelizer)) {
                                recyclerView3.postAnimationRunner();
                            }
                        } else if (itemAnimator.read(viewHolder3, viewHolder3, infiniteAnimationPolicyDefaultImpls4, infiniteAnimationPolicyDefaultImpls5)) {
                            recyclerView3.postAnimationRunner();
                        }
                        i4 = 0;
                        infiniteAnimationPolicyDefaultImpls = null;
                    } else {
                        processdraggesture = processdraggesture3;
                        if ((i10 & 4) != 0) {
                            infiniteAnimationPolicyDefaultImpls = null;
                            anonymousClass7.processDisappeared(viewHolder3, lineargradientmhitzgk3.write, null);
                        } else {
                            infiniteAnimationPolicyDefaultImpls = null;
                            if ((i10 & 8) != 0) {
                                anonymousClass7.processAppeared(viewHolder3, lineargradientmhitzgk3.write, lineargradientmhitzgk3.read);
                            }
                        }
                        i4 = 0;
                    }
                    lineargradientmhitzgk3.serializer = i4;
                    lineargradientmhitzgk3.write = infiniteAnimationPolicyDefaultImpls;
                    lineargradientmhitzgk3.read = infiniteAnimationPolicyDefaultImpls;
                    linearGradientmHitzGk.RemoteActionCompatParcelizer.IconCompatParcelizer(lineargradientmhitzgk3);
                    i9--;
                    processdraggesture3 = processdraggesture;
                }
                processdraggesture = processdraggesture3;
                i4 = 0;
                infiniteAnimationPolicyDefaultImpls = null;
                lineargradientmhitzgk3.serializer = i4;
                lineargradientmhitzgk3.write = infiniteAnimationPolicyDefaultImpls;
                lineargradientmhitzgk3.read = infiniteAnimationPolicyDefaultImpls;
                linearGradientmHitzGk.RemoteActionCompatParcelizer.IconCompatParcelizer(lineargradientmhitzgk3);
                i9--;
                processdraggesture3 = processdraggesture;
            }
        }
        View view = null;
        this.fullyDrawnReporter_delegatelambda00.read(recycler);
        getintrinsicsizenhjbrc.MediaSessionCompatQueueItem = getintrinsicsizenhjbrc.MediaDescriptionCompat;
        this.ResultReceiver = false;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
        getintrinsicsizenhjbrc.ParcelableVolumeInfo = false;
        getintrinsicsizenhjbrc.MediaBrowserCompatMediaItem = false;
        this.fullyDrawnReporter_delegatelambda00.defaultViewModelProviderFactory_delegatelambda0 = false;
        ArrayList arrayList = recycler.IconCompatParcelizer;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager.createFullyDrawnExecutor) {
            layoutManager._init_lambda2 = 0;
            layoutManager.createFullyDrawnExecutor = false;
            recycler.RemoteActionCompatParcelizer();
        }
        this.fullyDrawnReporter_delegatelambda00.RemoteActionCompatParcelizer(getintrinsicsizenhjbrc);
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
        ((processDragGesture) verticalgradient8a3gb4.read).clear();
        ((ContextMenuSpec) verticalgradient8a3gb4.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
        int[] iArr = this.addOnContextAvailableListener;
        int i13 = iArr[0];
        int i14 = iArr[1];
        findMinMaxChildLayoutPositions(iArr);
        if (iArr[0] != i13 || iArr[1] != i14) {
            dispatchOnScrolled(0, 0);
        }
        if (this.getActivityResultRegistry && this.MediaSessionCompatResultReceiverWrapper != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                if (getintrinsicsizenhjbrc.RemoteActionCompatParcelizer == -1) {
                    viewHolder = null;
                } else {
                    viewHolder = null;
                }
                if (viewHolder != null) {
                    if (childHelper.IconCompatParcelizer() > 0) {
                        i = getintrinsicsizenhjbrc.read;
                        if (i == -1) {
                            i = 0;
                        }
                        iSerializer = getintrinsicsizenhjbrc.serializer();
                        i2 = i;
                        while (true) {
                            if (i2 < iSerializer) {
                                viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
                                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition2.MediaSessionCompatQueueItem.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition2.MediaSessionCompatQueueItem;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            for (iMin = Math.min(iSerializer, i) - 1; iMin >= 0; iMin--) {
                                viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (viewHolderFindViewHolderForAdapterPosition == null) {
                                    break;
                                    break;
                                } else {
                                    if (viewHolderFindViewHolderForAdapterPosition.MediaSessionCompatQueueItem.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition.MediaSessionCompatQueueItem;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (((ArrayList) childHelper.read).contains(viewHolder.MediaSessionCompatQueueItem)) {
                    if (childHelper.IconCompatParcelizer() > 0) {
                        i = getintrinsicsizenhjbrc.read;
                        if (i == -1) {
                            i = 0;
                        }
                        iSerializer = getintrinsicsizenhjbrc.serializer();
                        i2 = i;
                        while (true) {
                            if (i2 < iSerializer) {
                                viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
                                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition2.MediaSessionCompatQueueItem.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition2.MediaSessionCompatQueueItem;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (viewHolderFindViewHolderForAdapterPosition == null) {
                                    break;
                                    break;
                                } else {
                                    if (viewHolderFindViewHolderForAdapterPosition.MediaSessionCompatQueueItem.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition.MediaSessionCompatQueueItem;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (childHelper.IconCompatParcelizer() > 0) {
                    i = getintrinsicsizenhjbrc.read;
                    if (i == -1) {
                        i = 0;
                    }
                    iSerializer = getintrinsicsizenhjbrc.serializer();
                    i2 = i;
                    while (true) {
                        if (i2 < iSerializer) {
                            viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                if (viewHolderFindViewHolderForAdapterPosition2.MediaSessionCompatQueueItem.hasFocusable()) {
                                    view = viewHolderFindViewHolderForAdapterPosition2.MediaSessionCompatQueueItem;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                            if (viewHolderFindViewHolderForAdapterPosition == null) {
                                break;
                                break;
                            } else {
                                if (viewHolderFindViewHolderForAdapterPosition.MediaSessionCompatQueueItem.hasFocusable()) {
                                    view = viewHolderFindViewHolderForAdapterPosition.MediaSessionCompatQueueItem;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (view != null) {
                    i3 = getintrinsicsizenhjbrc.IconCompatParcelizer;
                    if (i3 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (((ArrayList) childHelper.read).contains(getFocusedChild())) {
                if (getintrinsicsizenhjbrc.RemoteActionCompatParcelizer == -1 && this.MediaSessionCompatResultReceiverWrapper.hasStableIds()) {
                    long j = getintrinsicsizenhjbrc.RemoteActionCompatParcelizer;
                    Adapter adapter2 = this.MediaSessionCompatResultReceiverWrapper;
                    if (adapter2 == null || !adapter2.hasStableIds()) {
                        viewHolder = null;
                    } else {
                        int iWrite = childHelper.write();
                        viewHolder = null;
                        for (int i15 = 0; i15 < iWrite; i15++) {
                            ViewHolder childViewHolderInt3 = getChildViewHolderInt(childHelper.write(i15));
                            if (childViewHolderInt3 != null && !childViewHolderInt3.isRemoved() && childViewHolderInt3.getItemId() == j) {
                                if (!((ArrayList) childHelper.read).contains(childViewHolderInt3.MediaSessionCompatQueueItem)) {
                                    viewHolder = childViewHolderInt3;
                                    break;
                                }
                                viewHolder = childViewHolderInt3;
                            }
                        }
                    }
                } else {
                    viewHolder = null;
                }
                if (viewHolder != null) {
                    if (childHelper.IconCompatParcelizer() > 0) {
                        i = getintrinsicsizenhjbrc.read;
                        if (i == -1) {
                            i = 0;
                        }
                        iSerializer = getintrinsicsizenhjbrc.serializer();
                        i2 = i;
                        while (true) {
                            if (i2 < iSerializer) {
                                viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
                                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                    if (viewHolderFindViewHolderForAdapterPosition2.MediaSessionCompatQueueItem.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition2.MediaSessionCompatQueueItem;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (viewHolderFindViewHolderForAdapterPosition == null) {
                                    break;
                                    break;
                                } else {
                                    if (viewHolderFindViewHolderForAdapterPosition.MediaSessionCompatQueueItem.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition.MediaSessionCompatQueueItem;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (((ArrayList) childHelper.read).contains(viewHolder.MediaSessionCompatQueueItem) && viewHolder.MediaSessionCompatQueueItem.hasFocusable()) {
                    view = viewHolder.MediaSessionCompatQueueItem;
                } else if (childHelper.IconCompatParcelizer() > 0) {
                    i = getintrinsicsizenhjbrc.read;
                    if (i == -1) {
                        i = 0;
                    }
                    iSerializer = getintrinsicsizenhjbrc.serializer();
                    i2 = i;
                    while (true) {
                        if (i2 < iSerializer) {
                            viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                if (viewHolderFindViewHolderForAdapterPosition2.MediaSessionCompatQueueItem.hasFocusable()) {
                                    view = viewHolderFindViewHolderForAdapterPosition2.MediaSessionCompatQueueItem;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                            if (viewHolderFindViewHolderForAdapterPosition == null) {
                                break;
                            }
                            if (viewHolderFindViewHolderForAdapterPosition.MediaSessionCompatQueueItem.hasFocusable()) {
                                view = viewHolderFindViewHolderForAdapterPosition.MediaSessionCompatQueueItem;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i3 = getintrinsicsizenhjbrc.IconCompatParcelizer;
                    if (i3 != -1 && (viewFindViewById = view.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        getintrinsicsizenhjbrc.RemoteActionCompatParcelizer = -1L;
        getintrinsicsizenhjbrc.read = -1;
        getintrinsicsizenhjbrc.IconCompatParcelizer = -1;
    }

    public final void findMinMaxChildLayoutPositions(int[] iArr) {
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iIconCompatParcelizer = childHelper.IconCompatParcelizer();
        if (iIconCompatParcelizer == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iIconCompatParcelizer; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(childHelper.serializer(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public final int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        int i = viewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        ArrayList arrayList = (ArrayList) this.ParcelableVolumeInfo.write;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            accessgetOverlaycp accessgetoverlaycp = (accessgetOverlaycp) arrayList.get(i2);
            int i3 = accessgetoverlaycp.read;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = accessgetoverlaycp.RemoteActionCompatParcelizer;
                    if (i4 <= i) {
                        int i5 = accessgetoverlaycp.write;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = accessgetoverlaycp.RemoteActionCompatParcelizer;
                    if (i6 == i) {
                        i = accessgetoverlaycp.write;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (accessgetoverlaycp.write <= i) {
                            i++;
                        }
                    }
                }
            } else if (accessgetoverlaycp.RemoteActionCompatParcelizer <= i) {
                i += accessgetoverlaycp.write;
            }
        }
        return i;
    }

    public final long getChangedHolderKey(ViewHolder viewHolder) {
        return this.MediaSessionCompatResultReceiverWrapper.hasStableIds() ? viewHolder.getItemId() : viewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public int getItemDecorationCount() {
        return this.addObserverForBackInvokerlambda0.size();
    }

    public isImportantForBounds getRecycledViewPool() {
        return this.getLastCustomNonConfigurationInstance.read();
    }

    public final void markItemDecorInsetsDirty() {
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iWrite = childHelper.write();
        for (int i = 0; i < iWrite; i++) {
            ((BlockGraphicsLayerElement) childHelper.write(i).getLayoutParams()).IconCompatParcelizer = true;
        }
        ArrayList arrayList = this.getLastCustomNonConfigurationInstance.write;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) ((ViewHolder) arrayList.get(i2)).MediaSessionCompatQueueItem.getLayoutParams();
            if (blockGraphicsLayerElement != null) {
                blockGraphicsLayerElement.IconCompatParcelizer = true;
            }
        }
    }

    public final void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iWrite = childHelper.write();
        for (int i4 = 0; i4 < iWrite; i4++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(childHelper.write(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = this.onCreatePanelMenu;
                if (i5 >= i3) {
                    if (MediaDescriptionCompat) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.offsetPosition(-i2, z);
                    getintrinsicsizenhjbrc.PlaybackStateCompatCustomAction = true;
                } else if (i5 >= i) {
                    if (MediaDescriptionCompat) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    getintrinsicsizenhjbrc.PlaybackStateCompatCustomAction = true;
                }
            }
        }
        Recycler recycler = this.getLastCustomNonConfigurationInstance;
        ArrayList arrayList = recycler.write;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
            if (viewHolder != null) {
                int i6 = viewHolder.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (i6 >= i3) {
                    if (MediaDescriptionCompat) {
                        viewHolder.toString();
                    }
                    viewHolder.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    viewHolder.addFlags(8);
                    recycler.write(size);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        dispatchLayout();
        Trace.endSection();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.addOnUserLeaveHintListener;
        if (savedState2 != null) {
            savedState.write = savedState2.write;
            return savedState;
        }
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            savedState.write = layoutManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            return savedState;
        }
        savedState.write = null;
        return savedState;
    }

    public final void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2 = this.ResultReceiver;
        accessgetModulatecp accessgetmodulatecp = this.ParcelableVolumeInfo;
        boolean z3 = false;
        if (z2) {
            accessgetmodulatecp.read((ArrayList) accessgetmodulatecp.write);
            accessgetmodulatecp.read((ArrayList) accessgetmodulatecp.read);
            accessgetmodulatecp.IconCompatParcelizer = 0;
            if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                this.fullyDrawnReporter_delegatelambda00.write();
            }
        }
        if (this._init_lambda1 == null || !this.fullyDrawnReporter_delegatelambda00.q_()) {
            accessgetmodulatecp.RemoteActionCompatParcelizer();
        } else {
            accessgetmodulatecp.write();
        }
        boolean z4 = this.addObserverForBackInvoker || this.ensureViewModelStore;
        boolean z5 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss && this._init_lambda1 != null && ((z = this.ResultReceiver) || z4 || this.fullyDrawnReporter_delegatelambda00.defaultViewModelProviderFactory_delegatelambda0) && (!z || this.MediaSessionCompatResultReceiverWrapper.hasStableIds());
        getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = this.onCreatePanelMenu;
        getintrinsicsizenhjbrc.ParcelableVolumeInfo = z5;
        if (z5 && z4 && !this.ResultReceiver && this._init_lambda1 != null && this.fullyDrawnReporter_delegatelambda00.q_()) {
            z3 = true;
        }
        getintrinsicsizenhjbrc.MediaBrowserCompatMediaItem = z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        LinearSmoothScroller linearSmoothScroller = this.fullyDrawnReporter_delegatelambda00.addObserverForBackInvoker;
        if ((linearSmoothScroller == null || !linearSmoothScroller.PlaybackStateCompat) && !isComputingLayout() && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.addOnPictureInPictureModeChangedListener;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BlendModeColorFilterHelperExternalSyntheticApiModelOutline1) arrayList.get(i)).RemoteActionCompatParcelizer(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAccessibilityDelegateCompat(verticalGradient8A3gB4default verticalgradient8a3gb4default) {
        this.RatingCompat = verticalgradient8a3gb4default;
        FocusPropertiesNode.write(this, verticalgradient8a3gb4default);
    }

    public void setItemViewCacheSize(int i) {
        Recycler recycler = this.getLastCustomNonConfigurationInstance;
        recycler.RemoteActionCompatParcelizer = i;
        recycler.RemoteActionCompatParcelizer();
    }

    public void setRecycledViewPool(isImportantForBounds isimportantforbounds) {
        Recycler recycler = this.getLastCustomNonConfigurationInstance;
        RecyclerView recyclerView = RecyclerView.this;
        recycler.read(recyclerView.MediaSessionCompatResultReceiverWrapper, false);
        isImportantForBounds isimportantforbounds2 = recycler.read;
        if (isimportantforbounds2 != null) {
            isimportantforbounds2.read--;
        }
        recycler.read = isimportantforbounds;
        if (isimportantforbounds != null && recyclerView.getAdapter() != null) {
            recycler.read.read++;
        }
        recycler.maybeSendPoolingContainerAttach();
    }

    public void setViewCacheExtension(radialGradientP_VxKsdefault radialgradientp_vxksdefault) {
        this.getLastCustomNonConfigurationInstance.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startNestedScrollForType(int i) {
        boolean zRatingCompat = this.fullyDrawnReporter_delegatelambda00.RatingCompat();
        int i2 = zRatingCompat;
        if (this.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem()) {
            i2 = (zRatingCompat ? 1 : 0) | 2;
        }
        getScrollingChildHelper().serializer(i2, i);
    }

    public abstract class ItemDecoration {
        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
            getItemOffsets(rect, ((BlockGraphicsLayerElement) view.getLayoutParams()).MediaMetadataCompat.getLayoutPosition(), recyclerView);
        }

        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        read = new Class[]{Context.class, AttributeSet.class, cls, cls};
        MediaBrowserCompatMediaItem = new getSrcOut0nO6VwU(0);
        MediaMetadataCompat = new horizontalGradient8A3gB4default();
    }

    public final void dispatchLayoutStep1() {
        linearGradientmHitzGk lineargradientmhitzgk;
        View viewFindContainingItemView;
        getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = this.onCreatePanelMenu;
        getintrinsicsizenhjbrc.RemoteActionCompatParcelizer(1);
        fillRemainingScrollValues(getintrinsicsizenhjbrc);
        getintrinsicsizenhjbrc.RatingCompat = false;
        startInterceptRequestLayout();
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.onRetainNonConfigurationInstance;
        processDragGesture processdraggesture = (processDragGesture) verticalgradient8a3gb4.read;
        processDragGesture processdraggesture2 = (processDragGesture) verticalgradient8a3gb4.read;
        processdraggesture.clear();
        ContextMenuSpec contextMenuSpec = (ContextMenuSpec) verticalgradient8a3gb4.RemoteActionCompatParcelizer;
        contextMenuSpec.RemoteActionCompatParcelizer();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        ViewHolder childViewHolder = null;
        View focusedChild = (this.getActivityResultRegistry && hasFocus() && this.MediaSessionCompatResultReceiverWrapper != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewFindContainingItemView = findContainingItemView(focusedChild)) != null) {
            childViewHolder = getChildViewHolder(viewFindContainingItemView);
        }
        if (childViewHolder == null) {
            getintrinsicsizenhjbrc.RemoteActionCompatParcelizer = -1L;
            getintrinsicsizenhjbrc.read = -1;
            getintrinsicsizenhjbrc.IconCompatParcelizer = -1;
        } else {
            getintrinsicsizenhjbrc.RemoteActionCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper.hasStableIds() ? childViewHolder.getItemId() : -1L;
            getintrinsicsizenhjbrc.read = this.ResultReceiver ? -1 : childViewHolder.isRemoved() ? childViewHolder.MediaSessionCompatToken : childViewHolder.getAbsoluteAdapterPosition();
            View focusedChild2 = childViewHolder.MediaSessionCompatQueueItem;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            getintrinsicsizenhjbrc.IconCompatParcelizer = id;
        }
        getintrinsicsizenhjbrc.MediaSessionCompatResultReceiverWrapper = getintrinsicsizenhjbrc.ParcelableVolumeInfo && this.ensureViewModelStore;
        this.ensureViewModelStore = false;
        this.addObserverForBackInvoker = false;
        getintrinsicsizenhjbrc.write = getintrinsicsizenhjbrc.MediaBrowserCompatMediaItem;
        getintrinsicsizenhjbrc.MediaDescriptionCompat = this.MediaSessionCompatResultReceiverWrapper.getItemCount();
        findMinMaxChildLayoutPositions(this.addOnContextAvailableListener);
        boolean z = getintrinsicsizenhjbrc.ParcelableVolumeInfo;
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (z) {
            int iIconCompatParcelizer = childHelper.IconCompatParcelizer();
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(childHelper.serializer(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.MediaSessionCompatResultReceiverWrapper.hasStableIds())) {
                    ItemAnimator itemAnimator = this._init_lambda1;
                    ItemAnimator.serializer(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    itemAnimator.getClass();
                    InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls = new InfiniteAnimationPolicyDefaultImpls();
                    infiniteAnimationPolicyDefaultImpls.read(childViewHolderInt);
                    linearGradientmHitzGk lineargradientmhitzgk2 = (linearGradientmHitzGk) processdraggesture2.get(childViewHolderInt);
                    if (lineargradientmhitzgk2 == null) {
                        lineargradientmhitzgk2 = linearGradientmHitzGk.read();
                        processdraggesture2.put(childViewHolderInt, lineargradientmhitzgk2);
                    }
                    lineargradientmhitzgk2.write = infiniteAnimationPolicyDefaultImpls;
                    lineargradientmhitzgk2.serializer |= 4;
                    if (getintrinsicsizenhjbrc.MediaSessionCompatResultReceiverWrapper && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        contextMenuSpec.read(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (getintrinsicsizenhjbrc.MediaBrowserCompatMediaItem) {
            int iWrite = childHelper.write();
            for (int i2 = 0; i2 < iWrite; i2++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(childHelper.write(i2));
                if (MediaSessionCompatQueueItem && childViewHolderInt2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == -1 && !childViewHolderInt2.isRemoved()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("view holder cannot have position -1 unless it is removed".concat(exceptionLabel()));
                    return;
                } else {
                    if (!childViewHolderInt2.shouldIgnore()) {
                        childViewHolderInt2.saveOldPosition();
                    }
                }
            }
            boolean z2 = getintrinsicsizenhjbrc.PlaybackStateCompatCustomAction;
            getintrinsicsizenhjbrc.PlaybackStateCompatCustomAction = false;
            this.fullyDrawnReporter_delegatelambda00.read(this.getLastCustomNonConfigurationInstance, getintrinsicsizenhjbrc);
            getintrinsicsizenhjbrc.PlaybackStateCompatCustomAction = z2;
            for (int i3 = 0; i3 < childHelper.IconCompatParcelizer(); i3++) {
                ViewHolder childViewHolderInt3 = getChildViewHolderInt(childHelper.serializer(i3));
                if (!childViewHolderInt3.shouldIgnore() && ((lineargradientmhitzgk = (linearGradientmHitzGk) processdraggesture2.get(childViewHolderInt3)) == null || (lineargradientmhitzgk.serializer & 4) == 0)) {
                    ItemAnimator.serializer(childViewHolderInt3);
                    boolean zHasAnyOfTheFlags = childViewHolderInt3.hasAnyOfTheFlags(8192);
                    ItemAnimator itemAnimator2 = this._init_lambda1;
                    childViewHolderInt3.getUnmodifiedPayloads();
                    itemAnimator2.getClass();
                    InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls2 = new InfiniteAnimationPolicyDefaultImpls();
                    infiniteAnimationPolicyDefaultImpls2.read(childViewHolderInt3);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt3, infiniteAnimationPolicyDefaultImpls2);
                    } else {
                        linearGradientmHitzGk lineargradientmhitzgk3 = (linearGradientmHitzGk) processdraggesture2.get(childViewHolderInt3);
                        if (lineargradientmhitzgk3 == null) {
                            lineargradientmhitzgk3 = linearGradientmHitzGk.read();
                            processdraggesture2.put(childViewHolderInt3, lineargradientmhitzgk3);
                        }
                        lineargradientmhitzgk3.serializer |= 2;
                        lineargradientmhitzgk3.write = infiniteAnimationPolicyDefaultImpls2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
        getintrinsicsizenhjbrc.MediaMetadataCompat = 2;
    }

    public final void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = this.onCreatePanelMenu;
        getintrinsicsizenhjbrc.RemoteActionCompatParcelizer(6);
        this.ParcelableVolumeInfo.RemoteActionCompatParcelizer();
        getintrinsicsizenhjbrc.MediaDescriptionCompat = this.MediaSessionCompatResultReceiverWrapper.getItemCount();
        getintrinsicsizenhjbrc.serializer = 0;
        if (this.addOnUserLeaveHintListener != null && this.MediaSessionCompatResultReceiverWrapper.canRestoreState()) {
            Parcelable parcelable = this.addOnUserLeaveHintListener.write;
            if (parcelable != null) {
                this.fullyDrawnReporter_delegatelambda00.write(parcelable);
            }
            this.addOnUserLeaveHintListener = null;
        }
        getintrinsicsizenhjbrc.write = false;
        this.fullyDrawnReporter_delegatelambda00.read(this.getLastCustomNonConfigurationInstance, getintrinsicsizenhjbrc);
        getintrinsicsizenhjbrc.PlaybackStateCompatCustomAction = false;
        getintrinsicsizenhjbrc.ParcelableVolumeInfo = getintrinsicsizenhjbrc.ParcelableVolumeInfo && this._init_lambda1 != null;
        getintrinsicsizenhjbrc.MediaMetadataCompat = 4;
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.addObserverForBackInvokerlambda0;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((ItemDecoration) arrayList.get(i)).onDrawOver(canvas, this, this.onCreatePanelMenu);
        }
        EdgeEffect edgeEffect = this.onBackPressedInput_delegatelambda0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.ComponentActivity ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.onBackPressedInput_delegatelambda0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.onCreate;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.ComponentActivity) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.onCreate;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.getViewModelStore;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.ComponentActivity ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.getViewModelStore;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.MediaSessionCompatToken;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.ComponentActivity) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.MediaSessionCompatToken;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this._init_lambda1 == null || arrayList.size() <= 0 || !this._init_lambda1.IconCompatParcelizer()) && !z) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this._init_lambda1;
        if (itemAnimator != null) {
            itemAnimator.serializer();
        }
        stopScroll();
        this.accessensureViewModelStore = false;
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            layoutManager._init_lambda3 = false;
            layoutManager.read(this);
        }
        this.addOnTrimMemoryListener.clear();
        removeCallbacks(this._init_lambda3);
        this.onRetainNonConfigurationInstance.getClass();
        while (linearGradientmHitzGk.RemoteActionCompatParcelizer.write() != null) {
        }
        Recycler recycler = this.getLastCustomNonConfigurationInstance;
        ArrayList arrayList = recycler.write;
        for (int i = 0; i < arrayList.size(); i++) {
            Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1890765613, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{((ViewHolder) arrayList.get(i)).MediaSessionCompatQueueItem}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1890765614);
        }
        recycler.read(RecyclerView.this.MediaSessionCompatResultReceiverWrapper, false);
        EmptyContentCardsAdapterNetworkUnavailableViewHolder emptyContentCardsAdapterNetworkUnavailableViewHolder = new EmptyContentCardsAdapterNetworkUnavailableViewHolder(2, this);
        while (emptyContentCardsAdapterNetworkUnavailableViewHolder.hasNext()) {
            ArrayList arrayList2 = Options.Companion.write((View) emptyContentCardsAdapterNetworkUnavailableViewHolder.next()).read;
            for (int iWrite = SQLite.write((List) arrayList2); -1 < iWrite; iWrite--) {
                ((ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0) ((getBeyondBoundsLayoutParent) arrayList2.get(iWrite))).f$0.disposeComposition();
            }
        }
        if (!IconCompatParcelizer || (gapWorker = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) == null) {
            return;
        }
        boolean zRemove = gapWorker.read.remove(this);
        if (!MediaSessionCompatQueueItem || zRemove) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.addObserverForBackInvokerlambda0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ItemDecoration) arrayList.get(i)).onDraw(canvas, this, this.onCreatePanelMenu);
        }
    }

    public final void processDataSetCompletelyChanged(boolean z) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = z | this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        this.ResultReceiver = true;
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iWrite = childHelper.write();
        for (int i = 0; i < iWrite; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(childHelper.write(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        Recycler recycler = this.getLastCustomNonConfigurationInstance;
        ArrayList arrayList = recycler.write;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i2);
            if (viewHolder != null) {
                viewHolder.addFlags(6);
                viewHolder.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.MediaSessionCompatResultReceiverWrapper;
        if (adapter == null || !adapter.hasStableIds()) {
            recycler.IconCompatParcelizer();
        }
    }

    public final void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls) {
        viewHolder.setFlags(0, 8192);
        boolean z = this.onCreatePanelMenu.MediaSessionCompatResultReceiverWrapper;
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.onRetainNonConfigurationInstance;
        if (z && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            ((ContextMenuSpec) verticalgradient8a3gb4.RemoteActionCompatParcelizer).read(getChangedHolderKey(viewHolder), viewHolder);
        }
        processDragGesture processdraggesture = (processDragGesture) verticalgradient8a3gb4.read;
        linearGradientmHitzGk lineargradientmhitzgk = (linearGradientmHitzGk) processdraggesture.get(viewHolder);
        if (lineargradientmhitzgk == null) {
            lineargradientmhitzgk = linearGradientmHitzGk.read();
            processdraggesture.put(viewHolder, lineargradientmhitzgk);
        }
        lineargradientmhitzgk.write = infiniteAnimationPolicyDefaultImpls;
        lineargradientmhitzgk.serializer |= 4;
    }

    public final void scrollStep(int[] iArr, int i, int i2) {
        ViewHolder viewHolder;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection("RV Scroll");
        getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = this.onCreatePanelMenu;
        fillRemainingScrollValues(getintrinsicsizenhjbrc);
        Recycler recycler = this.getLastCustomNonConfigurationInstance;
        int iSerializer = i != 0 ? this.fullyDrawnReporter_delegatelambda00.serializer(i, recycler, getintrinsicsizenhjbrc) : 0;
        int iRemoteActionCompatParcelizer = i2 != 0 ? this.fullyDrawnReporter_delegatelambda00.RemoteActionCompatParcelizer(i2, recycler, getintrinsicsizenhjbrc) : 0;
        Trace.endSection();
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iIconCompatParcelizer = childHelper.IconCompatParcelizer();
        for (int i3 = 0; i3 < iIconCompatParcelizer; i3++) {
            View viewSerializer = childHelper.serializer(i3);
            ViewHolder childViewHolder = getChildViewHolder(viewSerializer);
            if (childViewHolder != null && (viewHolder = childViewHolder.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
                View view = viewHolder.MediaSessionCompatQueueItem;
                int left = viewSerializer.getLeft();
                int top = viewSerializer.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iSerializer;
            iArr[1] = iRemoteActionCompatParcelizer;
        }
    }

    public void setEdgeEffectFactory(BlendModeColorFilterHelper blendModeColorFilterHelper) {
        blendModeColorFilterHelper.getClass();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = blendModeColorFilterHelper;
        this.MediaSessionCompatToken = null;
        this.onCreate = null;
        this.getViewModelStore = null;
        this.onBackPressedInput_delegatelambda0 = null;
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    public final boolean shouldAbsorb(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fAbs = Math.abs(-i);
        float f = this.enterPictureInPictureMode * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f);
        double d = write;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < BuildersKt.write(edgeEffect) * ((float) i2);
    }

    public static void clearNestedRecyclerViewIfNotNested(ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.ParcelableVolumeInfo;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.MediaSessionCompatQueueItem) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.ParcelableVolumeInfo = null;
        }
    }

    public static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((BlockGraphicsLayerElement) view.getLayoutParams()).MediaMetadataCompat;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
        Rect rect2 = blockGraphicsLayerElement.serializer;
        int left = view.getLeft();
        int i = rect2.left;
        int i2 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).leftMargin;
        int top = view.getTop();
        int i3 = rect2.top;
        int i4 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).topMargin;
        int right = view.getRight();
        int i5 = rect2.right;
        rect.set((left - i) - i2, (top - i3) - i4, right + i5 + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).bottomMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            layoutManager.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof BlockGraphicsLayerElement) && this.fullyDrawnReporter_delegatelambda00.serializer((BlockGraphicsLayerElement) layoutParams);
    }

    public final void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.onBackPressedInput_delegatelambda0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.onBackPressedInput_delegatelambda0.onRelease();
            zIsFinished = this.onBackPressedInput_delegatelambda0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.getViewModelStore;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.getViewModelStore.onRelease();
            zIsFinished |= this.getViewModelStore.isFinished();
        }
        EdgeEffect edgeEffect3 = this.onCreate;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.onCreate.onRelease();
            zIsFinished |= this.onCreate.isFinished();
        }
        EdgeEffect edgeEffect4 = this.MediaSessionCompatToken;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.MediaSessionCompatToken.onRelease();
            zIsFinished |= this.MediaSessionCompatToken.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void consumePendingUpdateOperations() {
        if (!this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss || this.ResultReceiver) {
            Trace.beginSection("RV FullInvalidate");
            dispatchLayout();
            Trace.endSection();
            return;
        }
        accessgetModulatecp accessgetmodulatecp = this.ParcelableVolumeInfo;
        if (accessgetmodulatecp.serializer()) {
            int i = accessgetmodulatecp.IconCompatParcelizer;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (accessgetmodulatecp.serializer()) {
                    Trace.beginSection("RV FullInvalidate");
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            accessgetmodulatecp.write();
            if (!this.onBackPressedDispatcher_delegatelambda00) {
                ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                int iIconCompatParcelizer = childHelper.IconCompatParcelizer();
                for (int i2 = 0; i2 < iIconCompatParcelizer; i2++) {
                    ViewHolder childViewHolderInt = getChildViewHolderInt(childHelper.serializer(i2));
                    if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                        dispatchLayout();
                    }
                }
                accessgetmodulatecp.read();
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll(true);
            Trace.endSection();
        }
    }

    public final void defaultOnMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int iIconCompatParcelizer = LayoutManager.IconCompatParcelizer(i, paddingRight + paddingLeft, getMinimumWidth());
        int paddingTop = getPaddingTop();
        setMeasuredDimension(iIconCompatParcelizer, LayoutManager.IconCompatParcelizer(i2, getPaddingBottom() + paddingTop, getMinimumHeight()));
    }

    public final void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        Adapter adapter = this.MediaSessionCompatResultReceiverWrapper;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        ArrayList arrayList = this.addMenuProvider;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC0185m) this.addMenuProvider.get(size)).read(view);
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().serializer(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().serializer(f, f2);
    }

    public final void dispatchOnScrolled(int i, int i2) {
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        BlurEffect blurEffect = this.getLifecycle;
        if (blurEffect != null) {
            blurEffect.IconCompatParcelizer(this, i, i2);
        }
        ArrayList arrayList = this.onBackPressed;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((BlurEffect) this.onBackPressed.get(size)).IconCompatParcelizer(this, i, i2);
                }
            }
        }
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg--;
    }

    public final String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.MediaSessionCompatResultReceiverWrapper + ", layout:" + this.fullyDrawnReporter_delegatelambda00 + ", context:" + getContext();
    }

    public final boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.addOnPictureInPictureModeChangedListener;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            BlendModeColorFilterHelperExternalSyntheticApiModelOutline1 blendModeColorFilterHelperExternalSyntheticApiModelOutline1 = (BlendModeColorFilterHelperExternalSyntheticApiModelOutline1) arrayList.get(i);
            if (blendModeColorFilterHelperExternalSyntheticApiModelOutline1.write(motionEvent) && action != 3) {
                this._init_lambda2 = blendModeColorFilterHelperExternalSyntheticApiModelOutline1;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            return layoutManager.IconCompatParcelizer();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("RecyclerView has no LayoutManager".concat(exceptionLabel()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("RecyclerView has no LayoutManager".concat(exceptionLabel()));
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager == null) {
            return super.getBaseline();
        }
        layoutManager.getClass();
        return -1;
    }

    public final Rect getItemDecorInsetsForChild(View view) {
        BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
        boolean z = blockGraphicsLayerElement.IconCompatParcelizer;
        Rect rect = blockGraphicsLayerElement.serializer;
        if (z) {
            getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = this.onCreatePanelMenu;
            if (!getintrinsicsizenhjbrc.write || (!blockGraphicsLayerElement.MediaMetadataCompat.isUpdated() && !blockGraphicsLayerElement.MediaMetadataCompat.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.addObserverForBackInvokerlambda0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.onMultiWindowModeChanged;
                    rect2.set(0, 0, 0, 0);
                    ((ItemDecoration) arrayList.get(i)).getItemOffsets(rect2, view, this, getintrinsicsizenhjbrc);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                blockGraphicsLayerElement.IconCompatParcelizer = false;
                return rect;
            }
        }
        return rect;
    }

    public long getNanoTime() {
        if (IconCompatParcelizer) {
            return System.nanoTime();
        }
        return 0L;
    }

    public final boolean hasPendingAdapterUpdates() {
        return !this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss || this.ResultReceiver || this.ParcelableVolumeInfo.serializer();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().serializer;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.menuHostHelperlambda0 = 0;
        this.accessensureViewModelStore = true;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss && !isLayoutRequested();
        this.getLastCustomNonConfigurationInstance.maybeSendPoolingContainerAttach();
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            layoutManager._init_lambda3 = true;
            layoutManager.serializer(this);
        }
        this.getFullyDrawnReporter = false;
        if (IconCompatParcelizer) {
            ThreadLocal threadLocal = GapWorker.write;
            GapWorker gapWorker = (GapWorker) threadLocal.get();
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = gapWorker;
            if (gapWorker == null) {
                this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new GapWorker();
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                GapWorker gapWorker2 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                gapWorker2.RemoteActionCompatParcelizer = (long) (1.0E9f / refreshRate);
                threadLocal.set(gapWorker2);
            }
            ArrayList arrayList = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read;
            if (MediaSessionCompatQueueItem && arrayList.contains(this)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    public final void onEnterLayoutOrScroll() {
        this.menuHostHelperlambda0++;
    }

    public final void onExitLayoutOrScroll(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.menuHostHelperlambda0 - 1;
        this.menuHostHelperlambda0 = i2;
        if (i2 < 1) {
            if (MediaSessionCompatQueueItem && i2 < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("layout or scroll counter cannot go below zero.Some calls are not matching".concat(exceptionLabel()));
                return;
            }
            this.menuHostHelperlambda0 = 0;
            if (z) {
                int i3 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 0;
                if (i3 != 0 && (accessibilityManager = this.PlaybackStateCompatCustomAction) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(Fields.CameraDistance);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.addOnTrimMemoryListener;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
                    if (viewHolder.MediaSessionCompatQueueItem.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.ComponentActivity) != -1) {
                        viewHolder.MediaSessionCompatQueueItem.setImportantForAccessibility(i);
                        viewHolder.ComponentActivity = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        float f;
        if (this.fullyDrawnReporter_delegatelambda00 != null && !this.addContentView && motionEvent.getAction() == 8) {
            float f2 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                i = 0;
                z = false;
                f2 = this.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.fullyDrawnReporter_delegatelambda00.RatingCompat() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem()) {
                    f = -axisValue2;
                } else if (this.fullyDrawnReporter_delegatelambda00.RatingCompat()) {
                    f = 0.0f;
                    f2 = axisValue2;
                } else {
                    f = 0.0f;
                }
                i = 26;
                axisValue = f2;
                f2 = f;
                z = this.onBackPressedDispatcher_delegatelambda0;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f2 * this.getOnBackPressedDispatcher);
            int i3 = (int) (axisValue * this.getSavedStateRegistry);
            if (z) {
                OverScroller overScroller = this.onPreparePanel.write;
                smoothScrollBy$1((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
                if (layoutManager == null) {
                    SentryLogcatAdapter.serializer("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.addContentView) {
                    int[] iArr = this.getNavigationEventDispatcher;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zRatingCompat = layoutManager.RatingCompat();
                    boolean zMediaBrowserCompatMediaItem = this.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem();
                    int i4 = zMediaBrowserCompatMediaItem ? (zRatingCompat ? 1 : 0) | 2 : zRatingCompat ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iReleaseHorizontalGlow = i3 - releaseHorizontalGlow(y, i3);
                    int iReleaseVerticalGlow$1 = i2 - releaseVerticalGlow$1(x, i2);
                    getScrollingChildHelper().serializer(i4, 1);
                    if (dispatchNestedPreScroll(this.getNavigationEventDispatcher, zRatingCompat ? iReleaseHorizontalGlow : 0, this.initializeViewTreeOwners, zMediaBrowserCompatMediaItem ? iReleaseVerticalGlow$1 : 0, 1)) {
                        iReleaseHorizontalGlow -= iArr[0];
                        iReleaseVerticalGlow$1 -= iArr[1];
                    }
                    int i5 = iReleaseVerticalGlow$1;
                    scrollByInternal(zRatingCompat ? iReleaseHorizontalGlow : 0, zMediaBrowserCompatMediaItem ? i5 : 0, motionEvent, 1);
                    GapWorker gapWorker = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    if (gapWorker != null && (iReleaseHorizontalGlow != 0 || i5 != 0)) {
                        gapWorker.postFromTraversal(this, iReleaseHorizontalGlow, i5);
                    }
                    stopNestedScroll(1);
                }
            }
            if (i != 0 && !z) {
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean zPlaybackStateCompatCustomAction = layoutManager.PlaybackStateCompatCustomAction();
        getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = this.onCreatePanelMenu;
        boolean z = false;
        if (zPlaybackStateCompatCustomAction) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.fullyDrawnReporter_delegatelambda00.ensureViewModelStore.defaultOnMeasure(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.getSavedStateRegistryControllerannotations = z;
            if (z || this.MediaSessionCompatResultReceiverWrapper == null) {
                return;
            }
            if (getintrinsicsizenhjbrc.MediaMetadataCompat == 1) {
                dispatchLayoutStep1();
            }
            this.fullyDrawnReporter_delegatelambda00.MediaMetadataCompat(i, i2);
            getintrinsicsizenhjbrc.RatingCompat = true;
            dispatchLayoutStep2();
            this.fullyDrawnReporter_delegatelambda00.PlaybackStateCompatCustomAction(i, i2);
            if (this.fullyDrawnReporter_delegatelambda00.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) {
                this.fullyDrawnReporter_delegatelambda00.MediaMetadataCompat(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                getintrinsicsizenhjbrc.RatingCompat = true;
                dispatchLayoutStep2();
                this.fullyDrawnReporter_delegatelambda00.PlaybackStateCompatCustomAction(i, i2);
            }
            this.createFullyDrawnExecutor = getMeasuredWidth();
            this.defaultViewModelProviderFactory_delegatelambda0 = getMeasuredHeight();
            return;
        }
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
            this.fullyDrawnReporter_delegatelambda00.ensureViewModelStore.defaultOnMeasure(i, i2);
            return;
        }
        if (this.PlaybackStateCompat) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll(true);
            if (getintrinsicsizenhjbrc.MediaBrowserCompatMediaItem) {
                getintrinsicsizenhjbrc.write = true;
            } else {
                this.ParcelableVolumeInfo.RemoteActionCompatParcelizer();
                getintrinsicsizenhjbrc.write = false;
            }
            this.PlaybackStateCompat = false;
            stopInterceptRequestLayout(false);
        } else if (getintrinsicsizenhjbrc.MediaBrowserCompatMediaItem) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.MediaSessionCompatResultReceiverWrapper;
        if (adapter != null) {
            getintrinsicsizenhjbrc.MediaDescriptionCompat = adapter.getItemCount();
        } else {
            getintrinsicsizenhjbrc.MediaDescriptionCompat = 0;
        }
        startInterceptRequestLayout();
        this.fullyDrawnReporter_delegatelambda00.ensureViewModelStore.defaultOnMeasure(i, i2);
        stopInterceptRequestLayout(false);
        getintrinsicsizenhjbrc.write = false;
    }

    public final void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.onActivityResult) {
            int i = actionIndex == 0 ? 1 : 0;
            this.onActivityResult = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.getOnBackPressedInput = x;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.fullyDrawnReporter_delegatelambda0 = y;
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = y;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.addOnUserLeaveHintListener = savedState;
        super.onRestoreInstanceState(savedState.IconCompatParcelizer);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ef A[PHI: r0
  0x00ef: PHI (r0v45 int) = (r0v31 int), (r0v49 int) binds: [B:47:0x00da, B:52:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.addContentView && !this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) {
            BlendModeColorFilterHelperExternalSyntheticApiModelOutline1 blendModeColorFilterHelperExternalSyntheticApiModelOutline1 = this._init_lambda2;
            if (blendModeColorFilterHelperExternalSyntheticApiModelOutline1 == null) {
                if (motionEvent.getAction() == 0 || !findInterceptingOnItemTouchListener(motionEvent)) {
                    LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
                    if (layoutManager != null) {
                        boolean zRatingCompat = layoutManager.RatingCompat();
                        boolean zMediaBrowserCompatMediaItem = this.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem();
                        if (this.onPictureInPictureUiStateChanged == null) {
                            this.onPictureInPictureUiStateChanged = VelocityTracker.obtain();
                        }
                        int actionMasked = motionEvent.getActionMasked();
                        int actionIndex = motionEvent.getActionIndex();
                        int[] iArr = this.addOnNewIntentListener;
                        if (actionMasked == 0) {
                            iArr[1] = 0;
                            iArr[0] = 0;
                        }
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                        if (actionMasked == 0) {
                            this.onActivityResult = motionEvent.getPointerId(0);
                            int x = (int) (motionEvent.getX() + 0.5f);
                            this.getOnBackPressedInput = x;
                            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = x;
                            int y = (int) (motionEvent.getY() + 0.5f);
                            this.fullyDrawnReporter_delegatelambda0 = y;
                            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = y;
                            startNestedScrollForType(0);
                        } else {
                            if (actionMasked == 1) {
                                this.onPictureInPictureUiStateChanged.addMovement(motionEventObtain);
                                VelocityTracker velocityTracker = this.onPictureInPictureUiStateChanged;
                                int i = this.onBackPressedDispatcher_delegatelambda010;
                                velocityTracker.computeCurrentVelocity(1000, i);
                                float f = zRatingCompat ? -this.onPictureInPictureUiStateChanged.getXVelocity(this.onActivityResult) : 0.0f;
                                float f2 = zMediaBrowserCompatMediaItem ? -this.onPictureInPictureUiStateChanged.getYVelocity(this.onActivityResult) : 0.0f;
                                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2, this.addOnMultiWindowModeChangedListener, i)) {
                                    setScrollState(0);
                                }
                                VelocityTracker velocityTracker2 = this.onPictureInPictureUiStateChanged;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                                stopNestedScroll(0);
                                releaseGlows();
                            } else if (actionMasked == 2) {
                                int iFindPointerIndex = motionEvent.findPointerIndex(this.onActivityResult);
                                if (iFindPointerIndex < 0) {
                                    SentryLogcatAdapter.serializer("RecyclerView", "Error processing scroll; pointer index for id " + this.onActivityResult + " not found. Did any MotionEvents get skipped?");
                                    return false;
                                }
                                int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                                int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                                int iMin = this.getOnBackPressedInput - x2;
                                int iMin2 = this.fullyDrawnReporter_delegatelambda0 - y2;
                                if (this.onConfigurationChanged != 1) {
                                    if (zRatingCompat) {
                                        int i2 = this.onPanelClosed;
                                        if (iMin > 0) {
                                            iMin = Math.max(0, iMin - i2);
                                        } else {
                                            iMin = Math.min(0, iMin + i2);
                                        }
                                        if (iMin != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    if (zMediaBrowserCompatMediaItem) {
                                        int i3 = this.onPanelClosed;
                                        if (iMin2 > 0) {
                                            iMin2 = Math.max(0, iMin2 - i3);
                                        } else {
                                            iMin2 = Math.min(0, iMin2 + i3);
                                        }
                                        if (iMin2 != 0) {
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        setScrollState(1);
                                    }
                                }
                                if (this.onConfigurationChanged == 1) {
                                    int[] iArr2 = this.getNavigationEventDispatcher;
                                    iArr2[0] = 0;
                                    iArr2[1] = 0;
                                    int iReleaseHorizontalGlow = iMin - releaseHorizontalGlow(motionEvent.getY(), iMin);
                                    int iReleaseVerticalGlow$1 = iMin2 - releaseVerticalGlow$1(motionEvent.getX(), iMin2);
                                    boolean zDispatchNestedPreScroll = dispatchNestedPreScroll(this.getNavigationEventDispatcher, zRatingCompat ? iReleaseHorizontalGlow : 0, this.initializeViewTreeOwners, zMediaBrowserCompatMediaItem ? iReleaseVerticalGlow$1 : 0, 0);
                                    int[] iArr3 = this.initializeViewTreeOwners;
                                    if (zDispatchNestedPreScroll) {
                                        iReleaseHorizontalGlow -= iArr2[0];
                                        iReleaseVerticalGlow$1 -= iArr2[1];
                                        iArr[0] = iArr[0] + iArr3[0];
                                        iArr[1] = iArr[1] + iArr3[1];
                                        getParent().requestDisallowInterceptTouchEvent(true);
                                    }
                                    int i4 = iReleaseHorizontalGlow;
                                    int i5 = iReleaseVerticalGlow$1;
                                    this.getOnBackPressedInput = x2 - iArr3[0];
                                    this.fullyDrawnReporter_delegatelambda0 = y2 - iArr3[1];
                                    if (scrollByInternal(zRatingCompat ? i4 : 0, zMediaBrowserCompatMediaItem ? i5 : 0, motionEvent, 0)) {
                                        getParent().requestDisallowInterceptTouchEvent(true);
                                    }
                                    GapWorker gapWorker = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                                    if (gapWorker != null && (i4 != 0 || i5 != 0)) {
                                        gapWorker.postFromTraversal(this, i4, i5);
                                    }
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker3 = this.onPictureInPictureUiStateChanged;
                                if (velocityTracker3 != null) {
                                    velocityTracker3.clear();
                                }
                                stopNestedScroll(0);
                                releaseGlows();
                                setScrollState(0);
                            } else if (actionMasked == 5) {
                                this.onActivityResult = motionEvent.getPointerId(actionIndex);
                                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                this.getOnBackPressedInput = x3;
                                this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = x3;
                                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                this.fullyDrawnReporter_delegatelambda0 = y3;
                                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = y3;
                            } else if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                            motionEventObtain.recycle();
                            return true;
                        }
                        this.onPictureInPictureUiStateChanged.addMovement(motionEventObtain);
                        motionEventObtain.recycle();
                        return true;
                    }
                }
            } else {
                blendModeColorFilterHelperExternalSyntheticApiModelOutline1.serializer(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this._init_lambda2 = null;
                }
            }
            VelocityTracker velocityTracker4 = this.onPictureInPictureUiStateChanged;
            if (velocityTracker4 != null) {
                velocityTracker4.clear();
            }
            stopNestedScroll(0);
            releaseGlows();
            setScrollState(0);
            return true;
        }
        return false;
    }

    public final void postAnimationRunner() {
        if (this.getFullyDrawnReporter || !this.accessensureViewModelStore) {
            return;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        postOnAnimation(this._init_lambda3);
        this.getFullyDrawnReporter = true;
    }

    public final void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.onBackPressedInput_delegatelambda0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.onBackPressedInput_delegatelambda0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.onCreate;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.onCreate.isFinished();
        }
        EdgeEffect edgeEffect3 = this.getViewModelStore;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.getViewModelStore.isFinished();
        }
        EdgeEffect edgeEffect4 = this.MediaSessionCompatToken;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.MediaSessionCompatToken.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != 0 || this.addContentView) {
            this.onBackPressedDispatcher_delegatelambda00 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        SentryLogcatAdapter.IconCompatParcelizer("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void setChildDrawingOrderCallback(BlendModeColorFilter blendModeColorFilter) {
        if (blendModeColorFilter == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public void setItemAnimator(ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this._init_lambda1;
        if (itemAnimator2 != null) {
            itemAnimator2.serializer();
            this._init_lambda1.ResultReceiver = null;
        }
        this._init_lambda1 = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.ResultReceiver = this._init_lambda4;
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().write(z);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.onPanelClosed = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            SentryLogcatAdapter.IconCompatParcelizer("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.onPanelClosed = viewConfiguration.getScaledTouchSlop();
    }

    public final void startInterceptRequestLayout() {
        int i = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 1;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i;
        if (i != 1 || this.addContentView) {
            return;
        }
        this.onBackPressedDispatcher_delegatelambda00 = false;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null && layoutManager.RatingCompat()) {
            return this.fullyDrawnReporter_delegatelambda00.MediaSessionCompatQueueItem(this.onCreatePanelMenu);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null && layoutManager.RatingCompat()) {
            return this.fullyDrawnReporter_delegatelambda00.write(this.onCreatePanelMenu);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null && layoutManager.RatingCompat()) {
            return this.fullyDrawnReporter_delegatelambda00.read(this.onCreatePanelMenu);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null && layoutManager.MediaBrowserCompatMediaItem()) {
            return this.fullyDrawnReporter_delegatelambda00.MediaDescriptionCompat(this.onCreatePanelMenu);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null && layoutManager.MediaBrowserCompatMediaItem()) {
            return this.fullyDrawnReporter_delegatelambda00.IconCompatParcelizer(this.onCreatePanelMenu);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null && layoutManager.MediaBrowserCompatMediaItem()) {
            return this.fullyDrawnReporter_delegatelambda00.serializer(this.onCreatePanelMenu);
        }
        return 0;
    }

    public final void ensureBottomGlow() {
        if (this.MediaSessionCompatToken != null) {
            return;
        }
        ((horizontalGradient8A3gB4default) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.MediaSessionCompatToken = edgeEffect;
        if (!this.ComponentActivity) {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        edgeEffect.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
    }

    public final void ensureLeftGlow() {
        if (this.onBackPressedInput_delegatelambda0 != null) {
            return;
        }
        ((horizontalGradient8A3gB4default) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.onBackPressedInput_delegatelambda0 = edgeEffect;
        if (!this.ComponentActivity) {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        edgeEffect.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
    }

    public final void ensureRightGlow() {
        if (this.getViewModelStore != null) {
            return;
        }
        ((horizontalGradient8A3gB4default) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.getViewModelStore = edgeEffect;
        if (!this.ComponentActivity) {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        edgeEffect.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
    }

    public final void ensureTopGlow() {
        if (this.onCreate != null) {
            return;
        }
        ((horizontalGradient8A3gB4default) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.onCreate = edgeEffect;
        if (!this.ComponentActivity) {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        edgeEffect.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().read(0);
    }

    public final void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.onMultiWindowModeChanged;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof BlockGraphicsLayerElement) {
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) layoutParams;
            if (!blockGraphicsLayerElement.IconCompatParcelizer) {
                Rect rect2 = blockGraphicsLayerElement.serializer;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.fullyDrawnReporter_delegatelambda00.requestChildRectangleOnScreen(this, view, this.onMultiWindowModeChanged, !this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, view2 == null);
    }

    public final void scrollToPosition(int i) {
        if (this.addContentView) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager == null) {
            SentryLogcatAdapter.serializer("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.RatingCompat(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.ComponentActivity) {
            this.MediaSessionCompatToken = null;
            this.onCreate = null;
            this.getViewModelStore = null;
            this.onBackPressedInput_delegatelambda0 = null;
        }
        this.ComponentActivity = z;
        super.setClipToPadding(z);
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            requestLayout();
        }
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if (layoutManager == this.fullyDrawnReporter_delegatelambda00) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager2 = this.fullyDrawnReporter_delegatelambda00;
        Recycler recycler = this.getLastCustomNonConfigurationInstance;
        if (layoutManager2 != null) {
            ItemAnimator itemAnimator = this._init_lambda1;
            if (itemAnimator != null) {
                itemAnimator.serializer();
            }
            this.fullyDrawnReporter_delegatelambda00.write(recycler);
            this.fullyDrawnReporter_delegatelambda00.read(recycler);
            recycler.serializer.clear();
            recycler.IconCompatParcelizer();
            if (this.accessensureViewModelStore) {
                LayoutManager layoutManager3 = this.fullyDrawnReporter_delegatelambda00;
                layoutManager3._init_lambda3 = false;
                layoutManager3.read(this);
            }
            this.fullyDrawnReporter_delegatelambda00.IconCompatParcelizer((RecyclerView) null);
            this.fullyDrawnReporter_delegatelambda00 = null;
        } else {
            recycler.serializer.clear();
            recycler.IconCompatParcelizer();
        }
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        ((resizeGraphicFrameIfAppropriatelambda0) childHelper.write).serializer();
        ArrayList arrayList = (ArrayList) childHelper.read;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = RecyclerView.this;
            if (size < 0) {
                break;
            }
            ViewHolder childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.fullyDrawnReporter_delegatelambda00 = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.ensureViewModelStore != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(layoutManager);
                getOffVariationName.serializer(sb, " is already attached to a RecyclerView:", layoutManager.ensureViewModelStore.exceptionLabel());
                return;
            } else {
                layoutManager.IconCompatParcelizer(this);
                if (this.accessensureViewModelStore) {
                    LayoutManager layoutManager4 = this.fullyDrawnReporter_delegatelambda00;
                    layoutManager4._init_lambda3 = true;
                    layoutManager4.serializer(this);
                }
            }
        }
        recycler.RemoteActionCompatParcelizer();
        requestLayout();
    }

    public void setScrollState(int i) {
        LinearSmoothScroller linearSmoothScroller;
        if (i == this.onConfigurationChanged) {
            return;
        }
        if (MediaDescriptionCompat) {
            new Exception();
        }
        this.onConfigurationChanged = i;
        if (i != 2) {
            ViewFlinger viewFlinger = this.onPreparePanel;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.write.abortAnimation();
            LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
            if (layoutManager != null && (linearSmoothScroller = layoutManager.addObserverForBackInvoker) != null) {
                linearSmoothScroller.RemoteActionCompatParcelizer();
            }
        }
        LayoutManager layoutManager2 = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager2 != null) {
            layoutManager2.PlaybackStateCompat(i);
        }
        BlurEffect blurEffect = this.getLifecycle;
        if (blurEffect != null) {
            blurEffect.RemoteActionCompatParcelizer(this, i);
        }
        ArrayList arrayList = this.onBackPressed;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((BlurEffect) this.onBackPressed.get(size)).RemoteActionCompatParcelizer(this, i);
            }
        }
    }

    public final void smoothScrollToPosition(int i) {
        if (this.addContentView) {
            return;
        }
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager == null) {
            SentryLogcatAdapter.serializer("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.IconCompatParcelizer(this, i);
        }
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().serializer(i, 0);
    }

    public final void stopInterceptRequestLayout(boolean z) {
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw < 1) {
            if (MediaSessionCompatQueueItem) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(exceptionLabel()));
                return;
            }
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 1;
        }
        if (!z && !this.addContentView) {
            this.onBackPressedDispatcher_delegatelambda00 = false;
        }
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == 1) {
            if (z && this.onBackPressedDispatcher_delegatelambda00 && !this.addContentView && this.fullyDrawnReporter_delegatelambda00 != null && this.MediaSessionCompatResultReceiverWrapper != null) {
                dispatchLayout();
            }
            if (!this.addContentView) {
                this.onBackPressedDispatcher_delegatelambda00 = false;
            }
        }
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw--;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().serializer(0);
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private FocusPropertiesonExit1 getScrollingChildHelper() {
        if (this.invalidateMenu == null) {
            this.invalidateMenu = new FocusPropertiesonExit1(this);
        }
        return this.invalidateMenu;
    }

    public final void addItemDecoration(ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            layoutManager.read("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.addObserverForBackInvokerlambda0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(itemDecoration);
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public final void addOnScrollListener(BlurEffect blurEffect) {
        if (this.onBackPressed == null) {
            this.onBackPressed = new ArrayList();
        }
        this.onBackPressed.add(blurEffect);
    }

    public final ViewHolder findViewHolderForAdapterPosition(int i) {
        ViewHolder viewHolder = null;
        if (this.ResultReceiver) {
            return null;
        }
        ChildHelper childHelper = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iWrite = childHelper.write();
        for (int i2 = 0; i2 < iWrite; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(childHelper.write(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!((ArrayList) childHelper.read).contains(childViewHolderInt.MediaSessionCompatQueueItem)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:163:0x0208  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    public final boolean fling(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ?? r1;
        int minFlingVelocity;
        boolean z;
        int iRemoteActionCompatParcelizer;
        getSoftlight0nO6VwU getsoftlight0no6vwuRemoteActionCompatParcelizer;
        PointF pointFMediaMetadataCompat;
        int i7;
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager == null) {
            SentryLogcatAdapter.serializer("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.addContentView) {
            return false;
        }
        boolean zRatingCompat = layoutManager.RatingCompat();
        boolean zMediaBrowserCompatMediaItem = this.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem();
        int iMax = (!zRatingCompat || Math.abs(i) < i3) ? 0 : i;
        int iMax2 = (!zMediaBrowserCompatMediaItem || Math.abs(i2) < i3) ? 0 : i2;
        if (iMax == 0 && iMax2 == 0) {
            return false;
        }
        if (iMax == 0) {
            i5 = iMax;
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.onBackPressedInput_delegatelambda0;
            if (edgeEffect != null && BuildersKt.write(edgeEffect) != 0.0f) {
                int i8 = -iMax;
                if (shouldAbsorb(this.onBackPressedInput_delegatelambda0, i8, getWidth())) {
                    this.onBackPressedInput_delegatelambda0.onAbsorb(i8);
                    iMax = 0;
                }
            } else {
                EdgeEffect edgeEffect2 = this.getViewModelStore;
                if (edgeEffect2 == null || BuildersKt.write(edgeEffect2) == 0.0f) {
                    i5 = iMax;
                    iMax = 0;
                } else if (shouldAbsorb(this.getViewModelStore, iMax, getWidth())) {
                    this.getViewModelStore.onAbsorb(iMax);
                    iMax = 0;
                }
            }
            i5 = 0;
        }
        if (iMax2 == 0) {
            i6 = iMax2;
            iMax2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.onCreate;
            if (edgeEffect3 != null && BuildersKt.write(edgeEffect3) != 0.0f) {
                int i9 = -iMax2;
                if (shouldAbsorb(this.onCreate, i9, getHeight())) {
                    this.onCreate.onAbsorb(i9);
                    iMax2 = 0;
                }
            } else {
                EdgeEffect edgeEffect4 = this.MediaSessionCompatToken;
                if (edgeEffect4 == null || BuildersKt.write(edgeEffect4) == 0.0f) {
                    i6 = iMax2;
                    iMax2 = 0;
                } else if (shouldAbsorb(this.MediaSessionCompatToken, iMax2, getHeight())) {
                    this.MediaSessionCompatToken.onAbsorb(iMax2);
                    iMax2 = 0;
                }
            }
            i6 = 0;
        }
        ViewFlinger viewFlinger = this.onPreparePanel;
        if (iMax != 0 || iMax2 != 0) {
            int i10 = -i4;
            iMax = Math.max(i10, Math.min(iMax, i4));
            iMax2 = Math.max(i10, Math.min(iMax2, i4));
            startNestedScrollForType(1);
            viewFlinger.read(iMax, iMax2);
        }
        if (i5 == 0 && i6 == 0) {
            return (iMax == 0 && iMax2 == 0) ? false : true;
        }
        float f = i5;
        float f2 = i6;
        if (dispatchNestedPreFling(f, f2)) {
            return false;
        }
        boolean z2 = zRatingCompat || zMediaBrowserCompatMediaItem;
        dispatchNestedFling(f, f2, z2);
        getLayerBlock getlayerblock = this.addOnPictureInPictureUiStateChangedListener;
        if (getlayerblock != null) {
            PagerSnapHelper pagerSnapHelper = (PagerSnapHelper) getlayerblock;
            LayoutManager layoutManager2 = pagerSnapHelper.read.getLayoutManager();
            if (layoutManager2 == 0 || pagerSnapHelper.read.getAdapter() == null || ((Math.abs(i6) <= (minFlingVelocity = pagerSnapHelper.read.getMinFlingVelocity()) && Math.abs(i5) <= minFlingVelocity) || !((z = layoutManager2 instanceof applyToPq9zytI)))) {
                r1 = 1;
            } else {
                getSrcOver0nO6VwU getsrcover0no6vwu = !z ? null : new getSrcOver0nO6VwU(pagerSnapHelper, pagerSnapHelper.read.getContext());
                if (getsrcover0no6vwu == null) {
                    r1 = 1;
                } else {
                    int iResultReceiver = layoutManager2.ResultReceiver();
                    if (iResultReceiver != 0) {
                        if (layoutManager2.MediaBrowserCompatMediaItem()) {
                            getsoftlight0no6vwuRemoteActionCompatParcelizer = pagerSnapHelper.RemoteActionCompatParcelizer(layoutManager2);
                        } else {
                            getsoftlight0no6vwuRemoteActionCompatParcelizer = layoutManager2.RatingCompat() ? pagerSnapHelper.read(layoutManager2) : null;
                        }
                        if (getsoftlight0no6vwuRemoteActionCompatParcelizer == null) {
                            iRemoteActionCompatParcelizer = -1;
                        } else {
                            int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = layoutManager2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                            int i11 = 0;
                            int i12 = Integer.MIN_VALUE;
                            int i13 = Integer.MAX_VALUE;
                            View view = null;
                            View view2 = null;
                            while (i11 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                                View viewMediaSessionCompatResultReceiverWrapper = layoutManager2.MediaSessionCompatResultReceiverWrapper(i11);
                                if (viewMediaSessionCompatResultReceiverWrapper == null) {
                                    i7 = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                } else {
                                    i7 = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                    int iRemoteActionCompatParcelizer2 = PagerSnapHelper.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper, getsoftlight0no6vwuRemoteActionCompatParcelizer);
                                    if (iRemoteActionCompatParcelizer2 <= 0 && iRemoteActionCompatParcelizer2 > i12) {
                                        view = viewMediaSessionCompatResultReceiverWrapper;
                                        i12 = iRemoteActionCompatParcelizer2;
                                    }
                                    if (iRemoteActionCompatParcelizer2 >= 0 && iRemoteActionCompatParcelizer2 < i13) {
                                        view2 = viewMediaSessionCompatResultReceiverWrapper;
                                        i13 = iRemoteActionCompatParcelizer2;
                                    }
                                }
                                i11++;
                                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i7;
                            }
                            boolean z3 = !layoutManager2.RatingCompat() ? i6 <= 0 : i5 <= 0;
                            if (z3 && view2 != null) {
                                iRemoteActionCompatParcelizer = LayoutManager.RemoteActionCompatParcelizer(view2);
                            } else if (z3 || view == null) {
                                if (!z3) {
                                    view = view2;
                                }
                                if (view == null) {
                                    iRemoteActionCompatParcelizer = -1;
                                } else {
                                    iRemoteActionCompatParcelizer = ((z && (pointFMediaMetadataCompat = ((applyToPq9zytI) layoutManager2).MediaMetadataCompat(layoutManager2.ResultReceiver() - 1)) != null && ((pointFMediaMetadataCompat.x > 0.0f ? 1 : (pointFMediaMetadataCompat.x == 0.0f ? 0 : -1)) < 0 || (pointFMediaMetadataCompat.y > 0.0f ? 1 : (pointFMediaMetadataCompat.y == 0.0f ? 0 : -1)) < 0)) == z3 ? -1 : 1) + LayoutManager.RemoteActionCompatParcelizer(view);
                                    if (iRemoteActionCompatParcelizer < 0 || iRemoteActionCompatParcelizer >= iResultReceiver) {
                                        iRemoteActionCompatParcelizer = -1;
                                    }
                                }
                            } else {
                                iRemoteActionCompatParcelizer = LayoutManager.RemoteActionCompatParcelizer(view);
                            }
                        }
                    } else {
                        iRemoteActionCompatParcelizer = -1;
                    }
                    if (iRemoteActionCompatParcelizer != -1) {
                        getsrcover0no6vwu.MediaSessionCompatResultReceiverWrapper = iRemoteActionCompatParcelizer;
                        layoutManager2.write(getsrcover0no6vwu);
                        return true;
                    }
                    r1 = 1;
                }
            }
        } else {
            r1 = 1;
        }
        if (!z2) {
            return false;
        }
        startNestedScrollForType(r1);
        int i14 = -i4;
        viewFlinger.read(Math.max(i14, Math.min(i5, i4)), Math.max(i14, Math.min(i6, i4)));
        return r1;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x015c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160  */
    /* JADX WARN: Code duplicated, block: B:115:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:119:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:126:0x017d  */
    /* JADX WARN: Code duplicated, block: B:127:0x017f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0183  */
    /* JADX WARN: Code duplicated, block: B:131:0x0185  */
    /* JADX WARN: Code duplicated, block: B:132:0x0187  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:79:0x0110  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0164, code lost:
    
        if (r16 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0172, code lost:
    
        if (r5 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0175, code lost:
    
        if (r16 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0178, code lost:
    
        if (r5 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0180, code lost:
    
        if ((r5 * r6) <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0188, code lost:
    
        if ((r5 * r6) >= 0) goto L135;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void jumpToPositionForSmoothScroller(int i) {
        if (this.fullyDrawnReporter_delegatelambda00 == null) {
            return;
        }
        setScrollState(2);
        this.fullyDrawnReporter_delegatelambda00.RatingCompat(i);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                DrawableTransformation.read(sb, (Object) exceptionLabel());
                return;
            }
        } else if (MediaSessionCompatQueueItem) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            DrawableTransformation.read(sb2, (Object) exceptionLabel());
            return;
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public final void removeItemDecoration(ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            layoutManager.read("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.addObserverForBackInvokerlambda0;
        arrayList.remove(itemDecoration);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.addContentView) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.addContentView = true;
                this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
                stopScroll();
                return;
            }
            this.addContentView = false;
            if (this.onBackPressedDispatcher_delegatelambda00 && this.fullyDrawnReporter_delegatelambda00 != null && this.MediaSessionCompatResultReceiverWrapper != null) {
                requestLayout();
            }
            this.onBackPressedDispatcher_delegatelambda00 = false;
        }
    }

    public final void fillRemainingScrollValues(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (getScrollState() != 2) {
            getintrinsicsizenhjbrc.getClass();
            return;
        }
        OverScroller overScroller = this.onPreparePanel.write;
        overScroller.getFinalX();
        overScroller.getCurrX();
        getintrinsicsizenhjbrc.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final int releaseHorizontalGlow(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.onBackPressedInput_delegatelambda0;
        float f2 = 0.0f;
        if (edgeEffect == null || BuildersKt.write(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.getViewModelStore;
            if (edgeEffect2 != null && BuildersKt.write(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.getViewModelStore;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fWrite = BuildersKt.write(edgeEffect3, width, height);
                    if (BuildersKt.write(this.getViewModelStore) == 0.0f) {
                        this.getViewModelStore.onRelease();
                    }
                    f2 = fWrite;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.onBackPressedInput_delegatelambda0;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -BuildersKt.write(edgeEffect4, -width, 1.0f - height);
                if (BuildersKt.write(this.onBackPressedInput_delegatelambda0) == 0.0f) {
                    this.onBackPressedInput_delegatelambda0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final int releaseVerticalGlow$1(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.onCreate;
        float f2 = 0.0f;
        if (edgeEffect == null || BuildersKt.write(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.MediaSessionCompatToken;
            if (edgeEffect2 != null && BuildersKt.write(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.MediaSessionCompatToken;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fWrite = BuildersKt.write(edgeEffect3, height, 1.0f - width);
                    if (BuildersKt.write(this.MediaSessionCompatToken) == 0.0f) {
                        this.MediaSessionCompatToken.onRelease();
                    }
                    f2 = fWrite;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.onCreate;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -BuildersKt.write(edgeEffect4, -height, width);
                if (BuildersKt.write(this.onCreate) == 0.0f) {
                    this.onCreate.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.fullyDrawnReporter_delegatelambda00.requestChildRectangleOnScreen(this, view, rect, z, false);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0386  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Class[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException {
        ?? r15;
        boolean z;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i);
        this.addOnConfigurationChangedListener = new invalidateLayerBlock(this);
        this.getLastCustomNonConfigurationInstance = new Recycler();
        this.onRetainNonConfigurationInstance = new verticalGradient8A3gB4(0);
        this.onPictureInPictureModeChanged = new getSrcAtop0nO6VwU(this, 0);
        this.onMultiWindowModeChanged = new Rect();
        this.onNewIntent = new Rect();
        this.onMenuItemSelected = new RectF();
        this.getDefaultViewModelProviderFactory = new ArrayList();
        this.addObserverForBackInvokerlambda0 = new ArrayList();
        this.addOnPictureInPictureModeChangedListener = new ArrayList();
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 0;
        this.ResultReceiver = false;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = false;
        this.menuHostHelperlambda0 = 0;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = MediaMetadataCompat;
        accessgetSoftlightcp accessgetsoftlightcp = new accessgetSoftlightcp();
        accessgetsoftlightcp.ResultReceiver = null;
        accessgetsoftlightcp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new ArrayList();
        accessgetsoftlightcp.MediaSessionCompatResultReceiverWrapper = 120L;
        accessgetsoftlightcp.ComponentActivity = 120L;
        accessgetsoftlightcp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 250L;
        accessgetsoftlightcp.PlaybackStateCompat = 250L;
        int i2 = 1;
        accessgetsoftlightcp.PlaybackStateCompatCustomAction = true;
        accessgetsoftlightcp.MediaSessionCompatToken = new ArrayList();
        accessgetsoftlightcp.MediaDescriptionCompat = new ArrayList();
        accessgetsoftlightcp.RatingCompat = new ArrayList();
        accessgetsoftlightcp.MediaMetadataCompat = new ArrayList();
        accessgetsoftlightcp.serializer = new ArrayList();
        accessgetsoftlightcp.MediaSessionCompatQueueItem = new ArrayList();
        accessgetsoftlightcp.read = new ArrayList();
        accessgetsoftlightcp.write = new ArrayList();
        accessgetsoftlightcp.MediaBrowserCompatMediaItem = new ArrayList();
        accessgetsoftlightcp.ParcelableVolumeInfo = new ArrayList();
        accessgetsoftlightcp.IconCompatParcelizer = new ArrayList();
        this._init_lambda1 = accessgetsoftlightcp;
        this.onConfigurationChanged = 0;
        this.onActivityResult = -1;
        this.getSavedStateRegistry = Float.MIN_VALUE;
        this.getOnBackPressedDispatcher = Float.MIN_VALUE;
        this.getActivityResultRegistry = true;
        this.onPreparePanel = new ViewFlinger();
        this.getDefaultViewModelCreationExtras = IconCompatParcelizer ? new isActive(i2) : null;
        getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = new getIntrinsicSizeNHjbRc();
        getintrinsicsizenhjbrc.PlaybackStateCompat = -1;
        getintrinsicsizenhjbrc.MediaSessionCompatQueueItem = 0;
        getintrinsicsizenhjbrc.serializer = 0;
        getintrinsicsizenhjbrc.MediaMetadataCompat = 1;
        getintrinsicsizenhjbrc.MediaDescriptionCompat = 0;
        getintrinsicsizenhjbrc.PlaybackStateCompatCustomAction = false;
        getintrinsicsizenhjbrc.write = false;
        getintrinsicsizenhjbrc.MediaSessionCompatResultReceiverWrapper = false;
        getintrinsicsizenhjbrc.RatingCompat = false;
        getintrinsicsizenhjbrc.ParcelableVolumeInfo = false;
        getintrinsicsizenhjbrc.MediaBrowserCompatMediaItem = false;
        this.onCreatePanelMenu = getintrinsicsizenhjbrc;
        this.addObserverForBackInvoker = false;
        this.ensureViewModelStore = false;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7();
        this._init_lambda4 = anonymousClass7;
        this.getFullyDrawnReporter = false;
        this.addOnContextAvailableListener = new int[2];
        this.initializeViewTreeOwners = new int[2];
        this.addOnNewIntentListener = new int[2];
        this.getNavigationEventDispatcher = new int[2];
        this.addOnTrimMemoryListener = new ArrayList();
        this._init_lambda3 = new getSrcAtop0nO6VwU(this, i2);
        this.createFullyDrawnExecutor = 0;
        this.defaultViewModelProviderFactory_delegatelambda0 = 0;
        this.onRequestPermissionsResult = new AnonymousClass7();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new getEnterannotations(getContext(), new AnonymousClass7());
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.onPanelClosed = viewConfiguration.getScaledTouchSlop();
        this.getSavedStateRegistry = viewConfiguration.getScaledHorizontalScrollFactor();
        this.getOnBackPressedDispatcher = viewConfiguration.getScaledVerticalScrollFactor();
        this.addOnMultiWindowModeChangedListener = viewConfiguration.getScaledMinimumFlingVelocity();
        this.onBackPressedDispatcher_delegatelambda010 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.enterPictureInPictureMode = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this._init_lambda1.ResultReceiver = anonymousClass7;
        this.ParcelableVolumeInfo = new accessgetModulatecp(new AnonymousClass7());
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ChildHelper(new AnonymousClass7());
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (freeFocus.write(this) == 0) {
            freeFocus.serializer(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.PlaybackStateCompatCustomAction = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new verticalGradient8A3gB4default(this));
        int[] iArr = accessgetLightencp.RecyclerView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        FocusPropertiesNode.IconCompatParcelizer(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(Fields.ColorFilter);
        }
        this.ComponentActivity = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Trying to set fast scroller without both required drawables.".concat(exceptionLabel()));
                throw null;
            }
            Resources resources = getContext().getResources();
            r15 = 0;
            new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.logistics.rider.glovo.R.dimen.fastscroll_margin));
        } else {
            r15 = 0;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.onBackPressedDispatcher_delegatelambda0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (strTrim.isEmpty()) {
                z = true;
            } else {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LayoutManager.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(read);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        z = true;
                        try {
                            objArr2[1] = attributeSet;
                            objArr2[2] = Integer.valueOf(i);
                            objArr2[3] = 0;
                            constructor = constructor2;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e) {
                            e = e;
                            NoSuchMethodException noSuchMethodException = e;
                            try {
                                objArr = r15;
                                constructor = clsAsSubclass.getConstructor(r15);
                            } catch (NoSuchMethodException e2) {
                                e2.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e2);
                            }
                        }
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        z = true;
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    seekAnimationsanimation_core.RemoteActionCompatParcelizer(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", strTrim, e4);
                    throw r15;
                } catch (ClassNotFoundException e5) {
                    seekAnimationsanimation_core.RemoteActionCompatParcelizer(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", strTrim, e5);
                    throw r15;
                } catch (IllegalAccessException e6) {
                    seekAnimationsanimation_core.RemoteActionCompatParcelizer(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", strTrim, e6);
                    throw r15;
                } catch (InstantiationException e7) {
                    seekAnimationsanimation_core.RemoteActionCompatParcelizer(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", strTrim, e7);
                    throw r15;
                } catch (InvocationTargetException e8) {
                    seekAnimationsanimation_core.RemoteActionCompatParcelizer(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", strTrim, e8);
                    throw r15;
                }
            }
        } else {
            z = true;
        }
        int[] iArr2 = RemoteActionCompatParcelizer;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        FocusPropertiesNode.IconCompatParcelizer(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, z);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.logistics.rider.glovo.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public final void assertNotInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg > 0) {
                SentryLogcatAdapter.write("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(exceptionLabel()));
            }
        } else if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(exceptionLabel()));
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        LayoutManager layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager != null) {
            if (layoutManager.MediaBrowserCompatMediaItem()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        smoothScrollBy$1(0, measuredHeight, false);
                        return true;
                    }
                    smoothScrollBy$1(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zParcelableVolumeInfo = layoutManager.ParcelableVolumeInfo();
                    if (keyCode == 122) {
                        if (zParcelableVolumeInfo) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!zParcelableVolumeInfo) {
                        itemCount = getAdapter().getItemCount();
                    }
                    smoothScrollToPosition(itemCount);
                    return true;
                }
            } else if (layoutManager.RatingCompat()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        smoothScrollBy$1(measuredWidth, 0, false);
                        return true;
                    }
                    smoothScrollBy$1(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zParcelableVolumeInfo2 = layoutManager.ParcelableVolumeInfo();
                    if (keyCode2 == 122) {
                        if (zParcelableVolumeInfo2) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!zParcelableVolumeInfo2) {
                        itemCount = getAdapter().getItemCount();
                    }
                    smoothScrollToPosition(itemCount);
                    return true;
                }
            }
        }
        return false;
    }

    public final View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.addContentView) {
            this._init_lambda2 = null;
            if (findInterceptingOnItemTouchListener(motionEvent)) {
                VelocityTracker velocityTracker = this.onPictureInPictureUiStateChanged;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                stopNestedScroll(0);
                releaseGlows();
                setScrollState(0);
                return true;
            }
            LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
            if (layoutManager != null) {
                boolean zRatingCompat = layoutManager.RatingCompat();
                boolean zMediaBrowserCompatMediaItem = this.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem();
                if (this.onPictureInPictureUiStateChanged == null) {
                    this.onPictureInPictureUiStateChanged = VelocityTracker.obtain();
                }
                this.onPictureInPictureUiStateChanged.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) {
                        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = false;
                    }
                    this.onActivityResult = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.getOnBackPressedInput = x;
                    this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.fullyDrawnReporter_delegatelambda0 = y;
                    this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = y;
                    EdgeEffect edgeEffect = this.onBackPressedInput_delegatelambda0;
                    if (edgeEffect == null || BuildersKt.write(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        BuildersKt.write(this.onBackPressedInput_delegatelambda0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.getViewModelStore;
                    if (edgeEffect2 != null && BuildersKt.write(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        BuildersKt.write(this.getViewModelStore, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.onCreate;
                    if (edgeEffect3 != null && BuildersKt.write(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        BuildersKt.write(this.onCreate, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.MediaSessionCompatToken;
                    if (edgeEffect4 == null || BuildersKt.write(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                        if (z || this.onConfigurationChanged == 2) {
                        }
                        int[] iArr = this.addOnNewIntentListener;
                        iArr[1] = 0;
                        iArr[0] = 0;
                        startNestedScrollForType(0);
                    } else {
                        BuildersKt.write(this.MediaSessionCompatToken, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    stopNestedScroll(1);
                    int[] iArr2 = this.addOnNewIntentListener;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    startNestedScrollForType(0);
                } else if (actionMasked == 1) {
                    this.onPictureInPictureUiStateChanged.clear();
                    stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.onActivityResult);
                    if (iFindPointerIndex < 0) {
                        SentryLogcatAdapter.serializer("RecyclerView", "Error processing scroll; pointer index for id " + this.onActivityResult + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.onConfigurationChanged != 1) {
                        int i = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                        int i2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                        if (!zRatingCompat || Math.abs(x2 - i) <= this.onPanelClosed) {
                            z2 = false;
                        } else {
                            this.getOnBackPressedInput = x2;
                            z2 = true;
                        }
                        if (zMediaBrowserCompatMediaItem && Math.abs(y2 - i2) > this.onPanelClosed) {
                            this.fullyDrawnReporter_delegatelambda0 = y2;
                        } else if (z2) {
                        }
                        setScrollState(1);
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.onPictureInPictureUiStateChanged;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    stopNestedScroll(0);
                    releaseGlows();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.onActivityResult = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.getOnBackPressedInput = x3;
                    this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.fullyDrawnReporter_delegatelambda0 = y3;
                    this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = y3;
                } else if (actionMasked == 6) {
                    onPointerUp(motionEvent);
                }
                if (this.onConfigurationChanged == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager == null) {
            SentryLogcatAdapter.serializer("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.addContentView) {
            return;
        }
        boolean zRatingCompat = layoutManager.RatingCompat();
        boolean zMediaBrowserCompatMediaItem = this.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem();
        if (zRatingCompat || zMediaBrowserCompatMediaItem) {
            if (!zRatingCompat) {
                i = 0;
            }
            if (!zMediaBrowserCompatMediaItem) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:34:0x0106  */
    /* JADX WARN: Code duplicated, block: B:42:0x0119  */
    public final boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        consumePendingUpdateOperations();
        Adapter adapter = this.MediaSessionCompatResultReceiverWrapper;
        int[] iArr = this.getNavigationEventDispatcher;
        if (adapter != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(iArr, i, i2);
            int i8 = iArr[0];
            int i9 = iArr[1];
            i5 = i8;
            i4 = i9;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.addObserverForBackInvokerlambda0.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        int i10 = i4;
        dispatchNestedScroll(i5, i4, i6, i7, this.initializeViewTreeOwners, i3, iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        boolean z2 = (i11 == 0 && i12 == 0) ? false : true;
        int i13 = this.getOnBackPressedInput;
        int[] iArr2 = this.initializeViewTreeOwners;
        int i14 = iArr2[0];
        this.getOnBackPressedInput = i13 - i14;
        int i15 = this.fullyDrawnReporter_delegatelambda0;
        int i16 = iArr2[1];
        this.fullyDrawnReporter_delegatelambda0 = i15 - i16;
        int[] iArr3 = this.addOnNewIntentListener;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !serializer.write(motionEvent, 8194)) {
                float x = motionEvent.getX();
                float f = i6 - i11;
                float y = motionEvent.getY();
                float f2 = i7 - i12;
                if (f < 0.0f) {
                    ensureLeftGlow();
                    BuildersKt.write(this.onBackPressedInput_delegatelambda0, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    if (f > 0.0f) {
                        ensureRightGlow();
                        BuildersKt.write(this.getViewModelStore, f / getWidth(), y / getHeight());
                    } else {
                        z = false;
                    }
                    if (f2 < 0.0f) {
                        ensureTopGlow();
                        BuildersKt.write(this.onCreate, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        ensureBottomGlow();
                        BuildersKt.write(this.MediaSessionCompatToken, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (!z || f != 0.0f || f2 != 0.0f) {
                        }
                        if (Build.VERSION.SDK_INT >= 31 && serializer.write(motionEvent, 4194304)) {
                            releaseGlows();
                        }
                    }
                    postInvalidateOnAnimation();
                    if (Build.VERSION.SDK_INT >= 31) {
                        releaseGlows();
                    }
                }
                z = true;
                if (f2 < 0.0f) {
                    ensureTopGlow();
                    BuildersKt.write(this.onCreate, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    ensureBottomGlow();
                    BuildersKt.write(this.MediaSessionCompatToken, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (!z) {
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        releaseGlows();
                    }
                }
                postInvalidateOnAnimation();
                if (Build.VERSION.SDK_INT >= 31) {
                    releaseGlows();
                }
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i10 != 0) {
            dispatchOnScrolled(i5, i10);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i10 == 0) ? false : true;
    }

    public final void smoothScrollBy$1(int i, int i2, boolean z) {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager == null) {
            SentryLogcatAdapter.serializer("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.addContentView) {
            return;
        }
        if (!layoutManager.RatingCompat()) {
            i = 0;
        }
        if (!this.fullyDrawnReporter_delegatelambda00.MediaBrowserCompatMediaItem()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().serializer(i3, 1);
        }
        this.onPreparePanel.write(i, i2, Integer.MIN_VALUE, null);
    }

    public static int consumeFlingInStretch(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && BuildersKt.write(edgeEffect) != 0.0f) {
            int iRound = Math.round(BuildersKt.write(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || BuildersKt.write(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(BuildersKt.write(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().serializer(iArr, i, iArr2, i2, 0);
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public final void stopNestedScroll(int i) {
        getScrollingChildHelper().serializer(i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.MediaSessionCompatToken = null;
        this.onCreate = null;
        this.getViewModelStore = null;
        this.onBackPressedInput_delegatelambda0 = null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().serializer(i, i2, i3, i4, iArr, 0, null);
    }

    public final ViewHolder getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        getOffVariationName.read("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final boolean dispatchNestedPreScroll(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        return getScrollingChildHelper().serializer(iArr, i, iArr2, i2, i3);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().serializer(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.fullyDrawnReporter_delegatelambda00;
        if (layoutManager != null) {
            return layoutManager.read(layoutParams);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("RecyclerView has no LayoutManager".concat(exceptionLabel()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.logistics.rider.glovo.R.attr.recyclerViewStyle);
    }
}
