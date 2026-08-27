package o;

import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "GeofenceStateResetTracker")
public class setContentText implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final com.sentiance.sdk.util.c write;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.write.read();
    }

    public setContentText(com.sentiance.sdk.util.c cVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.write = cVar;
    }
}
