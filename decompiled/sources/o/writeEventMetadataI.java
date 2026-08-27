package o;

import androidx.room.RoomDatabase$$ExternalSyntheticLambda4;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class writeEventMetadataI implements Function {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    public /* synthetic */ writeEventMetadataI(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.read = i;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.write;
        if (i4 == 0) {
            return (Boolean) ((RoomDatabase$$ExternalSyntheticLambda4) r8lambdaunavo3sxub_pc9xroryotnrlvsm).invoke(obj);
        }
        Blur_androidKt blur_androidKt = (Blur_androidKt) ((accessgetIntersectcp) r8lambdaunavo3sxub_pc9xroryotnrlvsm).invoke(obj);
        int i5 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return blur_androidKt;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
