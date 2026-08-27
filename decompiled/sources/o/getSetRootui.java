package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.LinearInterpolator;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.datepicker.MaterialCalendar;
import io.sentry.SentryUUID;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getSetRootui {
    public int ComponentActivity;
    public final int MediaBrowserCompatMediaItem;
    public final TimeInterpolator MediaMetadataCompat;
    public final android.view.accessibility.AccessibilityManager MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public final TimeInterpolator MediaSessionCompatToken;
    public final TimeInterpolator PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public int ResultReceiver;
    public final Context r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final fastForEach r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final ViewGroup r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final SubcomposeSlotReusePolicySlotIdsSet r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public static final restore IconCompatParcelizer = handleMotionFrameOfReferencePlacement.RemoteActionCompatParcelizer;
    public static final LinearInterpolator write = handleMotionFrameOfReferencePlacement.write;
    public static final restore read = handleMotionFrameOfReferencePlacement.IconCompatParcelizer;
    public static final int[] serializer = {com.logistics.rider.glovo.R.attr.snackbarStyle};
    public static final String RemoteActionCompatParcelizer = "BaseTransientBottomBar";
    public static final Handler MediaDescriptionCompat = new Handler(Looper.getMainLooper(), new SubcomposeLayoutStatesetMeasurePolicy1());
    public final SubcomposeLayoutStatePrecomposedSlotHandle ParcelableVolumeInfo = new SubcomposeLayoutStatePrecomposedSlotHandle(this, 0);
    public final SubcomposeMeasureScope r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new SubcomposeMeasureScope(this);

    public final void MediaSessionCompatQueueItem() {
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setAnimationMode(0);
    }

    public final Context RemoteActionCompatParcelizer() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public final SubcomposeSlotReusePolicySlotIdsSet read() {
        return this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    }

    public final void MediaBrowserCompatMediaItem() {
        SubcomposeSlotReusePolicySlotIdsSet subcomposeSlotReusePolicySlotIdsSet = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        ViewGroup.LayoutParams layoutParams = subcomposeSlotReusePolicySlotIdsSet.getLayoutParams();
        boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = RemoteActionCompatParcelizer;
        if (!z) {
            SentryLogcatAdapter.IconCompatParcelizer(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (subcomposeSlotReusePolicySlotIdsSet.PlaybackStateCompatCustomAction == null) {
            SentryLogcatAdapter.IconCompatParcelizer(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (subcomposeSlotReusePolicySlotIdsSet.getParent() == null) {
            return;
        }
        int i = this.ComponentActivity;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        android.graphics.Rect rect = subcomposeSlotReusePolicySlotIdsSet.PlaybackStateCompatCustomAction;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        int i4 = rect.right + this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int i5 = rect.top;
        boolean z2 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z2) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            subcomposeSlotReusePolicySlotIdsSet.requestLayout();
        }
        if ((z2 || this.MediaSessionCompatResultReceiverWrapper != this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) && Build.VERSION.SDK_INT >= 29 && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus > 0) {
            ViewGroup.LayoutParams layoutParams2 = subcomposeSlotReusePolicySlotIdsSet.getLayoutParams();
            if ((layoutParams2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) && (((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams2).MediaDescriptionCompat instanceof SwipeDismissBehavior)) {
                SubcomposeLayoutStatePrecomposedSlotHandle subcomposeLayoutStatePrecomposedSlotHandle = this.ParcelableVolumeInfo;
                subcomposeSlotReusePolicySlotIdsSet.removeCallbacks(subcomposeLayoutStatePrecomposedSlotHandle);
                subcomposeSlotReusePolicySlotIdsSet.post(subcomposeLayoutStatePrecomposedSlotHandle);
            }
        }
    }

    public final void MediaMetadataCompat() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        android.view.accessibility.AccessibilityManager accessibilityManager = this.MediaSessionCompatQueueItem;
        boolean z = true;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        SubcomposeSlotReusePolicySlotIdsSet subcomposeSlotReusePolicySlotIdsSet = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (z) {
            subcomposeSlotReusePolicySlotIdsSet.post(new SubcomposeLayoutStatePrecomposedSlotHandle(this, 2));
            return;
        }
        if (subcomposeSlotReusePolicySlotIdsSet.getParent() != null) {
            subcomposeSlotReusePolicySlotIdsSet.setVisibility(0);
        }
        IconCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        androidx.transition.TransitionValuesMaps transitionValuesMapsMediaDescriptionCompat = androidx.transition.TransitionValuesMaps.MediaDescriptionCompat();
        SubcomposeMeasureScope subcomposeMeasureScope = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        synchronized (transitionValuesMapsMediaDescriptionCompat.MediaBrowserCompatMediaItem) {
            if (transitionValuesMapsMediaDescriptionCompat.IconCompatParcelizer(subcomposeMeasureScope)) {
                transitionValuesMapsMediaDescriptionCompat.RemoteActionCompatParcelizer((forEach) transitionValuesMapsMediaDescriptionCompat.MediaMetadataCompat);
            }
        }
    }

    public final void IconCompatParcelizer(int i) {
        androidx.transition.TransitionValuesMaps transitionValuesMapsMediaDescriptionCompat = androidx.transition.TransitionValuesMaps.MediaDescriptionCompat();
        SubcomposeMeasureScope subcomposeMeasureScope = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        synchronized (transitionValuesMapsMediaDescriptionCompat.MediaBrowserCompatMediaItem) {
            if (transitionValuesMapsMediaDescriptionCompat.IconCompatParcelizer(subcomposeMeasureScope)) {
                transitionValuesMapsMediaDescriptionCompat.read((forEach) transitionValuesMapsMediaDescriptionCompat.MediaMetadataCompat, i);
            } else {
                forEach foreach = (forEach) transitionValuesMapsMediaDescriptionCompat.RatingCompat;
                if (foreach != null && foreach.read.get() == subcomposeMeasureScope) {
                    transitionValuesMapsMediaDescriptionCompat.read((forEach) transitionValuesMapsMediaDescriptionCompat.RatingCompat, i);
                }
            }
        }
    }

    public final void write() {
        androidx.transition.TransitionValuesMaps transitionValuesMapsMediaDescriptionCompat = androidx.transition.TransitionValuesMaps.MediaDescriptionCompat();
        SubcomposeMeasureScope subcomposeMeasureScope = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        synchronized (transitionValuesMapsMediaDescriptionCompat.MediaBrowserCompatMediaItem) {
            if (transitionValuesMapsMediaDescriptionCompat.IconCompatParcelizer(subcomposeMeasureScope)) {
                transitionValuesMapsMediaDescriptionCompat.MediaMetadataCompat = null;
                if (((forEach) transitionValuesMapsMediaDescriptionCompat.RatingCompat) != null) {
                    transitionValuesMapsMediaDescriptionCompat.MediaSessionCompatToken();
                }
            }
        }
        ViewParent parent = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        }
    }

    public getSetRootui(Context context, ViewGroup viewGroup, View view, fastForEach fastforeach) {
        if (view == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Transient bottom bar must have non-null content");
            throw null;
        }
        if (fastforeach == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = viewGroup;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fastforeach;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = context;
        getDeactivateOutOfFrameNjRlDlw.read(context, getDeactivateOutOfFrameNjRlDlw.serializer, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(serializer);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        SubcomposeSlotReusePolicySlotIdsSet subcomposeSlotReusePolicySlotIdsSet = (SubcomposeSlotReusePolicySlotIdsSet) layoutInflaterFrom.inflate(resourceId != -1 ? com.logistics.rider.glovo.R.layout.mtrl_layout_snackbar : com.logistics.rider.glovo.R.layout.design_layout_snackbar, viewGroup, false);
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = subcomposeSlotReusePolicySlotIdsSet;
        subcomposeSlotReusePolicySlotIdsSet.setBaseTransientBottomBar(this);
        if (view instanceof fastForEach) {
            fastForEach fastforeach2 = (fastForEach) view;
            float actionTextColorAlpha = subcomposeSlotReusePolicySlotIdsSet.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                fastforeach2.RemoteActionCompatParcelizer.setTextColor(mergeRulerValues.write(actionTextColorAlpha, mergeRulerValues.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.attr.colorSurface, fastforeach2), fastforeach2.RemoteActionCompatParcelizer.getCurrentTextColor()));
            }
            fastforeach2.setMaxInlineActionWidth(subcomposeSlotReusePolicySlotIdsSet.getMaxInlineActionWidth());
        }
        subcomposeSlotReusePolicySlotIdsSet.addView(view);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        subcomposeSlotReusePolicySlotIdsSet.setAccessibilityLiveRegion(1);
        subcomposeSlotReusePolicySlotIdsSet.setImportantForAccessibility(1);
        subcomposeSlotReusePolicySlotIdsSet.setFitsSystemWindows(true);
        accessgetCancelcp.write(subcomposeSlotReusePolicySlotIdsSet, new SubcomposeLayoutStatePausedPrecomposition(this));
        FocusPropertiesNode.write(subcomposeSlotReusePolicySlotIdsSet, new MaterialCalendar.AnonymousClass6(6, this));
        this.MediaSessionCompatQueueItem = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        this.PlaybackStateCompatCustomAction = SentryUUID.write(context, com.logistics.rider.glovo.R.attr.motionDurationLong2, 250);
        this.MediaBrowserCompatMediaItem = SentryUUID.write(context, com.logistics.rider.glovo.R.attr.motionDurationLong2, 150);
        this.RatingCompat = SentryUUID.write(context, com.logistics.rider.glovo.R.attr.motionDurationMedium1, 75);
        this.MediaMetadataCompat = SentryUUID.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.motionEasingEmphasizedInterpolator, write);
        this.MediaSessionCompatToken = SentryUUID.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.motionEasingEmphasizedInterpolator, read);
        this.PlaybackStateCompat = SentryUUID.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.motionEasingEmphasizedInterpolator, IconCompatParcelizer);
    }

    public final void serializer() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getRootWindowInsets()) == null) {
            return;
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        MediaBrowserCompatMediaItem();
    }
}
