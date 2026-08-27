package o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicReference;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getInvalidateListenerui {
    public static final ConcurrentHashMap write = new ConcurrentHashMap();
    public static final ConcurrentLinkedDeque serializer = new ConcurrentLinkedDeque();
    public static final String IconCompatParcelizer = "Performance-SPMC";
    public static final AtomicReference read = new AtomicReference(null);

    public static GroupComponent read(String str) {
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(IconCompatParcelizer);
        serializer.remove(str);
        GroupComponent groupComponent = (GroupComponent) write.remove(str);
        return groupComponent == null ? new GroupComponent() : groupComponent;
    }

    public static GroupComponent serializer(String str) {
        ConcurrentHashMap concurrentHashMap = write;
        GroupComponent groupComponent = (GroupComponent) concurrentHashMap.get(str);
        ConcurrentLinkedDeque concurrentLinkedDeque = serializer;
        if (groupComponent != null) {
            concurrentLinkedDeque.remove(str);
            concurrentLinkedDeque.addLast(str);
            return groupComponent;
        }
        GroupComponent groupComponent2 = new GroupComponent();
        GroupComponent groupComponent3 = (GroupComponent) concurrentHashMap.putIfAbsent(str, groupComponent2);
        if (groupComponent3 == null) {
            groupComponent3 = groupComponent2;
        }
        if (groupComponent3 == groupComponent2) {
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.RemoteActionCompatParcelizer(IconCompatParcelizer);
            forest.read("Screen was not active: ".concat(str), new Object[0]);
        }
        concurrentLinkedDeque.remove(str);
        concurrentLinkedDeque.addLast(str);
        write();
        return groupComponent3;
    }

    public static void write() {
        String str;
        while (true) {
            ConcurrentHashMap concurrentHashMap = write;
            if (concurrentHashMap.size() <= 64 || (str = (String) serializer.pollFirst()) == null) {
                return;
            }
            if (concurrentHashMap.remove(str) != null) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.RemoteActionCompatParcelizer(IconCompatParcelizer);
                forest.RemoteActionCompatParcelizer("Evicted metadata for " + str + " after reaching max tracked screens: 64.", new Object[0]);
            }
        }
    }

    public static void RemoteActionCompatParcelizer(String str, String str2, String str3) {
        str3.getClass();
        GroupComponent groupComponentSerializer = serializer(str);
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        String str4 = IconCompatParcelizer;
        forest.RemoteActionCompatParcelizer(str4);
        Map map = groupComponentSerializer.write;
        if (map.containsKey(str2) || map.size() < 32) {
            map.put(str2, str3);
            return;
        }
        forest.RemoteActionCompatParcelizer(str4);
        forest.RemoteActionCompatParcelizer("Attribute dropped for " + str + ". Maximum attribute count reached (32).", new Object[0]);
    }

    public static void RemoteActionCompatParcelizer(String str, String str2, markNotTintable marknottintable) {
        GroupComponent groupComponentSerializer = serializer(str);
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        String str3 = IconCompatParcelizer;
        forest.RemoteActionCompatParcelizer(str3);
        marknottintable.toString();
        Map map = groupComponentSerializer.RemoteActionCompatParcelizer;
        if (map.containsKey(str2) || map.size() < 32) {
            map.put(str2, marknottintable);
            return;
        }
        forest.RemoteActionCompatParcelizer(str3);
        forest.RemoteActionCompatParcelizer("Metric dropped for " + str + ". Maximum metric count reached (32).", new Object[0]);
    }

    public static void write(String str, String str2, long j, AndroidShadowContext_androidKt androidShadowContext_androidKt) {
        androidShadowContext_androidKt.getClass();
        RemoteActionCompatParcelizer(str, str2, new markNotTintable(j, androidShadowContext_androidKt, 2));
    }
}
