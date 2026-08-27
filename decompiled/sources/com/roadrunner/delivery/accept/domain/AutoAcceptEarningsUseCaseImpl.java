package com.roadrunner.delivery.accept.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.BundleUtil;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onContentCardDismissed;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptEarningsUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final InitializeAppStartupItemsImpl IconCompatParcelizer;

    public AutoAcceptEarningsUseCaseImpl(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl) {
        this.IconCompatParcelizer = initializeAppStartupItemsImpl;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: autoAcceptEarnings-gIAlu-s, reason: not valid java name */
    public final Object m4900autoAcceptEarningsgIAlus(List list, ContinuationImpl continuationImpl) {
        AutoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1 autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1;
        int i;
        int i2;
        int i3;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i4;
        Object objM4856getAutoAcceptEarningsgIAlus;
        int i5;
        int i6 = 2 % 2;
        int i7 = RemoteActionCompatParcelizer + 45;
        write = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            if (continuationImpl instanceof AutoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1) {
                autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1 = (AutoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1) continuationImpl;
                i = autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    i2 = write + 3;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        i3 = i % Integer.MIN_VALUE;
                    } else {
                        i3 = i - Integer.MIN_VALUE;
                    }
                    autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.write = i3;
                    int i8 = RemoteActionCompatParcelizer + 101;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
            }
            obj = autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.serializer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i4 = autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.write;
            if (i4 == 0) {
                i5 = write + 25;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(list, BundleUtil.UNDERLINE_TAG, null, null, null, 62);
            autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.write = 1;
            objM4856getAutoAcceptEarningsgIAlus = this.IconCompatParcelizer.m4856getAutoAcceptEarningsgIAlus(strIconCompatParcelizer, autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1);
            if (objM4856getAutoAcceptEarningsgIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objM4856getAutoAcceptEarningsgIAlus;
        }
        int i10 = 28 / 0;
        if (continuationImpl instanceof AutoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1) {
            autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1 = (AutoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1) continuationImpl;
            i = autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                i2 = write + 3;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    i3 = i % Integer.MIN_VALUE;
                } else {
                    i3 = i - Integer.MIN_VALUE;
                }
                autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.write = i3;
                int i11 = RemoteActionCompatParcelizer + 101;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
        }
        obj = autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.write;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String strIconCompatParcelizer2 = onContentCardDismissed.IconCompatParcelizer(list, BundleUtil.UNDERLINE_TAG, null, null, null, 62);
            autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.write = 1;
            objM4856getAutoAcceptEarningsgIAlus = this.IconCompatParcelizer.m4856getAutoAcceptEarningsgIAlus(strIconCompatParcelizer2, autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1);
            if (objM4856getAutoAcceptEarningsgIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objM4856getAutoAcceptEarningsgIAlus;
        }
        i5 = write + 25;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return ((onItemDismiss) obj).IconCompatParcelizer;
        autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1 = new AutoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1(this, continuationImpl);
        obj = autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.write;
        if (i4 == 0) {
            i5 = write + 25;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        String strIconCompatParcelizer3 = onContentCardDismissed.IconCompatParcelizer(list, BundleUtil.UNDERLINE_TAG, null, null, null, 62);
        autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1.write = 1;
        objM4856getAutoAcceptEarningsgIAlus = this.IconCompatParcelizer.m4856getAutoAcceptEarningsgIAlus(strIconCompatParcelizer3, autoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1);
        if (objM4856getAutoAcceptEarningsgIAlus == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objM4856getAutoAcceptEarningsgIAlus;
    }
}
