package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.AndroidComposeUiFlags;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.ExperimentalIndirectPointerApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.autofill.PlatformAutofillManagerImpl;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.focus.PlatformFocusOwner;
import androidx.compose.ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeChangeRequester;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.InsetsListener;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RectRulers;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.WindowInsetsRulerProvider;
import androidx.compose.ui.layout.WindowInsetsRulers_androidKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OutOfFrameExecutor;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidComposeView.RootModifierNode;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.ExecuteDelayed;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.xr$$ExternalSyntheticLambda1;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.sentry.util.UrlUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import o.BrazeContentCardsManager;
import o.ContentInViewNode;
import o.DefaultScrollableState;
import o.DragAndDropStartTransferScope;
import o.DragAndDropTransferData;
import o.DrawableTransformation;
import o.FocusPropertiesNode;
import o.FocusRestorerKtsaveFocusedChild11;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.VerticalScrollableClipShape;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.animateToWithDecay;
import o.asFrameworkPaint;
import o.awaitLongPressOrCancellationrnUCldI;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.displayInAppMessagelambda1;
import o.getBrush;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getFilterQualityfv9h1I;
import o.getOffsetF1C5BW0;
import o.getPlatformAndroidManager;
import o.getTransparent0d7_KjU;
import o.hasNonInteropFocusableContent;
import o.isAppSetIdReadingEnabled;
import o.moveFocusaToIllA;
import o.onCreateVirtualViewTranslationRequests;
import o.onHideTranslationui;
import o.onItemDismisslambda0;
import o.onViewAttachedToWindow;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;
import o.resetAfterInAppMessageClose;
import o.setFromtUYjHk;
import o.setNativeShader;
import o.setPathEffect;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, PlatformFocusOwner, ViewRootForTest, MatrixPositionCalculator, DefaultLifecycleObserver, OutOfFrameExecutor, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, FocusListener, ExecuteDelayed {
    private static Method addChangeCallbackMethod;
    private static Method dispatchOnScrollChangedMethod;
    private static Method getBooleanMethod;
    private static Runnable systemPropertiesChangedRunnable;
    private static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final AndroidAutofillManager _autofillManager;
    private final PopulateViewStructure_androidKtpopulate7 _composeViewContext$delegate;
    private final InputModeManagerImpl _inputModeManager;
    private TextInputServiceAndroid _legacyTextInputServiceAndroid;
    private View _rootView;
    private SoftwareKeyboardController _softwareKeyboardController;
    private TextInputService _textInputService;
    private final PopulateViewStructure_androidKtpopulate7 _viewTreeOwners$delegate;
    private final LazyWindowInfo _windowInfo;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboard clipboard;
    private final AndroidClipboardManager clipboardManager;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private boolean composeViewContextIncrementedDuringInit;
    private final PopulateViewStructure_androidKtpopulate7 configuration$delegate;
    private AndroidContentCaptureManager contentCaptureManager;
    private TextAnnouncementContentCardView coroutineContext;
    private float currentFrameRate;
    private float currentFrameRateCategory;
    private final PopulateViewStructure_androidKtpopulate7 density$delegate;
    private final onViewAttachedToWindow derivedIsAttached$delegate;
    private final ContentInViewNode dirtyLayers;
    private final AndroidDragAndDropManager dragAndDropManager;
    private final ContentInViewNode endApplyChangesListeners;
    private final FocusOwner focusOwner;
    private final PopulateViewStructure_androidKtpopulate7 fontFamilyResolver$delegate;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler;
    private View frameRateCategoryView;
    private long globalPosition;
    private final GraphicsContext graphicsContext;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private final IndirectPointerNavigationGestureDetector indirectPointerNavigationGestureDetector;
    private final InsetsListener insetsListener;
    private final PopulateViewStructure_androidKtpopulate7 isAttached$delegate;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;
    private int keepScreenOnCount;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<OwnedLayer> layerCache;
    private final PopulateViewStructure_androidKtpopulate7 layoutDirection$delegate;
    private final animateToWithDecay layoutNodes;
    private LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry lifecycleRetainedValuesStoreOwnerEntry;
    private final onViewAttachedToWindow localeList$delegate;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onReadyForComposition;
    private final BrazeContentCardsManager outOfFrameQueue;
    private final Runnable outOfFrameRunnable;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private ContentInViewNode postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private IndirectPointerEventPrimaryDirectionalMotionAxis primaryDirectionalMotionAxisOverride;
    private boolean processingRequestFocusForNextNonChildView;
    private final RectManager rectManager;
    private long relayoutTime;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private DragAndDropTransferData retainedValuesStore;
    private final LayoutNode root;
    private final ScrollCapture scrollCapture;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private int sensitiveComponentCount;
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private boolean superclassInitComplete;
    private final AtomicReference<SessionMutex.Session<AndroidPlatformTextInputSession>> textInputSessionMutex;
    private final TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final onViewAttachedToWindow viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ContentInViewNode composeViews = new ContentInViewNode();

    public final class RootModifierNode extends Modifier.Node implements BringIntoViewModifierNode, SemanticsModifierNode, RotaryInputModifierNode, KeyInputModifierNode, LayoutModifierNode, TraversableNode, WindowInsetsRulerProvider {
        private int previousGeneration = -1;
        private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM rulerLambda = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$rulerLambda$1
            public final void invoke(RulerScope rulerScope) {
                AndroidComposeView.RootModifierNode rootModifierNode = this.this$0;
                rootModifierNode.setPreviousGeneration(((onHideTranslationui) rootModifierNode.getGeneration()).serializer());
                if (this.this$0.getPreviousGeneration() <= 0 || !ComposeView_androidKt.getAreWindowInsetsRulersEnabled()) {
                    return;
                }
                WindowInsetsRulers_androidKt.provideWindowInsetsRulers(rulerScope, this.this$0);
            }

            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RulerScope) obj);
                return createFromParcel.INSTANCE;
            }
        };

        public static /* synthetic */ void getRulerLambda$annotations() {
        }

        @Override // androidx.compose.ui.node.SemanticsModifierNode
        public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }

        public final int getPreviousGeneration() {
            return this.previousGeneration;
        }

        public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRulerLambda() {
            return this.rulerLambda;
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
        public boolean mo12onPreKeyEventZmokQxo(KeyEvent keyEvent) {
            return false;
        }

        @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
        public boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
            return false;
        }

        @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
        public boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
            return false;
        }

        public final void setPreviousGeneration(int i) {
            this.previousGeneration = i;
        }

        public RootModifierNode() {
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public InsetsListener getInsetsListener() {
            return AndroidComposeView.this.getInsetsListener();
        }

        @Override // androidx.compose.ui.node.TraversableNode
        public Object getTraverseKey() {
            return WindowInsetsRulers_androidKt.RulerKey;
        }

        @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
        public Object bringIntoView(LayoutCoordinates layoutCoordinates, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
            Rect rect = (Rect) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            Rect rectM514translatek4lQ0M = rect != null ? rect.m514translatek4lQ0M(jPositionInRoot) : null;
            if (rectM514translatek4lQ0M != null) {
                AndroidComposeView.this.requestRectangleOnScreen(RectHelper_androidKt.toAndroidRect(rectM514translatek4lQ0M), false);
            }
            return createFromParcel.INSTANCE;
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public ContentInViewNode getCutoutRects() {
            return getInsetsListener().getDisplayCutouts();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public List<RectRulers> getCutoutRulers() {
            return getInsetsListener().getDisplayCutoutRulers();
        }

        public final getPlatformAndroidManager getGeneration() {
            return getInsetsListener().getGeneration();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public DefaultScrollableState getInsetsValues() {
            return getInsetsListener().getInsetsValues();
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        /* JADX INFO: renamed from: measure-3p2s80s */
        public MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
            final Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, this.rulerLambda, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$measure$1
                {
                    super(1);
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo2209measureBRTryo0, 0, 0, 0.0f, 4, null);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return createFromParcel.INSTANCE;
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
        public boolean mo10onKeyEventZmokQxo(KeyEvent keyEvent) {
            Rect embeddedViewFocusRect;
            Boolean boolMo369focusSearchULY8qGw;
            Boolean boolMo369focusSearchULY8qGw2;
            final FocusDirection focusDirectionM362toFocusDirectionZmokQxo = FocusInteropUtils_androidKt.m362toFocusDirectionZmokQxo(keyEvent);
            if (focusDirectionM362toFocusDirectionZmokQxo == null || !KeyEventType.m1894equalsimpl0(KeyEvent_androidKt.m1902getTypeZmokQxo(keyEvent), KeyEventType.Companion.m1898getKeyDownCS__XNY())) {
                return false;
            }
            if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                FocusTargetNode activeFocusTargetNode = AndroidComposeView.this.getFocusOwner().getActiveFocusTargetNode();
                if (activeFocusTargetNode != null && activeFocusTargetNode.isInteropViewHost() && AndroidComposeView.this.mo418moveFocusInChildren3ESFkO8(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl())) {
                    return true;
                }
                Boolean boolMo369focusSearchULY8qGw3 = AndroidComposeView.this.getFocusOwner().mo369focusSearchULY8qGw(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl(), AndroidComposeView.this.getEmbeddedViewFocusRect(), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        return Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl()));
                    }

                    {
                        super(1);
                    }
                });
                if (boolMo369focusSearchULY8qGw3 == null || boolMo369focusSearchULY8qGw3.booleanValue()) {
                    return true;
                }
                if (FocusOwnerImplKt.m377is1dFocusSearch3ESFkO8(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl())) {
                    Integer numM361toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m361toAndroidFocusDirection3ESFkO8(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl());
                    int iIntValue = numM361toAndroidFocusDirection3ESFkO8 != null ? numM361toAndroidFocusDirection3ESFkO8.intValue() : 2;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = AndroidComposeView.this.getRootView();
                    rootView.getClass();
                    View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, AndroidComposeView.this.getView(), iIntValue);
                    if (viewFindNextFocus == null || viewFindNextFocus.equals(AndroidComposeView.this)) {
                        return AndroidComposeView.this.getFocusOwner().mo372resetFocus3ESFkO8(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl());
                    }
                }
                return false;
            }
            Integer numM361toAndroidFocusDirection3ESFkO9 = FocusInteropUtils_androidKt.m361toAndroidFocusDirection3ESFkO8(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl());
            if ((!ComposeUiFlags.isViewFocusFixEnabled || !AndroidComposeView.this.hasFocus() || numM361toAndroidFocusDirection3ESFkO9 == null || !AndroidComposeView.this.mo418moveFocusInChildren3ESFkO8(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl())) && (boolMo369focusSearchULY8qGw = AndroidComposeView.this.getFocusOwner().mo369focusSearchULY8qGw(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl(), (embeddedViewFocusRect = AndroidComposeView.this.getEmbeddedViewFocusRect()), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$2
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Boolean invoke(FocusTargetNode focusTargetNode) {
                    return Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl()));
                }

                {
                    super(1);
                }
            })) != null && !boolMo369focusSearchULY8qGw.booleanValue()) {
                if (!FocusOwnerImplKt.m377is1dFocusSearch3ESFkO8(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl())) {
                    return false;
                }
                if (numM361toAndroidFocusDirection3ESFkO9 != null) {
                    View viewFindNextNonChildView = AndroidComposeView.this.findNextNonChildView(numM361toAndroidFocusDirection3ESFkO9.intValue());
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{viewFindNextNonChildView, AndroidComposeView.this}, getCieXyz.write())).booleanValue()) {
                        viewFindNextNonChildView = null;
                    }
                    if (viewFindNextNonChildView != null) {
                        android.graphics.Rect androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
                        if (androidRect == null) {
                            throw c8$$ExternalSyntheticOutline0.m("Invalid rect");
                        }
                        View rootView2 = AndroidComposeView.this.getRootView();
                        rootView2.getClass();
                        ViewGroup viewGroup = (ViewGroup) rootView2;
                        viewGroup.offsetDescendantRectToMyCoords(AndroidComposeView.this.getView(), androidRect);
                        viewGroup.offsetRectIntoDescendantCoords(viewFindNextNonChildView, androidRect);
                        if (FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextNonChildView, numM361toAndroidFocusDirection3ESFkO9, androidRect)) {
                            return true;
                        }
                    }
                }
                if (AndroidComposeView.this.getFocusOwner().mo366clearFocusI7lrPNg(false, true, false, focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl()) && (boolMo369focusSearchULY8qGw2 = AndroidComposeView.this.getFocusOwner().mo369focusSearchULY8qGw(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl(), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        return Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(focusDirectionM362toFocusDirectionZmokQxo.m352unboximpl()));
                    }

                    {
                        super(1);
                    }
                })) != null) {
                    return boolMo369focusSearchULY8qGw2.booleanValue();
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C00621(ShortNewsContentCardView<? super C00621> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidComposeView.this.textInputSession(null, this);
        }
    }

    private final boolean autofillSupported() {
        return true;
    }

    /* JADX INFO: renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m2661component1VKZWuLQ(long j) {
        return (int) (j >>> 32);
    }

    /* JADX INFO: renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m2662component2VKZWuLQ(long j) {
        return (int) (j & 4294967295L);
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2665getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    /* JADX INFO: renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m2670packZIaKswc(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$0(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.m2671sendMotionEvent8iAsVTc(motionEvent);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("The ACTION_HOVER_EXIT event was not cleared.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        super.dispatchProvideStructure(viewStructure);
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return findViewByAccessibilityIdRootedAtCurrentView(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public AutofillManager getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final ComposeViewContext getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.composeViewContextIncrementedDuringInit;
    }

    public final AndroidContentCaptureManager getContentCaptureManager$ui() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public TextAnnouncementContentCardView getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    public final LifecycleRetainedValuesStoreOwner.FrameEndScheduler getFrameEndScheduler$ui() {
        return this.frameEndScheduler;
    }

    @Override // androidx.compose.ui.node.Owner
    public GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    public final InsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // androidx.compose.ui.node.Owner
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.ui.node.Owner
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final IndirectPointerEventPrimaryDirectionalMotionAxis m2673getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // androidx.compose.ui.node.Owner
    public RectManager getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public DragAndDropTransferData getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    public RootForTest getRootForTest() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final RootForTest.UncaughtExceptionHandler getUncaughtExceptionHandler$ui() {
        return this.uncaughtExceptionHandler;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final AndroidAutofillManager get_autofillManager$ui() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public void invalidateRootLayer() {
        invalidate();
    }

    public final boolean isArrEnabled$ui() {
        return Build.VERSION.SDK_INT >= 35;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // androidx.compose.ui.node.Owner
    public void onInteropViewLayoutChange(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        updatePositionCacheAndDispatch();
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.composeViewContextIncrementedDuringInit = z;
    }

    public final void setContentCaptureManager$ui(AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    public void setCoroutineContext(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.coroutineContext = textAnnouncementContentCardView;
    }

    public final void setFrameEndScheduler$ui(LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler) {
        this.frameEndScheduler = frameEndScheduler;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m2674setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        this.primaryDirectionalMotionAxisOverride = indirectPointerEventPrimaryDirectionalMotionAxis;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public final void setUncaughtExceptionHandler$ui(RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final accessisRenderNodeCompatiblecp lifecycleOwner;
        private final getTransparent0d7_KjU savedStateRegistryOwner;
        private final asFrameworkPaint viewModelStoreOwner;

        public final accessisRenderNodeCompatiblecp getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final getTransparent0d7_KjU getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }

        public final asFrameworkPaint getViewModelStoreOwner() {
            return this.viewModelStoreOwner;
        }

        public ViewTreeOwners(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getTransparent0d7_KjU gettransparent0d7_kju, asFrameworkPaint asframeworkpaint) {
            this.lifecycleOwner = accessisrendernodecompatiblecp;
            this.savedStateRegistryOwner = gettransparent0d7_kju;
            this.viewModelStoreOwner = asframeworkpaint;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iSerializer;
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui()}, getCieXyz.write())).booleanValue();
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.composeAccessibilityDelegate;
        if (zBooleanValue) {
            int iSerializer2 = androidComposeViewAccessibilityDelegateCompat.getIdToBeforeMap$ui().serializer(i);
            if (iSerializer2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iSerializer2);
                return;
            }
            return;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, androidComposeViewAccessibilityDelegateCompat.getExtraDataTestTraversalAfterVal$ui()}, getCieXyz.write())).booleanValue() || (iSerializer = this.composeAccessibilityDelegate.getIdToAfterMap$ui().serializer(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iSerializer);
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.derivedIsAttached$delegate.getValue()).booleanValue();
    }

    private final ComposeViewContext get_composeViewContext() {
        return (ComposeViewContext) this._composeViewContext$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAttached() {
        return ((Boolean) this.isAttached$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: moveFocusInChildrenBypassUnfocusableComposeView-3ESFkO8, reason: not valid java name */
    private final boolean m2667moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m354getEnterdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m355getExitdhqQ8s())) {
            return false;
        }
        Integer numM361toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m361toAndroidFocusDirection3ESFkO8(i);
        if (numM361toAndroidFocusDirection3ESFkO8 == null) {
            throw c8$$ExternalSyntheticOutline0.m("Invalid focus direction");
        }
        int iIntValue = numM361toAndroidFocusDirection3ESFkO8.intValue();
        View viewM2664findNextViewInEmbeddedView3ESFkO8 = m2664findNextViewInEmbeddedView3ESFkO8(i);
        if (viewM2664findNextViewInEmbeddedView3ESFkO8 != null) {
            return FocusInteropUtils_androidKt.requestInteropFocus(viewM2664findNextViewInEmbeddedView3ESFkO8, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    /* JADX INFO: renamed from: moveFocusInChildrenCurrent-3ESFkO8, reason: not valid java name */
    private final boolean m2668moveFocusInChildrenCurrent3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m354getEnterdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m355getExitdhqQ8s())) {
            return false;
        }
        Integer numM361toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m361toAndroidFocusDirection3ESFkO8(i);
        if (numM361toAndroidFocusDirection3ESFkO8 == null) {
            throw c8$$ExternalSyntheticOutline0.m("Invalid focus direction");
        }
        int iIntValue = numM361toAndroidFocusDirection3ESFkO8.intValue();
        Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
        android.graphics.Rect androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = androidRect == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, androidRect, iIntValue);
        if (viewFindNextFocus != null) {
            return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocus, Integer.valueOf(iIntValue), androidRect);
        }
        return false;
    }

    /* JADX INFO: renamed from: moveFocusInChildrenViewFocusFix-3ESFkO8, reason: not valid java name */
    private final boolean m2669moveFocusInChildrenViewFocusFix3ESFkO8(int i) {
        AndroidViewsHandler androidViewsHandler;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m354getEnterdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m355getExitdhqQ8s()) || !hasFocus() || (androidViewsHandler = this._androidViewsHandler) == null) {
            return false;
        }
        Integer numM361toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m361toAndroidFocusDirection3ESFkO8(i);
        if (numM361toAndroidFocusDirection3ESFkO8 == null) {
            throw c8$$ExternalSyntheticOutline0.m("Invalid focus direction");
        }
        int iIntValue = numM361toAndroidFocusDirection3ESFkO8.intValue();
        View rootView = getRootView();
        rootView.getClass();
        ViewGroup viewGroup = (ViewGroup) rootView;
        View viewFindFocus = viewGroup.findFocus();
        if (viewFindFocus == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("view hasFocus but root can't find it");
            return false;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewFindFocus, iIntValue);
        android.graphics.Rect androidRect = null;
        if (!FocusOwnerImplKt.m377is1dFocusSearch3ESFkO8(i) || !androidViewsHandler.hasFocus()) {
            Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
            androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
            if (viewFindNextFocus != null && androidRect != null) {
                viewGroup.offsetDescendantRectToMyCoords(this, androidRect);
                viewGroup.offsetRectIntoDescendantCoords(viewFindNextFocus, androidRect);
            }
        }
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            return false;
        }
        View focusedChild = androidViewsHandler.getFocusedChild();
        ViewParent parent = viewFindNextFocus.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return false;
        }
        return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocus, Integer.valueOf(iIntValue), androidRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void outOfFrameRunnable$lambda$0(AndroidComposeView androidComposeView) {
        Trace.beginSection("AndroidOwner:outOfFrameExecutor");
        while (!androidComposeView.outOfFrameQueue.isEmpty()) {
            try {
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) androidComposeView.outOfFrameQueue.removeLast()).invoke();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        Trace.endSection();
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo2705calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m2746invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private void setDensity(Density density) {
        this.density$delegate.setValue(density);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver$delegate.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    private final void set_composeViewContext(ComposeViewContext composeViewContext) {
        this._composeViewContext$delegate.setValue(composeViewContext);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j = this.globalPosition;
        int iM3801getXimpl = IntOffset.m3801getXimpl(j);
        int iM3802getYimpl = IntOffset.m3802getYimpl(j);
        int[] iArr = this.tmpPositionArray;
        boolean z = false;
        z = false;
        z = false;
        int i = iArr[0];
        if (iM3801getXimpl != i || iM3802getYimpl != iArr[1] || this.lastMatrixRecalculationAnimationTime < 0) {
            this.globalPosition = IntOffset.m3795constructorimpl((((long) i) << 32) | (((long) iArr[1]) & 4294967295L));
            if (iM3801getXimpl != Integer.MAX_VALUE && iM3802getYimpl != Integer.MAX_VALUE) {
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getRoot().get_children$ui();
                Object[] objArr = oncreatevirtualviewtranslationrequests.write;
                int i2 = oncreatevirtualviewtranslationrequests.read;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((LayoutNode) objArr[i3]).getMeasurePassDelegate$ui().requestLayoutIfCoordinatesAreUsedAndNotifyChildren();
                }
                z = true;
            }
        }
        recalculateWindowPosition();
        View rootView = this._rootView;
        if (rootView == null) {
            rootView = getRootView();
            this._rootView = rootView;
        }
        getRectManager().m2839updateOffsetsgTq6Wqs(this.globalPosition, IntOffsetKt.m3818roundk4lQ0M(this.windowPosition), this.viewToWindowMatrix, rootView.getWidth(), rootView.getHeight());
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
        getRectManager().dispatchCallbacks();
    }

    private final void updateWindowMetrics() {
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this._windowInfo._containerSize;
        if (populateViewStructure_androidKtpopulate7 != null) {
            populateViewStructure_androidKtpopulate7.setValue(AndroidWindowInfo_androidKt.calculateWindowSize(this));
        }
    }

    public final Object boundsUpdatesAccessibilityEventLoop(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        Object objBoundsUpdatesEventLoop$ui = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui(shortNewsContentCardView);
        return objBoundsUpdatesEventLoop$ui == CoroutineSingletons.COROUTINE_SUSPENDED ? objBoundsUpdatesEventLoop$ui : createFromParcel.INSTANCE;
    }

    public final Object boundsUpdatesContentCaptureEventLoop(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        Object objBoundsUpdatesEventLoop$ui = this.contentCaptureManager.boundsUpdatesEventLoop$ui(shortNewsContentCardView);
        return objBoundsUpdatesEventLoop$ui == CoroutineSingletons.COROUTINE_SUSPENDED ? objBoundsUpdatesEventLoop$ui : createFromParcel.INSTANCE;
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: dispatchOnScrollChanged-k-4lQ0M */
    public void mo2617dispatchOnScrollChangedk4lQ0M(long j) {
        Companion.dispatchOnScrollChanged(getViewTreeObserver());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        Rect rectCalculateFocusRectRelativeTo;
        if (view == null || this.measureAndLayoutDelegate.getDuringMeasureLayout$ui()) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !AndroidComposeView_androidKt.containsDescendant(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view != this || (rectCalculateFocusRectRelativeTo = getFocusOwner().getFocusRect()) == null) {
            rectCalculateFocusRectRelativeTo = FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(view, this);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i);
        int iM352unboximpl = focusDirection != null ? focusDirection.m352unboximpl() : FocusDirection.Companion.m353getDowndhqQ8s();
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        if (getFocusOwner().mo369focusSearchULY8qGw(iM352unboximpl, rectCalculateFocusRectRelativeTo, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                createinappmessageeventsubscriber.IconCompatParcelizer = focusTargetNode;
                return Boolean.TRUE;
            }
        }) == null) {
            return view;
        }
        if (createinappmessageeventsubscriber.IconCompatParcelizer != null) {
            if (viewFindNextFocus != null) {
                if (FocusOwnerImplKt.m377is1dFocusSearch3ESFkO8(iM352unboximpl)) {
                    if (!ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                        return super.focusSearch(view, i);
                    }
                } else if (TwoDimensionalFocusSearchKt.m425isBetterCandidateI7lrPNg(FocusTraversalKt.focusRect((FocusTargetNode) createinappmessageeventsubscriber.IconCompatParcelizer), FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(viewFindNextFocus, this), rectCalculateFocusRectRelativeTo, iM352unboximpl)) {
                }
            }
            return this;
        }
        if (viewFindNextFocus == null) {
            return super.focusSearch(view, i);
        }
        return viewFindNextFocus;
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void forceAccessibilityForTesting(boolean z) {
        this.composeAccessibilityDelegate.setAccessibilityForceEnabledForTesting$ui(z);
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, z);
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.configuration$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public Density getDensity() {
        return (Density) this.density$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || !this.outOfFrameQueue.isEmpty();
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public LocaleList getLocaleList() {
        return (LocaleList) this.localeList$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean z) {
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.resendMotionEventOnLayout;
                } finally {
                    Trace.endSection();
                }
            } else {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            getRectManager().dispatchCallbacks();
            dispatchPendingInteropLayoutCallbacks();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw */
    public void mo2618measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m2490measureAndLayout0kLqBqw(layoutNode, j);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
                getRectManager().dispatchCallbacks();
                dispatchPendingInteropLayoutCallbacks();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m157getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? getLegacyTextInputServiceAndroid().isEditorFocused() : androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m157getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? getLegacyTextInputServiceAndroid().createInputConnection(editorInfo) : androidPlatformTextInputSession.createInputConnection(editorInfo);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        this.contentCaptureManager.onCreateVirtualViewTranslationRequests$ui(jArr, iArr, consumer);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        updatePositionCacheAndDispatch();
        dispatchConfigurationChangeIfNeeded();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
            this.onMeasureConstraints = null;
            updatePositionCacheAndDispatch();
            if (this._androidViewsHandler != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui(layoutNode);
        this.contentCaptureManager.onLayoutChange$ui();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long jM2663convertMeasureSpecI7RO_PI = m2663convertMeasureSpecI7RO_PI(i);
            long jM2663convertMeasureSpecI7RO_PI2 = m2663convertMeasureSpecI7RO_PI(i2);
            long jM3634fitPrioritizingHeightZbe2FdA = Constraints.Companion.m3634fitPrioritizingHeightZbe2FdA((int) (jM2663convertMeasureSpecI7RO_PI >>> 32), (int) (jM2663convertMeasureSpecI7RO_PI & 4294967295L), (int) (jM2663convertMeasureSpecI7RO_PI2 >>> 32), (int) (4294967295L & jM2663convertMeasureSpecI7RO_PI2));
            Constraints constraints = this.onMeasureConstraints;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m3613boximpl(jM3634fitPrioritizingHeightZbe2FdA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else if (constraints == null || !Constraints.m3619equalsimpl0(constraints.m3632unboximpl(), jM3634fitPrioritizingHeightZbe2FdA)) {
                this.wasMeasuredWithMultipleConstraints = true;
            }
            this.measureAndLayoutDelegate.m2491updateRootConstraintsBRTryo0(jM3634fitPrioritizingHeightZbe2FdA);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui();
        this.contentCaptureManager.onSemanticsChange$ui();
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.onVirtualViewTranslationResponses$ui(androidContentCaptureManager, longSparseArray);
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (this.endApplyChangesListeners.RemoteActionCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) >= 0) {
            return;
        }
        this.endApplyChangesListeners.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.OutOfFrameExecutor
    public void schedule(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        boolean zIsEmpty = this.outOfFrameQueue.isEmpty();
        this.outOfFrameQueue.addLast(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.outOfFrameRunnable);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui(j);
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration$delegate.setValue(configuration);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void setUncaughtExceptionHandler(RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
        this.measureAndLayoutDelegate.setUncaughtExceptionHandler$ui(uncaughtExceptionHandler);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void addNotificationForSysPropsChange$lambda$0() {
            synchronized (AndroidComposeView.composeViews) {
                final int i = 0;
                if (Build.VERSION.SDK_INT < 30) {
                    ContentInViewNode contentInViewNode = AndroidComposeView.composeViews;
                    Object[] objArr = contentInViewNode.read;
                    int i2 = contentInViewNode.IconCompatParcelizer;
                    for (int i3 = 0; i3 < i2; i3++) {
                        final AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i3];
                        boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                        androidComposeView.setShowLayoutBounds(AndroidComposeView.Companion.getIsShowingLayoutBounds());
                        if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                            androidComposeView.post(new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$Companion$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i4 = i;
                                    AndroidComposeView androidComposeView2 = androidComposeView;
                                    if (i4 != 0) {
                                        androidComposeView2.invalidateDescendants();
                                    } else {
                                        androidComposeView2.invalidateDescendants();
                                    }
                                }
                            });
                        }
                    }
                } else {
                    ContentInViewNode contentInViewNode2 = AndroidComposeView.composeViews;
                    Object[] objArr2 = contentInViewNode2.read;
                    int i4 = contentInViewNode2.IconCompatParcelizer;
                    while (i < i4) {
                        final AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr2[i];
                        final int i5 = 1;
                        androidComposeView2.post(new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$Companion$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i6 = i5;
                                AndroidComposeView androidComposeView3 = androidComposeView2;
                                if (i6 != 0) {
                                    androidComposeView3.invalidateDescendants();
                                } else {
                                    androidComposeView3.invalidateDescendants();
                                }
                            }
                        });
                        i++;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addNotificationForSysPropsChange(AndroidComposeView androidComposeView) {
            if (Build.VERSION.SDK_INT > 28) {
                if (AndroidComposeView.systemPropertiesChangedRunnable == null) {
                    xr$$ExternalSyntheticLambda1 xr__externalsyntheticlambda1 = new xr$$ExternalSyntheticLambda1(2);
                    AndroidComposeView.systemPropertiesChangedRunnable = xr__externalsyntheticlambda1;
                    StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                    try {
                        if (AndroidComposeView.systemPropertiesClass == null) {
                            AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                        }
                        if (AndroidComposeView.addChangeCallbackMethod == null) {
                            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                            Class cls = AndroidComposeView.systemPropertiesClass;
                            AndroidComposeView.addChangeCallbackMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        }
                        Method method = AndroidComposeView.addChangeCallbackMethod;
                        if (method != null) {
                            method.invoke(null, xr__externalsyntheticlambda1);
                        }
                    } catch (Throwable unused) {
                    }
                    StrictMode.setVmPolicy(vmPolicy);
                }
                synchronized (AndroidComposeView.composeViews) {
                    AndroidComposeView.composeViews.read(androidComposeView);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeNotificationForSysPropsChange(AndroidComposeView androidComposeView) {
            if (Build.VERSION.SDK_INT > 28) {
                synchronized (AndroidComposeView.composeViews) {
                    AndroidComposeView.composeViews.write(androidComposeView);
                }
            }
        }

        @SuppressLint
        public final void dispatchOnScrollChanged(ViewTreeObserver viewTreeObserver) {
            try {
                if (AndroidComposeView.dispatchOnScrollChangedMethod == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.dispatchOnScrollChangedMethod = declaredMethod;
                }
                Method method = AndroidComposeView.dispatchOnScrollChangedMethod;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                }
                if (AndroidComposeView.getBooleanMethod == null) {
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE}, getCieXyz.write())).booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(Context context, ComposeViewContext composeViewContext) {
        AndroidAutofillManager androidAutofillManager;
        super(context);
        this._composeViewContext$delegate = CompositionKt.RemoteActionCompatParcelizer(composeViewContext);
        Offset.Companion companion = Offset.Companion;
        this.lastDownPointerPosition = companion.m492getUnspecifiedF1C5BW0();
        final int i = 1;
        this.superclassInitComplete = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.sharedDrawScope = AndroidComposeUiFlags.isSharedDrawingEnabled ? composeViewContext.getSharedDrawScope$ui() : new LayoutNodeDrawScope(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.retainedValuesStore = DragAndDropStartTransferScope.RemoteActionCompatParcelizer;
        this.outOfFrameQueue = new BrazeContentCardsManager();
        final int i2 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        this.outOfFrameRunnable = new Runnable(this) { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda1
            public final /* synthetic */ AndroidComposeView f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                AndroidComposeView androidComposeView = this.f$0;
                if (i3 != 0) {
                    AndroidComposeView.sendHoverExitEvent$lambda$0(androidComposeView);
                } else {
                    AndroidComposeView.outOfFrameRunnable$lambda$0(androidComposeView);
                }
            }
        };
        Density Density = AndroidDensity_androidKt.Density(context);
        o.AndroidContentCaptureManager androidContentCaptureManager = o.AndroidContentCaptureManager.read;
        this.density$delegate = CompositionKt.serializer(Density, androidContentCaptureManager);
        this.focusOwner = new FocusOwnerImpl(this, this);
        this.coroutineContext = composeViewContext.getCompositionContext$ui().MediaDescriptionCompat();
        this.dragAndDropManager = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(this));
        this._windowInfo = new LazyWindowInfo();
        this.isAttached$delegate = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.derivedIsAttached$delegate = CompositionKt.serializer(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidComposeView$derivedIsAttached$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.isAttached());
            }

            {
                super(0);
            }
        });
        this.canvasHolder = AndroidComposeUiFlags.isSharedDrawingEnabled ? composeViewContext.getCanvasHolder$ui() : new CanvasHolder();
        this.viewConfiguration = AndroidComposeUiFlags.isSharedViewConfigurationEnabled ? composeViewContext.getViewConfiguration$ui() : new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        this.insetsListener = new InsetsListener(this);
        LayoutNode layoutNode = new LayoutNode(objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, 3, objArr3 == true ? 1 : 0);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setViewConfiguration(getViewConfiguration());
        layoutNode.setModifier(new ModifierNodeElement<RootModifierNode>() { // from class: androidx.compose.ui.platform.AndroidComposeView$root$1$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(AndroidComposeView.RootModifierNode rootModifierNode) {
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public AndroidComposeView.RootModifierNode create() {
                return this.this$0.new RootModifierNode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return this.this$0.hashCode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("rootModifier");
            }
        }.then(getFocusOwner().getModifier()).then(getDragAndDropManager().getModifier()));
        this.root = layoutNode;
        animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
        this.layoutNodes = new animateToWithDecay();
        this.rectManager = new RectManager(getLayoutNodes(), this);
        this.semanticsOwner = new SemanticsOwner(getRoot(), new EmptySemanticsModifier(), getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = AndroidComposeUiFlags.isSharedAccessibilityManagerEnabled ? composeViewContext.getAccessibilityManager$ui() : new AndroidAccessibilityManager(context);
        this.graphicsContext = AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ContentInViewNode();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configuration$delegate = CompositionKt.RemoteActionCompatParcelizer(new Configuration(context.getResources().getConfiguration()));
        this.localeList$delegate = CompositionKt.serializer(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidComposeView$localeList$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final LocaleList invoke() {
                android.os.LocaleList locales = this.this$0.getConfiguration().getLocales();
                hasNonInteropFocusableContent hasnoninteropfocusablecontent = new hasNonInteropFocusableContent(new moveFocusaToIllA(locales));
                if (locales.isEmpty()) {
                    hasnoninteropfocusablecontent = new hasNonInteropFocusableContent(new moveFocusaToIllA(android.os.LocaleList.getDefault()));
                }
                int i3 = hasnoninteropfocusablecontent.read();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    Locale locale = hasnoninteropfocusablecontent.read(i4);
                    locale.getClass();
                    arrayList.add(new androidx.compose.ui.text.intl.Locale(locale));
                }
                return new LocaleList(arrayList);
            }

            {
                super(0);
            }
        });
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        if (autofillSupported()) {
            android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) context.getSystemService(android.view.autofill.AutofillManager.class);
            if (autofillManager == null) {
                throw c8$$ExternalSyntheticOutline0.m("Autofill service could not be located.");
            }
            androidAutofillManager = new AndroidAutofillManager(new PlatformAutofillManagerImpl(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            androidAutofillManager = null;
        }
        this._autofillManager = androidAutofillManager;
        this.clipboardManager = AndroidComposeUiFlags.isSharedClipboardManagerEnabled ? composeViewContext.getClipboardManager$ui() : new AndroidClipboardManager(context);
        this.clipboard = AndroidComposeUiFlags.isSharedClipboardManagerEnabled ? composeViewContext.getClipboard$ui() : new AndroidClipboard(getClipboardManager());
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        this.globalPosition = IntOffset.m3795constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        this.tmpPositionArray = new int[]{0, 0};
        float[] fArrM969constructorimpl$default = Matrix.m969constructorimpl$default(null, 1, null);
        this.tmpMatrix = fArrM969constructorimpl$default;
        this.viewToWindowMatrix = Matrix.m969constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m969constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.m491getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        this._viewTreeOwners$delegate = CompositionKt.RemoteActionCompatParcelizer(null);
        this.viewTreeOwners$delegate = CompositionKt.serializer(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final AndroidComposeView.ViewTreeOwners invoke() {
                return this.this$0.get_viewTreeOwners();
            }

            {
                super(0);
            }
        });
        this.textInputSessionMutex = SessionMutex.m153constructorimpl();
        this.fontLoader = AndroidComposeUiFlags.isSharedFontEnabled ? composeViewContext.getFontLoader$ui() : new AndroidFontResourceLoader(context);
        this.fontFamilyResolver$delegate = AndroidComposeUiFlags.isSharedFontEnabled ? composeViewContext.getFontFamilyResolver$ui() : CompositionKt.serializer(FontFamilyResolver_androidKt.createFontFamilyResolver(context), androidContentCaptureManager);
        LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        this.layoutDirection$delegate = CompositionKt.RemoteActionCompatParcelizer(layoutDirection == null ? LayoutDirection.Ltr : layoutDirection);
        this.hapticFeedBack = AndroidComposeUiFlags.isSharedHapticsEnabled ? composeViewContext.getHapticFeedback$ui() : new PlatformHapticFeedback(this);
        this._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.Companion.m1543getTouchaOaMEAU() : InputMode.Companion.m1542getKeyboardaOaMEAU(), new InputModeChangeRequester() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            @Override // androidx.compose.ui.input.InputModeChangeRequester
            /* JADX INFO: renamed from: request-iuPiT84 */
            public final boolean mo1544requestiuPiT84(int i3) {
                InputMode.Companion companion2 = InputMode.Companion;
                if (InputMode.m1538equalsimpl0(i3, companion2.m1543getTouchaOaMEAU())) {
                    return this.this$0.isInTouchMode();
                }
                if (!InputMode.m1538equalsimpl0(i3, companion2.m1542getKeyboardaOaMEAU())) {
                    return false;
                }
                if (this.this$0.isInTouchMode()) {
                    return this.this$0.requestFocusFromTouch();
                }
                return true;
            }
        }, objArr2 == true ? 1 : 0);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new WeakCache<>();
        this.endApplyChangesListeners = new ContentInViewNode();
        this.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                int actionMasked;
                this.this$0.removeCallbacks(this);
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i3 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                AndroidComposeView androidComposeView = this.this$0;
                androidComposeView.sendSimulatedEvent(motionEvent, i3, androidComposeView.relayoutTime, false);
            }
        };
        this.sendHoverExitEvent = new Runnable(this) { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda1
            public final /* synthetic */ AndroidComposeView f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                AndroidComposeView androidComposeView = this.f$0;
                if (i3 != 0) {
                    AndroidComposeView.sendHoverExitEvent$lambda$0(androidComposeView);
                } else {
                    AndroidComposeView.outOfFrameRunnable$lambda$0(androidComposeView);
                }
            }
        };
        this.indirectPointerNavigationGestureDetector = new IndirectPointerNavigationGestureDetector(context, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$indirectPointerNavigationGestureDetector$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* synthetic */ Object invoke(Object obj) {
                m2678invoke3ESFkO8(((FocusDirection) obj).m352unboximpl());
                return createFromParcel.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final void m2678invoke3ESFkO8(int i3) {
                this.this$0.getFocusOwner().mo370moveFocusaToIllA(i3, false);
            }

            {
                super(1);
            }
        });
        this.resendMotionEventOnLayout = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2679invoke() {
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        this.this$0.relayoutTime = SystemClock.uptimeMillis();
                        AndroidComposeView androidComposeView = this.this$0;
                        androidComposeView.post(androidComposeView.resendMotionEventRunnable);
                    }
                }
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2679invoke();
                return createFromParcel.INSTANCE;
            }
        };
        int i3 = Build.VERSION.SDK_INT;
        this.matrixToWindow = i3 < 29 ? new CalculateMatrixToWindowApi21(fArrM969constructorimpl$default, objArr == true ? 1 : 0) : new CalculateMatrixToWindowApi29();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        FocusPropertiesNode.write(this, androidComposeViewAccessibilityDelegateCompat);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        setOnDragListener(getDragAndDropManager());
        getRoot().attach$ui(this);
        if (i3 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        if (isArrEnabled$ui()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.frameRateCategoryView = view;
            addView(view);
        }
        this.scrollCapture = i3 >= 31 ? new ScrollCapture() : null;
        this.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private PointerIcon currentMouseCursorIcon = PointerIcon.Companion.getDefault();
            private PointerIcon currentStylusHoverIcon;

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public PointerIcon getIcon() {
                return this.currentMouseCursorIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public PointerIcon getStylusHoverIcon() {
                return this.currentStylusHoverIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setStylusHoverIcon(PointerIcon pointerIcon) {
                this.currentStylusHoverIcon = pointerIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    pointerIcon = PointerIcon.Companion.getDefault();
                }
                this.currentMouseCursorIcon = pointerIcon;
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this.this$0, pointerIcon);
            }
        };
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = layoutNode.get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            invalidateLayers((LayoutNode) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo2615calculateLocalPositionMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m975mapMKHz9U(this.windowToViewMatrix, j);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo2616calculatePositionInWindowMKHz9U(long j) {
        recalculateWindowPosition();
        return Matrix.m975mapMKHz9U(this.viewToWindowMatrix, j);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.composeAccessibilityDelegate.m2686canScroll0AR0LA0$ui(false, i, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.composeAccessibilityDelegate.m2686canScroll0AR0LA0$ui(true, i, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public Object executeDelayed(long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        AndroidComposeView$$ExternalSyntheticLambda3 androidComposeView$$ExternalSyntheticLambda3 = new AndroidComposeView$$ExternalSyntheticLambda3(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        postDelayed(androidComposeView$$ExternalSyntheticLambda3, j);
        return androidComposeView$$ExternalSyntheticLambda3;
    }

    @Override // androidx.compose.ui.input.pointer.MatrixPositionCalculator
    /* JADX INFO: renamed from: localToScreen-58bKbWc */
    public void mo1977localToScreen58bKbWc(float[] fArr) {
        recalculateWindowPosition();
        Matrix.m988timesAssign58bKbWc(fArr, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m2692preTranslatecG2Xzmc(fArr, Float.intBitsToFloat((int) (this.windowPosition >> 32)), Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo2155localToScreenMKHz9U(long j) {
        recalculateWindowPosition();
        long jM975mapMKHz9U = Matrix.m975mapMKHz9U(this.viewToWindowMatrix, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM975mapMKHz9U >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM975mapMKHz9U & 4294967295L));
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)) + fIntBitsToFloat3)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2 + fIntBitsToFloat) << 32));
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, null);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.outOfFrameRunnable);
        }
        this.outOfFrameRunnable.run();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateConfiguration(configuration);
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        return (parent$ui == null || parent$ui.getHasFixedInnerContentConstraints$ui()) ? false : true;
    }

    /* JADX INFO: renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m2663convertMeasureSpecI7RO_PI(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return m2670packZIaKswc(0, size);
        }
        if (mode == 0) {
            return m2670packZIaKswc(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return m2670packZIaKswc(size, size);
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        return 0L;
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    /* JADX INFO: renamed from: findNextViewInEmbeddedView-3ESFkO8, reason: not valid java name */
    private final View m2664findNextViewInEmbeddedView3ESFkO8(int i) {
        FocusTargetNode activeFocusTargetNode = getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("findNextViewInEmbeddedView called when owner does not have anything focused.");
            return null;
        }
        Integer numM361toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m361toAndroidFocusDirection3ESFkO8(i);
        if (numM361toAndroidFocusDirection3ESFkO8 == null) {
            throw c8$$ExternalSyntheticOutline0.m("Invalid focus direction");
        }
        int iIntValue = numM361toAndroidFocusDirection3ESFkO8.intValue();
        View interopView = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode).getInteropView();
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue);
        if (viewFindNextFocus == null || interopView == null || !AndroidComposeView_androidKt.containsDescendant(interopView, viewFindNextFocus)) {
            return null;
        }
        return viewFindNextFocus;
    }

    private final boolean handleIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        boolean zDispatchIndirectPointerEvent = getFocusOwner().dispatchIndirectPointerEvent(indirectPointerEvent);
        if (!ComposeUiFlags.isIndirectPointerNavigationGestureDetectorEnabled) {
            return zDispatchIndirectPointerEvent;
        }
        this.indirectPointerNavigationGestureDetector.onIndirectPointerEvent(indirectPointerEvent, zDispatchIndirectPointerEvent);
        return true;
    }

    /* JADX INFO: renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m2666handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                boolean z = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                    if (isDevicePressEvent(motionEvent2)) {
                        this.pointerInputEventProcessor.processCancel();
                    } else if (motionEvent2.getActionMasked() != 10 && z) {
                        sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (!z && z2 && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                    sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.previousMotionEvent;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.previousMotionEvent;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.motionEventAdapter.endStream(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.previousMotionEvent;
                        float x = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.previousMotionEvent;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.previousMotionEvent;
                        boolean z4 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                this.motionEventAdapter.endStream(pointerId);
                            }
                            this.pointerInputEventProcessor.clearPreviouslyHitModifierNodes();
                        }
                    }
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int iM2671sendMotionEvent8iAsVTc = m2671sendMotionEvent8iAsVTc(motionEvent);
                Trace.endSection();
                this.forceUseMatrixCache = false;
                return iM2671sendMotionEvent8iAsVTc;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            this.forceUseMatrixCache = false;
            throw th2;
        }
    }

    private final boolean handleRotaryEvent(final MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        getContext();
        float fSerializer = resetAfterInAppMessageClose.serializer(viewConfiguration);
        getContext();
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(fSerializer * f, resetAfterInAppMessageClose.write(viewConfiguration) * f, motionEvent.getEventTime(), motionEvent.getDeviceId()), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidComposeView.handleRotaryEvent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Boolean invoke() {
                return Boolean.valueOf(AndroidComposeView.super.dispatchGenericMotionEvent(motionEvent));
            }
        });
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f - iArr2[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr2[1])) & 4294967295L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m2672startDrag12SF9DM(androidx.compose.ui.draganddrop.DragAndDropTransferData dragAndDropTransferData, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null));
    }

    private final void updateConfiguration(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{configuration2, configuration}, iWrite3)).booleanValue()) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AndroidDensity_androidKt.Density(getContext()));
        }
        if (AndroidComposeView_androidKt.diffForWindowMetricsChanged(configuration2, configuration)) {
            updateWindowMetrics();
        }
        if (AndroidComposeUiFlags.isSharedFontEnabled || getFontWeightAdjustmentCompat(configuration2) == getFontWeightAdjustmentCompat(configuration)) {
            return;
        }
        setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder, final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui().addView(androidViewHolder);
        getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        androidViewHolder.setImportantForAccessibility(1);
        FocusPropertiesNode.write(androidViewHolder, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1
            /* JADX WARN: Code duplicated, block: B:19:0x0056  */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
                super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
                if (AndroidComposeView.this.composeAccessibilityDelegate.isEnabled$ui()) {
                    focusRestorerKtsaveFocusedChild11.write.setVisibleToUser(false);
                }
                LayoutNode parent$ui = layoutNode.getParent$ui();
                while (true) {
                    if (parent$ui == null) {
                        parent$ui = null;
                        break;
                    } else if (parent$ui.getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(8))) {
                        break;
                    } else {
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                Integer numValueOf = parent$ui != null ? Integer.valueOf(parent$ui.getSemanticsId()) : null;
                if (numValueOf != null) {
                    if (numValueOf.intValue() == AndroidComposeView.this.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                        numValueOf = -1;
                    }
                } else {
                    numValueOf = -1;
                }
                AndroidComposeView androidComposeView = this;
                int iIntValue = numValueOf.intValue();
                focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer = iIntValue;
                AccessibilityNodeInfo accessibilityNodeInfo = focusRestorerKtsaveFocusedChild11.write;
                accessibilityNodeInfo.setParent(androidComposeView, iIntValue);
                int semanticsId = layoutNode.getSemanticsId();
                int iSerializer = AndroidComposeView.this.composeAccessibilityDelegate.getIdToBeforeMap$ui().serializer(semanticsId);
                if (iSerializer != -1) {
                    View viewSemanticsIdToView = SemanticsUtils_androidKt.semanticsIdToView(AndroidComposeView.this.getAndroidViewsHandler$ui(), iSerializer);
                    if (viewSemanticsIdToView != null) {
                        accessibilityNodeInfo.setTraversalBefore(viewSemanticsIdToView);
                    } else {
                        accessibilityNodeInfo.setTraversalBefore(this, iSerializer);
                    }
                    AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                    androidComposeView2.addExtraDataToAccessibilityNodeInfoHelper(semanticsId, accessibilityNodeInfo, androidComposeView2.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui());
                }
                int iSerializer2 = AndroidComposeView.this.composeAccessibilityDelegate.getIdToAfterMap$ui().serializer(semanticsId);
                if (iSerializer2 != -1) {
                    View viewSemanticsIdToView2 = SemanticsUtils_androidKt.semanticsIdToView(AndroidComposeView.this.getAndroidViewsHandler$ui(), iSerializer2);
                    if (viewSemanticsIdToView2 != null) {
                        accessibilityNodeInfo.setTraversalAfter(viewSemanticsIdToView2);
                    } else {
                        accessibilityNodeInfo.setTraversalAfter(this, iSerializer2);
                    }
                    AndroidComposeView androidComposeView3 = AndroidComposeView.this;
                    androidComposeView3.addExtraDataToAccessibilityNodeInfoHelper(semanticsId, accessibilityNodeInfo, androidComposeView3.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal$ui());
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (!ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        if (getFocusOwner().hasFocusableContent()) {
            super.addFocusables(arrayList, i, i2);
            if (getFocusOwner().hasNonInteropFocusableContent() || arrayList == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void decrementKeepScreenOnCount() {
        this.keepScreenOnCount--;
        getView().setKeepScreenOn(this.keepScreenOnCount > 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (!isBadMotionEvent(motionEvent) && isAttachedToWindow()) {
            this.composeAccessibilityDelegate.dispatchHoverEvent$ui(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && isInBounds(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.previousMotionEvent;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                    this.hoverExitReceived = true;
                    postDelayed(this.sendHoverExitEvent, 8L);
                    return false;
                }
            } else if (!isPositionChanged(motionEvent)) {
                return false;
            }
            if ((m2666handleMotionEvent8iAsVTc(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        getAndroidViewsHandler$ui().drawView(androidViewHolder, canvas);
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public void focusTargetAvailable() {
        if (getFocusOwner().getRootState().getHasFocus()) {
            return;
        }
        focusableViewAvailable(this);
    }

    @Override // androidx.compose.ui.node.Owner
    public WindowInfo getWindowInfo() {
        return AndroidComposeUiFlags.isSharedWindowInfoEnabled ? getComposeViewContext().getWindowInfo$ui() : this._windowInfo;
    }

    @Override // androidx.compose.ui.node.Owner
    public void incrementKeepScreenOnCount() {
        this.keepScreenOnCount++;
        getView().setKeepScreenOn(this.keepScreenOnCount > 0);
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    /* JADX INFO: renamed from: moveFocusInChildren-3ESFkO8 */
    public boolean mo418moveFocusInChildren3ESFkO8(int i) {
        if (ComposeUiFlags.isViewFocusFixEnabled) {
            return m2669moveFocusInChildrenViewFocusFix3ESFkO8(i);
        }
        return ComposeUiFlags.isBypassUnfocusableComposeViewEnabled ? m2667moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(i) : m2668moveFocusInChildrenCurrent3ESFkO8(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        accessisRenderNodeCompatiblecp lifecycleOwner;
        supportsColorMatrixQuery lifecycle;
        supportsColorMatrixQuery lifecycle2;
        accessisRenderNodeCompatiblecp lifecycleOwner2;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
        }
        if (ComposeView_androidKt.getAreWindowInsetsRulersEnabled()) {
            this.insetsListener.onViewAttachedToWindow(this);
        }
        Companion.addNotificationForSysPropsChange(this);
        if (!this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().incrementViewCount$ui();
        }
        this.composeViewContextIncrementedDuringInit = false;
        if (!AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            this._windowInfo.setWindowFocused(hasWindowFocus());
            this._windowInfo.setOnInitializeContainerSize(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow.1
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final DerivedSize invoke() {
                    return AndroidWindowInfo_androidKt.calculateWindowSize(AndroidComposeView.this);
                }

                {
                    super(0);
                }
            });
            updateWindowMetrics();
        }
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        boolean z = AndroidComposeUiFlags.isSharedWindowInfoEnabled;
        DragAndDropTransferData dragAndDropTransferData = DragAndDropStartTransferScope.RemoteActionCompatParcelizer;
        supportsColorMatrixQuery lifecycle3 = null;
        if (z) {
            DragAndDropTransferData dragAndDropTransferDataInstallLocalRetainedValuesStore = installLocalRetainedValuesStore(getComposeViewContext().getLifecycleOwner$ui(), getComposeViewContext().getViewModelStoreOwner$ui());
            if (dragAndDropTransferDataInstallLocalRetainedValuesStore != null) {
                dragAndDropTransferData = dragAndDropTransferDataInstallLocalRetainedValuesStore;
            }
            this.retainedValuesStore = dragAndDropTransferData;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onReadyForComposition;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getComposeViewContext());
                this.onReadyForComposition = null;
            }
            lifecycle2 = getComposeViewContext().getLifecycleOwner$ui().getLifecycle();
        } else {
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{this}, getCieXyz.write());
            getTransparent0d7_KjU gettransparent0d7_kjuRemoteActionCompatParcelizer = UrlUtils.RemoteActionCompatParcelizer(this);
            asFrameworkPaint asframeworkpaint = (asFrameworkPaint) BuildersKt.IconCompatParcelizer(-1340292176, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1340292178, new Object[]{this}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
            DragAndDropTransferData dragAndDropTransferDataInstallLocalRetainedValuesStore2 = installLocalRetainedValuesStore(accessisrendernodecompatiblecp, asframeworkpaint);
            if (dragAndDropTransferDataInstallLocalRetainedValuesStore2 != null) {
                dragAndDropTransferData = dragAndDropTransferDataInstallLocalRetainedValuesStore2;
            }
            this.retainedValuesStore = dragAndDropTransferData;
            ViewTreeOwners viewTreeOwners = getViewTreeOwners();
            if (viewTreeOwners == null || (accessisrendernodecompatiblecp != null && gettransparent0d7_kjuRemoteActionCompatParcelizer != null && (accessisrendernodecompatiblecp != viewTreeOwners.getLifecycleOwner() || gettransparent0d7_kjuRemoteActionCompatParcelizer != viewTreeOwners.getSavedStateRegistryOwner() || asframeworkpaint != viewTreeOwners.getViewModelStoreOwner()))) {
                if (accessisrendernodecompatiblecp == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                    return;
                }
                if (gettransparent0d7_kjuRemoteActionCompatParcelizer == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                    return;
                }
                if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.read(this);
                }
                accessisrendernodecompatiblecp.getLifecycle().IconCompatParcelizer(this);
                set_viewTreeOwners(new ViewTreeOwners(accessisrendernodecompatiblecp, gettransparent0d7_kjuRemoteActionCompatParcelizer, asframeworkpaint));
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.onReadyForComposition;
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getComposeViewContext());
                }
                this.onReadyForComposition = null;
            }
            ViewTreeOwners viewTreeOwners2 = getViewTreeOwners();
            if (viewTreeOwners2 != null && (lifecycleOwner2 = viewTreeOwners2.getLifecycleOwner()) != null) {
                lifecycle3 = lifecycleOwner2.getLifecycle();
            }
            if (lifecycle3 == null) {
                throw c8$$ExternalSyntheticOutline0.m("No lifecycle owner exists");
            }
            lifecycle2 = lifecycle3;
        }
        lifecycle2.IconCompatParcelizer(this);
        lifecycle2.IconCompatParcelizer(this.contentCaptureManager);
        this._inputModeManager.m1547setInputModeiuPiT84(isInTouchMode() ? InputMode.Companion.m1543getTouchaOaMEAU() : InputMode.Companion.m1542getKeyboardaOaMEAU());
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (i >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getFocusOwner().getListeners().read(androidAutofillManager);
            getSemanticsOwner().getListeners$ui().read(androidAutofillManager);
        }
        getFocusOwner().getListeners().read(this);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        getLayoutNodes().MediaBrowserCompatMediaItem(layoutNode.getSemanticsId());
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
        if (!autofillSupported() || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onDetach$ui(layoutNode);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        supportsColorMatrixQuery lifecycle;
        accessisRenderNodeCompatiblecp lifecycleOwner;
        AndroidAutofill androidAutofill;
        super.onDetachedFromWindow();
        setAttached(false);
        if (ComposeView_androidKt.getAreWindowInsetsRulersEnabled()) {
            this.insetsListener.onViewDetachedFromWindow(this);
        }
        View view = this.frameRateCategoryView;
        if (isArrEnabled$ui() && view != null) {
            removeView(view);
        }
        Companion.removeNotificationForSysPropsChange(this);
        getComposeViewContext().decrementViewCount$ui();
        getSnapshotObserver().stopObserving$ui();
        if (AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            lifecycle = getComposeViewContext().getLifecycleOwner$ui().getLifecycle();
        } else {
            this._windowInfo.setOnInitializeContainerSize(null);
            ViewTreeOwners viewTreeOwners = getViewTreeOwners();
            lifecycle = (viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null) ? null : lifecycleOwner.getLifecycle();
            if (lifecycle == null) {
                throw c8$$ExternalSyntheticOutline0.m("No lifecycle owner exists");
            }
        }
        lifecycle.read(this.contentCaptureManager);
        lifecycle.read(this);
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            retainedValuesStoreEntry.release();
        }
        this.lifecycleRetainedValuesStoreOwnerEntry = null;
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getSemanticsOwner().getListeners$ui().write(androidAutofillManager);
            getFocusOwner().getListeners().write(androidAutofillManager);
        }
        getRectManager().resetOffsets();
        getRectManager().dispatchCallbacks();
        getRectManager().removeScheduledCallback();
        getFocusOwner().getListeners().write(this);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreAttach(LayoutNode layoutNode) {
        getLayoutNodes().IconCompatParcelizer(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreLayoutNodeReused(LayoutNode layoutNode, int i) {
        getLayoutNodes().MediaBrowserCompatMediaItem(i);
        getLayoutNodes().IconCompatParcelizer(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.measureAndLayoutDelegate;
        if (z) {
            if (measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z2) && z3) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (measureAndLayoutDelegate.requestRemeasure(layoutNode, z2) && z3) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(i);
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            retainedValuesStoreEntry.startRetainingExitedValues();
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public void onTouchModeChanged(boolean z) {
        this._inputModeManager.m1547setInputModeiuPiT84(z ? InputMode.Companion.m1543getTouchaOaMEAU() : InputMode.Companion.m1542getKeyboardaOaMEAU());
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean isShowingLayoutBounds;
        if (!AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            this._windowInfo.setWindowFocused(z);
        }
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (isShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    public final boolean recycle$ui(OwnedLayer ownedLayer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(ownedLayer);
        this.dirtyLayers.write(ownedLayer);
        return true;
    }

    public final void removeAndroidView(AndroidViewHolder androidViewHolder) {
        getAndroidViewsHandler$ui().removeViewInLayout(androidViewHolder);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = getAndroidViewsHandler$ui().getLayoutNodeToHolder();
        pauseWebviewIfNecessarylambda10.serializer(layoutNodeToHolder).remove(getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(androidViewHolder));
        androidViewHolder.setImportantForAccessibility(0);
    }

    public final void removeConnectionToComposeViewContext() {
        if (this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().decrementViewCount$ui();
            this.composeViewContextIncrementedDuringInit = false;
        }
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public void removeDelayedExecution(Object obj) {
        Runnable runnable = obj instanceof Runnable ? (Runnable) obj : null;
        if (runnable == null) {
            return;
        }
        removeCallbacks(runnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, android.graphics.Rect rect) {
        if (ComposeUiFlags.isViewFocusFixEnabled) {
            return requestFocusViewFocusFix(i, rect);
        }
        return ComposeUiFlags.isBypassUnfocusableComposeViewEnabled ? requestFocusBypassUnfocusableComposeView(i, rect) : requestFocusCurrent(i, rect);
    }

    @Override // androidx.compose.ui.node.RootForTest
    @ExperimentalIndirectPointerApi
    public boolean sendIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        if (AndroidIndirectPointerEvent_androidKt.getNativeEvent(indirectPointerEvent).getActionMasked() != 3) {
            return handleIndirectPointerEvent(indirectPointerEvent);
        }
        getFocusOwner().dispatchIndirectPointerCancel();
        return true;
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* JADX INFO: renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo2619sendKeyEventZmokQxo(KeyEvent keyEvent) {
        return getFocusOwner().mo367dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) || FocusOwner.m365dispatchKeyEventYhN2O0w$default(getFocusOwner(), keyEvent, null, 2, null);
    }

    public final void setComposeViewContext(ComposeViewContext composeViewContext) {
        if (getCoroutineContext() != composeViewContext.getCompositionContext$ui().MediaDescriptionCompat() && !getRoot().getChildren$ui().isEmpty()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], iSerializer, isAppSetIdReadingEnabled.serializer(), -676141143);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
        getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, iSerializer2, isAppSetIdReadingEnabled.serializer(), -1384483406);
        try {
            ComposeViewContext composeViewContext2 = get_composeViewContext();
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            if (composeViewContext != composeViewContext2) {
                if (isAttachedToWindow()) {
                    composeViewContext2.decrementViewCount$ui();
                    composeViewContext.incrementViewCount$ui();
                }
                set_composeViewContext(composeViewContext);
                setCoroutineContext(composeViewContext.getCompositionContext$ui().MediaDescriptionCompat());
            }
        } catch (Throwable th) {
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            throw th;
        }
    }

    public final void setOnReadyForComposition(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            if (getViewTreeOwners() != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getComposeViewContext());
            }
            if (isAttachedToWindow()) {
                return;
            }
            this.onReadyForComposition = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            return;
        }
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getComposeViewContext());
        } else {
            this.onReadyForComposition = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, layoutNode, false, 2, null);
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = layoutNode.get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            invalidateLayoutNodeMeasurement((LayoutNode) objArr[i2]);
        }
    }

    public static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* JADX INFO: renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m2671sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            if (AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
                getComposeViewContext().getWindowInfo$ui().m2755setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m2137constructorimpl(motionEvent.getMetaState()));
            } else {
                this._windowInfo.m2755setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m2137constructorimpl(motionEvent.getMetaState()));
            }
        }
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui = this.motionEventAdapter.convertToPointerInputEvent$ui(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (pointerInputEventConvertToPointerInputEvent$ui == null) {
            this.pointerInputEventProcessor.processCancel();
            return PointerInputEventProcessorKt.ProcessResult(false, false, false);
        }
        List<PointerInputEventData> pointers = pointerInputEventConvertToPointerInputEvent$ui.getPointers();
        int size = pointers.size() - 1;
        if (size < 0) {
            pointerInputEventData = null;
            break;
        }
        while (true) {
            int i = size - 1;
            pointerInputEventData = pointers.get(size);
            if (pointerInputEventData.getDown() && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                pointerInputEventData = null;
                break;
            }
            size = i;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.lastDownPointerPosition = pointerInputEventData2.m2089getPositionF1C5BW0();
        }
        int iM2094processBIzXfog = this.pointerInputEventProcessor.m2094processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui, this, isInBounds(motionEvent));
        pointerInputEventConvertToPointerInputEvent$ui.setMotionEvent(null);
        if ((actionMasked != 0 && actionMasked != 5) || (iM2094processBIzXfog & 1) != 0) {
            return iM2094processBIzXfog;
        }
        this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iM2094processBIzXfog;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object objM2695boximpl;
        FocusTargetNode activeFocusTargetNode;
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent))) {
            return false;
        }
        int iM2666handleMotionEvent8iAsVTc = m2666handleMotionEvent8iAsVTc(motionEvent);
        if ((iM2666handleMotionEvent8iAsVTc & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
        boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
        if (z && z2) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view == null || (objM2695boximpl = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                objM2695boximpl = AutoClearFocusBehavior.m2695boximpl(AutoClearFocusBehavior.Companion.m2703getDefault4UtRPd4());
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objM2695boximpl, AutoClearFocusBehavior.m2695boximpl(AutoClearFocusBehavior.Companion.m2702getCursorBased4UtRPd4())}, getCieXyz.write())).booleanValue() && (activeFocusTargetNode = getFocusOwner().getActiveFocusTargetNode()) != null) {
                if (!LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.requireLayoutCoordinates(activeFocusTargetNode)).m503containsk4lQ0M(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L)))) {
                    FocusManager.clearFocus$default(getFocusOwner(), false, 1, null);
                }
            }
        }
        return (iM2666handleMotionEvent8iAsVTc & 1) != 0;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidClipboard getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public animateToWithDecay getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        accessisRenderNodeCompatiblecp lifecycleOwner;
        supportsColorMatrixQuery lifecycle;
        toColorLong8_81llA tocolorlong8_81lla = null;
        if (AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            lifecycleOwner = getComposeViewContext().getLifecycleOwner$ui();
        } else {
            ViewTreeOwners viewTreeOwners = getViewTreeOwners();
            lifecycleOwner = viewTreeOwners != null ? viewTreeOwners.getLifecycleOwner() : null;
        }
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            tocolorlong8_81lla = ((accessregisterComponentCallback) lifecycle).RatingCompat;
        }
        return tocolorlong8_81lla == toColorLong8_81llA.RESUMED;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        ContentInViewNode contentInViewNode;
        AndroidAutofillManager androidAutofillManager;
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        if (autofillSupported() && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onEndApplyChanges$ui();
        }
        while (this.endApplyChangesListeners.RemoteActionCompatParcelizer() && this.endApplyChangesListeners.RemoteActionCompatParcelizer(0) != null) {
            int i = this.endApplyChangesListeners.IconCompatParcelizer;
            int i2 = 0;
            while (true) {
                contentInViewNode = this.endApplyChangesListeners;
                if (i2 < i) {
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) contentInViewNode.RemoteActionCompatParcelizer(i2);
                    this.endApplyChangesListeners.read(i2, (Object) null);
                    if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                    }
                    i2++;
                }
            }
            contentInViewNode.read(0, i);
        }
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    /* JADX INFO: renamed from: requestOwnerFocus-7o62pno */
    public boolean mo419requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect) {
        Integer numM361toAndroidFocusDirection3ESFkO8;
        if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            if (isFocused()) {
                return true;
            }
        } else if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (numM361toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m361toAndroidFocusDirection3ESFkO8(focusDirection.m352unboximpl())) == null) ? 130 : numM361toAndroidFocusDirection3ESFkO8.intValue(), rect != null ? RectHelper_androidKt.toAndroidRect(rect) : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.node.Owner
    public Object textInputSession(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<?> shortNewsContentCardView) {
        C00621 c00621;
        if (shortNewsContentCardView instanceof C00621) {
            c00621 = (C00621) shortNewsContentCardView;
            int i = c00621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00621.label = i - Integer.MIN_VALUE;
            } else {
                c00621 = new C00621(shortNewsContentCardView);
            }
        } else {
            c00621 = new C00621(shortNewsContentCardView);
        }
        Object obj = c00621.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c00621.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AtomicReference<SessionMutex.Session<AndroidPlatformTextInputSession>> atomicReference = this.textInputSessionMutex;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView.textInputSession.2
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final AndroidPlatformTextInputSession invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    return new AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), getcontentviewgroupparentlayout);
                }

                {
                    super(1);
                }
            };
            c00621.label = 1;
            if (SessionMutex.m160withSessionCancellingPreviousimpl(atomicReference, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, c00621) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        DrawableTransformation.read();
        return null;
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    private final TextInputServiceAndroid getLegacyTextInputServiceAndroid() {
        TextInputServiceAndroid textInputServiceAndroid = this._legacyTextInputServiceAndroid;
        if (textInputServiceAndroid != null) {
            return textInputServiceAndroid;
        }
        TextInputServiceAndroid textInputServiceAndroid2 = new TextInputServiceAndroid(getView(), this);
        this._legacyTextInputServiceAndroid = textInputServiceAndroid2;
        return textInputServiceAndroid2;
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                layoutNode = layoutNode.getParent$ui();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                actionIndex = -1;
            } else {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i == 9 || i == 10) {
            actionIndex = -1;
        } else {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            long jMo2155localToScreenMKHz9U = mo2155localToScreenMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(pointerCoords.x)) << 32)));
            pointerCoords.x = Float.intBitsToFloat((int) (jMo2155localToScreenMKHz9U >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jMo2155localToScreenMKHz9U & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui = this.motionEventAdapter.convertToPointerInputEvent$ui(motionEventObtain, this);
        pointerInputEventConvertToPointerInputEvent$ui.getClass();
        this.pointerInputEventProcessor.m2094processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui, this, true);
        motionEventObtain.recycle();
    }

    private final void setAttached(boolean z) {
        this.isAttached$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        if (autofillSupported()) {
            AndroidAutofillManager androidAutofillManager = this._autofillManager;
            if (androidAutofillManager != null) {
                androidAutofillManager.performAutofill(sparseArray);
            }
            AndroidAutofill androidAutofill = this._autofill;
            if (androidAutofill != null) {
                AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
            }
        }
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public void clearOwnerFocus() {
        if (isFocused() || (!ComposeUiFlags.isViewFocusFixEnabled && hasFocus())) {
            clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            clearFocus();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void decrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 1) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), false);
            }
            this.sensitiveComponentCount--;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        getOffsetF1C5BW0.write().read();
        this.isDrawingContent = true;
        try {
            Trace.beginSection("AndroidOwner:draw");
            try {
                CanvasHolder canvasHolder = this.canvasHolder;
                Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
                canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
                getRoot().draw$ui(canvasHolder.getAndroidCanvas(), null);
                canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                if (this.dirtyLayers.RemoteActionCompatParcelizer()) {
                    int i = this.dirtyLayers.IconCompatParcelizer;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((OwnedLayer) this.dirtyLayers.RemoteActionCompatParcelizer(i2)).updateDisplayList();
                    }
                }
                if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
                    int iSave = canvas.save();
                    canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
                    super.dispatchDraw(canvas);
                    canvas.restoreToCount(iSave);
                }
                this.dirtyLayers.IconCompatParcelizer();
                this.isDrawingContent = false;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
            if (uncaughtExceptionHandler == null) {
                throw th2;
            }
            uncaughtExceptionHandler.onUncaughtException(th2);
        }
        ContentInViewNode contentInViewNode = this.postponedDirtyLayers;
        if (contentInViewNode != null) {
            this.dirtyLayers.serializer(contentInViewNode);
            contentInViewNode.IconCompatParcelizer();
        }
        if (isArrEnabled$ui()) {
            Api35Impl.setRequestedFrameRate(this, this.currentFrameRate);
            View view = this.frameRateCategoryView;
            if (view != null) {
                Api35Impl.setRequestedFrameRate(view, this.currentFrameRateCategory);
                if (!Float.isNaN(this.currentFrameRateCategory)) {
                    view.invalidate();
                    drawChild(canvas, view, getDrawingTime());
                }
            }
            this.currentFrameRate = Float.NaN;
            this.currentFrameRateCategory = Float.NaN;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().mo368dispatchKeyEventYhN2O0w(androidx.compose.ui.input.key.KeyEvent.m1885constructorimpl(keyEvent), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Boolean invoke() {
                    return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(keyEvent));
                }
            });
        }
        if (AndroidComposeUiFlags.isSharedWindowInfoEnabled) {
            getComposeViewContext().getWindowInfo$ui().m2755setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m2137constructorimpl(keyEvent.getMetaState()));
        } else {
            this._windowInfo.m2755setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m2137constructorimpl(keyEvent.getMetaState()));
        }
        return FocusOwner.m365dispatchKeyEventYhN2O0w$default(getFocusOwner(), androidx.compose.ui.input.key.KeyEvent.m1885constructorimpl(keyEvent), null, 2, null) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().mo367dispatchInterceptedSoftKeyboardEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m1885constructorimpl(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        androidViewsHandler2.getClass();
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public Rect getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(viewFindFocus, this);
        }
        return null;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.getLeft());
            rect.top = Math.round(embeddedViewFocusRect.getTop());
            rect.right = Math.round(embeddedViewFocusRect.getRight());
            rect.bottom = Math.round(embeddedViewFocusRect.getBottom());
            return;
        }
        Object[] objArr = {getFocusOwner().mo369focusSearchULY8qGw(FocusDirection.Companion.m353getDowndhqQ8s(), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView.getFocusedRect.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.TRUE;
            }
        }), Boolean.TRUE};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.isShowingLayoutBounds(this) : this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = this._softwareKeyboardController;
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        this._softwareKeyboardController = delegatingSoftwareKeyboardController;
        return delegatingSoftwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public TextInputService getTextInputService() {
        TextInputService textInputService = this._textInputService;
        if (textInputService != null) {
            return textInputService;
        }
        TextInputService textInputService2 = new TextInputService((PlatformTextInputService) AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(getLegacyTextInputServiceAndroid()));
        this._textInputService = textInputService2;
        return textInputService2;
    }

    @Override // androidx.compose.ui.node.Owner
    public void incrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 0) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), true);
            }
            this.sensitiveComponentCount++;
        }
    }

    public final void notifyLayerIsDirty$ui(OwnedLayer ownedLayer, boolean z) {
        boolean z2 = this.isDrawingContent;
        if (!z) {
            if (z2) {
                return;
            }
            this.dirtyLayers.write(ownedLayer);
            ContentInViewNode contentInViewNode = this.postponedDirtyLayers;
            if (contentInViewNode != null) {
                contentInViewNode.write(ownedLayer);
                return;
            }
            return;
        }
        if (!z2) {
            this.dirtyLayers.read(ownedLayer);
            return;
        }
        ContentInViewNode contentInViewNode2 = this.postponedDirtyLayers;
        if (contentInViewNode2 == null) {
            contentInViewNode2 = new ContentInViewNode();
            this.postponedDirtyLayers = contentInViewNode2;
        }
        contentInViewNode2.read(ownedLayer);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutNodeDeactivated(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onLayoutNodeDeactivated$ui(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostAttach(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onPostAttach$ui(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostLayoutNodeReused(LayoutNode layoutNode, int i) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.onPostLayoutNodeReused$ui(layoutNode, i);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.measureAndLayoutDelegate;
        if (z) {
            if (measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z2)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (measureAndLayoutDelegate.requestRelayout(layoutNode, z2)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon stylusHoverIcon;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (stylusHoverIcon = getPointerIconService().getStylusHoverIcon()) == null) ? super.onResolvePointerIcon(motionEvent, i) : AndroidComposeViewVerificationHelperMethodsN.INSTANCE.toAndroidPointerIcon(getContext(), stylusHoverIcon);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
        }
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
            frameEndScheduler.getClass();
            retainedValuesStoreEntry.stopRetainingExitedValues(frameEndScheduler);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(android.graphics.Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return;
        }
        scrollCapture.onScrollCaptureSearch(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestAutofill(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || (androidAutofillManager = this._autofillManager) == null) {
            return;
        }
        androidAutofillManager.requestAutofill$ui(layoutNode);
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View findNextNonChildView(int i) {
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            View rootView = getRootView();
            rootView.getClass();
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, i);
            if (viewFindNextFocus != null && !AndroidComposeView_androidKt.containsDescendant(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return handleRotaryEvent(motionEvent);
            }
            return (m2666handleMotionEvent8iAsVTc(motionEvent) & 4) != 0;
        }
        if (motionEvent.isFromSource(2097152)) {
            AndroidIndirectPointerEvent androidIndirectPointerEventM1981convertToIndirectPointerEventk92h6UU$ui = this.motionEventAdapter.m1981convertToIndirectPointerEventk92h6UU$ui(motionEvent, this.primaryDirectionalMotionAxisOverride);
            if (androidIndirectPointerEventM1981convertToIndirectPointerEventk92h6UU$ui == null) {
                getFocusOwner().dispatchIndirectPointerCancel();
                this.indirectPointerNavigationGestureDetector.cancelCurrentEventStream();
                return true;
            }
            if (handleIndirectPointerEvent(androidIndirectPointerEventM1981convertToIndirectPointerEventk92h6UU$ui)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean getScrollCaptureInProgress$ui() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return false;
        }
        return scrollCapture.getScrollCaptureInProgress();
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public void onFocusChanged(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        int i;
        NodeChain nodes$ui;
        boolean z;
        NodeChain nodes$ui2;
        boolean z2;
        if (!ComposeUiFlags.isOptimizedFocusEventDispatchEnabled || focusTargetModifierNode == null) {
            return;
        }
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(2097152);
        if (!focusTargetModifierNode.getNode().isAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = focusTargetModifierNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode);
        relocationOffsetfbGrOKE relocationoffsetfbgroke = null;
        ArrayList arrayList = null;
        while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                break;
            }
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        Modifier.Node nodePop = node;
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                        while (nodePop != null) {
                            if (nodePop instanceof IndirectPointerInputModifierNode) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(nodePop);
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2 && (nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests == null) {
                                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (nodePop != null) {
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(nodePop);
                                                nodePop = null;
                                            }
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                        }
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui2 = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
        }
        if (arrayList == null) {
            return;
        }
        if (focusTargetModifierNode2 != null) {
            int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(2097152);
            if (!focusTargetModifierNode2.getNode().isAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node2 = focusTargetModifierNode2.getNode();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode2);
            relocationOffsetfbGrOKE relocationoffsetfbgroke2 = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode2) & iM2551constructorimpl2) != 0) {
                    while (node2 != null) {
                        if ((node2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            Modifier.Node nodePop2 = node2;
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop2 != null) {
                                if (nodePop2 instanceof IndirectPointerInputModifierNode) {
                                    if (relocationoffsetfbgroke2 == null) {
                                        relocationOffsetfbGrOKE relocationoffsetfbgroke3 = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
                                        relocationoffsetfbgroke2 = new relocationOffsetfbGrOKE();
                                    }
                                    relocationoffsetfbgroke2.serializer(nodePop2);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (nodePop2.getKindSet$ui() & iM2551constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodePop2 = delegate$ui2;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == null) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (nodePop2 != null) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop2);
                                                    nodePop2 = null;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nodePop2 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                        }
                        node2 = node2.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui();
                node2 = (layoutNodeRequireLayoutNode2 == null || (nodes$ui = layoutNodeRequireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            relocationoffsetfbgroke = relocationoffsetfbgroke2;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            IndirectPointerInputModifierNode indirectPointerInputModifierNode = (IndirectPointerInputModifierNode) arrayList.get(i);
            if (relocationoffsetfbgroke == null || !relocationoffsetfbgroke.MediaBrowserCompatMediaItem(indirectPointerInputModifierNode)) {
                indirectPointerInputModifierNode.onCancelIndirectPointerInput();
            }
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!autofillSupported() || viewStructure == null) {
            return;
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.populateViewStructure(viewStructure);
        }
        AndroidAutofill androidAutofill = this._autofill;
        if (androidAutofill != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
        }
    }

    public final boolean requestFocusBypassUnfocusableComposeView(int i, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i);
        final int iM352unboximpl = focusDirection != null ? focusDirection.m352unboximpl() : FocusDirection.Companion.m354getEnterdhqQ8s();
        Boolean boolMo369focusSearchULY8qGw = getFocusOwner().mo369focusSearchULY8qGw(iM352unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(iM352unboximpl));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        Boolean bool = Boolean.TRUE;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{boolMo369focusSearchULY8qGw, bool}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getFocusOwner().mo369focusSearchULY8qGw(iM352unboximpl, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithoutPrevRect$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(iM352unboximpl));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }), bool}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        if (hasFocus() && FocusOwnerImplKt.m377is1dFocusSearch3ESFkO8(iM352unboximpl)) {
            return getFocusOwner().mo372resetFocus3ESFkO8(iM352unboximpl);
        }
        return false;
    }

    public final boolean requestFocusCurrent(int i, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().getRootState().getHasFocus()) {
            return super.requestFocus(i, rect);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i);
        final int iM352unboximpl = focusDirection != null ? focusDirection.m352unboximpl() : FocusDirection.Companion.m354getEnterdhqQ8s();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getFocusOwner().mo369focusSearchULY8qGw(iM352unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView.requestFocusCurrent.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(iM352unboximpl));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }), Boolean.TRUE}, getCieXyz.write())).booleanValue();
    }

    public final boolean requestFocusViewFocusFix(int i, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (this.processingRequestFocusForNextNonChildView) {
            return false;
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i);
        final int iM352unboximpl = focusDirection != null ? focusDirection.m352unboximpl() : FocusDirection.Companion.m354getEnterdhqQ8s();
        if (hasFocus() && mo418moveFocusInChildren3ESFkO8(iM352unboximpl)) {
            return true;
        }
        final cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        Boolean boolMo369focusSearchULY8qGw = getFocusOwner().mo369focusSearchULY8qGw(iM352unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusViewFocusFix$focusSearchResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                cancelpendingwebviewpause.IconCompatParcelizer = true;
                return Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(iM352unboximpl));
            }
        });
        if (boolMo369focusSearchULY8qGw == null) {
            return false;
        }
        if (boolMo369focusSearchULY8qGw.booleanValue()) {
            return true;
        }
        if (cancelpendingwebviewpause.IconCompatParcelizer) {
            return false;
        }
        if (rect != null && !hasFocus()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getFocusOwner().mo369focusSearchULY8qGw(iM352unboximpl, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusViewFocusFix$altFocus$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Boolean invoke(FocusTargetNode focusTargetNode) {
                    return Boolean.valueOf(focusTargetNode.mo384requestFocus3ESFkO8(iM352unboximpl));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            }), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        View viewFindNextNonChildView = findNextNonChildView(i);
        if (viewFindNextNonChildView == null || viewFindNextNonChildView == this) {
            return true;
        }
        this.processingRequestFocusForNextNonChildView = true;
        boolean zRequestFocus = viewFindNextNonChildView.requestFocus(i);
        this.processingRequestFocusForNextNonChildView = false;
        return zRequestFocus;
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo2156screenToLocalMKHz9U(long j) {
        recalculateWindowPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.windowPosition & 4294967295L));
        return Matrix.m975mapMKHz9U(this.windowToViewMatrix, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat3 - fIntBitsToFloat4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - fIntBitsToFloat2)) << 32)));
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnedLayer createLayer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer, null, this, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
        OwnedLayer ownedLayerPop = this.layerCache.pop();
        if (ownedLayerPop != null) {
            ownedLayerPop.reuseLayer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            return ownedLayerPop;
        }
        return new GraphicsLayerOwnerLayer(getGraphicsContext().createGraphicsLayer(), getGraphicsContext(), this, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    private final void dispatchConfigurationChangeIfNeeded() {
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        updateConfiguration(getResources().getConfiguration());
    }

    private final DragAndDropTransferData installLocalRetainedValuesStore(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, asFrameworkPaint asframeworkpaint) {
        LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
        if (accessisrendernodecompatiblecp == null || asframeworkpaint == null || frameEndScheduler == null) {
            return null;
        }
        getFilterQualityfv9h1I viewModelStore = asframeworkpaint.getViewModelStore();
        setFromtUYjHk setfromtuyjhk = new setFromtUYjHk();
        setPathEffect setpatheffect = setPathEffect.IconCompatParcelizer;
        viewModelStore.getClass();
        setpatheffect.getClass();
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(viewModelStore, setfromtuyjhk, setpatheffect);
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(LifecycleRetainedValuesStoreOwner.class);
        String strRemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
            return null;
        }
        LifecycleRetainedValuesStoreOwner lifecycleRetainedValuesStoreOwner = (LifecycleRetainedValuesStoreOwner) imageLoader$Builder.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer));
        Object parent = getParent();
        parent.getClass();
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry orCreateRetainedValuesStoreEntry = lifecycleRetainedValuesStoreOwner.getOrCreateRetainedValuesStoreEntry(((View) parent).getId());
        this.lifecycleRetainedValuesStoreOwnerEntry = orCreateRetainedValuesStoreEntry;
        return orCreateRetainedValuesStoreEntry.getRetainedValuesStore();
    }

    public static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, z);
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            Object[] objArr = {declaredMethod.invoke(view, null), Integer.valueOf(i)};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i, viewGroup.getChildAt(i2));
                    if (viewFindViewByAccessibilityIdRootedAtCurrentView != null) {
                        return viewFindViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public void voteFrameRate(float f) {
        if (isArrEnabled$ui()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.currentFrameRate) || f > this.currentFrameRate) {
                    this.currentFrameRate = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.currentFrameRateCategory) || f < this.currentFrameRateCategory) {
                    this.currentFrameRateCategory = f;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        float[] fArr = this.viewToWindowMatrix;
        float x = motionEvent.getX();
        long jM975mapMKHz9U = Matrix.m975mapMKHz9U(fArr, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (((long) Float.floatToRawIntBits(x)) << 32)));
        float rawX = motionEvent.getRawX();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM975mapMKHz9U >> 32));
        float rawY = motionEvent.getRawY();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM975mapMKHz9U & 4294967295L));
        this.windowPosition = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(rawX - fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(rawY - fIntBitsToFloat2)) & 4294967295L));
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        getFocusOwner().releaseFocus();
    }
}
