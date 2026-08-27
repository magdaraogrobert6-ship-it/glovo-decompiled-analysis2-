package com.mapbox.navigation.base.internal.route;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import o.accessgetInstancedelegatecp;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RoadObjectsRefresher {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM build;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM endIndexExtractor;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 endIndexSetter;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM startIndexExtractor;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 startIndexSetter;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM toBuilder;

    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d A[LOOP:3: B:62:0x0107->B:64:0x010d, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public final ArrayList getRefreshedRoadObjects(int i, int i2, List list, List list2) {
        ArrayList arrayList;
        ?? arrayList2;
        int size;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.startIndexExtractor;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.endIndexExtractor;
        ?? PlaybackStateCompat = 0;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Integer num = (Integer) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(obj);
                if (num == null) {
                    Integer num2 = (Integer) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
                    if (num2 != null && num2.intValue() >= i) {
                        break;
                    }
                    arrayList.add(obj);
                } else {
                    if (num.intValue() >= i) {
                        break;
                    }
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        ?? r3 = instance_delegatelambda0.write;
        ?? r4 = arrayList;
        if (arrayList == null) {
            r4 = r3;
        }
        if (list2 != null) {
            List list3 = list2;
            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            for (Object obj2 : list3) {
                Object objInvoke = this.toBuilder.invoke(obj2);
                Integer num3 = (Integer) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj2);
                Integer numValueOf = num3 != null ? Integer.valueOf(num3.intValue() + i) : null;
                if (numValueOf != null) {
                    this.startIndexSetter.invoke(objInvoke, Integer.valueOf(numValueOf.intValue()));
                }
                Integer num4 = (Integer) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(obj2);
                Integer numValueOf2 = num4 != null ? Integer.valueOf(num4.intValue() + i) : null;
                if (numValueOf2 != null) {
                    this.endIndexSetter.invoke(objInvoke, Integer.valueOf(numValueOf2.intValue()));
                }
                arrayList2.add(this.build.invoke(objInvoke));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = r3;
        }
        if (list != null) {
            if (list.isEmpty()) {
                PlaybackStateCompat = r3;
            } else {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object objPrevious = listIterator.previous();
                        Integer num5 = (Integer) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objPrevious);
                        if (num5 == null) {
                            Integer num6 = (Integer) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(objPrevious);
                            if (num6 != null && num6.intValue() <= i2) {
                                listIterator.next();
                                size = list.size() - listIterator.nextIndex();
                                if (size == 0) {
                                    PlaybackStateCompat = r3;
                                } else {
                                    PlaybackStateCompat = new ArrayList(size);
                                    while (listIterator.hasNext()) {
                                        PlaybackStateCompat.add(listIterator.next());
                                    }
                                }
                            }
                        } else if (num5.intValue() <= i2) {
                            listIterator.next();
                            size = list.size() - listIterator.nextIndex();
                            if (size == 0) {
                                PlaybackStateCompat = r3;
                            } else {
                                PlaybackStateCompat = new ArrayList(size);
                                while (listIterator.hasNext()) {
                                    PlaybackStateCompat.add(listIterator.next());
                                }
                            }
                        }
                    } else {
                        PlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(list);
                    }
                }
            }
        }
        if (PlaybackStateCompat != 0) {
            r3 = PlaybackStateCompat;
        }
        return onContentCardDismissed.IconCompatParcelizer((Iterable) r3, onContentCardDismissed.IconCompatParcelizer((Iterable) arrayList2, (Collection) r4));
    }

    public RoadObjectsRefresher(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) {
        this.toBuilder = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.build = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.startIndexExtractor = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.endIndexExtractor = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
        this.startIndexSetter = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.endIndexSetter = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
    }
}
