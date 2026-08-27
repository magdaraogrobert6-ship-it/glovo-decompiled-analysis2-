package com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.huawei.location.nlp.scan.FB;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.domain.PhoneValidationUseCase;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ActivityHandler44;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isItemDismissable;
import o.markCardAsVisuallyRead;
import o.metaMarkUpdatedAndHasCallbacks;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeGlobalCallbackParametersI;
import o.removeGlobalPartnerParameter;
import o.removeGlobalPartnerParameterI;
import o.sendLicenseVerificationData;
import o.sendReftagReferrer;
import o.setCoppaComplianceInDelay;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class EmailAndPhoneViewModel$callValidatePhoneApi$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ removeGlobalPartnerParameter read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmailAndPhoneViewModel$callValidatePhoneApi$2(removeGlobalPartnerParameter removeglobalpartnerparameter, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.read = removeglobalpartnerparameter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 123;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = this.write;
        removeGlobalPartnerParameter removeglobalpartnerparameter = this.read;
        if (i4 == 0) {
            return new EmailAndPhoneViewModel$callValidatePhoneApi$2(removeglobalpartnerparameter, shortNewsContentCardView, 0);
        }
        int i5 = 1;
        if (i4 != 1) {
            return new EmailAndPhoneViewModel$callValidatePhoneApi$2(removeglobalpartnerparameter, shortNewsContentCardView, i);
        }
        EmailAndPhoneViewModel$callValidatePhoneApi$2 emailAndPhoneViewModel$callValidatePhoneApi$2 = new EmailAndPhoneViewModel$callValidatePhoneApi$2(removeglobalpartnerparameter, shortNewsContentCardView, i5);
        int i6 = RemoteActionCompatParcelizer + 97;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return emailAndPhoneViewModel$callValidatePhoneApi$2;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 115;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((EmailAndPhoneViewModel$callValidatePhoneApi$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 1) {
            return ((EmailAndPhoneViewModel$callValidatePhoneApi$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((EmailAndPhoneViewModel$callValidatePhoneApi$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RemoteActionCompatParcelizer + 105;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM5019invoke0E7RQCE$implementation;
        Object obj2;
        Object obj3;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        final removeGlobalPartnerParameter removeglobalpartnerparameter = this.read;
        final int i3 = 0;
        final int i4 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.IconCompatParcelizer;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(removeglobalpartnerparameter.MediaMetadataCompat.RemoteActionCompatParcelizer.RatingCompat.write());
                FlowCollector flowCollector = new FlowCollector() { // from class: com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.EmailAndPhoneViewModel$subscribeToSearchQuery$1$1
                    private static int serializer = 1;
                    private static int write;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj4, ShortNewsContentCardView shortNewsContentCardView) {
                        List list;
                        Object obj5;
                        Object obj6;
                        removeGlobalPartnerParameterI removeglobalpartnerparameteri;
                        int i6 = 2 % 2;
                        int i7 = i4;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        removeGlobalPartnerParameter removeglobalpartnerparameter2 = removeglobalpartnerparameter;
                        if (i7 == 0) {
                            String str = (String) obj4;
                            boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                            List list2 = removeglobalpartnerparameter2.serializer;
                            if (zSerializer) {
                                list = list2;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj7 : list2) {
                                    removeGlobalPartnerParameterI removeglobalpartnerparameteri2 = (removeGlobalPartnerParameterI) obj7;
                                    if (!(!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) removeglobalpartnerparameteri2.serializer, (CharSequence) str, true)) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) removeglobalpartnerparameteri2.RemoteActionCompatParcelizer, (CharSequence) str, true)) {
                                        arrayList.add(obj7);
                                    }
                                }
                                list = arrayList;
                            }
                            MutableStateFlow mutableStateFlow = removeglobalpartnerparameter2.RemoteActionCompatParcelizer;
                            do {
                                obj5 = mutableStateFlow.read();
                            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj5, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj5, false, null, false, list, null, 126975)));
                            int i8 = serializer + 51;
                            write = i8 % Fields.SpotShadowColor;
                            if (i8 % 2 == 0) {
                                return createfromparcel2;
                            }
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        List<metaMarkUpdatedAndHasCallbacks> list3 = (List) obj4;
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(list3.size(), "Country list updated: ", " entries"), new Object[0]);
                        markCardAsVisuallyRead markcardasvisuallyread = removeglobalpartnerparameter2.RatingCompat;
                        markcardasvisuallyread.getClass();
                        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.read();
                        ArrayList arrayList2 = new ArrayList();
                        for (metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks : list3) {
                            String str2 = metamarkupdatedandhascallbacks.countryIsoCode;
                            String str3 = metamarkupdatedandhascallbacks.name;
                            String upperCase = str2.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            int iIconCompatParcelizer = phoneNumberUtil.IconCompatParcelizer(upperCase);
                            if (iIconCompatParcelizer == 0) {
                                int i9 = serializer + 83;
                                write = i9 % Fields.SpotShadowColor;
                                if (i9 % 2 != 0) {
                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Skipping country '", str3, "' (", upperCase, "): no dial code found"), new Object[1]);
                                } else {
                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Skipping country '", str3, "' (", upperCase, "): no dial code found"), new Object[0]);
                                }
                                removeglobalpartnerparameteri = null;
                            } else {
                                String strM = c8$$ExternalSyntheticOutline0.m(iIconCompatParcelizer, "+");
                                String strIconCompatParcelizer = markcardasvisuallyread.read.IconCompatParcelizer(upperCase);
                                removeglobalpartnerparameteri = new removeGlobalPartnerParameterI(strIconCompatParcelizer.length() == 0 ? null : strIconCompatParcelizer, hideCurrentlyDisplayingInAppMessage.read((CharSequence) onContentCardDismissed.read(hideCurrentlyDisplayingInAppMessage.serializer(str3, new String[]{"-"}, 6))).toString(), strM, upperCase, false);
                            }
                            if (removeglobalpartnerparameteri != null) {
                                arrayList2.add(removeglobalpartnerparameteri);
                                int i10 = serializer + 27;
                                write = i10 % Fields.SpotShadowColor;
                                int i11 = i10 % 2;
                            }
                        }
                        List listSerializer = onContentCardDismissed.serializer(arrayList2, new FB(29));
                        removeglobalpartnerparameter2.serializer = listSerializer;
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(listSerializer.size(), "Country list ready: ", " entries after filtering"), new Object[0]);
                        MutableStateFlow mutableStateFlow2 = removeglobalpartnerparameter2.RemoteActionCompatParcelizer;
                        do {
                            obj6 = mutableStateFlow2.read();
                        } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj6, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj6, false, null, false, removeglobalpartnerparameter2.serializer, null, 126975)));
                        int i12 = write + 83;
                        serializer = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 != 0) {
                            return createfromparcel2;
                        }
                        Object obj9 = null;
                        obj9.hashCode();
                        throw null;
                    }
                };
                this.IconCompatParcelizer = 1;
                return flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(flowCollector, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.IconCompatParcelizer;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowWrite = FlowKt.write(removeglobalpartnerparameter.IconCompatParcelizer, 300L);
                FlowCollector flowCollector2 = new FlowCollector() { // from class: com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.EmailAndPhoneViewModel$subscribeToSearchQuery$1$1
                    private static int serializer = 1;
                    private static int write;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj4, ShortNewsContentCardView shortNewsContentCardView) {
                        List list;
                        Object obj5;
                        Object obj6;
                        removeGlobalPartnerParameterI removeglobalpartnerparameteri;
                        int i7 = 2 % 2;
                        int i8 = i3;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        removeGlobalPartnerParameter removeglobalpartnerparameter2 = removeglobalpartnerparameter;
                        if (i8 == 0) {
                            String str = (String) obj4;
                            boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                            List list2 = removeglobalpartnerparameter2.serializer;
                            if (zSerializer) {
                                list = list2;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj7 : list2) {
                                    removeGlobalPartnerParameterI removeglobalpartnerparameteri2 = (removeGlobalPartnerParameterI) obj7;
                                    if (!(!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) removeglobalpartnerparameteri2.serializer, (CharSequence) str, true)) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) removeglobalpartnerparameteri2.RemoteActionCompatParcelizer, (CharSequence) str, true)) {
                                        arrayList.add(obj7);
                                    }
                                }
                                list = arrayList;
                            }
                            MutableStateFlow mutableStateFlow = removeglobalpartnerparameter2.RemoteActionCompatParcelizer;
                            do {
                                obj5 = mutableStateFlow.read();
                            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj5, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj5, false, null, false, list, null, 126975)));
                            int i9 = serializer + 51;
                            write = i9 % Fields.SpotShadowColor;
                            if (i9 % 2 == 0) {
                                return createfromparcel2;
                            }
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        List<metaMarkUpdatedAndHasCallbacks> list3 = (List) obj4;
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(list3.size(), "Country list updated: ", " entries"), new Object[0]);
                        markCardAsVisuallyRead markcardasvisuallyread = removeglobalpartnerparameter2.RatingCompat;
                        markcardasvisuallyread.getClass();
                        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.read();
                        ArrayList arrayList2 = new ArrayList();
                        for (metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks : list3) {
                            String str2 = metamarkupdatedandhascallbacks.countryIsoCode;
                            String str3 = metamarkupdatedandhascallbacks.name;
                            String upperCase = str2.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            int iIconCompatParcelizer = phoneNumberUtil.IconCompatParcelizer(upperCase);
                            if (iIconCompatParcelizer == 0) {
                                int i10 = serializer + 83;
                                write = i10 % Fields.SpotShadowColor;
                                if (i10 % 2 != 0) {
                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Skipping country '", str3, "' (", upperCase, "): no dial code found"), new Object[1]);
                                } else {
                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Skipping country '", str3, "' (", upperCase, "): no dial code found"), new Object[0]);
                                }
                                removeglobalpartnerparameteri = null;
                            } else {
                                String strM = c8$$ExternalSyntheticOutline0.m(iIconCompatParcelizer, "+");
                                String strIconCompatParcelizer = markcardasvisuallyread.read.IconCompatParcelizer(upperCase);
                                removeglobalpartnerparameteri = new removeGlobalPartnerParameterI(strIconCompatParcelizer.length() == 0 ? null : strIconCompatParcelizer, hideCurrentlyDisplayingInAppMessage.read((CharSequence) onContentCardDismissed.read(hideCurrentlyDisplayingInAppMessage.serializer(str3, new String[]{"-"}, 6))).toString(), strM, upperCase, false);
                            }
                            if (removeglobalpartnerparameteri != null) {
                                arrayList2.add(removeglobalpartnerparameteri);
                                int i11 = serializer + 27;
                                write = i11 % Fields.SpotShadowColor;
                                int i12 = i11 % 2;
                            }
                        }
                        List listSerializer = onContentCardDismissed.serializer(arrayList2, new FB(29));
                        removeglobalpartnerparameter2.serializer = listSerializer;
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(listSerializer.size(), "Country list ready: ", " entries after filtering"), new Object[0]);
                        MutableStateFlow mutableStateFlow2 = removeglobalpartnerparameter2.RemoteActionCompatParcelizer;
                        do {
                            obj6 = mutableStateFlow2.read();
                        } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj6, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj6, false, null, false, removeglobalpartnerparameter2.serializer, null, 126975)));
                        int i13 = write + 83;
                        serializer = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 != 0) {
                            return createfromparcel2;
                        }
                        Object obj9 = null;
                        obj9.hashCode();
                        throw null;
                    }
                };
                this.IconCompatParcelizer = 1;
                return flowWrite.collect(flowCollector2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
            }
            int i7 = RemoteActionCompatParcelizer + 57;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? i6 != 1 : i6 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.IconCompatParcelizer;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PhoneValidationUseCase phoneValidationUseCase = removeglobalpartnerparameter.MediaDescriptionCompat;
            MutableStateFlow mutableStateFlow = removeglobalpartnerparameter.RemoteActionCompatParcelizer;
            String strWrite = ((removeGlobalCallbackParametersI) mutableStateFlow.read()).MediaSessionCompatResultReceiverWrapper.write();
            String str = ((removeGlobalCallbackParametersI) mutableStateFlow.read()).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (str == null) {
                int i9 = RemoteActionCompatParcelizer + 105;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                str = "";
            }
            this.IconCompatParcelizer = 1;
            objM5019invoke0E7RQCE$implementation = phoneValidationUseCase.m5019invoke0E7RQCE$implementation(strWrite, str, this);
            if (objM5019invoke0E7RQCE$implementation == coroutineSingletons3) {
                int i11 = RemoteActionCompatParcelizer + 107;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons3;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i13 = serializer + 99;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return null;
            }
            int i15 = serializer + 55;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM5019invoke0E7RQCE$implementation = ((onItemDismiss) obj).IconCompatParcelizer;
                int i16 = 26 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM5019invoke0E7RQCE$implementation = ((onItemDismiss) obj).IconCompatParcelizer;
            }
        }
        if (!(objM5019invoke0E7RQCE$implementation instanceof isItemDismissable)) {
            int i17 = RemoteActionCompatParcelizer + 23;
            serializer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            String str2 = (String) objM5019invoke0E7RQCE$implementation;
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("API call succeeded", new Object[0]);
            MutableStateFlow mutableStateFlow2 = removeglobalpartnerparameter.RemoteActionCompatParcelizer;
            do {
                obj3 = mutableStateFlow2.read();
            } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj3, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj3, false, null, false, null, null, 131070)));
            ActivityHandler44 activityHandler44 = new ActivityHandler44(((removeGlobalCallbackParametersI) removeglobalpartnerparameter.RemoteActionCompatParcelizer.read()).MediaBrowserCompatMediaItem.write(), str2);
            removeglobalpartnerparameter.MediaBrowserCompatMediaItem.serializer(removeglobalpartnerparameter.write ? new sendReftagReferrer(activityHandler44) : new sendLicenseVerificationData(activityHandler44));
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5019invoke0E7RQCE$implementation);
        if (thSerializer == null) {
            return createfromparcel;
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("API call failed", new Object[0]);
        MutableStateFlow mutableStateFlow3 = removeglobalpartnerparameter.RemoteActionCompatParcelizer;
        do {
            obj2 = mutableStateFlow3.read();
        } while (!mutableStateFlow3.RemoteActionCompatParcelizer(obj2, removeGlobalCallbackParametersI.IconCompatParcelizer((removeGlobalCallbackParametersI) obj2, false, null, false, null, null, 131070)));
        removeglobalpartnerparameter.MediaBrowserCompatMediaItem.serializer(new setCoppaComplianceInDelay(removeglobalpartnerparameter.MediaSessionCompatToken.read(thSerializer, null, null)));
        return createfromparcel;
    }
}
