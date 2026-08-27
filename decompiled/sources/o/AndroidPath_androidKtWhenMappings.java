package o;

import androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPath_androidKtWhenMappings implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public AndroidPath_androidKtWhenMappings(PathMeasure pathMeasure, cubicTo cubicto) {
        this.write = 5;
        this.RemoteActionCompatParcelizer = pathMeasure;
        this.serializer = cubicto;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:62:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b7  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.serializer;
        if (i == 0) {
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            cubicTo cubicto = (cubicTo) obj4;
            if ((3 & ((Number) obj2).intValue()) == 2) {
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.MediaSessionCompatToken()) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    opN5in7k0 opn5in7k0 = cubicto.IconCompatParcelizer;
                    opn5in7k0.getClass();
                    ((getPositiontuRUvjQ) opn5in7k0).read.invoke((sendDragEventEu1f8Dk) obj3, cubicto, getbirthdatefull, 0);
                }
            } else {
                opN5in7k0 opn5in7k1 = cubicto.IconCompatParcelizer;
                opn5in7k1.getClass();
                ((getPositiontuRUvjQ) opn5in7k1).read.invoke((sendDragEventEu1f8Dk) obj3, cubicto, getbirthdatefull, 0);
            }
            return createfromparcel;
        }
        if (i == 1) {
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
            int iIntValue = ((Number) obj2).intValue();
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4).invoke(((sensitiveContentdefault) obj3).RemoteActionCompatParcelizer, getpostalcode2, 0);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i == 2) {
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
            int iIntValue2 = ((Number) obj2).intValue();
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            if (getpostalcode3.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) obj4;
                ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) obj3;
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(androidx.compose.ui.Alignment.Companion.getTopStart(), false);
                int iSerializer = SentryUUID.serializer(getpostalcode3);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode3, companion);
                androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                if (getpostalcode3.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                if (getpostalcode3.ComponentActivity) {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion2.getSetModifier());
                dragAndDropTargetModifierNode.invoke(scaffoldKt$ScaffoldLayout$contentPadding$1$1, getpostalcode3, 6);
                getpostalcode3.IconCompatParcelizer(true);
            } else {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i == 3) {
            getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
            int iIntValue3 = ((Number) obj2).intValue();
            getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
            if (getpostalcode4.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                setRootAutofillId setrootautofillid = (setRootAutofillId) obj3;
                setrootautofillid.getClass();
                ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4).invoke(setrootautofillid, getpostalcode4, 0);
            } else {
                getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i == 4) {
            getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj;
            int iIntValue4 = ((Number) obj2).intValue();
            getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull5;
            if (getpostalcode5.write(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4).invoke((setId) obj3, getpostalcode5, 6);
            } else {
                getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i != 5) {
            getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj;
            if ((3 & ((Number) obj2).intValue()) == 2) {
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode6.MediaSessionCompatToken()) {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    getTangenttuRUvjQ.IconCompatParcelizer((AlphaKt) obj4, (DragAndDropTargetModifierNode) obj3, getbirthdatefull6, 0);
                }
            } else {
                getTangenttuRUvjQ.IconCompatParcelizer((AlphaKt) obj4, (DragAndDropTargetModifierNode) obj3, getbirthdatefull6, 0);
            }
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj;
        if ((3 & ((Number) obj2).intValue()) == 2) {
            getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull7;
            if (getpostalcode7.MediaSessionCompatToken()) {
                getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else {
                ((PathMeasure) obj3).read.invoke((cubicTo) obj4, getbirthdatefull7, 0);
            }
        } else {
            ((PathMeasure) obj3).read.invoke((cubicTo) obj4, getbirthdatefull7, 0);
        }
        return createfromparcel;
    }

    public /* synthetic */ AndroidPath_androidKtWhenMappings(Object obj, int i, Object obj2) {
        this.write = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }
}
