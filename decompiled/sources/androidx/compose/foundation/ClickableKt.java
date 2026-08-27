package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.semantics.Role;
import o.LazyListState;
import o.MediaQuery_androidKtobtainUiMediaScope41;
import o.PagerMeasurePolicyKtrememberPagerMeasurePolicy11;
import o.PagerMeasureResult;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ClickableKt {
    public static Modifier RemoteActionCompatParcelizer(Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return modifier.then(new CombinedClickableElement(mutableInteractionSourceImpl, false, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null));
    }

    public static final boolean RemoteActionCompatParcelizer(KeyEvent keyEvent) {
        long jM1901getKeyZmokQxo = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        return Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1654getDirectionCenterEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1668getEnterEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1765getNumPadEnterEK5gGoQ()) || Key.m1581equalsimpl0(jM1901getKeyZmokQxo, companion.m1816getSpacebarEK5gGoQ());
    }

    public static Modifier serializer(Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        return modifier.then(new CombinedClickableElement(null, true, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public static final Modifier serializer(Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11, boolean z, Role role, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        Modifier modifierComposed$default;
        if (pagerMeasurePolicyKtrememberPagerMeasurePolicy11 != null) {
            modifierComposed$default = new ClickableElement(mutableInteractionSourceImpl, pagerMeasurePolicyKtrememberPagerMeasurePolicy11, false, z, null, role, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        } else if (pagerMeasurePolicyKtrememberPagerMeasurePolicy11 == null) {
            modifierComposed$default = new ClickableElement(mutableInteractionSourceImpl, null, false, z, null, role, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        } else if (mutableInteractionSourceImpl != null) {
            modifierComposed$default = PagerMeasureResult.RemoteActionCompatParcelizer(Modifier.Companion, mutableInteractionSourceImpl, pagerMeasurePolicyKtrememberPagerMeasurePolicy11).then(new ClickableElement(mutableInteractionSourceImpl, null, false, z, null, role, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
        } else {
            modifierComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new LazyListState(pagerMeasurePolicyKtrememberPagerMeasurePolicy11, z, role, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), 1, null);
        }
        return modifier.then(modifierComposed$default);
    }

    public static /* synthetic */ Modifier serializer(Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, MediaQuery_androidKtobtainUiMediaScope41 mediaQuery_androidKtobtainUiMediaScope41, boolean z, Role role, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            role = null;
        }
        return serializer(modifier, mutableInteractionSourceImpl, mediaQuery_androidKtobtainUiMediaScope41, z2, role, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static Modifier RemoteActionCompatParcelizer(Modifier modifier, boolean z, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return modifier.then(new ClickableElement(null, null, true, z2, str, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }
}
