package o;

import com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.DatePickerTaskUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class createTransitionInfolambda5 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ DatePickerTaskUiModelImpl read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createTransitionInfolambda5(DatePickerTaskUiModelImpl datePickerTaskUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = datePickerTaskUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            return DatePickerTaskUiModelImpl.access$loadAnalytics(this.read, this);
        }
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        DatePickerTaskUiModelImpl.access$loadAnalytics(this.read, this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
