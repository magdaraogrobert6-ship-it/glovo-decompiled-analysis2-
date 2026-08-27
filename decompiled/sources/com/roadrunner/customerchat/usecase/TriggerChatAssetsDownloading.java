package com.roadrunner.customerchat.usecase;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkManagerImpl;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.GraphicsLayerScopeDefaultImpls;
import o.accessgetSlotIdToNodep;
import o.accesssetColorFilterjd;
import o.createFromParcel;
import o.getHeightXSAIIZE;
import o.lerpPlatformStyle;
import o.setTranslationX;

/* JADX INFO: loaded from: classes3.dex */
public final class TriggerChatAssetsDownloading {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final WorkManagerImpl serializer;

    public TriggerChatAssetsDownloading(WorkManagerImpl workManagerImpl) {
        workManagerImpl.getClass();
        this.serializer = workManagerImpl;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f6 A[PHI: r6
  0x00f6: PHI (r6v9 o.GraphicsLayerScopeDefaultImpls) = (r6v8 o.GraphicsLayerScopeDefaultImpls), (r6v12 o.GraphicsLayerScopeDefaultImpls) binds: [B:37:0x00f4, B:34:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:0: B:29:0x00c4->B:49:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    public final Object invoke(String str, String str2, String str3, String str4, String str5, List list, ContinuationImpl continuationImpl) {
        lerpPlatformStyle lerpplatformstyle;
        String str6;
        String str7;
        String str8;
        String str9;
        GraphicsLayerScopeDefaultImpls graphicsLayerScopeDefaultImpls;
        String str10 = str4;
        List list2 = list;
        int i = 2 % 2;
        if (continuationImpl instanceof lerpPlatformStyle) {
            lerpplatformstyle = (lerpPlatformStyle) continuationImpl;
            int i2 = lerpplatformstyle.RatingCompat;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = write + 61;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                lerpplatformstyle.RatingCompat = i2 - Integer.MIN_VALUE;
            } else {
                lerpplatformstyle = new lerpPlatformStyle(this, continuationImpl);
                int i5 = write + 65;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            lerpplatformstyle = new lerpPlatformStyle(this, continuationImpl);
            int i7 = write + 65;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Object objFirst = lerpplatformstyle.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = lerpplatformstyle.RatingCompat;
        WorkManagerImpl workManagerImpl = this.serializer;
        if (i9 != 0) {
            int i10 = IconCompatParcelizer + 11;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0 ? i9 != 1 : i9 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = lerpplatformstyle.MediaBrowserCompatMediaItem;
            String str11 = lerpplatformstyle.write;
            String str12 = lerpplatformstyle.RemoteActionCompatParcelizer;
            String str13 = lerpplatformstyle.serializer;
            str9 = lerpplatformstyle.read;
            str8 = lerpplatformstyle.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            str7 = str11;
            str6 = str13;
            list2 = list3;
            str10 = str12;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            Flow flowIconCompatParcelizer = workManagerImpl.IconCompatParcelizer("chat_assets_download_" + str10);
            lerpplatformstyle.IconCompatParcelizer = str;
            lerpplatformstyle.read = str2;
            str6 = str3;
            lerpplatformstyle.serializer = str6;
            lerpplatformstyle.RemoteActionCompatParcelizer = str10;
            str7 = str5;
            lerpplatformstyle.write = str7;
            lerpplatformstyle.MediaBrowserCompatMediaItem = list2;
            lerpplatformstyle.RatingCompat = 1;
            objFirst = FlowKt.first(flowIconCompatParcelizer, lerpplatformstyle);
            if (objFirst == coroutineSingletons) {
                int i11 = write + 83;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons;
            }
            str8 = str;
            str9 = str2;
        }
        Iterable iterable = (Iterable) objFirst;
        boolean z = iterable instanceof Collection;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                int i13 = IconCompatParcelizer + 19;
                write = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    graphicsLayerScopeDefaultImpls = (GraphicsLayerScopeDefaultImpls) it.next();
                    int i14 = 59 / 0;
                    if (graphicsLayerScopeDefaultImpls.RemoteActionCompatParcelizer() != setTranslationX.RUNNING) {
                        if (graphicsLayerScopeDefaultImpls.RemoteActionCompatParcelizer() == setTranslationX.ENQUEUED) {
                        }
                    }
                } else {
                    graphicsLayerScopeDefaultImpls = (GraphicsLayerScopeDefaultImpls) it.next();
                    if (graphicsLayerScopeDefaultImpls.RemoteActionCompatParcelizer() != setTranslationX.RUNNING) {
                        if (graphicsLayerScopeDefaultImpls.RemoteActionCompatParcelizer() == setTranslationX.ENQUEUED) {
                        }
                    }
                }
                return createfromparcel;
            }
        }
        workManagerImpl.serializer("chat_assets_download_", accesssetColorFilterjd.REPLACE, accessgetSlotIdToNodep.serializer(new getHeightXSAIIZE(str8, str9, str6, str10, str7, list2)));
        int i15 = IconCompatParcelizer + 73;
        write = i15 % Fields.SpotShadowColor;
        if (i15 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }
}
