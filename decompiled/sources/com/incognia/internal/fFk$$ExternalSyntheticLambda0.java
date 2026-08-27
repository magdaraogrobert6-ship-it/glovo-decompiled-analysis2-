package com.incognia.internal;

import android.view.Choreographer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fFk$$ExternalSyntheticLambda0 implements Executor {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ fFk$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = 2 % 2;
        int i2 = read + 13;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        Object obj = this.f$0;
        if (i4 != 0) {
            if (i4 != 1) {
                ((Executor) obj).execute(new Sentry$$ExternalSyntheticLambda5(14, runnable));
                return;
            } else {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$0((Choreographer) obj, runnable);
                return;
            }
        }
        fFk.BGx((UsU) obj, runnable);
        int i5 = serializer + 85;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
