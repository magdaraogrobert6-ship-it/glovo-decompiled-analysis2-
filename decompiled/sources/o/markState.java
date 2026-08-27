package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class markState implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write = 1;

    public /* synthetic */ markState(long j, androidx.compose.ui.Modifier modifier) {
        this.IconCompatParcelizer = j;
        this.read = modifier;
    }

    public /* synthetic */ markState(r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU r8lambdapizledl0jh1wiogqm80pch0fhku, long j) {
        this.read = r8lambdapizledl0jh1wiogqm80pch0fhku;
        this.IconCompatParcelizer = j;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:38:0x0169  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        float fFloatValue;
        boolean z2;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.read;
        if (i2 != 0) {
            androidx.compose.ui.Modifier modifier = (androidx.compose.ui.Modifier) obj3;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                int i3 = serializer + 27;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z2)) {
                long j = this.IconCompatParcelizer;
                if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                    getpostalcode.serializer(-1244013944);
                    androidx.compose.ui.Modifier modifierM80requiredSizeInqDBjuR0$default = androidx.compose.foundation.layout.SizeKt.m80requiredSizeInqDBjuR0$default(modifier, androidx.compose.ui.unit.DpSize.m3771getWidthD9Ej5fM(j), androidx.compose.ui.unit.DpSize.m3769getHeightD9Ej5fM(j), 0.0f, 0.0f, 12);
                    androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(androidx.compose.ui.Alignment.Companion.getTopCenter(), false);
                    int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode, modifierM80requiredSizeInqDBjuR0$default);
                    androidx.compose.ui.node.ComposeUiNode.Companion companion = androidx.compose.ui.node.ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                    if (getpostalcode.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    int i5 = serializer + 51;
                    RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        int i7 = serializer + 9;
                        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    androidx.compose.foundation.text.AndroidCursorHandle_androidKt.read(null, getpostalcode, 0, 1);
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1243644858);
                    androidx.compose.foundation.text.AndroidCursorHandle_androidKt.read(modifier, getpostalcode, 0, 0);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU r8lambdapizledl0jh1wiogqm80pch0fhku = (r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU) obj3;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        if ((iIntValue2 & 3) != 2) {
            int i9 = RemoteActionCompatParcelizer + 93;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (!(!getpostalcode2.write(iIntValue2 & 1, z))) {
            int i11 = RemoteActionCompatParcelizer + 65;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = 21 / 0;
                if (r8lambdapizledl0jh1wiogqm80pch0fhku == r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU.Loading) {
                    getpostalcode2.serializer(1359495928);
                    ArrangementHorizontal arrangementHorizontal = ArrangementCenter1.read("infiniteTransition", getpostalcode2, 0);
                    Object[] objArr = {800, 0, performFling.read, 2};
                    fFloatValue = ((Number) ((onShowTranslationui) ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 0.0f, 360.0f, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr), (BoxMeasurePolicy) null, 6), "angle", getpostalcode2, 29112, 0).MediaSessionCompatQueueItem).getValue()).floatValue();
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(1360036289);
                    getpostalcode2.IconCompatParcelizer(false);
                    fFloatValue = 0.0f;
                }
            } else if (r8lambdapizledl0jh1wiogqm80pch0fhku == r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU.Loading) {
                getpostalcode2.serializer(1359495928);
                ArrangementHorizontal arrangementHorizontal2 = ArrangementCenter1.read("infiniteTransition", getpostalcode2, 0);
                Object[] objArr2 = {800, 0, performFling.read, 2};
                fFloatValue = ((Number) ((onShowTranslationui) ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal2, 0.0f, 360.0f, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr2), (BoxMeasurePolicy) null, 6), "angle", getpostalcode2, 29112, 0).MediaSessionCompatQueueItem).getValue()).floatValue();
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(1360036289);
                getpostalcode2.IconCompatParcelizer(false);
                fFloatValue = 0.0f;
            }
            androidx.compose.ui.graphics.ColorFilter colorFilterM763tintxETnrds$default = androidx.compose.ui.graphics.ColorFilter.Companion.m763tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.Companion, this.IconCompatParcelizer, 0, 2, null);
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
            boolean zSerializer = getpostalcode2.serializer(fFloatValue);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (zSerializer || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new lambdainit2(fFloatValue, 0);
                getpostalcode2.write(objComponentActivity);
            }
            lambdainit3.RemoteActionCompatParcelizer(colorFilterM763tintxETnrds$default, androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(companion2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), getpostalcode2, 0);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
