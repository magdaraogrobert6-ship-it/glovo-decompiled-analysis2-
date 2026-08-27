package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getAutofillValueui implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState write;

    public /* synthetic */ getAutofillValueui(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState, int i) {
        this.IconCompatParcelizer = i;
        this.write = anchoredDraggableState;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.IconCompatParcelizer;
        androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState = this.write;
        float f = 0.0f;
        if (i == 0) {
            Object value = ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) anchoredDraggableState.MediaSessionCompatQueueItem)).getValue();
            if (value != null) {
                return value;
            }
            float fSerializer = anchoredDraggableState.serializer();
            boolean zIsNaN = Float.isNaN(fSerializer);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) anchoredDraggableState.MediaDescriptionCompat;
            return !zIsNaN ? anchoredDraggableState.write(fSerializer, 0.0f, ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue()) : ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue();
        }
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? new onViewAttachedToWindowlambda0(anchoredDraggableState.RemoteActionCompatParcelizer(), ((getPersonLastName) anchoredDraggableState.MediaSessionCompatToken).getValue()) : anchoredDraggableState.RemoteActionCompatParcelizer();
            }
            float f2 = anchoredDraggableState.RemoteActionCompatParcelizer().read(((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) anchoredDraggableState.MediaDescriptionCompat)).getValue());
            float f3 = anchoredDraggableState.RemoteActionCompatParcelizer().read(((getPersonLastName) anchoredDraggableState.write).getValue()) - f2;
            float fAbs = Math.abs(f3);
            if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                f = 1.0f;
            } else {
                float f4 = (anchoredDraggableState.read() - f2) / f3;
                if (f4 >= 1.0E-6f) {
                    if (f4 > 0.999999f) {
                        f = 1.0f;
                    } else {
                        f = f4;
                    }
                }
            }
            return Float.valueOf(f);
        }
        Object value2 = ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) anchoredDraggableState.MediaSessionCompatQueueItem)).getValue();
        if (value2 != null) {
            return value2;
        }
        float fSerializer2 = anchoredDraggableState.serializer();
        boolean zIsNaN2 = Float.isNaN(fSerializer2);
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) anchoredDraggableState.MediaDescriptionCompat;
        if (zIsNaN2) {
            return ((onShowTranslationui) populateViewStructure_androidKtpopulate8).getValue();
        }
        Object value3 = ((onShowTranslationui) populateViewStructure_androidKtpopulate8).getValue();
        listValue listvalueRemoteActionCompatParcelizer = anchoredDraggableState.RemoteActionCompatParcelizer();
        float f5 = listvalueRemoteActionCompatParcelizer.read(value3);
        if (f5 != fSerializer2 && !Float.isNaN(f5)) {
            if (f5 < fSerializer2) {
                Object objWrite = listvalueRemoteActionCompatParcelizer.write(fSerializer2, true);
                if (objWrite != null) {
                    return objWrite;
                }
            } else {
                Object objWrite2 = listvalueRemoteActionCompatParcelizer.write(fSerializer2, false);
                if (objWrite2 != null) {
                    return objWrite2;
                }
            }
        }
        return value3;
    }
}
