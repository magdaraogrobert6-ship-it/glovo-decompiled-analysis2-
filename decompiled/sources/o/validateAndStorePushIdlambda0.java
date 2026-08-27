package o;

import com.roadrunner.vendor.review.api.presentation.VendorReviewOptionKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class validateAndStorePushIdlambda0 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ int write;

    public /* synthetic */ validateAndStorePushIdlambda0(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.write = 1;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = z;
    }

    public /* synthetic */ validateAndStorePushIdlambda0(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z) {
        this.write = i;
        this.read = z;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = 2 % 2;
        int i3 = this.write;
        boolean z = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i3 == 0) {
            ((Integer) obj3).getClass();
            ((androidx.compose.animation.AnimatedVisibilityScope) obj).getClass();
            subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0 = subscribeToNoMatchingTriggerForEventlambda0.NEGATIVE;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            companion.getClass();
            VendorReviewOptionKt.serializer(subscribetonomatchingtriggerforeventlambda0, this.read, this.IconCompatParcelizer, companion, (getBirthDateFull) obj2, 3078);
            int i4 = RemoteActionCompatParcelizer + 79;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return createfromparcel;
            }
            throw null;
        }
        boolean z2 = false;
        if (i3 == 1) {
            androidx.compose.ui.Modifier modifier = (androidx.compose.ui.Modifier) obj;
            ((Integer) obj3).getClass();
            getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj2);
            getpostalcode.serializer(-196777734);
            long j = ((setChildui) getpostalcode.write((getNewPassword) runDetachLifecycleui.read)).read;
            boolean zSerializer = getpostalcode.serializer(j);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
            boolean z3 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            boolean zWrite = getpostalcode.write(z);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zSerializer | z3 | zWrite) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new execAdidCallbackCommand(j, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z);
                getpostalcode.write(objComponentActivity);
            }
            androidx.compose.ui.Modifier modifierDrawWithCache = androidx.compose.ui.draw.DrawModifierKt.drawWithCache(modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity);
            getpostalcode.IconCompatParcelizer(false);
            return modifierDrawWithCache;
        }
        if (i3 != 2) {
            ((Integer) obj3).getClass();
            ((androidx.compose.animation.AnimatedVisibilityScope) obj).getClass();
            subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda1 = subscribeToNoMatchingTriggerForEventlambda0.POSITIVE;
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
            companion2.getClass();
            VendorReviewOptionKt.serializer(subscribetonomatchingtriggerforeventlambda1, this.read, this.IconCompatParcelizer, companion2, (getBirthDateFull) obj2, 3078);
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((IconButtonKt) obj).getClass();
        if ((iIntValue & 17) != 16) {
            int i5 = serializer + 83;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z2 = true;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        if (getpostalcode2.write(1 & iIntValue, z2)) {
            if (z) {
                i = com.logistics.rider.glovo.R.drawable.ic_bold_medium_arrow_up;
            } else {
                int i7 = serializer + 115;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i = com.logistics.rider.glovo.R.drawable.ic_bold_medium_arrow_down;
            }
            int i9 = i;
            int i10 = serializer + 27;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
            companion3.getClass();
            getRootCause.read(i9, this.IconCompatParcelizer, companion3, null, false, null, null, getpostalcode2, 384, 248);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
