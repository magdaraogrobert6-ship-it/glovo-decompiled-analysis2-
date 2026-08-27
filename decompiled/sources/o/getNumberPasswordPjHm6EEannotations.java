package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getNumberPasswordPjHm6EEannotations extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public boolean RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ GetCrowdSourcingEntryPointScreenImpl serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNumberPasswordPjHm6EEannotations(GetCrowdSourcingEntryPointScreenImpl getCrowdSourcingEntryPointScreenImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getCrowdSourcingEntryPointScreenImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(false, false, this);
        int i4 = IconCompatParcelizer + 115;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return objInvoke;
    }
}
