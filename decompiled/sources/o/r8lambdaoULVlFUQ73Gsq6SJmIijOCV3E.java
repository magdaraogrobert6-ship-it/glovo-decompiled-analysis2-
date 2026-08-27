package o;

import com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaoULVlFUQ73Gsq6SJmIijOCV3E extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ GetNestScope$invoke$$inlined$map$1.AnonymousClass2 IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaoULVlFUQ73Gsq6SJmIijOCV3E(GetNestScope$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEmit;
        int i = 2 % 2;
        int i2 = read + 89;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit((Object) null, this);
            int i3 = 29 / 0;
        } else {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit((Object) null, this);
        }
        int i4 = RemoteActionCompatParcelizer + 115;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
