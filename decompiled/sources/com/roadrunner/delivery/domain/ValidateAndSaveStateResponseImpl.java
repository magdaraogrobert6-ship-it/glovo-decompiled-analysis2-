package com.roadrunner.delivery.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createFromParcel;
import o.getMaxFlingVelocity;

/* JADX INFO: loaded from: classes3.dex */
public final class ValidateAndSaveStateResponseImpl {
    private static int serializer = 1;
    private static int write;
    public final InitializeAppStartupItemsImpl IconCompatParcelizer;

    public ValidateAndSaveStateResponseImpl(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl) {
        initializeAppStartupItemsImpl.getClass();
        this.IconCompatParcelizer = initializeAppStartupItemsImpl;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4911invokegIAlus(getMaxFlingVelocity getmaxflingvelocity, ContinuationImpl continuationImpl) {
        ValidateAndSaveStateResponseImpl$invoke$1 validateAndSaveStateResponseImpl$invoke$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String string;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 125;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            if (continuationImpl instanceof ValidateAndSaveStateResponseImpl$invoke$1) {
                validateAndSaveStateResponseImpl$invoke$1 = (ValidateAndSaveStateResponseImpl$invoke$1) continuationImpl;
                i3 = validateAndSaveStateResponseImpl$invoke$1.read;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    int i6 = write + 59;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    validateAndSaveStateResponseImpl$invoke$1.read = i3 - Integer.MIN_VALUE;
                }
            }
            obj = validateAndSaveStateResponseImpl$invoke$1.RemoteActionCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = validateAndSaveStateResponseImpl$invoke$1.read;
            if (i != 0) {
                int i8 = write;
                i2 = i8 + 87;
                serializer = i2 % Fields.SpotShadowColor;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            string = getmaxflingvelocity.jsonBody.toString();
            validateAndSaveStateResponseImpl$invoke$1.read = 1;
            if (this.IconCompatParcelizer.invoke(string, validateAndSaveStateResponseImpl$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return createFromParcel.INSTANCE;
        }
        int i9 = 49 / 0;
        if (continuationImpl instanceof ValidateAndSaveStateResponseImpl$invoke$1) {
            validateAndSaveStateResponseImpl$invoke$1 = (ValidateAndSaveStateResponseImpl$invoke$1) continuationImpl;
            i3 = validateAndSaveStateResponseImpl$invoke$1.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i10 = write + 59;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                validateAndSaveStateResponseImpl$invoke$1.read = i3 - Integer.MIN_VALUE;
            }
        }
        obj = validateAndSaveStateResponseImpl$invoke$1.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = validateAndSaveStateResponseImpl$invoke$1.read;
        if (i != 0) {
            int i12 = write;
            i2 = i12 + 87;
            serializer = i2 % Fields.SpotShadowColor;
            Object obj3 = null;
            if (i2 % 2 == 0 ? i != 1 : i != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = i12 + 123;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj3.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            string = getmaxflingvelocity.jsonBody.toString();
            validateAndSaveStateResponseImpl$invoke$1.read = 1;
            if (this.IconCompatParcelizer.invoke(string, validateAndSaveStateResponseImpl$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
        validateAndSaveStateResponseImpl$invoke$1 = new ValidateAndSaveStateResponseImpl$invoke$1(this, continuationImpl);
        int i14 = write + 65;
        serializer = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        obj = validateAndSaveStateResponseImpl$invoke$1.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = validateAndSaveStateResponseImpl$invoke$1.read;
        if (i != 0) {
            int i16 = write;
            i2 = i16 + 87;
            serializer = i2 % Fields.SpotShadowColor;
            Object obj4 = null;
            if (i2 % 2 == 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        string = getmaxflingvelocity.jsonBody.toString();
        validateAndSaveStateResponseImpl$invoke$1.read = 1;
        if (this.IconCompatParcelizer.invoke(string, validateAndSaveStateResponseImpl$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return createFromParcel.INSTANCE;
    }
}
