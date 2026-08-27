package com.roadrunner.twofa.presentation;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.customerchat.analytics.model.EventCreationRequest;
import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView;
import com.mapbox.navigation.ui.maps.route.line.api.RouteLineValueCommandHolder;
import com.roadrunner.customerchat.selfservice.data.repository.WebChatNativeAssetRepositoryImpl;
import com.roadrunner.delivery.accept.laststop.data.LastStopRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data.UploadSharedContentWorker;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.TextFieldValueCompanion;
import o.accessgetLayerOutlinep;
import o.createFromParcel;
import o.getLoaderManager;
import o.isPermanentFailureimpl;
import o.onActivityPreCreated;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.resolveLockHardwareCanvasMethod;
import o.setReset;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class TwoFaViewModel$onPinChanged$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Object MediaSessionCompatQueueItem;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFaViewModel$onPinChanged$1(String str, isPermanentFailureimpl ispermanentfailureimpl, Map map, ConfirmationRepository confirmationRepository, String str2, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = 8;
        this.serializer = str;
        this.MediaSessionCompatQueueItem = ispermanentfailureimpl;
        this.RemoteActionCompatParcelizer = map;
        this.write = confirmationRepository;
        this.read = str2;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x048d  */
    /* JADX WARN: Code duplicated, block: B:169:0x048f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0493  */
    /* JADX WARN: Code duplicated, block: B:179:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:180:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:182:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:183:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:216:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:221:0x049a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04f4, code lost:
    
        if (r0 == r3) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFaViewModel$onPinChanged$1(WebChatNativeAssetRepositoryImpl webChatNativeAssetRepositoryImpl, String str, String str2, String str3, String str4, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = 4;
        this.MediaSessionCompatQueueItem = webChatNativeAssetRepositoryImpl;
        this.serializer = str;
        this.read = str2;
        this.write = str3;
        this.RemoteActionCompatParcelizer = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFaViewModel$onPinChanged$1(LastStopRepositoryImpl lastStopRepositoryImpl, String str, onActivityPreCreated onactivityprecreated, String str2, String str3, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = 5;
        this.MediaSessionCompatQueueItem = lastStopRepositoryImpl;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = onactivityprecreated;
        this.read = str2;
        this.write = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFaViewModel$onPinChanged$1(getLoaderManager getloadermanager, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = 9;
        this.write = getloadermanager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TwoFaViewModel$onPinChanged$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.MediaSessionCompatQueueItem = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.serializer = obj3;
        this.read = obj4;
        this.write = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TwoFaViewModel$onPinChanged$1(Object obj, String str, String str2, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.MediaSessionCompatQueueItem = obj;
        this.serializer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = obj2;
        this.write = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFaViewModel$onPinChanged$1(RouteLineValueCommandHolder routeLineValueCommandHolder, MapboxRouteLineView mapboxRouteLineView, RouteLineViewOptionsData routeLineViewOptionsData, Style style, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = 2;
        this.MediaSessionCompatQueueItem = routeLineValueCommandHolder;
        this.RemoteActionCompatParcelizer = mapboxRouteLineView;
        this.read = routeLineViewOptionsData;
        this.write = style;
        this.serializer = str;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 123;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        switch (i3) {
            case 0:
                return ((TwoFaViewModel$onPinChanged$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 1:
                return ((TwoFaViewModel$onPinChanged$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 2:
                Object objInvokeSuspend = ((TwoFaViewModel$onPinChanged$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                int i4 = MediaMetadataCompat + 25;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                obj2.hashCode();
                throw null;
            case 3:
                return ((TwoFaViewModel$onPinChanged$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 4:
                return ((TwoFaViewModel$onPinChanged$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 5:
                return ((TwoFaViewModel$onPinChanged$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 6:
                return ((TwoFaViewModel$onPinChanged$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 7:
                return ((TwoFaViewModel$onPinChanged$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 8:
                return ((TwoFaViewModel$onPinChanged$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            default:
                return ((TwoFaViewModel$onPinChanged$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 111;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj = this.write;
        switch (i4) {
            case 0:
                return new TwoFaViewModel$onPinChanged$1((TwoFaViewModel) this.MediaSessionCompatQueueItem, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) this.RemoteActionCompatParcelizer, (String) this.serializer, (String) this.read, (String) obj, shortNewsContentCardView, 0);
            case 1:
                return new TwoFaViewModel$onPinChanged$1((accessgetLayerOutlinep) this.MediaSessionCompatQueueItem, (EventCreationRequest) this.RemoteActionCompatParcelizer, (String) this.serializer, (String) this.read, (resolveLockHardwareCanvasMethod) obj, shortNewsContentCardView, 1);
            case 2:
                return new TwoFaViewModel$onPinChanged$1((RouteLineValueCommandHolder) this.MediaSessionCompatQueueItem, (MapboxRouteLineView) this.RemoteActionCompatParcelizer, (RouteLineViewOptionsData) this.read, (Style) obj, (String) this.serializer, shortNewsContentCardView);
            case 3:
                return new TwoFaViewModel$onPinChanged$1(this.MediaSessionCompatQueueItem, (String) this.serializer, (String) this.read, this.RemoteActionCompatParcelizer, obj, shortNewsContentCardView, 3);
            case 4:
                return new TwoFaViewModel$onPinChanged$1((WebChatNativeAssetRepositoryImpl) this.MediaSessionCompatQueueItem, (String) this.serializer, (String) this.read, (String) obj, (String) this.RemoteActionCompatParcelizer, shortNewsContentCardView);
            case 5:
                return new TwoFaViewModel$onPinChanged$1((LastStopRepositoryImpl) this.MediaSessionCompatQueueItem, (String) this.serializer, (onActivityPreCreated) this.RemoteActionCompatParcelizer, (String) this.read, (String) obj, shortNewsContentCardView);
            case 6:
                return new TwoFaViewModel$onPinChanged$1((UploadSharedContentWorker) this.MediaSessionCompatQueueItem, (setReset) this.RemoteActionCompatParcelizer, (TextFieldValueCompanion) this.serializer, (r8lambdaCTegLFIY2N5eeYL50pY32CICZRI) this.read, (RequestBody) obj, shortNewsContentCardView, 6);
            case 7:
                return new TwoFaViewModel$onPinChanged$1(this.MediaSessionCompatQueueItem, (String) this.serializer, (String) this.read, this.RemoteActionCompatParcelizer, obj, shortNewsContentCardView, 7);
            case 8:
                return new TwoFaViewModel$onPinChanged$1((String) this.serializer, (isPermanentFailureimpl) this.MediaSessionCompatQueueItem, (Map) this.RemoteActionCompatParcelizer, (ConfirmationRepository) obj, (String) this.read, shortNewsContentCardView);
            default:
                TwoFaViewModel$onPinChanged$1 twoFaViewModel$onPinChanged$1 = new TwoFaViewModel$onPinChanged$1((getLoaderManager) obj, shortNewsContentCardView);
                int i5 = RatingCompat + 91;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return twoFaViewModel$onPinChanged$1;
        }
    }
}
