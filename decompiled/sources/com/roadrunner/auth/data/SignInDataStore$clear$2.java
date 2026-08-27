package com.roadrunner.auth.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import com.mapbox.navigation.core.trip.session.NavigationSessionState$Idle;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewRenderRouteLineClearDataValue;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineClearValue;
import io.sentry.android.core.SentryLogcatAdapter;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.getCieXyz;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getSceneString;
import o.getScrollToIndex;
import o.onViewAdded;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInDataStore$clear$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignInDataStore$clear$2(int i) {
        super(2, null);
        this.serializer = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignInDataStore$clear$2(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.serializer = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 119;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = 21;
        int i5 = 9;
        int i6 = 0;
        switch (this.serializer) {
            case 0:
                SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(i, i6, shortNewsContentCardView);
                signInDataStore$clear$2.IconCompatParcelizer = obj;
                return signInDataStore$clear$2;
            case 1:
                SignInDataStore$clear$2 signInDataStore$clear$3 = new SignInDataStore$clear$2(i, 1, shortNewsContentCardView);
                signInDataStore$clear$3.IconCompatParcelizer = obj;
                return signInDataStore$clear$3;
            case 2:
                SignInDataStore$clear$2 signInDataStore$clear$4 = new SignInDataStore$clear$2(i, i, shortNewsContentCardView);
                signInDataStore$clear$4.IconCompatParcelizer = obj;
                return signInDataStore$clear$4;
            case 3:
                SignInDataStore$clear$2 signInDataStore$clear$5 = new SignInDataStore$clear$2(i, 3, shortNewsContentCardView);
                signInDataStore$clear$5.IconCompatParcelizer = obj;
                return signInDataStore$clear$5;
            case 4:
                SignInDataStore$clear$2 signInDataStore$clear$6 = new SignInDataStore$clear$2(i, 4, shortNewsContentCardView);
                signInDataStore$clear$6.IconCompatParcelizer = obj;
                return signInDataStore$clear$6;
            case 5:
                SignInDataStore$clear$2 signInDataStore$clear$7 = new SignInDataStore$clear$2(i, 5, shortNewsContentCardView);
                signInDataStore$clear$7.IconCompatParcelizer = obj;
                return signInDataStore$clear$7;
            case 6:
                SignInDataStore$clear$2 signInDataStore$clear$8 = new SignInDataStore$clear$2(i, 6, shortNewsContentCardView);
                signInDataStore$clear$8.IconCompatParcelizer = obj;
                return signInDataStore$clear$8;
            case 7:
                SignInDataStore$clear$2 signInDataStore$clear$9 = new SignInDataStore$clear$2(i, 7, shortNewsContentCardView);
                signInDataStore$clear$9.IconCompatParcelizer = obj;
                return signInDataStore$clear$9;
            case 8:
                SignInDataStore$clear$2 signInDataStore$clear$10 = new SignInDataStore$clear$2(i, 8, shortNewsContentCardView);
                signInDataStore$clear$10.IconCompatParcelizer = obj;
                return signInDataStore$clear$10;
            case 9:
                SignInDataStore$clear$2 signInDataStore$clear$11 = new SignInDataStore$clear$2(i, i5, shortNewsContentCardView);
                signInDataStore$clear$11.IconCompatParcelizer = obj;
                return signInDataStore$clear$11;
            case 10:
                SignInDataStore$clear$2 signInDataStore$clear$12 = new SignInDataStore$clear$2(i, 10, shortNewsContentCardView);
                signInDataStore$clear$12.IconCompatParcelizer = obj;
                return signInDataStore$clear$12;
            case 11:
                SignInDataStore$clear$2 signInDataStore$clear$13 = new SignInDataStore$clear$2(i, 11, shortNewsContentCardView);
                signInDataStore$clear$13.IconCompatParcelizer = obj;
                return signInDataStore$clear$13;
            case 12:
                SignInDataStore$clear$2 signInDataStore$clear$14 = new SignInDataStore$clear$2(i, 12, shortNewsContentCardView);
                signInDataStore$clear$14.IconCompatParcelizer = obj;
                return signInDataStore$clear$14;
            case 13:
                SignInDataStore$clear$2 signInDataStore$clear$15 = new SignInDataStore$clear$2(i, 13, shortNewsContentCardView);
                signInDataStore$clear$15.IconCompatParcelizer = obj;
                return signInDataStore$clear$15;
            case 14:
                SignInDataStore$clear$2 signInDataStore$clear$16 = new SignInDataStore$clear$2(i, 14, shortNewsContentCardView);
                signInDataStore$clear$16.IconCompatParcelizer = obj;
                int i7 = read + 73;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 9 / 0;
                }
                return signInDataStore$clear$16;
            case 15:
                SignInDataStore$clear$2 signInDataStore$clear$17 = new SignInDataStore$clear$2(i, 15, shortNewsContentCardView);
                signInDataStore$clear$17.IconCompatParcelizer = obj;
                return signInDataStore$clear$17;
            case 16:
                SignInDataStore$clear$2 signInDataStore$clear$18 = new SignInDataStore$clear$2(i, 16, shortNewsContentCardView);
                signInDataStore$clear$18.IconCompatParcelizer = obj;
                return signInDataStore$clear$18;
            case 17:
                SignInDataStore$clear$2 signInDataStore$clear$19 = new SignInDataStore$clear$2(i, 17, shortNewsContentCardView);
                signInDataStore$clear$19.IconCompatParcelizer = obj;
                return signInDataStore$clear$19;
            case 18:
                SignInDataStore$clear$2 signInDataStore$clear$20 = new SignInDataStore$clear$2(i, 18, shortNewsContentCardView);
                signInDataStore$clear$20.IconCompatParcelizer = obj;
                int i9 = RemoteActionCompatParcelizer + 9;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    return signInDataStore$clear$20;
                }
                throw null;
            case 19:
                SignInDataStore$clear$2 signInDataStore$clear$21 = new SignInDataStore$clear$2(i, 19, shortNewsContentCardView);
                signInDataStore$clear$21.IconCompatParcelizer = obj;
                return signInDataStore$clear$21;
            case 20:
                SignInDataStore$clear$2 signInDataStore$clear$22 = new SignInDataStore$clear$2(i, 20, shortNewsContentCardView);
                signInDataStore$clear$22.IconCompatParcelizer = obj;
                return signInDataStore$clear$22;
            case 21:
                SignInDataStore$clear$2 signInDataStore$clear$23 = new SignInDataStore$clear$2(i, i4, shortNewsContentCardView);
                signInDataStore$clear$23.IconCompatParcelizer = obj;
                return signInDataStore$clear$23;
            case 22:
                SignInDataStore$clear$2 signInDataStore$clear$24 = new SignInDataStore$clear$2(i, 22, shortNewsContentCardView);
                signInDataStore$clear$24.IconCompatParcelizer = obj;
                return signInDataStore$clear$24;
            case 23:
                SignInDataStore$clear$2 signInDataStore$clear$25 = new SignInDataStore$clear$2(i, 23, shortNewsContentCardView);
                signInDataStore$clear$25.IconCompatParcelizer = obj;
                int i10 = read + 21;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 62 / 0;
                }
                return signInDataStore$clear$25;
            case 24:
                SignInDataStore$clear$2 signInDataStore$clear$26 = new SignInDataStore$clear$2(i, 24, shortNewsContentCardView);
                signInDataStore$clear$26.IconCompatParcelizer = obj;
                return signInDataStore$clear$26;
            default:
                SignInDataStore$clear$2 signInDataStore$clear$27 = new SignInDataStore$clear$2(i, 25, shortNewsContentCardView);
                signInDataStore$clear$27.IconCompatParcelizer = obj;
                return signInDataStore$clear$27;
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 3;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i4) {
            case 0:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 1:
                ((SignInDataStore$clear$2) create((String) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 2:
                return ((SignInDataStore$clear$2) create((RouteLineClearValue) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 4:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 5:
                return ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                Object objInvokeSuspend = ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = read + 111;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            case 9:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 10:
                return ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i7 = read + 85;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return createfromparcel;
            case 12:
                Object objInvokeSuspend2 = ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i9 = read + 117;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return objInvokeSuspend2;
            case 13:
                Object objInvokeSuspend3 = ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i11 = RemoteActionCompatParcelizer + 107;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return objInvokeSuspend3;
            case 14:
                return ((SignInDataStore$clear$2) create((RoutesUpdatedResult) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                return ((SignInDataStore$clear$2) create((getScrollToIndex) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 17:
                return ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((SignInDataStore$clear$2) create((getOptimizationLevel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 22:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 23:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 24:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            default:
                ((SignInDataStore$clear$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0225 A[PHI: r4
  0x0225: PHI (r4v3 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0242 A[PHI: r4
  0x0242: PHI (r4v2 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x024f A[PHI: r4
  0x024f: PHI (r4v1 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r4
  0x002e: PHI (r4v16 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b A[PHI: r4
  0x003b: PHI (r4v15 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[PHI: r4
  0x0048: PHI (r4v14 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[PHI: r4
  0x005e: PHI (r4v13 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb A[PHI: r4
  0x00bb: PHI (r4v12 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x0129  */
    /* JADX WARN: Code duplicated, block: B:48:0x013a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149 A[PHI: r4
  0x0149: PHI (r4v9 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x016f A[PHI: r4
  0x016f: PHI (r4v8 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0189  */
    /* JADX WARN: Code duplicated, block: B:68:0x0197  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ed A[PHI: r4
  0x01ed: PHI (r4v5 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa A[PHI: r4
  0x01fa: PHI (r4v4 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v19 o.createFromParcel) binds: [B:12:0x0029, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0207  */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x0225, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        createFromParcel createfromparcel;
        getOptimizationLevel getoptimizationlevel;
        getOptimizationLevel getoptimizationlevel2;
        getOptimizationLevel getoptimizationlevel3;
        getOptimizationLevel getoptimizationlevel4;
        getOptimizationLevel getoptimizationlevel5;
        getOptimizationLevel getoptimizationlevel6;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        read = i2 % Fields.SpotShadowColor;
        boolean z = false;
        boolean z2 = true;
        if (i2 % 2 != 0) {
            int i3 = this.serializer;
            createfromparcel = createFromParcel.INSTANCE;
            switch (i3) {
                case 0:
                    backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch.write();
                    return createfromparcel;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SentryLogcatAdapter.serializer("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.IconCompatParcelizer));
                    return createfromparcel;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    RouteLineClearValue routeLineClearValue = (RouteLineClearValue) this.IconCompatParcelizer;
                    routeLineClearValue.getClass();
                    return new RouteLineViewRenderRouteLineClearDataValue(routeLineClearValue.getPrimaryRouteSource$ui_maps_release(), routeLineClearValue.getAlternativeRoutesSources$ui_maps_release(), routeLineClearValue.getWaypointsSource$ui_maps_release());
                case 3:
                    backwardFocusSearch backwardfocussearch2 = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch2.write();
                    return createfromparcel;
                case 4:
                    backwardFocusSearch backwardfocussearch3 = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch3.write();
                    return createfromparcel;
                case 5:
                    getOptimizationLevel getoptimizationlevel7 = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return Boolean.valueOf(!(getoptimizationlevel7 instanceof getSceneString) || (getoptimizationlevel7 instanceof getMaxWidth));
                case 6:
                    getoptimizationlevel = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!(getoptimizationlevel instanceof getSceneString)) {
                        int i4 = RemoteActionCompatParcelizer + 23;
                        read = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        if (getoptimizationlevel instanceof getMaxWidth) {
                        }
                    }
                    return Boolean.valueOf(z);
                case 7:
                    getoptimizationlevel3 = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!(getoptimizationlevel3 instanceof getSceneString)) {
                        z2 = z;
                    }
                    return Boolean.valueOf(z2);
                case 8:
                    getoptimizationlevel4 = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!(getoptimizationlevel4 instanceof getSceneString)) {
                        int i6 = RemoteActionCompatParcelizer + 103;
                        read = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (!(getoptimizationlevel4 instanceof getMaxWidth)) {
                            z2 = z;
                        }
                    }
                    return Boolean.valueOf(z2);
                case 9:
                    backwardFocusSearch backwardfocussearch4 = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch4.write();
                    return createfromparcel;
                case 10:
                    getoptimizationlevel5 = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!(getoptimizationlevel5 instanceof getSceneString)) {
                        z2 = z;
                    }
                    return Boolean.valueOf(z2);
                case 11:
                    backwardFocusSearch backwardfocussearch5 = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch5.write();
                    return createfromparcel;
                case 12:
                    getoptimizationlevel2 = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (getoptimizationlevel2 instanceof getSceneString) {
                        int i8 = read + 5;
                        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        z = true;
                    } else {
                        int i10 = read + 5;
                        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        z = true;
                    }
                    return Boolean.valueOf(z);
                case 13:
                    getoptimizationlevel6 = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!(getoptimizationlevel6 instanceof getSceneString)) {
                        z2 = z;
                    }
                    return Boolean.valueOf(z2);
                case 14:
                    RoutesUpdatedResult routesUpdatedResult = (RoutesUpdatedResult) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return Boolean.valueOf(routesUpdatedResult.navigationRoutes.isEmpty());
                case 15:
                    getScrollToIndex getscrolltoindex = (getScrollToIndex) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getscrolltoindex, NavigationSessionState$Idle.INSTANCE}, getCieXyz.write())).booleanValue());
                case 16:
                    backwardFocusSearch backwardfocussearch6 = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch6.write();
                    return createfromparcel;
                case 17:
                    getOptimizationLevel getoptimizationlevel8 = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getoptimizationlevel8.getClass();
                    return Boolean.valueOf(!(getoptimizationlevel8 instanceof onViewAdded));
                case 18:
                    getOptimizationLevel getoptimizationlevel9 = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getoptimizationlevel9.getClass();
                    return Boolean.valueOf(!(getoptimizationlevel9 instanceof onViewAdded));
                case 19:
                    getOptimizationLevel getoptimizationlevel10 = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getoptimizationlevel10.getClass();
                    return Boolean.valueOf(!(getoptimizationlevel10 instanceof onViewAdded));
                case 20:
                    getOptimizationLevel getoptimizationlevel11 = (getOptimizationLevel) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getoptimizationlevel11.getClass();
                    return Boolean.valueOf(!(getoptimizationlevel11 instanceof onViewAdded));
                case 21:
                    backwardFocusSearch backwardfocussearch7 = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch7.write();
                    return createfromparcel;
                case 22:
                    backwardFocusSearch backwardfocussearch8 = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch8.write();
                    int i12 = RemoteActionCompatParcelizer + 75;
                    read = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    return createfromparcel;
                case 23:
                    backwardFocusSearch backwardfocussearch9 = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch9.write();
                    return createfromparcel;
                case 24:
                    backwardFocusSearch backwardfocussearch10 = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch10.write();
                    return createfromparcel;
                default:
                    backwardFocusSearch backwardfocussearch11 = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch11.write();
                    return createfromparcel;
            }
        }
        int i14 = this.serializer;
        createfromparcel = createFromParcel.INSTANCE;
        switch (i14) {
            case 0:
                backwardFocusSearch backwardfocussearch12 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch12.write();
                return createfromparcel;
            case 1:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SentryLogcatAdapter.serializer("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.IconCompatParcelizer));
                return createfromparcel;
            case 2:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RouteLineClearValue routeLineClearValue2 = (RouteLineClearValue) this.IconCompatParcelizer;
                routeLineClearValue2.getClass();
                return new RouteLineViewRenderRouteLineClearDataValue(routeLineClearValue2.getPrimaryRouteSource$ui_maps_release(), routeLineClearValue2.getAlternativeRoutesSources$ui_maps_release(), routeLineClearValue2.getWaypointsSource$ui_maps_release());
            case 3:
                backwardFocusSearch backwardfocussearch13 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch13.write();
                return createfromparcel;
            case 4:
                backwardFocusSearch backwardfocussearch14 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch14.write();
                return createfromparcel;
            case 5:
                getOptimizationLevel getoptimizationlevel12 = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return Boolean.valueOf(!(getoptimizationlevel12 instanceof getSceneString) || (getoptimizationlevel12 instanceof getMaxWidth));
            case 6:
                getoptimizationlevel = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons33 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (!(getoptimizationlevel instanceof getSceneString)) {
                    int i15 = RemoteActionCompatParcelizer + 23;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    z = getoptimizationlevel instanceof getMaxWidth;
                }
                return Boolean.valueOf(z);
            case 7:
                z = true;
                getoptimizationlevel3 = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons34 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (!(getoptimizationlevel3 instanceof getSceneString) && !(getoptimizationlevel3 instanceof getMaxWidth)) {
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            case 8:
                z = true;
                getoptimizationlevel4 = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons35 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (!(getoptimizationlevel4 instanceof getSceneString)) {
                    int i17 = RemoteActionCompatParcelizer + 103;
                    read = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    if (!(getoptimizationlevel4 instanceof getMaxWidth)) {
                        z2 = z;
                    }
                }
                return Boolean.valueOf(z2);
            case 9:
                backwardFocusSearch backwardfocussearch15 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons110 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch15.write();
                return createfromparcel;
            case 10:
                z = true;
                getoptimizationlevel5 = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons111 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if ((!(getoptimizationlevel5 instanceof getSceneString)) && !(getoptimizationlevel5 instanceof getMaxWidth)) {
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            case 11:
                backwardFocusSearch backwardfocussearch16 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch16.write();
                return createfromparcel;
            case 12:
                getoptimizationlevel2 = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons113 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if ((getoptimizationlevel2 instanceof getSceneString) || (getoptimizationlevel2 instanceof getMaxWidth)) {
                    int i19 = read + 5;
                    RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                z = true;
                getoptimizationlevel6 = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons114 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (!(getoptimizationlevel6 instanceof getSceneString) && !(getoptimizationlevel6 instanceof getMaxWidth)) {
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            case 14:
                RoutesUpdatedResult routesUpdatedResult2 = (RoutesUpdatedResult) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons115 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return Boolean.valueOf(routesUpdatedResult2.navigationRoutes.isEmpty());
            case 15:
                getScrollToIndex getscrolltoindex2 = (getScrollToIndex) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons116 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getscrolltoindex2, NavigationSessionState$Idle.INSTANCE}, getCieXyz.write())).booleanValue());
            case 16:
                backwardFocusSearch backwardfocussearch17 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons117 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch17.write();
                return createfromparcel;
            case 17:
                getOptimizationLevel getoptimizationlevel13 = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons118 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getoptimizationlevel13.getClass();
                return Boolean.valueOf(!(getoptimizationlevel13 instanceof onViewAdded));
            case 18:
                getOptimizationLevel getoptimizationlevel14 = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons119 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getoptimizationlevel14.getClass();
                return Boolean.valueOf(!(getoptimizationlevel14 instanceof onViewAdded));
            case 19:
                getOptimizationLevel getoptimizationlevel15 = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons210 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getoptimizationlevel15.getClass();
                return Boolean.valueOf(!(getoptimizationlevel15 instanceof onViewAdded));
            case 20:
                getOptimizationLevel getoptimizationlevel16 = (getOptimizationLevel) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons211 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getoptimizationlevel16.getClass();
                return Boolean.valueOf(!(getoptimizationlevel16 instanceof onViewAdded));
            case 21:
                backwardFocusSearch backwardfocussearch18 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch18.write();
                return createfromparcel;
            case 22:
                backwardFocusSearch backwardfocussearch19 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons213 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch19.write();
                int i111 = RemoteActionCompatParcelizer + 75;
                read = i111 % Fields.SpotShadowColor;
                int i112 = i111 % 2;
                return createfromparcel;
            case 23:
                backwardFocusSearch backwardfocussearch20 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons214 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch20.write();
                return createfromparcel;
            case 24:
                backwardFocusSearch backwardfocussearch110 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons215 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch110.write();
                return createfromparcel;
            default:
                backwardFocusSearch backwardfocussearch111 = (backwardFocusSearch) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons216 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch111.write();
                return createfromparcel;
        }
    }
}
