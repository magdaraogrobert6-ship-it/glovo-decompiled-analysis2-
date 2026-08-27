package o;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class requestFocusCurrent {
    public final coil3.memory.MemoryCacheService IconCompatParcelizer;
    public final String serializer;

    public static String write(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            removeDelayedExecution removedelayedexecution = (removeDelayedExecution) it.next();
            sb.append(removedelayedexecution.serializer);
            sb.append('/');
            sb.append(removedelayedexecution.IconCompatParcelizer);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String read() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        coil3.memory.MemoryCacheService memoryCacheService = this.IconCompatParcelizer;
        synchronized (((HashSet) memoryCacheService.RemoteActionCompatParcelizer)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) memoryCacheService.RemoteActionCompatParcelizer);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.serializer;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) memoryCacheService.RemoteActionCompatParcelizer)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) memoryCacheService.RemoteActionCompatParcelizer);
        }
        sb.append(write(setUnmodifiableSet2));
        return sb.toString();
    }

    public requestFocusCurrent(Set set, coil3.memory.MemoryCacheService memoryCacheService) {
        this.serializer = write(set);
        this.IconCompatParcelizer = memoryCacheService;
    }
}
