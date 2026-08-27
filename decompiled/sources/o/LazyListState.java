package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class LazyListState implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ PagerMeasurePolicyKtrememberPagerMeasurePolicy11 IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.semantics.Role read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj2);
        getpostalcode.serializer(-1525724089);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
        }
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) objComponentActivity;
        androidx.compose.ui.Modifier modifierThen = PagerMeasureResult.RemoteActionCompatParcelizer(androidx.compose.ui.Modifier.Companion, mutableInteractionSourceImpl, this.IconCompatParcelizer).then(new androidx.compose.foundation.ClickableElement(mutableInteractionSourceImpl, null, false, this.serializer, null, this.read, this.write));
        getpostalcode.IconCompatParcelizer(false);
        return modifierThen;
    }

    public LazyListState(PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11, boolean z, androidx.compose.ui.semantics.Role role, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = pagerMeasurePolicyKtrememberPagerMeasurePolicy11;
        this.serializer = z;
        this.read = role;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }
}
