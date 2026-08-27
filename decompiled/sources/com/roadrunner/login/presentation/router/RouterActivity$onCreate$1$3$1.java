package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.cb;
import o.cc;
import o.createFromParcel;
import o.isInvalidIndex;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RouterActivity$onCreate$1$3$1 implements FlowCollector, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final /* synthetic */ RouterActivity serializer;

    public /* synthetic */ RouterActivity$onCreate$1$3$1(RouterActivity routerActivity, int i) {
        this.read = i;
        this.serializer = routerActivity;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.read == 0) {
            return getFunctionDelegate().hashCode();
        }
        int iHashCode = getFunctionDelegate().hashCode();
        int i3 = IconCompatParcelizer + 117;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 15;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        RouterActivity routerActivity = this.serializer;
        if (i3 == 0) {
            RouterActivity.write(routerActivity, (cb) obj);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return createfromparcel2;
        }
        RouterActivity.write(BottomSheetBehavior.IconCompatParcelizer(), new Object[]{routerActivity, (cc) obj}, BottomSheetBehavior.IconCompatParcelizer(), BottomSheetBehavior.IconCompatParcelizer(), -905510286, 905510286, BottomSheetBehavior.IconCompatParcelizer());
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = write + 109;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel2;
        }
        throw null;
    }

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read == 0) {
            return new AdaptedFunctionReference(2, 4, RouterActivity.class, this.serializer, "handleAuthAction", "handleAuthAction(Lcom/roadrunner/login/presentation/router/model/AuthenticationAction;)V");
        }
        AdaptedFunctionReference adaptedFunctionReference = new AdaptedFunctionReference(2, 4, RouterActivity.class, this.serializer, "handleRouterAction", "handleRouterAction(Lcom/roadrunner/login/presentation/router/model/RouterAction;)V");
        int i4 = IconCompatParcelizer + 99;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return adaptedFunctionReference;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this.read != 0) {
            if ((!(obj instanceof FlowCollector)) || !(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
                return false;
            }
            boolean zEquals = getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
            int i2 = IconCompatParcelizer + 119;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return zEquals;
        }
        if (!(obj instanceof FlowCollector)) {
            return false;
        }
        int i4 = write + 115;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            boolean z = obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
            throw null;
        }
        if (obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) {
            return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
        }
        return false;
    }
}
