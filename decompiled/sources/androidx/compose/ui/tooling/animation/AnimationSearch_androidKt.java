package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.data.Group;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AnimationSearch_androidKt {
    private static final String ANIMATED_CONTENT = "AnimatedContent";
    private static final String ANIMATED_VISIBILITY = "AnimatedVisibility";
    private static final String ANIMATE_VALUE_AS_STATE = "animateValueAsState";
    private static final String REMEMBER = "remember";
    private static final String REMEMBER_INFINITE_TRANSITION = "rememberInfiniteTransition";
    private static final String REMEMBER_UPDATED_STATE = "rememberUpdatedState";
    private static final String SIZE_ANIMATION_MODIFIER = "androidx.compose.animation.SizeAnimationModifierElement";
    private static final String UPDATE_TRANSITION = "updateTransition";

    private static final <T> T findData(Group group, boolean z) {
        Collection<Object> data = group.getData();
        Collection<Group> children = group.getChildren();
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Group) it.next()).getChildren(), (Collection) arrayList);
            }
            children = onContentCardDismissed.IconCompatParcelizer(arrayList, children);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = children.iterator();
        while (it2.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Group) it2.next()).getData(), (Collection) arrayList2);
        }
        Iterator it3 = onContentCardDismissed.IconCompatParcelizer(arrayList2, data).iterator();
        if (!it3.hasNext()) {
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
        it3.next();
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }

    private static final <T> List<T> findRememberedData(Collection<? extends Group> collection) {
        Collection<? extends Group> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        if (it.hasNext()) {
            Iterator<T> it2 = ((Group) it.next()).getData().iterator();
            if (!it2.hasNext()) {
                removeNodeAtDepth.IconCompatParcelizer();
                throw null;
            }
            it2.next();
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            Group groupFirstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it3.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
            if (groupFirstOrNull != null) {
                arrayList2.add(groupFirstOrNull);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        if (!it4.hasNext()) {
            return onContentCardDismissed.IconCompatParcelizer(arrayList3, arrayList);
        }
        Iterator<T> it5 = ((Group) it4.next()).getData().iterator();
        if (!it5.hasNext()) {
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
        it5.next();
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }

    public static Object findData$default(Group group, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        Collection<Object> data = group.getData();
        Collection<Group> children = group.getChildren();
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Group) it.next()).getChildren(), (Collection) arrayList);
            }
            children = onContentCardDismissed.IconCompatParcelizer(arrayList, children);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = children.iterator();
        while (it2.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Group) it2.next()).getData(), (Collection) arrayList2);
        }
        Iterator it3 = onContentCardDismissed.IconCompatParcelizer(arrayList2, data).iterator();
        if (it3.hasNext()) {
            it3.next();
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }

    private static final <T> List<T> findRememberedData(Group group) {
        Iterator<T> it = group.getData().iterator();
        if (it.hasNext()) {
            it.next();
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }
}
