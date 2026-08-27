package io.sentry.okhttp;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class write extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int read;
    public final /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ write(long j, int i) {
        super(1);
        this.read = i;
        this.write = j;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        long j = this.write;
        if (i != 0) {
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.getClass();
            if (j > 0) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Long.valueOf(j), "http.response_content_length");
            }
            return createfromparcel;
        }
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
        r8lambdareqvhj3p9oule_afn8an0r0tlg1.getClass();
        if (j > 0) {
            r8lambdareqvhj3p9oule_afn8an0r0tlg1.read(Long.valueOf(j), "http.request_content_length");
        }
        return createfromparcel;
    }
}
