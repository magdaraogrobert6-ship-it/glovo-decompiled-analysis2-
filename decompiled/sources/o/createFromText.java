package o;

import android.os.MessageQueue;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import io.sentry.android.core.performance.AppStartMetrics;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class createFromText implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ createFromText(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        if (i == 0) {
            r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) this.RemoteActionCompatParcelizer;
            Object obj2 = r8lambdalmkbrrgswwtv97obrsj7trj7ai.write;
            CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.write;
            synchronized (obj2) {
                ((ArrayList) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).remove(cancellableContinuationImpl);
            }
            return createFromParcel.INSTANCE;
        }
        boolean z = true;
        if (i == 1) {
            android.view.KeyEvent keyEventM1890unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m1890unboximpl();
            if (((androidx.compose.foundation.text.LegacyTextFieldState) this.RemoteActionCompatParcelizer).IconCompatParcelizer() == alignKFBX0sM.Selection && keyEventM1890unboximpl.getKeyCode() == 4 && androidx.compose.ui.input.key.KeyEventType.m1894equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m1902getTypeZmokQxo(keyEventM1890unboximpl), androidx.compose.ui.input.key.KeyEventType.Companion.m1899getKeyUpCS__XNY())) {
                ((androidx.compose.foundation.text.selection.TextFieldSelectionManager) this.write).write((androidx.compose.ui.geometry.Offset) null);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (i == 2) {
            int iIntValue = ((Number) obj).intValue();
            return ((ScrollState$$ExternalSyntheticLambda3) this.RemoteActionCompatParcelizer).invoke(Integer.valueOf(iIntValue), ((List) this.write).get(iIntValue));
        }
        if (i != 3) {
            ((MessageQueue) this.RemoteActionCompatParcelizer).removeIdleHandler((AppStartMetrics.AnonymousClass2) this.write);
            return createFromParcel.INSTANCE;
        }
        int iIntValue2 = ((Number) obj).intValue();
        return ((DefaultContentCardView) this.RemoteActionCompatParcelizer).invoke(Integer.valueOf(iIntValue2), ((List) this.write).get(iIntValue2));
    }
}
