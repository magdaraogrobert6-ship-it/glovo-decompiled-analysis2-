package o;

import com.roadrunner.delivery.accept.acceptbutton.presentation.GetAcceptDetails;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TextIndentSaverlambda0 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ GetAcceptDetails RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextIndentSaverlambda0(GetAcceptDetails getAcceptDetails, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getAcceptDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objInvoke = this.RemoteActionCompatParcelizer.invoke(this);
        int i4 = read + 125;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
