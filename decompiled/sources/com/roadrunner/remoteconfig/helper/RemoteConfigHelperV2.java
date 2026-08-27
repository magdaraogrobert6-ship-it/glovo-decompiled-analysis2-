package com.roadrunner.remoteconfig.helper;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.DelayKt;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.accessgetInstancedelegatecp;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onMove;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0;
import o.requestDisallowParentIntercept;
import o.resumeWebviewIfNecessaryandroid_sdk_ui_release;
import o.setCarryoverInAppMessage;
import o.setWasCloseMessageCalled;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RemoteConfigHelperV2 {
    private static int IconCompatParcelizer = 1;
    public static final r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc RemoteActionCompatParcelizer = DelayKt.serializer(new MapApiError$$ExternalSyntheticLambda1(26));
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 99;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static LinkedHashMap RemoteActionCompatParcelizer(r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Set setEntrySet = r8lambdaerwhggzq_gqgn8cultnvrcshm8k.content.entrySet();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(setEntrySet, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            int i4 = serializer;
            int i5 = i4 + 97;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2 == 0 ? 28 : 16;
            int i7 = i4 + 79;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iRemoteActionCompatParcelizer = i6;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        Iterator it = setEntrySet.iterator();
        while (!(!it.hasNext())) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put((String) entry.getKey(), read((SwipeDismissTouchListenerVerticalDismissDirection) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static List IconCompatParcelizer(String str, String str2, List list) {
        int i = 2 % 2;
        int i2 = serializer + 17;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            list.getClass();
            hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
            obj.hashCode();
            throw null;
        }
        list.getClass();
        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            try {
                r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = RemoteActionCompatParcelizer;
                r8lambda3kmch7yklpui_5smgazrgczhglc.getClass();
                beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                Map map = (Map) r8lambda3kmch7yklpui_5smgazrgczhglc.serializer(str, new beforeOpened(beforeinappmessageviewclosed, new setWasCloseMessageCalled(beforeinappmessageviewclosed, 0)));
                List list2 = (List) map.get(str2);
                if (list2 != null) {
                    return list2;
                }
                int i3 = serializer + 81;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                List list3 = (List) map.get("default");
                if (list3 != null) {
                    int i4 = IconCompatParcelizer + 111;
                    serializer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return list3;
                }
            } catch (Exception e) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.getClass();
                if (Timber.read.length != 0) {
                    int i6 = IconCompatParcelizer + 23;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    forest.RemoteActionCompatParcelizer(e, "Failed to parse JSON for List<String> using: ".concat(str), new Object[0]);
                }
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object read(SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        int i = 2 % 2;
        int i2 = serializer + 99;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) {
            r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirection;
            if (r8lambdagbekcaskecamm7h9dyqnzofon0.RemoteActionCompatParcelizer()) {
                return r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer();
            }
            Object objMediaMetadataCompat = resumeWebviewIfNecessaryandroid_sdk_ui_release.MediaMetadataCompat(r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer());
            return (objMediaMetadataCompat == null && (objMediaMetadataCompat = setCarryoverInAppMessage.ParcelableVolumeInfo(r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer())) == null && (objMediaMetadataCompat = hideCurrentlyDisplayingInAppMessage.write(r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer())) == null) ? r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer() : objMediaMetadataCompat;
        }
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) {
            return RemoteActionCompatParcelizer((r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) swipeDismissTouchListenerVerticalDismissDirection);
        }
        if (!(swipeDismissTouchListenerVerticalDismissDirection instanceof requestDisallowParentIntercept)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        Iterable iterable = (Iterable) swipeDismissTouchListenerVerticalDismissDirection;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(read((SwipeDismissTouchListenerVerticalDismissDirection) it.next()));
        }
        int i4 = IconCompatParcelizer + 11;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return arrayList;
    }
}
