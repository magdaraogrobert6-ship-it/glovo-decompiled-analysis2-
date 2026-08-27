package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureCommonKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1.BagsAndItemsDetailKt;
import com.roadrunner.rider.state.searchshifts.presentation.timepicker.DualColumnTimePickerKt;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class currentTimeMillis implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int write;

    public /* synthetic */ currentTimeMillis(boolean z, r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0 r8lambdamtsd8x0f0xutzn3oeie_s8mt0, int i) {
        this.write = 2;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = r8lambdamtsd8x0f0xutzn3oeie_s8mt0;
        this.read = i;
    }

    public /* synthetic */ currentTimeMillis(int i, int i2, Object obj, boolean z) {
        this.write = i2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = z;
        this.read = i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.read;
        boolean z2 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.IconCompatParcelizer;
        if (i2 == 0) {
            ((Integer) obj2).getClass();
            androidx.compose.foundation.text.CoreTextFieldKt.IconCompatParcelizer((androidx.compose.foundation.text.selection.TextFieldSelectionManager) obj3, z2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3));
            return createfromparcel;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ((Integer) obj2).intValue();
                BagsAndItemsDetailKt.RemoteActionCompatParcelizer(z2, (r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            }
            ((Integer) obj2).intValue();
            DualColumnTimePickerKt.TimePickerItem(ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), (getBirthDateFull) obj, (String) obj3, z2);
            return createfromparcel;
        }
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) obj3;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            int i4 = serializer + 39;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(androidx.compose.ui.Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode, companion);
            androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i5 = serializer + 81;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i6 = 77 / 0;
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            dragAndDropTargetModifierNode.invoke(androidx.compose.foundation.layout.BoxScopeInstance.serializer, getpostalcode, 6);
            if (z2) {
                getpostalcode.serializer(-405715252);
                EntrancePictureCommonKt.PicturesCounter(Integer.valueOf(i3), getpostalcode, 6);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-405588400);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
