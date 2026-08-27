package o;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
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
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final class UiMediaScopePostureCompanion implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ DragAndDropTargetModifierNode IconCompatParcelizer;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.text.TextStyle read;
    public final /* synthetic */ float serializer;
    public final /* synthetic */ long write;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            final float f = this.serializer;
            final DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.IconCompatParcelizer;
            final float f2 = this.RemoteActionCompatParcelizer;
            Options.Companion.IconCompatParcelizer(this.write, this.read, coil3.ExtrasKt.write(-1767363041, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3$1
                /* JADX WARN: Code duplicated, block: B:18:0x008f  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj3, Object obj4) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                    int iIntValue2 = ((Number) obj4).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        Modifier modifierWrite = SizeKt.write(Modifier.Companion, f2, f);
                        MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
                        int iSerializer = SentryUUID.serializer(getpostalcode2);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
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
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        if (getpostalcode2.ComponentActivity) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion.getSetModifier());
                        dragAndDropTargetModifierNode.invoke(getpostalcode2, 0);
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

    public UiMediaScopePostureCompanion(long j, androidx.compose.ui.text.TextStyle textStyle, float f, float f2, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        this.write = j;
        this.read = textStyle;
        this.RemoteActionCompatParcelizer = f;
        this.serializer = f2;
        this.IconCompatParcelizer = dragAndDropTargetModifierNode;
    }
}
