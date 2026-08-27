package o;

import com.google.firebase.sessions.SharedSessionRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class EditCommandKt extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCommandKt(SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2 anonymousClass2;
        boolean z;
        int i = 2 % 2;
        int i2 = serializer + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            anonymousClass2 = this.write;
            z = true;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            anonymousClass2 = this.write;
            z = false;
        }
        return anonymousClass2.emit(z, this);
    }
}
