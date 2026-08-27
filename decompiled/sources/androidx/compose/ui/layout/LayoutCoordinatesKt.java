package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo2220localToRootMKHz9U(Offset.Companion.m493getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo2222localToWindowMKHz9U(Offset.Companion.m493getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo2221localToScreenMKHz9U(Offset.Companion.m493getZeroF1C5BW0());
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates, boolean z) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        float fMo2217getSizeYbymL2g = (int) (layoutCoordinatesFindRootCoordinates.mo2217getSizeYbymL2g() >> 32);
        float fMo2217getSizeYbymL2g2 = (int) (layoutCoordinatesFindRootCoordinates.mo2217getSizeYbymL2g() & 4294967295L);
        Rect rectLocalBoundingBoxOf = layoutCoordinatesFindRootCoordinates.localBoundingBoxOf(layoutCoordinates, z);
        float left = rectLocalBoundingBoxOf.getLeft();
        if (z) {
            if (left < 0.0f) {
                left = 0.0f;
            }
            if (left > fMo2217getSizeYbymL2g) {
                left = fMo2217getSizeYbymL2g;
            }
        }
        float top = rectLocalBoundingBoxOf.getTop();
        if (z) {
            if (top < 0.0f) {
                top = 0.0f;
            }
            if (top > fMo2217getSizeYbymL2g2) {
                top = fMo2217getSizeYbymL2g2;
            }
        }
        if (z) {
            float right = rectLocalBoundingBoxOf.getRight();
            if (right < 0.0f) {
                right = 0.0f;
            }
            if (right <= fMo2217getSizeYbymL2g) {
                fMo2217getSizeYbymL2g = right;
            }
        } else {
            fMo2217getSizeYbymL2g = rectLocalBoundingBoxOf.getRight();
        }
        if (z) {
            float bottom = rectLocalBoundingBoxOf.getBottom();
            float f = bottom >= 0.0f ? bottom : 0.0f;
            if (f <= fMo2217getSizeYbymL2g2) {
                fMo2217getSizeYbymL2g2 = f;
            }
        } else {
            fMo2217getSizeYbymL2g2 = rectLocalBoundingBoxOf.getBottom();
        }
        if (left == fMo2217getSizeYbymL2g || top == fMo2217getSizeYbymL2g2) {
            return Rect.Companion.getZero();
        }
        long jMo2222localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo2222localToWindowMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L)));
        long jMo2222localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo2222localToWindowMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fMo2217getSizeYbymL2g)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L)));
        long jMo2222localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo2222localToWindowMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fMo2217getSizeYbymL2g)) << 32) | (((long) Float.floatToRawIntBits(fMo2217getSizeYbymL2g2)) & 4294967295L)));
        long jMo2222localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo2222localToWindowMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fMo2217getSizeYbymL2g2)) & 4294967295L) | (((long) Float.floatToRawIntBits(left)) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo2222localToWindowMKHz9U3 & 4294967295L));
        return new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static /* synthetic */ Rect boundsInWindow$default(LayoutCoordinates layoutCoordinates, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return boundsInWindow(layoutCoordinates, z);
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo2218localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m493getZeroF1C5BW0()) : Offset.Companion.m493getZeroF1C5BW0();
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, (int) (layoutCoordinates.mo2217getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo2217getSizeYbymL2g() & 4294967295L)) : rectLocalBoundingBoxOf$default;
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (parentLayoutCoordinates != null) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            parentLayoutCoordinates = parentLayoutCoordinates.getParentLayoutCoordinates();
            layoutCoordinates = layoutCoordinates2;
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates;
        }
        for (NodeCoordinator wrappedBy$ui = nodeCoordinator.getWrappedBy$ui(); wrappedBy$ui != null; wrappedBy$ui = wrappedBy$ui.getWrappedBy$ui()) {
            nodeCoordinator = wrappedBy$ui;
        }
        return nodeCoordinator;
    }
}
