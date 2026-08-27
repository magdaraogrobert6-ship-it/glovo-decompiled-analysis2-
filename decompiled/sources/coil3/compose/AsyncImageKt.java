package coil3.compose;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.compose.internal.ContentPainterElement;
import coil3.compose.internal.UtilsKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PathHitTesterKt;
import o.ShaderKt;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.updatePathdefault;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncImageKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0197  */
    /* JADX INFO: renamed from: AsyncImage-76YX9Dk, reason: not valid java name */
    public static final void m3980AsyncImage76YX9Dk(final updatePathdefault updatepathdefault, final String str, final Modifier modifier, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, final Alignment alignment, final ContentScale contentScale, final ColorFilter colorFilter, final int i, getBirthDateFull getbirthdatefull, final int i2, final int i3) {
        int i4;
        int i5;
        getPostalCode getpostalcode;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (getpostalcode2.read(updatepathdefault) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.read(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= getpostalcode2.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= getpostalcode2.read(alignment) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= getpostalcode2.read(contentScale) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i2) == 0) {
            i4 |= getpostalcode2.serializer(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= getpostalcode2.read(colorFilter) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= getpostalcode2.read(i) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (getpostalcode2.write(true) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (getpostalcode2.write(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            ShaderKt shaderKtIconCompatParcelizer = UtilsKt.IconCompatParcelizer(updatepathdefault.serializer, contentScale, getpostalcode2, (i4 >> 15) & 112);
            UtilsKt.RemoteActionCompatParcelizer(shaderKtIconCompatParcelizer);
            getpostalcode = getpostalcode2;
            Modifier modifierThen = modifier.then(new ContentPainterElement(shaderKtIconCompatParcelizer, updatepathdefault.RemoteActionCompatParcelizer, updatepathdefault.write, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i, alignment, contentScale, colorFilter, UtilsKt.RemoteActionCompatParcelizer(getpostalcode2), str));
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, PathHitTesterKt.read, companion.getSetMeasurePolicy());
                AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (getpostalcode.ComponentActivity) {
                    c8$$ExternalSyntheticOutline0.m(iHashCode, getpostalcode, iHashCode, setCompositeKeyHash);
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iHashCode)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iHashCode, getpostalcode, iHashCode, setCompositeKeyHash);
                    }
                }
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.PathCompanion
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    coil3.compose.AsyncImageKt.m3980AsyncImage76YX9Dk(updatepathdefault, str, modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, alignment, contentScale, colorFilter, i, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1), ContentType_androidKt.RemoteActionCompatParcelizer(i3));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
