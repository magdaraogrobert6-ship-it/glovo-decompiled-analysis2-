package com.deliveryhero.perseus.core.session;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusApp;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.MutexImpl;
import o.SuspendingTransacterImpl;
import o.SuspendingTransacterImpltransactionWithWrapper1;
import o.addPathoIyEayMdefault;
import o.build;
import o.clearGroup;
import o.getContentViewGroupParentLayout;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.prepareForActivityTransitionCarryover;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class AppSessionManagerImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final MutexImpl RemoteActionCompatParcelizer;
    public final PerseusUserLocalDataStoreImpl read;
    public final MutexImpl serializer;

    public AppSessionManagerImpl(PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl, ScreenStartObserver$$ExternalSyntheticLambda0 screenStartObserver$$ExternalSyntheticLambda0) {
        perseusUserLocalDataStoreImpl.getClass();
        this.read = perseusUserLocalDataStoreImpl;
        this.serializer = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(String str) {
        Iterator it;
        int i = 2 % 2;
        int i2 = write + 55;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            it = PerseusApp.serializer.iterator();
            int i3 = 87 / 0;
        } else {
            it = PerseusApp.serializer.iterator();
        }
        while (it.hasNext()) {
            SuspendingTransacterImpltransactionWithWrapper1 suspendingTransacterImpltransactionWithWrapper1 = (SuspendingTransacterImpltransactionWithWrapper1) it.next();
            suspendingTransacterImpltransactionWithWrapper1.getClass();
            str.getClass();
            SuspendingTransacterImpl suspendingTransacterImpl = (SuspendingTransacterImpl) suspendingTransacterImpltransactionWithWrapper1.IconCompatParcelizer.serializer;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = suspendingTransacterImpl.IconCompatParcelizer;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new GetNestScope$invoke$3(suspendingTransacterImpl, str, null, 19), 2);
        }
        int i4 = write + 87;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r0v6, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.deliveryhero.perseus.core.session.AppSessionManagerImpl] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    public final Object getAndIncrementSessionOffset(ContinuationImpl continuationImpl) throws Throwable {
        clearGroup cleargroup;
        ?? r3;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        int i;
        Object sessionOffset;
        int i2;
        ?? r0;
        long jLongValue;
        long j;
        ?? r1 = 2;
        int i3 = 2 % 2;
        if (continuationImpl instanceof clearGroup) {
            cleargroup = (clearGroup) continuationImpl;
            int i4 = cleargroup.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cleargroup.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
                int i5 = write + 115;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                cleargroup = new clearGroup(this, continuationImpl);
            }
        } else {
            cleargroup = new clearGroup(this, continuationImpl);
        }
        Object obj = cleargroup.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = cleargroup.RemoteActionCompatParcelizer;
        PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl = this.read;
        int i8 = 0;
        Object obj2 = null;
        try {
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                cleargroup.RemoteActionCompatParcelizer = 1;
                if (getUserSessionId(cleargroup) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i7 != 1) {
                int i9 = write + 51;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i7 == 2) {
                    int i11 = cleargroup.write;
                    setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = cleargroup.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    i = i11;
                    setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
                    cleargroup.serializer = setcustominappmessageanimationfactorylambda0;
                    cleargroup.write = i;
                    cleargroup.read = 0;
                    cleargroup.RemoteActionCompatParcelizer = 3;
                    sessionOffset = perseusUserLocalDataStoreImpl.getSessionOffset(cleargroup);
                    if (sessionOffset == coroutineSingletons) {
                        i2 = i;
                        obj = sessionOffset;
                        r0 = setcustominappmessageanimationfactorylambda0;
                        jLongValue = ((Number) obj).longValue();
                        cleargroup.serializer = r0;
                        cleargroup.write = i2;
                        cleargroup.read = i8;
                        cleargroup.IconCompatParcelizer = jLongValue;
                        cleargroup.RemoteActionCompatParcelizer = 4;
                        if (perseusUserLocalDataStoreImpl.putSessionOffset(1 + jLongValue, cleargroup) != coroutineSingletons) {
                            j = jLongValue;
                            r1 = r0;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i7 == 3) {
                    i8 = cleargroup.read;
                    int i12 = cleargroup.write;
                    r3 = cleargroup.serializer;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        i2 = i12;
                        r0 = r3;
                        jLongValue = ((Number) obj).longValue();
                        cleargroup.serializer = r0;
                        cleargroup.write = i2;
                        cleargroup.read = i8;
                        cleargroup.IconCompatParcelizer = jLongValue;
                        cleargroup.RemoteActionCompatParcelizer = 4;
                        if (perseusUserLocalDataStoreImpl.putSessionOffset(1 + jLongValue, cleargroup) != coroutineSingletons) {
                            j = jLongValue;
                            r1 = r0;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th) {
                        th = th;
                        r3.write(null);
                        throw th;
                    }
                }
                if (i7 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i13 = write + 29;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        return null;
                    }
                    obj2.hashCode();
                    throw null;
                }
                j = cleargroup.IconCompatParcelizer;
                setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda2 = cleargroup.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                r1 = setcustominappmessageanimationfactorylambda2;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            Long l = new Long(j);
            r1.write(null);
            return l;
            MutexImpl mutexImpl = this.serializer;
            cleargroup.serializer = mutexImpl;
            cleargroup.write = 0;
            cleargroup.RemoteActionCompatParcelizer = 2;
            if (mutexImpl.lock(cleargroup) != coroutineSingletons) {
                setcustominappmessageanimationfactorylambda0 = mutexImpl;
                i = 0;
                cleargroup.serializer = setcustominappmessageanimationfactorylambda0;
                cleargroup.write = i;
                cleargroup.read = 0;
                cleargroup.RemoteActionCompatParcelizer = 3;
                sessionOffset = perseusUserLocalDataStoreImpl.getSessionOffset(cleargroup);
                if (sessionOffset == coroutineSingletons) {
                    i2 = i;
                    obj = sessionOffset;
                    r0 = setcustominappmessageanimationfactorylambda0;
                    jLongValue = ((Number) obj).longValue();
                    cleargroup.serializer = r0;
                    cleargroup.write = i2;
                    cleargroup.read = i8;
                    cleargroup.IconCompatParcelizer = jLongValue;
                    cleargroup.RemoteActionCompatParcelizer = 4;
                    if (perseusUserLocalDataStoreImpl.putSessionOffset(1 + jLongValue, cleargroup) != coroutineSingletons) {
                        j = jLongValue;
                        r1 = r0;
                        Long l2 = new Long(j);
                        r1.write(null);
                        return l2;
                    }
                }
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            r3 = r1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b5 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:27:0x006c, B:39:0x00b1, B:41:0x00b5), top: B:60:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public final Object getUserSessionId(ContinuationImpl continuationImpl) {
        build buildVar;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        int i;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1;
        String str;
        String str2;
        String str3;
        int i2;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda2;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer;
        int i5 = i4 + 35;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (continuationImpl instanceof build) {
            int i7 = i4 + 21;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            buildVar = (build) continuationImpl;
            int i9 = buildVar.read;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                buildVar.read = i9 - Integer.MIN_VALUE;
            } else {
                buildVar = new build(this, continuationImpl);
            }
        } else {
            buildVar = new build(this, continuationImpl);
        }
        Object sessionId = buildVar.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = buildVar.read;
        PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl = this.read;
        int i11 = 0;
        try {
            if (i10 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(sessionId);
                MutexImpl mutexImpl = this.RemoteActionCompatParcelizer;
                buildVar.RemoteActionCompatParcelizer = mutexImpl;
                buildVar.serializer = 0;
                buildVar.read = 1;
                if (mutexImpl.lock(buildVar) != coroutineSingletons) {
                    int i12 = write + 55;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    setcustominappmessageanimationfactorylambda0 = mutexImpl;
                    i = 0;
                }
                return coroutineSingletons;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = buildVar.IconCompatParcelizer;
                    i = buildVar.serializer;
                    setcustominappmessageanimationfactorylambda0 = buildVar.RemoteActionCompatParcelizer;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(sessionId);
                        str = (String) sessionId;
                        if (str == null) {
                            str2 = new addPathoIyEayMdefault(null).RemoteActionCompatParcelizer;
                            buildVar.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda0;
                            buildVar.write = str2;
                            buildVar.serializer = i;
                            buildVar.IconCompatParcelizer = i11;
                            buildVar.read = 3;
                            if (perseusUserLocalDataStoreImpl.putSessionId(str2, buildVar) == coroutineSingletons) {
                                i2 = write + 33;
                                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                                if (i2 % 2 == 0) {
                                    int i14 = 3 % 4;
                                }
                            } else {
                                str3 = str2;
                                setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                                buildVar.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda1;
                                buildVar.write = str3;
                                buildVar.serializer = i;
                                buildVar.IconCompatParcelizer = i11;
                                buildVar.read = 4;
                                if (perseusUserLocalDataStoreImpl.putSessionOffset(1L, buildVar) != coroutineSingletons) {
                                    setcustominappmessageanimationfactorylambda2 = setcustominappmessageanimationfactorylambda1;
                                    IconCompatParcelizer(str3);
                                    str = str3;
                                    setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda2;
                                }
                            }
                            return coroutineSingletons;
                        }
                        setcustominappmessageanimationfactorylambda0.write(null);
                        return str;
                    } catch (Throwable th) {
                        th = th;
                        setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                        setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
                        setcustominappmessageanimationfactorylambda0.write(null);
                        throw th;
                    }
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = buildVar.write;
                    setcustominappmessageanimationfactorylambda2 = buildVar.RemoteActionCompatParcelizer;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(sessionId);
                        IconCompatParcelizer(str3);
                        str = str3;
                        setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda2;
                        setcustominappmessageanimationfactorylambda0.write(null);
                        return str;
                    } catch (Throwable th2) {
                        th = th2;
                        setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda2;
                        setcustominappmessageanimationfactorylambda0.write(null);
                        throw th;
                    }
                }
                int i15 = buildVar.IconCompatParcelizer;
                i = buildVar.serializer;
                String str4 = buildVar.write;
                setcustominappmessageanimationfactorylambda1 = buildVar.RemoteActionCompatParcelizer;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(sessionId);
                    i11 = i15;
                    str3 = str4;
                    buildVar.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda1;
                    buildVar.write = str3;
                    buildVar.serializer = i;
                    buildVar.IconCompatParcelizer = i11;
                    buildVar.read = 4;
                    if (perseusUserLocalDataStoreImpl.putSessionOffset(1L, buildVar) != coroutineSingletons) {
                        setcustominappmessageanimationfactorylambda2 = setcustominappmessageanimationfactorylambda1;
                        IconCompatParcelizer(str3);
                        str = str3;
                        setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda2;
                        setcustominappmessageanimationfactorylambda0.write(null);
                        return str;
                    }
                    return coroutineSingletons;
                } catch (Throwable th3) {
                    th = th3;
                    setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
                    setcustominappmessageanimationfactorylambda0.write(null);
                    throw th;
                }
            }
            i = buildVar.serializer;
            setcustominappmessageanimationfactorylambda0 = buildVar.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(sessionId);
            int i16 = write + 109;
            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            buildVar.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda0;
            buildVar.serializer = i;
            buildVar.IconCompatParcelizer = 0;
            buildVar.read = 2;
            sessionId = perseusUserLocalDataStoreImpl.getSessionId(buildVar);
            if (sessionId != coroutineSingletons) {
                str = (String) sessionId;
                if (str == null) {
                    str2 = new addPathoIyEayMdefault(null).RemoteActionCompatParcelizer;
                    buildVar.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda0;
                    buildVar.write = str2;
                    buildVar.serializer = i;
                    buildVar.IconCompatParcelizer = i11;
                    buildVar.read = 3;
                    if (perseusUserLocalDataStoreImpl.putSessionId(str2, buildVar) == coroutineSingletons) {
                        i2 = write + 33;
                        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            int i18 = 3 % 4;
                        }
                    } else {
                        str3 = str2;
                        setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                        buildVar.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda1;
                        buildVar.write = str3;
                        buildVar.serializer = i;
                        buildVar.IconCompatParcelizer = i11;
                        buildVar.read = 4;
                        if (perseusUserLocalDataStoreImpl.putSessionOffset(1L, buildVar) != coroutineSingletons) {
                            setcustominappmessageanimationfactorylambda2 = setcustominappmessageanimationfactorylambda1;
                            IconCompatParcelizer(str3);
                            str = str3;
                            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda2;
                        }
                    }
                }
                setcustominappmessageanimationfactorylambda0.write(null);
                return str;
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            th = th4;
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }
}
