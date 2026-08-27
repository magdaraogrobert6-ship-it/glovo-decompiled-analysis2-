package o;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DefaultContentCardsViewBindingHandlerWhenMappings extends AbstractMap implements Map, displayInAppMessagelambda120 {
    public abstract /* bridge */ Collection MediaSessionCompatQueueItem();

    public abstract /* bridge */ Set RemoteActionCompatParcelizer();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return write();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return RemoteActionCompatParcelizer();
    }

    public abstract /* bridge */ int read();

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return read();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return MediaSessionCompatQueueItem();
    }

    public abstract Set write();
}
