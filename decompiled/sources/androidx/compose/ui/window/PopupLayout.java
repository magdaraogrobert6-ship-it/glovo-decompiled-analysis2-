package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.sentry.util.UrlUtils;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import o.ContentType_androidKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessisRenderNodeCompatiblecp;
import o.asFrameworkPaint;
import o.createBrazeUserChangeEventSubscriberlambda0;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getBirthDateYear;
import o.getCieXyz;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setSpread;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    public static final int $stable;
    private static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingPopupPosition;
    private static byte serializer;
    private static int write;
    private Object backCallback;
    private final onViewAttachedToWindow canCalculatePosition$delegate;
    private final View composeView;
    private final PopulateViewStructure_androidKtpopulate7 content$delegate;
    private final boolean isNested;
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onDismissRequest;
    private final WindowManager.LayoutParams params;
    private IntRect parentBounds;
    private final PopulateViewStructure_androidKtpopulate7 parentLayoutCoordinates$delegate;
    private LayoutDirection parentLayoutDirection;
    private final int[] parentLocationInWindow;
    private final int[] parentLocationOnScreen;
    private final PopulateViewStructure_androidKtpopulate7 popupContentSize$delegate;
    private final PopupLayoutHelper popupLayoutHelper;
    private PopupPositionProvider positionProvider;
    private final Rect previousWindowVisibleFrame;
    private PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final setSpread snapshotStateObserver;
    private String testTag;
    private final WindowManager windowManager;

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.params;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getContent() {
        return (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.content$delegate.getValue();
    }

    private final IntRect getDisplayBounds() {
        Rect rect = this.previousWindowVisibleFrame;
        boolean clippingEnabled = this.properties.getClippingEnabled();
        PopupLayoutHelper popupLayoutHelper = this.popupLayoutHelper;
        if (clippingEnabled) {
            popupLayoutHelper.getWindowVisibleDisplayFrame(this.composeView, rect);
        } else {
            popupLayoutHelper.getWindowBounds(this.composeView, rect);
        }
        return AndroidPopup_androidKt.toIntBounds(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.parentLayoutCoordinates$delegate.getValue();
    }

    private final void maybeRegisterBackCallback() {
        if (!this.properties.getDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = Api33Impl.createBackCallback(this.onDismissRequest);
        }
        Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        super.setLayoutDirection(i2);
    }

    private final void updatePopupProperties(PopupProperties popupProperties) {
        Object[] objArr = {this.properties, popupProperties};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        if (popupProperties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.properties = popupProperties;
        this.params.flags = AndroidPopup_androidKt.flagsWithSecureFlagInherited(popupProperties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.properties.getDismissOnBackPress()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.onDismissRequest;
                if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m3942getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize$delegate.getValue();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui(int i, int i2) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui(i, i2);
        } else {
            IntRect displayBounds = getDisplayBounds();
            super.internalOnMeasure$ui(View.MeasureSpec.makeMeasureSpec(displayBounds.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.getHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.onDismissRequest;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = this.onDismissRequest;
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k1 != null) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
        }
        return true;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m3943setPopupContentSizefhxjrPA(IntSize intSize) {
        this.popupContentSize$delegate.setValue(intSize);
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        this.onDismissRequest = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.testTag = str;
        updatePopupProperties(popupProperties);
        superSetLayoutDirection(layoutDirection);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
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

    static {
        write();
        Companion = new Companion(null);
        $stable = 8;
        onCommitAffectingPopupPosition = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
            public final void invoke(PopupLayout popupLayout) {
                if (popupLayout.isAttachedToWindow()) {
                    popupLayout.updatePosition();
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PopupLayout) obj);
                return createFromParcel.INSTANCE;
            }
        };
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.internalOnLayout$ui(z, i, i2, i3, i4);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.read();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = this.snapshotStateObserver.read;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 != null) {
            onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
        this.snapshotStateObserver.serializer();
        maybeUnregisterBackCallback();
    }

    public final void setContent(getBirthDateYear getbirthdateyear, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        setParentCompositionContext(getbirthdateyear);
        setContent(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void updateParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        setParentLayoutCoordinates(layoutCoordinates);
        updateParentBounds$ui();
    }

    public final void dismiss() {
        setTag(R.id.view_tree_lifecycle_owner, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @UiComposable
    public void Content(getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-857613600);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.PopupLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i3) {
                    PopupLayout.this.Content(getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                }
            };
        }
    }

    public final void updatePosition() {
        IntSize intSizeM3942getPopupContentSizebOM6tXw;
        final IntRect intRect = this.parentBounds;
        if (intRect == null || (intSizeM3942getPopupContentSizebOM6tXw = m3942getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long jM3848unboximpl = intSizeM3942getPopupContentSizebOM6tXw.m3848unboximpl();
        IntRect displayBounds = getDisplayBounds();
        final long jM3839constructorimpl = IntSize.m3839constructorimpl((((long) displayBounds.getWidth()) << 32) | (((long) displayBounds.getHeight()) & 4294967295L));
        final createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0 = new createBrazeUserChangeEventSubscriberlambda0();
        createbrazeuserchangeeventsubscriberlambda0.serializer = IntOffset.Companion.m3812getZeronOccac();
        this.snapshotStateObserver.serializer(this, onCommitAffectingPopupPosition, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.PopupLayout.updatePosition.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3944invoke() {
                createbrazeuserchangeeventsubscriberlambda0.serializer = this.getPositionProvider().mo134calculatePositionllwVHH4(intRect, jM3839constructorimpl, this.getParentLayoutDirection(), jM3848unboximpl);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3944invoke();
                return createFromParcel.INSTANCE;
            }
        });
        this.params.x = IntOffset.m3801getXimpl(createbrazeuserchangeeventsubscriberlambda0.serializer);
        this.params.y = IntOffset.m3802getYimpl(createbrazeuserchangeeventsubscriberlambda0.serializer);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.setGestureExclusionRects(this, (int) (jM3839constructorimpl >> 32), (int) (4294967295L & jM3839constructorimpl));
        }
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    public final void updateParentBounds$ui() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.isAttached()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo2217getSizeYbymL2g = parentLayoutCoordinates.mo2217getSizeYbymL2g();
            long jPositionOnScreen = this.isNested ? LayoutCoordinatesKt.positionOnScreen(parentLayoutCoordinates) : LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
            IntRect intRectM3834IntRectVbeCjmY = IntRectKt.m3834IntRectVbeCjmY(IntOffset.m3795constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (jPositionOnScreen >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jPositionOnScreen & 4294967295L)))) & 4294967295L)), jMo2217getSizeYbymL2g);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{intRectM3834IntRectVbeCjmY, this.parentBounds}, getCieXyz.write())).booleanValue()) {
                return;
            }
            this.parentBounds = intRectM3834IntRectVbeCjmY;
            updatePosition();
        }
    }

    public final void pollForLocationOnScreenChange() {
        if (isAttachedToWindow()) {
            int[] iArr = this.locationOnScreen;
            int i = iArr[0];
            int i2 = iArr[1];
            this.composeView.getLocationOnScreen(iArr);
            int[] iArr2 = this.locationOnScreen;
            if (i == iArr2[0] && i2 == iArr2[1]) {
                return;
            }
            updateParentBounds$ui();
        }
    }

    public PopupLayout(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, boolean z, PopupLayoutHelper popupLayoutHelper) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.properties = popupProperties;
        this.testTag = str;
        this.composeView = view;
        this.isNested = z;
        this.popupLayoutHelper = popupLayoutHelper;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.windowManager = (WindowManager) systemService;
        this.params = createLayoutParams();
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize$delegate = CompositionKt.RemoteActionCompatParcelizer(null);
        this.parentLayoutCoordinates$delegate = CompositionKt.RemoteActionCompatParcelizer(null);
        this.canCalculatePosition$delegate = CompositionKt.serializer(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Boolean invoke() {
                LayoutCoordinates parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.isAttached()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m3942getPopupContentSizebOM6tXw() == null) ? false : true);
            }

            {
                super(0);
            }
        });
        float fM3673constructorimpl = Dp.m3673constructorimpl(8.0f);
        this.maxSupportedElevation = fM3673constructorimpl;
        this.previousWindowVisibleFrame = new Rect();
        this.parentLocationOnScreen = new int[2];
        this.parentLocationInWindow = new int[2];
        this.snapshotStateObserver = new setSpread(new PopupLayout$snapshotStateObserver$1(this));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{view}, getCieXyz.write()));
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        setTag(R.id.view_tree_view_model_store_owner, (asFrameworkPaint) BuildersKt.IconCompatParcelizer(-1340292176, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1340292178, new Object[]{view}, iRemoteActionCompatParcelizer));
        setTag(R.id.view_tree_saved_state_registry_owner, UrlUtils.RemoteActionCompatParcelizer(view));
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo48toPx0680j_4(fM3673constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.content$delegate = CompositionKt.RemoteActionCompatParcelizer(ComposableSingletons$AndroidPopup_androidKt.INSTANCE.m3941getLambda$1131826196$ui());
        this.locationOnScreen = new int[2];
    }

    private final void setContent(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.content$delegate.setValue(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ serializer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        int i = 2 % 2;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = AndroidPopup_androidKt.flagsWithSecureFlagInherited(this.properties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        layoutParams.type = this.properties.getWindowType();
        IBinder windowToken = this.properties.getWindowToken();
        if (windowToken == null) {
            int i2 = IconCompatParcelizer + 111;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            windowToken = this.composeView.getApplicationWindowToken();
        }
        layoutParams.token = windowToken;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        String string = this.composeView.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title);
        if (string.startsWith("%('")) {
            int i4 = write + 5;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                String strSubstring = string.substring(3);
                Object[] objArr = new Object[1];
                a(strSubstring, objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        layoutParams.setTitle(string);
        return layoutParams;
    }

    public /* synthetic */ PopupLayout(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, boolean z, PopupLayoutHelper popupLayoutHelper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PopupLayoutHelper popupLayoutHelper2;
        PopupLayoutHelper popupLayoutHelperImpl;
        if ((i & Fields.RotationX) != 0) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                popupLayoutHelperImpl = new PopupLayoutHelperImpl30();
            } else if (i2 >= 29) {
                popupLayoutHelperImpl = new PopupLayoutHelperImpl29();
            } else {
                popupLayoutHelperImpl = new PopupLayoutHelperImpl();
            }
            popupLayoutHelper2 = popupLayoutHelperImpl;
        } else {
            popupLayoutHelper2 = popupLayoutHelper;
        }
        this(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, popupProperties, str, view, density, popupPositionProvider, uuid, z, popupLayoutHelper2);
    }

    static void write() {
        serializer = (byte) -112;
    }
}
