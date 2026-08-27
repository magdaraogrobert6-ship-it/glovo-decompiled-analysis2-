package com.ui.common.widget.calendar;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector;
import com.logistics.rider.glovo.R;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o.BrazeExternalSyntheticLambda28;
import o.BundleUtils;
import o.DataStoreUtils;
import o.DataStoreUtilsc;
import o.DataStoreUtilsd;
import o.DrawableTransformation;
import o.accessgetInstancedelegatecp;
import o.brazelog;
import o.div7Ah8Wj8;
import o.getCieXyz;
import o.getSdkDebuggerCallbackandroid_sdk_base_release;
import o.instance_delegatelambda0;
import o.jsonStringToList;
import o.jsonStringToStringMap;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;
import o.setSdkDebuggerCallbackandroid_sdk_base_release;
import o.stringToMapdefault;
import o.wdefault;
import o.wlambda0;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultCalendarManager extends wdefault {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final div7Ah8Wj8 IconCompatParcelizer;
    public setSdkDebuggerCallbackandroid_sdk_base_release MediaDescriptionCompat;
    public final jsonStringToList read;
    public final BrazeExternalSyntheticLambda28 serializer;

    public DefaultCalendarManager(div7Ah8Wj8 div7ah8wj8, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, jsonStringToList jsonstringtolist) {
        brazeExternalSyntheticLambda28.getClass();
        jsonstringtolist.getClass();
        this.IconCompatParcelizer = div7ah8wj8;
        this.serializer = brazeExternalSyntheticLambda28;
        this.read = jsonstringtolist;
        this.MediaDescriptionCompat = new setSdkDebuggerCallbackandroid_sdk_base_release(instance_delegatelambda0.write);
    }

    @Override // o.wdefault
    public final void read() {
        int i = 2 % 2;
        int i2 = RatingCompat + 27;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        read(this.MediaMetadataCompat);
        int i4 = RatingCompat + 37;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.wdefault
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 67;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            read(wdefault.serializer());
        } else {
            read(wdefault.serializer());
            int i3 = 4 / 0;
        }
    }

    @Override // o.wdefault
    public final boolean IconCompatParcelizer() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = RatingCompat + 117;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, wdefault.serializer()}, getCieXyz.write())).booleanValue();
        } else {
            zBooleanValue = !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, wdefault.serializer()}, getCieXyz.write())).booleanValue();
        }
        int i3 = RatingCompat + 49;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    @Override // o.wdefault
    public final String RatingCompat() {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = this.serializer;
        if (brazeExternalSyntheticLambda28.RemoteActionCompatParcelizer != 12) {
            return brazeExternalSyntheticLambda28.read.IconCompatParcelizer(R.string.calendar_component_date_today);
        }
        String strIconCompatParcelizer = brazeExternalSyntheticLambda28.read.IconCompatParcelizer(R.string.calendar_component_date_today);
        int i4 = MediaBrowserCompatMediaItem + 51;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strIconCompatParcelizer;
    }

    @Override // o.wdefault
    public final void RemoteActionCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 105;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Iterator it = ((BundleUtils) this.MediaDescriptionCompat.serializer.get(i)).IconCompatParcelizer.iterator();
        while (!(!it.hasNext())) {
            getSdkDebuggerCallbackandroid_sdk_base_release getsdkdebuggercallbackandroid_sdk_base_release = (getSdkDebuggerCallbackandroid_sdk_base_release) it.next();
            if (getsdkdebuggercallbackandroid_sdk_base_release.write.getDayOfWeek() == this.MediaMetadataCompat.getDayOfWeek()) {
                LocalDate localDateSerializer = getsdkdebuggercallbackandroid_sdk_base_release.write;
                if (localDateSerializer.isAfter(wdefault.serializer())) {
                    int i5 = RatingCompat + 29;
                    MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        wdefault.serializer();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    localDateSerializer = wdefault.serializer();
                }
                read(localDateSerializer);
                return;
            }
        }
        DrawableTransformation.write("Collection contains no element matching the predicate.");
        int i6 = MediaBrowserCompatMediaItem + 109;
        RatingCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    @Override // o.wdefault
    public final void RemoteActionCompatParcelizer(LocalDate localDate) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 49;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        localDate.getClass();
        setSdkDebuggerCallbackandroid_sdk_base_release setsdkdebuggercallbackandroid_sdk_base_release = this.MediaDescriptionCompat;
        if (setsdkdebuggercallbackandroid_sdk_base_release != null) {
            int i4 = MediaBrowserCompatMediaItem + 11;
            RatingCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                setsdkdebuggercallbackandroid_sdk_base_release.serializer.isEmpty();
                throw null;
            }
            if (setsdkdebuggercallbackandroid_sdk_base_release.serializer.isEmpty()) {
                return;
            }
        }
        for (BundleUtils bundleUtils : setsdkdebuggercallbackandroid_sdk_base_release.serializer) {
            boolean z = bundleUtils.write;
            ArrayList arrayList = bundleUtils.IconCompatParcelizer;
            if (z) {
                int i5 = MediaBrowserCompatMediaItem + 123;
                RatingCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (arrayList.isEmpty()) {
                    int i7 = RatingCompat + 113;
                    MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    Iterator it = arrayList.iterator();
                    while (!(!it.hasNext())) {
                        getSdkDebuggerCallbackandroid_sdk_base_release getsdkdebuggercallbackandroid_sdk_base_release = (getSdkDebuggerCallbackandroid_sdk_base_release) it.next();
                        if (getsdkdebuggercallbackandroid_sdk_base_release.write.equals(localDate) && !(!getsdkdebuggercallbackandroid_sdk_base_release.RemoteActionCompatParcelizer) && !getsdkdebuggercallbackandroid_sdk_base_release.serializer) {
                            read(localDate);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // o.wdefault
    public final void write() {
        int i = 2 % 2;
        long time = wdefault.serializer().plusDays(1).toDate().getTime();
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        builder.read = Long.valueOf(this.MediaMetadataCompat.toDate().getTime());
        builder.MediaSessionCompatQueueItem = new DateValidatorPointBackward(time);
        CalendarConstraints calendarConstraintsSerializer = builder.serializer();
        MaterialDatePicker.Builder builder2 = new MaterialDatePicker.Builder(new SingleDateSelector());
        builder2.RemoteActionCompatParcelizer = calendarConstraintsSerializer;
        MaterialDatePicker materialDatePicker = builder2.read();
        materialDatePicker.onRequestPermissionsResult.add(new DataStoreUtils(new TncContentKt$$ExternalSyntheticLambda2(28, this)));
        materialDatePicker.RemoteActionCompatParcelizer(this.IconCompatParcelizer, "DefaultCalendarManager.MaterialDatePicker");
        int i2 = MediaBrowserCompatMediaItem + 63;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0111  */
    public final void read(LocalDate localDate) {
        boolean z;
        int i = 2 % 2;
        localDate.getClass();
        this.MediaMetadataCompat = localDate;
        LocalDate localDateSerializer = wdefault.serializer();
        jsonStringToList jsonstringtolist = this.read;
        jsonstringtolist.getClass();
        if (localDateSerializer.isBefore(localDate)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Selected date must be today or before today");
            return;
        }
        ArrayList<stringToMapdefault> arrayList = new ArrayList();
        jsonStringToStringMap jsonstringtostringmap = jsonstringtolist.serializer;
        LocalDate localDateMinusWeeks = localDate.minusWeeks(2);
        localDateMinusWeeks.getClass();
        DataStoreUtilsd dataStoreUtilsdSerializer = jsonstringtostringmap.serializer(localDateMinusWeeks, jsonStringToStringMap.write);
        while (true) {
            boolean z2 = false;
            if (arrayList.size() >= 5) {
                break;
            }
            LocalDate localDate2 = (LocalDate) onContentCardDismissed.read((List) dataStoreUtilsdSerializer.write);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{localDate2, localDateSerializer}, getCieXyz.write())).booleanValue() && !localDate2.isBefore(localDateSerializer)) {
                break;
            }
            if (arrayList.size() == 2) {
                int i2 = RatingCompat + 97;
                MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                z2 = true;
            }
            arrayList.add(new stringToMapdefault(dataStoreUtilsdSerializer, z2));
            dataStoreUtilsdSerializer = DataStoreUtilsc.read(dataStoreUtilsdSerializer);
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        int i4 = RatingCompat + 39;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        for (stringToMapdefault stringtomapdefault : arrayList) {
            ArrayList<LocalDate> arrayList3 = stringtomapdefault.RemoteActionCompatParcelizer.write;
            ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
            for (LocalDate localDate3 : arrayList3) {
                wlambda0 wlambda0Var = brazelog.Companion;
                int dayOfWeek = localDate3.getDayOfWeek();
                wlambda0Var.getClass();
                String str = this.serializer.read(wlambda0.IconCompatParcelizer(dayOfWeek));
                String str2 = String.format("%d", Arrays.copyOf(new Object[]{Integer.valueOf(localDate3.getDayOfMonth())}, 1));
                if (localDate3.isBefore(wdefault.serializer())) {
                    z = true;
                } else {
                    int i6 = MediaBrowserCompatMediaItem + 23;
                    RatingCompat = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    if (localDate3.equals(wdefault.serializer())) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                arrayList4.add(new getSdkDebuggerCallbackandroid_sdk_base_release(localDate3, str, str2, z, localDate3.equals(this.MediaMetadataCompat)));
            }
            arrayList2.add(new BundleUtils(arrayList4, stringtomapdefault.IconCompatParcelizer));
        }
        setSdkDebuggerCallbackandroid_sdk_base_release setsdkdebuggercallbackandroid_sdk_base_release = new setSdkDebuggerCallbackandroid_sdk_base_release(arrayList2);
        this.MediaDescriptionCompat = setsdkdebuggercallbackandroid_sdk_base_release;
        this.MediaSessionCompatQueueItem.invoke(setsdkdebuggercallbackandroid_sdk_base_release);
        this.RemoteActionCompatParcelizer.invoke(this.MediaMetadataCompat);
    }
}
