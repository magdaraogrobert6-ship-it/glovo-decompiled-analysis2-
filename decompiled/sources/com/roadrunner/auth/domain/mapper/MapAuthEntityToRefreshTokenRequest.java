package com.roadrunner.auth.domain.mapper;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.dismissdefault;
import o.getTraversalIndexdelegate;
import o.onClick;
import o.toNativeBlendMode;

/* JADX INFO: loaded from: classes3.dex */
public final class MapAuthEntityToRefreshTokenRequest {
    private static int read = 1;
    private static int serializer;
    public final toNativeBlendMode RemoteActionCompatParcelizer;

    public MapAuthEntityToRefreshTokenRequest(toNativeBlendMode tonativeblendmode) {
        tonativeblendmode.getClass();
        this.RemoteActionCompatParcelizer = tonativeblendmode;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public final Object invoke(getTraversalIndexdelegate gettraversalindexdelegate, String str, ContinuationImpl continuationImpl) {
        onClick onclick;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = 2 % 2;
        if (continuationImpl instanceof onClick) {
            onclick = (onClick) continuationImpl;
            int i2 = onclick.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = read + 9;
                serializer = i3 % Fields.SpotShadowColor;
                onclick.write = i3 % 2 != 0 ? i2 / Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                onclick = new onClick(this, continuationImpl);
            }
        } else {
            onclick = new onClick(this, continuationImpl);
        }
        Object obj = onclick.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = onclick.write;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str6 = gettraversalindexdelegate.accessToken;
            String str7 = gettraversalindexdelegate.refreshToken;
            String str8 = gettraversalindexdelegate.deviceToken;
            String str9 = gettraversalindexdelegate.userId;
            onclick.IconCompatParcelizer = str;
            onclick.read = str8;
            onclick.RemoteActionCompatParcelizer = str7;
            onclick.serializer = str6;
            onclick.write = 1;
            Object objIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(str9, onclick);
            if (objIconCompatParcelizer == coroutineSingletons) {
                int i5 = read + 29;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 89 / 0;
                }
                return coroutineSingletons;
            }
            int i7 = serializer + 113;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            str2 = str;
            str3 = str6;
            str4 = str7;
            str5 = str8;
            obj = objIconCompatParcelizer;
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str10 = onclick.serializer;
            String str11 = onclick.RemoteActionCompatParcelizer;
            String str12 = onclick.read;
            String str13 = onclick.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            str3 = str10;
            str4 = str11;
            str5 = str12;
            str2 = str13;
        }
        return new dismissdefault(str3, str4, str5, str2, (String) obj);
    }
}
