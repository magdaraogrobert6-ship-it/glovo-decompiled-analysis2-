package o;

import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class resolveSpanStyleDefaultslambda0 {
    public static final DragAndDropTargetModifierNode IconCompatParcelizer = new DragAndDropTargetModifierNode(new r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM() { // from class: o.StringAnnotationKt
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
        public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            int i;
            int i2;
            int i3 = 2 % 2;
            DeliveryAutoAcceptUiModelImpl deliveryAutoAcceptUiModelImpl = (DeliveryAutoAcceptUiModelImpl) obj;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj5;
            int iIntValue = ((Integer) obj6).intValue();
            deliveryAutoAcceptUiModelImpl.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            if ((iIntValue & 6) == 0) {
                int i4 = read + 111;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                i = (((getPostalCode) getbirthdatefull).read(deliveryAutoAcceptUiModelImpl) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                int i6 = RemoteActionCompatParcelizer + 99;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            if ((iIntValue & 3072) == 0) {
                if (((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i8 = read + 19;
                    RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i2 = i8 % 2 != 0 ? 11511 : androidx.compose.ui.graphics.Fields.CameraDistance;
                } else {
                    i2 = androidx.compose.ui.graphics.Fields.RotationZ;
                }
                i |= i2;
            }
            boolean z = false;
            if ((i & 9363) != 9362) {
                int i9 = RemoteActionCompatParcelizer + 45;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    z = true;
                }
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(i & 1, z)) {
                MediaMetadataCompat.IconCompatParcelizer(deliveryAutoAcceptUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, i & 8190);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createFromParcel.INSTANCE;
        }
    }, false, -1723019822);
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    static {
        int i = write + 121;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
