package o;

import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.domain.usecase.ObservableUseCase;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;

/* JADX INFO: loaded from: classes3.dex */
public final class getViewToWindowMatrix3i98HWw extends ObservableUseCase {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final forEachNewCallbackNeverInvoked read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getViewToWindowMatrix3i98HWw(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, forEachNewCallbackNeverInvoked foreachnewcallbackneverinvoked) {
        super(((com.data.util.AndroidScheduleProvider) getpivotoffsetf1c5bw0).IconCompatParcelizer());
        getpivotoffsetf1c5bw0.getClass();
        foreachnewcallbackneverinvoked.getClass();
        this.read = foreachnewcallbackneverinvoked;
    }

    @Override // com.roadrunner.domain.usecase.ObservableUseCase
    public final Flowable write(Object obj) {
        int i = 2 % 2;
        int i2 = write + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((createFromParcel) obj).getClass();
        Flowable flowableSerializer = ((CustomerChatProviderImpl) this.read).serializer.IconCompatParcelizer.serializer(BackpressureStrategy.LATEST);
        int i4 = RemoteActionCompatParcelizer + 3;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return flowableSerializer;
    }
}
