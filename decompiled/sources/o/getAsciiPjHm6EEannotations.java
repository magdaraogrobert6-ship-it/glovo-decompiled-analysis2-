package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getAsciiPjHm6EEannotations extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ CrowdSourcingDataStore IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAsciiPjHm6EEannotations(CrowdSourcingDataStore crowdSourcingDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = crowdSourcingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.setHasPhotosTooltipShownLastAddress(null, this);
            obj2.hashCode();
            throw null;
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object hasPhotosTooltipShownLastAddress = this.IconCompatParcelizer.setHasPhotosTooltipShownLastAddress(null, this);
        int i3 = write + 113;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return hasPhotosTooltipShownLastAddress;
    }
}
