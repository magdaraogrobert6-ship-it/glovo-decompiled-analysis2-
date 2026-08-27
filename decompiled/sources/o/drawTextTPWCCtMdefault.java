package o;

import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final class drawTextTPWCCtMdefault implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ drawTextLVfH_YU IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ drawTextTPWCCtMdefault(drawTextLVfH_YU drawtextlvfh_yu, int i) {
        this.write = i;
        this.IconCompatParcelizer = drawtextlvfh_yu;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object obj2;
        measurewNUYSr0 measurewnuysr0;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        drawTextLVfH_YU drawtextlvfh_yu = this.IconCompatParcelizer;
        if (i4 != 0) {
            LineHeightStyleTrimSaverlambda1 lineHeightStyleTrimSaverlambda1 = (LineHeightStyleTrimSaverlambda1) obj;
            MutableStateFlow mutableStateFlow = drawtextlvfh_yu.write;
            if (lineHeightStyleTrimSaverlambda1 != null) {
                measurewnuysr0 = new measurewNUYSr0(lineHeightStyleTrimSaverlambda1.RemoteActionCompatParcelizer, lineHeightStyleTrimSaverlambda1.serializer);
                int i5 = RemoteActionCompatParcelizer + 85;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                measurewnuysr0 = null;
            }
            mutableStateFlow.IconCompatParcelizer(measurewnuysr0);
            return createfromparcel;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MutableStateFlow mutableStateFlow2 = drawtextlvfh_yu.read;
        if (zBooleanValue) {
            Object[] objArr = {drawtextlvfh_yu.serializer};
            int iSerializer = getQueryParameterslambda2.serializer();
            obj2 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        } else {
            obj2 = instance_delegatelambda0.write;
        }
        mutableStateFlow2.IconCompatParcelizer(obj2);
        return createfromparcel;
    }
}
