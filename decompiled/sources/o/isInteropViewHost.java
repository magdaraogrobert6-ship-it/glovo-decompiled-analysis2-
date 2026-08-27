package o;

import android.text.PrecomputedText;
import android.widget.TextView;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;

/* JADX INFO: loaded from: classes.dex */
public abstract class isInteropViewHost {
    public static void IconCompatParcelizer(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static PrecomputedText.Params RemoteActionCompatParcelizer(androidx.appcompat.widget.AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static final Object RemoteActionCompatParcelizer(Object obj, r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx4) {
        Object objB_ = r8lambdahgodiqgpbyai8pyonaxx8pbqx4.b_(obj);
        if (objB_ instanceof resolveUnregisterDisplayedMessagelambda0) {
            return ((logUnregisterActivity) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new RxConvertKt$asObservable$1$job$1(r8lambdahgodiqgpbyai8pyonaxx8pbqx4, obj, null, 6))).RemoteActionCompatParcelizer;
        }
        return createFromParcel.INSTANCE;
    }
}
