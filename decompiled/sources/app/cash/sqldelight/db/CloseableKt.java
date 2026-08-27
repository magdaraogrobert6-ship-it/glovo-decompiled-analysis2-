package app.cash.sqldelight.db;

import java.io.Closeable;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes4.dex */
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        try {
            R r = (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t);
            int i = sourceInformationContextOfdefault.read();
            int i2 = sourceInformationContextOfdefault.read();
            int i3 = sourceInformationContextOfdefault.read();
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{t, null}, i3);
            return r;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                int i4 = sourceInformationContextOfdefault.read();
                int i5 = sourceInformationContextOfdefault.read();
                int i6 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i4, i5, -871780639, sourceInformationContextOfdefault.read(), new Object[]{t, th}, i6);
                throw th2;
            }
        }
    }
}
