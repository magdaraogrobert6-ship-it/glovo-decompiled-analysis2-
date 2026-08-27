package o;

import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class translategyyYBs extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ SignatureTaskUiModelImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public translategyyYBs(SignatureTaskUiModelImpl signatureTaskUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = signatureTaskUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.serializer.loadAnalytics$6(this);
        }
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        this.serializer.loadAnalytics$6(this);
        throw null;
    }
}
