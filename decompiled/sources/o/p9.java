package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p9 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ Object read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ boolean write;

    public /* synthetic */ p9(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.read = str;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = z;
        this.IconCompatParcelizer = str2;
        this.MediaDescriptionCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    public /* synthetic */ p9(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, accessmultiRemove accessmultiremove) {
        this.write = z;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = list;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaDescriptionCompat = accessmultiremove;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c4  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.MediaDescriptionCompat;
        Object obj5 = this.IconCompatParcelizer;
        Object obj6 = this.read;
        if (i3 != 0) {
            List list = (List) obj6;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
            accessmultiRemove accessmultiremove = (accessmultiRemove) obj4;
            SwitchKt switchKt = (SwitchKt) obj;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            switchKt.getClass();
            if ((iIntValue & 6) == 0) {
                if (((getPostalCode) getbirthdatefull).read(switchKt)) {
                    int i4 = MediaMetadataCompat + 95;
                    RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    i = 4;
                }
                iIntValue |= i;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(1 & iIntValue, (iIntValue & 19) != 18)) {
                androidx.compose.material3.pulltorefresh.PullToRefreshKt.PullToRefreshBox(this.write, this.serializer, androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(androidx.compose.foundation.layout.PaddingKt.IconCompatParcelizer(androidx.compose.ui.Modifier.Companion.then(androidx.compose.foundation.layout.SizeKt.read), switchKt), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()), null, null, null, coil3.ExtrasKt.write(1226267953, new r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw(list, r8lambdaunavo3sxub_pc9xroryotnrlvsm, accessmultiremove), getpostalcode), getpostalcode, 1572864, 56);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        String str = (String) obj6;
        String str2 = (String) obj5;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        ((ModalBottomSheetDialogWrapper) obj).getClass();
        if ((iIntValue2 & 17) != 16) {
            int i6 = RatingCompat + 47;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (getpostalcode2.write(iIntValue2 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.PaddingKt.write(companion, Dimensions.setTabContainer);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, androidx.compose.ui.Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
                int i7 = RatingCompat + 23;
                MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            PrimaryKt.write(str, this.serializer, androidx.compose.foundation.layout.SizeKt.write(companion, 1.0f), false, false, null, null, null, null, null, getpostalcode2, 384, 0, 2040);
            if (this.write) {
                getpostalcode2.serializer(930306868);
                isValidParameter.RemoteActionCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, af$$ExternalSyntheticOutline1.m(companion, Dimensions.setStackedBackground, getpostalcode2, companion, 1.0f), false, false, null, null, null, null, getpostalcode2, 384, 1016);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(930625920);
                getpostalcode2.IconCompatParcelizer(false);
            }
            getpostalcode2.IconCompatParcelizer(true);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
