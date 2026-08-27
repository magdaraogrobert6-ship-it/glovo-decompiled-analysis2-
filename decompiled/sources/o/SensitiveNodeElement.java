package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.supportingTextPaddinga9UjIt4material3default;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final class SensitiveNodeElement implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ SwitchKt read;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY write;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.text.TextStyle textStyle = ((getAndroidAutofillType) getpostalcode.write((getNewPassword) AndroidContentDataType.RemoteActionCompatParcelizer)).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            final SwitchKt switchKt = this.read;
            final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.write;
            Options.Companion.IconCompatParcelizer(this.RemoteActionCompatParcelizer, textStyle, coil3.ExtrasKt.write(417635459, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.ButtonKt$Button$2$1
                /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj3, Object obj4) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                    int iIntValue2 = ((Number) obj4).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(SizeKt.write(Modifier.Companion, ButtonDefaults.read, ButtonDefaults.RemoteActionCompatParcelizer), switchKt);
                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = o.TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterVertically(), getpostalcode2, 54);
                        int iSerializer = SentryUUID.serializer(getpostalcode2);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierIconCompatParcelizer);
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                        if (getpostalcode2.read == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode2.ComponentActivity) {
                            getpostalcode2.serializer(constructor);
                        } else {
                            getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, companion.getSetMeasurePolicy());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (getpostalcode2.ComponentActivity) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, setCompositeKeyHash);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, setCompositeKeyHash);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion.getSetModifier());
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(o.TextFieldKt.read, getpostalcode2, 6);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, 384);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    public SensitiveNodeElement(long j, SwitchKt switchKt, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.RemoteActionCompatParcelizer = j;
        this.read = switchKt;
        this.write = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }
}
