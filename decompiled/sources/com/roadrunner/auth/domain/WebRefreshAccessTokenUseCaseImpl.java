package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.SemanticsPropertiesContentDataType1;
import o.dismissdefault;
import o.getContentDataTypedelegate;
import o.getTraversalIndex;
import o.isItemDismissable;
import o.toNativeBlendMode;

/* JADX INFO: loaded from: classes3.dex */
public final class WebRefreshAccessTokenUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final AuthRepository RemoteActionCompatParcelizer;
    public final toNativeBlendMode read;
    public final IncogniaManagerImpl serializer;

    public WebRefreshAccessTokenUseCaseImpl(AuthRepository authRepository, toNativeBlendMode tonativeblendmode, IncogniaManagerImpl incogniaManagerImpl) {
        authRepository.getClass();
        tonativeblendmode.getClass();
        incogniaManagerImpl.getClass();
        this.RemoteActionCompatParcelizer = authRepository;
        this.read = tonativeblendmode;
        this.serializer = incogniaManagerImpl;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4871invokegIAlus(getTraversalIndex gettraversalindex, ContinuationImpl continuationImpl) throws Throwable {
        WebRefreshAccessTokenUseCaseImpl$invoke$1 webRefreshAccessTokenUseCaseImpl$invoke$1;
        String str;
        String str2;
        String str3;
        String str4;
        AuthRepository authRepository;
        dismissdefault dismissdefaultVar;
        AuthRepository authRepository2;
        Object objIconCompatParcelizer;
        int i = 2 % 2;
        if (continuationImpl instanceof WebRefreshAccessTokenUseCaseImpl$invoke$1) {
            int i2 = IconCompatParcelizer + 27;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            webRefreshAccessTokenUseCaseImpl$invoke$1 = (WebRefreshAccessTokenUseCaseImpl$invoke$1) continuationImpl;
            int i4 = webRefreshAccessTokenUseCaseImpl$invoke$1.MediaDescriptionCompat;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                webRefreshAccessTokenUseCaseImpl$invoke$1.MediaDescriptionCompat = i4 - Integer.MIN_VALUE;
            } else {
                webRefreshAccessTokenUseCaseImpl$invoke$1 = new WebRefreshAccessTokenUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            webRefreshAccessTokenUseCaseImpl$invoke$1 = new WebRefreshAccessTokenUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = webRefreshAccessTokenUseCaseImpl$invoke$1.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = webRefreshAccessTokenUseCaseImpl$invoke$1.MediaDescriptionCompat;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str5 = gettraversalindex.write;
            String str6 = gettraversalindex.IconCompatParcelizer;
            String str7 = gettraversalindex.RemoteActionCompatParcelizer;
            String str8 = gettraversalindex.serializer;
            String str9 = gettraversalindex.read;
            AuthRepository authRepository3 = this.RemoteActionCompatParcelizer;
            webRefreshAccessTokenUseCaseImpl$invoke$1.write = authRepository3;
            webRefreshAccessTokenUseCaseImpl$invoke$1.serializer = str5;
            webRefreshAccessTokenUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = str6;
            webRefreshAccessTokenUseCaseImpl$invoke$1.read = str7;
            webRefreshAccessTokenUseCaseImpl$invoke$1.IconCompatParcelizer = str8;
            webRefreshAccessTokenUseCaseImpl$invoke$1.MediaDescriptionCompat = 1;
            Object objIconCompatParcelizer2 = this.read.IconCompatParcelizer(str9, webRefreshAccessTokenUseCaseImpl$invoke$1);
            if (objIconCompatParcelizer2 != coroutineSingletons) {
                str = str6;
                str2 = str7;
                str3 = str5;
                str4 = str8;
                authRepository = authRepository3;
                obj = objIconCompatParcelizer2;
            }
            return coroutineSingletons;
        }
        int i6 = IconCompatParcelizer + 71;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (i5 == 1) {
            String str10 = webRefreshAccessTokenUseCaseImpl$invoke$1.IconCompatParcelizer;
            String str11 = webRefreshAccessTokenUseCaseImpl$invoke$1.read;
            String str12 = webRefreshAccessTokenUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
            String str13 = (String) webRefreshAccessTokenUseCaseImpl$invoke$1.serializer;
            authRepository = webRefreshAccessTokenUseCaseImpl$invoke$1.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            str4 = str10;
            str2 = str11;
            str = str12;
            str3 = str13;
        } else {
            if (i5 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dismissdefaultVar = (dismissdefault) webRefreshAccessTokenUseCaseImpl$invoke$1.serializer;
            authRepository2 = webRefreshAccessTokenUseCaseImpl$invoke$1.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        objIconCompatParcelizer = authRepository2.IconCompatParcelizer(dismissdefaultVar, (String) obj);
        if (!(objIconCompatParcelizer instanceof isItemDismissable)) {
            return objIconCompatParcelizer;
        }
        getContentDataTypedelegate getcontentdatatypedelegate = (getContentDataTypedelegate) objIconCompatParcelizer;
        return new SemanticsPropertiesContentDataType1(getcontentdatatypedelegate.accessToken, getcontentdatatypedelegate.refreshToken, getcontentdatatypedelegate.expiresIn);
        dismissdefaultVar = new dismissdefault(str3, str, str2, str4, (String) obj);
        webRefreshAccessTokenUseCaseImpl$invoke$1.write = authRepository;
        webRefreshAccessTokenUseCaseImpl$invoke$1.serializer = dismissdefaultVar;
        webRefreshAccessTokenUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = null;
        webRefreshAccessTokenUseCaseImpl$invoke$1.read = null;
        webRefreshAccessTokenUseCaseImpl$invoke$1.IconCompatParcelizer = null;
        webRefreshAccessTokenUseCaseImpl$invoke$1.MediaDescriptionCompat = 2;
        obj = this.serializer.read(webRefreshAccessTokenUseCaseImpl$invoke$1);
        if (obj != coroutineSingletons) {
            authRepository2 = authRepository;
            objIconCompatParcelizer = authRepository2.IconCompatParcelizer(dismissdefaultVar, (String) obj);
            if (!(objIconCompatParcelizer instanceof isItemDismissable)) {
                return objIconCompatParcelizer;
            }
            getContentDataTypedelegate getcontentdatatypedelegate2 = (getContentDataTypedelegate) objIconCompatParcelizer;
            return new SemanticsPropertiesContentDataType1(getcontentdatatypedelegate2.accessToken, getcontentdatatypedelegate2.refreshToken, getcontentdatatypedelegate2.expiresIn);
        }
        return coroutineSingletons;
    }
}
