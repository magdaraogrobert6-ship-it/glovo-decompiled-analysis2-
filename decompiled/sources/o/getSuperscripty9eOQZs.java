package o;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class getSuperscripty9eOQZs extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ LinkedHashMap RemoteActionCompatParcelizer;
    public final /* synthetic */ List serializer;
    public final /* synthetic */ androidx.constraintlayout.compose.Measurer2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSuperscripty9eOQZs(androidx.constraintlayout.compose.Measurer2 measurer2, List list, LinkedHashMap linkedHashMap) {
        super(1);
        this.write = measurer2;
        this.serializer = list;
        this.RemoteActionCompatParcelizer = linkedHashMap;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List list = this.serializer;
        LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
        this.write.performLayout((androidx.compose.ui.layout.Placeable.PlacementScope) obj, list, linkedHashMap);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = IconCompatParcelizer + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
