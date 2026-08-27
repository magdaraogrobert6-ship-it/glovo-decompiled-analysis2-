package androidx.compose.material3;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import coil3.util.ContextsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.sentry.SentryUUID;
import io.sentry.util.UrlUtils;
import java.util.UUID;
import kotlinx.coroutines.BuildersKt;
import o.AndroidAutofillType_androidKt;
import o.FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0;
import o.FocusRestorerElement;
import o.ZIndexElement;
import o.ZIndexModifierKt;
import o.ZIndexNodemeasure1;
import o.accessisRenderNodeCompatiblecp;
import o.addChildCount;
import o.asFrameworkPaint;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getOnExitannotations;
import o.hasPhysicalKeyboard;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.setFocusRequester;
import o.zIndex;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetDialogWrapper extends ComponentDialog implements ViewRootForInspector {
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final View RemoteActionCompatParcelizer;
    public final ZIndexElement read;
    public hasPhysicalKeyboard serializer;
    public long write;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final AbstractComposeView getSubCompositionView() {
        return this.read;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetDialogWrapper(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, hasPhysicalKeyboard hasphysicalkeyboard, long j, View view, LayoutDirection layoutDirection, Density density, UUID uuid, Animatable animatable, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        boolean z = false;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = hasphysicalkeyboard;
        this.write = j;
        this.RemoteActionCompatParcelizer = view;
        float fM3673constructorimpl = Dp.m3673constructorimpl(8.0f);
        Window window = getWindow();
        if (window == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        SentryUUID.read(window, false);
        ZIndexElement zIndexElement = new ZIndexElement(getContext(), window);
        zIndexElement.setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        zIndexElement.setClipChildren(false);
        zIndexElement.setElevation(density.mo48toPx0680j_4(fM3673constructorimpl));
        zIndexElement.setOutlineProvider(new zIndex());
        this.read = zIndexElement;
        setContentView(zIndexElement);
        zIndexElement.setTag(R.id.view_tree_lifecycle_owner, (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{view}, getCieXyz.write()));
        zIndexElement.setTag(R.id.view_tree_view_model_store_owner, (asFrameworkPaint) BuildersKt.IconCompatParcelizer(-1340292176, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1340292178, new Object[]{view}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer()));
        zIndexElement.setTag(R.id.view_tree_saved_state_registry_owner, UrlUtils.RemoteActionCompatParcelizer(view));
        serializer(this.IconCompatParcelizer, this.serializer, this.write, layoutDirection);
        FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        ContextsKt getonexitannotations = i >= 35 ? new getOnExitannotations(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) : i >= 30 ? new FocusRestorerElement(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) : new setFocusRequester(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
        this.serializer.getClass();
        long j2 = this.write;
        Color.Companion companion = Color.Companion;
        getonexitannotations.write(!Color.m723equalsimpl0(j2, companion.m757getTransparent0d7_KjU()) && ((double) ColorKt.m774luminance8_81llA(j2)) <= 0.5d);
        this.serializer.getClass();
        long j3 = this.write;
        if (!Color.m723equalsimpl0(j3, companion.m757getTransparent0d7_KjU()) && ColorKt.m774luminance8_81llA(j3) <= 0.5d) {
            z = true;
        }
        getonexitannotations.read(z);
        getOnBackPressedDispatcher().read(new ZIndexModifierKt(this.serializer.RemoteActionCompatParcelizer, getcontentviewgroupparentlayout, animatable, new AndroidAutofillType_androidKt(3, this)), this);
    }

    public final void serializer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, hasPhysicalKeyboard hasphysicalkeyboard, long j, LayoutDirection layoutDirection) {
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = hasphysicalkeyboard;
        this.write = j;
        SecureFlagPolicy secureFlagPolicy = hasphysicalkeyboard.write;
        ViewGroup.LayoutParams layoutParams = this.RemoteActionCompatParcelizer.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 0;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int i2 = addChildCount.IconCompatParcelizer[secureFlagPolicy.ordinal()];
        if (i2 == 1) {
            z = false;
        } else if (i2 == 2) {
            z = true;
        } else if (i2 != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int i3 = ZIndexNodemeasure1.write[layoutDirection.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            i = 1;
        }
        this.read.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.IconCompatParcelizer.invoke();
        }
        return zOnTouchEvent;
    }
}
