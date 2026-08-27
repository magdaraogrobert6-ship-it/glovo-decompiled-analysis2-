package o;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.google.android.gms.common.zzw;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class toAndroidBlendModes9anfk8 {
    public abstract Object IconCompatParcelizer(Object obj);

    public abstract Object IconCompatParcelizer(Object obj, Object obj2);

    public abstract boolean IconCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer(Object obj, View view, ArrayList arrayList);

    public abstract void RemoteActionCompatParcelizer(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract boolean RemoteActionCompatParcelizer(Object obj);

    public void read(float f, Object obj) {
    }

    public abstract void read(View view, Object obj);

    public void read(Object obj, w4$$ExternalSyntheticLambda0 w4__externalsyntheticlambda0) {
    }

    public abstract boolean read(Object obj);

    public Object serializer(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public void serializer(Object obj) {
    }

    public abstract void serializer(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract Object write(Object obj);

    public abstract Object write(Object obj, Object obj2, Object obj3);

    public abstract void write(View view, Object obj);

    public abstract void write(ViewGroup viewGroup, Object obj);

    public abstract void write(androidx.fragment.app.Fragment fragment, Object obj, zzw zzwVar, Runnable runnable);

    public abstract void write(Object obj, android.graphics.Rect rect);

    public abstract void write(Object obj, View view, ArrayList arrayList);

    public abstract void write(ArrayList arrayList, Object obj);

    public static boolean serializer(List list) {
        return list == null || list.isEmpty();
    }

    public void RemoteActionCompatParcelizer(Object obj, zzw zzwVar, RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0, Runnable runnable) {
        ((RoundRect) runnable).run();
    }

    public static void IconCompatParcelizer(List list, View view) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            if (childAt.getTransitionName() == null) {
                                break;
                            }
                            list.add(childAt);
                            break;
                        } else if (list.get(i4) == childAt) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
    }

    public static void RemoteActionCompatParcelizer(View view, android.graphics.Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }
}
