package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class NullableInputConnectionWrapper_androidKt {
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(InputConnection inputConnection, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return Build.VERSION.SDK_INT >= 34 ? new NullableInputConnectionWrapperApi34(inputConnection, r8lambdaunavo3sxub_pc9xroryotnrlvsm) : new NullableInputConnectionWrapperApi25(inputConnection, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
