package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class PlacementScopeMarker extends placeRelativeWithLayer {
    public final FocusRequesterModifierKt IconCompatParcelizer;
    public Window RemoteActionCompatParcelizer;
    public boolean read;
    public final Boolean write;

    @Override // o.placeRelativeWithLayer
    public final void read(int i, View view) {
        serializer(view);
    }

    @Override // o.placeRelativeWithLayer
    public final void read(View view) {
        serializer(view);
    }

    @Override // o.placeRelativeWithLayer
    public final void read(View view, float f) {
        serializer(view);
    }

    public PlacementScopeMarker(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        ColorStateList backgroundTintList;
        this.IconCompatParcelizer = focusRequesterModifierKt;
        SubcomposeSlotReusePolicy materialShapeDrawable = BottomSheetBehavior.from(view).getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            backgroundTintList = materialShapeDrawable.getLifecycle.RemoteActionCompatParcelizer;
        } else {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            backgroundTintList = view.getBackgroundTintList();
        }
        if (backgroundTintList != null) {
            this.write = Boolean.valueOf(mergeRulerValues.IconCompatParcelizer(backgroundTintList.getDefaultColor()));
        } else if (view.getBackground() instanceof ColorDrawable) {
            this.write = Boolean.valueOf(mergeRulerValues.IconCompatParcelizer(((ColorDrawable) view.getBackground()).getColor()));
        } else {
            this.write = null;
        }
    }

    public final void serializer(View view) {
        coil3.util.ContextsKt focusRestorerElement;
        coil3.util.ContextsKt focusRestorerElement2;
        int top = view.getTop();
        FocusRequesterModifierKt focusRequesterModifierKt = this.IconCompatParcelizer;
        if (top < focusRequesterModifierKt.RemoteActionCompatParcelizer()) {
            Window window = this.RemoteActionCompatParcelizer;
            if (window != null) {
                Boolean bool = this.write;
                boolean zBooleanValue = bool == null ? this.read : bool.booleanValue();
                FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    focusRestorerElement2 = new getOnExitannotations(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
                } else {
                    focusRestorerElement2 = i >= 30 ? new FocusRestorerElement(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) : new setFocusRequester(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
                }
                focusRestorerElement2.write(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), focusRequesterModifierKt.RemoteActionCompatParcelizer() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.RemoteActionCompatParcelizer;
            if (window2 != null) {
                boolean z = this.read;
                FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope1 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    focusRestorerElement = new getOnExitannotations(window2, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope1);
                } else {
                    focusRestorerElement = i2 >= 30 ? new FocusRestorerElement(window2, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope1) : new setFocusRequester(window2, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope1);
                }
                focusRestorerElement.write(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void IconCompatParcelizer(Window window) {
        coil3.util.ContextsKt focusRestorerElement;
        if (this.RemoteActionCompatParcelizer == window) {
            return;
        }
        this.RemoteActionCompatParcelizer = window;
        if (window != null) {
            FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                focusRestorerElement = new getOnExitannotations(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
            } else {
                focusRestorerElement = i >= 30 ? new FocusRestorerElement(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) : new setFocusRequester(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
            }
            this.read = focusRestorerElement.RemoteActionCompatParcelizer();
        }
    }
}
