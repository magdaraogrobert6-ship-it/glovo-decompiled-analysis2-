package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class qdExternalSyntheticLambda0 extends accessgetInitialDelayp {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final isAdapterPositionOnScreen write;

    public qdExternalSyntheticLambda0(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, q9 q9Var) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(14, this));
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(14, this));
    }

    @Override // o.accessgetInitialDelayp
    public final FwFClientKt read(Type type, Annotation[] annotationArr, getHoldoutVariation getholdoutvariation) {
        int i = 2 % 2;
        annotationArr.getClass();
        int length = annotationArr.length;
        int i2 = IconCompatParcelizer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            Annotation annotation = annotationArr[i4];
            annotation.getClass();
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            clsAnnotationType.getClass();
            if (displayInAppMessagelambda1.serializer(clsAnnotationType).equals(displayInAppMessagelambda1.serializer(accesssetTrackingInProgressp.class))) {
                int i5 = read + 125;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                FwFClientKt fwFClientKt = ((accessgetInitialDelayp) this.write.MediaSessionCompatResultReceiverWrapper()).read(type, annotationArr, getholdoutvariation);
                int i7 = IconCompatParcelizer + 51;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 74 / 0;
                }
                return fwFClientKt;
            }
            i4++;
            int i9 = IconCompatParcelizer + 29;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        loadHtmlData loadhtmldata = new loadHtmlData(this, type, annotationArr, getholdoutvariation);
        int i11 = read + 15;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return loadhtmldata;
    }

    @Override // o.accessgetInitialDelayp
    public final FwFClientKt RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, getHoldoutVariation getholdoutvariation) {
        int i = 2 % 2;
        int i2 = read + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        type.getClass();
        annotationArr2.getClass();
        int i4 = read + 85;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        for (Annotation annotation : annotationArr2) {
            int i6 = read + 117;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            annotation.getClass();
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            clsAnnotationType.getClass();
            if (displayInAppMessagelambda1.serializer(clsAnnotationType).equals(displayInAppMessagelambda1.serializer(accesssetTrackingInProgressp.class))) {
                int i8 = read + 109;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return ((accessgetInitialDelayp) this.write.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer(type, annotationArr, annotationArr2, getholdoutvariation);
                }
                FwFClientKt fwFClientKtRemoteActionCompatParcelizer = ((accessgetInitialDelayp) this.write.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer(type, annotationArr, annotationArr2, getholdoutvariation);
                int i9 = 28 / 0;
                return fwFClientKtRemoteActionCompatParcelizer;
            }
        }
        Object objMediaSessionCompatResultReceiverWrapper = this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        return ((ProtoFeatureMsgCompanion) objMediaSessionCompatResultReceiverWrapper).RemoteActionCompatParcelizer(type, annotationArr, annotationArr2, getholdoutvariation);
    }
}
