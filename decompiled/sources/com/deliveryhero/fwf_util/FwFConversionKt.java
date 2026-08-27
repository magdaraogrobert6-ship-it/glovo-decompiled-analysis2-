package com.deliveryhero.fwf_util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.JsonDecodingException;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.TouchAwareSwipeDismissTouchListener;
import o.isVerticalSwipeInAllowedDirection;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0;
import o.requestDisallowParentIntercept;
import o.resetTransientState;
import o.resumeWebviewIfNecessaryandroid_sdk_ui_release;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFConversionKt {
    public static final SwipeDismissTouchListenerVerticalDismissDirection toJsonElement(Object obj) {
        if (obj == null) {
            return r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc.INSTANCE;
        }
        if (obj instanceof Map) {
            return toJsonElement((Map<?, ?>) obj);
        }
        if (obj instanceof Collection) {
            return toJsonElement((Collection<?>) obj);
        }
        if (obj instanceof Boolean) {
            return TouchAwareSwipeDismissTouchListener.write((Boolean) obj);
        }
        if (obj instanceof String) {
            return TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(obj.toString());
        }
        if (obj instanceof Integer) {
            return TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Integer.valueOf(((Number) obj).intValue()));
        }
        return obj instanceof Double ? TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Double.valueOf(((Number) obj).doubleValue())) : TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(obj.toString());
    }

    public static final Object asVariation(Object obj) {
        obj.getClass();
        if ((obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String)) {
            return obj;
        }
        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
        SwipeDismissTouchListenerVerticalDismissDirection jsonElement = toJsonElement(obj);
        isverticalswipeinalloweddirection.getClass();
        return isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(SwipeDismissTouchListenerVerticalDismissDirection.Companion.serializer(), jsonElement);
    }

    public static final Object toAny(SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        swipeDismissTouchListenerVerticalDismissDirection.getClass();
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) {
            return getPrimitive((r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirection);
        }
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof requestDisallowParentIntercept) {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            return isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(requestDisallowParentIntercept.Companion.serializer(), swipeDismissTouchListenerVerticalDismissDirection);
        }
        if (!(swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k)) {
            swipeDismissTouchListenerVerticalDismissDirection.equals(r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc.INSTANCE);
            return null;
        }
        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
        isverticalswipeinalloweddirection2.getClass();
        return isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k.Companion.serializer(), swipeDismissTouchListenerVerticalDismissDirection);
    }

    private static final Object getPrimitive(r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0) {
        Long lValueOf;
        Integer numValueOf = null;
        if (r8lambdagbekcaskecamm7h9dyqnzofon0 instanceof r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc) {
            return null;
        }
        Boolean boolRemoteActionCompatParcelizer = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(r8lambdagbekcaskecamm7h9dyqnzofon0);
        if (boolRemoteActionCompatParcelizer != null) {
            return boolRemoteActionCompatParcelizer;
        }
        try {
            lValueOf = Long.valueOf(TouchAwareSwipeDismissTouchListener.serializer(r8lambdagbekcaskecamm7h9dyqnzofon0));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                numValueOf = Integer.valueOf((int) jLongValue);
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(numValueOf.intValue());
        }
        Double dMediaMetadataCompat = resumeWebviewIfNecessaryandroid_sdk_ui_release.MediaMetadataCompat(r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer());
        return dMediaMetadataCompat != null ? Double.valueOf(dMediaMetadataCompat.doubleValue()) : r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer();
    }

    public static final SwipeDismissTouchListenerVerticalDismissDirection toJsonElement(Collection<?> collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            SwipeDismissTouchListenerVerticalDismissDirection jsonElement = toJsonElement(it.next());
            if (jsonElement != null) {
                arrayList.add(jsonElement);
            }
        }
        return new requestDisallowParentIntercept(arrayList);
    }

    public static final SwipeDismissTouchListenerVerticalDismissDirection toJsonElement(Map<?, ?> map) {
        map.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = str != null ? new onViewAttachedToWindowlambda0(str, toJsonElement(entry.getValue())) : null;
            if (onviewattachedtowindowlambda0 != null) {
                arrayList.add(onviewattachedtowindowlambda0);
            }
        }
        return new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k(onMove.serializer(arrayList));
    }
}
