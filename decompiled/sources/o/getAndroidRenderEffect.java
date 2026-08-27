package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getAndroidRenderEffect implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final /* synthetic */ onViewAttachedToWindow serializer;

    public /* synthetic */ getAndroidRenderEffect(onViewAttachedToWindow onviewattachedtowindow, int i) {
        this.read = i;
        this.serializer = onviewattachedtowindow;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[PHI: r5
  0x0025: PHI (r5v8 o.onViewAttachedToWindow) = (r5v0 o.onViewAttachedToWindow), (r5v10 o.onViewAttachedToWindow) binds: [B:9:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[PHI: r5
  0x0032: PHI (r5v7 o.onViewAttachedToWindow) = (r5v0 o.onViewAttachedToWindow), (r5v10 o.onViewAttachedToWindow) binds: [B:9:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r5
  0x0056: PHI (r5v6 o.onViewAttachedToWindow) = (r5v0 o.onViewAttachedToWindow), (r5v10 o.onViewAttachedToWindow) binds: [B:9:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[PHI: r5
  0x006a: PHI (r5v5 o.onViewAttachedToWindow) = (r5v0 o.onViewAttachedToWindow), (r5v10 o.onViewAttachedToWindow) binds: [B:9:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x007b A[PHI: r5
  0x007b: PHI (r5v4 o.onViewAttachedToWindow) = (r5v0 o.onViewAttachedToWindow), (r5v10 o.onViewAttachedToWindow) binds: [B:9:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x008a A[PHI: r5
  0x008a: PHI (r5v2 o.onViewAttachedToWindow) = (r5v0 o.onViewAttachedToWindow), (r5v10 o.onViewAttachedToWindow) binds: [B:9:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2 A[PHI: r5
  0x00e2: PHI (r5v1 o.onViewAttachedToWindow) = (r5v0 o.onViewAttachedToWindow), (r5v10 o.onViewAttachedToWindow) binds: [B:9:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x009b A[SYNTHETIC] */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        onViewAttachedToWindow onviewattachedtowindow;
        ArrayList arrayList;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = false;
        if (i2 % 2 == 0) {
            int i3 = this.read;
            onviewattachedtowindow = this.serializer;
            switch (i3) {
                case 0:
                    List list = (List) onviewattachedtowindow.getValue();
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        int i4 = write + 117;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((cubicTo) obj).IconCompatParcelizer.MediaMetadataCompat, "composable"}, getCieXyz.write())).booleanValue()) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                case 1:
                    return androidx.compose.ui.geometry.Offset.m466boximpl(((androidx.compose.ui.geometry.Offset) onviewattachedtowindow.getValue()).m487unboximpl());
                case 2:
                    animateToZero animatetozero = androidx.compose.foundation.text.selection.SelectionMagnifierKt.IconCompatParcelizer;
                    return androidx.compose.ui.geometry.Offset.m466boximpl(((androidx.compose.ui.geometry.Offset) onviewattachedtowindow.getValue()).m487unboximpl());
                case 3:
                    return Boolean.valueOf(((Number) onviewattachedtowindow.getValue()).floatValue() > 0.0f);
                case 4:
                    return Boolean.valueOf(((Number) onviewattachedtowindow.getValue()).floatValue() <= 0.0f ? z : true);
                case 5:
                    return Float.valueOf(((Number) onviewattachedtowindow.getValue()).floatValue());
                case 6:
                    return Boolean.valueOf(((copya9UjIt4default) onviewattachedtowindow.getValue()) instanceof getBottomD9Ej5fMannotations);
                default:
                    return Float.valueOf(androidx.compose.ui.util.MathHelpersKt.lerp(0.0f, 0.3f, ((Number) onviewattachedtowindow.getValue()).floatValue()));
            }
        }
        int i6 = this.read;
        onviewattachedtowindow = this.serializer;
        switch (i6) {
            case 0:
                List list2 = (List) onviewattachedtowindow.getValue();
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                    int i7 = write + 117;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((cubicTo) obj).IconCompatParcelizer.MediaMetadataCompat, "composable"}, getCieXyz.write())).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return androidx.compose.ui.geometry.Offset.m466boximpl(((androidx.compose.ui.geometry.Offset) onviewattachedtowindow.getValue()).m487unboximpl());
            case 2:
                animateToZero animatetozero2 = androidx.compose.foundation.text.selection.SelectionMagnifierKt.IconCompatParcelizer;
                return androidx.compose.ui.geometry.Offset.m466boximpl(((androidx.compose.ui.geometry.Offset) onviewattachedtowindow.getValue()).m487unboximpl());
            case 3:
                return Boolean.valueOf(((Number) onviewattachedtowindow.getValue()).floatValue() > 0.0f);
            case 4:
                z = true;
                break;
            case 5:
                return Float.valueOf(((Number) onviewattachedtowindow.getValue()).floatValue());
            case 6:
                return Boolean.valueOf(((copya9UjIt4default) onviewattachedtowindow.getValue()) instanceof getBottomD9Ej5fMannotations);
            default:
                return Float.valueOf(androidx.compose.ui.util.MathHelpersKt.lerp(0.0f, 0.3f, ((Number) onviewattachedtowindow.getValue()).floatValue()));
        }
        return Boolean.valueOf(((Number) onviewattachedtowindow.getValue()).floatValue() <= 0.0f ? z : true);
    }
}
