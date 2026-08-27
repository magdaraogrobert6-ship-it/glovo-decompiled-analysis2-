package o;

import android.location.Location;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getMeasurementConstraintsmsEJaDk implements OuterPlacementScope, PinnableContainer, pin {
    public final ParentDataModifierDefaultImpls RemoteActionCompatParcelizer;

    public /* synthetic */ getMeasurementConstraintsmsEJaDk(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.RemoteActionCompatParcelizer = parentDataModifierDefaultImpls;
    }

    @Override // o.pin
    public void onCanceled() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.read();
    }

    @Override // o.OuterPlacementScope
    public /* synthetic */ Object then(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.RemoteActionCompatParcelizer;
        if (zIsSuccessful) {
            parentDataModifierDefaultImpls.write((Location) task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        parentDataModifierDefaultImpls.IconCompatParcelizer(exception);
        return null;
    }

    @Override // o.PinnableContainer
    public /* synthetic */ void onComplete(Task task) {
        if (task.isSuccessful()) {
            return;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(exception);
    }
}
