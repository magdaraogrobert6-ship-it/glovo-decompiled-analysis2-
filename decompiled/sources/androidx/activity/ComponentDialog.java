package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import bo.app.a5$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import o.AndroidColorSpace_androidKt;
import o.BezierKt;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.accesswriteValidRootInUnitRange;
import o.clampValidRootInUnitRange;
import o.defaultViewModelProviderFactory_delegatelambda0;
import o.fullyDrawnReporter_delegatelambda0;
import o.getLightGray0d7_KjU;
import o.getRed0d7_KjU;
import o.getTransparent0d7_KjU;
import o.getWhite0d7_KjU;
import o.isAdapterPositionOnScreen;
import o.onItemDismisslambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.supportsColorMatrixQuery;

/* JADX INFO: loaded from: classes.dex */
public class ComponentDialog extends Dialog implements accessisRenderNodeCompatiblecp, fullyDrawnReporter_delegatelambda0, accesswriteValidRootInUnitRange, getTransparent0d7_KjU {
    private final onViewDetachedFromWindowlambda1 IconCompatParcelizer;
    private final getWhite0d7_KjU RemoteActionCompatParcelizer;
    private accessregisterComponentCallback serializer;
    private final onViewDetachedFromWindowlambda1 write;

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // o.accessisRenderNodeCompatiblecp
    public supportsColorMatrixQuery getLifecycle() {
        return getLifecycleRegistry$1();
    }

    @Override // o.fullyDrawnReporter_delegatelambda0
    public final defaultViewModelProviderFactory_delegatelambda0 getOnBackPressedDispatcher() {
        return (defaultViewModelProviderFactory_delegatelambda0) this.write.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.getTransparent0d7_KjU
    public getLightGray0d7_KjU getSavedStateRegistry() {
        return this.RemoteActionCompatParcelizer.read;
    }

    @Override // android.app.Dialog
    @onItemDismisslambda0
    public void onBackPressed() {
        ((BezierKt) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).read();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentDialog(Context context, int i) {
        super(context, i);
        context.getClass();
        this.RemoteActionCompatParcelizer = new getWhite0d7_KjU(new getRed0d7_KjU(this, new a5$$ExternalSyntheticLambda0(12, this)));
        final int i2 = 0;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            public final /* synthetic */ ComponentDialog RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                ComponentDialog componentDialog = this.RemoteActionCompatParcelizer;
                if (i3 != 0) {
                    return new defaultViewModelProviderFactory_delegatelambda0(new Preview$$ExternalSyntheticLambda0(2, componentDialog));
                }
                BezierKt bezierKt = new BezierKt(0);
                componentDialog.getNavigationEventDispatcher().write(bezierKt);
                return bezierKt;
            }
        });
        final int i3 = 1;
        this.write = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            public final /* synthetic */ ComponentDialog RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = i3;
                ComponentDialog componentDialog = this.RemoteActionCompatParcelizer;
                if (i4 != 0) {
                    return new defaultViewModelProviderFactory_delegatelambda0(new Preview$$ExternalSyntheticLambda0(2, componentDialog));
                }
                BezierKt bezierKt = new BezierKt(0);
                componentDialog.getNavigationEventDispatcher().write(bezierKt);
                return bezierKt;
            }
        });
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            defaultViewModelProviderFactory_delegatelambda0 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.S_(onBackInvokedDispatcher);
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(bundle);
        getLifecycleRegistry$1().serializer(AndroidColorSpace_androidKt.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getLifecycleRegistry$1().serializer(AndroidColorSpace_androidKt.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // o.accesswriteValidRootInUnitRange
    public clampValidRootInUnitRange getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().RemoteActionCompatParcelizer().IconCompatParcelizer;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.RemoteActionCompatParcelizer.read(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStop() {
        getLifecycleRegistry$1().serializer(AndroidColorSpace_androidKt.ON_DESTROY);
        this.serializer = null;
        super.onStop();
    }

    public final accessregisterComponentCallback getLifecycleRegistry$1() {
        accessregisterComponentCallback accessregistercomponentcallback = this.serializer;
        if (accessregistercomponentcallback != null) {
            return accessregistercomponentcallback;
        }
        accessregisterComponentCallback accessregistercomponentcallback2 = new accessregisterComponentCallback(this, true);
        this.serializer = accessregistercomponentcallback2;
        return accessregistercomponentcallback2;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
