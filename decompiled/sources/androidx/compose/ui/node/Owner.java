package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import o.DragAndDropTransferData;
import o.ShortNewsContentCardView;
import o.StretchOverscrollNode;
import o.TextAnnouncementContentCardView;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public interface Owner extends PositionCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z) {
            enableExtraAssertions = z;
        }
    }

    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    @onItemDismisslambda0
    static /* synthetic */ void getFontLoader$annotations() {
    }

    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    long mo2615calculateLocalPositionMKHz9U(long j);

    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    long mo2616calculatePositionInWindowMKHz9U(long j);

    OwnedLayer createLayer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, GraphicsLayer graphicsLayer);

    default void decrementKeepScreenOnCount() {
    }

    default void decrementSensitiveComponentCount() {
    }

    /* JADX INFO: renamed from: dispatchOnScrollChanged-k-4lQ0M, reason: not valid java name */
    default void mo2617dispatchOnScrollChangedk4lQ0M(long j) {
    }

    void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillManager getAutofillManager();

    AutofillTree getAutofillTree();

    Clipboard getClipboard();

    ClipboardManager getClipboardManager();

    TextAnnouncementContentCardView getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    GraphicsContext getGraphicsContext();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    StretchOverscrollNode getLayoutNodes();

    LocaleList getLocaleList();

    long getMeasureIteration();

    ModifierLocalManager getModifierLocalManager();

    default OutOfFrameExecutor getOutOfFrameExecutor() {
        return null;
    }

    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    PointerIconService getPointerIconService();

    RectManager getRectManager();

    DragAndDropTransferData getRetainedValuesStore();

    LayoutNode getRoot();

    RootForTest getRootForTest();

    SemanticsOwner getSemanticsOwner();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    default void incrementKeepScreenOnCount() {
    }

    default void incrementSensitiveComponentCount() {
    }

    default void invalidateRootLayer() {
    }

    void measureAndLayout(boolean z);

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    void mo2618measureAndLayout0kLqBqw(LayoutNode layoutNode, long j);

    void onDetach(LayoutNode layoutNode);

    void onEndApplyChanges();

    @InternalComposeUiApi
    void onInteropViewLayoutChange(View view);

    void onLayoutChange(LayoutNode layoutNode);

    void onLayoutNodeDeactivated(LayoutNode layoutNode);

    void onPostAttach(LayoutNode layoutNode);

    default void onPostLayoutNodeReused(LayoutNode layoutNode, int i) {
    }

    void onPreAttach(LayoutNode layoutNode);

    default void onPreLayoutNodeReused(LayoutNode layoutNode, int i) {
    }

    void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2, boolean z3);

    void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0);

    void registerOnLayoutCompletedListener(OnLayoutCompletedListener onLayoutCompletedListener);

    void requestAutofill(LayoutNode layoutNode);

    void requestOnPositionedCallback(LayoutNode layoutNode);

    @InternalCoreApi
    void setShowLayoutBounds(boolean z);

    Object textInputSession(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<?> shortNewsContentCardView);

    default void voteFrameRate(float f) {
    }

    static /* synthetic */ OwnedLayer createLayer$default(Owner owner, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, GraphicsLayer graphicsLayer, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                graphicsLayer = null;
            }
            return owner.createLayer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, graphicsLayer);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: createLayer");
        return null;
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(Owner owner, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            owner.forceMeasureTheSubtree(layoutNode, z);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
    }

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            owner.measureAndLayout(z);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            owner.onRequestRelayout(layoutNode, z, z2);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }

    static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                z3 = true;
            }
            owner.onRequestMeasure(layoutNode, z, z2, z3);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }
}
