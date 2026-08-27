package o;

import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "CorrelationId")
public class getDismissalTimeMs implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final com.sentiance.sdk.util.c read;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.read.read();
    }

    public final int serializer() {
        int iWrite;
        synchronized (getDismissalTimeMs.class) {
            iWrite = this.read.write("id", 0);
            this.read.IconCompatParcelizer(iWrite + 1, "id");
        }
        return iWrite;
    }

    public getDismissalTimeMs(com.sentiance.sdk.util.c cVar) {
        this.read = cVar;
    }
}
