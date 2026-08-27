package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import coil3.UriKt;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.rrweb.write;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.C0165focusRequester;
import o.FocusPropertiesImplonExit1;
import o.FocusRequesterKt;
import o.FocusRequesterModifier;
import o.FocusRequesterModifierKt;
import o.FocusRequesterModifierNode;
import o.FocusRequesterModifierNodeKt;
import o.FocusRequesterNode;
import o.getFocusRequester;
import o.getOnExit;
import o.pinFocusedChild;
import o.setEnter;
import o.setOnEnter;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat$Impl20 extends WindowInsetsCompat$Impl {
    public static Class sAttachInfoClass = null;
    public static Field sAttachInfoField = null;
    public static Method sGetViewRootImplMethod = null;
    public static Field sVisibleInsetsField = null;
    public static boolean sVisibleRectReflectionFetched = false;
    public setOnEnter mDisplayShapeCompat;
    public setRight[] mOverriddenInsets;
    public final WindowInsets mPlatformInsets;
    public int mRootViewHeight;
    public setRight mRootViewVisibleInsets;
    public int mRootViewWidth;
    public FocusRequesterModifierKt mRootWindowInsets;
    public int mSystemUiVisibility;
    public setRight mSystemWindowInsets;
    public Rect[][] mTypeBoundingRectsMap;
    public Rect[][] mTypeMaxBoundingRectsMap;

    public static boolean systemBarVisibilityEquals(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    public setRight getInsetsForType(int i, boolean z) {
        setRight stableInsets;
        int i2;
        setRight setright = setRight.IconCompatParcelizer;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    setRight[] setrightArr = this.mOverriddenInsets;
                    stableInsets = setrightArr != null ? setrightArr[UriKt.RemoteActionCompatParcelizer(8)] : null;
                    if (stableInsets != null) {
                        return stableInsets;
                    }
                    setRight systemWindowInsets = getSystemWindowInsets();
                    setRight rootStableInsets = getRootStableInsets();
                    int i3 = systemWindowInsets.serializer;
                    if (i3 > rootStableInsets.serializer) {
                        return setRight.IconCompatParcelizer(0, 0, 0, i3);
                    }
                    setRight setright2 = this.mRootViewVisibleInsets;
                    if (setright2 != null && !setright2.equals(setright) && (i2 = this.mRootViewVisibleInsets.serializer) > rootStableInsets.serializer) {
                        return setRight.IconCompatParcelizer(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return getSystemGestureInsets();
                    }
                    if (i == 32) {
                        return getMandatorySystemGestureInsets();
                    }
                    if (i == 64) {
                        return getTappableElementInsets();
                    }
                    if (i == 128) {
                        FocusRequesterModifierKt focusRequesterModifierKt = this.mRootWindowInsets;
                        setEnter displayCutout = focusRequesterModifierKt != null ? focusRequesterModifierKt.IconCompatParcelizer.getDisplayCutout() : getDisplayCutout();
                        if (displayCutout != null) {
                            DisplayCutout displayCutout2 = displayCutout.write;
                            return setRight.IconCompatParcelizer(write.serializer(displayCutout2), write.write(displayCutout2), write.read(displayCutout2), write.IconCompatParcelizer(displayCutout2));
                        }
                    }
                }
            } else {
                if (z) {
                    setRight rootStableInsets2 = getRootStableInsets();
                    setRight stableInsets2 = getStableInsets();
                    return setRight.IconCompatParcelizer(Math.max(rootStableInsets2.RemoteActionCompatParcelizer, stableInsets2.RemoteActionCompatParcelizer), 0, Math.max(rootStableInsets2.read, stableInsets2.read), Math.max(rootStableInsets2.serializer, stableInsets2.serializer));
                }
                if ((this.mSystemUiVisibility & 2) == 0) {
                    setRight systemWindowInsets2 = getSystemWindowInsets();
                    FocusRequesterModifierKt focusRequesterModifierKt2 = this.mRootWindowInsets;
                    stableInsets = focusRequesterModifierKt2 != null ? focusRequesterModifierKt2.IconCompatParcelizer.getStableInsets() : null;
                    int iMin = systemWindowInsets2.serializer;
                    if (stableInsets != null) {
                        iMin = Math.min(iMin, stableInsets.serializer);
                    }
                    return setRight.IconCompatParcelizer(systemWindowInsets2.RemoteActionCompatParcelizer, 0, systemWindowInsets2.read, iMin);
                }
            }
        } else {
            if (z) {
                return setRight.IconCompatParcelizer(0, Math.max(getRootStableInsets().write, getSystemWindowInsets().write), 0, 0);
            }
            if ((this.mSystemUiVisibility & 4) == 0) {
                return setRight.IconCompatParcelizer(0, getSystemWindowInsets().write, 0, 0);
            }
        }
        return setright;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public setRight getInsetsIgnoringVisibility(int i) {
        return getInsets(i, true);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void setDisplayShape(setOnEnter setonenter) {
        this.mDisplayShapeCompat = setonenter;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void setOverriddenInsets(setRight[] setrightArr) {
        this.mOverriddenInsets = setrightArr;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void setRootViewData(setRight setright) {
        this.mRootViewVisibleInsets = setright;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void setRootWindowInsets(FocusRequesterModifierKt focusRequesterModifierKt) {
        this.mRootWindowInsets = focusRequesterModifierKt;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void setSystemUiVisibility(int i) {
        this.mSystemUiVisibility = i;
    }

    private Rect[] getBoundingRectsFromInsets(setRight setright) {
        ArrayList arrayList = new ArrayList();
        int i = setright.RemoteActionCompatParcelizer;
        int i2 = setright.serializer;
        int i3 = setright.read;
        int i4 = setright.write;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, setright.RemoteActionCompatParcelizer, this.mRootViewHeight));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.mRootViewWidth, i4));
        }
        if (i3 != 0) {
            int i5 = this.mRootViewWidth;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.mRootViewHeight));
        }
        if (i2 != 0) {
            int i6 = this.mRootViewHeight;
            arrayList.add(new Rect(0, i6 - i2, this.mRootViewWidth, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private setRight getVisibleInsets(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            IBraze$$ExternalSyntheticBUOutline0.m("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!sVisibleRectReflectionFetched) {
            loadReflectionField();
        }
        Method method = sGetViewRootImplMethod;
        if (method != null && sAttachInfoClass != null && sVisibleInsetsField != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    SentryLogcatAdapter.write("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) sVisibleInsetsField.get(sAttachInfoField.get(objInvoke));
                if (rect != null) {
                    return setRight.IconCompatParcelizer(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                SentryLogcatAdapter.read("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void copyWindowDataInto(FocusRequesterModifierKt focusRequesterModifierKt) {
        focusRequesterModifierKt.IconCompatParcelizer.setRootWindowInsets(this.mRootWindowInsets);
        setRight setright = this.mRootViewVisibleInsets;
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
        windowInsetsCompat$Impl.setRootViewData(setright);
        windowInsetsCompat$Impl.setSystemUiVisibility(this.mSystemUiVisibility);
        windowInsetsCompat$Impl.setDisplayShape(this.mDisplayShapeCompat);
        windowInsetsCompat$Impl.setTypeBoundingRectsMap(this.mTypeBoundingRectsMap);
        windowInsetsCompat$Impl.setTypeMaxBoundingRectsMap(this.mTypeMaxBoundingRectsMap);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public List<Rect> getBoundingRectsIgnoringVisibility(int i) {
        return getBoundingRects(this.mTypeMaxBoundingRectsMap, i);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public boolean isRound() {
        return this.mPlatformInsets.isRound();
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public FocusRequesterModifierKt inset(int i, int i2, int i3, int i4) {
        FocusRequesterModifier focusRequesterKt;
        FocusRequesterModifierKt focusRequesterModifierKtWrite = FocusRequesterModifierKt.write(null, this.mPlatformInsets);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            focusRequesterKt = new pinFocusedChild(focusRequesterModifierKtWrite);
        } else if (i5 >= 35) {
            focusRequesterKt = new FocusRequesterNode(focusRequesterModifierKtWrite);
        } else if (i5 >= 34) {
            focusRequesterKt = new FocusRequesterModifierNode(focusRequesterModifierKtWrite);
        } else if (i5 >= 31) {
            focusRequesterKt = new C0165focusRequester(focusRequesterModifierKtWrite);
        } else if (i5 >= 30) {
            focusRequesterKt = new FocusRequesterModifierNodeKt(focusRequesterModifierKtWrite);
        } else {
            focusRequesterKt = i5 >= 29 ? new FocusRequesterKt(focusRequesterModifierKtWrite) : new getFocusRequester(focusRequesterModifierKtWrite);
        }
        focusRequesterKt.write(FocusRequesterModifierKt.IconCompatParcelizer(getSystemWindowInsets(), i, i2, i3, i4));
        focusRequesterKt.IconCompatParcelizer(FocusRequesterModifierKt.IconCompatParcelizer(getStableInsets(), i, i2, i3, i4));
        return focusRequesterKt.RemoteActionCompatParcelizer();
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void setTypeBoundingRectsMap(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.mTypeBoundingRectsMap = (Rect[][]) rectArr.clone();
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void setTypeMaxBoundingRectsMap(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.mTypeMaxBoundingRectsMap = (Rect[][]) rectArr.clone();
    }

    public WindowInsetsCompat$Impl20(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsets windowInsets) {
        super(focusRequesterModifierKt);
        this.mSystemWindowInsets = null;
        this.mTypeBoundingRectsMap = new Rect[10][];
        this.mTypeMaxBoundingRectsMap = new Rect[10][];
        this.mPlatformInsets = windowInsets;
    }

    private setOnEnter createDisplayShape(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.mHost.IconCompatParcelizer.isRound()) {
            return setOnEnter.serializer(point.x, point.y, true, 0, 0, 0, 0);
        }
        FocusPropertiesImplonExit1 focusPropertiesImplonExit1Serializer = getOnExit.serializer(display, 0);
        FocusPropertiesImplonExit1 focusPropertiesImplonExit1Serializer2 = getOnExit.serializer(display, 1);
        FocusPropertiesImplonExit1 focusPropertiesImplonExit1Serializer3 = getOnExit.serializer(display, 2);
        FocusPropertiesImplonExit1 focusPropertiesImplonExit1Serializer4 = getOnExit.serializer(display, 3);
        return setOnEnter.serializer(point.x, point.y, false, focusPropertiesImplonExit1Serializer != null ? focusPropertiesImplonExit1Serializer.RemoteActionCompatParcelizer() : 0, focusPropertiesImplonExit1Serializer2 != null ? focusPropertiesImplonExit1Serializer2.RemoteActionCompatParcelizer() : 0, focusPropertiesImplonExit1Serializer3 != null ? focusPropertiesImplonExit1Serializer3.RemoteActionCompatParcelizer() : 0, focusPropertiesImplonExit1Serializer4 != null ? focusPropertiesImplonExit1Serializer4.RemoteActionCompatParcelizer() : 0);
    }

    private setRight getRootStableInsets() {
        FocusRequesterModifierKt focusRequesterModifierKt = this.mRootWindowInsets;
        return focusRequesterModifierKt != null ? focusRequesterModifierKt.IconCompatParcelizer.getStableInsets() : setRight.IconCompatParcelizer;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void copyRootViewBounds(View view) {
        this.mRootViewWidth = view.getWidth();
        this.mRootViewHeight = view.getHeight();
        setRight visibleInsets = getVisibleInsets(view);
        if (visibleInsets == null) {
            visibleInsets = setRight.IconCompatParcelizer;
        }
        setRootViewData(visibleInsets);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public final setRight getSystemWindowInsets() {
        if (this.mSystemWindowInsets == null) {
            WindowInsets windowInsets = this.mPlatformInsets;
            this.mSystemWindowInsets = setRight.IconCompatParcelizer(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.mSystemWindowInsets;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void initDisplayShape(View view) {
        this.mDisplayShapeCompat = createDisplayShape(view);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    @SuppressLint
    public void initTypeBoundingRectsMaps() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(i);
            this.mTypeBoundingRectsMap[iRemoteActionCompatParcelizer] = getBoundingRectsFromInsets(getInsets(i));
            if (i != 8) {
                this.mTypeMaxBoundingRectsMap[iRemoteActionCompatParcelizer] = getBoundingRectsFromInsets(getInsetsIgnoringVisibility(i));
            }
        }
    }

    @SuppressLint
    private static void loadReflectionField() {
        try {
            sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            sAttachInfoClass = cls;
            sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
            sAttachInfoField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            sVisibleInsetsField.setAccessible(true);
            sAttachInfoField.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            SentryLogcatAdapter.read("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        sVisibleRectReflectionFetched = true;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        WindowInsetsCompat$Impl20 windowInsetsCompat$Impl20 = (WindowInsetsCompat$Impl20) obj;
        return Objects.equals(this.mRootViewVisibleInsets, windowInsetsCompat$Impl20.mRootViewVisibleInsets) && systemBarVisibilityEquals(this.mSystemUiVisibility, windowInsetsCompat$Impl20.mSystemUiVisibility);
    }

    private static List<Rect> getBoundingRects(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[UriKt.RemoteActionCompatParcelizer(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        if (rectArr3 == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(rectArr3);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    @SuppressLint
    public boolean isVisible(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !isTypeVisible(i2)) {
                return false;
            }
        }
        return true;
    }

    @SuppressLint
    private setRight getInsets(int i, boolean z) {
        setRight setrightWrite = setRight.IconCompatParcelizer;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                setrightWrite = setRight.write(setrightWrite, getInsetsForType(i2, z));
            }
        }
        return setrightWrite;
    }

    public WindowInsetsCompat$Impl20(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsetsCompat$Impl20 windowInsetsCompat$Impl20) {
        this(focusRequesterModifierKt, new WindowInsets(windowInsetsCompat$Impl20.mPlatformInsets));
    }

    public boolean isTypeVisible(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !getInsetsForType(i, false).equals(setRight.IconCompatParcelizer);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public setRight getInsets(int i) {
        return getInsets(i, false);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public List<Rect> getBoundingRects(int i) {
        return getBoundingRects(this.mTypeBoundingRectsMap, i);
    }
}
