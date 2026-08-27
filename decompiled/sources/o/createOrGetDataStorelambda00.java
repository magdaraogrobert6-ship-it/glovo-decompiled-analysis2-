package o;

import android.content.Context;
import com.sentiance.sdk.task.TaskManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class createOrGetDataStorelambda00 {
    public abstract accesssetEventPublishercp RemoteActionCompatParcelizer();

    public abstract boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract boolean read(Context context);

    public boolean z_() {
        return !(this instanceof requestSingleLocationUpdateFromGooglePlaylambda4);
    }

    public final void serializer(boolean z) {
        ((TaskManager) setPushUniqueId.read(TaskManager.class)).serializer(this, z);
    }

    public final int hashCode() {
        return getClass().hashCode();
    }
}
