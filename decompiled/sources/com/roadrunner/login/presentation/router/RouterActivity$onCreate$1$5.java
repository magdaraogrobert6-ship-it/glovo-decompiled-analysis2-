package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import o.createFromParcel;
import o.isInvalidIndex;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
import o.requestLocationInitialization;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RouterActivity$onCreate$1$5 implements requestLocationInitialization, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ GetAuthStateViewModel IconCompatParcelizer;

    public RouterActivity$onCreate$1$5(GetAuthStateViewModel getAuthStateViewModel) {
        this.IconCompatParcelizer = getAuthStateViewModel;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 89;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = getFunctionDelegate().hashCode();
        int i4 = read + 71;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        int i = 2 % 2;
        FunctionReferenceImpl functionReferenceImpl = new FunctionReferenceImpl(0, 0, GetAuthStateViewModel.class, this.IconCompatParcelizer, "onIdentityVerificationFinished", "onIdentityVerificationFinished()V");
        int i2 = read + 29;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
        return functionReferenceImpl;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        GetAuthStateViewModel getAuthStateViewModel = this.IconCompatParcelizer;
        getAuthStateViewModel.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(getAuthStateViewModel), null, null, new GetAuthStateViewModel$goToLogin$2(getAuthStateViewModel, null, 1), 3);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = RemoteActionCompatParcelizer + 9;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return createfromparcel;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj instanceof requestLocationInitialization) {
            int i2 = read + 29;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) {
                return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
            }
        }
        int i4 = RemoteActionCompatParcelizer + 37;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
