package androidx.room.coroutines;

import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.Timestamp;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.BrazeContentCardsManager;
import o.ClipOp;
import o.ClipOpCompanion;
import o.ColorCompanion;
import o.ShortNewsContentCardView;
import o.component3impl;
import o.createFromParcel;
import o.getBlue0d7_KjUannotations;
import o.getDarkGray0d7_KjUannotations;
import o.getGreenimpl;
import o.getRedannotations;
import o.getRedimpl;
import o.getValuesVKNKU;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.tintxETnrds;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class PooledConnectionImpl implements ClipOpCompanion, getBlue0d7_KjUannotations {
    public final BrazeContentCardsManager IconCompatParcelizer;
    public volatile boolean RemoteActionCompatParcelizer;
    public final ConnectionWithLock read;
    public final boolean serializer;
    public final Timestamp.Companion write;

    @Override // o.getBlue0d7_KjUannotations
    public final tintxETnrds IconCompatParcelizer() {
        return this.read;
    }

    public PooledConnectionImpl(Timestamp.Companion companion, ConnectionWithLock connectionWithLock, boolean z) {
        companion.getClass();
        this.write = companion;
        this.read = connectionWithLock;
        this.serializer = z;
        this.IconCompatParcelizer = new BrazeContentCardsManager();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object beginTransaction(ClipOp clipOp, ContinuationImpl continuationImpl) {
        getGreenimpl getgreenimpl;
        ConnectionWithLock connectionWithLock;
        BrazeContentCardsManager brazeContentCardsManager = this.IconCompatParcelizer;
        if (continuationImpl instanceof getGreenimpl) {
            getgreenimpl = (getGreenimpl) continuationImpl;
            int i = getgreenimpl.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                getgreenimpl.read = i - Integer.MIN_VALUE;
            } else {
                getgreenimpl = new getGreenimpl(this, continuationImpl);
            }
        } else {
            getgreenimpl = new getGreenimpl(this, continuationImpl);
        }
        Object obj = getgreenimpl.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getgreenimpl.read;
        ConnectionWithLock connectionWithLock2 = this.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getgreenimpl.write = clipOp;
            getgreenimpl.IconCompatParcelizer = connectionWithLock2;
            getgreenimpl.read = 1;
            if (connectionWithLock2.serializer.lock(getgreenimpl) == coroutineSingletons) {
                return coroutineSingletons;
            }
            connectionWithLock = connectionWithLock2;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ConnectionWithLock connectionWithLock3 = getgreenimpl.IconCompatParcelizer;
            ClipOp clipOp2 = getgreenimpl.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            connectionWithLock = connectionWithLock3;
            clipOp = clipOp2;
        }
        try {
            int i3 = brazeContentCardsManager.RemoteActionCompatParcelizer;
            if (brazeContentCardsManager.isEmpty()) {
                int i4 = getRedannotations.RemoteActionCompatParcelizer[clipOp.ordinal()];
                if (i4 == 1) {
                    SQLite.serializer(connectionWithLock2, "BEGIN DEFERRED TRANSACTION");
                } else if (i4 == 2) {
                    SQLite.serializer(connectionWithLock2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SQLite.serializer(connectionWithLock2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                SQLite.serializer(connectionWithLock2, "SAVEPOINT '" + i3 + '\'');
            }
            brazeContentCardsManager.addLast(new getValuesVKNKU(i3));
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            connectionWithLock.write(null);
            return createfromparcel;
        } catch (Throwable th) {
            connectionWithLock.write(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        if (endTransaction(false, r0) == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [o.ClipOp] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v5, types: [o.ClipOp] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v4, types: [o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.room.coroutines.PooledConnectionImpl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object transaction$1(o.ClipOp r10, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof o.getCyan0d7_KjUannotations
            if (r0 == 0) goto L13
            r0 = r12
            o.getCyan0d7_KjUannotations r0 = (o.getCyan0d7_KjUannotations) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.read = r1
            goto L18
        L13:
            o.getCyan0d7_KjUannotations r0 = new o.getCyan0d7_KjUannotations
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.read
            r3 = 0
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L58
            if (r2 == r8) goto L4f
            if (r2 == r6) goto L49
            if (r2 == r5) goto L43
            r10 = 4
            if (r2 == r10) goto L43
            if (r2 == r4) goto L37
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r3
        L37:
            java.lang.Throwable r10 = r0.RemoteActionCompatParcelizer
            java.lang.Object r11 = r0.IconCompatParcelizer
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)     // Catch: android.database.SQLException -> L41
            goto La2
        L41:
            r12 = move-exception
            goto L9d
        L43:
            java.lang.Object r10 = r0.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            return r10
        L49:
            int r10 = r0.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)     // Catch: java.lang.Throwable -> L8c
            goto L7d
        L4f:
            java.lang.Object r10 = r0.IconCompatParcelizer
            r11 = r10
            o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r11 = (o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) r11
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L6a
        L58:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            if (r10 != 0) goto L5f
            o.ClipOp r10 = o.ClipOp.DEFERRED
        L5f:
            r0.IconCompatParcelizer = r11
            r0.read = r8
            java.lang.Object r10 = r9.beginTransaction(r10, r0)
            if (r10 != r1) goto L6a
            goto L9c
        L6a:
            o.getGreenannotations r10 = new o.getGreenannotations     // Catch: java.lang.Throwable -> L8c
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L8c
            r0.IconCompatParcelizer = r3     // Catch: java.lang.Throwable -> L8c
            r0.write = r8     // Catch: java.lang.Throwable -> L8c
            r0.read = r6     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r12 = r11.invoke(r10, r0)     // Catch: java.lang.Throwable -> L8c
            if (r12 != r1) goto L7c
            goto L9c
        L7c:
            r10 = r8
        L7d:
            if (r10 == 0) goto L80
            r7 = r8
        L80:
            r0.IconCompatParcelizer = r12
            r0.read = r5
            java.lang.Object r10 = r9.endTransaction(r7, r0)
            if (r10 != r1) goto L8b
            goto L9c
        L8b:
            return r12
        L8c:
            r10 = move-exception
            r11 = r10
            throw r11     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            r0.IconCompatParcelizer = r11     // Catch: android.database.SQLException -> L41
            r0.RemoteActionCompatParcelizer = r10     // Catch: android.database.SQLException -> L41
            r0.read = r4     // Catch: android.database.SQLException -> L41
            java.lang.Object r11 = r9.endTransaction(r7, r0)     // Catch: android.database.SQLException -> L41
            if (r11 != r1) goto La2
        L9c:
            return r1
        L9d:
            if (r11 == 0) goto La3
            o.markOnScreenCardsAsReadlambda1.read(r11, r12)
        La2:
            throw r10
        La3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.PooledConnectionImpl.transaction$1(o.ClipOp, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.clipRectN_I0legdefault
    public final Object usePrepared(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        getDarkGray0d7_KjUannotations getdarkgray0d7_kjuannotations;
        ConnectionWithLock connectionWithLock;
        if (continuationImpl instanceof getDarkGray0d7_KjUannotations) {
            getdarkgray0d7_kjuannotations = (getDarkGray0d7_KjUannotations) continuationImpl;
            int i = getdarkgray0d7_kjuannotations.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                getdarkgray0d7_kjuannotations.write = i - Integer.MIN_VALUE;
            } else {
                getdarkgray0d7_kjuannotations = new getDarkGray0d7_KjUannotations(this, continuationImpl);
            }
        } else {
            getdarkgray0d7_kjuannotations = new getDarkGray0d7_KjUannotations(this, continuationImpl);
        }
        Object obj = getdarkgray0d7_kjuannotations.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getdarkgray0d7_kjuannotations.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (this.RemoteActionCompatParcelizer) {
                SQLite.read(21, "Connection is recycled");
                throw null;
            }
            component3impl component3implVar = (component3impl) getdarkgray0d7_kjuannotations.getContext().get(this.write);
            if (component3implVar == null || component3implVar.RemoteActionCompatParcelizer != this) {
                SQLite.read(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            connectionWithLock = this.read;
            getdarkgray0d7_kjuannotations.RemoteActionCompatParcelizer = str;
            getdarkgray0d7_kjuannotations.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            getdarkgray0d7_kjuannotations.IconCompatParcelizer = connectionWithLock;
            getdarkgray0d7_kjuannotations.write = 1;
            if (connectionWithLock.serializer.lock(getdarkgray0d7_kjuannotations) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ConnectionWithLock connectionWithLock2 = getdarkgray0d7_kjuannotations.IconCompatParcelizer;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = getdarkgray0d7_kjuannotations.read;
            String str2 = getdarkgray0d7_kjuannotations.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            connectionWithLock = connectionWithLock2;
            str = str2;
        }
        try {
            getRedimpl getredimpl = new getRedimpl(this, this.read.RemoteActionCompatParcelizer(str));
            try {
                Object objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getredimpl);
                Okio.RemoteActionCompatParcelizer(getredimpl, null);
                connectionWithLock.write(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Okio.RemoteActionCompatParcelizer(getredimpl, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            connectionWithLock.write(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object endTransaction(boolean z, ContinuationImpl continuationImpl) {
        ColorCompanion colorCompanion;
        ConnectionWithLock connectionWithLock;
        BrazeContentCardsManager brazeContentCardsManager = this.IconCompatParcelizer;
        if (continuationImpl instanceof ColorCompanion) {
            colorCompanion = (ColorCompanion) continuationImpl;
            int i = colorCompanion.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                colorCompanion.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                colorCompanion = new ColorCompanion(this, continuationImpl);
            }
        } else {
            colorCompanion = new ColorCompanion(this, continuationImpl);
        }
        Object obj = colorCompanion.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = colorCompanion.RemoteActionCompatParcelizer;
        ConnectionWithLock connectionWithLock2 = this.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            colorCompanion.serializer = connectionWithLock2;
            colorCompanion.IconCompatParcelizer = z;
            colorCompanion.RemoteActionCompatParcelizer = 1;
            if (connectionWithLock2.serializer.lock(colorCompanion) == coroutineSingletons) {
                return coroutineSingletons;
            }
            connectionWithLock = connectionWithLock2;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = colorCompanion.IconCompatParcelizer;
            connectionWithLock = colorCompanion.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            if (brazeContentCardsManager.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            getValuesVKNKU getvaluesvknku = (getValuesVKNKU) onContentCardDismissed.MediaSessionCompatQueueItem((List) brazeContentCardsManager);
            if (z) {
                getvaluesvknku.getClass();
                if (brazeContentCardsManager.isEmpty()) {
                    SQLite.serializer(connectionWithLock2, "END TRANSACTION");
                } else {
                    SQLite.serializer(connectionWithLock2, "RELEASE SAVEPOINT '" + getvaluesvknku.serializer + '\'');
                }
            } else if (brazeContentCardsManager.isEmpty()) {
                SQLite.serializer(connectionWithLock2, "ROLLBACK TRANSACTION");
            } else {
                SQLite.serializer(connectionWithLock2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + getvaluesvknku.serializer + '\'');
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            connectionWithLock.write(null);
            return createfromparcel;
        } catch (Throwable th) {
            connectionWithLock.write(null);
            throw th;
        }
    }

    @Override // o.ClipOpCompanion
    public final Boolean IconCompatParcelizer(ShortNewsContentCardView shortNewsContentCardView) {
        if (this.RemoteActionCompatParcelizer) {
            SQLite.read(21, "Connection is recycled");
            throw null;
        }
        component3impl component3implVar = (component3impl) shortNewsContentCardView.getContext().get(this.write);
        if (component3implVar != null && component3implVar.RemoteActionCompatParcelizer == this) {
            return Boolean.valueOf(!this.IconCompatParcelizer.isEmpty() || this.read.RemoteActionCompatParcelizer.IconCompatParcelizer());
        }
        SQLite.read(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // o.ClipOpCompanion
    public final Object withTransaction(ClipOp clipOp, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, SuspendLambda suspendLambda) {
        if (this.RemoteActionCompatParcelizer) {
            SQLite.read(21, "Connection is recycled");
            throw null;
        }
        component3impl component3implVar = (component3impl) suspendLambda.getContext().get(this.write);
        if (component3implVar != null && component3implVar.RemoteActionCompatParcelizer == this) {
            return transaction$1(clipOp, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, suspendLambda);
        }
        SQLite.read(21, "Attempted to use connection on a different coroutine");
        throw null;
    }
}
