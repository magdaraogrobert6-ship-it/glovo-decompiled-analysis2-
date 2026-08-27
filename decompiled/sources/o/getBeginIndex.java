package o;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class getBeginIndex extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ LinkedHashMap IconCompatParcelizer;
    public final /* synthetic */ List serializer;
    public final /* synthetic */ androidx.constraintlayout.compose.Measurer2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBeginIndex(androidx.constraintlayout.compose.Measurer2 measurer2, List list, LinkedHashMap linkedHashMap) {
        super(1);
        this.write = measurer2;
        this.serializer = list;
        this.IconCompatParcelizer = linkedHashMap;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            List list = this.serializer;
            LinkedHashMap linkedHashMap = this.IconCompatParcelizer;
            this.write.performLayout((androidx.compose.ui.layout.Placeable.PlacementScope) obj, list, linkedHashMap);
            return createFromParcel.INSTANCE;
        }
        List list2 = this.serializer;
        LinkedHashMap linkedHashMap2 = this.IconCompatParcelizer;
        this.write.performLayout((androidx.compose.ui.layout.Placeable.PlacementScope) obj, list2, linkedHashMap2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        throw null;
    }
}
