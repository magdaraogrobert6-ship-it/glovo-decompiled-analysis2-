package com.roadrunner.auth.domain.logout;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createFromParcel;
import o.getTextSubstitutiondelegate;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearAuthDataUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final AuthRepository read;

    public ClearAuthDataUseCaseImpl(AuthRepository authRepository) {
        authRepository.getClass();
        this.read = authRepository;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        getTextSubstitutiondelegate gettextsubstitutiondelegate;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        createFromParcel createfromparcel;
        Object objClear;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 95;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            if (continuationImpl instanceof getTextSubstitutiondelegate) {
                gettextsubstitutiondelegate = (getTextSubstitutiondelegate) continuationImpl;
                i4 = gettextsubstitutiondelegate.read;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    gettextsubstitutiondelegate.read = i4 - Integer.MIN_VALUE;
                }
            }
            obj = gettextsubstitutiondelegate.write;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = gettextsubstitutiondelegate.read;
            createfromparcel = createFromParcel.INSTANCE;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear auth start", new Object[0]);
                gettextsubstitutiondelegate.read = 1;
                objClear = this.read.serializer.clear(gettextsubstitutiondelegate);
                if (objClear != coroutineSingletons) {
                    objClear = createfromparcel;
                }
                if (objClear == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    i2 = RemoteActionCompatParcelizer + 47;
                    write = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        int i7 = 54 / 0;
                    }
                    return null;
                }
                i3 = RemoteActionCompatParcelizer + 7;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear auth end", new Object[0]);
            return createfromparcel;
        }
        int i8 = 8 / 0;
        if (!(!(continuationImpl instanceof getTextSubstitutiondelegate))) {
            gettextsubstitutiondelegate = (getTextSubstitutiondelegate) continuationImpl;
            i4 = gettextsubstitutiondelegate.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gettextsubstitutiondelegate.read = i4 - Integer.MIN_VALUE;
            }
        }
        obj = gettextsubstitutiondelegate.write;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gettextsubstitutiondelegate.read;
        createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear auth start", new Object[0]);
            gettextsubstitutiondelegate.read = 1;
            objClear = this.read.serializer.clear(gettextsubstitutiondelegate);
            if (objClear != coroutineSingletons) {
                objClear = createfromparcel;
            }
            if (objClear == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                i2 = RemoteActionCompatParcelizer + 47;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i9 = 54 / 0;
                }
                return null;
            }
            i3 = RemoteActionCompatParcelizer + 7;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear auth end", new Object[0]);
        return createfromparcel;
        gettextsubstitutiondelegate = new getTextSubstitutiondelegate(this, continuationImpl);
        obj = gettextsubstitutiondelegate.write;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gettextsubstitutiondelegate.read;
        createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear auth start", new Object[0]);
            gettextsubstitutiondelegate.read = 1;
            objClear = this.read.serializer.clear(gettextsubstitutiondelegate);
            if (objClear != coroutineSingletons) {
                objClear = createfromparcel;
            }
            if (objClear == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                i2 = RemoteActionCompatParcelizer + 47;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i10 = 54 / 0;
                }
                return null;
            }
            i3 = RemoteActionCompatParcelizer + 7;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear auth end", new Object[0]);
        return createfromparcel;
    }
}
