package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.ReportFragment;
import bo.app.a5$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o.ActualImageBitmapx__hDU;
import o.AndroidColorFilter_androidKt;
import o.AndroidColorSpace_androidKt;
import o.AndroidImageBitmap;
import o.BezierKt;
import o.FocusInvalidationManager;
import o.FocusOwnerImplmodifier1;
import o.FocusPropertiesCompanion;
import o.FocusPropertiesenter1;
import o.FocusPropertiesonEnter1;
import o.ResultReceiver;
import o.accessgetExitcp;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.accesswriteValidRootInUnitRange;
import o.asFrameworkPaint;
import o.asImageBitmap;
import o.clampValidRootInUnitRange;
import o.createFromParcel;
import o.createFullyDrawnExecutor;
import o.createImageBitmap;
import o.defaultViewModelProviderFactory_delegatelambda0;
import o.focusModifier;
import o.fullyDrawnReporter_delegatelambda0;
import o.getCieXyz;
import o.getDarkGray0d7_KjU;
import o.getFilterQualityfv9h1I;
import o.getLightGray0d7_KjU;
import o.getMinDimensionannotations;
import o.getNavigationEventDispatcher;
import o.getOnBackPressedDispatcher;
import o.getRed0d7_KjU;
import o.getSavedStateRegistry;
import o.getTransparent0d7_KjU;
import o.getUnsetFocusRect;
import o.getWhite0d7_KjU;
import o.invoke3ESFkO8;
import o.isAdapterPositionOnScreen;
import o.moveFocus3ESFkO8;
import o.onBackPressed;
import o.onItemDismisslambda0;
import o.onMultiWindowModeChanged;
import o.onNewIntent;
import o.onViewDetachedFromWindowlambda1;
import o.prepareToDraw;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
import o.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import o.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
import o.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
import o.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
import o.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import o.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
import o.removeNodeAtDepth;
import o.requestInteropFocus;
import o.setOnExit;
import o.setStrokeCapBeK7IIE;
import o.setStrokeMiterLimit;
import o.sourceInformationContextOfdefault;
import o.supportsColorMatrixQuery;
import o.toAndroidColorSpace;
import o.toColorLong8_81llA;
import o.toContentCaptureSession;
import o.toFocusDirection;
import o.toFocusDirectionZmokQxo;
import o.toLayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements asFrameworkPaint, AndroidColorFilter_androidKt, getTransparent0d7_KjU, fullyDrawnReporter_delegatelambda0, accesswriteValidRootInUnitRange, onMultiWindowModeChanged, focusModifier, moveFocus3ESFkO8, toFocusDirection, toFocusDirectionZmokQxo, setOnExit {
    private static final r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg serializer = new r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
    private final CopyOnWriteArrayList<FocusOwnerImplmodifier1> ComponentActivity;
    private getFilterQualityfv9h1I IconCompatParcelizer;
    private boolean MediaBrowserCompatMediaItem;
    private final onViewDetachedFromWindowlambda1 MediaDescriptionCompat;
    private final onViewDetachedFromWindowlambda1 MediaMetadataCompat;
    private boolean MediaSessionCompatQueueItem;
    private final FocusPropertiesCompanion MediaSessionCompatResultReceiverWrapper;
    private final onViewDetachedFromWindowlambda1 MediaSessionCompatToken;
    private final onViewDetachedFromWindowlambda1 ParcelableVolumeInfo;
    private final AtomicInteger PlaybackStateCompat;
    private final CopyOnWriteArrayList<FocusOwnerImplmodifier1> PlaybackStateCompatCustomAction;
    private boolean RatingCompat;
    private final ActivityResultRegistry RemoteActionCompatParcelizer;
    private final CopyOnWriteArrayList<FocusOwnerImplmodifier1> ResultReceiver;
    private final CopyOnWriteArrayList<FocusOwnerImplmodifier1> r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final CopyOnWriteArrayList<FocusOwnerImplmodifier1> r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final CopyOnWriteArrayList<FocusOwnerImplmodifier1> r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final CopyOnWriteArrayList<Runnable> r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private final r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    private final getWhite0d7_KjU r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    private int read;
    private final getSavedStateRegistry write;

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    public final void enterPictureInPictureMode(requestInteropFocus requestinteropfocus) {
        throw null;
    }

    @Override // o.onMultiWindowModeChanged
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // androidx.core.app.ComponentActivity, o.accessisRenderNodeCompatiblecp
    public supportsColorMatrixQuery getLifecycle() {
        return super.getLifecycle();
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @onItemDismisslambda0
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final void setPictureInPictureParams(requestInteropFocus requestinteropfocus) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$3(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.RemoteActionCompatParcelizer.onSaveInstanceState(bundle);
        return bundle;
    }

    private final r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw createFullyDrawnExecutor() {
        return new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActualImageBitmapx__hDU defaultViewModelProviderFactory_delegate$lambda$0(ComponentActivity componentActivity) {
        return new ActualImageBitmapx__hDU(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFullyDrawnExecutor fullyDrawnReporter_delegate$lambda$0(ComponentActivity componentActivity) {
        return new createFullyDrawnExecutor(componentActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, new ResultReceiver(componentActivity, 1));
    }

    private final BezierKt getOnBackPressedInput() {
        return (BezierKt) this.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BezierKt onBackPressedInput_delegate$lambda$0(ComponentActivity componentActivity) {
        BezierKt bezierKt = new BezierKt();
        componentActivity.getNavigationEventDispatcher().write(bezierKt);
        return bezierKt;
    }

    @Override // o.AndroidColorFilter_androidKt
    public createImageBitmap getDefaultViewModelProviderFactory() {
        return (createImageBitmap) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
    }

    public createFullyDrawnExecutor getFullyDrawnReporter() {
        return (createFullyDrawnExecutor) this.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.fullyDrawnReporter_delegatelambda0
    public final defaultViewModelProviderFactory_delegatelambda0 getOnBackPressedDispatcher() {
        return (defaultViewModelProviderFactory_delegatelambda0) this.ParcelableVolumeInfo.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.getTransparent0d7_KjU
    public final getLightGray0d7_KjU getSavedStateRegistry() {
        return this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read;
    }

    @Override // android.app.Activity
    @onItemDismisslambda0
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.RemoteActionCompatParcelizer.dispatchResult(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.RemoteActionCompatParcelizer(bundle);
        getSavedStateRegistry getsavedstateregistry = this.write;
        getsavedstateregistry.getClass();
        getsavedstateregistry.serializer = this;
        Iterator it = getsavedstateregistry.write.iterator();
        while (it.hasNext()) {
            ((getOnBackPressedDispatcher) it.next()).write(this);
        }
        super.onCreate(bundle);
        ReportFragment.IconCompatParcelizer.getClass();
        AndroidImageBitmap.read(this);
        int i = this.read;
        if (i != 0) {
            setContentView(i);
        }
        this.MediaSessionCompatQueueItem = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    public Context peekAvailableContext() {
        return this.write.serializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ComponentActivity componentActivity, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        Window window;
        View viewPeekDecorView;
        accessisrendernodecompatiblecp.getClass();
        androidColorSpace_androidKt.getClass();
        if (androidColorSpace_androidKt != AndroidColorSpace_androidKt.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        accessisrendernodecompatiblecp.getClass();
        androidColorSpace_androidKt.getClass();
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
            componentActivity.write.serializer = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().read();
            }
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = (r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) componentActivity.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            ComponentActivity componentActivity2 = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.serializer;
            componentActivity2.getWindow().getDecorView().removeCallbacks(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq);
            componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(ComponentActivity componentActivity, Context context) {
        context.getClass();
        Bundle bundleWrite = componentActivity.getSavedStateRegistry().write("android:support:activity-result");
        if (bundleWrite != null) {
            componentActivity.RemoteActionCompatParcelizer.onRestoreInstanceState(bundleWrite);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$0(defaultViewModelProviderFactory_delegatelambda0 defaultviewmodelproviderfactory_delegatelambda0, ComponentActivity componentActivity, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        accessisrendernodecompatiblecp.getClass();
        androidColorSpace_androidKt.getClass();
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            defaultviewmodelproviderfactory_delegatelambda0.S_(onBackInvokedDispatcher);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel fullyDrawnReporter_delegate$lambda$0$0(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return createFromParcel.INSTANCE;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw r8lambdavcwjfxdisgcircy4i008voij_lw = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) r8lambdavcwjfxdisgcircy4i008voij_lw).write(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(getUnsetFocusRect getunsetfocusrect, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        getunsetfocusrect.getClass();
        accessisrendernodecompatiblecp.getClass();
        FocusPropertiesCompanion focusPropertiesCompanion = this.MediaSessionCompatResultReceiverWrapper;
        focusPropertiesCompanion.write.add(getunsetfocusrect);
        focusPropertiesCompanion.serializer.run();
        supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp.getLifecycle();
        HashMap map = focusPropertiesCompanion.read;
        FocusPropertiesonEnter1 focusPropertiesonEnter1 = (FocusPropertiesonEnter1) map.remove(getunsetfocusrect);
        if (focusPropertiesonEnter1 != null) {
            focusPropertiesonEnter1.serializer();
        }
        map.put(getunsetfocusrect, new FocusPropertiesonEnter1(lifecycle, new invoke3ESFkO8(focusPropertiesCompanion, 0, getunsetfocusrect)));
    }

    @Override // o.focusModifier
    public final void addOnConfigurationChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.PlaybackStateCompatCustomAction.add(focusOwnerImplmodifier1);
    }

    public final void addOnContextAvailableListener(getOnBackPressedDispatcher getonbackpresseddispatcher) {
        getonbackpresseddispatcher.getClass();
        getSavedStateRegistry getsavedstateregistry = this.write;
        getsavedstateregistry.getClass();
        ComponentActivity componentActivity = getsavedstateregistry.serializer;
        if (componentActivity != null) {
            getonbackpresseddispatcher.write(componentActivity);
        }
        getsavedstateregistry.write.add(getonbackpresseddispatcher);
    }

    @Override // o.toFocusDirection
    public final void addOnMultiWindowModeChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.add(focusOwnerImplmodifier1);
    }

    public final void addOnNewIntentListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(focusOwnerImplmodifier1);
    }

    @Override // o.toFocusDirectionZmokQxo
    public final void addOnPictureInPictureModeChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.ComponentActivity.add(focusOwnerImplmodifier1);
    }

    public final void addOnPictureInPictureUiStateChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.ResultReceiver.add(focusOwnerImplmodifier1);
    }

    @Override // o.moveFocus3ESFkO8
    public final void addOnTrimMemoryListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.add(focusOwnerImplmodifier1);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.add(runnable);
    }

    @Override // o.AndroidColorFilter_androidKt
    public setStrokeCapBeK7IIE getDefaultViewModelCreationExtras() {
        setStrokeMiterLimit setstrokemiterlimit = new setStrokeMiterLimit(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = setstrokemiterlimit.read;
        if (application != null) {
            linkedHashMap.put(asImageBitmap.IconCompatParcelizer, getApplication());
        }
        linkedHashMap.put(prepareToDraw.read, this);
        linkedHashMap.put(prepareToDraw.write, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(prepareToDraw.RemoteActionCompatParcelizer, extras);
        }
        return setstrokemiterlimit;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<FocusOwnerImplmodifier1> it = this.PlaybackStateCompatCustomAction.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.MediaSessionCompatResultReceiverWrapper.write(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<FocusOwnerImplmodifier1> it = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.MediaSessionCompatResultReceiverWrapper.write.iterator();
        while (it.hasNext()) {
            ((getMinDimensionannotations) ((getUnsetFocusRect) it.next())).write.read(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        toContentCaptureSession tocontentcapturesessionBr_ = FocusInvalidationManager.br_(pictureInPictureUiState);
        Iterator<FocusOwnerImplmodifier1> it = this.ResultReceiver.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(tocontentcapturesessionBr_);
        }
    }

    @Override // android.app.Activity
    @onItemDismisslambda0
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.RemoteActionCompatParcelizer.dispatchResult(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof accessregisterComponentCallback) {
            supportsColorMatrixQuery lifecycle = getLifecycle();
            lifecycle.getClass();
            ((accessregisterComponentCallback) lifecycle).RemoteActionCompatParcelizer(toColorLong8_81llA.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<FocusOwnerImplmodifier1> it = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final <I, O> onBackPressed registerForActivityResult(onNewIntent onnewintent, ActivityResultRegistry activityResultRegistry, getNavigationEventDispatcher getnavigationeventdispatcher) {
        onnewintent.getClass();
        activityResultRegistry.getClass();
        getnavigationeventdispatcher.getClass();
        return activityResultRegistry.register("activity_rq#" + this.PlaybackStateCompat.getAndIncrement(), this, onnewintent, getnavigationeventdispatcher);
    }

    @Override // o.setOnExit
    public void removeMenuProvider(getUnsetFocusRect getunsetfocusrect) {
        getunsetfocusrect.getClass();
        this.MediaSessionCompatResultReceiverWrapper.read(getunsetfocusrect);
    }

    @Override // o.focusModifier
    public final void removeOnConfigurationChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.PlaybackStateCompatCustomAction.remove(focusOwnerImplmodifier1);
    }

    public final void removeOnContextAvailableListener(getOnBackPressedDispatcher getonbackpresseddispatcher) {
        getonbackpresseddispatcher.getClass();
        getSavedStateRegistry getsavedstateregistry = this.write;
        getsavedstateregistry.getClass();
        getsavedstateregistry.write.remove(getonbackpresseddispatcher);
    }

    @Override // o.toFocusDirection
    public final void removeOnMultiWindowModeChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.remove(focusOwnerImplmodifier1);
    }

    public final void removeOnNewIntentListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.remove(focusOwnerImplmodifier1);
    }

    @Override // o.toFocusDirectionZmokQxo
    public final void removeOnPictureInPictureModeChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.ComponentActivity.remove(focusOwnerImplmodifier1);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.ResultReceiver.remove(focusOwnerImplmodifier1);
    }

    @Override // o.moveFocus3ESFkO8
    public final void removeOnTrimMemoryListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        focusOwnerImplmodifier1.getClass();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.remove(focusOwnerImplmodifier1);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.remove(runnable);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw r8lambdavcwjfxdisgcircy4i008voij_lw = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) r8lambdavcwjfxdisgcircy4i008voij_lw).write(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @onItemDismisslambda0
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @onItemDismisslambda0
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this.IconCompatParcelizer == null) {
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = (r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) getLastNonConfigurationInstance();
            if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                this.IconCompatParcelizer = r8lambdah6vvr6zuwa2u1fe0kskpogpr28.serializer;
            }
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new getFilterQualityfv9h1I();
            }
        }
    }

    @onItemDismisslambda0
    public Object getLastCustomNonConfigurationInstance() {
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = (r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) getLastNonConfigurationInstance();
        if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
            return r8lambdah6vvr6zuwa2u1fe0kskpogpr28.write;
        }
        return null;
    }

    @Override // o.accesswriteValidRootInUnitRange
    public clampValidRootInUnitRange getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().RemoteActionCompatParcelizer().IconCompatParcelizer;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    @onItemDismisslambda0
    public void onBackPressed() {
        getOnBackPressedInput().read();
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.MediaBrowserCompatMediaItem = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.MediaBrowserCompatMediaItem = false;
            Iterator<FocusOwnerImplmodifier1> it = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new accessgetExitcp(z, configuration));
            }
        } catch (Throwable th) {
            this.MediaBrowserCompatMediaItem = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.RatingCompat = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.RatingCompat = false;
            Iterator<FocusOwnerImplmodifier1> it = this.ComponentActivity.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new toLayoutDirection(z, configuration));
            }
        } catch (Throwable th) {
            this.RatingCompat = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        getFilterQualityfv9h1I getfilterqualityfv9h1i = this.IconCompatParcelizer;
        if (getfilterqualityfv9h1i == null && (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = (r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) getLastNonConfigurationInstance()) != null) {
            getfilterqualityfv9h1i = r8lambdah6vvr6zuwa2u1fe0kskpogpr28.serializer;
        }
        if (getfilterqualityfv9h1i == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr29 = new r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        r8lambdah6vvr6zuwa2u1fe0kskpogpr29.write = objOnRetainCustomNonConfigurationInstance;
        r8lambdah6vvr6zuwa2u1fe0kskpogpr29.serializer = getfilterqualityfv9h1i;
        return r8lambdah6vvr6zuwa2u1fe0kskpogpr29;
    }

    public ComponentActivity() {
        this.write = new getSavedStateRegistry();
        final int i = 0;
        this.MediaSessionCompatResultReceiverWrapper = new FocusPropertiesCompanion(new r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(this, i));
        getRed0d7_KjU getred0d7_kju = new getRed0d7_KjU(this, new a5$$ExternalSyntheticLambda0(12, this));
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new getWhite0d7_KjU(getred0d7_kju);
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = createFullyDrawnExecutor();
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new ResultReceiver(this, i));
        this.PlaybackStateCompat = new AtomicInteger();
        this.RemoteActionCompatParcelizer = new r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(this);
        this.PlaybackStateCompatCustomAction = new CopyOnWriteArrayList<>();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new CopyOnWriteArrayList<>();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new CopyOnWriteArrayList<>();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new CopyOnWriteArrayList<>();
        this.ComponentActivity = new CopyOnWriteArrayList<>();
        this.ResultReceiver = new CopyOnWriteArrayList<>();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new CopyOnWriteArrayList<>();
        this.MediaSessionCompatToken = new isAdapterPositionOnScreen(new ResultReceiver(this, 2));
        if (getLifecycle() == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().IconCompatParcelizer(new toAndroidColorSpace(this) { // from class: o.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
            public final /* synthetic */ androidx.activity.ComponentActivity IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.toAndroidColorSpace
            public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
                int i2 = i;
                androidx.activity.ComponentActivity componentActivity = this.IconCompatParcelizer;
                if (i2 != 0) {
                    androidx.activity.ComponentActivity._init_$lambda$2(componentActivity, accessisrendernodecompatiblecp, androidColorSpace_androidKt);
                } else {
                    androidx.activity.ComponentActivity._init_$lambda$1(componentActivity, accessisrendernodecompatiblecp, androidColorSpace_androidKt);
                }
            }
        });
        final int i2 = 1;
        getLifecycle().IconCompatParcelizer(new toAndroidColorSpace(this) { // from class: o.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
            public final /* synthetic */ androidx.activity.ComponentActivity IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.toAndroidColorSpace
            public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
                int i3 = i2;
                androidx.activity.ComponentActivity componentActivity = this.IconCompatParcelizer;
                if (i3 != 0) {
                    androidx.activity.ComponentActivity._init_$lambda$2(componentActivity, accessisrendernodecompatiblecp, androidColorSpace_androidKt);
                } else {
                    androidx.activity.ComponentActivity._init_$lambda$1(componentActivity, accessisrendernodecompatiblecp, androidColorSpace_androidKt);
                }
            }
        });
        getLifecycle().IconCompatParcelizer(new getDarkGray0d7_KjU(this, i2));
        getred0d7_kju.RemoteActionCompatParcelizer();
        prepareToDraw.serializer((getTransparent0d7_KjU) this);
        getSavedStateRegistry().RemoteActionCompatParcelizer("android:support:activity-result", new r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(i, this));
        addOnContextAvailableListener(new getOnBackPressedDispatcher() { // from class: o.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss
            @Override // o.getOnBackPressedDispatcher
            public final void write(androidx.activity.ComponentActivity componentActivity) {
                androidx.activity.ComponentActivity._init_$lambda$4(this.IconCompatParcelizer, componentActivity);
            }
        });
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new ResultReceiver(this, 3));
        this.ParcelableVolumeInfo = new isAdapterPositionOnScreen(new ResultReceiver(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defaultViewModelProviderFactory_delegatelambda0 onBackPressedDispatcher_delegate$lambda$0(ComponentActivity componentActivity) {
        int i = 1;
        defaultViewModelProviderFactory_delegatelambda0 defaultviewmodelproviderfactory_delegatelambda0 = new defaultViewModelProviderFactory_delegatelambda0(new r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(componentActivity, i));
        if (Build.VERSION.SDK_INT >= 33) {
            Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                new Handler(Looper.getMainLooper()).post(new ND$$ExternalSyntheticLambda0(componentActivity, i, defaultviewmodelproviderfactory_delegatelambda0));
                return defaultviewmodelproviderfactory_delegatelambda0;
            }
            componentActivity.addObserverForBackInvoker(defaultviewmodelproviderfactory_delegatelambda0);
        }
        return defaultviewmodelproviderfactory_delegatelambda0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            Object[] objArr = {e.getMessage(), "Can not perform this action after onSaveInstanceState"};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                throw e;
            }
        } catch (NullPointerException e2) {
            Object[] objArr2 = {e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        FocusPropertiesCompanion focusPropertiesCompanion = this.MediaSessionCompatResultReceiverWrapper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = focusPropertiesCompanion.write.iterator();
        while (it.hasNext()) {
            ((getMinDimensionannotations) ((getUnsetFocusRect) it.next())).write.write(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.MediaSessionCompatResultReceiverWrapper.write.iterator();
        while (it.hasNext()) {
            ((getMinDimensionannotations) ((getUnsetFocusRect) it.next())).write.RemoteActionCompatParcelizer(menu);
        }
        return true;
    }

    @Override // o.asFrameworkPaint
    public getFilterQualityfv9h1I getViewModelStore() {
        if (getApplication() == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        ensureViewModelStore();
        getFilterQualityfv9h1I getfilterqualityfv9h1i = this.IconCompatParcelizer;
        getfilterqualityfv9h1i.getClass();
        return getfilterqualityfv9h1i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(defaultViewModelProviderFactory_delegatelambda0 defaultviewmodelproviderfactory_delegatelambda0) {
        getLifecycle().IconCompatParcelizer(new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(defaultviewmodelproviderfactory_delegatelambda0, 0, this));
    }

    @Override // android.app.Activity
    @onItemDismisslambda0
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @onItemDismisslambda0
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            int i = sourceInformationContextOfdefault.read();
            int i2 = sourceInformationContextOfdefault.read();
            int i3 = sourceInformationContextOfdefault.read();
            if (((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, i, i2, 1240730100, sourceInformationContextOfdefault.read(), new Object[0], i3)).booleanValue()) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            createFullyDrawnExecutor fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.RemoteActionCompatParcelizer) {
                fullyDrawnReporter.write = true;
                Iterator it = fullyDrawnReporter.IconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) it.next()).invoke();
                }
                fullyDrawnReporter.IconCompatParcelizer.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw r8lambdavcwjfxdisgcircy4i008voij_lw = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) r8lambdavcwjfxdisgcircy4i008voij_lw).write(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw r8lambdavcwjfxdisgcircy4i008voij_lw = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) r8lambdavcwjfxdisgcircy4i008voij_lw).write(decorView);
        super.setContentView(view, layoutParams);
    }

    public final <I, O> onBackPressed registerForActivityResult(onNewIntent onnewintent, getNavigationEventDispatcher getnavigationeventdispatcher) {
        onnewintent.getClass();
        getnavigationeventdispatcher.getClass();
        return registerForActivityResult(onnewintent, this.RemoteActionCompatParcelizer, getnavigationeventdispatcher);
    }

    @Override // android.app.Activity
    @onItemDismisslambda0
    public void onMultiWindowModeChanged(boolean z) {
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        Iterator<FocusOwnerImplmodifier1> it = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new accessgetExitcp(z));
        }
    }

    @Override // android.app.Activity
    @onItemDismisslambda0
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.RatingCompat) {
            return;
        }
        Iterator<FocusOwnerImplmodifier1> it = this.ComponentActivity.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new toLayoutDirection(z));
        }
    }

    @Override // o.setOnExit
    public void addMenuProvider(getUnsetFocusRect getunsetfocusrect) {
        getunsetfocusrect.getClass();
        FocusPropertiesCompanion focusPropertiesCompanion = this.MediaSessionCompatResultReceiverWrapper;
        focusPropertiesCompanion.write.add(getunsetfocusrect);
        focusPropertiesCompanion.serializer.run();
    }

    @SuppressLint
    public void addMenuProvider(getUnsetFocusRect getunsetfocusrect, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, toColorLong8_81llA tocolorlong8_81lla) {
        getunsetfocusrect.getClass();
        accessisrendernodecompatiblecp.getClass();
        tocolorlong8_81lla.getClass();
        FocusPropertiesCompanion focusPropertiesCompanion = this.MediaSessionCompatResultReceiverWrapper;
        focusPropertiesCompanion.getClass();
        supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp.getLifecycle();
        HashMap map = focusPropertiesCompanion.read;
        FocusPropertiesonEnter1 focusPropertiesonEnter1 = (FocusPropertiesonEnter1) map.remove(getunsetfocusrect);
        if (focusPropertiesonEnter1 != null) {
            focusPropertiesonEnter1.serializer();
        }
        map.put(getunsetfocusrect, new FocusPropertiesonEnter1(lifecycle, new FocusPropertiesenter1(focusPropertiesCompanion, tocolorlong8_81lla, getunsetfocusrect, 0)));
    }

    public ComponentActivity(int i) {
        this();
        this.read = i;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
