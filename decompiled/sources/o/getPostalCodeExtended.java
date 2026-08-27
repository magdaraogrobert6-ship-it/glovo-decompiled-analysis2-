package o;

import java.util.ArrayList;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public final class getPostalCodeExtended implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getPostalCodeExtended(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [o.ContentInViewNode] */
    /* JADX WARN: Type inference failed for: r12v2, types: [o.ContentInViewNode] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, o.ContentCaptureEvent] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object[]] */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        boolean z;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Object obj = this.write;
        if (i4 != 0) {
            return i4 != 1 ? new Boolean[((Flow[]) obj).length] : new forEachui_graphicsdefault[((Flow[]) obj).length];
        }
        ArrayList arrayList = ((getContentHints) obj).read;
        onRemeasuredozmzZPI onremeasuredozmzzpi = new onRemeasuredozmzZPI(arrayList.size());
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ?? r7 = (ContentCaptureEvent) arrayList.get(i5);
            Object obj2 = r7.RemoteActionCompatParcelizer;
            int i6 = r7.read;
            Object createfromboolean = obj2 != null ? new createFromBoolean(Integer.valueOf(i6), r7.RemoteActionCompatParcelizer) : Integer.valueOf(i6);
            int iWrite = onremeasuredozmzzpi.write(createfromboolean);
            if (iWrite < 0) {
                int i7 = IconCompatParcelizer + 71;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            Object obj3 = z ? null : onremeasuredozmzzpi.MediaMetadataCompat[iWrite];
            if (obj3 != null) {
                if (!(obj3 instanceof ContentInViewNode)) {
                    Object[] objArr = DefaultFlingBehaviorperformFling2.read;
                    ?? contentInViewNode = new ContentInViewNode(2);
                    contentInViewNode.read(obj3);
                    contentInViewNode.read(r7);
                    r7 = contentInViewNode;
                } else {
                    ?? r11 = (ContentInViewNode) obj3;
                    r11.read(r7);
                    r7 = r11;
                }
            }
            if (z) {
                int i9 = RemoteActionCompatParcelizer + 19;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                int i11 = ~iWrite;
                onremeasuredozmzzpi.IconCompatParcelizer[i11] = createfromboolean;
                onremeasuredozmzzpi.MediaMetadataCompat[i11] = r7;
                int i12 = IconCompatParcelizer + 59;
                RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                onremeasuredozmzzpi.MediaMetadataCompat[iWrite] = r7;
            }
        }
        return new doTranslation(onremeasuredozmzzpi);
    }
}
