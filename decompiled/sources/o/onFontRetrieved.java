package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class onFontRetrieved implements setGraphicModalMaxWidthDp {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final onFontRetrieved read = new onFontRetrieved();
    public static final getAppropriateModalView RemoteActionCompatParcelizer = RangesKt.IconCompatParcelizer("Any", new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0]);

    static {
        int i = write + 87;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 65 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 61;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getAppropriateModalView getappropriatemodalview = RemoteActionCompatParcelizer;
        int i5 = i2 + 67;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return getappropriatemodalview;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = RatingCompat + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return write(((setTouchListener) defaultInAppMessageModalViewFactoryCompanion).read());
        }
        int i3 = 57 / 0;
        return write(((setTouchListener) defaultInAppMessageModalViewFactoryCompanion).read());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        obj.getClass();
        ((BackgroundInAppMessagePreparer) defaultInAppMessageViewWrapperFactory).IconCompatParcelizer(write(obj));
        int i4 = RatingCompat + 109;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static SwipeDismissTouchListenerVerticalDismissDirection write(Object obj) {
        int i = 2 % 2;
        if (obj instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
            int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(setEntrySet, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(String.valueOf(entry.getKey()), write(entry.getValue()));
            }
            return new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k(linkedHashMap);
        }
        if (!(obj instanceof List)) {
            if (obj instanceof Number) {
                return TouchAwareSwipeDismissTouchListener.IconCompatParcelizer((Number) obj);
            }
            return (obj instanceof Boolean) ^ true ? TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(String.valueOf(obj)) : TouchAwareSwipeDismissTouchListener.write((Boolean) obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(iterable, 10));
        Iterator it = iterable.iterator();
        int i2 = IconCompatParcelizer + 27;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            int i4 = RatingCompat + 11;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            arrayList.add(write(it.next()));
        }
        return new requestDisallowParentIntercept(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Serializable write(SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 97;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            boolean z = swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
            throw null;
        }
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) {
            Map map = (Map) swipeDismissTouchListenerVerticalDismissDirection;
            LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(map.size()));
            int i4 = RatingCompat + 61;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), write((SwipeDismissTouchListenerVerticalDismissDirection) entry.getValue()));
            }
            return linkedHashMap;
        }
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof requestDisallowParentIntercept) {
            Iterable iterable = (Iterable) swipeDismissTouchListenerVerticalDismissDirection;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                int i6 = RatingCompat + 123;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                arrayList.add(write((SwipeDismissTouchListenerVerticalDismissDirection) it.next()));
            }
            return arrayList;
        }
        if (!(swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i8 = i2 + 65;
        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirection;
        String strIconCompatParcelizer = r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer();
        if (!r8lambdagbekcaskecamm7h9dyqnzofon0.RemoteActionCompatParcelizer()) {
            Serializable serializablePlaybackStateCompat = setCarryoverInAppMessage.PlaybackStateCompat(strIconCompatParcelizer);
            if (serializablePlaybackStateCompat == null && (serializablePlaybackStateCompat = setCarryoverInAppMessage.ParcelableVolumeInfo(strIconCompatParcelizer)) == null) {
                int i10 = RatingCompat + 121;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                serializablePlaybackStateCompat = resumeWebviewIfNecessaryandroid_sdk_ui_release.MediaMetadataCompat(strIconCompatParcelizer);
                if (serializablePlaybackStateCompat == null) {
                    int i12 = RatingCompat + 19;
                    IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    serializablePlaybackStateCompat = hideCurrentlyDisplayingInAppMessage.write(strIconCompatParcelizer);
                    if (serializablePlaybackStateCompat == null) {
                    }
                }
            }
            return serializablePlaybackStateCompat;
        }
        return strIconCompatParcelizer;
    }
}
