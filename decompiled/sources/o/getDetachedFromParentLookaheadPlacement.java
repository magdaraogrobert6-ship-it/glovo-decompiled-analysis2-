package o;

import coil3.ComponentRegistry$Builder;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getDetachedFromParentLookaheadPlacement {
    public final accessgetPerformMeasureConstraintsp RemoteActionCompatParcelizer;
    public final ComponentRegistry$Builder serializer;

    public final void IconCompatParcelizer(String str) {
        accessgetPerformMeasureConstraintsp accessgetperformmeasureconstraintsp = this.RemoteActionCompatParcelizer;
        synchronized (accessgetperformmeasureconstraintsp) {
            if (!Objects.equals(accessgetperformmeasureconstraintsp.RemoteActionCompatParcelizer, str)) {
                accessgetPerformMeasureConstraintsp.IconCompatParcelizer(accessgetperformmeasureconstraintsp.IconCompatParcelizer, str, accessgetperformmeasureconstraintsp.serializer);
                accessgetperformmeasureconstraintsp.RemoteActionCompatParcelizer = str;
            }
        }
    }

    public getDetachedFromParentLookaheadPlacement(ComponentRegistry$Builder componentRegistry$Builder, androidx.work.impl.WorkerWrapper.Builder builder) {
        this.serializer = componentRegistry$Builder;
        this.RemoteActionCompatParcelizer = new accessgetPerformMeasureConstraintsp(builder);
    }
}
