package bo.app;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l6 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        s9 s9Var = (s9) obj;
        s9Var.getClass();
        ((o6) this.MediaMetadataCompat).a(s9Var);
        return createFromParcel.INSTANCE;
    }

    public l6(o6 o6Var) {
        super(1, 0, o6.class, o6Var, "ingestDustMessages", "ingestDustMessages$android_sdk_base_release(Lcom/braze/models/dust/IDustMessage;)V");
    }
}
