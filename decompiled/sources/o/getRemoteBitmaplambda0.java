package o;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi$Lookup;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getRemoteBitmaplambda0 {
    public final /* synthetic */ getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations RemoteActionCompatParcelizer;
    public boolean serializer;
    public final ArrayList IconCompatParcelizer = new ArrayList();
    public final ArrayDeque write = new ArrayDeque();

    public final void read(boolean z) {
        this.write.removeLast();
        if (this.write.isEmpty()) {
            this.RemoteActionCompatParcelizer.write.remove();
            if (z) {
                synchronized (this.RemoteActionCompatParcelizer.IconCompatParcelizer) {
                    int size = this.IconCompatParcelizer.size();
                    for (int i = 0; i < size; i++) {
                        Moshi$Lookup moshi$Lookup = (Moshi$Lookup) this.IconCompatParcelizer.get(i);
                        JsonAdapter jsonAdapter = (JsonAdapter) this.RemoteActionCompatParcelizer.IconCompatParcelizer.put(moshi$Lookup.IconCompatParcelizer, moshi$Lookup.read);
                        if (jsonAdapter != null) {
                            moshi$Lookup.read = jsonAdapter;
                            this.RemoteActionCompatParcelizer.IconCompatParcelizer.put(moshi$Lookup.IconCompatParcelizer, jsonAdapter);
                        }
                    }
                }
            }
        }
    }

    public getRemoteBitmaplambda0(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        this.RemoteActionCompatParcelizer = getruntime_memory_image_loader_usage_quotientannotations;
    }

    public final IllegalArgumentException serializer(IllegalArgumentException illegalArgumentException) {
        if (!this.serializer) {
            this.serializer = true;
            ArrayDeque arrayDeque = this.write;
            if (arrayDeque.size() != 1 || ((Moshi$Lookup) arrayDeque.getFirst()).write != null) {
                StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    Moshi$Lookup moshi$Lookup = (Moshi$Lookup) itDescendingIterator.next();
                    sb.append("\nfor ");
                    Type type = moshi$Lookup.RemoteActionCompatParcelizer;
                    String str = moshi$Lookup.write;
                    sb.append(type);
                    if (str != null) {
                        sb.append(' ');
                        sb.append(str);
                    }
                }
                return new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }
}
