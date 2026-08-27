package androidx.room.util;

import androidx.room.RoomDatabase;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class DBUtil__DBUtil_androidKt$performBlocking$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public int RatingCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ TextAnnouncementContentCardView read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ RoomDatabase write;

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ boolean IconCompatParcelizer;
        public int MediaBrowserCompatMediaItem;
        public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
        public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
        public final /* synthetic */ boolean serializer;
        public final /* synthetic */ RoomDatabase write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RoomDatabase roomDatabase, boolean z, boolean z2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.write = roomDatabase;
            this.serializer = z;
            this.IconCompatParcelizer = z2;
            this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            return i != 0 ? ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            if (this.RemoteActionCompatParcelizer != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.MediaBrowserCompatMediaItem;
                if (i != 0) {
                    if (i == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
                boolean z = this.IconCompatParcelizer;
                boolean z2 = this.serializer;
                RoomDatabase roomDatabase = this.write;
                DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(z, z2, roomDatabase, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0);
                this.MediaBrowserCompatMediaItem = 1;
                Object objUseConnection = roomDatabase.useConnection(z2, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, this);
                return objUseConnection == coroutineSingletons ? coroutineSingletons : objUseConnection;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.MediaBrowserCompatMediaItem;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            RoomDatabase roomDatabase2 = this.write;
            boolean z3 = !(roomDatabase2.inCompatibilityMode() && roomDatabase2.inTransaction()) && this.serializer;
            boolean z4 = this.IconCompatParcelizer;
            RoomDatabase roomDatabase3 = this.write;
            DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$2 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(z3, z4, roomDatabase3, null, this.read, 1);
            this.MediaBrowserCompatMediaItem = 1;
            Object objUseConnection2 = roomDatabase3.useConnection(z4, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$2, this);
            return objUseConnection2 == coroutineSingletons2 ? coroutineSingletons2 : objUseConnection2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            if (this.RemoteActionCompatParcelizer != 0) {
                return new AnonymousClass1(shortNewsContentCardView, this.write, this.serializer, this.IconCompatParcelizer, this.read);
            }
            return new AnonymousClass1(this.write, this.serializer, this.IconCompatParcelizer, this.read, shortNewsContentCardView);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView, RoomDatabase roomDatabase, boolean z, boolean z2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(2, shortNewsContentCardView);
            this.write = roomDatabase;
            this.serializer = z;
            this.IconCompatParcelizer = z2;
            this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performBlocking$1(TextAnnouncementContentCardView textAnnouncementContentCardView, RoomDatabase roomDatabase, boolean z, boolean z2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = textAnnouncementContentCardView;
        this.write = roomDatabase;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = z2;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new DBUtil__DBUtil_androidKt$performBlocking$1(this.read, this.write, this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((DBUtil__DBUtil_androidKt$performBlocking$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.RatingCompat;
        if (i != 0) {
            if (i == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.write, this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, (ShortNewsContentCardView) null);
        this.RatingCompat = 1;
        Object objWithContext = BuildersKt.withContext(this.read, anonymousClass1, this);
        return objWithContext == coroutineSingletons ? coroutineSingletons : objWithContext;
    }
}
