package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaMetadataCompat {
    public static final int[] RemoteActionCompatParcelizer = new int[2];

    public static io.sentry.internal.gestures.serializer serializer(SentryAndroidOptions sentryAndroidOptions, View view, float f, float f2, io.sentry.internal.gestures.IconCompatParcelizer iconCompatParcelizer) {
        List<io.sentry.internal.gestures.read> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.serializer serializerVar = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (view2 != null) {
                int[] iArr = RemoteActionCompatParcelizer;
                view2.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (f >= i && f <= i + width && f2 >= i2 && f2 <= i2 + height) {
                    if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            linkedList.add(viewGroup.getChildAt(i3));
                        }
                    }
                    for (int i4 = 0; i4 < gestureTargetLocators.size(); i4++) {
                        io.sentry.internal.gestures.serializer serializerVarLocate = gestureTargetLocators.get(i4).locate(view2, f, f2, iconCompatParcelizer);
                        if (serializerVarLocate != null) {
                            if (iconCompatParcelizer == io.sentry.internal.gestures.IconCompatParcelizer.CLICKABLE) {
                                serializerVar = serializerVarLocate;
                            } else if (iconCompatParcelizer == io.sentry.internal.gestures.IconCompatParcelizer.SCROLLABLE) {
                                return serializerVarLocate;
                            }
                        }
                    }
                }
            }
        }
        return serializerVar;
    }

    public static String IconCompatParcelizer(View view) {
        int id = view.getId();
        if (id == -1 || (((-16777216) & id) == 0 && (16777215 & id) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }
}
