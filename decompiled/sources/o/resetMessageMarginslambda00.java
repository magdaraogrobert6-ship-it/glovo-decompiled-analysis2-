package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class resetMessageMarginslambda00 implements Iterable, displayInAppMessagelambda121 {
    public static final resetMessageMarginslambda00 EMPTY = new resetMessageMarginslambda00(new String[0]);
    public final String[] namesAndValues;

    public final TreeMap IconCompatParcelizer() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            String strSerializer = serializer(i);
            java.util.Locale locale = java.util.Locale.US;
            locale.getClass();
            String lowerCase = strSerializer.toLowerCase(locale);
            lowerCase.getClass();
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(read(i));
        }
        return treeMap;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.namesAndValues.length / 2;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public final String serializer(int i) {
        String str = (String) onContentCardClicked.IconCompatParcelizer(i * 2, this.namesAndValues);
        if (str != null) {
            return str;
        }
        DrawableTransformation.read(m1$$ExternalSyntheticOutline0.m("name[", i, ']'));
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            String strSerializer = serializer(i);
            String str = read(i);
            sb.append(strSerializer);
            sb.append(": ");
            if (InAppMessageHtmlBaseViewCompanion.read(strSerializer)) {
                str = "██";
            }
            sb.append(str);
            sb.append("\n");
        }
        return sb.toString();
    }

    public final Set write() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            treeSet.add(serializer(i));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    public resetMessageMarginslambda00(String[] strArr) {
        strArr.getClass();
        this.namesAndValues = strArr;
    }

    public final List serializer(String str) {
        str.getClass();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            if (str.equalsIgnoreCase(serializer(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(read(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? instance_delegatelambda0.write : listUnmodifiableList;
    }

    public final String write(String str) {
        str.getClass();
        String[] strArr = this.namesAndValues;
        strArr.getClass();
        int length = strArr.length - 2;
        int i = TuplesKt.read(length, 0, -2);
        if (i > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == i) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof resetMessageMarginslambda00) {
            return Arrays.equals(this.namesAndValues, ((resetMessageMarginslambda00) obj).namesAndValues);
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = new onViewAttachedToWindowlambda0[iRemoteActionCompatParcelizer];
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            onviewattachedtowindowlambda0Arr[i] = new onViewAttachedToWindowlambda0(serializer(i), read(i));
        }
        return new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(onviewattachedtowindowlambda0Arr);
    }

    public final String read(int i) {
        String str = (String) onContentCardClicked.IconCompatParcelizer((i * 2) + 1, this.namesAndValues);
        if (str != null) {
            return str;
        }
        DrawableTransformation.read(m1$$ExternalSyntheticOutline0.m("value[", i, ']'));
        return null;
    }

    public final applyDisplayCutoutMarginsToContentArealambda0 serializer() {
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
        onContentCardDismissed.serializer(applydisplaycutoutmarginstocontentarealambda0.write, this.namesAndValues);
        return applydisplaycutoutmarginstocontentarealambda0;
    }
}
