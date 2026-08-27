package o;

import coil3.ComponentRegistry$Builder;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeExternalSyntheticLambda36 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final LinkedHashMap IconCompatParcelizer;
    public final BrazeExternalSyntheticLambda58 write;

    public BrazeExternalSyntheticLambda36(BrazeExternalSyntheticLambda58 brazeExternalSyntheticLambda58) {
        brazeExternalSyntheticLambda58.getClass();
        this.write = brazeExternalSyntheticLambda58;
        this.IconCompatParcelizer = new LinkedHashMap();
    }

    public final r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        LinkedHashMap linkedHashMap = this.IconCompatParcelizer;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            BrazeExternalSyntheticLambda48 brazeExternalSyntheticLambda48 = new BrazeExternalSyntheticLambda48((ComponentRegistry$Builder) ((getXmlParser) this.write.serializer.IconCompatParcelizer).write(), str);
            linkedHashMap.put(str, brazeExternalSyntheticLambda48);
            obj = brazeExternalSyntheticLambda48;
        }
        r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I r8lambdagclptcgavtocpxgi4oq7oslwz3i = (r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I) obj;
        int i4 = RemoteActionCompatParcelizer + 91;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdagclptcgavtocpxgi4oq7oslwz3i;
    }
}
