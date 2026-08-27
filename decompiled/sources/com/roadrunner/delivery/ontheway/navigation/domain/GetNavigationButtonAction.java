package com.roadrunner.delivery.ontheway.navigation.domain;

import android.content.Intent;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.data.extensions.ThrowableExtensionsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.destination.domain.GetDestinationAddressImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.Api28Impl;
import o.LineBreak_androidKt;
import o.accessgetDonecp;
import o.accessgetGocp;
import o.accesssetLoadStatep;
import o.copy8_81llAdefault;
import o.createTypefaceSpan;
import o.getSimplefcGXIks;
import o.onFailed;
import o.onItemDismiss;
import o.setDrawStyle;
import o.setShadowui_text;

/* JADX INFO: loaded from: classes3.dex */
public final class GetNavigationButtonAction {
    private static int read = 1;
    private static int serializer;
    public final GetDestinationAddressImpl IconCompatParcelizer;
    public final copy8_81llAdefault RemoteActionCompatParcelizer;
    public final LineBreak_androidKt write;

    public GetNavigationButtonAction(GetDestinationAddressImpl getDestinationAddressImpl, copy8_81llAdefault copy8_81lladefault, LineBreak_androidKt lineBreak_androidKt) {
        this.IconCompatParcelizer = getDestinationAddressImpl;
        this.RemoteActionCompatParcelizer = copy8_81lladefault;
        this.write = lineBreak_androidKt;
    }

    public final Object read(setDrawStyle setdrawstyle, boolean z, SuspendLambda suspendLambda) {
        int i = 2 % 2;
        int i2 = serializer + 23;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            int i4 = read + 97;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (!z) {
                setShadowui_text setshadowui_text = setdrawstyle.read();
                accessgetGocp accessgetgocp = new accessgetGocp(setshadowui_text.RemoteActionCompatParcelizer(), setshadowui_text.serializer());
                String strIconCompatParcelizer = setshadowui_text.IconCompatParcelizer();
                LineBreak_androidKt lineBreak_androidKt = this.write;
                accesssetLoadStatep accesssetloadstatep = new accesssetLoadStatep(new getSimplefcGXIks(accessgetgocp, strIconCompatParcelizer, lineBreak_androidKt.IconCompatParcelizer(), lineBreak_androidKt.serializer()));
                int i6 = read + 89;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return accesssetloadstatep;
            }
        }
        return getExternalNavigationAction(setdrawstyle, suspendLambda);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public final Object getExternalNavigationAction(setDrawStyle setdrawstyle, ContinuationImpl continuationImpl) throws Throwable {
        onFailed onfailed;
        Object objM4917invokegIAlus;
        int i = 2 % 2;
        int i2 = serializer + 79;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!(continuationImpl instanceof onFailed)) {
            onfailed = new onFailed(this, continuationImpl);
        } else {
            onfailed = (onFailed) continuationImpl;
            int i4 = onfailed.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = serializer + 3;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                onfailed.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
                int i7 = read + 123;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                onfailed = new onFailed(this, continuationImpl);
            }
        }
        Object obj = onfailed.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = onfailed.IconCompatParcelizer;
        String strIconCompatParcelizer = null;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessgetDonecp accessgetdonecp = new accessgetDonecp(new accessgetGocp(setdrawstyle.read().RemoteActionCompatParcelizer(), setdrawstyle.read().serializer()), setdrawstyle.read().write(), setdrawstyle.read().IconCompatParcelizer());
            onfailed.IconCompatParcelizer = 1;
            objM4917invokegIAlus = this.IconCompatParcelizer.m4917invokegIAlus(accessgetdonecp, onfailed);
            if (objM4917invokegIAlus == coroutineSingletons) {
                int i10 = serializer + 19;
                int i11 = i10 % Fields.SpotShadowColor;
                read = i11;
                int i12 = i10 % 2;
                int i13 = i11 + 83;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    return coroutineSingletons;
                }
                strIconCompatParcelizer.hashCode();
                throw null;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4917invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (onItemDismiss.serializer(objM4917invokegIAlus) == null) {
            return new Api28Impl((Intent) objM4917invokegIAlus);
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4917invokegIAlus);
        if (thSerializer != null) {
            strIconCompatParcelizer = ThrowableExtensionsKt.IconCompatParcelizer(thSerializer);
            int i14 = read + 85;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
        if (strIconCompatParcelizer == null) {
            int i16 = serializer + 25;
            read = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            strIconCompatParcelizer = "";
        }
        return new createTypefaceSpan(strIconCompatParcelizer);
    }
}
