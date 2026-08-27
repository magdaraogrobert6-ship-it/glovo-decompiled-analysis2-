package androidx.compose.material3;

import androidx.cardview.widget.CardView$1;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.hms.location.LocationRequest;
import com.logistics.rider.glovo.R;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidAutofill_androidKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.Autofill;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.RadioButton;
import o.awaitScrollDependencies;
import o.getAutofillTree;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getEventType;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performFling;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.removeNodeAtDepth;
import o.requiredWidthInVpY3zN4default;
import o.setFocusable;
import o.setHasPhysicalKeyboard;

/* JADX INFO: loaded from: classes.dex */
public abstract class SheetDefaultsKt {
    public static final float serializer = Dp.m3673constructorimpl(22.0f);
    public static final requiredWidthInVpY3zN4default write;

    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    public static final void DragHandleWithTooltip(DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1033612924);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(o.ModalBottomSheetKt.write) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        int i3 = 1;
        int i4 = 0;
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            String str = setFocusable.read(getpostalcode, R.string.m3c_bottom_sheet_drag_handle_description);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier modifierThen = companion.then(new RadioButton(companion2.getCenterHorizontally()));
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iSerializer = SentryUUID.serializer(getpostalcode);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            if (getpostalcode.ComponentActivity) {
                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                }
            }
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion3.getSetModifier());
            float f = TooltipDefaults.RemoteActionCompatParcelizer;
            int iMo42roundToPx0680j_4 = ((Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo42roundToPx0680j_4(TooltipKt.RemoteActionCompatParcelizer);
            boolean z = getpostalcode.read(iMo42roundToPx0680j_4);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new TooltipPositionProviderImpl(iMo42roundToPx0680j_4);
                getpostalcode.write(objComponentActivity);
            }
            TooltipPositionProviderImpl tooltipPositionProviderImpl = (TooltipPositionProviderImpl) objComponentActivity;
            DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite = ExtrasKt.write(2059851063, new AndroidAutofill_androidKt(i3, str), getpostalcode);
            awaitScrollDependencies awaitscrolldependencies = Autofill.read;
            boolean zWrite = getpostalcode.write(false);
            boolean z2 = getpostalcode.read(awaitscrolldependencies);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((zWrite | z2) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new TooltipStateImpl(awaitscrolldependencies);
                getpostalcode.write(objComponentActivity2);
            }
            TooltipKt.read(tooltipPositionProviderImpl, dragAndDropTargetModifierNodeWrite, (TooltipStateImpl) objComponentActivity2, null, false, dragAndDropTargetModifierNode, getpostalcode, ((i2 << 21) & 234881024) | 48);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setHasPhysicalKeyboard(dragAndDropTargetModifierNode, i, i4);
        }
    }

    static {
        Object[] objArr = {Integer.valueOf(LocationRequest.PRIORITY_INDOOR), 0, performFling.RemoteActionCompatParcelizer, 2};
        write = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr);
    }

    public static final SheetState write(boolean z, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final getAutofillTree getautofilltree, boolean z2, getBirthDateFull getbirthdatefull, int i, int i2) {
        final int i3 = 0;
        boolean z3 = (i2 & 1) != 0 ? false : z;
        boolean z4 = (i2 & 8) != 0 ? false : z2;
        final float f = BottomSheetDefaults.serializer;
        final float f2 = BottomSheetDefaults.read;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        final Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
        boolean z5 = getpostalcode.read(density);
        final int i4 = 1;
        boolean z6 = (((57344 & i) ^ 24576) > 16384 && getpostalcode.serializer(f)) || (i & 24576) == 16384;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if ((z5 | z6) || objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.set_anyPointerZYK4Wgo
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i5 = i3;
                    float f3 = f;
                    androidx.compose.ui.unit.Density density2 = density;
                    return Float.valueOf(i5 != 0 ? density2.mo48toPx0680j_4(f3) : density2.mo48toPx0680j_4(f3));
                }
            };
            getpostalcode.write(objComponentActivity);
        }
        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
        boolean z7 = getpostalcode.read(density);
        boolean z8 = (((458752 & i) ^ 196608) > 131072 && getpostalcode.serializer(f2)) || (i & 196608) == 131072;
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if ((z7 | z8) || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.set_anyPointerZYK4Wgo
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i5 = i4;
                    float f3 = f2;
                    androidx.compose.ui.unit.Density density2 = density;
                    return Float.valueOf(i5 != 0 ? density2.mo48toPx0680j_4(f3) : density2.mo48toPx0680j_4(f3));
                }
            };
            getpostalcode.write(objComponentActivity2);
        }
        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
        Object[] objArr = {Boolean.valueOf(z3), r8lambdaunavo3sxub_pc9xroryotnrlvsm, Boolean.valueOf(z4)};
        final boolean z9 = z3;
        final boolean z10 = z4;
        CardView$1 cardView$1 = new CardView$1(new ScrollState$$ExternalSyntheticLambda3(9), 5, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.AndroidAutofill
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                return new androidx.compose.material3.SheetState(z9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (getAutofillTree) obj, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z10);
            }
        });
        boolean z11 = (((i & 14) ^ 6) > 4 && getpostalcode.write(z3)) || (i & 6) == 4;
        boolean z12 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        boolean z13 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
        boolean z14 = (((i & 896) ^ 384) > 256 && getpostalcode.read(getautofilltree.ordinal())) || (i & 384) == 256;
        boolean z15 = (((i & 112) ^ 48) > 32 && getpostalcode.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) || (i & 48) == 32;
        boolean z16 = (((i & 7168) ^ 3072) > 2048 && getpostalcode.write(z4)) || (i & 3072) == 2048;
        Object objComponentActivity3 = getpostalcode.ComponentActivity();
        if ((z11 | z12 | z13 | z14 | z15 | z16) || objComponentActivity3 == androidContentCaptureManager) {
            final boolean z17 = z3;
            final boolean z18 = z4;
            objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.set_windowPostureInyEWag
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    return new androidx.compose.material3.SheetState(z17, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getautofilltree, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z18);
                }
            };
            getpostalcode.write(objComponentActivity3);
        }
        return (SheetState) getEventType.RemoteActionCompatParcelizer(objArr, cardView$1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, 0);
    }
}
