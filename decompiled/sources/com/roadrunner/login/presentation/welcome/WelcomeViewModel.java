package com.roadrunner.login.presentation.welcome;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.lifecycle.ViewModel;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.login.presentation.welcome.WelcomeViewModel;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.rider.recruitment.accountcreation.navigation.AccountCreationButtonUiModelImpl;
import io.grpc.internal.CallTracer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.QueryResultValue;
import o.ShortNewsContentCardView;
import o.SystemLifecycleSystemLifecycleCallback;
import o.accessgetInstancedelegatecp;
import o.accessgetOldDependencyp;
import o.boundingRectInRoot;
import o.createFromParcel;
import o.da;
import o.getBytes;
import o.getContentViewGroupParentLayout;
import o.getQueryContext;
import o.getQueryParameterslambda2;
import o.gotOptOutResponse;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.markCardAsVisuallyRead;
import o.metaMarkUpdatedAndHasCallbacks;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setOfflineMode;
import o.setTransactionSuccessful;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class WelcomeViewModel extends ViewModel {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final boundingRectInRoot IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final SystemLifecycleSystemLifecycleCallback MediaMetadataCompat;
    public final getQueryContext RatingCompat;
    public final setOfflineMode RemoteActionCompatParcelizer;
    public final getBytes read;
    public final MutableStateFlow serializer;
    public final isAdapterPositionOnScreen write;

    /* JADX INFO: renamed from: com.roadrunner.login.presentation.welcome.WelcomeViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int serializer = 0;
        private static int write = 1;
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ WelcomeViewModel RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(WelcomeViewModel welcomeViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = welcomeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = serializer + 59;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i3 = this.IconCompatParcelizer;
            WelcomeViewModel welcomeViewModel = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                return new AnonymousClass1(welcomeViewModel, shortNewsContentCardView, 1);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(welcomeViewModel, shortNewsContentCardView, 0);
            int i4 = write + 15;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = serializer + 111;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 == 0) {
                ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                return createfromparcel;
            }
            ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = write + 113;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = write + 79;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                throw null;
            }
            int i3 = this.IconCompatParcelizer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            WelcomeViewModel welcomeViewModel = this.RemoteActionCompatParcelizer;
            if (i3 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                welcomeViewModel.MediaMetadataCompat.RemoteActionCompatParcelizer();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(welcomeViewModel), null, null, new ReconnectScheduler$schedule$1(welcomeViewModel, null, 17), 3);
                return createfromparcel2;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            welcomeViewModel.read.RemoteActionCompatParcelizer.IconCompatParcelizer("Welcome", null);
            int i4 = write + 107;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return createfromparcel2;
            }
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x015c  */
    public WelcomeViewModel(accessgetOldDependencyp accessgetolddependencyp, boundingRectInRoot boundingrectinroot, QueryResultValue queryResultValue, markCardAsVisuallyRead markcardasvisuallyread, getBytes getbytes, getQueryContext getquerycontext, SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, setOfflineMode setofflinemode) {
        List list;
        accessgetolddependencyp.getClass();
        boundingrectinroot.getClass();
        queryResultValue.getClass();
        markcardasvisuallyread.getClass();
        getbytes.getClass();
        getquerycontext.getClass();
        systemLifecycleSystemLifecycleCallback.getClass();
        setofflinemode.getClass();
        this.IconCompatParcelizer = boundingrectinroot;
        this.read = getbytes;
        this.RatingCompat = getquerycontext;
        this.MediaMetadataCompat = systemLifecycleSystemLifecycleCallback;
        this.RemoteActionCompatParcelizer = setofflinemode;
        final int i = 0;
        this.write = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.d6
            private static int read = 1;
            private static int write;
            public final /* synthetic */ WelcomeViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = read + 25;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                WelcomeViewModel welcomeViewModel = this.serializer;
                if (i5 != 0) {
                    return welcomeViewModel.IconCompatParcelizer.write();
                }
                CallTracer callTracer = welcomeViewModel.RemoteActionCompatParcelizer.read;
                AccountCreationButtonUiModelImpl accountCreationButtonUiModelImpl = new AccountCreationButtonUiModelImpl(new getQueryContext(), (transferSessionPackageI) ((mergeJsonObjects) callTracer.RemoteActionCompatParcelizer).write(), (readObject) ((publishErrorlambda1) callTracer.write).write(), (setPlayStoreKidsComplianceInDelay) ((mergeJsonObjects) callTracer.serializer).write(), (setTransactionSuccessful) ((mergeJsonObjects) callTracer.IconCompatParcelizer).write(), (getSdkEnablementProviderandroid_sdk_base_release) ActivityHandler53.read.write());
                int i6 = write + 33;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return accountCreationButtonUiModelImpl;
            }
        });
        final int i2 = 1;
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.d6
            private static int read = 1;
            private static int write;
            public final /* synthetic */ WelcomeViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = read + 25;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                WelcomeViewModel welcomeViewModel = this.serializer;
                if (i6 != 0) {
                    return welcomeViewModel.IconCompatParcelizer.write();
                }
                CallTracer callTracer = welcomeViewModel.RemoteActionCompatParcelizer.read;
                AccountCreationButtonUiModelImpl accountCreationButtonUiModelImpl = new AccountCreationButtonUiModelImpl(new getQueryContext(), (transferSessionPackageI) ((mergeJsonObjects) callTracer.RemoteActionCompatParcelizer).write(), (readObject) ((publishErrorlambda1) callTracer.write).write(), (setPlayStoreKidsComplianceInDelay) ((mergeJsonObjects) callTracer.serializer).write(), (setTransactionSuccessful) ((mergeJsonObjects) callTracer.IconCompatParcelizer).write(), (getSdkEnablementProviderandroid_sdk_base_release) ActivityHandler53.read.write());
                int i7 = write + 33;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return accountCreationButtonUiModelImpl;
            }
        });
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks = (metaMarkUpdatedAndHasCallbacks) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
        metamarkupdatedandhascallbacks.getClass();
        setTransactionSuccessful settransactionsuccessful = queryResultValue.read;
        String str = metamarkupdatedandhascallbacks.brand;
        String str2 = settransactionsuccessful.read(R.string.login_welcome_title, str);
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str2, str, 0, false, 6);
        if (iWrite != -1) {
            list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new AnnotatedString.Range(new SpanStyle(queryResultValue.IconCompatParcelizer.IconCompatParcelizer().setEmojiCompatEnabled(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), iWrite, str.length() + iWrite)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            int i3 = 2 % 2;
        } else {
            list = instance_delegatelambda0.write;
        }
        List list2 = list;
        int i4 = 2 % 2;
        AnnotatedString annotatedString = new AnnotatedString(str2, list2, null, 4, null);
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks2 = (metaMarkUpdatedAndHasCallbacks) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
        metamarkupdatedandhascallbacks2.getClass();
        String strIconCompatParcelizer = markcardasvisuallyread.read.IconCompatParcelizer(metamarkupdatedandhascallbacks2.countryIsoCode);
        ShortNewsContentCardView shortNewsContentCardView = null;
        strIconCompatParcelizer = strIconCompatParcelizer.length() == 0 ? null : strIconCompatParcelizer;
        List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(metamarkupdatedandhascallbacks2.name, new String[]{"-"}, 6);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
        Iterator it = listSerializer.iterator();
        while (it.hasNext()) {
            arrayList.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) it.next()).toString());
        }
        String strM = (String) onContentCardDismissed.MediaMetadataCompat((List) arrayList);
        if (strM == null) {
            int i5 = MediaSessionCompatQueueItem + 55;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            strM = "";
        }
        if (strIconCompatParcelizer != null) {
            int i7 = MediaSessionCompatQueueItem + 103;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 36 / 0;
                if (strIconCompatParcelizer.length() != 0) {
                    strM = af$$ExternalSyntheticOutline0.m(strIconCompatParcelizer, "\t\r\t\r", strM);
                }
            } else if (strIconCompatParcelizer.length() != 0) {
                strM = af$$ExternalSyntheticOutline0.m(strIconCompatParcelizer, "\t\r\t\r", strM);
            }
        }
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new da(annotatedString, strM, R.string.login_welcome_next_button, "v4.2634.5", new NafathModalContentKt$NafathModal$1$1(0, this, WelcomeViewModel.class, "onSelectCountryClicked", "onSelectCountryClicked()V", 0, 12), new NafathModalContentKt$NafathModal$1$1(0, this, WelcomeViewModel.class, "onNextClicked", "onNextClicked()V", 0, 13), this.RatingCompat, gotOptOutResponse.IconCompatParcelizer));
        this.serializer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new AnonymousClass1(this, shortNewsContentCardView, i), 3);
    }
}
