package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.HomeViewModel;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import o.createFromParcel;
import o.isInvalidIndex;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
import o.retryInAppMessageandroid_sdk_base_release;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RouterActivity$onCreate$1$6 implements retryInAppMessageandroid_sdk_base_release, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ GetAuthStateViewModel RemoteActionCompatParcelizer;

    public RouterActivity$onCreate$1$6(GetAuthStateViewModel getAuthStateViewModel) {
        this.RemoteActionCompatParcelizer = getAuthStateViewModel;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 31;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = getFunctionDelegate().hashCode();
        int i4 = serializer + 73;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return iHashCode;
    }

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        int i = 2 % 2;
        FunctionReferenceImpl functionReferenceImpl = new FunctionReferenceImpl(0, 0, GetAuthStateViewModel.class, this.RemoteActionCompatParcelizer, "onIdentityVerificationCanceled", "onIdentityVerificationCanceled()V");
        int i2 = write + 13;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return functionReferenceImpl;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        GetAuthStateViewModel getAuthStateViewModel = this.RemoteActionCompatParcelizer;
        getAuthStateViewModel.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(getAuthStateViewModel), null, null, new HomeViewModel.AnonymousClass1(getAuthStateViewModel, null, 21), 3);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = serializer + 3;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return createfromparcel;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 33;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        Object obj2 = null;
        if (obj instanceof retryInAppMessageandroid_sdk_base_release) {
            int i5 = i3 + 61;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) {
                int i7 = i3 + 67;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
                }
                getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
                obj2.hashCode();
                throw null;
            }
        }
        int i8 = i3 + 111;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
