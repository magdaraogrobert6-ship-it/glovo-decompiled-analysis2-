package o;

import com.mapbox.common.location.AndroidDeviceLocationProvider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FontMuC2MFsdefault {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static int RatingCompat(List list, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i6 = 0;
        float f = 0.0f;
        for (int i7 = 0; i7 < size; i7++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i7);
            float fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
            int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i);
            if (fFloatValue == 0.0f) {
                i6 += iMinIntrinsicHeight;
            } else if (fFloatValue > 0.0f) {
                int i8 = RemoteActionCompatParcelizer + 9;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                f += fFloatValue;
                iMax = Math.max(iMax, Math.round(iMinIntrinsicHeight / fFloatValue));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i6;
    }

    public static int RemoteActionCompatParcelizer(List list, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (list.isEmpty()) {
            int i6 = RemoteActionCompatParcelizer + 15;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i8 = 0;
        float f = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i9);
            float fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
            int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
            if (fFloatValue == 0.0f) {
                int i10 = RemoteActionCompatParcelizer + 41;
                write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i8 = i10 % 2 == 0 ? i8 << iMaxIntrinsicHeight : i8 + iMaxIntrinsicHeight;
            } else if (fFloatValue > 0.0f) {
                f += fFloatValue;
                iMax = Math.max(iMax, Math.round(iMaxIntrinsicHeight / fFloatValue));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i8;
    }

    public static int read(List list, int i, int i2) {
        int i3 = 2 % 2;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = RemoteActionCompatParcelizer + 77;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i5);
            float fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
            int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
            if (fFloatValue == 0.0f) {
                int i8 = write + 89;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i8 % 2 != 0 ? i4 << iMaxIntrinsicWidth : i4 + iMaxIntrinsicWidth;
            } else if (fFloatValue > 0.0f) {
                f += fFloatValue;
                iMax = Math.max(iMax, Math.round(iMaxIntrinsicWidth / fFloatValue));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i4;
    }

    public static int serializer(List list, int i, int i2) {
        int i3 = 2 % 2;
        if (list.isEmpty()) {
            int i4 = write + 55;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i6 = 0;
        float f = 0.0f;
        for (int i7 = 0; i7 < size; i7++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i7);
            float fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
            int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i);
            if (fFloatValue == 0.0f) {
                int i8 = write + 93;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i6 = i8 % 2 != 0 ? i6 % iMinIntrinsicWidth : i6 + iMinIntrinsicWidth;
            } else if (fFloatValue > 0.0f) {
                f += fFloatValue;
                iMax = Math.max(iMax, Math.round(iMinIntrinsicWidth / fFloatValue));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i6;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00ad A[DONT_INVERT, PHI: r12
  0x00ad: PHI (r12v6 androidx.compose.ui.layout.IntrinsicMeasurable) = (r12v5 androidx.compose.ui.layout.IntrinsicMeasurable), (r12v9 androidx.compose.ui.layout.IntrinsicMeasurable) binds: [B:15:0x00ab, B:12:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x00af  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c5 A[PHI: r13
  0x00c5: PHI (r13v9 float) = (r13v5 float), (r13v13 float) binds: [B:15:0x00ab, B:12:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00c9  */
    public static int IconCompatParcelizer(List list, int i, int i2) {
        androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable;
        float fFloatValue;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 17;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (list.isEmpty()) {
            int i7 = write + 21;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int i9 = 0;
        int iMax = 0;
        float f = 0.0f;
        while (i9 < size) {
            int i10 = write + 45;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i9);
                fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
                if (fFloatValue == 0.0f) {
                    if (i == Integer.MAX_VALUE) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i3 = i - iMin;
                    }
                    int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), i3);
                    iMin += iMin2;
                    iMax = Math.max(iMax, intrinsicMeasurable.maxIntrinsicHeight(iMin2));
                } else if (fFloatValue > 0.0f) {
                    f += fFloatValue;
                }
            } else {
                intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i9);
                fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
                if (fFloatValue == 0.0f) {
                    if (i == Integer.MAX_VALUE) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i3 = i - iMin;
                    }
                    int iMin3 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), i3);
                    iMin += iMin3;
                    iMax = Math.max(iMax, intrinsicMeasurable.maxIntrinsicHeight(iMin3));
                } else if (fFloatValue > 0.0f) {
                    f += fFloatValue;
                }
            }
            i9++;
            int i11 = RemoteActionCompatParcelizer + 113;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = 4 % 5;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i13);
            float fFloatValue2 = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable2)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
            if (fFloatValue2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.maxIntrinsicHeight(iRound != Integer.MAX_VALUE ? Math.round(iRound * fFloatValue2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int MediaBrowserCompatMediaItem(List list, int i, int i2) {
        int iRound;
        int i3 = 2 % 2;
        if (list.isEmpty()) {
            int i4 = write + 121;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i6);
            float fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
            if (fFloatValue == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.maxIntrinsicWidth(iMin2));
            } else if (fFloatValue > 0.0f) {
                f += fFloatValue;
                int i7 = RemoteActionCompatParcelizer + 125;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        }
        if (f == 0.0f) {
            iRound = 0;
        } else if (i == Integer.MAX_VALUE) {
            int i9 = RemoteActionCompatParcelizer + 109;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                throw null;
            }
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(i - iMin, 0) / f);
        }
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i10);
            float fFloatValue2 = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable2)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
            if (fFloatValue2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.maxIntrinsicWidth(iRound != Integer.MAX_VALUE ? Math.round(iRound * fFloatValue2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int MediaMetadataCompat(List list, int i, int i2) {
        int iRound;
        int iRound2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 77;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (list.isEmpty()) {
            int i7 = write + 11;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 != 0 ? 1 : 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i8);
            float fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
            if (fFloatValue == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    int i9 = write + 69;
                    RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - iMin;
                }
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), i3);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.minIntrinsicWidth(iMin2));
            } else if (fFloatValue > 0.0f) {
                f += fFloatValue;
            }
        }
        if (f == 0.0f) {
            iRound = 0;
        } else if (i == Integer.MAX_VALUE) {
            int i11 = write + 11;
            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(i - iMin, 0) / f);
        }
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i13);
            float fFloatValue2 = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable2)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
            if (fFloatValue2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fFloatValue2);
                    int i14 = RemoteActionCompatParcelizer + 81;
                    write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                int iMax2 = Math.max(iMax, intrinsicMeasurable2.minIntrinsicWidth(iRound2));
                int i16 = RemoteActionCompatParcelizer + 119;
                write = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
                iMax = iMax2;
            }
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x0119  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0129 A[SYNTHETIC] */
    public static int write(List list, int i, int i2) {
        int i3;
        int iMin;
        int size;
        int i4;
        int iMax;
        float f;
        int size2;
        androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable;
        float fFloatValue;
        int i5;
        int i6;
        int iRound;
        int i7;
        float f2;
        androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2;
        float fFloatValue2;
        int i8;
        int i9 = 2 % 2;
        int i10 = write + 31;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iRound2 = 0;
        if (i10 % 2 != 0) {
            if (!list.isEmpty()) {
                i3 = 1;
                iMin = Math.min((list.size() - 1) * i2, i);
                List list2 = list;
                size = list2.size();
                iMax = 0;
                f = 0.0f;
                for (i4 = 0; i4 < size; i4++) {
                    intrinsicMeasurable2 = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i4);
                    fFloatValue2 = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable2)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
                    if (fFloatValue2 == 0.0f) {
                        if (i == Integer.MAX_VALUE) {
                            i8 = Integer.MAX_VALUE;
                        } else {
                            i8 = i - iMin;
                        }
                        int iMin2 = Math.min(intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE), i8);
                        iMin += iMin2;
                        iMax = Math.max(iMax, intrinsicMeasurable2.minIntrinsicHeight(iMin2));
                    } else if (fFloatValue2 > 0.0f) {
                        f += fFloatValue2;
                    }
                }
                if (f != 0.0f) {
                    if (i == Integer.MAX_VALUE) {
                        int i11 = RemoteActionCompatParcelizer + 105;
                        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        iRound2 = Integer.MAX_VALUE;
                    } else {
                        iRound2 = Math.round(Math.max(i - iMin, 0) / f);
                        int i13 = write + 107;
                        RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                    }
                }
                size2 = list2.size();
                while (i3 < size2) {
                    int i15 = RemoteActionCompatParcelizer + 31;
                    write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i3);
                    fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
                    if (fFloatValue > 0.0f) {
                        i5 = RemoteActionCompatParcelizer;
                        i6 = i5 + 63;
                        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (iRound2 != Integer.MAX_VALUE) {
                            i7 = i5 + 15;
                            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i7 % 2 == 0) {
                                f2 = iRound2 + fFloatValue;
                            } else {
                                f2 = iRound2 * fFloatValue;
                            }
                            iRound = Math.round(f2);
                        } else {
                            iRound = Integer.MAX_VALUE;
                        }
                        iMax = Math.max(iMax, intrinsicMeasurable.minIntrinsicHeight(iRound));
                    }
                    i3++;
                }
                return iMax;
            }
            return 0;
        }
        if (!list.isEmpty()) {
            i3 = 0;
            iMin = Math.min((list.size() - 1) * i2, i);
            List list3 = list;
            size = list3.size();
            iMax = 0;
            f = 0.0f;
            while (i4 < size) {
                intrinsicMeasurable2 = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i4);
                fFloatValue2 = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable2)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
                if (fFloatValue2 == 0.0f) {
                    if (i == Integer.MAX_VALUE) {
                        i8 = Integer.MAX_VALUE;
                    } else {
                        i8 = i - iMin;
                    }
                    int iMin3 = Math.min(intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE), i8);
                    iMin += iMin3;
                    iMax = Math.max(iMax, intrinsicMeasurable2.minIntrinsicHeight(iMin3));
                } else if (fFloatValue2 > 0.0f) {
                    f += fFloatValue2;
                }
            }
            if (f != 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    int i17 = RemoteActionCompatParcelizer + 105;
                    write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    iRound2 = Integer.MAX_VALUE;
                } else {
                    iRound2 = Math.round(Math.max(i - iMin, 0) / f);
                    int i19 = write + 107;
                    RemoteActionCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                }
            }
            size2 = list3.size();
            while (i3 < size2) {
                int i111 = RemoteActionCompatParcelizer + 31;
                write = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i112 = i111 % 2;
                intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) list.get(i3);
                fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(intrinsicMeasurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
                if (fFloatValue > 0.0f) {
                    i5 = RemoteActionCompatParcelizer;
                    i6 = i5 + 63;
                    write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (iRound2 != Integer.MAX_VALUE) {
                        i7 = i5 + 15;
                        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            f2 = iRound2 + fFloatValue;
                        } else {
                            f2 = iRound2 * fFloatValue;
                        }
                        iRound = Math.round(f2);
                    } else {
                        iRound = Integer.MAX_VALUE;
                    }
                    iMax = Math.max(iMax, intrinsicMeasurable.minIntrinsicHeight(iRound));
                }
                i3++;
            }
            return iMax;
        }
        return 0;
    }

    public static final Map RemoteActionCompatParcelizer(Map map) {
        int i = 2 % 2;
        if (map == null || map.isEmpty()) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                if (((CharSequence) value).length() > 0) {
                    int i2 = RemoteActionCompatParcelizer + 29;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        linkedHashMap.put(str, value);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    linkedHashMap.put(str, value);
                } else {
                    continue;
                }
            } else if (value instanceof Integer) {
                int i3 = RemoteActionCompatParcelizer + 57;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                linkedHashMap.put(str, String.valueOf(((Number) value).intValue()));
                int i5 = write + 71;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else if (value instanceof Double) {
                int i7 = write + 99;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                linkedHashMap.put(str, String.valueOf(((Number) value).doubleValue()));
            } else if (value instanceof Long) {
                linkedHashMap.put(str, String.valueOf(((Number) value).longValue()));
            } else if (value instanceof Boolean) {
                linkedHashMap.put(str, String.valueOf(((Boolean) value).booleanValue()));
            } else {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Unsupported type for key: " + str + ", value: " + value, new Object[0]);
            }
        }
        return linkedHashMap;
    }
}
