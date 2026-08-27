package o;

import androidx.compose.foundation.pager.PagerState$scrollToPage$2;
import bo.app.ff$$ExternalSyntheticOutline0;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SnackbarTokens implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ SheetBottomTokens RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ SnackbarTokens(SheetBottomTokens sheetBottomTokens, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = sheetBottomTokens;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        SheetBottomTokens sheetBottomTokens = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            onRelease onrelease = (onRelease) sheetBottomTokens.write.invoke();
            int iSerializer = onrelease.serializer();
            int i2 = 0;
            while (i2 < iSerializer) {
                if (onrelease.write(i2).equals(obj)) {
                    return Integer.valueOf(i2);
                }
                i2++;
            }
            i2 = -1;
            return Integer.valueOf(i2);
        }
        int iIntValue = ((Integer) obj).intValue();
        onRelease onrelease2 = (onRelease) sheetBottomTokens.write.invoke();
        if (iIntValue < 0 || iIntValue >= onrelease2.serializer()) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
            sbM.append(onrelease2.serializer());
            sbM.append(')');
            TriStateCheckbox.read(sbM.toString());
        }
        BuildersKt.RemoteActionCompatParcelizer(sheetBottomTokens.getCoroutineScope(), null, null, new PagerState$scrollToPage$2(sheetBottomTokens, iIntValue, null, 1), 3);
        return Boolean.TRUE;
    }
}
