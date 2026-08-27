package androidx.compose.ui.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import o.DrawableTransformation;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relocationOffsetfbGrOKE;

/* JADX INFO: loaded from: classes.dex */
public final class ListUtilsKt {
    public static final <T> boolean fastAll(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> T fastFirst(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t)).booleanValue()) {
                return t;
            }
        }
        throwNoSuchElementException("Collection contains no element matching the predicate.");
        DrawableTransformation.read();
        return null;
    }

    public static final <T> T fastFirstOrNull(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r = (R) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(r, list.get(i));
        }
        return r;
    }

    public static final <T> void fastForEach(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i));
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T> void fastForEachReversed(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(size));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public static final <T> T fastLastOrNull(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            T t = list.get(size);
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t)).booleanValue()) {
                return t;
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i)));
        }
        return c;
    }

    public static final <T> int fastSumBy(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        int iIntValue = 0;
        for (int i = 0; i < size; i++) {
            iIntValue += ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i))).intValue();
        }
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws IOException {
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            appendable.append((CharSequence) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t));
            return;
        }
        if (t == 0 || (t instanceof CharSequence)) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }

    public static final <T, K> List<T> fastDistinctBy(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        relocationOffsetfbGrOKE relocationoffsetfbgroke = new relocationOffsetfbGrOKE(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (relocationoffsetfbgroke.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilter(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t)).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNotNull(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastFilteredMap(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t)).booleanValue()) {
                arrayList.add(r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(t));
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastFlatMap(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i)), (Collection) arrayList);
        }
        return arrayList;
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, r8lambdaunavo3sxub_pc9xroryotnrlvsm)).toString();
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexed(List<? extends T> list, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(i), list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> list, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(i), list.get(i));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final Void throwNoSuchElementException(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void throwUnsupportedOperationException(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws IOException {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            appendElement(a, t, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
        }
        return fastJoinToString(list, charSequence, charSequence5, charSequence6, i3, charSequence7, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static final <T, R, V> List<V> fastZip(List<? extends T> list, List<? extends R> list2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int iMin = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(list.get(i), list2.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        if (list.size() <= 1) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        T t = list.get(0);
        int size = list.size();
        while (i < size - 1) {
            i++;
            T t2 = list.get(i);
            arrayList.add(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(t, t2));
            t = t2;
        }
        return arrayList;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrDefault(List<? extends T> list, R r, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (list.isEmpty()) {
            return r;
        }
        R r2 = (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(0));
        int size = list.size() - 1;
        int i = 1;
        if (1 <= size) {
            while (true) {
                Comparable comparable = (Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i));
                if (comparable.compareTo(r2) > 0) {
                    r2 = (R) comparable;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return (R) r2;
    }

    public static final <S, T extends S> S fastReduce(List<? extends T> list, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        if (list.isEmpty()) {
            throwUnsupportedOperationException("Empty collection can't be reduced.");
        }
        S s = (S) onContentCardDismissed.read((List) list);
        int size = list.size() - 1;
        int i = 1;
        if (1 <= size) {
            while (true) {
                s = (S) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(s, list.get(i));
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return s;
    }

    public static final <T, R extends Comparable<? super R>> T fastMaxBy(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        Comparable comparable = (Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t);
        int size = list.size() - 1;
        int i = 1;
        if (1 <= size) {
            while (true) {
                T t2 = list.get(i);
                Comparable comparable2 = (Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t2);
                if (comparable.compareTo(comparable2) < 0) {
                    t = t2;
                    comparable = comparable2;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (list.isEmpty()) {
            return null;
        }
        R r = (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(0));
        int size = list.size() - 1;
        int i = 1;
        if (1 <= size) {
            while (true) {
                Comparable comparable = (Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i));
                if (comparable.compareTo(r) > 0) {
                    r = (R) comparable;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return (R) r;
    }

    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        Comparable comparable = (Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t);
        int size = list.size() - 1;
        int i = 1;
        if (1 <= size) {
            while (true) {
                T t2 = list.get(i);
                Comparable comparable2 = (Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t2);
                if (comparable.compareTo(comparable2) > 0) {
                    t = t2;
                    comparable = comparable2;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return t;
    }
}
