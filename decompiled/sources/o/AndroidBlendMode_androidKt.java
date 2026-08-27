package o;

import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.zzw;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidBlendMode_androidKt extends toAndroidBlendModes9anfk8 {
    @Override // o.toAndroidBlendModes9anfk8
    public final boolean RemoteActionCompatParcelizer(Object obj) {
        if (!div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            return false;
        }
        Objects.toString(obj);
        return false;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final boolean read(Object obj) {
        return obj instanceof android.transition.Transition;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final Object IconCompatParcelizer(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((android.transition.Transition) obj);
        }
        transitionSet.addTransition((android.transition.Transition) obj2);
        return transitionSet;
    }

    public final void IconCompatParcelizer(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        android.transition.Transition transition = (android.transition.Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                IconCompatParcelizer(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (IconCompatParcelizer(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void read(View view, Object obj) {
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            toAndroidBlendModes9anfk8.RemoteActionCompatParcelizer(view, rect);
            ((android.transition.Transition) obj).setEpicenterCallback(new takeOrElseTmRCtEA(0, rect));
        }
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final Object write(Object obj) {
        if (obj != null) {
            return ((android.transition.Transition) obj).clone();
        }
        return null;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final Object write(Object obj, Object obj2, Object obj3) {
        android.transition.Transition ordering = (android.transition.Transition) obj;
        android.transition.Transition transition = (android.transition.Transition) obj2;
        android.transition.Transition transition2 = (android.transition.Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(View view, Object obj) {
        ((android.transition.Transition) obj).addTarget(view);
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (android.transition.Transition) obj);
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            toAndroidBlendModes9anfk8.IconCompatParcelizer((List) targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        write(arrayList, transitionSet);
    }

    public static boolean IconCompatParcelizer(android.transition.Transition transition) {
        return (toAndroidBlendModes9anfk8.serializer((List) transition.getTargetIds()) && toAndroidBlendModes9anfk8.serializer((List) transition.getTargetNames()) && toAndroidBlendModes9anfk8.serializer((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void RemoteActionCompatParcelizer(Object obj, View view, ArrayList arrayList) {
        ((android.transition.Transition) obj).addListener(new isSupporteds9anfk8(view, arrayList));
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void RemoteActionCompatParcelizer(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            IconCompatParcelizer(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(androidx.fragment.app.Fragment fragment, Object obj, zzw zzwVar, Runnable runnable) {
        ((android.transition.Transition) obj).addListener(new toComposeBlendMode(runnable));
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(ArrayList arrayList, Object obj) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                write(arrayList, transitionSet.getTransitionAt(i));
                i++;
            }
            return;
        }
        if (IconCompatParcelizer(transition) || !toAndroidBlendModes9anfk8.serializer((List) transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final Object IconCompatParcelizer(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((android.transition.Transition) obj);
        return transitionSet;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void serializer(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((android.transition.Transition) obj).addListener(new AndroidBlendMode_androidKtWhenMappings(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final boolean IconCompatParcelizer() {
        div7Ah8Wj8.RemoteActionCompatParcelizer(4);
        return false;
    }

    @Override // o.toAndroidBlendModes9anfk8
    public final void write(Object obj, android.graphics.Rect rect) {
        ((android.transition.Transition) obj).setEpicenterCallback(new takeOrElseTmRCtEA(1, rect));
    }
}
