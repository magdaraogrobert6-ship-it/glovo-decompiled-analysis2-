package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.FocusRequesterModifierKt;
import o.RectCompanion;
import o.TouchAwareSwipeDismissTouchListenerITouchListener;
import o.div7Ah8Wj8;
import o.getMaxDimensionannotations;
import o.isInfiniteannotations;
import o.isSpecifieduvyYCjkannotations;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList IconCompatParcelizer;
    public View.OnApplyWindowInsetsListener RemoteActionCompatParcelizer;
    public boolean serializer;
    public final ArrayList write;

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.serializer = z;
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.RemoteActionCompatParcelizer = onApplyWindowInsetsListener;
    }

    public final void write(View view) {
        if (this.write.contains(view)) {
            this.IconCompatParcelizer.add(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, div7Ah8Wj8 div7ah8wj8) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.IconCompatParcelizer = new ArrayList();
        this.write = new ArrayList();
        this.serializer = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RectCompanion.FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentFindFragmentById = div7ah8wj8.findFragmentById(id);
        if (classAttribute != null && fragmentFindFragmentById == null) {
            if (id == -1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            getMaxDimensionannotations getmaxdimensionannotationsMediaSessionCompatQueueItem = div7ah8wj8.MediaSessionCompatQueueItem();
            context.getClassLoader();
            Fragment fragmentSerializer = getmaxdimensionannotationsMediaSessionCompatQueueItem.serializer(classAttribute);
            fragmentSerializer.getClass();
            fragmentSerializer.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = id;
            fragmentSerializer.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = id;
            fragmentSerializer.addOnUserLeaveHintListener = string;
            fragmentSerializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = div7ah8wj8;
            fragmentSerializer._init_lambda4 = div7ah8wj8.PlaybackStateCompat;
            fragmentSerializer.onInflate(context, attributeSet, (Bundle) null);
            isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(div7ah8wj8);
            isinfiniteannotations.ComponentActivity = true;
            fragmentSerializer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = this;
            fragmentSerializer.createFullyDrawnExecutor = true;
            isinfiniteannotations.read(getId(), fragmentSerializer, string, 1);
            if (isinfiniteannotations.write) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("This transaction is already being added to the back stack");
                throw null;
            }
            isinfiniteannotations.IconCompatParcelizer = false;
            isinfiniteannotations.PlaybackStateCompatCustomAction.serializer(isinfiniteannotations, true);
        }
        for (isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations : div7ah8wj8.PlaybackStateCompatCustomAction.read()) {
            Fragment fragment = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
            if (fragment.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == getId() && (view = fragment.getActivityResultRegistry) != null && view.getParent() == null) {
                fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = this;
                isspecifieduvyycjkannotations.serializer();
                isspecifieduvyycjkannotations.MediaDescriptionCompat();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.serializer) {
            Iterator it = this.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.serializer) {
            ArrayList arrayList = this.IconCompatParcelizer;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.write.remove(view);
        if (this.IconCompatParcelizer.remove(view)) {
            this.serializer = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        write(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        write(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.write.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        FocusRequesterModifierKt focusRequesterModifierKtWrite = FocusRequesterModifierKt.write(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.RemoteActionCompatParcelizer;
        if (onApplyWindowInsetsListener != null) {
            focusRequesterModifierKtWrite = FocusRequesterModifierKt.write(null, TouchAwareSwipeDismissTouchListenerITouchListener.RemoteActionCompatParcelizer(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            WindowInsets windowInsetsIconCompatParcelizer = focusRequesterModifierKtWrite.IconCompatParcelizer();
            if (windowInsetsIconCompatParcelizer != null && !windowInsetsIconCompatParcelizer.equals(windowInsetsIconCompatParcelizer)) {
                focusRequesterModifierKtWrite = FocusRequesterModifierKt.write(this, windowInsetsIconCompatParcelizer);
            }
        }
        if (!focusRequesterModifierKtWrite.IconCompatParcelizer.isConsumed()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                FocusPropertiesNode.write(getChildAt(i), focusRequesterModifierKtWrite);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        write(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            View childAt = getChildAt(i3);
            childAt.getClass();
            write(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            View childAt = getChildAt(i3);
            childAt.getClass();
            write(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.read("Views added to a FragmentContainerView must be associated with a Fragment. View ", view, " is not associated with a Fragment.");
        }
    }

    public final <F extends Fragment> F getFragment() {
        FragmentActivity fragmentActivity;
        div7Ah8Wj8 supportFragmentManager;
        Fragment fragmentWrite = div7Ah8Wj8.write(this);
        if (fragmentWrite == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    fragmentActivity = null;
                    break;
                }
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (fragmentActivity == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("View ", this, " is not within a subclass of FragmentActivity.");
                return null;
            }
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        } else {
            if (!fragmentWrite.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragmentWrite + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fragmentWrite.getChildFragmentManager();
        }
        return (F) supportFragmentManager.findFragmentById(getId());
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            childAt.getClass();
            write(childAt);
        }
        super.removeAllViewsInLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        context.getClass();
        this.IconCompatParcelizer = new ArrayList();
        this.write = new ArrayList();
        this.serializer = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RectCompanion.FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public FragmentContainerView(Context context) {
        super(context);
        this.IconCompatParcelizer = new ArrayList();
        this.write = new ArrayList();
        this.serializer = true;
    }
}
