package o;

import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class setClockTime {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final getInitial RemoteActionCompatParcelizer;

    public setClockTime(getInitial getinitial) {
        this.RemoteActionCompatParcelizer = getinitial;
    }

    public final CustomerUnavailableTaskUiModelImpl write(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str) {
        int i = 2 % 2;
        getInitial getinitial = this.RemoteActionCompatParcelizer;
        CustomerUnavailableTaskUiModelImpl customerUnavailableTaskUiModelImpl = new CustomerUnavailableTaskUiModelImpl(fastfilternotnull, contextScope, str, (ObserveTaskByTypeAndIdUseCaseImpl) getinitial.read.write(), (UpdateTaskUseCaseImpl) getinitial.IconCompatParcelizer.write(), (GetDeliveryAnalyticsUseCaseImpl) getinitial.write.write(), (DeliveryConfirmationLoggerImpl) getinitial.RemoteActionCompatParcelizer.write(), new getQueryContext());
        int i2 = IconCompatParcelizer + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return customerUnavailableTaskUiModelImpl;
        }
        throw null;
    }
}
