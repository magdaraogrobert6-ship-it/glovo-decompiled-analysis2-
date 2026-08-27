package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AutofillTree;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlowLayoutBuildingBlocksWrapInfo;
import o.PagerMeasureResult;
import o.PersistentOrderedSet;
import o.UiMediaScopeKeyboardKindCompanion;
import o.ZIndexNode;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getFartKroMQ;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.isAutofillable;
import o.onReceive;
import o.onSemanticsChanged;
import o.populateViewStructure;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.requestAutofillui;
import o.resolvePointerPrecision;
import o.setImeVisible;

/* JADX INFO: loaded from: classes.dex */
public abstract class SwitchKt {
    public static final float IconCompatParcelizer;
    public static final float MediaMetadataCompat;
    public static final float RemoteActionCompatParcelizer;
    public static final float read;
    public static final FlowLayoutBuildingBlocksWrapInfo serializer;
    public static final float write;

    static {
        float f = SwitchTokens.PlaybackStateCompatCustomAction;
        RemoteActionCompatParcelizer = f;
        MediaMetadataCompat = SwitchTokens.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        write = SwitchTokens.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        float f2 = SwitchTokens.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        read = f2;
        IconCompatParcelizer = Dp.m3673constructorimpl(Dp.m3673constructorimpl(f2 - f) / 2.0f);
        serializer = new FlowLayoutBuildingBlocksWrapInfo(0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x0144  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void IconCompatParcelizer(boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, boolean z2, onSemanticsChanged onsemanticschanged, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        getPostalCode getpostalcode;
        Modifier modifier3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        Object objComponentActivity;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        Modifier modifierRemoteActionCompatParcelizer;
        int i5;
        int i6;
        int i7;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-263339167);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.write(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode2.read(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((i & 3072) == 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                    i7 = Fields.CameraDistance;
                } else {
                    i7 = Fields.RotationZ;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (getpostalcode2.write(z2)) {
                    i6 = Fields.Clip;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((196608 & i) == 0) {
                if (getpostalcode2.read(onsemanticschanged)) {
                    i5 = Fields.RenderEffect;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i4 = i3 | 1572864;
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode2.write(i4 & 1, z3)) {
                getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0 && !getpostalcode2.PlaybackStateCompat()) {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    if (i8 != 0) {
                        modifier4 = Modifier.Companion;
                    }
                    getpostalcode2.RemoteActionCompatParcelizer();
                    getpostalcode2.serializer(1768604058);
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode2);
                    }
                    mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity;
                    getpostalcode2.IconCompatParcelizer(false);
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                        Modifier.Companion companion = Modifier.Companion;
                        HorizontalAlignmentLine horizontalAlignmentLine = getFartKroMQ.IconCompatParcelizer;
                        modifierRemoteActionCompatParcelizer = PersistentOrderedSet.RemoteActionCompatParcelizer(companion.then(ZIndexNode.serializer), z, mutableInteractionSourceImpl, z2, Role.m2807boximpl(Role.Companion.m2820getSwitcho7Vup1c()), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    } else {
                        modifierRemoteActionCompatParcelizer = Modifier.Companion;
                    }
                    int i9 = i4 << 3;
                    int i10 = i4 >> 6;
                    int i11 = (i9 & 57344) | (i10 & 7168) | (i9 & 112) | (i10 & 896);
                    modifier2 = modifier4;
                    getpostalcode = getpostalcode2;
                    SwitchImpl(SizeKt.m79requiredSizeVpY3zN4(SizeKt.IconCompatParcelizer(modifier4.then(modifierRemoteActionCompatParcelizer), Alignment.Companion.getCenter(), 2), write, read), z, z2, onsemanticschanged, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, mutableInteractionSourceImpl, setImeVisible.read(SwitchTokens.ParcelableVolumeInfo, getpostalcode2), getpostalcode2, i11);
                }
                modifier4 = modifier2;
                getpostalcode2.RemoteActionCompatParcelizer();
                getpostalcode2.serializer(1768604058);
                objComponentActivity = getpostalcode2.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode2);
                }
                mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity;
                getpostalcode2.IconCompatParcelizer(false);
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                    Modifier.Companion companion2 = Modifier.Companion;
                    HorizontalAlignmentLine horizontalAlignmentLine2 = getFartKroMQ.IconCompatParcelizer;
                    modifierRemoteActionCompatParcelizer = PersistentOrderedSet.RemoteActionCompatParcelizer(companion2.then(ZIndexNode.serializer), z, mutableInteractionSourceImpl, z2, Role.m2807boximpl(Role.Companion.m2820getSwitcho7Vup1c()), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                } else {
                    modifierRemoteActionCompatParcelizer = Modifier.Companion;
                }
                int i12 = i4 << 3;
                int i13 = i4 >> 6;
                int i14 = (i12 & 57344) | (i13 & 7168) | (i12 & 112) | (i13 & 896);
                modifier2 = modifier4;
                getpostalcode = getpostalcode2;
                SwitchImpl(SizeKt.m79requiredSizeVpY3zN4(SizeKt.IconCompatParcelizer(modifier4.then(modifierRemoteActionCompatParcelizer), Alignment.Companion.getCenter(), 2), write, read), z, z2, onsemanticschanged, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, mutableInteractionSourceImpl, setImeVisible.read(SwitchTokens.ParcelableVolumeInfo, getpostalcode2), getpostalcode2, i14);
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            modifier3 = modifier2;
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new requestAutofillui(z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, z2, onsemanticschanged, i, i2);
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                i7 = Fields.CameraDistance;
            } else {
                i7 = Fields.RotationZ;
            }
            i3 |= i7;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.write(z2)) {
                i6 = Fields.Clip;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode2.read(onsemanticschanged)) {
                i5 = Fields.RenderEffect;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        i4 = i3 | 1572864;
        if ((599187 & i4) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode2.write(i4 & 1, z3)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                if (i8 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
            } else if (i8 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            getpostalcode2.serializer(1768604058);
            objComponentActivity = getpostalcode2.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode2);
            }
            mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity;
            getpostalcode2.IconCompatParcelizer(false);
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                Modifier.Companion companion3 = Modifier.Companion;
                HorizontalAlignmentLine horizontalAlignmentLine3 = getFartKroMQ.IconCompatParcelizer;
                modifierRemoteActionCompatParcelizer = PersistentOrderedSet.RemoteActionCompatParcelizer(companion3.then(ZIndexNode.serializer), z, mutableInteractionSourceImpl, z2, Role.m2807boximpl(Role.Companion.m2820getSwitcho7Vup1c()), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            } else {
                modifierRemoteActionCompatParcelizer = Modifier.Companion;
            }
            int i15 = i4 << 3;
            int i16 = i4 >> 6;
            int i17 = (i15 & 57344) | (i16 & 7168) | (i15 & 112) | (i16 & 896);
            modifier2 = modifier4;
            getpostalcode = getpostalcode2;
            SwitchImpl(SizeKt.m79requiredSizeVpY3zN4(SizeKt.IconCompatParcelizer(modifier4.then(modifierRemoteActionCompatParcelizer), Alignment.Companion.getCenter(), 2), write, read), z, z2, onsemanticschanged, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, mutableInteractionSourceImpl, setImeVisible.read(SwitchTokens.ParcelableVolumeInfo, getpostalcode2), getpostalcode2, i17);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        modifier3 = modifier2;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new requestAutofillui(z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, z2, onsemanticschanged, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x014e  */
    public static final void SwitchImpl(Modifier modifier, boolean z, boolean z2, onSemanticsChanged onsemanticschanged, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, MutableInteractionSourceImpl mutableInteractionSourceImpl, Shape shape, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-670917213);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.write(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(onsemanticschanged) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.read(mutableInteractionSourceImpl) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.read(shape) ? 1048576 : Fields.BlendMode;
        }
        if (getpostalcode.write(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                if (z) {
                    j = onsemanticschanged.write;
                } else {
                    j = onsemanticschanged.ComponentActivity;
                }
            } else if (z) {
                j = onsemanticschanged.MediaDescriptionCompat;
            } else {
                j = onsemanticschanged.PlaybackStateCompat;
            }
            if (z2) {
                if (z) {
                    j2 = onsemanticschanged.RemoteActionCompatParcelizer;
                } else {
                    j2 = onsemanticschanged.MediaSessionCompatToken;
                }
            } else if (z) {
                j2 = onsemanticschanged.RatingCompat;
            } else {
                j2 = onsemanticschanged.MediaSessionCompatResultReceiverWrapper;
            }
            Shape shape2 = setImeVisible.read(SwitchTokens.ResultReceiver, getpostalcode);
            float f = SwitchTokens.ComponentActivity;
            if (!z2) {
                j3 = j2;
                if (z) {
                    j4 = onsemanticschanged.read;
                } else {
                    j4 = onsemanticschanged.MediaBrowserCompatMediaItem;
                }
            } else if (z) {
                j3 = j2;
                j4 = onsemanticschanged.IconCompatParcelizer;
            } else {
                j3 = j2;
                j4 = onsemanticschanged.PlaybackStateCompatCustomAction;
            }
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(BorderKt.write(modifier, f, j4, shape2), j, shape2);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iSerializer = SentryUUID.serializer(getpostalcode);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                if (!getpostalcode.ComponentActivity) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                } else {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion2.getSetModifier());
                Modifier modifierM20backgroundbw27NRU2 = BackgroundKt.m20backgroundbw27NRU(PagerMeasureResult.RemoteActionCompatParcelizer(BoxScopeInstance.serializer.align(Modifier.Companion, companion.getCenterStart()).then(new isAutofillable(mutableInteractionSourceImpl, z, resolvePointerPrecision.serializer(AutofillTree.FastSpatial, getpostalcode))), mutableInteractionSourceImpl, onReceive.serializer(Dp.m3673constructorimpl(SwitchTokens.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus / 2.0f), 0L, 4)), j3, shape);
                MeasurePolicy measurePolicy2 = BoxKt.read(companion.getCenter(), false);
                int iSerializer2 = SentryUUID.serializer(getpostalcode);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2 = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                if (!getpostalcode.ComponentActivity) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer2)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode, iSerializer2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2);
                    }
                } else {
                    c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode, iSerializer2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2);
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, companion2.getSetModifier());
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 != null) {
                    getpostalcode.serializer(1235836927);
                    if (z2) {
                        if (z) {
                            j5 = onsemanticschanged.serializer;
                        } else {
                            j5 = onsemanticschanged.ParcelableVolumeInfo;
                        }
                    } else if (z) {
                        j5 = onsemanticschanged.MediaSessionCompatQueueItem;
                    } else {
                        j5 = onsemanticschanged.MediaMetadataCompat;
                    }
                    AndroidContentCaptureManagerCompanion.read(UiMediaScopeKeyboardKindCompanion.read.write(Color.m712boximpl(j5)), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, ((i2 >> 9) & 112) | 8);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(1236071411);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new populateViewStructure(modifier, z, z2, onsemanticschanged, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, mutableInteractionSourceImpl, shape, i);
        }
    }
}
