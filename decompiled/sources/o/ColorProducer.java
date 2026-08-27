package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition$1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ColorProducer extends ColorSpaceVerificationHelperExternalSyntheticLambda0 {
    public static final String[] MediaMetadataCompat = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Fields serializer = new Fields(PointF.class, "topLeft", 2);
    public static final Fields RemoteActionCompatParcelizer = new Fields(PointF.class, "bottomRight", 3);
    public static final Fields IconCompatParcelizer = new Fields(PointF.class, "bottomRight", 4);
    public static final Fields write = new Fields(PointF.class, "topLeft", 5);
    public static final Fields read = new Fields(PointF.class, "position", 6);

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void serializer(CompositingStrategyCompanion compositingStrategyCompanion) {
        IconCompatParcelizer(compositingStrategyCompanion);
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final void write(CompositingStrategyCompanion compositingStrategyCompanion) {
        IconCompatParcelizer(compositingStrategyCompanion);
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final String[] write() {
        return MediaMetadataCompat;
    }

    public static void IconCompatParcelizer(CompositingStrategyCompanion compositingStrategyCompanion) {
        View view = compositingStrategyCompanion.RemoteActionCompatParcelizer;
        HashMap map = compositingStrategyCompanion.write;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // o.ColorSpaceVerificationHelperExternalSyntheticLambda0
    public final Animator read(ViewGroup viewGroup, CompositingStrategyCompanion compositingStrategyCompanion, CompositingStrategyCompanion compositingStrategyCompanion2) {
        int i;
        Animator animatorOfObject;
        if (compositingStrategyCompanion == null) {
            return null;
        }
        HashMap map = compositingStrategyCompanion.write;
        if (compositingStrategyCompanion2 == null) {
            return null;
        }
        HashMap map2 = compositingStrategyCompanion2.write;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = compositingStrategyCompanion2.RemoteActionCompatParcelizer;
        android.graphics.Rect rect = (android.graphics.Rect) map.get("android:changeBounds:bounds");
        android.graphics.Rect rect2 = (android.graphics.Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        android.graphics.Rect rect3 = (android.graphics.Rect) map.get("android:changeBounds:clip");
        android.graphics.Rect rect4 = (android.graphics.Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        getAutoNrFUSI.RemoteActionCompatParcelizer(view, i2, i4, i6, i8);
        if (i14 == 2) {
            if (i10 == i12 && i11 == i13) {
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, read, (TypeConverter) null, Transition$1.RemoteActionCompatParcelizer(i2, i4, i3, i5));
            } else {
                androidColorSpacelambda1 androidcolorspacelambda1 = new androidColorSpacelambda1(view);
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getClass();
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(androidcolorspacelambda1, serializer, (TypeConverter) null, Transition$1.RemoteActionCompatParcelizer(i2, i4, i3, i5));
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getClass();
                ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(androidcolorspacelambda1, RemoteActionCompatParcelizer, (TypeConverter) null, Transition$1.RemoteActionCompatParcelizer(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                animatorSet.addListener(new r8lambdadvQyP26Y0BDKakVqbk7uwm4qV_I(androidcolorspacelambda1));
                animatorOfObject = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, IconCompatParcelizer, (TypeConverter) null, Transition$1.RemoteActionCompatParcelizer(i6, i8, i7, i9));
        } else {
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, write, (TypeConverter) null, Transition$1.RemoteActionCompatParcelizer(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            getModulateAlphaNrFUSI.serializer(viewGroup4, true);
            MediaSessionCompatQueueItem().read(new r8lambdadXC_2woaZUvoOIhbOnCMmDxI(viewGroup4));
        }
        return animatorOfObject;
    }
}
