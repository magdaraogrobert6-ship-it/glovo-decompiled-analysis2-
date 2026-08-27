package com.roadrunner.delivery.accept.autoaccept.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.acknowledgment.implementation.data.TimestampRepositoryImpl$delete$2;
import com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl;
import com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import o.PlaceholderSpan_androidKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaJjCgqmaYBJJANZ2GQOSPbFPSBZg;
import o.r8lambdaMEteIxqIK4Ob6kupUcwT0lfQUp0;
import o.r8lambdaPabvzeZJPOXN9KgGoFGOJE5Boas;
import o.setCustomInAppMessageAnimationFactorylambda0;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptRequestManagerImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final transferSessionPackageI IconCompatParcelizer;
    public final MutexImpl read = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    public final AutoAcceptRequestStateRepositoryImpl serializer;

    public AutoAcceptRequestManagerImpl(AutoAcceptRequestStateRepositoryImpl autoAcceptRequestStateRepositoryImpl, transferSessionPackageI transfersessionpackagei) {
        this.serializer = autoAcceptRequestStateRepositoryImpl;
        this.IconCompatParcelizer = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object setRequestRunning(ContinuationImpl continuationImpl) {
        r8lambdaJjCgqmaYBJJANZ2GQOSPbFPSBZg r8lambdajjcgqmaybjjanz2gqospbfpsbzg;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        int i;
        Throwable th;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1;
        int i2 = 2 % 2;
        if (continuationImpl instanceof r8lambdaJjCgqmaYBJJANZ2GQOSPbFPSBZg) {
            int i3 = RemoteActionCompatParcelizer + 81;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            r8lambdajjcgqmaybjjanz2gqospbfpsbzg = (r8lambdaJjCgqmaYBJJANZ2GQOSPbFPSBZg) continuationImpl;
            int i5 = r8lambdajjcgqmaybjjanz2gqospbfpsbzg.write;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                r8lambdajjcgqmaybjjanz2gqospbfpsbzg.write = i5 - Integer.MIN_VALUE;
            } else {
                r8lambdajjcgqmaybjjanz2gqospbfpsbzg = new r8lambdaJjCgqmaYBJJANZ2GQOSPbFPSBZg(this, continuationImpl);
            }
        } else {
            r8lambdajjcgqmaybjjanz2gqospbfpsbzg = new r8lambdaJjCgqmaYBJJANZ2GQOSPbFPSBZg(this, continuationImpl);
        }
        Object obj = r8lambdajjcgqmaybjjanz2gqospbfpsbzg.RemoteActionCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = r8lambdajjcgqmaybjjanz2gqospbfpsbzg.write;
        try {
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                setcustominappmessageanimationfactorylambda0 = this.read;
                r8lambdajjcgqmaybjjanz2gqospbfpsbzg.read = setcustominappmessageanimationfactorylambda0;
                r8lambdajjcgqmaybjjanz2gqospbfpsbzg.serializer = 0;
                r8lambdajjcgqmaybjjanz2gqospbfpsbzg.write = 1;
                if (setcustominappmessageanimationfactorylambda0.lock(r8lambdajjcgqmaybjjanz2gqospbfpsbzg) == obj2) {
                    int i7 = write + 13;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    i = 0;
                }
                int i9 = RemoteActionCompatParcelizer + 103;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return obj2;
            }
            int i11 = RemoteActionCompatParcelizer + 101;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0 ? i6 != 1 : i6 != 1) {
                if (i6 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                setcustominappmessageanimationfactorylambda1 = r8lambdajjcgqmaybjjanz2gqospbfpsbzg.read;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    setcustominappmessageanimationfactorylambda1.write(null);
                    return createfromparcel;
                } catch (Throwable th2) {
                    setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda2 = setcustominappmessageanimationfactorylambda1;
                    th = th2;
                    setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda2;
                    setcustominappmessageanimationfactorylambda0.write(null);
                    throw th;
                }
            }
            i = r8lambdajjcgqmaybjjanz2gqospbfpsbzg.serializer;
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda3 = r8lambdajjcgqmaybjjanz2gqospbfpsbzg.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda3;
            r8lambdajjcgqmaybjjanz2gqospbfpsbzg.read = setcustominappmessageanimationfactorylambda0;
            r8lambdajjcgqmaybjjanz2gqospbfpsbzg.serializer = i;
            r8lambdajjcgqmaybjjanz2gqospbfpsbzg.write = 2;
            if (setRequestRunningUnlocked(false, r8lambdajjcgqmaybjjanz2gqospbfpsbzg) != obj2) {
                setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                setcustominappmessageanimationfactorylambda1.write(null);
                return createfromparcel2;
            }
            int i12 = RemoteActionCompatParcelizer + 103;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return obj2;
        } catch (Throwable th3) {
            th = th3;
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    public final Object setRequestRunningUnlocked(boolean z, ContinuationImpl continuationImpl) {
        r8lambdaMEteIxqIK4Ob6kupUcwT0lfQUp0 r8lambdameteixqik4ob6kupucwt0lfqup0;
        int i = 2 % 2;
        int i2 = write + 65;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PlaceholderSpan_androidKt placeholderSpan_androidKt = this.serializer.RemoteActionCompatParcelizer;
        if (continuationImpl instanceof r8lambdaMEteIxqIK4Ob6kupUcwT0lfQUp0) {
            r8lambdameteixqik4ob6kupucwt0lfqup0 = (r8lambdaMEteIxqIK4Ob6kupUcwT0lfQUp0) continuationImpl;
            int i4 = r8lambdameteixqik4ob6kupucwt0lfqup0.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 25;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                r8lambdameteixqik4ob6kupucwt0lfqup0.read = i5 % 2 != 0 ? i4 / Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                r8lambdameteixqik4ob6kupucwt0lfqup0 = new r8lambdaMEteIxqIK4Ob6kupUcwT0lfQUp0(this, continuationImpl);
            }
        } else {
            r8lambdameteixqik4ob6kupucwt0lfqup0 = new r8lambdaMEteIxqIK4Ob6kupUcwT0lfQUp0(this, continuationImpl);
        }
        Object obj = r8lambdameteixqik4ob6kupucwt0lfqup0.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = r8lambdameteixqik4ob6kupucwt0lfqup0.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i7 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i8 = 1;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambdameteixqik4ob6kupucwt0lfqup0.RemoteActionCompatParcelizer = z;
            r8lambdameteixqik4ob6kupucwt0lfqup0.read = 1;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(placeholderSpan_androidKt.read(), new AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2(z, shortNewsContentCardView, i7), r8lambdameteixqik4ob6kupucwt0lfqup0);
            if (objSerializer == coroutineSingletons) {
                int i9 = write + 13;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i6 != 1) {
            int i11 = write + 103;
            int i12 = i11 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i12;
            if (i11 % 2 == 0 ? i6 != 2 : i6 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = i12 + 87;
            write = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i14 = 25 / 0;
            return createfromparcel;
        }
        z = r8lambdameteixqik4ob6kupucwt0lfqup0.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            r8lambdameteixqik4ob6kupucwt0lfqup0.RemoteActionCompatParcelizer = z;
            r8lambdameteixqik4ob6kupucwt0lfqup0.read = 2;
            Object objSerializer2 = pauseWebviewIfNecessarylambda10.serializer(placeholderSpan_androidKt.read(), new TimestampRepositoryImpl$delete$2(jCurrentTimeMillis, shortNewsContentCardView, i8), r8lambdameteixqik4ob6kupucwt0lfqup0);
            if (objSerializer2 != coroutineSingletons) {
                objSerializer2 = createfromparcel;
            }
            if (objSerializer2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00eb A[Catch: all -> 0x016f, TryCatch #3 {all -> 0x016f, blocks: (B:29:0x007a, B:51:0x00e3, B:53:0x00eb, B:54:0x00f6), top: B:86:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6 A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #3 {all -> 0x016f, blocks: (B:29:0x007a, B:51:0x00e3, B:53:0x00eb, B:54:0x00f6), top: B:86:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:60:0x0113 A[Catch: all -> 0x016c, TryCatch #2 {all -> 0x016c, blocks: (B:18:0x0051, B:58:0x010f, B:60:0x0113, B:62:0x0131, B:65:0x014f, B:33:0x0089), top: B:85:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0131 A[Catch: all -> 0x016c, TryCatch #2 {all -> 0x016c, blocks: (B:18:0x0051, B:58:0x010f, B:60:0x0113, B:62:0x0131, B:65:0x014f, B:33:0x0089), top: B:85:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014d  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0131, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptRequestManagerImpl] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    public final Object canPerformRequest(ContinuationImpl continuationImpl) {
        r8lambdaPabvzeZJPOXN9KgGoFGOJE5Boas r8lambdapabvzezjpoxn9kggofgoje5boas;
        ?? r10;
        ?? r14;
        int i;
        int i2;
        int i3;
        ?? r11;
        ?? r2;
        ?? r15;
        boolean zBooleanValue;
        Object lastRequestTime;
        int i4;
        ?? r3;
        int i5;
        boolean z;
        ?? r4;
        Long l;
        boolean z2;
        long jWrite;
        long jCurrentTimeMillis;
        ?? r5;
        int i6 = 2 % 2;
        boolean z3 = true;
        if (!(continuationImpl instanceof r8lambdaPabvzeZJPOXN9KgGoFGOJE5Boas)) {
            r8lambdapabvzezjpoxn9kggofgoje5boas = new r8lambdaPabvzeZJPOXN9KgGoFGOJE5Boas(this, continuationImpl);
        } else {
            r8lambdapabvzezjpoxn9kggofgoje5boas = (r8lambdaPabvzeZJPOXN9KgGoFGOJE5Boas) continuationImpl;
            int i7 = r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
                int i8 = RemoteActionCompatParcelizer + 97;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                r8lambdapabvzezjpoxn9kggofgoje5boas = new r8lambdaPabvzeZJPOXN9KgGoFGOJE5Boas(this, continuationImpl);
            }
        }
        Object isRequestRunning = r8lambdapabvzezjpoxn9kggofgoje5boas.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer;
        AutoAcceptRequestStateRepositoryImpl autoAcceptRequestStateRepositoryImpl = this.serializer;
        transferSessionPackageI transfersessionpackagei = this.IconCompatParcelizer;
        try {
            try {
                if (i10 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(isRequestRunning);
                    MutexImpl mutexImpl = this.read;
                    r8lambdapabvzezjpoxn9kggofgoje5boas.write = mutexImpl;
                    r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer = 0;
                    r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer = 1;
                    if (mutexImpl.lock(r8lambdapabvzezjpoxn9kggofgoje5boas) != coroutineSingletons) {
                        r14 = mutexImpl;
                        i = 0;
                    }
                    return coroutineSingletons;
                }
                if (i10 != 1) {
                    int i11 = RemoteActionCompatParcelizer + 65;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                boolean z4 = r8lambdapabvzezjpoxn9kggofgoje5boas.read;
                                int i13 = r8lambdapabvzezjpoxn9kggofgoje5boas.serializer;
                                int i14 = r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer;
                                r10 = r8lambdapabvzezjpoxn9kggofgoje5boas.write;
                                try {
                                    ExtrasKt.RemoteActionCompatParcelizer(isRequestRunning);
                                    i5 = i13;
                                    z = z4;
                                    r3 = r10;
                                    i4 = i14;
                                    int i15 = i5;
                                    l = (Long) isRequestRunning;
                                    if (l != null) {
                                        jWrite = ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("auto_accept_throttle_interval");
                                        jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                                        if (jCurrentTimeMillis <= jWrite * 1000) {
                                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Auto-accept: A new request was triggered before the throttle interval elapsed (" + jCurrentTimeMillis + " ms)", new Object[0]);
                                            r4 = r3;
                                            z3 = false;
                                            r2 = r4;
                                        }
                                    }
                                    r8lambdapabvzezjpoxn9kggofgoje5boas.write = r3;
                                    r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer = i4;
                                    r8lambdapabvzezjpoxn9kggofgoje5boas.serializer = i15;
                                    r8lambdapabvzezjpoxn9kggofgoje5boas.read = z;
                                    r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer = 5;
                                    z2 = true;
                                    r5 = r3;
                                    if (setRequestRunningUnlocked(true, r8lambdapabvzezjpoxn9kggofgoje5boas) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } else {
                                if (i10 != 5) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0 = r8lambdapabvzezjpoxn9kggofgoje5boas.write;
                                ExtrasKt.RemoteActionCompatParcelizer(isRequestRunning);
                                z2 = true;
                                r5 = setcustominappmessageanimationfactorylambda0;
                            }
                            z3 = z2;
                            r2 = r5;
                        } else {
                            int i16 = r8lambdapabvzezjpoxn9kggofgoje5boas.serializer;
                            int i17 = r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer;
                            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = r8lambdapabvzezjpoxn9kggofgoje5boas.write;
                            try {
                                ExtrasKt.RemoteActionCompatParcelizer(isRequestRunning);
                                i3 = i16;
                                i2 = i17;
                                r11 = setcustominappmessageanimationfactorylambda1;
                                r15 = i12;
                                zBooleanValue = ((Boolean) isRequestRunning).booleanValue();
                                if (!zBooleanValue) {
                                    r8lambdapabvzezjpoxn9kggofgoje5boas.write = r11;
                                    r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer = i2;
                                    r8lambdapabvzezjpoxn9kggofgoje5boas.serializer = i3;
                                    r8lambdapabvzezjpoxn9kggofgoje5boas.read = zBooleanValue;
                                    r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer = 4;
                                    lastRequestTime = autoAcceptRequestStateRepositoryImpl.getLastRequestTime(r8lambdapabvzezjpoxn9kggofgoje5boas);
                                    if (lastRequestTime != coroutineSingletons) {
                                        r14 = r15;
                                        i4 = i2;
                                        r3 = r11;
                                        i5 = i3;
                                        z = zBooleanValue;
                                        isRequestRunning = lastRequestTime;
                                        int i18 = i5;
                                        l = (Long) isRequestRunning;
                                        if (l != null) {
                                            jWrite = ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("auto_accept_throttle_interval");
                                            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                                            if (jCurrentTimeMillis <= jWrite * 1000) {
                                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Auto-accept: A new request was triggered before the throttle interval elapsed (" + jCurrentTimeMillis + " ms)", new Object[0]);
                                                r4 = r3;
                                            }
                                        }
                                        r8lambdapabvzezjpoxn9kggofgoje5boas.write = r3;
                                        r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer = i4;
                                        r8lambdapabvzezjpoxn9kggofgoje5boas.serializer = i18;
                                        r8lambdapabvzezjpoxn9kggofgoje5boas.read = z;
                                        r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer = 5;
                                        z2 = true;
                                        r5 = r3;
                                        if (setRequestRunningUnlocked(true, r8lambdapabvzezjpoxn9kggofgoje5boas) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        z3 = z2;
                                        r2 = r5;
                                    }
                                    r14 = r14;
                                    r14 = r15;
                                    return coroutineSingletons;
                                }
                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Auto-accept: A new request was triggered while the previous one is still running", new Object[0]);
                                r4 = r11;
                                z3 = false;
                                r2 = r4;
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = setcustominappmessageanimationfactorylambda1;
                            }
                        }
                        r10.write(null);
                        throw th;
                    }
                    setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda2 = r8lambdapabvzezjpoxn9kggofgoje5boas.write;
                    ExtrasKt.RemoteActionCompatParcelizer(isRequestRunning);
                    r2 = setcustominappmessageanimationfactorylambda2;
                } else {
                    i = r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer;
                    setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda3 = r8lambdapabvzezjpoxn9kggofgoje5boas.write;
                    ExtrasKt.RemoteActionCompatParcelizer(isRequestRunning);
                    r14 = setcustominappmessageanimationfactorylambda3;
                }
                r2.write(null);
                return Boolean.valueOf(z3);
                if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_AUTO_ACCEPT_MULTIPLE_REQUESTS_PREVENTION_ENABLED)) {
                    r8lambdapabvzezjpoxn9kggofgoje5boas.write = r14;
                    r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer = i;
                    r8lambdapabvzezjpoxn9kggofgoje5boas.serializer = 0;
                    r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer = 3;
                    isRequestRunning = autoAcceptRequestStateRepositoryImpl.getIsRequestRunning(r8lambdapabvzezjpoxn9kggofgoje5boas);
                    if (isRequestRunning != coroutineSingletons) {
                        r14 = r14;
                        i2 = i;
                        i3 = 0;
                        r11 = r14;
                        r15 = r14;
                        zBooleanValue = ((Boolean) isRequestRunning).booleanValue();
                        if (!zBooleanValue) {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Auto-accept: A new request was triggered while the previous one is still running", new Object[0]);
                            r4 = r11;
                        } else {
                            r8lambdapabvzezjpoxn9kggofgoje5boas.write = r11;
                            r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer = i2;
                            r8lambdapabvzezjpoxn9kggofgoje5boas.serializer = i3;
                            r8lambdapabvzezjpoxn9kggofgoje5boas.read = zBooleanValue;
                            r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer = 4;
                            lastRequestTime = autoAcceptRequestStateRepositoryImpl.getLastRequestTime(r8lambdapabvzezjpoxn9kggofgoje5boas);
                            if (lastRequestTime != coroutineSingletons) {
                                r14 = r15;
                                i4 = i2;
                                r3 = r11;
                                i5 = i3;
                                z = zBooleanValue;
                                isRequestRunning = lastRequestTime;
                                int i19 = i5;
                                l = (Long) isRequestRunning;
                                if (l != null) {
                                    jWrite = ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.write("auto_accept_throttle_interval");
                                    jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                                    if (jCurrentTimeMillis <= jWrite * 1000) {
                                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Auto-accept: A new request was triggered before the throttle interval elapsed (" + jCurrentTimeMillis + " ms)", new Object[0]);
                                        r4 = r3;
                                    }
                                }
                                r8lambdapabvzezjpoxn9kggofgoje5boas.write = r3;
                                r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer = i4;
                                r8lambdapabvzezjpoxn9kggofgoje5boas.serializer = i19;
                                r8lambdapabvzezjpoxn9kggofgoje5boas.read = z;
                                r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer = 5;
                                z2 = true;
                                r5 = r3;
                                if (setRequestRunningUnlocked(true, r8lambdapabvzezjpoxn9kggofgoje5boas) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                z3 = z2;
                                r2 = r5;
                                r2.write(null);
                                return Boolean.valueOf(z3);
                            }
                        }
                        z3 = false;
                        r2 = r4;
                        r2.write(null);
                        return Boolean.valueOf(z3);
                    }
                } else {
                    Timber.RemoteActionCompatParcelizer.getClass();
                    r8lambdapabvzezjpoxn9kggofgoje5boas.write = r14;
                    r8lambdapabvzezjpoxn9kggofgoje5boas.IconCompatParcelizer = i;
                    r8lambdapabvzezjpoxn9kggofgoje5boas.serializer = 0;
                    r8lambdapabvzezjpoxn9kggofgoje5boas.RemoteActionCompatParcelizer = 2;
                    if (setRequestRunningUnlocked(true, r8lambdapabvzezjpoxn9kggofgoje5boas) != coroutineSingletons) {
                        r2 = r14;
                        r2.write(null);
                        return Boolean.valueOf(z3);
                    }
                    r14 = r14;
                }
                r14 = r14;
                r14 = r15;
                return coroutineSingletons;
            } catch (Throwable th3) {
                th = th3;
                r10 = r14;
            }
        } catch (Throwable th4) {
            th = th4;
            r10 = 2;
        }
    }
}
