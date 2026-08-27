package o;

import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.sentiance.visitessentials.h$c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class store {
    public static final double serializer = Math.sqrt(2.3703703703703702d);
    public final HashSet IconCompatParcelizer;
    public final Rational MediaBrowserCompatMediaItem;
    public final androidx.navigation.NavArgsLazy MediaMetadataCompat;
    public final android.util.Size RatingCompat;
    public final HashMap RemoteActionCompatParcelizer;
    public final FocusMeteringAction read;
    public final Rational write;

    public static Rational serializer(android.util.Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final boolean IconCompatParcelizer(Rational rational, android.util.Size size) {
        Rational rational2 = this.MediaBrowserCompatMediaItem;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
        android.util.Size size2 = setController.MediaMetadataCompat;
        if (AudioTimestampFramePositionIncorrectQuirk.serializer(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalSerializer = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
        if (!AudioTimestampFramePositionIncorrectQuirk.serializer(size, rationalSerializer, size2)) {
            rationalSerializer = AudioTimestampFramePositionIncorrectQuirk.write;
            if (!AudioTimestampFramePositionIncorrectQuirk.serializer(size, rationalSerializer, size2)) {
                rationalSerializer = serializer(size);
            }
        }
        float fFloatValue3 = rationalSerializer.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        if (fFloatValue > fFloatValue2) {
            return fFloatValue2 < fFloatValue3;
        }
        return fFloatValue2 > fFloatValue3;
    }

    public final ArrayList RemoteActionCompatParcelizer(List list, boolean z) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
        map.put(rational, new ArrayList());
        Rational rational2 = AudioTimestampFramePositionIncorrectQuirk.write;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Size size = (android.util.Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (AudioTimestampFramePositionIncorrectQuirk.serializer(size, rational3, setController.MediaMetadataCompat)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalSerializer = serializer(size);
                    arrayList2.add(rationalSerializer);
                    map.put(rationalSerializer, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList<Rational> arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new h$c(1, serializer(this.RatingCompat)));
        ArrayList arrayList4 = new ArrayList();
        for (Rational rational4 : arrayList3) {
            if (!rational4.equals(AudioTimestampFramePositionIncorrectQuirk.write) && !rational4.equals(AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(write(rational4, list2, z));
            }
        }
        return arrayList4;
    }

    public final ArrayList write(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<android.util.Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Size size = (android.util.Size) it.next();
            Rational rational2 = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
            if (AudioTimestampFramePositionIncorrectQuirk.serializer(size, rational, setController.MediaMetadataCompat)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new AudioEncoderIgnoresInputTimestampQuirk(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.IconCompatParcelizer.iterator();
        while (it2.hasNext()) {
            List<android.util.Size> listWrite = write((ImageUtilCodecFailedException) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (android.util.Size size2 : listWrite) {
                    if (!IconCompatParcelizer(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listWrite = arrayList3;
            }
            if (listWrite.isEmpty()) {
                return new ArrayList();
            }
            if (listWrite.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (android.util.Size size3 : arrayList2) {
                    Iterator it3 = listWrite.iterator();
                    while (it3.hasNext()) {
                        if (!read((android.util.Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listWrite.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<android.util.Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (android.util.Size size4 : arrayList5) {
                    Iterator it4 = listWrite.iterator();
                    do {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                    } while (!read((android.util.Size) it4.next(), size4));
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (android.util.Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }

    public final List write(ImageUtilCodecFailedException imageUtilCodecFailedException) {
        Rational rationalSerializer;
        if (!this.IconCompatParcelizer.contains(imageUtilCodecFailedException)) {
            Gson$$ExternalSyntheticBUOutline0.m(imageUtilCodecFailedException, "Invalid child config: ");
            return null;
        }
        HashMap map = this.RemoteActionCompatParcelizer;
        if (map.containsKey(imageUtilCodecFailedException)) {
            List list = (List) map.get(imageUtilCodecFailedException);
            Objects.requireNonNull(list);
            return list;
        }
        ArrayList<android.util.Size> arrayListSerializer = this.MediaMetadataCompat.serializer(imageUtilCodecFailedException);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (android.util.Size size : arrayListSerializer) {
            Iterator it = map2.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalSerializer = null;
                    break;
                }
                rationalSerializer = (Rational) it.next();
                Rational rational = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
            } while (!AudioTimestampFramePositionIncorrectQuirk.serializer(size, rationalSerializer, setController.MediaMetadataCompat));
            if (rationalSerializer != null) {
                android.util.Size size2 = (android.util.Size) map2.get(rationalSerializer);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalSerializer = serializer(size);
            }
            arrayList.add(size);
            map2.put(rationalSerializer, size);
        }
        map.put(imageUtilCodecFailedException, arrayList);
        return arrayList;
    }

    public store(ImageCapture1 imageCapture1, HashSet hashSet) {
        android.util.Size sizeWrite = MediaStoreVideoCannotWrite.write(imageCapture1.MediaMetadataCompat().MediaSessionCompatQueueItem());
        FocusMeteringAction focusMeteringActionMediaMetadataCompat = imageCapture1.MediaMetadataCompat();
        androidx.navigation.NavArgsLazy navArgsLazy = new androidx.navigation.NavArgsLazy(focusMeteringActionMediaMetadataCompat, sizeWrite);
        this.RemoteActionCompatParcelizer = new HashMap();
        this.RatingCompat = sizeWrite;
        Rational rational = ((double) sizeWrite.getWidth()) / ((double) sizeWrite.getHeight()) > serializer ? AudioTimestampFramePositionIncorrectQuirk.write : AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
        sizeWrite.toString();
        Objects.toString(rational);
        setInflatedId.IconCompatParcelizer(3, "ResolutionsMerger");
        this.MediaBrowserCompatMediaItem = rational;
        Rational rational2 = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
        if (rational.equals(rational2)) {
            rational2 = AudioTimestampFramePositionIncorrectQuirk.write;
        } else if (!rational.equals(AudioTimestampFramePositionIncorrectQuirk.write)) {
            Gson$$ExternalSyntheticBUOutline0.m(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.write = rational2;
        this.read = focusMeteringActionMediaMetadataCompat;
        this.IconCompatParcelizer = hashSet;
        this.MediaMetadataCompat = navArgsLazy;
    }

    public static android.graphics.Rect RemoteActionCompatParcelizer(android.util.Size size, android.util.Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalSerializer = serializer(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalSerializer2 = serializer(size);
        if (rationalSerializer.floatValue() == rationalSerializer2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalSerializer.floatValue() > rationalSerializer2.floatValue()) {
                float f = width;
                float fFloatValue = f / rationalSerializer.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rationalSerializer.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean read(android.util.Size size, android.util.Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public final updatePushToken read(ImageUtilCodecFailedException imageUtilCodecFailedException, android.graphics.Rect rect, int i, boolean z) {
        boolean z2;
        android.util.Size size;
        android.util.Size size2;
        Pair pairCreate;
        if (MediaStoreVideoCannotWrite.serializer(i)) {
            z2 = true;
            rect = new android.graphics.Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z2 = false;
        }
        if (z) {
            android.util.Size sizeWrite = MediaStoreVideoCannotWrite.write(rect);
            Iterator it = write(imageUtilCodecFailedException).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(sizeWrite, sizeWrite);
                    break;
                }
                android.util.Size size3 = (android.util.Size) it.next();
                android.util.Size sizeWrite2 = MediaStoreVideoCannotWrite.write(RemoteActionCompatParcelizer(size3, sizeWrite));
                if (!read(sizeWrite2, sizeWrite)) {
                    pairCreate = Pair.create(size3, sizeWrite2);
                    break;
                }
            }
            size = (android.util.Size) pairCreate.first;
            size2 = (android.util.Size) pairCreate.second;
        } else {
            android.util.Size sizeWrite3 = MediaStoreVideoCannotWrite.write(rect);
            List listWrite = write(imageUtilCodecFailedException);
            Iterator it2 = listWrite.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listWrite.iterator();
                    do {
                        if (!it3.hasNext()) {
                            size = sizeWrite3;
                            break;
                        }
                        size = (android.util.Size) it3.next();
                    } while (read(size, sizeWrite3));
                } else {
                    android.util.Size size4 = (android.util.Size) it2.next();
                    Rational rationalSerializer = AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
                    android.util.Size size5 = setController.MediaMetadataCompat;
                    if (!AudioTimestampFramePositionIncorrectQuirk.serializer(sizeWrite3, rationalSerializer, size5)) {
                        rationalSerializer = AudioTimestampFramePositionIncorrectQuirk.write;
                        if (!AudioTimestampFramePositionIncorrectQuirk.serializer(sizeWrite3, rationalSerializer, size5)) {
                            rationalSerializer = serializer(sizeWrite3);
                        }
                    }
                    if (!IconCompatParcelizer(rationalSerializer, size4) && !read(size4, sizeWrite3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = RemoteActionCompatParcelizer(sizeWrite3, size);
            size2 = size;
        }
        return z2 ? new updatePushToken(new android.graphics.Rect(rect.top, rect.left, rect.bottom, rect.right), new android.util.Size(size2.getHeight(), size2.getWidth()), size) : new updatePushToken(rect, size2, size);
    }
}
