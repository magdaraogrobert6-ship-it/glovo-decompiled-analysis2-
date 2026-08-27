package com.roadrunner.networking.core.factory;

import androidx.compose.ui.graphics.Fields;
import com.google.re2j.Parser;
import com.roadrunner.common.data.api.MapApiError;
import io.reactivex.Flowable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.completable.CompletableError;
import io.reactivex.internal.operators.flowable.FlowableError;
import io.reactivex.internal.operators.maybe.MaybeError;
import io.reactivex.internal.operators.observable.ObservableError;
import io.reactivex.internal.operators.single.SingleError;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Parser.Pair RemoteActionCompatParcelizer;

    public /* synthetic */ RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper$$ExternalSyntheticLambda0(Parser.Pair pair, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = pair;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 23;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        Parser.Pair pair = this.RemoteActionCompatParcelizer;
        Throwable th = (Throwable) obj;
        if (i3 == 0) {
            th.getClass();
            Throwable thRemoteActionCompatParcelizer = ((MapApiError) pair.write).RemoteActionCompatParcelizer(th);
            int i4 = Flowable.write;
            FlowableError flowableError = new FlowableError(Functions.RemoteActionCompatParcelizer(thRemoteActionCompatParcelizer));
            int i5 = serializer + 51;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return flowableError;
        }
        if (i3 == 1) {
            th.getClass();
            return new SingleError(Functions.RemoteActionCompatParcelizer(((MapApiError) pair.write).RemoteActionCompatParcelizer(th)));
        }
        if (i3 == 2) {
            th.getClass();
            return new MaybeError(((MapApiError) pair.write).RemoteActionCompatParcelizer(th));
        }
        if (i3 != 3) {
            th.getClass();
            return new ObservableError(Functions.RemoteActionCompatParcelizer(((MapApiError) pair.write).RemoteActionCompatParcelizer(th)));
        }
        th.getClass();
        return new CompletableError(((MapApiError) pair.write).RemoteActionCompatParcelizer(th));
    }
}
