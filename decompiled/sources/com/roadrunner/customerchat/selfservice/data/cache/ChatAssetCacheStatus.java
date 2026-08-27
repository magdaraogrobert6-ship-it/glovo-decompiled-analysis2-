package com.roadrunner.customerchat.selfservice.data.cache;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.ActionPropertyKey;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ChatAssetCacheStatus {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ChatAssetCacheStatus[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    public static final ChatAssetCacheStatus READY = new ChatAssetCacheStatus("READY", 0);
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;

    private ChatAssetCacheStatus(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 57;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
            int i4 = 5 / 0;
        } else {
            onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        }
        int i5 = i2 + 83;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 85;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 5;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: $r8$lambda$vz_quzN5aOb-vHrFeH7f4a32PXc, reason: not valid java name */
    public static /* synthetic */ setGraphicModalMaxWidthDp m4881$r8$lambda$vz_quzN5aObvHrFeH7f4a32PXc() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = serializer + 121;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        ChatAssetCacheStatus[] chatAssetCacheStatusArr$values = $values();
        $VALUES = chatAssetCacheStatusArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) chatAssetCacheStatusArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ActionPropertyKey(26));
        int i = RemoteActionCompatParcelizer + 65;
        write = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 10 / 0;
        }
    }

    private static final /* synthetic */ ChatAssetCacheStatus[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 3;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ChatAssetCacheStatus[] chatAssetCacheStatusArr = {READY};
        int i5 = i2 + 11;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return chatAssetCacheStatusArr;
    }

    public static ChatAssetCacheStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 45;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ChatAssetCacheStatus chatAssetCacheStatus = (ChatAssetCacheStatus) Enum.valueOf(ChatAssetCacheStatus.class, str);
        int i4 = IconCompatParcelizer + 51;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return chatAssetCacheStatus;
        }
        throw null;
    }

    public static ChatAssetCacheStatus[] values() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ChatAssetCacheStatus[] chatAssetCacheStatusArr = (ChatAssetCacheStatus[]) $VALUES.clone();
        int i4 = serializer + 57;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return chatAssetCacheStatusArr;
    }

    public static final class Companion {
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 51;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) ChatAssetCacheStatus.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = serializer + 33;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        ChatAssetCacheStatus[] chatAssetCacheStatusArrValues = values();
        chatAssetCacheStatusArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheStatus", (Enum[]) chatAssetCacheStatusArrValues);
        int i2 = serializer + 121;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }
}
