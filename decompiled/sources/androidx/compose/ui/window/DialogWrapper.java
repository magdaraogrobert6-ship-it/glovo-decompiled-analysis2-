package androidx.compose.ui.window;

import android.graphics.Outline;
import android.os.Build;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.sentry.SentryUUID;
import io.sentry.util.UrlUtils;
import java.util.UUID;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.accessisRenderNodeCompatiblecp;
import o.asFrameworkPaint;
import o.createFromParcel;
import o.getBirthDateYear;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {
    private final View composeView;
    private final DialogLayout dialogLayout;
    private boolean isPressOutside;
    private final float maxSupportedElevation;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onDismissRequest;
    private DialogProperties properties;

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    public DialogWrapper(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, DialogProperties dialogProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), dialogProperties.getDecorFitsSystemWindows() ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.onDismissRequest = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.properties = dialogProperties;
        this.composeView = view;
        float fM3673constructorimpl = Dp.m3673constructorimpl(8.0f);
        this.maxSupportedElevation = fM3673constructorimpl;
        Window window = getWindow();
        if (window == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Dialog has no window");
            throw null;
        }
        applyWindowTypeAndToken(this.properties);
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        SentryUUID.read(window, this.properties.getDecorFitsSystemWindows());
        window.setGravity(17);
        if (!this.properties.getDecorFitsSystemWindows()) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            Api28Impl.INSTANCE.setLayoutInDisplayCutout(attributes);
            if (Build.VERSION.SDK_INT >= 30) {
                Api30Impl api30Impl = Api30Impl.INSTANCE;
                api30Impl.setFitInsetsSides(attributes, 0);
                api30Impl.setFitInsetsTypes(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        setTitle(this.properties.getWindowTitle());
        dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.mo48toPx0680j_4(fM3673constructorimpl));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(dialogLayout);
        dialogLayout.setTag(com.logistics.rider.glovo.R.id.view_tree_lifecycle_owner, (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{view}, getCieXyz.write()));
        dialogLayout.setTag(com.logistics.rider.glovo.R.id.view_tree_view_model_store_owner, (asFrameworkPaint) BuildersKt.IconCompatParcelizer(-1340292176, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1340292178, new Object[]{view}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer()));
        dialogLayout.setTag(com.logistics.rider.glovo.R.id.view_tree_saved_state_registry_owner, UrlUtils.RemoteActionCompatParcelizer(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        LazyKt__LazyJVMKt.serializer(getOnBackPressedDispatcher(), this, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.DialogWrapper.2
            public final void invoke(OnBackPressedCallback onBackPressedCallback) {
                if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                    DialogWrapper.this.onDismissRequest.invoke();
                }
            }

            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OnBackPressedCallback) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        dialogLayout.setLayoutDirection(i2);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        boolean zShouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        window.getClass();
        window.setFlags(zShouldApplySecureFlag ? 8192 : -8193, 8192);
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.properties.getDismissOnBackPress() || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.onDismissRequest.invoke();
        return true;
    }

    public final void setContent(getBirthDateYear getbirthdateyear, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.dialogLayout.setContent(getbirthdateyear, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public final void updateParameters(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        int i;
        this.onDismissRequest = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.properties = dialogProperties;
        setSecurePolicy(dialogProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        boolean decorFitsSystemWindows = dialogProperties.getDecorFitsSystemWindows();
        this.dialogLayout.updateProperties(dialogProperties.getUsePlatformDefaultWidth(), decorFitsSystemWindows);
        setCanceledOnTouchOutside(dialogProperties.getDismissOnClickOutside());
        Window window = getWindow();
        if (window != null) {
            if (decorFitsSystemWindows) {
                i = 0;
            } else {
                i = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window.setSoftInputMode(i);
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.properties.getDismissOnClickOutside() || this.dialogLayout.isInsideContent(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                this.isPressOutside = false;
                return zOnTouchEvent;
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.isPressOutside = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.isPressOutside = false;
                    return zOnTouchEvent;
                }
            } else if (this.isPressOutside) {
                this.onDismissRequest.invoke();
                this.isPressOutside = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    private final void applyWindowTypeAndToken(DialogProperties dialogProperties) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.type = dialogProperties.getWindowType();
            IBinder windowToken = dialogProperties.getWindowToken();
            if (windowToken != null) {
                attributes.token = windowToken;
            }
            window.setAttributes(attributes);
        }
    }
}
