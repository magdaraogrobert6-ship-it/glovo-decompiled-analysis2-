package o;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.cardview.widget.CardView$1;
import com.foodora.courier.main.usecases.GetHelpCenterParamsUseCase;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appupdate.PlayStoreBasedAppUpdate;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.ExecuteTwoFaApiRequest;
import com.roadrunner.auth.domain.SaveAuthDataUseCase;
import com.roadrunner.auth.domain.state.GetUserAuthStateImpl;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import com.roadrunner.customerchat.legacy.core.usecases.DeliveryChatVisibilityUseCase;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import com.roadrunner.customerchat.selfservice.data.cache.server.ChatAssetCacheLocalWebServer;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase;
import com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadConfig;
import com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat;
import com.sentiance.core.model.events.H$b;

/* JADX INFO: loaded from: classes3.dex */
public final class invokeqtAw6s implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ invokeqtAw6s(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, int i) {
        this.write = i;
        this.serializer = mergejsonobjects;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
    }

    public /* synthetic */ invokeqtAw6s(Object obj, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, int i) {
        this.write = i;
        this.serializer = mergejsonobjects;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r2 r3
  0x0028: PHI (r2v65 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r3v35 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003a A[PHI: r2 r3
  0x003a: PHI (r2v63 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r3v34 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c A[PHI: r2 r3
  0x004c: PHI (r2v61 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r3v33 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x005e A[PHI: r2 r3
  0x005e: PHI (r2v59 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x005e: PHI (r3v32 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0070 A[PHI: r2 r3
  0x0070: PHI (r2v57 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0070: PHI (r3v31 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0082 A[PHI: r2 r3
  0x0082: PHI (r2v55 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r3v30 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0094 A[PHI: r2 r3
  0x0094: PHI (r2v53 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r3v28 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b7 A[PHI: r2 r3
  0x00b7: PHI (r2v51 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r3v27 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c9 A[PHI: r2 r3
  0x00c9: PHI (r2v47 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00c9: PHI (r3v25 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb A[PHI: r2 r3
  0x00eb: PHI (r2v45 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00eb: PHI (r3v24 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00fd A[PHI: r2 r3
  0x00fd: PHI (r2v43 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00fd: PHI (r3v23 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x010f A[PHI: r2 r3
  0x010f: PHI (r2v41 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r3v22 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0127 A[PHI: r2 r3
  0x0127: PHI (r2v39 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r3v21 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0139 A[PHI: r2 r3
  0x0139: PHI (r2v37 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0139: PHI (r3v20 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x014b A[PHI: r2 r3
  0x014b: PHI (r2v35 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x014b: PHI (r3v19 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x015d A[PHI: r2 r3
  0x015d: PHI (r2v33 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x015d: PHI (r3v18 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x016f A[PHI: r2 r3
  0x016f: PHI (r2v31 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x016f: PHI (r3v17 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0181 A[PHI: r2 r3
  0x0181: PHI (r2v29 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0181: PHI (r3v16 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0193 A[PHI: r2 r3
  0x0193: PHI (r2v27 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0193: PHI (r3v15 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01a5 A[PHI: r2 r3
  0x01a5: PHI (r2v24 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x01a5: PHI (r3v13 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01bc A[PHI: r2 r3
  0x01bc: PHI (r2v22 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x01bc: PHI (r3v12 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01ce A[PHI: r2 r3
  0x01ce: PHI (r2v20 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r3v11 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e0 A[PHI: r2 r3
  0x01e0: PHI (r2v19 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x01e0: PHI (r3v10 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ec A[PHI: r2 r3
  0x01ec: PHI (r2v17 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x01ec: PHI (r3v9 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01fe A[PHI: r2 r3
  0x01fe: PHI (r2v13 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x01fe: PHI (r3v7 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0219 A[PHI: r2 r3
  0x0219: PHI (r2v11 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0219: PHI (r3v6 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0231 A[PHI: r2 r3
  0x0231: PHI (r2v9 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0231: PHI (r3v5 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0243 A[PHI: r2 r3
  0x0243: PHI (r2v7 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0243: PHI (r3v4 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x025b A[PHI: r2 r3
  0x025b: PHI (r2v4 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x025b: PHI (r3v2 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0272 A[PHI: r2 r3
  0x0272: PHI (r2v2 o.mergeJsonObjects) = (r2v1 o.mergeJsonObjects), (r2v67 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0272: PHI (r3v1 o.mergeJsonObjects) = (r3v0 o.mergeJsonObjects), (r3v36 o.mergeJsonObjects) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        mergeJsonObjects mergejsonobjects;
        mergeJsonObjects mergejsonobjects2;
        InitializeAppStartupItemsImpl initializeAppStartupItemsImpl;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 93;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = this.write;
            mergejsonobjects = this.RemoteActionCompatParcelizer;
            mergejsonobjects2 = this.serializer;
            switch (i4) {
                case 0:
                    return new ExecuteTwoFaApiRequest(new AccessibilityKey(), (isOpenInternalroom_runtime) mergejsonobjects2.write(), (withRect) mergejsonobjects.write());
                case 1:
                    Application application = (Application) mergejsonobjects2.write();
                    getAllSemanticsNodesToMap getallsemanticsnodestomap = (getAllSemanticsNodesToMap) mergejsonobjects.write();
                    application.getClass();
                    getallsemanticsnodestomap.getClass();
                    return new requestInputModeiuPiT84(application, getallsemanticsnodestomap);
                case 2:
                    return new getGestureEnd5zf0vsI((getToggleableState) mergejsonobjects2.write(), (WebDispatcherChat) mergejsonobjects.write());
                case 3:
                    getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0 = (getPivotOffsetF1C5BW0) mergejsonobjects2.write();
                    accessgetOldDependenciesSetp accessgetolddependenciessetp = (accessgetOldDependenciesSetp) mergejsonobjects.write();
                    getpivotoffsetf1c5bw0.getClass();
                    accessgetolddependenciessetp.getClass();
                    return new getSegmentFrequentTick5zf0vsI(getpivotoffsetf1c5bw0, accessgetolddependenciessetp);
                case 4:
                    GetHelpCenterParamsUseCase getHelpCenterParamsUseCase = new GetHelpCenterParamsUseCase((getPivotOffsetF1C5BW0) mergejsonobjects2.write(), (getMinWidth) mergejsonobjects.write());
                    int i5 = IconCompatParcelizer + 55;
                    read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return getHelpCenterParamsUseCase;
                case 5:
                    return new getPreviousPressed((transferSessionPackageI) mergejsonobjects2.write(), (isEnabledI) mergejsonobjects.write());
                case 6:
                    return new CardView$1((parseLayoutDescription) mergejsonobjects2.write(), mergejsonobjects);
                case 7:
                    return new PlayStoreBasedAppUpdate((Application) mergejsonobjects2.write(), (SharedPreferences) mergejsonobjects.write());
                case 8:
                    return new H$b((AuthRepository) mergejsonobjects2.write(), (SaveAuthDataUseCase) mergejsonobjects.write());
                case 9:
                    return new getMaxTextLengthdelegate((AuthRepository) mergejsonobjects2.write(), new getActionViewIntentlambda0(), (transferSessionPackageI) mergejsonobjects.write());
                case 10:
                    return new isContainerdelegate((SemanticsPropertiesTestTag1) mergejsonobjects2.write(), (AuthStateMachine) mergejsonobjects.write());
                case 11:
                    return new GetUserAuthStateImpl((AuthRepository) mergejsonobjects2.write(), (IsUserAuthenticatedWrapper) mergejsonobjects.write());
                case 12:
                    return new InitializeAppStartupItemsImpl((AuthRepository) mergejsonobjects2.write(), (IsUserAuthenticatedWrapper) mergejsonobjects.write());
                case 13:
                    return new Vw$Vw((transferSessionPackageI) mergejsonobjects2.write(), (AuthRepository) mergejsonobjects.write());
                case 14:
                    return new InitializeAppStartupItemsImpl((transferSessionPackageI) mergejsonobjects2.write(), (AuthRepository) mergejsonobjects.write());
                case 15:
                    return new Parser.Pair((transferSessionPackageI) mergejsonobjects2.write(), (setTextCompositionRangepsREZIo) mergejsonobjects.write());
                case 16:
                    return new SemanticsPropertyKey((setShowingTextSubstitution) mergejsonobjects2.write(), (setTextCompositionRangepsREZIo) mergejsonobjects.write());
                case 17:
                    getTextDirections_7Xco gettextdirections_7xco = (getTextDirections_7Xco) mergejsonobjects2.write();
                    registerOnChangedCallback registeronchangedcallback = (registerOnChangedCallback) mergejsonobjects.write();
                    gettextdirections_7xco.getClass();
                    registeronchangedcallback.getClass();
                    return new getScreenOffsetnOccac(gettextdirections_7xco, registeronchangedcallback);
                case 18:
                    return new DeliveryChatVisibilityUseCase((getPivotOffsetF1C5BW0) mergejsonobjects2.write(), (TextUnitType) mergejsonobjects.write());
                case 19:
                    return new InitializeAppStartupItemsImpl((getPivotOffsetF1C5BW0) mergejsonobjects2.write(), (TextUnitType) mergejsonobjects.write());
                case 20:
                    initializeAppStartupItemsImpl = new InitializeAppStartupItemsImpl((SelfServiceCustomerChatRepositoryImpl) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
                    i = read + 107;
                    IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        return initializeAppStartupItemsImpl;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                case 21:
                    return new getViewToWindowMatrix3i98HWw((getPivotOffsetF1C5BW0) mergejsonobjects2.write(), (forEachNewCallbackNeverInvoked) mergejsonobjects.write());
                case 22:
                    ChatAssetCacheLocalWebServer chatAssetCacheLocalWebServer = (ChatAssetCacheLocalWebServer) mergejsonobjects2.write();
                    getBulletListSettingStackui_text getbulletlistsettingstackui_text = (getBulletListSettingStackui_text) mergejsonobjects.write();
                    withBulletListo2QH7mI withbulletlisto2qh7mi = new withBulletListo2QH7mI();
                    chatAssetCacheLocalWebServer.getClass();
                    getbulletlistsettingstackui_text.getClass();
                    ProtobufEncoder protobufEncoder = new ProtobufEncoder();
                    protobufEncoder.write = chatAssetCacheLocalWebServer;
                    protobufEncoder.serializer = getbulletlistsettingstackui_text;
                    protobufEncoder.RemoteActionCompatParcelizer = withbulletlisto2qh7mi;
                    return protobufEncoder;
                case 23:
                    return new DownloadChatAssetsUseCase((getTextLayoutInput) mergejsonobjects2.write(), (ChatAssetCacheManager) mergejsonobjects.write());
                case 24:
                    return new getCache((Application) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
                case 25:
                    return new optionalFontFamilyFromName((AnnotatedStringspecialinlinedsortedBy1) mergejsonobjects2.write(), (AnnotatedStringCompanion) mergejsonobjects.write());
                case 26:
                    return new getAnnotatedString((MultiParagraph) mergejsonobjects2.write(), (toAnnotatedStringdefault) mergejsonobjects.write());
                case 27:
                    return new paintRPmYEkkdefault((GetUserAuthStateImpl) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
                case 28:
                    return new InitializeAppStartupItemsImpl((WebChatNativeCacheDataStore) mergejsonobjects2.write(), (ChatAssetCacheManager) mergejsonobjects.write());
                default:
                    return new GetChatAssetDownloadConfig((TextUnitType) mergejsonobjects2.write(), (SelfServiceCustomerChatRepositoryImpl) mergejsonobjects.write());
            }
        }
        int i7 = this.write;
        mergejsonobjects = this.RemoteActionCompatParcelizer;
        mergejsonobjects2 = this.serializer;
        int i8 = 92 / 0;
        switch (i7) {
            case 0:
                return new ExecuteTwoFaApiRequest(new AccessibilityKey(), (isOpenInternalroom_runtime) mergejsonobjects2.write(), (withRect) mergejsonobjects.write());
            case 1:
                Application application2 = (Application) mergejsonobjects2.write();
                getAllSemanticsNodesToMap getallsemanticsnodestomap2 = (getAllSemanticsNodesToMap) mergejsonobjects.write();
                application2.getClass();
                getallsemanticsnodestomap2.getClass();
                return new requestInputModeiuPiT84(application2, getallsemanticsnodestomap2);
            case 2:
                return new getGestureEnd5zf0vsI((getToggleableState) mergejsonobjects2.write(), (WebDispatcherChat) mergejsonobjects.write());
            case 3:
                getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw1 = (getPivotOffsetF1C5BW0) mergejsonobjects2.write();
                accessgetOldDependenciesSetp accessgetolddependenciessetp2 = (accessgetOldDependenciesSetp) mergejsonobjects.write();
                getpivotoffsetf1c5bw1.getClass();
                accessgetolddependenciessetp2.getClass();
                return new getSegmentFrequentTick5zf0vsI(getpivotoffsetf1c5bw1, accessgetolddependenciessetp2);
            case 4:
                GetHelpCenterParamsUseCase getHelpCenterParamsUseCase2 = new GetHelpCenterParamsUseCase((getPivotOffsetF1C5BW0) mergejsonobjects2.write(), (getMinWidth) mergejsonobjects.write());
                int i9 = IconCompatParcelizer + 55;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return getHelpCenterParamsUseCase2;
            case 5:
                return new getPreviousPressed((transferSessionPackageI) mergejsonobjects2.write(), (isEnabledI) mergejsonobjects.write());
            case 6:
                return new CardView$1((parseLayoutDescription) mergejsonobjects2.write(), mergejsonobjects);
            case 7:
                return new PlayStoreBasedAppUpdate((Application) mergejsonobjects2.write(), (SharedPreferences) mergejsonobjects.write());
            case 8:
                return new H$b((AuthRepository) mergejsonobjects2.write(), (SaveAuthDataUseCase) mergejsonobjects.write());
            case 9:
                return new getMaxTextLengthdelegate((AuthRepository) mergejsonobjects2.write(), new getActionViewIntentlambda0(), (transferSessionPackageI) mergejsonobjects.write());
            case 10:
                return new isContainerdelegate((SemanticsPropertiesTestTag1) mergejsonobjects2.write(), (AuthStateMachine) mergejsonobjects.write());
            case 11:
                return new GetUserAuthStateImpl((AuthRepository) mergejsonobjects2.write(), (IsUserAuthenticatedWrapper) mergejsonobjects.write());
            case 12:
                return new InitializeAppStartupItemsImpl((AuthRepository) mergejsonobjects2.write(), (IsUserAuthenticatedWrapper) mergejsonobjects.write());
            case 13:
                return new Vw$Vw((transferSessionPackageI) mergejsonobjects2.write(), (AuthRepository) mergejsonobjects.write());
            case 14:
                return new InitializeAppStartupItemsImpl((transferSessionPackageI) mergejsonobjects2.write(), (AuthRepository) mergejsonobjects.write());
            case 15:
                return new Parser.Pair((transferSessionPackageI) mergejsonobjects2.write(), (setTextCompositionRangepsREZIo) mergejsonobjects.write());
            case 16:
                return new SemanticsPropertyKey((setShowingTextSubstitution) mergejsonobjects2.write(), (setTextCompositionRangepsREZIo) mergejsonobjects.write());
            case 17:
                getTextDirections_7Xco gettextdirections_7xco2 = (getTextDirections_7Xco) mergejsonobjects2.write();
                registerOnChangedCallback registeronchangedcallback2 = (registerOnChangedCallback) mergejsonobjects.write();
                gettextdirections_7xco2.getClass();
                registeronchangedcallback2.getClass();
                return new getScreenOffsetnOccac(gettextdirections_7xco2, registeronchangedcallback2);
            case 18:
                return new DeliveryChatVisibilityUseCase((getPivotOffsetF1C5BW0) mergejsonobjects2.write(), (TextUnitType) mergejsonobjects.write());
            case 19:
                return new InitializeAppStartupItemsImpl((getPivotOffsetF1C5BW0) mergejsonobjects2.write(), (TextUnitType) mergejsonobjects.write());
            case 20:
                initializeAppStartupItemsImpl = new InitializeAppStartupItemsImpl((SelfServiceCustomerChatRepositoryImpl) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
                i = read + 107;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    return initializeAppStartupItemsImpl;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            case 21:
                return new getViewToWindowMatrix3i98HWw((getPivotOffsetF1C5BW0) mergejsonobjects2.write(), (forEachNewCallbackNeverInvoked) mergejsonobjects.write());
            case 22:
                ChatAssetCacheLocalWebServer chatAssetCacheLocalWebServer2 = (ChatAssetCacheLocalWebServer) mergejsonobjects2.write();
                getBulletListSettingStackui_text getbulletlistsettingstackui_text2 = (getBulletListSettingStackui_text) mergejsonobjects.write();
                withBulletListo2QH7mI withbulletlisto2qh7mi2 = new withBulletListo2QH7mI();
                chatAssetCacheLocalWebServer2.getClass();
                getbulletlistsettingstackui_text2.getClass();
                ProtobufEncoder protobufEncoder2 = new ProtobufEncoder();
                protobufEncoder2.write = chatAssetCacheLocalWebServer2;
                protobufEncoder2.serializer = getbulletlistsettingstackui_text2;
                protobufEncoder2.RemoteActionCompatParcelizer = withbulletlisto2qh7mi2;
                return protobufEncoder2;
            case 23:
                return new DownloadChatAssetsUseCase((getTextLayoutInput) mergejsonobjects2.write(), (ChatAssetCacheManager) mergejsonobjects.write());
            case 24:
                return new getCache((Application) mergejsonobjects2.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            case 25:
                return new optionalFontFamilyFromName((AnnotatedStringspecialinlinedsortedBy1) mergejsonobjects2.write(), (AnnotatedStringCompanion) mergejsonobjects.write());
            case 26:
                return new getAnnotatedString((MultiParagraph) mergejsonobjects2.write(), (toAnnotatedStringdefault) mergejsonobjects.write());
            case 27:
                return new paintRPmYEkkdefault((GetUserAuthStateImpl) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
            case 28:
                return new InitializeAppStartupItemsImpl((WebChatNativeCacheDataStore) mergejsonobjects2.write(), (ChatAssetCacheManager) mergejsonobjects.write());
            default:
                return new GetChatAssetDownloadConfig((TextUnitType) mergejsonobjects2.write(), (SelfServiceCustomerChatRepositoryImpl) mergejsonobjects.write());
        }
    }
}
