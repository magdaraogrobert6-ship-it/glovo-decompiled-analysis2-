package o;

import java.time.Instant;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class VerbatimTtsAnnotationSaverlambda0 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    public static final VerbatimTtsAnnotationSaverlambda0 read = new VerbatimTtsAnnotationSaverlambda0(0, Instant.class, "now", "now()Ljava/time/Instant;", 0);
    private static int serializer;
    private static int write;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Instant.now();
        }
        Instant.now();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = RemoteActionCompatParcelizer + 41;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public VerbatimTtsAnnotationSaverlambda0(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
