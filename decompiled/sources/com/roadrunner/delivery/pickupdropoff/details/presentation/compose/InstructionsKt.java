package com.roadrunner.delivery.pickupdropoff.details.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.state.pudo.TagToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.processViewInfoslambda0;
import o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k;
import o.r8lambda55q2_ohlbc4LGzu4K9wd7pcC14s;
import o.r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE;
import o.r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstructionsKt {
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[PHI: r10
  0x0038: PHI (r10v5 o.getPostalCode) = (r10v1 o.getPostalCode), (r10v6 o.getPostalCode) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r10
  0x0024: PHI (r10v2 o.getPostalCode) = (r10v1 o.getPostalCode), (r10v6 o.getPostalCode) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        boolean z;
        String str;
        String str2;
        TagToken tagToken;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 61;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1880503784);
            if ((i & 35) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1880503784);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        int i7 = i3 | 48;
        if ((i7 & 19) != 18) {
            int i8 = serializer + 35;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            int i10 = serializer + 107;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                modifier = Modifier.Companion;
                str = r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g.serializer;
                str2 = r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g.read;
                tagToken = r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g.RemoteActionCompatParcelizer;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
                i4 = (i7 * 92) & 32479;
            } else {
                modifier = Modifier.Companion;
                str = r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g.serializer;
                str2 = r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g.read;
                tagToken = r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g.RemoteActionCompatParcelizer;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
                i4 = (i7 << 6) & 7168;
            }
            Instruction(str, str2, tagToken, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, i4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 15, r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    public static final void RemoteActionCompatParcelizer(r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        ?? r7;
        int i3;
        int i4 = 2 % 2;
        int i5 = read + 41;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1882576148);
        if ((i & 6) == 0) {
            int i7 = serializer + 49;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if ((i & 8) == 0 ? getpostalcode.read(r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe) : getpostalcode.IconCompatParcelizer(r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe)) {
                int i9 = serializer + 57;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = serializer + 37;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            float f = Dimensions.setMenu;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
            String str = r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe.read;
            if (str == null) {
                int i12 = read + 55;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode.serializer(143336688);
                getpostalcode.IconCompatParcelizer(false);
                r7 = 0;
            } else {
                getpostalcode.serializer(143336689);
                TextKt.m131TextNvy7gAk(str, PaddingKt.m73paddingVpY3zN4$default(companion, Dimensions.setActionBarVisibilityCallback, 0.0f, 2), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.ParcelableVolumeInfo(), getpostalcode, 0, 0, 131064);
                r7 = 0;
                IconCompatParcelizer.IconCompatParcelizer(companion, f, getpostalcode, false);
                int i14 = serializer + 71;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            }
            for (r8lambda55q2_ohlbc4LGzu4K9wd7pcC14s r8lambda55q2_ohlbc4lgzu4k9wd7pcc14s : r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe.write) {
                if (r8lambda55q2_ohlbc4lgzu4k9wd7pcc14s instanceof r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g) {
                    int i16 = serializer + 35;
                    read = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    getpostalcode.serializer(-1611950465);
                    IconCompatParcelizer((r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g) r8lambda55q2_ohlbc4lgzu4k9wd7pcc14s, null, getpostalcode, r7);
                    getpostalcode.IconCompatParcelizer((boolean) r7);
                } else {
                    if (r8lambda55q2_ohlbc4lgzu4k9wd7pcc14s instanceof r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k) {
                        getpostalcode.serializer(-1611947973);
                        SplitOrderInstructionKt.SplitOrderInstruction((r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k) r8lambda55q2_ohlbc4lgzu4k9wd7pcc14s, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, getpostalcode, i2 & 112);
                        getpostalcode.IconCompatParcelizer((boolean) r7);
                    } else {
                        if (!(r8lambda55q2_ohlbc4lgzu4k9wd7pcc14s instanceof r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M)) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1611951892, (boolean) r7);
                        }
                        getpostalcode.serializer(-1611942478);
                        InstructionV2Kt.InstructionV2((r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M) r8lambda55q2_ohlbc4lgzu4k9wd7pcc14s, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, (i2 >> 3) & 112);
                        getpostalcode.IconCompatParcelizer((boolean) r7);
                        int i18 = serializer + 119;
                        read = i18 % Fields.SpotShadowColor;
                        if (i18 % 2 != 0) {
                            int i19 = 2 % 4;
                        }
                    }
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.setActionBarVisibilityCallback)});
                }
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.setActionBarVisibilityCallback)});
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 15, r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    public static final void Instruction(String str, String str2, TagToken tagToken, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        boolean z;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-429607808);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(tagToken.ordinal()) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i4 = i2 | 1794048;
        if (getpostalcode.write(i4 & 1, (599187 & i4) != 599186)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode.write(objComponentActivity);
                int i5 = read + 119;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(modifier, 1.0f), Dimensions.setActionBarVisibilityCallback, 0.0f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                int i7 = processViewInfoslambda0.write[tagToken.ordinal()];
                if (i7 != 1) {
                    int i8 = serializer;
                    int i9 = i8 + 31;
                    read = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0 ? i7 == 2 : i7 == 3) {
                        z = false;
                        getpostalcode.serializer(1243854864);
                        TagsKt.IconCompatParcelizer(str, null, 0, getpostalcode, i4 & 14);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        int i10 = i8 + 67;
                        read = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0 ? i7 != 3 : i7 != 5) {
                            if (i7 != 4) {
                                throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1243851187, false);
                            }
                        }
                        z = false;
                        getpostalcode.serializer(1243857842);
                        TagsKt.read(str, null, 0, getpostalcode, i4 & 14);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                } else {
                    z = false;
                    getpostalcode.serializer(1243852850);
                    TagsKt.serializer(str, null, 0, getpostalcode, i4 & 14);
                    getpostalcode.IconCompatParcelizer(false);
                    int i11 = serializer + 55;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                }
                Object[] objArr = {getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.getActionBarHideOffset)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode, (i4 >> 3) & 14, 0, 131066);
                getpostalcode.serializer(-94705716);
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(true);
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM(i, 17, modifier, str, str2, tagToken, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
        }
    }
}
