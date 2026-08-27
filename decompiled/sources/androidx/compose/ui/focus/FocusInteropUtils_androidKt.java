package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class FocusInteropUtils_androidKt {
    private static final int[] tempCoordinates = new int[2];
    private static final Rect tempRect = new Rect();

    public static final androidx.compose.ui.geometry.Rect calculateFocusRectRelativeTo(View view, View view2) {
        int[] iArr = tempCoordinates;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f2 = i2 - iArr[1];
        Rect rect = tempRect;
        view.getFocusedRect(rect);
        float f3 = rect.left + f;
        return new androidx.compose.ui.geometry.Rect(f3, rect.top + f2, rect.width() + f3, f2 + rect.top + rect.height());
    }

    public static final boolean requestInteropFocus(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX INFO: renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final Integer m361toAndroidFocusDirection3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
            return 33;
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
            return 130;
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s())) {
            return 17;
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
            return 66;
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m357getNextdhqQ8s())) {
            return 2;
        }
        return FocusDirection.m349equalsimpl0(i, companion.m358getPreviousdhqQ8s()) ? 1 : null;
    }

    /* JADX INFO: renamed from: toFocusDirection-ZmokQxo, reason: not valid java name */
    public static final FocusDirection m362toFocusDirectionZmokQxo(KeyEvent keyEvent) {
        long jM1901getKeyZmokQxo = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1742getNavigatePreviousEK5gGoQ())) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m358getPreviousdhqQ8s());
        }
        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1740getNavigateNextEK5gGoQ())) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m357getNextdhqQ8s());
        }
        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1829getTabEK5gGoQ())) {
            return FocusDirection.m346boximpl(KeyEvent_androidKt.m1907isShiftPressedZmokQxo(keyEvent) ? FocusDirection.Companion.m358getPreviousdhqQ8s() : FocusDirection.Companion.m357getNextdhqQ8s());
        }
        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1659getDirectionRightEK5gGoQ())) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m359getRightdhqQ8s());
        }
        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1658getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m356getLeftdhqQ8s());
        }
        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1660getDirectionUpEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1781getPageUpEK5gGoQ())) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m360getUpdhqQ8s());
        }
        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1655getDirectionDownEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1780getPageDownEK5gGoQ())) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m353getDowndhqQ8s());
        }
        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1654getDirectionCenterEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1668getEnterEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1765getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m354getEnterdhqQ8s());
        }
        if (Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1597getBackEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1671getEscapeEK5gGoQ())) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m355getExitdhqQ8s());
        }
        return null;
    }

    public static final LayoutDirection toLayoutDirection(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }

    public static final FocusDirection toFocusDirection(int i) {
        if (i == 1) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m358getPreviousdhqQ8s());
        }
        if (i == 2) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m357getNextdhqQ8s());
        }
        if (i == 17) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m356getLeftdhqQ8s());
        }
        if (i == 33) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m360getUpdhqQ8s());
        }
        if (i == 66) {
            return FocusDirection.m346boximpl(FocusDirection.Companion.m359getRightdhqQ8s());
        }
        if (i != 130) {
            return null;
        }
        return FocusDirection.m346boximpl(FocusDirection.Companion.m353getDowndhqQ8s());
    }
}
