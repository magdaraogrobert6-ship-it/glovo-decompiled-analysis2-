package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.createFromParcel;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ee extends FunctionReferenceImpl implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        BrazeLogger.Priority priority = (BrazeLogger.Priority) obj2;
        String str2 = (String) obj3;
        str.getClass();
        priority.getClass();
        str2.getClass();
        ((ge) this.MediaMetadataCompat).a(str, priority, str2, (Throwable) obj4);
        return createFromParcel.INSTANCE;
    }

    public ee(ge geVar) {
        super(4, 0, ge.class, geVar, "log", "log$android_sdk_base_release(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/String;Ljava/lang/Throwable;)V");
    }
}
