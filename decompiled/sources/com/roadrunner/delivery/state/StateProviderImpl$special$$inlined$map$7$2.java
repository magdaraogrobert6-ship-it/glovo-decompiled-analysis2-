package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import o.AccessibilityDelegateCompat;
import o.AdjustDeeplink;
import o.AdjustEvent;
import o.AndroidUiFrameClock;
import o.AndroidView_androidKtAndroidView32;
import o.C0214y;
import o.DrawableTransformation;
import o.EventResponseData;
import o.GlobalParameters;
import o.GooglePlayInstallReferrerDetails;
import o.GooglePlayServicesClient;
import o.GooglePlayServicesClientGooglePlayServicesConnection;
import o.H;
import o.J;
import o.K;
import o.L;
import o.LineBreakCompanion;
import o.OnAdidReadListener;
import o.OnAttributionChangedListener;
import o.OnEventTrackingSucceededListener;
import o.OnGoogleAdIdReadListener;
import o.OnGooglePlayInstallReferrerReadListener;
import o.OnIsEnabledListener;
import o.OnSdkVersionReadListener;
import o.OnThirdPartySharingSettingsChangedListener;
import o.Person;
import o.RemoteActionCompat;
import o.ShortNewsContentCardView;
import o.StaggeredGridLayoutManager;
import o.accessgetInstancedelegatecp;
import o.callbackSuccessAsync;
import o.createFromParcel;
import o.deepCopy;
import o.dispatchPopulateAccessibilityEvent;
import o.drawRGB;
import o.e8;
import o.e9ExternalSyntheticLambda0;
import o.ea;
import o.getActionViewIntentlambda0;
import o.getCallbackId;
import o.getCieXyz;
import o.getFailureResponseData;
import o.getGooglePlayServicesInfo;
import o.getHuaweiAppGalleryReferrer;
import o.getLicenseRequiredData;
import o.getReferrer;
import o.getStrictnessusljTpc;
import o.getUnspecifiedrAG3T2kannotations;
import o.getWindowAreaDisplayMetrics;
import o.getWindowAreaStatus;
import o.igExternalSyntheticLambda7;
import o.invokeInstanceMethod;
import o.isItemDismissable;
import o.isTrackingEnabled;
import o.maybeRegisterBackCallback;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onPrimaryNavigationFragmentChanged;
import o.onVerificationFinished;
import o.onViewAttachedToWindowlambda0;
import o.performConfigurationChanged;
import o.performCreateOptionsMenu;
import o.removeNodeAtDepth;
import o.requireParentFragment;
import o.sa;
import o.se;
import o.setLayoutFrozen;
import o.setPreinstallFilePath;
import o.setSdkPrefix;
import o.setStoreInfo;
import o.setUrlStrategy;
import o.w1;

/* JADX INFO: loaded from: classes3.dex */
public final class StateProviderImpl$special$$inlined$map$7$2 implements FlowCollector {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ FlowCollector write;

    public /* synthetic */ StateProviderImpl$special$$inlined$map$7$2(FlowCollector flowCollector, int i) {
        this.IconCompatParcelizer = i;
        this.write = flowCollector;
    }

    public /* synthetic */ StateProviderImpl$special$$inlined$map$7$2(FlowCollector flowCollector, Object obj, int i) {
        this.IconCompatParcelizer = i;
        this.write = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x021c  */
    /* JADX WARN: Code duplicated, block: B:154:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:178:0x041b  */
    /* JADX WARN: Code duplicated, block: B:195:0x045d  */
    /* JADX WARN: Code duplicated, block: B:212:0x049f  */
    /* JADX WARN: Code duplicated, block: B:231:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:252:0x0530  */
    /* JADX WARN: Code duplicated, block: B:273:0x0579  */
    /* JADX WARN: Code duplicated, block: B:303:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:324:0x0643  */
    /* JADX WARN: Code duplicated, block: B:347:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:364:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:387:0x074d  */
    /* JADX WARN: Code duplicated, block: B:415:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:439:0x080b  */
    /* JADX WARN: Code duplicated, block: B:493:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01db  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        AndroidView_androidKtAndroidView32 androidView_androidKtAndroidView32;
        callbackSuccessAsync callbacksuccessasync;
        int i;
        boolean z;
        dispatchPopulateAccessibilityEvent dispatchpopulateaccessibilityevent;
        AccessibilityDelegateCompat accessibilityDelegateCompat;
        performCreateOptionsMenu performcreateoptionsmenu;
        onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged;
        setLayoutFrozen setlayoutfrozen;
        H h;
        L l;
        K k;
        C0214y c0214y;
        e8 e8Var;
        ea eaVar;
        w1 w1Var;
        OnSdkVersionReadListener onSdkVersionReadListener;
        String str;
        onVerificationFinished onverificationfinished;
        FlowCollector flowCollector;
        int i2;
        GooglePlayServicesClient googlePlayServicesClient;
        String str2;
        onVerificationFinished onverificationfinished2;
        String str3;
        String str4;
        Calendar calendar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList;
        GooglePlayServicesClientGooglePlayServicesConnection googlePlayServicesClientGooglePlayServicesConnection;
        OnThirdPartySharingSettingsChangedListener onThirdPartySharingSettingsChangedListener;
        getLicenseRequiredData getlicenserequireddata;
        int i3;
        setSdkPrefix setsdkprefix;
        setUrlStrategy seturlstrategy;
        int i4;
        boolean z6;
        ArrayList arrayList2;
        getHuaweiAppGalleryReferrer gethuaweiappgalleryreferrer;
        Calendar calendar2;
        invokeInstanceMethod invokeinstancemethod;
        Calendar calendar3;
        int i5 = 2 % 2;
        int i6 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        FlowCollector flowCollector2 = this.write;
        switch (i6) {
            case 0:
                if (shortNewsContentCardView instanceof AndroidView_androidKtAndroidView32) {
                    androidView_androidKtAndroidView32 = (AndroidView_androidKtAndroidView32) shortNewsContentCardView;
                    int i7 = androidView_androidKtAndroidView32.IconCompatParcelizer;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        androidView_androidKtAndroidView32.IconCompatParcelizer = i7 - Integer.MIN_VALUE;
                    } else {
                        androidView_androidKtAndroidView32 = new AndroidView_androidKtAndroidView32(this, shortNewsContentCardView);
                    }
                } else {
                    androidView_androidKtAndroidView32 = new AndroidView_androidKtAndroidView32(this, shortNewsContentCardView);
                }
                Object obj2 = androidView_androidKtAndroidView32.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = androidView_androidKtAndroidView32.IconCompatParcelizer;
                if (i8 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    Object isitemdismissable = ((onItemDismiss) obj).IconCompatParcelizer;
                    if (!(isitemdismissable instanceof isItemDismissable)) {
                        try {
                            maybeRegisterBackCallback mayberegisterbackcallback = (maybeRegisterBackCallback) isitemdismissable;
                            isitemdismissable = mayberegisterbackcallback != null ? mayberegisterbackcallback.hosts : null;
                        } catch (Throwable th) {
                            isitemdismissable = new isItemDismissable(th);
                        }
                    }
                    onItemDismiss onitemdismiss = new onItemDismiss(isitemdismissable);
                    androidView_androidKtAndroidView32.IconCompatParcelizer = 1;
                    if (flowCollector2.emit(onitemdismiss, androidView_androidKtAndroidView32) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                } else {
                    if (i8 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i9 = read + 97;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                }
                return createfromparcel;
            case 1:
                Object objEmit = flowCollector2.emit(obj, shortNewsContentCardView);
                return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : createfromparcel;
            case 2:
                if (shortNewsContentCardView instanceof callbackSuccessAsync) {
                    callbacksuccessasync = (callbackSuccessAsync) shortNewsContentCardView;
                    int i11 = callbacksuccessasync.IconCompatParcelizer;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        callbacksuccessasync.IconCompatParcelizer = i11 - Integer.MIN_VALUE;
                    } else {
                        callbacksuccessasync = new callbackSuccessAsync(this, shortNewsContentCardView);
                    }
                } else {
                    callbacksuccessasync = new callbackSuccessAsync(this, shortNewsContentCardView);
                }
                Object obj3 = callbacksuccessasync.serializer;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = callbacksuccessasync.IconCompatParcelizer;
                if (i12 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                    Person person = (Person) obj;
                    if ((person instanceof RemoteActionCompat) && ((RemoteActionCompat) person).read) {
                        i = 1;
                        z = true;
                    } else {
                        i = 1;
                        z = false;
                    }
                    callbacksuccessasync.IconCompatParcelizer = i;
                    if (flowCollector2.emit(Boolean.valueOf(z), callbacksuccessasync) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i12 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                }
                return createfromparcel;
            case 3:
                if (shortNewsContentCardView instanceof dispatchPopulateAccessibilityEvent) {
                    dispatchpopulateaccessibilityevent = (dispatchPopulateAccessibilityEvent) shortNewsContentCardView;
                    int i13 = dispatchpopulateaccessibilityevent.read;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        dispatchpopulateaccessibilityevent.read = i13 - Integer.MIN_VALUE;
                    } else {
                        dispatchpopulateaccessibilityevent = new dispatchPopulateAccessibilityEvent(this, shortNewsContentCardView);
                    }
                } else {
                    dispatchpopulateaccessibilityevent = new dispatchPopulateAccessibilityEvent(this, shortNewsContentCardView);
                }
                Object obj4 = dispatchpopulateaccessibilityevent.write;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = dispatchpopulateaccessibilityevent.read;
                if (i14 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                    if (!(((getWindowAreaDisplayMetrics) ((onViewAttachedToWindowlambda0) obj).serializer) instanceof getWindowAreaStatus)) {
                        dispatchpopulateaccessibilityevent.read = 1;
                        if (flowCollector2.emit(obj, dispatchpopulateaccessibilityevent) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i15 = serializer + 7;
                    read = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj4);
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                }
                return createfromparcel;
            case 4:
                if (shortNewsContentCardView instanceof AccessibilityDelegateCompat) {
                    int i16 = serializer + 31;
                    read = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    accessibilityDelegateCompat = (AccessibilityDelegateCompat) shortNewsContentCardView;
                    int i18 = accessibilityDelegateCompat.write;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        accessibilityDelegateCompat.write = i18 - Integer.MIN_VALUE;
                    } else {
                        accessibilityDelegateCompat = new AccessibilityDelegateCompat(this, shortNewsContentCardView);
                    }
                } else {
                    accessibilityDelegateCompat = new AccessibilityDelegateCompat(this, shortNewsContentCardView);
                }
                Object obj6 = accessibilityDelegateCompat.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = accessibilityDelegateCompat.write;
                if (i19 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj6);
                    Person person2 = (Person) ((onViewAttachedToWindowlambda0) obj).write;
                    accessibilityDelegateCompat.write = 1;
                    if (flowCollector2.emit(person2, accessibilityDelegateCompat) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i19 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj6);
                }
                return createfromparcel;
            case 5:
                if (shortNewsContentCardView instanceof performCreateOptionsMenu) {
                    performcreateoptionsmenu = (performCreateOptionsMenu) shortNewsContentCardView;
                    int i20 = performcreateoptionsmenu.read;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        performcreateoptionsmenu.read = i20 - Integer.MIN_VALUE;
                    } else {
                        performcreateoptionsmenu = new performCreateOptionsMenu(this, shortNewsContentCardView);
                    }
                } else {
                    performcreateoptionsmenu = new performCreateOptionsMenu(this, shortNewsContentCardView);
                }
                Object obj7 = performcreateoptionsmenu.serializer;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = performcreateoptionsmenu.read;
                if (i21 != 0) {
                    int i22 = serializer + 65;
                    read = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    if (i21 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj7);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj7);
                switch (performConfigurationChanged.serializer[((requireParentFragment) obj).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        onprimarynavigationfragmentchanged = onPrimaryNavigationFragmentChanged.HALF_EXPANDED;
                        performcreateoptionsmenu.read = 1;
                        if (flowCollector2.emit(onprimarynavigationfragmentchanged, performcreateoptionsmenu) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        return createfromparcel;
                    case 8:
                    case 9:
                    case 10:
                        onprimarynavigationfragmentchanged = onPrimaryNavigationFragmentChanged.COLLAPSED;
                        performcreateoptionsmenu.read = 1;
                        if (flowCollector2.emit(onprimarynavigationfragmentchanged, performcreateoptionsmenu) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        return createfromparcel;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                }
            case 6:
                if (shortNewsContentCardView instanceof setLayoutFrozen) {
                    setlayoutfrozen = (setLayoutFrozen) shortNewsContentCardView;
                    int i24 = setlayoutfrozen.IconCompatParcelizer;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        setlayoutfrozen.IconCompatParcelizer = i24 - Integer.MIN_VALUE;
                    } else {
                        setlayoutfrozen = new setLayoutFrozen(this, shortNewsContentCardView);
                    }
                } else {
                    setlayoutfrozen = new setLayoutFrozen(this, shortNewsContentCardView);
                }
                Object obj8 = setlayoutfrozen.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = setlayoutfrozen.IconCompatParcelizer;
                if (i25 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj8);
                    boolean z7 = ((Number) obj).intValue() > 0;
                    setlayoutfrozen.IconCompatParcelizer = 1;
                    if (flowCollector2.emit(Boolean.valueOf(z7), setlayoutfrozen) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i25 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj8);
                }
                return createfromparcel;
            case 7:
                Object objEmit2 = flowCollector2.emit((StaggeredGridLayoutManager) obj, shortNewsContentCardView);
                if (objEmit2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i26 = serializer + 125;
                read = i26 % Fields.SpotShadowColor;
                int i27 = i26 % 2;
                return objEmit2;
            case 8:
                if (shortNewsContentCardView instanceof H) {
                    h = (H) shortNewsContentCardView;
                    int i28 = h.IconCompatParcelizer;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        h.IconCompatParcelizer = i28 - Integer.MIN_VALUE;
                    } else {
                        h = new H(this, shortNewsContentCardView);
                    }
                } else {
                    h = new H(this, shortNewsContentCardView);
                }
                Object obj9 = h.read;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = h.IconCompatParcelizer;
                if (i29 != 0) {
                    int i30 = serializer + 27;
                    read = i30 % Fields.SpotShadowColor;
                    int i31 = i30 % 2;
                    if (i29 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj9);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj9);
                int i32 = J.IconCompatParcelizer[((drawRGB) obj).ordinal()];
                if (i32 == 1) {
                    l = L.LAST_STOP;
                } else {
                    if (i32 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    l = L.DEFAULT;
                }
                h.IconCompatParcelizer = 1;
                if (flowCollector2.emit(l, h) == coroutineSingletons7) {
                    return coroutineSingletons7;
                }
                return createfromparcel;
            case 9:
                if (shortNewsContentCardView instanceof K) {
                    k = (K) shortNewsContentCardView;
                    int i33 = k.RemoteActionCompatParcelizer;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        k.RemoteActionCompatParcelizer = i33 - Integer.MIN_VALUE;
                    } else {
                        k = new K(this, shortNewsContentCardView);
                    }
                } else {
                    k = new K(this, shortNewsContentCardView);
                }
                Object obj10 = k.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = k.RemoteActionCompatParcelizer;
                if (i34 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj10);
                    getStrictnessusljTpc getstrictnessusljtpc = (getStrictnessusljTpc) obj;
                    if ((getstrictnessusljtpc instanceof LineBreakCompanion) || (getstrictnessusljtpc instanceof getUnspecifiedrAG3T2kannotations)) {
                        k.RemoteActionCompatParcelizer = 1;
                        if (flowCollector2.emit(obj, k) == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj10);
                }
                return createfromparcel;
            case 10:
                if (shortNewsContentCardView instanceof C0214y) {
                    c0214y = (C0214y) shortNewsContentCardView;
                    int i35 = c0214y.read;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        c0214y.read = i35 - Integer.MIN_VALUE;
                    } else {
                        c0214y = new C0214y(this, shortNewsContentCardView);
                    }
                } else {
                    c0214y = new C0214y(this, shortNewsContentCardView);
                }
                Object obj11 = c0214y.serializer;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = c0214y.read;
                if (i36 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj11);
                    igExternalSyntheticLambda7 igexternalsyntheticlambda7 = (igExternalSyntheticLambda7) obj;
                    igexternalsyntheticlambda7.getClass();
                    if (igexternalsyntheticlambda7 == igExternalSyntheticLambda7.MAPBOX_INITIALIZED || igexternalsyntheticlambda7 == igExternalSyntheticLambda7.NAVIGATION_INITIALIZED) {
                        c0214y.read = 1;
                        if (flowCollector2.emit(obj, c0214y) == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    }
                } else {
                    if (i36 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj11);
                }
                return createfromparcel;
            case 11:
                if (shortNewsContentCardView instanceof e8) {
                    e8Var = (e8) shortNewsContentCardView;
                    int i37 = e8Var.serializer;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        e8Var.serializer = i37 - Integer.MIN_VALUE;
                    } else {
                        e8Var = new e8(this, shortNewsContentCardView);
                    }
                } else {
                    e8Var = new e8(this, shortNewsContentCardView);
                }
                Object obj12 = e8Var.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = e8Var.serializer;
                if (i38 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj12);
                    if (!(((getWindowAreaDisplayMetrics) obj) instanceof getWindowAreaStatus)) {
                        e8Var.serializer = 1;
                        if (flowCollector2.emit(obj, e8Var) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj12);
                }
                return createfromparcel;
            case 12:
                if (shortNewsContentCardView instanceof ea) {
                    eaVar = (ea) shortNewsContentCardView;
                    int i39 = eaVar.serializer;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        eaVar.serializer = i39 - Integer.MIN_VALUE;
                    } else {
                        eaVar = new ea(this, shortNewsContentCardView);
                    }
                } else {
                    eaVar = new ea(this, shortNewsContentCardView);
                }
                Object obj13 = eaVar.read;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = eaVar.serializer;
                if (i40 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj13);
                    eaVar.serializer = 1;
                    if (flowCollector2.emit(e9ExternalSyntheticLambda0.write, eaVar) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i40 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj13);
                }
                return createfromparcel;
            case 13:
                if (shortNewsContentCardView instanceof w1) {
                    w1Var = (w1) shortNewsContentCardView;
                    int i41 = w1Var.read;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        w1Var.read = i41 - Integer.MIN_VALUE;
                    } else {
                        w1Var = new w1(this, shortNewsContentCardView);
                    }
                } else {
                    w1Var = new w1(this, shortNewsContentCardView);
                }
                Object obj14 = w1Var.write;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = w1Var.read;
                if (i42 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj14);
                    sa saVar = ((se) obj).serializer;
                    w1Var.read = 1;
                    if (flowCollector2.emit(saVar, w1Var) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i42 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj14);
                }
                return createfromparcel;
            case 14:
                if (shortNewsContentCardView instanceof OnSdkVersionReadListener) {
                    onSdkVersionReadListener = (OnSdkVersionReadListener) shortNewsContentCardView;
                    int i43 = onSdkVersionReadListener.write;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        onSdkVersionReadListener.write = i43 - Integer.MIN_VALUE;
                    } else {
                        onSdkVersionReadListener = new OnSdkVersionReadListener(this, shortNewsContentCardView);
                    }
                } else {
                    onSdkVersionReadListener = new OnSdkVersionReadListener(this, shortNewsContentCardView);
                }
                Object obj15 = onSdkVersionReadListener.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i44 = onSdkVersionReadListener.write;
                if (i44 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj15);
                    OnIsEnabledListener onIsEnabledListener = (OnIsEnabledListener) obj;
                    onIsEnabledListener.getClass();
                    isTrackingEnabled istrackingenabled = onIsEnabledListener.RatingCompat;
                    String str5 = onIsEnabledListener.MediaDescriptionCompat;
                    String str6 = onIsEnabledListener.IconCompatParcelizer;
                    GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails = onIsEnabledListener.RemoteActionCompatParcelizer;
                    getFailureResponseData getfailureresponsedata = new getFailureResponseData(istrackingenabled, str5, str6, (googlePlayInstallReferrerDetails == null || (str = onIsEnabledListener.write) == null) ? null : new deepCopy(googlePlayInstallReferrerDetails, str, onIsEnabledListener.read), onIsEnabledListener.MediaSessionCompatQueueItem);
                    onSdkVersionReadListener.write = 1;
                    if (flowCollector2.emit(getfailureresponsedata, onSdkVersionReadListener) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i44 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj15);
                }
                return createfromparcel;
            case 15:
                if (shortNewsContentCardView instanceof onVerificationFinished) {
                    onverificationfinished = (onVerificationFinished) shortNewsContentCardView;
                    int i45 = onverificationfinished.IconCompatParcelizer;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        onverificationfinished.IconCompatParcelizer = i45 - Integer.MIN_VALUE;
                    } else {
                        onverificationfinished = new onVerificationFinished(this, shortNewsContentCardView);
                    }
                } else {
                    onverificationfinished = new onVerificationFinished(this, shortNewsContentCardView);
                }
                Object obj16 = onverificationfinished.serializer;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i46 = onverificationfinished.IconCompatParcelizer;
                if (i46 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj16);
                    OnEventTrackingSucceededListener onEventTrackingSucceededListener = (OnEventTrackingSucceededListener) obj;
                    if (onEventTrackingSucceededListener != null) {
                        long j = onEventTrackingSucceededListener.read;
                        String str7 = onEventTrackingSucceededListener.MediaSessionCompatResultReceiverWrapper;
                        String str8 = onEventTrackingSucceededListener.write;
                        String str9 = onEventTrackingSucceededListener.MediaSessionCompatToken;
                        Calendar calendar4 = onEventTrackingSucceededListener.PlaybackStateCompat;
                        boolean z8 = onEventTrackingSucceededListener.RatingCompat;
                        boolean z9 = onEventTrackingSucceededListener.MediaDescriptionCompat;
                        boolean z10 = onEventTrackingSucceededListener.MediaMetadataCompat;
                        boolean z11 = onEventTrackingSucceededListener.MediaSessionCompatQueueItem;
                        List list = onEventTrackingSucceededListener.MediaBrowserCompatMediaItem;
                        if (list != null) {
                            List list2 = list;
                            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                OnGooglePlayInstallReferrerReadListener onGooglePlayInstallReferrerReadListener = (OnGooglePlayInstallReferrerReadListener) it.next();
                                arrayList3.add(new getGooglePlayServicesInfo(onGooglePlayInstallReferrerReadListener.zoneId, onGooglePlayInstallReferrerReadListener.startingAreaId, onGooglePlayInstallReferrerReadListener.id, onGooglePlayInstallReferrerReadListener.area, onGooglePlayInstallReferrerReadListener.startedAt, onGooglePlayInstallReferrerReadListener.endedAt, onGooglePlayInstallReferrerReadListener.bonusMultiplier, onGooglePlayInstallReferrerReadListener.bonusTypes, onGooglePlayInstallReferrerReadListener.calendarEnabled, onGooglePlayInstallReferrerReadListener.hasShiftMode, onGooglePlayInstallReferrerReadListener.zoneGeoJson));
                                it = it;
                                onverificationfinished = onverificationfinished;
                                flowCollector2 = flowCollector2;
                                z11 = z11;
                                z10 = z10;
                                z9 = z9;
                                z8 = z8;
                                calendar4 = calendar4;
                                str9 = str9;
                                str8 = str8;
                                str7 = str7;
                            }
                            str2 = str7;
                            onverificationfinished2 = onverificationfinished;
                            str3 = str8;
                            flowCollector = flowCollector2;
                            str4 = str9;
                            calendar = calendar4;
                            z2 = z8;
                            z3 = z9;
                            z4 = z10;
                            z5 = z11;
                            arrayList = arrayList3;
                        } else {
                            str2 = str7;
                            onverificationfinished2 = onverificationfinished;
                            str3 = str8;
                            flowCollector = flowCollector2;
                            str4 = str9;
                            calendar = calendar4;
                            z2 = z8;
                            z3 = z9;
                            z4 = z10;
                            z5 = z11;
                            arrayList = null;
                        }
                        OnGoogleAdIdReadListener onGoogleAdIdReadListener = onEventTrackingSucceededListener.PlaybackStateCompatCustomAction;
                        if ((onGoogleAdIdReadListener != null ? onGoogleAdIdReadListener.coordinates : null) == null) {
                            googlePlayServicesClientGooglePlayServicesConnection = null;
                        } else {
                            List<OnAttributionChangedListener> list3 = onGoogleAdIdReadListener.coordinates;
                            ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                            for (OnAttributionChangedListener onAttributionChangedListener : list3) {
                                arrayList4.add(new GlobalParameters(onAttributionChangedListener.write(), onAttributionChangedListener.IconCompatParcelizer()));
                            }
                            googlePlayServicesClientGooglePlayServicesConnection = new GooglePlayServicesClientGooglePlayServicesConnection(arrayList4);
                        }
                        long j2 = onEventTrackingSucceededListener.ParcelableVolumeInfo;
                        int i47 = onEventTrackingSucceededListener.IconCompatParcelizer;
                        String str10 = onEventTrackingSucceededListener.RemoteActionCompatParcelizer;
                        OnAdidReadListener onAdidReadListener = onEventTrackingSucceededListener.serializer;
                        googlePlayServicesClient = new GooglePlayServicesClient(j, str2, str3, i47, str10, str4, calendar, z2, z3, z4, z5, arrayList, googlePlayServicesClientGooglePlayServicesConnection, j2, onAdidReadListener != null ? new EventResponseData(onAdidReadListener.link, onAdidReadListener.linkLabel, onAdidReadListener.title, onAdidReadListener.subTitle) : null);
                        onverificationfinished = onverificationfinished2;
                        i2 = 1;
                    } else {
                        coroutineSingletons14 = coroutineSingletons14;
                        flowCollector = flowCollector2;
                        i2 = 1;
                        googlePlayServicesClient = null;
                    }
                    onverificationfinished.IconCompatParcelizer = i2;
                    CoroutineSingletons coroutineSingletons15 = coroutineSingletons14;
                    if (flowCollector.emit(googlePlayServicesClient, onverificationfinished) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i46 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj16);
                }
                return createfromparcel;
            case 16:
                if (shortNewsContentCardView instanceof OnThirdPartySharingSettingsChangedListener) {
                    onThirdPartySharingSettingsChangedListener = (OnThirdPartySharingSettingsChangedListener) shortNewsContentCardView;
                    int i48 = onThirdPartySharingSettingsChangedListener.RemoteActionCompatParcelizer;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        onThirdPartySharingSettingsChangedListener.RemoteActionCompatParcelizer = i48 - Integer.MIN_VALUE;
                    } else {
                        onThirdPartySharingSettingsChangedListener = new OnThirdPartySharingSettingsChangedListener(this, shortNewsContentCardView);
                    }
                } else {
                    onThirdPartySharingSettingsChangedListener = new OnThirdPartySharingSettingsChangedListener(this, shortNewsContentCardView);
                }
                Object obj17 = onThirdPartySharingSettingsChangedListener.serializer;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i49 = onThirdPartySharingSettingsChangedListener.RemoteActionCompatParcelizer;
                if (i49 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj17);
                    isTrackingEnabled istrackingenabled2 = ((getFailureResponseData) obj).RemoteActionCompatParcelizer;
                    onThirdPartySharingSettingsChangedListener.RemoteActionCompatParcelizer = 1;
                    if (flowCollector2.emit(istrackingenabled2, onThirdPartySharingSettingsChangedListener) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i49 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj17);
                }
                return createfromparcel;
            case 17:
                if (shortNewsContentCardView instanceof getLicenseRequiredData) {
                    getlicenserequireddata = (getLicenseRequiredData) shortNewsContentCardView;
                    int i50 = getlicenserequireddata.read;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        getlicenserequireddata.read = i50 - Integer.MIN_VALUE;
                    } else {
                        getlicenserequireddata = new getLicenseRequiredData(this, shortNewsContentCardView);
                    }
                } else {
                    getlicenserequireddata = new getLicenseRequiredData(this, shortNewsContentCardView);
                }
                Object obj18 = getlicenserequireddata.write;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i51 = getlicenserequireddata.read;
                if (i51 != 0) {
                    if (i51 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i52 = serializer + 25;
                    read = i52 % Fields.SpotShadowColor;
                    int i53 = i52 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj18);
                    createfromparcel = createfromparcel;
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj18);
                GooglePlayServicesClient googlePlayServicesClient2 = (GooglePlayServicesClient) obj;
                if (googlePlayServicesClient2 != null) {
                    GooglePlayServicesClientGooglePlayServicesConnection googlePlayServicesClientGooglePlayServicesConnection2 = googlePlayServicesClient2.MediaSessionCompatResultReceiverWrapper;
                    List list4 = googlePlayServicesClient2.MediaMetadataCompat;
                    String str11 = googlePlayServicesClient2.MediaSessionCompatToken;
                    Iterator<E> it2 = setUrlStrategy.getEntries().iterator();
                    do {
                        if (!it2.hasNext()) {
                            DrawableTransformation.write("Collection contains no element matching the predicate.");
                            return null;
                        }
                        seturlstrategy = (setUrlStrategy) it2.next();
                    } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{seturlstrategy.getValue(), str11}, getCieXyz.write())).booleanValue());
                    int size = list4 != null ? list4.size() : 0;
                    getGooglePlayServicesInfo getgoogleplayservicesinfo = list4 != null ? (getGooglePlayServicesInfo) onContentCardDismissed.MediaMetadataCompat(list4) : null;
                    long j3 = googlePlayServicesClient2.write;
                    Calendar calendar5 = googlePlayServicesClient2.PlaybackStateCompatCustomAction;
                    getReferrer getreferrerIconCompatParcelizer = getgoogleplayservicesinfo != null ? AndroidUiFrameClock.IconCompatParcelizer(getgoogleplayservicesinfo, seturlstrategy, googlePlayServicesClientGooglePlayServicesConnection2) : null;
                    setPreinstallFilePath setpreinstallfilepath = new setPreinstallFilePath(googlePlayServicesClient2.RatingCompat, googlePlayServicesClient2.MediaDescriptionCompat);
                    setStoreInfo setstoreinfo = new setStoreInfo(googlePlayServicesClient2.MediaSessionCompatQueueItem, googlePlayServicesClient2.MediaBrowserCompatMediaItem);
                    if (getgoogleplayservicesinfo != null || seturlstrategy == setUrlStrategy.NOT_WORKING || seturlstrategy == setUrlStrategy.AVAILABLE || seturlstrategy == setUrlStrategy.READY) {
                        i4 = 1;
                        z6 = false;
                    } else {
                        i4 = 1;
                        z6 = true;
                    }
                    boolean z12 = size > i4;
                    long j4 = googlePlayServicesClient2.ParcelableVolumeInfo;
                    if (list4 != null) {
                        List list5 = list4;
                        ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(AndroidUiFrameClock.IconCompatParcelizer((getGooglePlayServicesInfo) it3.next(), seturlstrategy, googlePlayServicesClientGooglePlayServicesConnection2));
                        }
                        arrayList2 = arrayList5;
                    } else {
                        arrayList2 = null;
                    }
                    setsdkprefix = new setSdkPrefix(j3, seturlstrategy, calendar5, getreferrerIconCompatParcelizer, arrayList2, setpreinstallfilepath, setstoreinfo, z6, z12, j4);
                    i3 = 1;
                } else {
                    coroutineSingletons17 = coroutineSingletons17;
                    i3 = 1;
                    setsdkprefix = null;
                }
                getlicenserequireddata.read = i3;
                CoroutineSingletons coroutineSingletons18 = coroutineSingletons17;
                if (flowCollector2.emit(setsdkprefix, getlicenserequireddata) == coroutineSingletons18) {
                    int i54 = read + 7;
                    serializer = i54 % Fields.SpotShadowColor;
                    if (i54 % 2 == 0) {
                        return coroutineSingletons18;
                    }
                    throw null;
                }
                return createfromparcel;
            case 18:
                if (shortNewsContentCardView instanceof getHuaweiAppGalleryReferrer) {
                    gethuaweiappgalleryreferrer = (getHuaweiAppGalleryReferrer) shortNewsContentCardView;
                    int i55 = gethuaweiappgalleryreferrer.write;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        gethuaweiappgalleryreferrer.write = i55 - Integer.MIN_VALUE;
                    } else {
                        gethuaweiappgalleryreferrer = new getHuaweiAppGalleryReferrer(this, shortNewsContentCardView);
                    }
                } else {
                    gethuaweiappgalleryreferrer = new getHuaweiAppGalleryReferrer(this, shortNewsContentCardView);
                }
                Object obj19 = gethuaweiappgalleryreferrer.serializer;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i56 = gethuaweiappgalleryreferrer.write;
                if (i56 != 0) {
                    if (i56 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj19);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj19);
                AdjustDeeplink adjustDeeplink = (AdjustDeeplink) obj;
                AdjustEvent adjustEvent = getActionViewIntentlambda0.read(adjustDeeplink.read.MediaBrowserCompatMediaItem, adjustDeeplink.write);
                gethuaweiappgalleryreferrer.write = 1;
                if (flowCollector2.emit(adjustEvent, gethuaweiappgalleryreferrer) != coroutineSingletons19) {
                    return createfromparcel;
                }
                int i57 = read + 7;
                serializer = i57 % Fields.SpotShadowColor;
                int i58 = i57 % 2;
                return coroutineSingletons19;
            default:
                if (shortNewsContentCardView instanceof invokeInstanceMethod) {
                    int i59 = serializer + 113;
                    read = i59 % Fields.SpotShadowColor;
                    if (i59 % 2 == 0) {
                        int i60 = ((invokeInstanceMethod) shortNewsContentCardView).serializer;
                        Object obj20 = null;
                        obj20.hashCode();
                        throw null;
                    }
                    invokeInstanceMethod invokeinstancemethod2 = (invokeInstanceMethod) shortNewsContentCardView;
                    int i61 = invokeinstancemethod2.serializer;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        invokeinstancemethod2.serializer = i61 - Integer.MIN_VALUE;
                        invokeinstancemethod = invokeinstancemethod2;
                        calendar2 = null;
                    } else {
                        calendar2 = null;
                        invokeinstancemethod = new invokeInstanceMethod(this, shortNewsContentCardView);
                    }
                } else {
                    calendar2 = null;
                    invokeinstancemethod = new invokeInstanceMethod(this, shortNewsContentCardView);
                }
                Object obj21 = invokeinstancemethod.write;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i62 = invokeinstancemethod.serializer;
                if (i62 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj21);
                    AdjustDeeplink adjustDeeplink2 = (AdjustDeeplink) obj;
                    setSdkPrefix setsdkprefix2 = adjustDeeplink2.read;
                    isTrackingEnabled istrackingenabled3 = adjustDeeplink2.write.RemoteActionCompatParcelizer;
                    setsdkprefix2.getClass();
                    istrackingenabled3.getClass();
                    Calendar calendar6 = setsdkprefix2.IconCompatParcelizer;
                    if (calendar6 == null) {
                        getReferrer getreferrer = setsdkprefix2.MediaBrowserCompatMediaItem;
                        calendar3 = getreferrer != null ? getreferrer.IconCompatParcelizer : calendar2;
                    } else {
                        calendar3 = calendar6;
                    }
                    getCallbackId getcallbackid = new getCallbackId(istrackingenabled3, calendar3);
                    invokeinstancemethod.serializer = 1;
                    if (flowCollector2.emit(getcallbackid, invokeinstancemethod) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i62 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return calendar2;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj21);
                }
                return createfromparcel;
        }
    }
}
