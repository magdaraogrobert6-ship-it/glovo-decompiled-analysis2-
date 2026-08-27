package o;

import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaHxE6sSkUDFbx2FiDxd81Y0EkMuU extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ N$b RemoteActionCompatParcelizer;
    public r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaHxE6sSkUDFbx2FiDxd81Y0EkMuU(N$b n$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = n$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return N$b.access$updateCache(this.RemoteActionCompatParcelizer, null, this);
        }
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 18 / 0;
        return N$b.access$updateCache(this.RemoteActionCompatParcelizer, null, this);
    }
}
