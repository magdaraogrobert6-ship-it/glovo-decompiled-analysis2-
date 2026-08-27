package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.ui.graphics.Fields;
import coil3.intercept.EngineInterceptor;
import com.foodora.courier.main.presentation.MainActivity;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi;
import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.face.verification.presentation.selfie.SelfieFlowViewModel;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.LetterSpacingSpanEm;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShaderKt;
import o.ShortNewsContentCardView;
import o.TextUnitTypeCompanion;
import o.accessquadraticTojd;
import o.applyMeasureResultfoundation;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.executeRequestimpl;
import o.getContentViewGroupParentLayout;
import o.getStatusBarBackground;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relativeMoveTo;
import o.setWidgetBaseline;
import o.tryMaxWidthJN0ABg;
import o.tryMinHeightJN0ABg;

/* JADX INFO: loaded from: classes.dex */
public final class MutatorMutex$mutate$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatToken = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public Object MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public Object RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ Object serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(EngineInterceptor engineInterceptor, createInAppMessageEventSubscriber createinappmessageeventsubscriber, createInAppMessageEventSubscriber createinappmessageeventsubscriber2, ShaderKt shaderKt, Object obj, createInAppMessageEventSubscriber createinappmessageeventsubscriber3, accessquadraticTojd accessquadratictojd, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 3;
        this.read = engineInterceptor;
        this.write = createinappmessageeventsubscriber;
        this.RatingCompat = createinappmessageeventsubscriber2;
        this.MediaMetadataCompat = shaderKt;
        this.MediaDescriptionCompat = obj;
        this.IconCompatParcelizer = createinappmessageeventsubscriber3;
        this.serializer = accessquadratictojd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutatorMutex$mutate$2(applyMeasureResultfoundation applymeasureresultfoundation, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = applymeasureresultfoundation;
        this.MediaMetadataCompat = obj;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(WebViewManager webViewManager, MainActivity mainActivity, ArrayList arrayList, TextUnitTypeCompanion textUnitTypeCompanion, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 5;
        this.RatingCompat = webViewManager;
        this.MediaMetadataCompat = mainActivity;
        this.IconCompatParcelizer = arrayList;
        this.serializer = textUnitTypeCompanion;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(LetterSpacingSpanEm letterSpacingSpanEm, Context context, getContentViewGroupParentLayout getcontentviewgroupparentlayout, TncComposableFactoryImpl$$ExternalSyntheticLambda0 tncComposableFactoryImpl$$ExternalSyntheticLambda0, executeRequestimpl executerequestimpl, executeRequestimpl executerequestimpl2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 6;
        this.read = letterSpacingSpanEm;
        this.write = context;
        this.RatingCompat = getcontentviewgroupparentlayout;
        this.MediaMetadataCompat = tncComposableFactoryImpl$$ExternalSyntheticLambda0;
        this.IconCompatParcelizer = executerequestimpl;
        this.serializer = executerequestimpl2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutatorMutex$mutate$2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.MediaDescriptionCompat = obj2;
        this.write = obj3;
        this.RatingCompat = obj4;
        this.MediaMetadataCompat = obj5;
        this.IconCompatParcelizer = obj6;
        this.serializer = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutatorMutex$mutate$2(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.MediaMetadataCompat = obj;
        this.IconCompatParcelizer = obj2;
        this.serializer = obj3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i2) {
            case 0:
                return ((MutatorMutex$mutate$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 1:
                return ((MutatorMutex$mutate$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 2:
                return ((MutatorMutex$mutate$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 3:
                return ((MutatorMutex$mutate$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 4:
                return ((MutatorMutex$mutate$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 5:
                return ((MutatorMutex$mutate$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 6:
                Object objInvokeSuspend = ((MutatorMutex$mutate$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i3 = MediaBrowserCompatMediaItem + 15;
                MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            case 7:
                return ((MutatorMutex$mutate$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            default:
                Object objInvokeSuspend2 = ((MutatorMutex$mutate$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i5 = MediaBrowserCompatMediaItem + 47;
                MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return objInvokeSuspend2;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.MediaMetadataCompat;
        switch (i2) {
            case 0:
                MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2((applyMeasureResultfoundation) obj3, obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 0);
                mutatorMutex$mutate$2.write = obj;
                return mutatorMutex$mutate$2;
            case 1:
                MutatorMutex$mutate$2 mutatorMutex$mutate$3 = new MutatorMutex$mutate$2((tryMaxWidthJN0ABg) obj4, (tryMinHeightJN0ABg) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 1);
                mutatorMutex$mutate$3.write = obj;
                return mutatorMutex$mutate$3;
            case 2:
                MutatorMutex$mutate$2 mutatorMutex$mutate$4 = new MutatorMutex$mutate$2((applyMeasureResultfoundation) obj3, obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 2);
                mutatorMutex$mutate$4.write = obj;
                return mutatorMutex$mutate$4;
            case 3:
                return new MutatorMutex$mutate$2((EngineInterceptor) this.read, (createInAppMessageEventSubscriber) this.write, (createInAppMessageEventSubscriber) this.RatingCompat, (ShaderKt) obj4, this.MediaDescriptionCompat, (createInAppMessageEventSubscriber) obj3, (accessquadraticTojd) obj2, shortNewsContentCardView);
            case 4:
                MutatorMutex$mutate$2 mutatorMutex$mutate$5 = new MutatorMutex$mutate$2((MapboxRouteLineApi) obj4, (AsyncSection) obj3, (MapboxNavigationConsumer) obj2, shortNewsContentCardView, 4);
                int i3 = MediaBrowserCompatMediaItem + 109;
                MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return mutatorMutex$mutate$5;
            case 5:
                MutatorMutex$mutate$2 mutatorMutex$mutate$6 = new MutatorMutex$mutate$2((WebViewManager) this.RatingCompat, (MainActivity) obj4, (ArrayList) obj3, (TextUnitTypeCompanion) obj2, shortNewsContentCardView);
                mutatorMutex$mutate$6.MediaDescriptionCompat = obj;
                return mutatorMutex$mutate$6;
            case 6:
                MutatorMutex$mutate$2 mutatorMutex$mutate$7 = new MutatorMutex$mutate$2((LetterSpacingSpanEm) this.read, (Context) this.write, (getContentViewGroupParentLayout) this.RatingCompat, (TncComposableFactoryImpl$$ExternalSyntheticLambda0) obj4, (executeRequestimpl) obj3, (executeRequestimpl) obj2, shortNewsContentCardView);
                mutatorMutex$mutate$7.MediaDescriptionCompat = obj;
                int i5 = MediaBrowserCompatMediaItem + 43;
                MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return mutatorMutex$mutate$7;
                }
                throw null;
            case 7:
                return new MutatorMutex$mutate$2((SelfieFlowViewModel) this.read, (getContentViewGroupParentLayout) this.MediaDescriptionCompat, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.write, (getStatusBarBackground) this.RatingCompat, (relativeMoveTo) obj4, (PopulateViewStructure_androidKtpopulate7) obj3, (SnackbarHostState) obj2, shortNewsContentCardView, 7);
            default:
                MutatorMutex$mutate$2 mutatorMutex$mutate$8 = new MutatorMutex$mutate$2((NestScreenKt$NestScreen$1$1) this.read, (setWidgetBaseline) this.MediaDescriptionCompat, (Context) this.write, (CameraImage) this.RatingCompat, (NestFragment.AnonymousClass1) obj4, (NestFragment.AnonymousClass1) obj3, (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj2, shortNewsContentCardView, 8);
                int i6 = MediaSessionCompatToken + 115;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return mutatorMutex$mutate$8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x05aa A[PHI: r1 r2 r5
  0x05aa: PHI (r1v30 ??) = (r1v91 ??), (r1v92 ??), (r1v93 ??) binds: [B:208:0x0577, B:217:0x05a8, B:215:0x0598] A[DONT_GENERATE, DONT_INLINE]
  0x05aa: PHI (r2v38 o.setCustomInAppMessageAnimationFactorylambda0) = 
  (r2v33 o.setCustomInAppMessageAnimationFactorylambda0)
  (r2v39 o.setCustomInAppMessageAnimationFactorylambda0)
  (r2v39 o.setCustomInAppMessageAnimationFactorylambda0)
 binds: [B:208:0x0577, B:217:0x05a8, B:215:0x0598] A[DONT_GENERATE, DONT_INLINE]
  0x05aa: PHI (r5v26 ??) = (r5v55 ??), (r5v56 ??), (r5v57 ??) binds: [B:208:0x0577, B:217:0x05a8, B:215:0x0598] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:224:0x05b7 A[Catch: all -> 0x05d5, TRY_LEAVE, TryCatch #8 {all -> 0x05d5, blocks: (B:220:0x05ad, B:221:0x05b0, B:224:0x05b7, B:230:0x05c4, B:231:0x05c6, B:233:0x05cd, B:236:0x05d4), top: B:377:0x05ad }] */
    /* JADX WARN: Code duplicated, block: B:390:0x05b6 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0291, code lost:
    
        if (r6 == r10) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [o.setAutofillHints] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [o.setAutofillHints] */
    /* JADX WARN: Type inference failed for: r1v42, types: [o.setAutofillHints] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r2v0, types: [o.ImageOnlyContentCardViewViewHolder, o.onAnimationEndlambda1, o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [o.isToggle] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r4v14, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r5v22, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 2072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MutatorMutex$mutate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
