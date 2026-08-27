package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getNumberPjHm6EEannotations extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ CrowdSourcingDataStore read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNumberPjHm6EEannotations(CrowdSourcingDataStore crowdSourcingDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = crowdSourcingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object existingPhotosTooltipShownCount = this.read.setExistingPhotosTooltipShownCount(0, this);
        int i4 = write + 83;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return existingPhotosTooltipShownCount;
        }
        throw null;
    }
}
