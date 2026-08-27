package o;

import coil3.ComponentRegistry$Builder;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.logger.QrPaymentEventLoggerImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getRightD9Ej5fM {
    private static int read = 1;
    private static int write;
    public final ComponentRegistry$Builder RemoteActionCompatParcelizer;

    public getRightD9Ej5fM(ComponentRegistry$Builder componentRegistry$Builder) {
        this.RemoteActionCompatParcelizer = componentRegistry$Builder;
    }

    public final getTopD9Ej5fMannotations write(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str) {
        int i = 2 % 2;
        getQueryContext getquerycontext = new getQueryContext();
        ComponentRegistry$Builder componentRegistry$Builder = this.RemoteActionCompatParcelizer;
        getTopD9Ej5fMannotations gettopd9ej5fmannotations = new getTopD9Ej5fMannotations(fastfilternotnull, contextScope, str, getquerycontext, (ObserveTaskByTypeAndIdUseCaseImpl) ((mergeJsonObjects) componentRegistry$Builder.write).write(), (openSessionlambda1) ((mergeJsonObjects) componentRegistry$Builder.read).write(), (getTransition) ((mergeJsonObjects) componentRegistry$Builder.RemoteActionCompatParcelizer).write(), (UpdateTaskUseCaseImpl) ((mergeJsonObjects) componentRegistry$Builder.IconCompatParcelizer).write(), (QrPaymentEventLoggerImpl) ((SingleProcessDataStore) componentRegistry$Builder.serializer).write());
        int i2 = read + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return gettopd9ej5fmannotations;
    }
}
