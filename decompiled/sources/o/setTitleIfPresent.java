package o;

import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "TripIdTracker")
public class setTitleIfPresent implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final com.sentiance.sdk.util.c IconCompatParcelizer;

    public final void IconCompatParcelizer(String str, long j) {
        synchronized (this) {
            for (String str2 : this.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
                if (this.IconCompatParcelizer.IconCompatParcelizer(str2, -1L) == j) {
                    write(str2);
                    break;
                }
            }
            this.IconCompatParcelizer.read(j, str);
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        synchronized (this) {
            this.IconCompatParcelizer.read();
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    public setTitleIfPresent(com.sentiance.sdk.util.c cVar) {
        this.IconCompatParcelizer = cVar;
    }

    public final LinkedHashMap<Long, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<Long, String> linkedHashMap;
        synchronized (this) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            com.sentiance.sdk.util.c cVar = this.IconCompatParcelizer;
            for (String str : cVar.RemoteActionCompatParcelizer()) {
                linkedHashMap2.put(Long.valueOf(cVar.IconCompatParcelizer(str, -1L)), str);
            }
            linkedHashMap = new LinkedHashMap<>(new TreeMap(linkedHashMap2));
        }
        return linkedHashMap;
    }

    public final void write(String str) {
        synchronized (this) {
            this.IconCompatParcelizer.read(str);
        }
    }
}
