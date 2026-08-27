package com.braze.ui.support;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.WindowInsetsCompat$Impl;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeLogger;
import fwfd.com.fwfsdk.util.FWFHelper;
import o.FocusRequesterModifierKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setEnter;
import o.setRectOutlinetz77jQwdefault;

/* JADX INFO: loaded from: classes.dex */
public final class ViewUtils {
    private static final int TABLET_SMALLEST_WIDTH_DP = 600;
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("ViewUtils");

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$0() {
        return "Current and preferred orientation are landscape.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$1() {
        return "Current and preferred orientation are portrait.";
    }

    public static final void removeViewFromParent(View view) {
        if (view == null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(19), 12, (Object) null);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(20), 8, (Object) null);
                return;
            }
        }
        if ((view != null ? view.getParent() : null) instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            parent.getClass();
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ViewUtils$$ExternalSyntheticLambda6(view, 0, viewGroup), 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$0() {
        return "View passed in is null. Not removing from parent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$2() {
        return "Caught exception while removing view from parent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFocusableInTouchModeAndRequestFocus$lambda$0() {
        return "Caught exception while setting view to focusable in touch mode and requesting focus.";
    }

    public static final double convertDpToPixels(Context context, double d) {
        context.getClass();
        return d * ((double) context.getResources().getDisplayMetrics().density);
    }

    public static final int getMaxSafeBottomInset(FocusRequesterModifierKt focusRequesterModifierKt) {
        focusRequesterModifierKt.getClass();
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
        setEnter displayCutout = windowInsetsCompat$Impl.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.write.getSafeInsetBottom() : 0, windowInsetsCompat$Impl.getInsets(519).serializer);
    }

    public static final int getMaxSafeLeftInset(FocusRequesterModifierKt focusRequesterModifierKt) {
        focusRequesterModifierKt.getClass();
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
        setEnter displayCutout = windowInsetsCompat$Impl.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.write.getSafeInsetLeft() : 0, windowInsetsCompat$Impl.getInsets(519).RemoteActionCompatParcelizer);
    }

    public static final int getMaxSafeRightInset(FocusRequesterModifierKt focusRequesterModifierKt) {
        focusRequesterModifierKt.getClass();
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
        setEnter displayCutout = windowInsetsCompat$Impl.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.write.getSafeInsetRight() : 0, windowInsetsCompat$Impl.getInsets(519).read);
    }

    public static final int getMaxSafeTopInset(FocusRequesterModifierKt focusRequesterModifierKt) {
        focusRequesterModifierKt.getClass();
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
        setEnter displayCutout = windowInsetsCompat$Impl.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.write.getSafeInsetTop() : 0, windowInsetsCompat$Impl.getInsets(519).write);
    }

    public static final int getStatusBarHeight(Context context) {
        context.getClass();
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", FWFHelper.fwfDeviceOS);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final boolean isDeviceInNightMode(Context context) {
        context.getClass();
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean isDeviceNotInTouchMode(View view) {
        view.getClass();
        return !view.isInTouchMode();
    }

    public static final boolean isRunningOnTablet(Activity activity) {
        activity.getClass();
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= TABLET_SMALLEST_WIDTH_DP;
    }

    public static final void setActivityRequestedOrientation(Activity activity, int i) {
        activity.getClass();
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ViewUtils$$ExternalSyntheticLambda1(i, activity, 0), 8, (Object) null);
        }
    }

    public static final void setHeightOnViewLayoutParams(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static final boolean isCurrentOrientationValid(int i, Orientation orientation) {
        orientation.getClass();
        if (i == 2 && orientation == Orientation.LANDSCAPE) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(17), 12, (Object) null);
            return true;
        }
        if (i == 1 && orientation == Orientation.PORTRAIT) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(18), 12, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ViewUtils$$ExternalSyntheticLambda1(i, orientation, 5), 12, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$2(int i, Orientation orientation) {
        return "Current orientation " + i + " and preferred orientation " + orientation + " don't match";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$1(View view, ViewGroup viewGroup) {
        return "Removed view: " + view + "\nfrom parent: " + viewGroup;
    }

    public static final void setFocusableInTouchModeAndRequestFocus(View view) {
        view.getClass();
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(16), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setActivityRequestedOrientation$lambda$0(int i, Activity activity) {
        return "Failed to set requested orientation " + i + " for activity class: " + activity.getLocalClassName();
    }
}
