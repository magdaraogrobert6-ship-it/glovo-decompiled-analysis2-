package o;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda7;
import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes4.dex */
public abstract class createInAppMessageViewlambda4 {
    public static final r8lambdaPweFfQiLzCPuvCWzjqSNqC0XmQ IconCompatParcelizer;
    public static final IInAppMessageManagerListener RemoteActionCompatParcelizer;
    public static final r8lambdaPweFfQiLzCPuvCWzjqSNqC0XmQ read;
    public static final IInAppMessageManagerListener write;

    static {
        IInAppMessageManagerListener networkBody;
        IInAppMessageManagerListener networkBody2;
        r8lambdaPweFfQiLzCPuvCWzjqSNqC0XmQ r8lambda1mnczrzuv4owduwgkg6cjtsws;
        r8lambdaPweFfQiLzCPuvCWzjqSNqC0XmQ r8lambda1mnczrzuv4owduwgkg6cjtsws2;
        r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA r8lambdahim_4jaoe8vonlz8t21eanaofaa = new r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA(5);
        boolean z = beforeInAppMessageDisplayed.IconCompatParcelizer;
        if (z) {
            networkBody = new r8lambda0NrUAFr6FSGQwee9yxeQTRHkVvA(r8lambdahim_4jaoe8vonlz8t21eanaofaa);
        } else {
            networkBody = new NetworkBody(r8lambdahim_4jaoe8vonlz8t21eanaofaa);
        }
        RemoteActionCompatParcelizer = networkBody;
        r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA r8lambdahim_4jaoe8vonlz8t21eanaofaa2 = new r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA(6);
        if (z) {
            networkBody2 = new r8lambda0NrUAFr6FSGQwee9yxeQTRHkVvA(r8lambdahim_4jaoe8vonlz8t21eanaofaa2);
        } else {
            networkBody2 = new NetworkBody(r8lambdahim_4jaoe8vonlz8t21eanaofaa2);
        }
        write = networkBody2;
        SaversKt$$ExternalSyntheticLambda7 saversKt$$ExternalSyntheticLambda7 = new SaversKt$$ExternalSyntheticLambda7(8);
        if (z) {
            r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda0NrUAFr6FSGQwee9yxeQTRHkVvA(saversKt$$ExternalSyntheticLambda7);
        } else {
            r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs(saversKt$$ExternalSyntheticLambda7);
        }
        IconCompatParcelizer = r8lambda1mnczrzuv4owduwgkg6cjtsws;
        SaversKt$$ExternalSyntheticLambda7 saversKt$$ExternalSyntheticLambda8 = new SaversKt$$ExternalSyntheticLambda7(9);
        if (z) {
            r8lambda1mnczrzuv4owduwgkg6cjtsws2 = new r8lambda0NrUAFr6FSGQwee9yxeQTRHkVvA(saversKt$$ExternalSyntheticLambda8);
        } else {
            r8lambda1mnczrzuv4owduwgkg6cjtsws2 = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs(saversKt$$ExternalSyntheticLambda8);
        }
        read = r8lambda1mnczrzuv4owduwgkg6cjtsws2;
    }
}
