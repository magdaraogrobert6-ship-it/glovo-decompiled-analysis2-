package com.roadrunner.auth.domain.token;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.SemanticsPropertiesContentDescription1;
import o.pageRight;

/* JADX INFO: loaded from: classes3.dex */
public final class IsUserAuthenticatedWrapper {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final InitializeAppStartupItemsImpl RemoteActionCompatParcelizer;
    public final SemanticsPropertiesContentDescription1 read;

    public IsUserAuthenticatedWrapper(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1) {
        initializeAppStartupItemsImpl.getClass();
        semanticsPropertiesContentDescription1.getClass();
        this.RemoteActionCompatParcelizer = initializeAppStartupItemsImpl;
        this.read = semanticsPropertiesContentDescription1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        pageRight pageright;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof pageRight) {
            int i2 = IconCompatParcelizer + 21;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((pageRight) continuationImpl).serializer;
                obj.hashCode();
                throw null;
            }
            pageright = (pageRight) continuationImpl;
            int i4 = pageright.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pageright.serializer = i4 - Integer.MIN_VALUE;
            } else {
                pageright = new pageRight(this, continuationImpl);
            }
        } else {
            pageright = new pageRight(this, continuationImpl);
        }
        Object objInvoke = pageright.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = pageright.serializer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            pageright.serializer = 1;
            objInvoke = ((IsUserSignedInImpl) this.read).invoke(pageright);
            if (objInvoke == coroutineSingletons) {
                int i6 = write + 7;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        if (i5 != 1) {
            int i8 = IconCompatParcelizer + 99;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? i5 != 2 : i5 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            return objInvoke;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        pageright.serializer = 2;
        Object objInvoke2 = this.RemoteActionCompatParcelizer.invoke(pageright);
        return objInvoke2 == coroutineSingletons ? coroutineSingletons : objInvoke2;
    }
}
