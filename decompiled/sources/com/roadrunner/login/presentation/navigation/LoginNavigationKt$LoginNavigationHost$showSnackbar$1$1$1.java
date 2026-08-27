package com.roadrunner.login.presentation.navigation;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.execSessionSuccessCallbackCommand;
import o.getAutofillManager;
import o.getContentViewGroupParentLayout;
import o.onShowTranslationui;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setRootAutofillId;
import o.setWebView;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ SnackbarHostState IconCompatParcelizer;
    public final /* synthetic */ setWebView RemoteActionCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 read;
    public final /* synthetic */ int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1(SnackbarHostState snackbarHostState, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, setWebView setwebview, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.IconCompatParcelizer = snackbarHostState;
        this.read = populateViewStructure_androidKtpopulate7;
        this.RemoteActionCompatParcelizer = setwebview;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, setWebView setwebview, SnackbarHostState snackbarHostState, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.read = populateViewStructure_androidKtpopulate7;
        this.RemoteActionCompatParcelizer = setwebview;
        this.IconCompatParcelizer = snackbarHostState;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 57;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            return ((LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 1) {
            return ((LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 2) {
            return ((LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = RatingCompat + 43;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 125;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        if (i4 == 0) {
            return new LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1(this.IconCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, shortNewsContentCardView, 0);
        }
        if (i4 != 1) {
            if (i4 != 2) {
                return new LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, shortNewsContentCardView, 3);
            }
            return new LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, shortNewsContentCardView, 2);
        }
        LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1 loginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1 = new LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1(this.IconCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, shortNewsContentCardView, 1);
        int i5 = RatingCompat + 91;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return loginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        getAutofillManager getautofillmanager;
        getAutofillManager getautofillmanager2;
        int i = 2 % 2;
        int i2 = this.serializer;
        SnackbarHostState snackbarHostState = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.read;
        setWebView setwebview = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 != 0) {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = MediaBrowserCompatMediaItem + 115;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i5 = 82 / 0;
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setRootAutofillId setrootautofillid = (setRootAutofillId) ((onShowTranslationui) snackbarHostState.read).getValue();
            if (setrootautofillid != null) {
                setrootautofillid.write();
            }
            populateViewStructure_androidKtpopulate7.setValue(setwebview);
            String str3 = setwebview.serializer;
            getAutofillManager getautofillmanager3 = setwebview.read;
            execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand = setwebview.IconCompatParcelizer;
            String str4 = execsessionsuccesscallbackcommand != null ? execsessionsuccesscallbackcommand.RemoteActionCompatParcelizer : null;
            this.write = 1;
            if (SnackbarHostState.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str3, str4, getautofillmanager3, this, 4) != coroutineSingletons) {
                return createfromparcel;
            }
            int i6 = MediaBrowserCompatMediaItem + 81;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return coroutineSingletons;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.write;
            if (i8 != 0) {
                int i9 = MediaBrowserCompatMediaItem + 85;
                RatingCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i8 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setRootAutofillId setrootautofillid2 = (setRootAutofillId) ((onShowTranslationui) snackbarHostState.read).getValue();
            if (setrootautofillid2 != null) {
                int i11 = MediaBrowserCompatMediaItem + 85;
                RatingCompat = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    setrootautofillid2.write();
                    int i12 = 22 / 0;
                } else {
                    setrootautofillid2.write();
                }
            }
            populateViewStructure_androidKtpopulate7.setValue(setwebview);
            String str5 = setwebview.serializer;
            getAutofillManager getautofillmanager4 = setwebview.read;
            execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand2 = setwebview.IconCompatParcelizer;
            if (execsessionsuccesscallbackcommand2 != null) {
                String str6 = execsessionsuccesscallbackcommand2.RemoteActionCompatParcelizer;
                int i13 = MediaBrowserCompatMediaItem + 99;
                RatingCompat = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                str = str6;
            } else {
                str = null;
            }
            this.write = 1;
            return SnackbarHostState.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str5, str, getautofillmanager4, this, 4) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i2 != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i15 = this.write;
            if (i15 != 0) {
                if (i15 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            populateViewStructure_androidKtpopulate7.setValue(setwebview);
            String str7 = setwebview.serializer;
            execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand3 = setwebview.IconCompatParcelizer;
            str2 = execsessionsuccesscallbackcommand3 != null ? execsessionsuccesscallbackcommand3.RemoteActionCompatParcelizer : null;
            setWebView setwebview2 = (setWebView) populateViewStructure_androidKtpopulate7.getValue();
            if (setwebview2 == null || (getautofillmanager2 = setwebview2.read) == null) {
                getautofillmanager2 = getAutofillManager.Short;
            }
            getAutofillManager getautofillmanager5 = getautofillmanager2;
            this.write = 1;
            return SnackbarHostState.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str7, str2, getautofillmanager5, this, 4) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = this.write;
        if (i16 != 0) {
            if (i16 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = MediaBrowserCompatMediaItem + 21;
            RatingCompat = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i18 = 34 / 0;
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        populateViewStructure_androidKtpopulate7.setValue(setwebview);
        String str8 = setwebview.serializer;
        execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand4 = setwebview.IconCompatParcelizer;
        str2 = execsessionsuccesscallbackcommand4 != null ? execsessionsuccesscallbackcommand4.RemoteActionCompatParcelizer : null;
        setWebView setwebview3 = (setWebView) populateViewStructure_androidKtpopulate7.getValue();
        if (setwebview3 == null) {
            getautofillmanager = getAutofillManager.Short;
        } else {
            getautofillmanager = setwebview3.read;
            if (getautofillmanager == null) {
                int i19 = RatingCompat + 25;
                MediaBrowserCompatMediaItem = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                getautofillmanager = getAutofillManager.Short;
            }
        }
        getAutofillManager getautofillmanager6 = getautofillmanager;
        this.write = 1;
        return SnackbarHostState.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str8, str2, getautofillmanager6, this, 4) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
    }
}
