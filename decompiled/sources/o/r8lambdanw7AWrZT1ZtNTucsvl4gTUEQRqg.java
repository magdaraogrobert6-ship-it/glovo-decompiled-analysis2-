package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ReportBottomSheetKt;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg(Object obj, boolean z, isInvalidIndex isinvalidindex, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = z;
        this.read = isinvalidindex;
        this.serializer = i;
    }

    public /* synthetic */ r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg(boolean z, Object obj, Object obj2, int i, int i2) {
        this.write = i2;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 111;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.serializer;
        Object obj4 = this.read;
        boolean z = this.IconCompatParcelizer;
        Object obj5 = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            androidx.compose.material3.RadioButtonKt.RadioButton(z, (androidx.compose.ui.Modifier) obj5, (MediaQuery_androidKtobtainUiMediaScope31invokeinlinedonDispose1) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        if (i3 == 1) {
            ((Integer) obj2).getClass();
            getShouldAutoInvalidate.RemoteActionCompatParcelizer(z, (androidx.compose.ui.text.style.ResolvedTextDirection) obj5, (androidx.compose.foundation.text.selection.TextFieldSelectionManager) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        if (i3 == 2) {
            ((Integer) obj2).intValue();
            ReportBottomSheetKt.BlockUserCheckboxRow((InputState_androidKt) obj5, z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        if (i3 == 3) {
            ((Integer) obj2).intValue();
            EntrancePictureScreenKt.DeliveryNotesSection((String) obj5, z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            int i5 = MediaSessionCompatQueueItem + 35;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel2;
        }
        if (i3 == 4) {
            ((Integer) obj2).getClass();
            EntrancePictureIconKt.RemoteActionCompatParcelizer((IconButtonKt) obj5, z, (DragAndDropTargetModifierNode) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        getMotionEventToComposePointerIdMapui.IconCompatParcelizer((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
        int i7 = MediaSessionCompatQueueItem + 101;
        MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return createfromparcel2;
    }
}
