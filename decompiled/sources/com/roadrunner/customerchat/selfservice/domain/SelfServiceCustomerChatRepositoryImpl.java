package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.data.remote.service.ExecuteHelpCenterApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfServiceCustomerChatRepositoryImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final HelpCenterRemoteDataSourceImpl IconCompatParcelizer;
    public final ExecuteHelpCenterApiRequest write;

    public SelfServiceCustomerChatRepositoryImpl(HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl, ExecuteHelpCenterApiRequest executeHelpCenterApiRequest) {
        helpCenterRemoteDataSourceImpl.getClass();
        executeHelpCenterApiRequest.getClass();
        this.IconCompatParcelizer = helpCenterRemoteDataSourceImpl;
        this.write = executeHelpCenterApiRequest;
    }

    public static /* synthetic */ Object write(SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        int i2 = serializer + 41;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        return i2 % 2 == 0 ? selfServiceCustomerChatRepositoryImpl.m4892retryWithResulthUnOzRk(4, ConstantKt.DEFAULT_REQUEST_TIMEOUT, 6000L, 2.0d, r8lambdaunavo3sxub_pc9xroryotnrlvsm, continuationImpl) : selfServiceCustomerChatRepositoryImpl.m4892retryWithResulthUnOzRk(3, ConstantKt.DEFAULT_REQUEST_TIMEOUT, 6000L, 2.0d, r8lambdaunavo3sxub_pc9xroryotnrlvsm, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX INFO: renamed from: fetchHelpCenterRegion-IoAF18A, reason: not valid java name */
    public final Object m4889fetchHelpCenterRegionIoAF18A(ContinuationImpl continuationImpl) {
        SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1 selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1) {
            selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1 = (SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1) continuationImpl;
            int i3 = selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = serializer + 109;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1.serializer = i4 % 2 == 0 ? i3 % Integer.MIN_VALUE : i3 - Integer.MIN_VALUE;
                i = serializer + 47;
            } else {
                selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1 = new SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1(this, continuationImpl);
                i = serializer + 39;
            }
        } else {
            selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1 = new SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1(this, continuationImpl);
            i = serializer + 39;
        }
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i5 = i % 2;
        Object obj = selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1.serializer;
        int i7 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 != 0) {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
            int i8 = serializer + 55;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 43 / 0;
            }
            return obj2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2 selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2 = new SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2(this, shortNewsContentCardView, i7);
        selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1.serializer = 1;
        Object objWrite = write(this, selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2, selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1);
        if (objWrite != coroutineSingletons) {
            return objWrite;
        }
        int i10 = serializer + 69;
        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: getUnreadCountDetails-IoAF18A, reason: not valid java name */
    public final Object m4891getUnreadCountDetailsIoAF18A(ContinuationImpl continuationImpl) {
        SelfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1 selfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1;
        int i = 2;
        int i2 = 2 % 2;
        if (continuationImpl instanceof SelfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1) {
            selfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1 = (SelfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1) continuationImpl;
            int i3 = selfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                selfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
                int i4 = RemoteActionCompatParcelizer + 45;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                selfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1 = new SelfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1(this, continuationImpl);
            }
        } else {
            selfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1 = new SelfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1(this, continuationImpl);
        }
        Object obj = selfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = selfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 != 0) {
            if (i6 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2 selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2 = new SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2(this, shortNewsContentCardView, i);
        selfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1.IconCompatParcelizer = 1;
        Object objM4882invokegIAlus = this.write.m4882invokegIAlus(selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2, selfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1);
        if (objM4882invokegIAlus != coroutineSingletons) {
            return objM4882invokegIAlus;
        }
        int i7 = RemoteActionCompatParcelizer + 29;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX INFO: renamed from: getChatId-gIAlu-s, reason: not valid java name */
    public final Object m4890getChatIdgIAlus(String str, ContinuationImpl continuationImpl) {
        SelfServiceCustomerChatRepositoryImpl$getChatId$1 selfServiceCustomerChatRepositoryImpl$getChatId$1;
        int i = 2 % 2;
        if (continuationImpl instanceof SelfServiceCustomerChatRepositoryImpl$getChatId$1) {
            selfServiceCustomerChatRepositoryImpl$getChatId$1 = (SelfServiceCustomerChatRepositoryImpl$getChatId$1) continuationImpl;
            int i2 = selfServiceCustomerChatRepositoryImpl$getChatId$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = serializer + 89;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                selfServiceCustomerChatRepositoryImpl$getChatId$1.IconCompatParcelizer = i3 % 2 == 0 ? i2 - Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                selfServiceCustomerChatRepositoryImpl$getChatId$1 = new SelfServiceCustomerChatRepositoryImpl$getChatId$1(this, continuationImpl);
            }
        } else {
            selfServiceCustomerChatRepositoryImpl$getChatId$1 = new SelfServiceCustomerChatRepositoryImpl$getChatId$1(this, continuationImpl);
        }
        Object obj = selfServiceCustomerChatRepositoryImpl$getChatId$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = selfServiceCustomerChatRepositoryImpl$getChatId$1.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, str, shortNewsContentCardView, 10);
            selfServiceCustomerChatRepositoryImpl$getChatId$1.IconCompatParcelizer = 1;
            Object objM4882invokegIAlus = this.write.m4882invokegIAlus(authRepository$logoutUser$2, selfServiceCustomerChatRepositoryImpl$getChatId$1);
            return objM4882invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4882invokegIAlus;
        }
        int i5 = serializer + 105;
        int i6 = i5 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i6;
        int i7 = i5 % 2;
        if (i4 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i8 = i6 + 103;
        serializer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return ((onItemDismiss) obj).IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: sendMessage-0E7RQCE, reason: not valid java name */
    public final Object m4893sendMessage0E7RQCE(String str, String str2, ContinuationImpl continuationImpl) {
        SelfServiceCustomerChatRepositoryImpl$sendMessage$1 selfServiceCustomerChatRepositoryImpl$sendMessage$1;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof SelfServiceCustomerChatRepositoryImpl$sendMessage$1) {
            selfServiceCustomerChatRepositoryImpl$sendMessage$1 = (SelfServiceCustomerChatRepositoryImpl$sendMessage$1) continuationImpl;
            int i4 = selfServiceCustomerChatRepositoryImpl$sendMessage$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                selfServiceCustomerChatRepositoryImpl$sendMessage$1.read = i4 - Integer.MIN_VALUE;
            } else {
                selfServiceCustomerChatRepositoryImpl$sendMessage$1 = new SelfServiceCustomerChatRepositoryImpl$sendMessage$1(this, continuationImpl);
            }
        } else {
            selfServiceCustomerChatRepositoryImpl$sendMessage$1 = new SelfServiceCustomerChatRepositoryImpl$sendMessage$1(this, continuationImpl);
        }
        Object obj = selfServiceCustomerChatRepositoryImpl$sendMessage$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = selfServiceCustomerChatRepositoryImpl$sendMessage$1.read;
        Object obj2 = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SelfServiceCustomerChatRepositoryImpl$sendMessage$2 selfServiceCustomerChatRepositoryImpl$sendMessage$2 = new SelfServiceCustomerChatRepositoryImpl$sendMessage$2(this, str, str2, null, 0);
            selfServiceCustomerChatRepositoryImpl$sendMessage$1.read = 1;
            Object objWrite = write(this, selfServiceCustomerChatRepositoryImpl$sendMessage$2, selfServiceCustomerChatRepositoryImpl$sendMessage$1);
            if (objWrite != coroutineSingletons) {
                return objWrite;
            }
            int i6 = RemoteActionCompatParcelizer + 53;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return coroutineSingletons;
            }
            throw null;
        }
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i7 = serializer + 119;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0106  */
    /* JADX WARN: Code duplicated, block: B:36:0x0126  */
    /* JADX WARN: Code duplicated, block: B:39:0x0155  */
    /* JADX WARN: Code duplicated, block: B:44:0x016e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0177  */
    /* JADX WARN: Code duplicated, block: B:46:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0155 -> B:40:0x015b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x016e -> B:47:0x017b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0178 -> B:47:0x017b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: retryWithResult-hUnOzRk, reason: not valid java name */
    public final java.lang.Object m4892retryWithResulthUnOzRk(int r24, long r25, long r27, double r29, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl.m4892retryWithResulthUnOzRk(int, long, long, double, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
