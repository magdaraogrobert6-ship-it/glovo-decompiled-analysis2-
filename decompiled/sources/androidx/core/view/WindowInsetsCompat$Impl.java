package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.C0165focusRequester;
import o.FocusRequesterKt;
import o.FocusRequesterModifier;
import o.FocusRequesterModifierKt;
import o.FocusRequesterModifierNode;
import o.FocusRequesterModifierNodeKt;
import o.FocusRequesterNode;
import o.getFocusRequester;
import o.pinFocusedChild;
import o.setEnter;
import o.setOnEnter;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat$Impl {
    public static final FocusRequesterModifierKt CONSUMED;
    public final FocusRequesterModifierKt mHost;

    public FocusRequesterModifierKt consumeDisplayCutout() {
        return this.mHost;
    }

    public FocusRequesterModifierKt consumeStableInsets() {
        return this.mHost;
    }

    public FocusRequesterModifierKt consumeSystemWindowInsets() {
        return this.mHost;
    }

    public void copyRootViewBounds(View view) {
    }

    public void copyWindowDataInto(FocusRequesterModifierKt focusRequesterModifierKt) {
    }

    public List<Rect> getBoundingRects(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> getBoundingRectsIgnoringVisibility(int i) {
        return Collections.EMPTY_LIST;
    }

    public setEnter getDisplayCutout() {
        return null;
    }

    public setRight getInsets(int i) {
        return setRight.IconCompatParcelizer;
    }

    public setRight getMandatorySystemGestureInsets() {
        return getSystemWindowInsets();
    }

    public setRight getStableInsets() {
        return setRight.IconCompatParcelizer;
    }

    public setRight getSystemGestureInsets() {
        return getSystemWindowInsets();
    }

    public setRight getSystemWindowInsets() {
        return setRight.IconCompatParcelizer;
    }

    public setRight getTappableElementInsets() {
        return getSystemWindowInsets();
    }

    public void initDisplayShape(View view) {
    }

    public void initTypeBoundingRectsMaps() {
    }

    public FocusRequesterModifierKt inset(int i, int i2, int i3, int i4) {
        return CONSUMED;
    }

    public boolean isConsumed() {
        return false;
    }

    public boolean isRound() {
        return false;
    }

    public boolean isVisible(int i) {
        return true;
    }

    public void setDisplayShape(setOnEnter setonenter) {
    }

    public void setOverriddenInsets(setRight[] setrightArr) {
    }

    public void setRootViewData(setRight setright) {
    }

    public void setRootWindowInsets(FocusRequesterModifierKt focusRequesterModifierKt) {
    }

    public void setStableInsets(setRight setright) {
    }

    public void setSystemUiVisibility(int i) {
    }

    public void setTypeBoundingRectsMap(Rect[][] rectArr) {
    }

    public void setTypeMaxBoundingRectsMap(Rect[][] rectArr) {
    }

    public WindowInsetsCompat$Impl(FocusRequesterModifierKt focusRequesterModifierKt) {
        this.mHost = focusRequesterModifierKt;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat$Impl)) {
            return false;
        }
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = (WindowInsetsCompat$Impl) obj;
        return isRound() == windowInsetsCompat$Impl.isRound() && isConsumed() == windowInsetsCompat$Impl.isConsumed() && Objects.equals(getSystemWindowInsets(), windowInsetsCompat$Impl.getSystemWindowInsets()) && Objects.equals(getStableInsets(), windowInsetsCompat$Impl.getStableInsets()) && Objects.equals(getDisplayCutout(), windowInsetsCompat$Impl.getDisplayCutout());
    }

    public setRight getInsetsIgnoringVisibility(int i) {
        if ((i & 8) == 0) {
            return setRight.IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unable to query the maximum insets for IME");
        return null;
    }

    static {
        FocusRequesterModifier focusRequesterKt;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            focusRequesterKt = new pinFocusedChild();
        } else if (i >= 35) {
            focusRequesterKt = new FocusRequesterNode();
        } else if (i >= 34) {
            focusRequesterKt = new FocusRequesterModifierNode();
        } else if (i >= 31) {
            focusRequesterKt = new C0165focusRequester();
        } else if (i >= 30) {
            focusRequesterKt = new FocusRequesterModifierNodeKt();
        } else {
            focusRequesterKt = i >= 29 ? new FocusRequesterKt() : new getFocusRequester();
        }
        CONSUMED = focusRequesterKt.RemoteActionCompatParcelizer().IconCompatParcelizer.consumeDisplayCutout().IconCompatParcelizer.consumeStableInsets().IconCompatParcelizer.consumeSystemWindowInsets();
    }

    public int hashCode() {
        boolean zIsRound = isRound();
        boolean zIsConsumed = isConsumed();
        return Objects.hash(Boolean.valueOf(zIsRound), Boolean.valueOf(zIsConsumed), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
    }
}
