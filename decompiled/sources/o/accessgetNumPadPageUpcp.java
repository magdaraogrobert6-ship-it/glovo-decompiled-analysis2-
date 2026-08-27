package o;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetNumPadPageUpcp {
    public final boolean IconCompatParcelizer;
    public final int serializer;
    public final Feature[] write;

    public abstract void serializer(accessgetScp accessgetscp, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls);

    public static TaskApiCall$Builder IconCompatParcelizer() {
        TaskApiCall$Builder taskApiCall$Builder = new TaskApiCall$Builder();
        taskApiCall$Builder.serializer = false;
        taskApiCall$Builder.IconCompatParcelizer = false;
        taskApiCall$Builder.write = 0;
        return taskApiCall$Builder;
    }

    public accessgetNumPadPageUpcp(Feature[] featureArr, boolean z, int i) {
        this.write = featureArr;
        this.IconCompatParcelizer = featureArr != null && z;
        this.serializer = i;
    }

    public accessgetNumPadPageUpcp() {
        this.write = null;
        this.IconCompatParcelizer = false;
        this.serializer = 0;
    }
}
