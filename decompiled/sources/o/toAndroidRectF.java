package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class toAndroidRectF {
    public static void write(createBlurEffect8A3gB4 createblureffect8a3gb4, SingleRequest singleRequest) {
        singleRequest.MediaDescriptionCompat(createblureffect8a3gb4.write);
        singleRequest.serializer(10);
        singleRequest.MediaDescriptionCompat(createblureffect8a3gb4.read);
        singleRequest.serializer(10);
        singleRequest.MediaDescriptionCompat(createblureffect8a3gb4.MediaDescriptionCompat);
        singleRequest.serializer(10);
        Set<Map.Entry> setEntrySet = createblureffect8a3gb4.IconCompatParcelizer.serializer.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        singleRequest.MediaDescriptionCompat(size);
        singleRequest.serializer(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                singleRequest.read((String) entry.getKey());
                singleRequest.read(":");
                singleRequest.read(str);
                singleRequest.serializer(10);
            }
        }
    }

    public static createBlurEffect8A3gB4 read(GifDrawableTransformation gifDrawableTransformation) {
        int i = Integer.parseInt(gifDrawableTransformation.serializer(Long.MAX_VALUE));
        long j = Long.parseLong(gifDrawableTransformation.serializer(Long.MAX_VALUE));
        long j2 = Long.parseLong(gifDrawableTransformation.serializer(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = Integer.parseInt(gifDrawableTransformation.serializer(Long.MAX_VALUE));
        for (int i3 = 0; i3 < i2; i3++) {
            String strSerializer = gifDrawableTransformation.serializer(Long.MAX_VALUE);
            int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) strSerializer, ':', 0, false, 6);
            if (iWrite != -1) {
                String string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) strSerializer.substring(0, iWrite)).toString();
                String strSubstring = strSerializer.substring(iWrite + 1);
                String lowerCase = string.toLowerCase(java.util.Locale.ROOT);
                lowerCase.getClass();
                Object arrayList = linkedHashMap.get(lowerCase);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(lowerCase, arrayList);
                }
                ((List) arrayList).add(strSubstring);
            } else {
                DrawableTransformation.serializer((Object) "Unexpected header: ".concat(strSerializer));
                return null;
            }
        }
        return new createBlurEffect8A3gB4(i, j, j2, new getGraphicsDensityui(onMove.serializer(linkedHashMap)), null, null);
    }
}
