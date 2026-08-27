package o;

import android.util.Range;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AnimationModifierKt {
    public static final HashMap RemoteActionCompatParcelizer;
    public static final HashMap serializer;
    public final HashMap write = new HashMap();

    static {
        HashMap map = new HashMap();
        RemoteActionCompatParcelizer = map;
        map.put(AnimatedVisibilityKt.RatingCompat, Range.create(2160, 4319));
        map.put(AnimatedVisibilityKt.read, Range.create(1080, 1439));
        map.put(AnimatedVisibilityKt.RemoteActionCompatParcelizer, Range.create(720, 1079));
        map.put(AnimatedVisibilityKt.MediaBrowserCompatMediaItem, Range.create(241, 719));
        HashMap map2 = new HashMap();
        serializer = map2;
        map2.put(0, AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer);
        map2.put(1, AudioTimestampFramePositionIncorrectQuirk.write);
    }

    public AnimationModifierKt(List list, HashMap map) {
        HashMap map2;
        Integer num;
        AnimatedVisibilityKt animatedVisibilityKt;
        HashMap map3 = RemoteActionCompatParcelizer;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = serializer;
            if (!zHasNext) {
                break;
            }
            AnimatedVisibilityKt animatedVisibilityKt2 = (AnimatedVisibilityKt) it.next();
            this.write.put(new AnimatedContentTransitionScopeImplSizeModifierNode(animatedVisibilityKt2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.write.put(new AnimatedContentTransitionScopeImplSizeModifierNode(animatedVisibilityKt2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.write.get(new AnimatedContentTransitionScopeImplSizeModifierNode((AnimatedVisibilityKt) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((android.util.Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            android.util.Size size = (android.util.Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    animatedVisibilityKt = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                    animatedVisibilityKt = (AnimatedVisibilityKt) entry2.getKey();
                    break;
                }
            }
            if (animatedVisibilityKt != null) {
                for (Map.Entry entry3 : map2.entrySet()) {
                    if (AudioTimestampFramePositionIncorrectQuirk.serializer(size, (Rational) entry3.getValue(), setController.serializer)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.write.get(new AnimatedContentTransitionScopeImplSizeModifierNode(animatedVisibilityKt, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.write.entrySet()) {
            android.util.Size size2 = (android.util.Size) map.get(((AnimatedContentTransitionScopeImplSizeModifierNode) entry4.getKey()).IconCompatParcelizer);
            if (size2 != null) {
                android.util.Size size3 = setController.MediaDescriptionCompat;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: o.AnimatedVisibilityScope
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iWrite = setController.write((android.util.Size) obj);
                        int i = height;
                        return Math.abs(iWrite - i) - Math.abs(setController.write((android.util.Size) obj2) - i);
                    }
                });
            }
        }
    }
}
