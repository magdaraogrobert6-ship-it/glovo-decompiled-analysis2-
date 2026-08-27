package o;

import com.google.firebase.sessions.InstallationId$Companion;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeViewdragAndDropManager1 extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ InstallationId$Companion RemoteActionCompatParcelizer;
    public Object read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewdragAndDropManager1(InstallationId$Companion installationId$Companion, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = installationId$Companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.create(null, this);
    }
}
