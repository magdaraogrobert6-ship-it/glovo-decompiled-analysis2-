package o;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class FontScaleConverterTable extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ List IconCompatParcelizer;
    public final /* synthetic */ LinkedHashMap RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.constraintlayout.compose.Measurer2 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontScaleConverterTable(androidx.constraintlayout.compose.Measurer2 measurer2, List list, LinkedHashMap linkedHashMap) {
        super(1);
        this.serializer = measurer2;
        this.IconCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = linkedHashMap;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = read + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            List list = this.IconCompatParcelizer;
            LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
            this.serializer.performLayout((androidx.compose.ui.layout.Placeable.PlacementScope) obj, list, linkedHashMap);
            return createFromParcel.INSTANCE;
        }
        List list2 = this.IconCompatParcelizer;
        LinkedHashMap linkedHashMap2 = this.RemoteActionCompatParcelizer;
        this.serializer.performLayout((androidx.compose.ui.layout.Placeable.PlacementScope) obj, list2, linkedHashMap2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        throw null;
    }
}
