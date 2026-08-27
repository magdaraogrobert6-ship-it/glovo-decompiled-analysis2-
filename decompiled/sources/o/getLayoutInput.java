package o;

import com.roadrunner.delivery.accept.backToBackOrder.presentation.BackToBackAutoAcceptUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getLayoutInput extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ BackToBackAutoAcceptUiModelImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLayoutInput(BackToBackAutoAcceptUiModelImpl backToBackAutoAcceptUiModelImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = backToBackAutoAcceptUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 87;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objAccess$autoAcceptDeliveryIfEnabled = BackToBackAutoAcceptUiModelImpl.access$autoAcceptDeliveryIfEnabled(this.serializer, this);
        int i4 = MediaSessionCompatQueueItem + 103;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$autoAcceptDeliveryIfEnabled;
        }
        throw null;
    }
}
