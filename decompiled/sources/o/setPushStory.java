package o;

import o.setPushStoryPageIndex;

/* JADX INFO: loaded from: classes3.dex */
public class setPushStory<T extends setPushStoryPageIndex> {
    private final Class<T> write;

    public final T write() {
        T t;
        synchronized (this) {
            t = (T) setPushUniqueId.read(this.write);
        }
        return t;
    }

    public setPushStory(Class<T> cls) {
        this.write = cls;
    }
}
