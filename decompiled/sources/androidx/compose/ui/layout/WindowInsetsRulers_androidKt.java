package androidx.compose.ui.layout;

import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.NodeKindKt;
import androidx.compose.ui.node.TraversableNode;
import java.util.List;
import o.ContentInViewNode;
import o.DefaultScrollableState;
import o.PopulateViewStructure_androidKtpopulate7;
import o.StretchOverscrollNode;
import o.animateToWithDecay;
import o.instance_delegatelambda0;
import o.onCreateVirtualViewTranslationRequests;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsRulers_androidKt {
    private static final WindowInsetsRulers[] AnimatableInsetsRulers;
    public static final String RulerKey = "androidx.compose.ui.layout.WindowInsetsRulers";
    private static final StretchOverscrollNode WindowInsetsTypeMap;

    static {
        animateToWithDecay animatetowithdecay = new animateToWithDecay(8);
        WindowInsetsRulers.Companion companion = WindowInsetsRulers.Companion;
        animatetowithdecay.IconCompatParcelizer(1, companion.getStatusBars());
        animatetowithdecay.IconCompatParcelizer(2, companion.getNavigationBars());
        animatetowithdecay.IconCompatParcelizer(4, companion.getCaptionBar());
        animatetowithdecay.IconCompatParcelizer(8, companion.getIme());
        animatetowithdecay.IconCompatParcelizer(16, companion.getSystemGestures());
        animatetowithdecay.IconCompatParcelizer(32, companion.getMandatorySystemGestures());
        animatetowithdecay.IconCompatParcelizer(64, companion.getTappableElement());
        animatetowithdecay.IconCompatParcelizer(Fields.SpotShadowColor, companion.getDisplayCutout());
        WindowInsetsTypeMap = animatetowithdecay;
        AnimatableInsetsRulers = new WindowInsetsRulers[]{companion.getStatusBars(), companion.getNavigationBars(), companion.getCaptionBar(), companion.getTappableElement(), companion.getSystemGestures(), companion.getMandatorySystemGestures(), companion.getIme(), companion.getWaterfall(), companion.getDisplayCutout()};
    }

    /* JADX INFO: renamed from: provideInsetsValues-cytEWk0, reason: not valid java name */
    private static final void m2359provideInsetsValuescytEWk0(RulerScope rulerScope, RectRulers rectRulers, long j, int i, int i2) {
        if (ValueInsets.m2351equalsimpl0(j, ValueInsets_androidKt.getUnsetValueInsets())) {
            return;
        }
        rulerScope.provides(rectRulers.getLeft(), (int) ((j >>> 48) & 65535));
        rulerScope.provides(rectRulers.getTop(), (int) ((j >>> 32) & 65535));
        rulerScope.provides(rectRulers.getRight(), i - ((int) ((j >>> 16) & 65535)));
        rulerScope.provides(rectRulers.getBottom(), i2 - ((int) (j & 65535)));
    }

    public static final void provideWindowInsetsRulers(RulerScope rulerScope, WindowInsetsRulerProvider windowInsetsRulerProvider) {
        long jMo2217getSizeYbymL2g = rulerScope.getCoordinates().mo2217getSizeYbymL2g();
        DefaultScrollableState insetsValues = windowInsetsRulerProvider.getInsetsListener().getInsetsValues();
        int i = (int) (jMo2217getSizeYbymL2g >> 32);
        int i2 = (int) (jMo2217getSizeYbymL2g & 4294967295L);
        for (WindowInsetsRulers windowInsetsRulers : AnimatableInsetsRulers) {
            Object objMediaBrowserCompatMediaItem = insetsValues.MediaBrowserCompatMediaItem(windowInsetsRulers);
            objMediaBrowserCompatMediaItem.getClass();
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) objMediaBrowserCompatMediaItem;
            m2359provideInsetsValuescytEWk0(rulerScope, windowInsetsRulers.getCurrent(), windowWindowInsetsAnimationValues.m2360getCurrenthdzbrEE(), i, i2);
            if (windowWindowInsetsAnimationValues.isAnimating()) {
                m2359provideInsetsValuescytEWk0(rulerScope, windowWindowInsetsAnimationValues.getSource(), windowWindowInsetsAnimationValues.m2362getSourceValueInsetshdzbrEE(), i, i2);
                m2359provideInsetsValuescytEWk0(rulerScope, windowWindowInsetsAnimationValues.getTarget(), windowWindowInsetsAnimationValues.m2363getTargetValueInsetshdzbrEE(), i, i2);
            }
            m2359provideInsetsValuescytEWk0(rulerScope, windowInsetsRulers.getMaximum(), windowWindowInsetsAnimationValues.m2361getMaximumhdzbrEE(), i, i2);
        }
        ContentInViewNode cutoutRects = windowInsetsRulerProvider.getCutoutRects();
        if (cutoutRects.RemoteActionCompatParcelizer()) {
            List<RectRulers> cutoutRulers = windowInsetsRulerProvider.getCutoutRulers();
            Object[] objArr = cutoutRects.read;
            int i3 = cutoutRects.IconCompatParcelizer;
            for (int i4 = 0; i4 < i3; i4++) {
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objArr[i4];
                RectRulers rectRulers = cutoutRulers.get(i4);
                Rect rect = (Rect) populateViewStructure_androidKtpopulate7.getValue();
                rulerScope.provides(rectRulers.getLeft(), rect.left);
                rulerScope.provides(rectRulers.getTop(), rect.top);
                rulerScope.provides(rectRulers.getRight(), rect.right);
                rulerScope.provides(rectRulers.getBottom(), rect.bottom);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static final List<RectRulers> findDisplayCutouts(Placeable.PlacementScope placementScope) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = coordinates != null ? LayoutCoordinatesKt.findRootCoordinates(coordinates) : null;
        for (NodeCoordinator wrapped$ui = layoutCoordinatesFindRootCoordinates instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinatesFindRootCoordinates : null; wrapped$ui != null; wrapped$ui = wrapped$ui.getWrapped$ui()) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.ColorFilter);
            boolean zM2560getIncludeSelfInTraversalH91voCI = NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(iM2551constructorimpl);
            Modifier.Node tail = wrapped$ui.getTail();
            if (zM2560getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui()) != null) {
                for (Modifier.Node nodeHeadNode = wrapped$ui.headNode(zM2560getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
                    if ((nodeHeadNode.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        ?? oncreatevirtualviewtranslationrequests = 0;
                        ?? Pop = nodeHeadNode;
                        while (Pop != 0) {
                            if (Pop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) Pop;
                                if (traversableNode.getTraverseKey() == RulerKey) {
                                    return ((WindowInsetsRulerProvider) traversableNode).getCutoutRulers();
                                }
                            } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                int i = 0;
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                            Pop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests == 0) {
                                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (Pop != 0) {
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                                Pop = 0;
                                            }
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                }
                                if (i == 1) {
                                }
                            }
                            Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                        }
                    }
                    if (nodeHeadNode == tail) {
                        break;
                    }
                }
            }
        }
        return instance_delegatelambda0.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static final WindowInsetsAnimation findInsetsAnimationProperties(Placeable.PlacementScope placementScope, WindowInsetsRulers windowInsetsRulers) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = coordinates != null ? LayoutCoordinatesKt.findRootCoordinates(coordinates) : null;
        for (NodeCoordinator wrapped$ui = layoutCoordinatesFindRootCoordinates instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinatesFindRootCoordinates : null; wrapped$ui != null; wrapped$ui = wrapped$ui.getWrapped$ui()) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.ColorFilter);
            boolean zM2560getIncludeSelfInTraversalH91voCI = NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(iM2551constructorimpl);
            Modifier.Node tail = wrapped$ui.getTail();
            if (zM2560getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui()) != null) {
                for (Modifier.Node nodeHeadNode = wrapped$ui.headNode(zM2560getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
                    if ((nodeHeadNode.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        ?? oncreatevirtualviewtranslationrequests = 0;
                        ?? Pop = nodeHeadNode;
                        while (Pop != 0) {
                            if (Pop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) Pop;
                                if (traversableNode.getTraverseKey() == RulerKey) {
                                    WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) ((WindowInsetsRulerProvider) traversableNode).getInsetsValues().MediaBrowserCompatMediaItem(windowInsetsRulers);
                                    return windowWindowInsetsAnimationValues != null ? windowWindowInsetsAnimationValues : NoWindowInsetsAnimation.INSTANCE;
                                }
                            } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                int i = 0;
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                            Pop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests == 0) {
                                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (Pop != 0) {
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                                Pop = 0;
                                            }
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                }
                                if (i == 1) {
                                }
                            }
                            Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                        }
                    }
                    if (nodeHeadNode == tail) {
                        break;
                    }
                }
            }
        }
        return NoWindowInsetsAnimation.INSTANCE;
    }
}
