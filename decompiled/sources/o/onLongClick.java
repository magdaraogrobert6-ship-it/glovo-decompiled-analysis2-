package o;

import com.roadrunner.auth.domain.GetIdVerificationLocationsImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onLongClick extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ GetIdVerificationLocationsImpl serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onLongClick(GetIdVerificationLocationsImpl getIdVerificationLocationsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getIdVerificationLocationsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            objInvoke = this.serializer.invoke(this);
            int i3 = 6 / 0;
        } else {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            objInvoke = this.serializer.invoke(this);
        }
        int i4 = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
