package o;

import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class containsProperty {
    public static List IconCompatParcelizer(ArrayList arrayList, boolean z) {
        List<addProperty> list;
        boolean zIsEmpty = arrayList.isEmpty();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (!zIsEmpty) {
            if (z) {
                if (arrayList.isEmpty()) {
                    list = arrayList;
                    list = instance_delegatelambda0Var;
                    break;
                }
                list = arrayList;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        list = arrayList;
                        list = instance_delegatelambda0Var;
                        break;
                    }
                    if (((addProperty) listIterator.previous()).read() != ClassifiedTransportMode.IDLE) {
                        list = onContentCardDismissed.read(arrayList, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = arrayList;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (addProperty addproperty : list) {
                arrayList2.add(new cleandefault(addproperty.write(), addproperty.IconCompatParcelizer(), addproperty.read()));
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                cleandefault cleandefaultVar = (cleandefault) onContentCardDismissed.read((List) arrayList2);
                for (cleandefault cleandefaultVar2 : onContentCardDismissed.serializer(arrayList2, 1)) {
                    if (cleandefaultVar.write() == cleandefaultVar2.write()) {
                        cleandefaultVar.RemoteActionCompatParcelizer(Math.max(cleandefaultVar.serializer(), cleandefaultVar2.serializer()));
                    } else {
                        arrayList3.add(cleandefaultVar);
                        cleandefaultVar = cleandefaultVar2;
                    }
                }
                arrayList3.add(cleandefaultVar);
                return arrayList3;
            }
        }
        return instance_delegatelambda0Var;
    }
}
