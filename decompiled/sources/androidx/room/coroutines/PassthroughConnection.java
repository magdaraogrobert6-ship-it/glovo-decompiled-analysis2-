package androidx.room.coroutines;

import android.database.SQLException;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ClipOp;
import o.ClipOpCompanion;
import o.ShortNewsContentCardView;
import o.UncheckedColordefault;
import o.convertvNxB06k;
import o.copywmQWz5cdefault;
import o.createFromParcel;
import o.getAlphaannotations;
import o.getBlue0d7_KjUannotations;
import o.getBlueimpl;
import o.markOnScreenCardsAsReadlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.tintxETnrds;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class PassthroughConnection implements ClipOpCompanion, getBlue0d7_KjUannotations {
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public final AtomicInteger read;
    public ClipOp serializer;
    public final tintxETnrds write;

    /* JADX INFO: renamed from: androidx.room.coroutines.PassthroughConnection$usePrepared$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public final /* synthetic */ String read;
        public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
            this.read = str;
            this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            return PassthroughConnection.this.new AnonymousClass2(this.read, this.serializer, shortNewsContentCardView);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            return ((AnonymousClass2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = PassthroughConnection.this.write.RemoteActionCompatParcelizer(this.read);
            try {
                Object objInvoke = this.serializer.invoke(uncheckedColordefaultRemoteActionCompatParcelizer);
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, th);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.PassthroughConnection$withTransaction$2, reason: invalid class name and case insensitive filesystem */
    public final class C00712 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public final /* synthetic */ ClipOp IconCompatParcelizer;
        public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 RemoteActionCompatParcelizer;
        public int read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00712(ClipOp clipOp, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
            this.IconCompatParcelizer = clipOp;
            this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            return PassthroughConnection.this.new C00712(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            return ((C00712) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.read;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                Object objTransaction = PassthroughConnection.this.transaction(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this);
                return objTransaction == coroutineSingletons ? coroutineSingletons : objTransaction;
            }
            if (i == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Override // o.getBlue0d7_KjUannotations
    public final tintxETnrds IconCompatParcelizer() {
        return this.write;
    }

    public PassthroughConnection(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, tintxETnrds tintxetnrds) {
        tintxetnrds.getClass();
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.write = tintxetnrds;
        this.read = new AtomicInteger(0);
    }

    @Override // o.ClipOpCompanion
    public final Object withTransaction(ClipOp clipOp, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, SuspendLambda suspendLambda) {
        Object objInvoke = this.IconCompatParcelizer.invoke(new C00712(clipOp, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objInvoke;
    }

    @Override // o.ClipOpCompanion
    public final Boolean IconCompatParcelizer(ShortNewsContentCardView shortNewsContentCardView) {
        return Boolean.valueOf(this.serializer != null || this.write.IconCompatParcelizer());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object transaction(ClipOp clipOp, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        copywmQWz5cdefault copywmqwz5cdefault;
        if (continuationImpl instanceof copywmQWz5cdefault) {
            copywmqwz5cdefault = (copywmQWz5cdefault) continuationImpl;
            int i = copywmqwz5cdefault.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                copywmqwz5cdefault.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                copywmqwz5cdefault = new copywmQWz5cdefault(this, continuationImpl);
            }
        } else {
            copywmqwz5cdefault = new copywmQWz5cdefault(this, continuationImpl);
        }
        Object objInvoke = copywmqwz5cdefault.RemoteActionCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = copywmqwz5cdefault.IconCompatParcelizer;
        AtomicInteger atomicInteger = this.read;
        tintxETnrds tintxetnrds = this.write;
        int i3 = 1;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                int i4 = convertvNxB06k.RemoteActionCompatParcelizer[clipOp.ordinal()];
                if (i4 == 1) {
                    SQLite.serializer(tintxetnrds, "BEGIN DEFERRED TRANSACTION");
                } else if (i4 == 2) {
                    SQLite.serializer(tintxetnrds, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i4 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    SQLite.serializer(tintxetnrds, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.serializer = clipOp;
                }
                Object getalphaannotations = new getAlphaannotations(this);
                copywmqwz5cdefault.read = 1;
                copywmqwz5cdefault.IconCompatParcelizer = 1;
                objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getalphaannotations, copywmqwz5cdefault);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = copywmqwz5cdefault.read;
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.serializer = null;
            }
            if (i3 != 0) {
                SQLite.serializer(tintxetnrds, "END TRANSACTION");
                return objInvoke;
            }
            SQLite.serializer(tintxetnrds, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.serializer = null;
                    }
                    SQLite.serializer(tintxetnrds, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    markOnScreenCardsAsReadlambda1.read(th, e);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.clipRectN_I0legdefault
    public final Object usePrepared(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        getBlueimpl getblueimpl;
        if (continuationImpl instanceof getBlueimpl) {
            getblueimpl = (getBlueimpl) continuationImpl;
            int i = getblueimpl.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                getblueimpl.write = i - Integer.MIN_VALUE;
            } else {
                getblueimpl = new getBlueimpl(this, continuationImpl);
            }
        } else {
            getblueimpl = new getBlueimpl(this, continuationImpl);
        }
        Object objIconCompatParcelizer = getblueimpl.serializer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getblueimpl.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            getblueimpl.RemoteActionCompatParcelizer = str;
            getblueimpl.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            getblueimpl.write = 1;
            objIconCompatParcelizer = IconCompatParcelizer(getblueimpl);
            if (objIconCompatParcelizer != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                return objIconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm = getblueimpl.IconCompatParcelizer;
        str = getblueimpl.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
        if (((Boolean) objIconCompatParcelizer).booleanValue()) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null);
            getblueimpl.RemoteActionCompatParcelizer = null;
            getblueimpl.IconCompatParcelizer = null;
            getblueimpl.write = 2;
            Object objInvoke = this.IconCompatParcelizer.invoke(anonymousClass2, getblueimpl);
            return objInvoke == obj ? obj : objInvoke;
        }
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(str);
        try {
            Object objInvoke2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(uncheckedColordefaultRemoteActionCompatParcelizer);
            Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, th);
                throw th2;
            }
        }
    }
}
