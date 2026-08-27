package o;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetRecreateDisplayListcp implements Serializable, Comparator {
    public final /* synthetic */ int read;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.read != 0 ? (int) (((File) obj).lastModified() - ((File) obj2).lastModified()) : ((Integer) ((Map.Entry) obj).getValue()).intValue() - ((Integer) ((Map.Entry) obj2).getValue()).intValue();
    }
}
