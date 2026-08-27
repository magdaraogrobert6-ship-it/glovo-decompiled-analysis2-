package o;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class getCompositionEndui_text extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ LinkedHashMap RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.constraintlayout.compose.Measurer2 read;
    public final /* synthetic */ List write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCompositionEndui_text(androidx.constraintlayout.compose.Measurer2 measurer2, List list, LinkedHashMap linkedHashMap) {
        super(1);
        this.read = measurer2;
        this.write = list;
        this.RemoteActionCompatParcelizer = linkedHashMap;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            List list = this.write;
            LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
            this.read.performLayout((androidx.compose.ui.layout.Placeable.PlacementScope) obj, list, linkedHashMap);
            return createFromParcel.INSTANCE;
        }
        List list2 = this.write;
        LinkedHashMap linkedHashMap2 = this.RemoteActionCompatParcelizer;
        this.read.performLayout((androidx.compose.ui.layout.Placeable.PlacementScope) obj, list2, linkedHashMap2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        throw null;
    }
}
