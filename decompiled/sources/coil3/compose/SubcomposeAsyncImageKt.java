package coil3.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.internal.SubcomposeContentPainterElement;
import coil3.compose.internal.UtilsKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.Iconww6aTOc;
import o.PathHitTesterKt;
import o.ShaderKt;
import o.SimpleGraphicsLayerModifierlayerBlock1;
import o.accessgetNonZerocp;
import o.divide;
import o.dividedefault;
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
public abstract class SubcomposeAsyncImageKt {
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    public static final void SubcomposeAsyncImageContent(final accessgetNonZerocp accessgetnonzerocp, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final Modifier modifier2;
        final Painter painter2;
        final String str2;
        final Alignment alignment2;
        final ContentScale contentScale2;
        final float f2;
        final ColorFilter colorFilter2;
        final boolean z2;
        Alignment alignment3;
        ContentScale contentScale3;
        float f3;
        boolean z3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1375825518);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(accessgetnonzerocp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i3 |= Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= 33554432;
        }
        if (getpostalcode.write(i3 & 1, (38347923 & i3) != 38347922)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                painter2 = painter;
                str2 = str;
                alignment3 = alignment;
                contentScale3 = contentScale;
                f3 = f;
                colorFilter2 = colorFilter;
                z3 = z;
            } else {
                modifier2 = Modifier.Companion;
                painter2 = accessgetnonzerocp.serializer;
                str2 = accessgetnonzerocp.write;
                alignment3 = accessgetnonzerocp.read;
                contentScale3 = accessgetnonzerocp.IconCompatParcelizer;
                accessgetnonzerocp.getClass();
                colorFilter2 = accessgetnonzerocp.RemoteActionCompatParcelizer;
                accessgetnonzerocp.getClass();
                f3 = 1.0f;
                z3 = true;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            Modifier modifierThen = modifier2.then(new SubcomposeContentPainterElement(painter2, alignment3, contentScale3, f3, colorFilter2, z3, str2));
            int i4 = UtilsKt.write;
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
                if (!getpostalcode.ComponentActivity) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iHashCode)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iHashCode, getpostalcode, iHashCode, setCompositeKeyHash);
                    }
                } else {
                    c8$$ExternalSyntheticOutline0.m(iHashCode, getpostalcode, iHashCode, setCompositeKeyHash);
                }
                getpostalcode.IconCompatParcelizer(true);
                alignment2 = alignment3;
                contentScale2 = contentScale3;
                f2 = f3;
                z2 = z3;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            painter2 = painter;
            str2 = str;
            alignment2 = alignment;
            contentScale2 = contentScale;
            f2 = f;
            colorFilter2 = colorFilter;
            z2 = z;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.floatCountForType
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    coil3.compose.SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(accessgetnonzerocp, modifier2, painter2, str2, alignment2, contentScale2, f2, colorFilter2, z2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0199  */
    /* JADX INFO: renamed from: SubcomposeAsyncImage-gl8XCv8, reason: not valid java name */
    public static final void m3982SubcomposeAsyncImagegl8XCv8(updatePathdefault updatepathdefault, String str, Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Alignment alignment, ContentScale contentScale, ColorFilter colorFilter, int i, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i2, int i3) {
        int i4;
        int i5;
        getPostalCode getpostalcode;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-205779950);
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
        if ((i2 & 805306368) == 0) {
            i4 |= getpostalcode2.read(i) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (getpostalcode2.write(true) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        int i7 = i5;
        if (getpostalcode2.write(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            ShaderKt shaderKtIconCompatParcelizer = UtilsKt.IconCompatParcelizer(updatepathdefault.serializer, contentScale, getpostalcode2, (i6 >> 15) & 112);
            AsyncImagePainter asyncImagePainterM3981rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m3981rememberAsyncImagePainter5jETZwI(shaderKtIconCompatParcelizer, updatepathdefault.RemoteActionCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, contentScale, i, getpostalcode2);
            SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock1 = shaderKtIconCompatParcelizer.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (!(simpleGraphicsLayerModifierlayerBlock1 instanceof ConstraintsSizeResolver)) {
                getpostalcode2.serializer(-1471259157);
                MeasurePolicy measurePolicy = BoxKt.read(alignment, true);
                int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                if (getpostalcode2.read != null) {
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor);
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    if (getpostalcode2.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iHashCode, getpostalcode2, iHashCode, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iHashCode)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iHashCode, getpostalcode2, iHashCode, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion.getSetModifier());
                    dragAndDropTargetModifierNode.invoke(new accessgetNonZerocp(BoxScopeInstance.serializer, asyncImagePainterM3981rememberAsyncImagePainter5jETZwI, str, alignment, contentScale, colorFilter), getpostalcode2, Integer.valueOf(i7 & 112));
                    getpostalcode2.IconCompatParcelizer(true);
                    getpostalcode2.IconCompatParcelizer(false);
                    getpostalcode = getpostalcode2;
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                getpostalcode2.serializer(-1470570430);
                getpostalcode = getpostalcode2;
                Iconww6aTOc.serializer(modifier, alignment, true, ExtrasKt.write(-374957172, new dividedefault(simpleGraphicsLayerModifierlayerBlock1, dragAndDropTargetModifierNode, asyncImagePainterM3981rememberAsyncImagePainter5jETZwI, str, alignment, contentScale, colorFilter, 0), getpostalcode2), getpostalcode2, ((i6 >> 6) & 14) | 3456 | ((i6 >> 12) & 112), 0);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new divide(updatepathdefault, str, modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, alignment, contentScale, colorFilter, i, dragAndDropTargetModifierNode, i2, i3);
        }
    }
}
