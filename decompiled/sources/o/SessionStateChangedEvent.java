package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionStateChangedEvent extends SdkDataWipeEvent {
    public static final Class read = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List write(long j, int i, Object obj) {
        List arrayList;
        List list = (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj);
        if (list.isEmpty()) {
            if (list instanceof SessionStateChangedEventChangeType) {
                arrayList = new getInAppMessage(i);
            } else {
                arrayList = ((list instanceof r8lambdaOpTmS30WMC3S0mRVScnf5WrDg) && (list instanceof onSuccess)) ? ((onSuccess) list).read(i) : new ArrayList(i);
            }
            SimpleValueCallback.serializer(j, obj, arrayList);
            return arrayList;
        }
        if (read.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            SimpleValueCallback.serializer(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof NoMatchingTriggerEvent) {
            NoMatchingTriggerEvent noMatchingTriggerEvent = (NoMatchingTriggerEvent) list;
            getInAppMessage getinappmessage = new getInAppMessage(noMatchingTriggerEvent.size() + i);
            getinappmessage.addAll(noMatchingTriggerEvent);
            SimpleValueCallback.serializer(j, obj, getinappmessage);
            return getinappmessage;
        }
        if ((list instanceof r8lambdaOpTmS30WMC3S0mRVScnf5WrDg) && (list instanceof onSuccess)) {
            onSuccess onsuccess = (onSuccess) list;
            if (!((InAppMessageEvent) onsuccess).read) {
                onSuccess onsuccess2 = onsuccess.read(list.size() + i);
                SimpleValueCallback.serializer(j, obj, onsuccess2);
                return onsuccess2;
            }
        }
        return list;
    }

    @Override // o.SdkDataWipeEvent
    public final List write(long j, Object obj) {
        return write(j, 10, obj);
    }

    @Override // o.SdkDataWipeEvent
    public final void IconCompatParcelizer(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj);
        if (list instanceof SessionStateChangedEventChangeType) {
            objUnmodifiableList = ((SessionStateChangedEventChangeType) list).IconCompatParcelizer();
        } else {
            if (read.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof r8lambdaOpTmS30WMC3S0mRVScnf5WrDg) && (list instanceof onSuccess)) {
                InAppMessageEvent inAppMessageEvent = (InAppMessageEvent) ((onSuccess) list);
                boolean z = inAppMessageEvent.read;
                if (z && z) {
                    inAppMessageEvent.read = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        SimpleValueCallback.serializer(j, obj, objUnmodifiableList);
    }

    @Override // o.SdkDataWipeEvent
    public final void read(long j, Object obj, Object obj2) {
        List list = (List) SimpleValueCallback.IconCompatParcelizer.MediaMetadataCompat(j, obj2);
        List listWrite = write(j, list.size(), obj);
        int size = listWrite.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listWrite.addAll(list);
        }
        if (size > 0) {
            list = listWrite;
        }
        SimpleValueCallback.serializer(j, obj, list);
    }
}
