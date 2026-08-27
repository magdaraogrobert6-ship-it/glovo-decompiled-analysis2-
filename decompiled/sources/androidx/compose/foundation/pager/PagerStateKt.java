package androidx.compose.foundation.pager;

import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda1;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.YieldKt;
import o.BottomSheetScaffoldKtBottomSheetScaffoldLayout11;
import o.ForgottenCoroutineScopeException;
import o.Recomposerjoin2;
import o.SelectionHandleIcon;
import o.SnapshotStateKt__ProduceStateKtproduceState11;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getEventType;
import o.getPostalCode;
import o.onShowTranslationui;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class PagerStateKt {
    public static final PagerMeasureResult IconCompatParcelizer;
    public static final SnapshotStateKt__ProduceStateKtproduceState11 RemoteActionCompatParcelizer;
    public static final float serializer = Dp.m3673constructorimpl(56.0f);

    public static final ForgottenCoroutineScopeException read(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i2) {
        Object[] objArr = new Object[0];
        CardView$1 cardView$1 = ForgottenCoroutineScopeException.RemoteActionCompatParcelizer;
        boolean z = (((i2 & 14) ^ 6) > 4 && ((getPostalCode) getbirthdatefull).read(i)) || (i2 & 6) == 4;
        boolean z2 = (((i2 & 112) ^ 48) > 32 && ((getPostalCode) getbirthdatefull).serializer(0.0f)) || (i2 & 48) == 32;
        boolean z3 = (((i2 & 896) ^ 384) > 256 && ((getPostalCode) getbirthdatefull).read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) || (i2 & 384) == 256;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if ((z3 | z | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new ViewUtils$$ExternalSyntheticLambda1(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 1);
            getpostalcode.write(objComponentActivity);
        }
        ForgottenCoroutineScopeException forgottenCoroutineScopeException = (ForgottenCoroutineScopeException) getEventType.RemoteActionCompatParcelizer(objArr, cardView$1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 0);
        ((onShowTranslationui) forgottenCoroutineScopeException.write).setValue(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        return forgottenCoroutineScopeException;
    }

    static {
        SnapshotStateKt__ProduceStateKtproduceState11 snapshotStateKt__ProduceStateKtproduceState11 = new SnapshotStateKt__ProduceStateKtproduceState11();
        RemoteActionCompatParcelizer = snapshotStateKt__ProduceStateKtproduceState11;
        IconCompatParcelizer = new PagerMeasureResult(0, 0, 0, SelectionHandleIcon.Horizontal, 0, 0, 0, BottomSheetScaffoldKtBottomSheetScaffoldLayout11.read, new Recomposerjoin2(), YieldKt.RemoteActionCompatParcelizer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write), snapshotStateKt__ProduceStateKtproduceState11, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    public static final long serializer(PagerMeasureResult pagerMeasureResult, int i) {
        int i2 = pagerMeasureResult.ComponentActivity;
        int i3 = pagerMeasureResult.PlaybackStateCompatCustomAction;
        long j = i;
        long j2 = i2 + i3;
        int i4 = -pagerMeasureResult.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        long j3 = i4;
        int i5 = pagerMeasureResult.serializer;
        long j4 = i5;
        long j5 = i2;
        int iM96getViewportSizeYbymL2g = (int) (pagerMeasureResult.MediaSessionCompatToken == SelectionHandleIcon.Horizontal ? pagerMeasureResult.m96getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.m96getViewportSizeYbymL2g() & 4294967295L);
        long jRemoteActionCompatParcelizer = ((((j * j2) + j3) + j4) - j5) - ((long) (iM96getViewportSizeYbymL2g - RangesKt.RemoteActionCompatParcelizer(pagerMeasureResult.ResultReceiver.serializer(iM96getViewportSizeYbymL2g, i3, i4, i5), 0, iM96getViewportSizeYbymL2g)));
        if (jRemoteActionCompatParcelizer < 0) {
            return 0L;
        }
        return jRemoteActionCompatParcelizer;
    }
}
