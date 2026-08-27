package o;

import com.roadrunner.auth.data.SignInDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class bindViewHolder extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ SignInDataStore serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bindViewHolder(SignInDataStore signInDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = signInDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objInvoke$implementation;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            objInvoke$implementation = this.serializer.invoke$implementation(this);
            int i3 = 54 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            objInvoke$implementation = this.serializer.invoke$implementation(this);
        }
        int i4 = read + 5;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvoke$implementation;
        }
        throw null;
    }
}
