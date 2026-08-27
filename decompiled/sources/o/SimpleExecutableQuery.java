package o;

import android.app.Application;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.location.core.domain.ObserveDistanceToLocationUseCaseImpl;
import com.roadrunner.login.domain.auth.GetRiderNameUseCaseImpl;
import com.roadrunner.login.legacy.data.LoginStorageManager;
import com.roadrunner.login.legacy.data.user.UserStorageManager;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import com.roadrunner.nafath.data.VerificationStatusRepository;
import com.roadrunner.order.history.data.database.HistoryDatabase;
import dagger.Lazy;
import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleExecutableQuery implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ SimpleExecutableQuery(mergeJsonObjects mergejsonobjects, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
    }

    public /* synthetic */ SimpleExecutableQuery(Object obj, mergeJsonObjects mergejsonobjects, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[PHI: r4
  0x0026: PHI (r4v30 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0044 A[PHI: r4
  0x0044: PHI (r4v29 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[PHI: r4
  0x0053: PHI (r4v28 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0062 A[PHI: r4
  0x0062: PHI (r4v27 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x006e A[PHI: r4
  0x006e: PHI (r4v26 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x007a A[PHI: r4
  0x007a: PHI (r4v25 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0089 A[PHI: r4
  0x0089: PHI (r4v24 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0095 A[PHI: r4
  0x0095: PHI (r4v23 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2 A[PHI: r4
  0x00a2: PHI (r4v22 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae A[PHI: r4
  0x00ae: PHI (r4v21 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba A[PHI: r4
  0x00ba: PHI (r4v20 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6 A[PHI: r4
  0x00c6: PHI (r4v19 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9 A[PHI: r4
  0x00d9: PHI (r4v18 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5 A[PHI: r4
  0x00e5: PHI (r4v17 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1 A[PHI: r4
  0x00f1: PHI (r4v16 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0102 A[PHI: r4
  0x0102: PHI (r4v15 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x010e A[PHI: r4
  0x010e: PHI (r4v14 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x011d A[PHI: r4
  0x011d: PHI (r4v13 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:49:0x013c A[PHI: r4
  0x013c: PHI (r4v12 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0154 A[PHI: r4
  0x0154: PHI (r4v11 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0165 A[PHI: r4
  0x0165: PHI (r4v10 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0171 A[PHI: r4
  0x0171: PHI (r4v9 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x017d A[PHI: r4
  0x017d: PHI (r4v8 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x018c A[PHI: r4
  0x018c: PHI (r4v7 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a3 A[PHI: r4
  0x01a3: PHI (r4v6 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b2 A[PHI: r4
  0x01b2: PHI (r4v5 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c6 A[PHI: r4
  0x01c6: PHI (r4v4 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x01d7 A[PHI: r4
  0x01d7: PHI (r4v3 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e3 A[PHI: r4
  0x01e3: PHI (r4v2 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x01fb A[PHI: r4
  0x01fb: PHI (r4v1 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v31 o.mergeJsonObjects) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        mergeJsonObjects mergejsonobjects;
        LoginStorageManager loginStorageManager;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 21;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = this.write;
            mergejsonobjects = this.RemoteActionCompatParcelizer;
            switch (i4) {
                case 0:
                    Object objWrite = mergejsonobjects.write();
                    objWrite.getClass();
                    new AndroidUiDispatcherCompanioncurrentThread1(15);
                    SharedResourcePool sharedResourcePool = new SharedResourcePool();
                    sharedResourcePool.IconCompatParcelizer = (setConfig) objWrite;
                    return sharedResourcePool;
                case 1:
                    return new setDistanceToTriggerSync((onUpgrade) mergejsonobjects.write(), 0);
                case 2:
                    ObserveDistanceToLocationUseCaseImpl observeDistanceToLocationUseCaseImpl = (ObserveDistanceToLocationUseCaseImpl) mergejsonobjects.write();
                    observeDistanceToLocationUseCaseImpl.getClass();
                    CreateHomeScope createHomeScope = new CreateHomeScope();
                    createHomeScope.read = observeDistanceToLocationUseCaseImpl;
                    return createHomeScope;
                case 3:
                    Application application = (Application) mergejsonobjects.write();
                    getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
                    application.getClass();
                    return new MulticastConsumer(application, getactionviewintentlambda0);
                case 4:
                    Object objWrite2 = mergejsonobjects.write();
                    objWrite2.getClass();
                    return new removeListener((SemanticsOwner) objWrite2);
                case 5:
                    Object objWrite3 = mergejsonobjects.write();
                    objWrite3.getClass();
                    accesstransactionWithWrapper accesstransactionwithwrapper = (accesstransactionWithWrapper) SuspendingTransactionWithoutReturn.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                    setNativeShader.RemoteActionCompatParcelizer(accesstransactionwithwrapper, "Cannot return null from a non-@Nullable @Provides method");
                    return accesstransactionwithwrapper;
                case 6:
                    Object objWrite4 = mergejsonobjects.write();
                    objWrite4.getClass();
                    return new transactionsuspendImpl();
                case 7:
                    return new GetRiderNameUseCaseImpl((GetUserDataUseCaseImpl) mergejsonobjects.write());
                case 8:
                    return new use((accessgetReleasecp) mergejsonobjects.write());
                case 9:
                    IncogniaManagerImpl incogniaManagerImpl = (IncogniaManagerImpl) mergejsonobjects.write();
                    incogniaManagerImpl.getClass();
                    SharedResourcePool sharedResourcePool2 = new SharedResourcePool();
                    sharedResourcePool2.IconCompatParcelizer = incogniaManagerImpl;
                    return sharedResourcePool2;
                case 10:
                    getSuccessfulruntime getsuccessfulruntime = (getSuccessfulruntime) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", getSuccessfulruntime.class);
                    int i5 = serializer + 79;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return getsuccessfulruntime;
                case 11:
                    Object objWrite5 = mergejsonobjects.write();
                    objWrite5.getClass();
                    loginStorageManager = new LoginStorageManager((UserStorageManager) objWrite5);
                    i = serializer + 25;
                    IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        return loginStorageManager;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                case 12:
                    Object objWrite6 = mergejsonobjects.write();
                    objWrite6.getClass();
                    return new UserStorageManager((getQueryExecutor) objWrite6);
                case 13:
                    return new getBytes((decode) mergejsonobjects.write());
                case 14:
                    getRangeForRect getrangeforrect = (getRangeForRect) mergejsonobjects.write();
                    getrangeforrect.getClass();
                    SharedResourcePool sharedResourcePool3 = new SharedResourcePool();
                    sharedResourcePool3.IconCompatParcelizer = getrangeforrect;
                    return sharedResourcePool3;
                case 15:
                    return new SaveHeatmapUrlImpl((removeRearDisplayPresentationStatusListener) mergejsonobjects.write());
                case 16:
                    return new e9((setTransactionSuccessful) mergejsonobjects.write());
                case 17:
                    eb ebVar = (eb) mergejsonobjects.write();
                    ebVar.getClass();
                    SharedResourcePool sharedResourcePool4 = new SharedResourcePool();
                    sharedResourcePool4.IconCompatParcelizer = ebVar.RemoteActionCompatParcelizer;
                    return sharedResourcePool4;
                case 18:
                    return new eb((transferSessionPackageI) mergejsonobjects.write());
                case 19:
                    return new SafeAreaPublisherImpl((e9) mergejsonobjects.write());
                case 20:
                    return new eg((dg) mergejsonobjects.write());
                case 21:
                    Lazy lazySerializer = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                    lazySerializer.getClass();
                    return new o7(lazySerializer);
                case 22:
                    return new VerificationStatusRepository((resetTransientState) mergejsonobjects.write());
                case 23:
                    Object objWrite7 = mergejsonobjects.write();
                    objWrite7.getClass();
                    return new r2((setMaxElementsWrap) objWrite7);
                case 24:
                    return new s7((decode) mergejsonobjects.write());
                case 25:
                    return new vcExternalSyntheticLambda2((transferSessionPackageI) mergejsonobjects.write());
                case 26:
                    return (w5) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", w5.class);
                case 27:
                    return (z7) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", z7.class);
                case 28:
                    Application application2 = (Application) mergejsonobjects.write();
                    application2.getClass();
                    clipRectmtrdDE cliprectmtrddeRemoteActionCompatParcelizer = androidx.room.Room.RemoteActionCompatParcelizer(application2, HistoryDatabase.class, "rr_history.db");
                    cliprectmtrddeRemoteActionCompatParcelizer.read = true;
                    cliprectmtrddeRemoteActionCompatParcelizer.read();
                    return (HistoryDatabase) cliprectmtrddeRemoteActionCompatParcelizer.write();
                default:
                    HistoryDatabase historyDatabase = (HistoryDatabase) mergejsonobjects.write();
                    historyDatabase.getClass();
                    y6 y6VarIconCompatParcelizer = historyDatabase.IconCompatParcelizer();
                    setNativeShader.IconCompatParcelizer(y6VarIconCompatParcelizer);
                    return y6VarIconCompatParcelizer;
            }
        }
        int i7 = this.write;
        mergejsonobjects = this.RemoteActionCompatParcelizer;
        int i8 = 97 / 0;
        switch (i7) {
            case 0:
                Object objWrite8 = mergejsonobjects.write();
                objWrite8.getClass();
                new AndroidUiDispatcherCompanioncurrentThread1(15);
                SharedResourcePool sharedResourcePool5 = new SharedResourcePool();
                sharedResourcePool5.IconCompatParcelizer = (setConfig) objWrite8;
                return sharedResourcePool5;
            case 1:
                return new setDistanceToTriggerSync((onUpgrade) mergejsonobjects.write(), 0);
            case 2:
                ObserveDistanceToLocationUseCaseImpl observeDistanceToLocationUseCaseImpl2 = (ObserveDistanceToLocationUseCaseImpl) mergejsonobjects.write();
                observeDistanceToLocationUseCaseImpl2.getClass();
                CreateHomeScope createHomeScope2 = new CreateHomeScope();
                createHomeScope2.read = observeDistanceToLocationUseCaseImpl2;
                return createHomeScope2;
            case 3:
                Application application3 = (Application) mergejsonobjects.write();
                getActionViewIntentlambda0 getactionviewintentlambda1 = new getActionViewIntentlambda0();
                application3.getClass();
                return new MulticastConsumer(application3, getactionviewintentlambda1);
            case 4:
                Object objWrite9 = mergejsonobjects.write();
                objWrite9.getClass();
                return new removeListener((SemanticsOwner) objWrite9);
            case 5:
                Object objWrite10 = mergejsonobjects.write();
                objWrite10.getClass();
                accesstransactionWithWrapper accesstransactionwithwrapper2 = (accesstransactionWithWrapper) SuspendingTransactionWithoutReturn.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                setNativeShader.RemoteActionCompatParcelizer(accesstransactionwithwrapper2, "Cannot return null from a non-@Nullable @Provides method");
                return accesstransactionwithwrapper2;
            case 6:
                Object objWrite11 = mergejsonobjects.write();
                objWrite11.getClass();
                return new transactionsuspendImpl();
            case 7:
                return new GetRiderNameUseCaseImpl((GetUserDataUseCaseImpl) mergejsonobjects.write());
            case 8:
                return new use((accessgetReleasecp) mergejsonobjects.write());
            case 9:
                IncogniaManagerImpl incogniaManagerImpl2 = (IncogniaManagerImpl) mergejsonobjects.write();
                incogniaManagerImpl2.getClass();
                SharedResourcePool sharedResourcePool6 = new SharedResourcePool();
                sharedResourcePool6.IconCompatParcelizer = incogniaManagerImpl2;
                return sharedResourcePool6;
            case 10:
                getSuccessfulruntime getsuccessfulruntime2 = (getSuccessfulruntime) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", getSuccessfulruntime.class);
                int i9 = serializer + 79;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return getsuccessfulruntime2;
            case 11:
                Object objWrite12 = mergejsonobjects.write();
                objWrite12.getClass();
                loginStorageManager = new LoginStorageManager((UserStorageManager) objWrite12);
                i = serializer + 25;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    return loginStorageManager;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            case 12:
                Object objWrite13 = mergejsonobjects.write();
                objWrite13.getClass();
                return new UserStorageManager((getQueryExecutor) objWrite13);
            case 13:
                return new getBytes((decode) mergejsonobjects.write());
            case 14:
                getRangeForRect getrangeforrect2 = (getRangeForRect) mergejsonobjects.write();
                getrangeforrect2.getClass();
                SharedResourcePool sharedResourcePool7 = new SharedResourcePool();
                sharedResourcePool7.IconCompatParcelizer = getrangeforrect2;
                return sharedResourcePool7;
            case 15:
                return new SaveHeatmapUrlImpl((removeRearDisplayPresentationStatusListener) mergejsonobjects.write());
            case 16:
                return new e9((setTransactionSuccessful) mergejsonobjects.write());
            case 17:
                eb ebVar2 = (eb) mergejsonobjects.write();
                ebVar2.getClass();
                SharedResourcePool sharedResourcePool8 = new SharedResourcePool();
                sharedResourcePool8.IconCompatParcelizer = ebVar2.RemoteActionCompatParcelizer;
                return sharedResourcePool8;
            case 18:
                return new eb((transferSessionPackageI) mergejsonobjects.write());
            case 19:
                return new SafeAreaPublisherImpl((e9) mergejsonobjects.write());
            case 20:
                return new eg((dg) mergejsonobjects.write());
            case 21:
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer2.getClass();
                return new o7(lazySerializer2);
            case 22:
                return new VerificationStatusRepository((resetTransientState) mergejsonobjects.write());
            case 23:
                Object objWrite14 = mergejsonobjects.write();
                objWrite14.getClass();
                return new r2((setMaxElementsWrap) objWrite14);
            case 24:
                return new s7((decode) mergejsonobjects.write());
            case 25:
                return new vcExternalSyntheticLambda2((transferSessionPackageI) mergejsonobjects.write());
            case 26:
                return (w5) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", w5.class);
            case 27:
                return (z7) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", z7.class);
            case 28:
                Application application4 = (Application) mergejsonobjects.write();
                application4.getClass();
                clipRectmtrdDE cliprectmtrddeRemoteActionCompatParcelizer2 = androidx.room.Room.RemoteActionCompatParcelizer(application4, HistoryDatabase.class, "rr_history.db");
                cliprectmtrddeRemoteActionCompatParcelizer2.read = true;
                cliprectmtrddeRemoteActionCompatParcelizer2.read();
                return (HistoryDatabase) cliprectmtrddeRemoteActionCompatParcelizer2.write();
            default:
                HistoryDatabase historyDatabase2 = (HistoryDatabase) mergejsonobjects.write();
                historyDatabase2.getClass();
                y6 y6VarIconCompatParcelizer2 = historyDatabase2.IconCompatParcelizer();
                setNativeShader.IconCompatParcelizer(y6VarIconCompatParcelizer2);
                return y6VarIconCompatParcelizer2;
        }
    }
}
