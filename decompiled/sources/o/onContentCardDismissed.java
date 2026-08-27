package o;

import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.subjects.BehaviorSubject;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onContentCardDismissed extends BrazeContentCardsManagerCompanion {
    public static List IconCompatParcelizer(List list) {
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return read(list2, size);
    }

    public static final int serializer(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "Position index ", " must be in range [");
        sbM.append(new ensureSubscribedToInAppMessageEventslambda7(0, list.size(), 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public static Object IconCompatParcelizer(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return read((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        DrawableTransformation.write("Collection is empty.");
        return null;
    }

    public static ArrayList IconCompatParcelizer(Iterable iterable, int i) {
        iterable.getClass();
        r8lambdamYEtK3wDOqF6c3HLWu9wJc3oPw.write(i, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itWrite = r8lambdamYEtK3wDOqF6c3HLWu9wJc3oPw.write(iterable.iterator(), i, i, true, false);
            while (itWrite.hasNext()) {
                arrayList.add((List) itWrite.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static ArrayList IconCompatParcelizer(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            RemoteActionCompatParcelizer(iterable, (Collection) arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static Object MediaBrowserCompatMediaItem(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            int size = list.size();
            if (size == 0) {
                DrawableTransformation.write("List is empty.");
                return null;
            }
            if (size == 1) {
                return list.get(0);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("List has more than one element.");
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            DrawableTransformation.write("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Collection has more than one element.");
        return null;
    }

    public static Object MediaBrowserCompatMediaItem(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, list);
    }

    public static Float MediaDescriptionCompat(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Object MediaDescriptionCompat(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, list);
        }
        DrawableTransformation.write("List is empty.");
        return null;
    }

    public static List MediaMetadataCompat(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return PlaybackStateCompat(iterable);
        }
        List listMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(iterable);
        Collections.reverse(listMediaSessionCompatResultReceiverWrapper);
        return listMediaSessionCompatResultReceiverWrapper;
    }

    public static Comparable MediaSessionCompatQueueItem(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object MediaSessionCompatQueueItem(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        DrawableTransformation.write("List is empty.");
        return null;
    }

    public static final List MediaSessionCompatResultReceiverWrapper(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        read(iterable, (AbstractCollection) arrayList);
        return arrayList;
    }

    public static double MediaSessionCompatToken(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    public static Set ParcelableVolumeInfo(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        read(iterable, (AbstractCollection) linkedHashSet);
        return linkedHashSet;
    }

    public static List PlaybackStateCompat(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return androidx.sqlite.SQLite.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return instance_delegatelambda0.write;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return androidx.sqlite.SQLite.IconCompatParcelizer(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List PlaybackStateCompatCustomAction(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(iterable);
            BrazeContentCardsManagerCompanion.RatingCompat(listMediaSessionCompatResultReceiverWrapper);
            return listMediaSessionCompatResultReceiverWrapper;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return PlaybackStateCompat(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return onContentCardClicked.read(array);
    }

    public static int RemoteActionCompatParcelizer(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{obj, obj2}, iWrite3)).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void RemoteActionCompatParcelizer(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
            int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
            int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
            DelayKt.write(-1980350160, iWrite2, 1980350160, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, iWrite, new Object[]{sb, obj, r8lambdaunavo3sxub_pc9xroryotnrlvsm});
        }
        sb.append(charSequence3);
    }

    public static void RemoteActionCompatParcelizer(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static int[] RemoteActionCompatParcelizer(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static Set r8lambda54BeH8ZsBru0CXI2CCSP2syNys(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return RangesKt.write(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(onMove.RemoteActionCompatParcelizer(collection.size()));
                read(iterable, (AbstractCollection) linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            read(iterable, (AbstractCollection) linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : RangesKt.write(linkedHashSet2.iterator().next());
            }
        }
        return ItemTouchHelperAdapter.serializer;
    }

    public static LinkedHashSet read(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionWrite = write(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionWrite.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void read(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static boolean[] read(Collection collection) {
        collection.getClass();
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static Object serializer(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static List serializer(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(iterable);
            BrazeContentCardsManagerCompanion.write(listMediaSessionCompatResultReceiverWrapper, comparator);
            return listMediaSessionCompatResultReceiverWrapper;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return PlaybackStateCompat(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static Set serializer(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set setParcelableVolumeInfo = ParcelableVolumeInfo(iterable);
        RemoteActionCompatParcelizer(iterable2, (Collection) setParcelableVolumeInfo);
        return setParcelableVolumeInfo;
    }

    public static float[] serializer(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static final int write(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "Element index ", " must be in range [");
        sbM.append(new ensureSubscribedToInAppMessageEventslambda7(0, list.size() - 1, 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public static final Collection write(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? (Collection) iterable : PlaybackStateCompat(iterable);
    }

    public static LinkedHashSet write(Iterable iterable, Iterable iterable2) {
        iterable2.getClass();
        Collection collectionWrite = write(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!collectionWrite.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static void write(List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size;
        list.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof displayInAppMessagelambda121) && !(list instanceof displayInAppMessagelambda12)) {
                pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{list, "kotlin.collections.MutableIterable"}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -1325843615, 1325843617, BehaviorSubject.BehaviorDisposable.write());
                throw null;
            }
            try {
                serializer((Iterable) list, r8lambdaunavo3sxub_pc9xroryotnrlvsm, true);
                return;
            } catch (ClassCastException e) {
                removeNodeAtDepth.RemoteActionCompatParcelizer(e, pauseWebviewIfNecessarylambda10.class.getName());
                throw e;
            }
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    public static boolean write(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return RemoteActionCompatParcelizer(iterable, obj) >= 0;
    }

    public static String IconCompatParcelizer(Iterable iterable, CharSequence charSequence, String str, String str2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        RemoteActionCompatParcelizer(iterable, sb, charSequence2, str3, str4, "...", r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        return sb.toString();
    }

    public static ArrayList RemoteActionCompatParcelizer(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(accessgetInstancedelegatecp.write(iterable, 10), accessgetInstancedelegatecp.write(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new onViewAttachedToWindowlambda0(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static List ResultReceiver(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList.add(new onViewAttachedToWindowlambda0(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static ArrayList RemoteActionCompatParcelizer(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object read(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static ArrayList serializer(Iterable iterable, Class cls) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean serializer(Iterable iterable, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static r8lambdaN7z0Ea2bnxePLVipqp_gDhWww read(Iterable iterable) {
        iterable.getClass();
        return new r8lambdaN7z0Ea2bnxePLVipqp_gDhWww(1, iterable);
    }

    public static Object IconCompatParcelizer(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        DrawableTransformation.write("List is empty.");
        return null;
    }

    public static List IconCompatParcelizer(int i, List list) {
        list.getClass();
        if (i < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return instance_delegatelambda0.write;
        }
        int size = list.size();
        if (i >= size) {
            return PlaybackStateCompat(list);
        }
        if (i == 1) {
            return androidx.sqlite.SQLite.IconCompatParcelizer(MediaDescriptionCompat(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List read(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return instance_delegatelambda0.write;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return PlaybackStateCompat(iterable);
            }
            if (i == 1) {
                return androidx.sqlite.SQLite.IconCompatParcelizer(IconCompatParcelizer(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return androidx.sqlite.SQLite.RemoteActionCompatParcelizer((List) arrayList);
    }

    public static HashSet write(ArrayList arrayList) {
        arrayList.getClass();
        HashSet hashSet = new HashSet(onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(arrayList, 12)));
        read((Iterable) arrayList, (AbstractCollection) hashSet);
        return hashSet;
    }

    public static Object serializer(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static List serializer(Iterable iterable, int i) {
        ArrayList arrayList;
        Object objMediaDescriptionCompat;
        iterable.getClass();
        if (i < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return PlaybackStateCompat(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return instance_delegatelambda0.write;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objMediaDescriptionCompat = MediaDescriptionCompat((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        DrawableTransformation.write("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objMediaDescriptionCompat = next;
                }
                return androidx.sqlite.SQLite.IconCompatParcelizer(objMediaDescriptionCompat);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return androidx.sqlite.SQLite.RemoteActionCompatParcelizer((List) arrayList);
    }

    public static /* synthetic */ void IconCompatParcelizer(List list, StringBuilder sb, Navigator$$ExternalSyntheticLambda1 navigator$$ExternalSyntheticLambda1, int i) {
        if ((i & 64) != 0) {
            navigator$$ExternalSyntheticLambda1 = null;
        }
        RemoteActionCompatParcelizer(list, sb, "\n", "", "", "...", navigator$$ExternalSyntheticLambda1);
    }

    public static ArrayList IconCompatParcelizer(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static boolean serializer(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return collection.addAll(listAsList);
    }

    public static Object read(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        DrawableTransformation.write("List is empty.");
        return null;
    }

    public static Object MediaMetadataCompat(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static ArrayList RemoteActionCompatParcelizer(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Comparable RatingCompat(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }
}
