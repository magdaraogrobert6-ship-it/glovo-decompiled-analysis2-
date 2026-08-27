package com.mapbox.navigation.core;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.migrations.SharedPreferencesMigration;
import com.google.re2j.Parser;
import com.roadrunner.auth.logout.presentation.LogoutViewModel;
import com.roadrunner.country.config.implementation.data.CountryConfigListRepository;
import com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl;
import com.roadrunner.face.verification.data.SelfieFlowRepository;
import com.roadrunner.face.verification.presentation.selfie.SelfieFlowViewModel;
import com.roadrunner.helpcenter.businessmetrics.repo.BusinessMetricsRepository;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import com.roadrunner.login.presentation.countryselection.CountrySelectionViewModel;
import com.roadrunner.login.presentation.otp.OtpViewModel;
import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import com.roadrunner.login.presentation.router.RouterViewModel;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.PhoneValidationRepository;
import com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl;
import com.roadrunner.sidemenu.data.SideMenuApiRequest;
import com.roadrunner.startworking.data.StartWorkingRepository;
import com.roadrunner.web.performance.WebViewInitializer;
import com.sentiance.core.model.events.N$b;
import io.socket.parser.IOParser$Decoder;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.debounceEntryb8qMvQI;
import o.getReferencedIds;
import o.handleInAppMessageTestPushandroid_sdk_base_release;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigation$parsing$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxNavigation$parsing$2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 63;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.$r8$classId;
        Object obj = this.this$0;
        int i6 = 5;
        switch (i5) {
            case 0:
                return new MapboxNavigation$parsing$2((MapboxNavigation) obj, shortNewsContentCardView, 0);
            case 1:
                return new MapboxNavigation$parsing$2((TextFieldSelectionManager) obj, shortNewsContentCardView, 1);
            case 2:
                return new MapboxNavigation$parsing$2((TooltipStateImpl) obj, shortNewsContentCardView, i);
            case 3:
                return new MapboxNavigation$parsing$2((SharedPreferencesMigration) obj, shortNewsContentCardView, 3);
            case 4:
                return new MapboxNavigation$parsing$2((LogoutViewModel) obj, shortNewsContentCardView, 4);
            case 5:
                return new MapboxNavigation$parsing$2((CountryConfigListRepository) obj, shortNewsContentCardView, i6);
            case 6:
                return new MapboxNavigation$parsing$2((debounceEntryb8qMvQI) obj, shortNewsContentCardView, 6);
            case 7:
                return new MapboxNavigation$parsing$2((ChatUrlProviderImpl) obj, shortNewsContentCardView, 7);
            case 8:
                return new MapboxNavigation$parsing$2((getReferencedIds) obj, shortNewsContentCardView, 8);
            case 9:
                return new MapboxNavigation$parsing$2((SelfieFlowRepository) obj, shortNewsContentCardView, 9);
            case 10:
                return new MapboxNavigation$parsing$2((SelfieFlowViewModel) obj, shortNewsContentCardView, 10);
            case 11:
                MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2((Parser.Pair) obj, shortNewsContentCardView, 11);
                int i7 = read + 5;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return mapboxNavigation$parsing$2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            case 12:
                return new MapboxNavigation$parsing$2((BusinessMetricsRepository) obj, shortNewsContentCardView, 12);
            case 13:
                return new MapboxNavigation$parsing$2((NestComponentRepositoryImpl) obj, shortNewsContentCardView, 13);
            case 14:
                return new MapboxNavigation$parsing$2((IncogniaManagerImpl) obj, shortNewsContentCardView, 14);
            case 15:
                return new MapboxNavigation$parsing$2((LoginActivityViewModel) obj, shortNewsContentCardView, 15);
            case 16:
                return new MapboxNavigation$parsing$2((CountrySelectionViewModel) obj, shortNewsContentCardView, 16);
            case 17:
                return new MapboxNavigation$parsing$2((OtpViewModel) obj, shortNewsContentCardView, 17);
            case 18:
                return new MapboxNavigation$parsing$2((GetAuthStateViewModel) obj, shortNewsContentCardView, 18);
            case 19:
                return new MapboxNavigation$parsing$2((RouterViewModel) obj, shortNewsContentCardView, 19);
            case 20:
                return new MapboxNavigation$parsing$2((N$b) obj, shortNewsContentCardView, 20);
            case 21:
                return new MapboxNavigation$parsing$2((PhoneValidationRepository) obj, shortNewsContentCardView, 21);
            case 22:
                return new MapboxNavigation$parsing$2((OkHttpCall$1) obj, shortNewsContentCardView, 22);
            case 23:
                return new MapboxNavigation$parsing$2((ClearRiderStateDatabaseImpl) obj, shortNewsContentCardView, 23);
            case 24:
                return new MapboxNavigation$parsing$2((IOParser$Decoder) obj, shortNewsContentCardView, 24);
            case 25:
                return new MapboxNavigation$parsing$2((SideMenuApiRequest) obj, shortNewsContentCardView, 25);
            case 26:
                return new MapboxNavigation$parsing$2((StartWorkingRepository) obj, shortNewsContentCardView, 26);
            case 27:
                return new MapboxNavigation$parsing$2((OkHttpCall$1) obj, shortNewsContentCardView, 27);
            case 28:
                return new MapboxNavigation$parsing$2((handleInAppMessageTestPushandroid_sdk_base_release) obj, shortNewsContentCardView, 28);
            default:
                return new MapboxNavigation$parsing$2((WebViewInitializer) obj, shortNewsContentCardView, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[PHI: r2 r5
  0x0026: PHI (r2v32 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r5v119 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[PHI: r2 r5
  0x0031: PHI (r2v31 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r5v115 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[PHI: r2 r5
  0x003c: PHI (r2v30 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r5v111 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0047 A[PHI: r2 r5
  0x0047: PHI (r2v29 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r5v107 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[PHI: r2 r5
  0x0052: PHI (r2v28 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r5v103 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[PHI: r2 r5
  0x005d: PHI (r2v27 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r5v99 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0068 A[PHI: r2 r5
  0x0068: PHI (r2v26 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r5v95 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0073 A[PHI: r2 r5
  0x0073: PHI (r2v25 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0073: PHI (r5v91 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[PHI: r2 r5
  0x007e: PHI (r2v24 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r5v87 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0089 A[PHI: r2 r5
  0x0089: PHI (r2v23 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0089: PHI (r5v83 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[PHI: r2 r5
  0x0094: PHI (r2v22 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r5v79 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x009f A[PHI: r2 r5
  0x009f: PHI (r2v21 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r5v75 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa A[PHI: r2 r5
  0x00aa: PHI (r2v20 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r5v71 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5 A[PHI: r2 r5
  0x00b5: PHI (r2v19 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r5v67 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0 A[PHI: r2 r5
  0x00c0: PHI (r2v18 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00c0: PHI (r5v63 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb A[PHI: r2 r5
  0x00cb: PHI (r2v17 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r5v59 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[PHI: r2 r5
  0x00d6: PHI (r2v16 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00d6: PHI (r5v55 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1 A[PHI: r2 r5
  0x00e1: PHI (r2v15 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00e1: PHI (r5v51 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec A[PHI: r2 r5
  0x00ec: PHI (r2v14 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r5v47 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7 A[PHI: r2 r5
  0x00f7: PHI (r2v13 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r5v43 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0102 A[PHI: r2 r5
  0x0102: PHI (r2v12 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0102: PHI (r5v39 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x010d A[PHI: r2 r5
  0x010d: PHI (r2v11 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r5v35 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0118 A[PHI: r2 r5
  0x0118: PHI (r2v10 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r5v31 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0123 A[PHI: r2 r5
  0x0123: PHI (r2v9 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0123: PHI (r5v27 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x012e A[PHI: r2 r5
  0x012e: PHI (r2v8 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x012e: PHI (r5v23 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0139 A[PHI: r2 r5
  0x0139: PHI (r2v6 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0139: PHI (r5v18 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x014f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0154 A[PHI: r2 r5
  0x0154: PHI (r2v5 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r5v14 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x015f A[PHI: r2 r5
  0x015f: PHI (r2v4 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r5v10 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x016a A[PHI: r2 r5
  0x016a: PHI (r2v3 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x016a: PHI (r5v6 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0175 A[PHI: r2 r5
  0x0175: PHI (r2v2 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v33 o.createFromParcel) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0175: PHI (r5v2 o.ShortNewsContentCardView) = (r5v1 o.ShortNewsContentCardView), (r5v123 o.ShortNewsContentCardView) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        createFromParcel createfromparcel;
        ShortNewsContentCardView shortNewsContentCardView;
        Object objInvokeSuspend;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 59;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = this.$r8$classId;
            createfromparcel = createFromParcel.INSTANCE;
            shortNewsContentCardView = (ShortNewsContentCardView) obj;
            switch (i4) {
                case 0:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 1:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 2:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 3:
                    objInvokeSuspend = ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    i = write + 21;
                    read = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                case 4:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 5:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 6:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 7:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 8:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 9:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 10:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 11:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 12:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 13:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 14:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 15:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 16:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 17:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 18:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 19:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 20:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 21:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 22:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 23:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 24:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 25:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 26:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 27:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 28:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                default:
                    return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
        }
        int i5 = this.$r8$classId;
        createfromparcel = createFromParcel.INSTANCE;
        shortNewsContentCardView = (ShortNewsContentCardView) obj;
        int i6 = 0 / 0;
        switch (i5) {
            case 0:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 1:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 2:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 3:
                objInvokeSuspend = ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                i = write + 21;
                read = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            case 4:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 5:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 6:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 7:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 8:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 9:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 10:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 11:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 12:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 13:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 14:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 15:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 16:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 17:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 18:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 19:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 20:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 21:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 22:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 23:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 24:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 25:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 26:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 27:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 28:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            default:
                return ((MapboxNavigation$parsing$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:227:0x0497 A[PHI: r2 r5
  0x0497: PHI (r2v80 java.util.List) = (r2v75 java.util.List), (r2v81 java.util.List) binds: [B:225:0x0494, B:222:0x0487] A[DONT_GENERATE, DONT_INLINE]
  0x0497: PHI (r5v60 int) = (r5v58 int), (r5v63 int) binds: [B:225:0x0494, B:222:0x0487] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x07b5, code lost:
    
        if (com.roadrunner.auth.logout.presentation.LogoutViewModel.access$logoutUserProcess(r4, r26) == r5) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x090d, code lost:
    
        if (r1 == r2) goto L442;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.core.MapboxNavigation$parsing$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
