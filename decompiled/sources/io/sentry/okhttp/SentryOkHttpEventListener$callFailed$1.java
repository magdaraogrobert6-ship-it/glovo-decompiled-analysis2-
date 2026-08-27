package io.sentry.okhttp;

import com.mapbox.search.adapter.BaseSearchCallbackAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.defaultCardHandlinglambda0;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryOkHttpEventListener$callFailed$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int read;
    public final /* synthetic */ IOException serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SentryOkHttpEventListener$callFailed$1(int i, IOException iOException) {
        super(1);
        this.read = i;
        this.serializer = iOException;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        IOException iOException = this.serializer;
        if (i == 0) {
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.getClass();
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(defaultCardHandlinglambda0.INTERNAL_ERROR);
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.RemoteActionCompatParcelizer(iOException);
            return createfromparcel;
        }
        if (i == 1) {
            BaseSearchCallbackAdapter baseSearchCallbackAdapter = (BaseSearchCallbackAdapter) obj;
            baseSearchCallbackAdapter.getClass();
            baseSearchCallbackAdapter.onError(iOException);
            return createfromparcel;
        }
        if (i == 2) {
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
            r8lambdareqvhj3p9oule_afn8an0r0tlg1.getClass();
            if (!r8lambdareqvhj3p9oule_afn8an0r0tlg1.MediaDescriptionCompat()) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg1.read(defaultCardHandlinglambda0.INTERNAL_ERROR);
                r8lambdareqvhj3p9oule_afn8an0r0tlg1.RemoteActionCompatParcelizer(iOException);
            }
            return createfromparcel;
        }
        if (i == 3) {
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg2 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
            r8lambdareqvhj3p9oule_afn8an0r0tlg2.getClass();
            r8lambdareqvhj3p9oule_afn8an0r0tlg2.read(defaultCardHandlinglambda0.INTERNAL_ERROR);
            r8lambdareqvhj3p9oule_afn8an0r0tlg2.RemoteActionCompatParcelizer(iOException);
            return createfromparcel;
        }
        if (i != 4) {
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg3 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
            r8lambdareqvhj3p9oule_afn8an0r0tlg3.getClass();
            r8lambdareqvhj3p9oule_afn8an0r0tlg3.read(defaultCardHandlinglambda0.INTERNAL_ERROR);
            r8lambdareqvhj3p9oule_afn8an0r0tlg3.RemoteActionCompatParcelizer(iOException);
            return createfromparcel;
        }
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg4 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
        r8lambdareqvhj3p9oule_afn8an0r0tlg4.getClass();
        if (!r8lambdareqvhj3p9oule_afn8an0r0tlg4.MediaDescriptionCompat()) {
            r8lambdareqvhj3p9oule_afn8an0r0tlg4.read(defaultCardHandlinglambda0.INTERNAL_ERROR);
            r8lambdareqvhj3p9oule_afn8an0r0tlg4.RemoteActionCompatParcelizer(iOException);
        }
        return createfromparcel;
    }
}
