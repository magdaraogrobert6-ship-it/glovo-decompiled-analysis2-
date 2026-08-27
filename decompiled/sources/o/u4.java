package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class u4 extends wdefault {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final jsonStringToList IconCompatParcelizer;
    public final BrazeExternalSyntheticLambda28 read;
    public setSdkDebuggerCallbackandroid_sdk_base_release serializer = new setSdkDebuggerCallbackandroid_sdk_base_release(instance_delegatelambda0.write);

    @Override // o.wdefault
    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // o.wdefault
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 65;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.wdefault
    public final void write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public u4(BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, jsonStringToList jsonstringtolist) {
        this.read = brazeExternalSyntheticLambda28;
        this.IconCompatParcelizer = jsonstringtolist;
    }

    @Override // o.wdefault
    public final void read() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 9;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write(this.MediaMetadataCompat);
        int i4 = MediaBrowserCompatMediaItem + 109;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.wdefault
    public final void RemoteActionCompatParcelizer(int i) {
        getSdkDebuggerCallbackandroid_sdk_base_release getsdkdebuggercallbackandroid_sdk_base_release;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 121;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Iterator it = ((BundleUtils) this.serializer.serializer.get(i)).IconCompatParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                DrawableTransformation.write("Collection contains no element matching the predicate.");
                return;
            }
            int i5 = MediaBrowserCompatMediaItem + 23;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getsdkdebuggercallbackandroid_sdk_base_release = (getSdkDebuggerCallbackandroid_sdk_base_release) it.next();
                int i6 = 20 / 0;
                if (getsdkdebuggercallbackandroid_sdk_base_release.write.getDayOfWeek() == this.MediaMetadataCompat.getDayOfWeek()) {
                    break;
                }
            } else {
                getsdkdebuggercallbackandroid_sdk_base_release = (getSdkDebuggerCallbackandroid_sdk_base_release) it.next();
                if (getsdkdebuggercallbackandroid_sdk_base_release.write.getDayOfWeek() == this.MediaMetadataCompat.getDayOfWeek()) {
                    break;
                }
            }
        }
        int i7 = MediaBrowserCompatMediaItem + 123;
        RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        write(getsdkdebuggercallbackandroid_sdk_base_release.write);
        int i9 = MediaBrowserCompatMediaItem + 79;
        RatingCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x005b A[SYNTHETIC] */
    @Override // o.wdefault
    public final void RemoteActionCompatParcelizer(LocalDate localDate) {
        getSdkDebuggerCallbackandroid_sdk_base_release getsdkdebuggercallbackandroid_sdk_base_release;
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 83;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        localDate.getClass();
        setSdkDebuggerCallbackandroid_sdk_base_release setsdkdebuggercallbackandroid_sdk_base_release = this.serializer;
        if (setsdkdebuggercallbackandroid_sdk_base_release != null) {
            int i5 = MediaBrowserCompatMediaItem + 117;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (setsdkdebuggercallbackandroid_sdk_base_release.serializer.isEmpty()) {
                return;
            }
        }
        for (BundleUtils bundleUtils : setsdkdebuggercallbackandroid_sdk_base_release.serializer) {
            int i7 = RatingCompat + 57;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            boolean z = bundleUtils.write;
            ArrayList arrayList = bundleUtils.IconCompatParcelizer;
            if (z) {
                if (arrayList.isEmpty()) {
                    int i9 = RatingCompat + 57;
                    MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int i11 = MediaBrowserCompatMediaItem + 115;
                        RatingCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i11 % 2 == 0) {
                            getsdkdebuggercallbackandroid_sdk_base_release = (getSdkDebuggerCallbackandroid_sdk_base_release) it.next();
                            int i12 = 18 / 0;
                            if (getsdkdebuggercallbackandroid_sdk_base_release.write.equals(localDate)) {
                                int i13 = MediaBrowserCompatMediaItem + 81;
                                RatingCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i14 = i13 % 2;
                                if (getsdkdebuggercallbackandroid_sdk_base_release.RemoteActionCompatParcelizer) {
                                    i = RatingCompat + 57;
                                    MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i % 2 == 0) {
                                        boolean z2 = getsdkdebuggercallbackandroid_sdk_base_release.serializer;
                                        throw null;
                                    }
                                    if (!(!getsdkdebuggercallbackandroid_sdk_base_release.serializer)) {
                                        write(localDate);
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            getsdkdebuggercallbackandroid_sdk_base_release = (getSdkDebuggerCallbackandroid_sdk_base_release) it.next();
                            if (getsdkdebuggercallbackandroid_sdk_base_release.write.equals(localDate)) {
                                int i15 = MediaBrowserCompatMediaItem + 81;
                                RatingCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i16 = i15 % 2;
                                if (getsdkdebuggercallbackandroid_sdk_base_release.RemoteActionCompatParcelizer) {
                                    i = RatingCompat + 57;
                                    MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i % 2 == 0) {
                                        boolean z3 = getsdkdebuggercallbackandroid_sdk_base_release.serializer;
                                        throw null;
                                    }
                                    if (!(!getsdkdebuggercallbackandroid_sdk_base_release.serializer)) {
                                        write(localDate);
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void write(LocalDate localDate) {
        int i = 2 % 2;
        localDate.getClass();
        this.MediaMetadataCompat = localDate;
        LocalDate localDateSerializer = wdefault.serializer();
        jsonStringToList jsonstringtolist = this.IconCompatParcelizer;
        jsonstringtolist.getClass();
        LocalDate localDatePlusWeeks = localDateSerializer.plusWeeks(2);
        ArrayList<stringToMapdefault> arrayList = new ArrayList();
        jsonStringToStringMap jsonstringtostringmap = jsonstringtolist.serializer;
        LocalDate localDateMinusWeeks = localDate.minusWeeks(2);
        localDateMinusWeeks.getClass();
        DataStoreUtilsd dataStoreUtilsdSerializer = jsonstringtostringmap.serializer(localDateMinusWeeks, jsonStringToStringMap.IconCompatParcelizer);
        int i2 = RatingCompat + 29;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        while (true) {
            ArrayList<LocalDate> arrayList2 = dataStoreUtilsdSerializer.write;
            if (arrayList.size() >= 3) {
                break;
            }
            int i4 = MediaBrowserCompatMediaItem + 45;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                localDatePlusWeeks.getClass();
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(LocalDate) onContentCardDismissed.read((List) arrayList2), localDatePlusWeeks}, getCieXyz.write())).booleanValue();
                throw null;
            }
            localDatePlusWeeks.getClass();
            LocalDate localDate2 = (LocalDate) onContentCardDismissed.read((List) arrayList2);
            if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{localDate2, localDatePlusWeeks}, getCieXyz.write())).booleanValue()) && !localDate2.isBefore(localDatePlusWeeks)) {
                break;
            }
            if (!arrayList2.isEmpty()) {
                for (LocalDate localDate3 : arrayList2) {
                    if (localDate3.isBefore(localDatePlusWeeks) && localDate3.isAfter(localDateSerializer.minusDays(1))) {
                        arrayList.add(new stringToMapdefault(dataStoreUtilsdSerializer, arrayList2.contains(localDate)));
                        break;
                    }
                }
            } else {
                int i5 = RatingCompat + 15;
                MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            dataStoreUtilsdSerializer = DataStoreUtilsc.read(dataStoreUtilsdSerializer);
        }
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (stringToMapdefault stringtomapdefault : arrayList) {
            ArrayList<LocalDate> arrayList4 = stringtomapdefault.RemoteActionCompatParcelizer.write;
            ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList4, 10));
            for (LocalDate localDate4 : arrayList4) {
                wlambda0 wlambda0Var = brazelog.Companion;
                int dayOfWeek = localDate4.getDayOfWeek();
                wlambda0Var.getClass();
                arrayList5.add(new getSdkDebuggerCallbackandroid_sdk_base_release(localDate4, this.read.read(wlambda0.IconCompatParcelizer(dayOfWeek)), String.format(java.util.Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(localDate4.getDayOfMonth())}, 1)), (!(localDate4.isAfter(wdefault.serializer()) ^ true) && localDate4.isBefore(wdefault.serializer().plusWeeks(2))) || localDate4.equals(wdefault.serializer()), localDate4.equals(this.MediaMetadataCompat)));
            }
            arrayList3.add(new BundleUtils(arrayList5, stringtomapdefault.IconCompatParcelizer));
        }
        setSdkDebuggerCallbackandroid_sdk_base_release setsdkdebuggercallbackandroid_sdk_base_release = new setSdkDebuggerCallbackandroid_sdk_base_release(arrayList3);
        this.serializer = setsdkdebuggercallbackandroid_sdk_base_release;
        this.MediaSessionCompatQueueItem.invoke(setsdkdebuggercallbackandroid_sdk_base_release);
        this.RemoteActionCompatParcelizer.invoke(this.MediaMetadataCompat);
    }
}
