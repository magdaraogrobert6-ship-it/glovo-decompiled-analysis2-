package o;

import com.roadrunner.helpcenter.businessmetrics.repo.BusinessMetricsRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class PreferencesSerializer extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public final /* synthetic */ BusinessMetricsRepository read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesSerializer(BusinessMetricsRepository businessMetricsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = businessMetricsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objPostEvents = this.read.postEvents(this);
        int i4 = serializer + 123;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objPostEvents;
        }
        throw null;
    }
}
