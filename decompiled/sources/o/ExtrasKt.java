package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Parser;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import io.grpc.internal.SharedResourcePool;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import okhttp3.FormBody;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtrasKt extends androidx.lifecycle.ViewModel {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final BrazeExternalSyntheticLambda28 IconCompatParcelizer;
    public final BrazeLogger MediaBrowserCompatMediaItem;
    public final SharedResourcePool MediaDescriptionCompat;
    public final SharedResourcePool MediaMetadataCompat;
    public final SharedResourcePool MediaSessionCompatQueueItem;
    public final Parser.Pair RatingCompat;
    public final FormBody.Builder RemoteActionCompatParcelizer;
    public final NetworkErrorMapperImpl read;
    public final subscribeToBannersDismissedEventandroid_sdk_base_release serializer;
    public final androidx.lifecycle.BlockRunner write;

    public final SharedResourcePool IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 17;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SharedResourcePool sharedResourcePool = this.MediaSessionCompatQueueItem;
        int i5 = i2 + 57;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return sharedResourcePool;
        }
        throw null;
    }

    public final SharedResourcePool read() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 27;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaDescriptionCompat;
        }
        throw null;
    }

    public final SharedResourcePool serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        SharedResourcePool sharedResourcePool = this.MediaMetadataCompat;
        int i5 = i3 + 23;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return sharedResourcePool;
    }

    public final BrazeLogger write() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 41;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        BrazeLogger brazeLogger = this.MediaBrowserCompatMediaItem;
        int i5 = i2 + 47;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return brazeLogger;
    }

    public ExtrasKt(subscribeToBannersDismissedEventandroid_sdk_base_release subscribetobannersdismissedeventandroid_sdk_base_release, androidx.lifecycle.BlockRunner blockRunner, NetworkErrorMapperImpl networkErrorMapperImpl, Parser.Pair pair, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, FormBody.Builder builder, SharedResourcePool sharedResourcePool, SharedResourcePool sharedResourcePool2, SharedResourcePool sharedResourcePool3) {
        subscribetobannersdismissedeventandroid_sdk_base_release.getClass();
        blockRunner.getClass();
        networkErrorMapperImpl.getClass();
        pair.getClass();
        brazeExternalSyntheticLambda28.getClass();
        builder.getClass();
        sharedResourcePool.getClass();
        sharedResourcePool2.getClass();
        sharedResourcePool3.getClass();
        this.serializer = subscribetobannersdismissedeventandroid_sdk_base_release;
        this.write = blockRunner;
        this.read = networkErrorMapperImpl;
        this.RatingCompat = pair;
        this.IconCompatParcelizer = brazeExternalSyntheticLambda28;
        this.RemoteActionCompatParcelizer = builder;
        this.MediaMetadataCompat = sharedResourcePool;
        this.MediaSessionCompatQueueItem = sharedResourcePool2;
        this.MediaDescriptionCompat = sharedResourcePool3;
        this.MediaBrowserCompatMediaItem = new BrazeLogger(initializeComponents.write);
    }

    public final void serializer(LocalDate localDate) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 77;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        localDate.getClass();
        IconCompatParcelizer(localDate);
        int i4 = PlaybackStateCompatCustomAction + 85;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IconCompatParcelizer(LocalDate localDate) {
        int i = 2 % 2;
        localDate.getClass();
        r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new AuthRepository$logoutUser$2(this, localDate, null, 26));
        int i2 = PlaybackStateCompatCustomAction + 83;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 75;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        subscribeToBannersDismissedEventandroid_sdk_base_release subscribetobannersdismissedeventandroid_sdk_base_release = this.serializer;
        subscribetobannersdismissedeventandroid_sdk_base_release.read.IconCompatParcelizer("History", null);
        subscribetobannersdismissedeventandroid_sdk_base_release.IconCompatParcelizer.getClass();
        int i4 = ParcelableVolumeInfo + 121;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [o.ExtrasKey] */
    /* JADX WARN: Type inference failed for: r8v1, types: [o.ExtrasKey] */
    public static final isRendererInitialised read(final ExtrasKt extrasKt, final z7ExternalSyntheticLambda4 z7externalsyntheticlambda4) {
        setAccuracyRadius setaccuracyradius;
        int i;
        String str;
        int i2;
        int i3;
        Iterator it;
        Iterator it2;
        String strSerializer;
        int i4;
        int i5;
        int i6;
        String strSerializer2;
        int i7 = 2;
        int i8 = 2 % 2;
        Parser.Pair pair = extrasKt.RatingCompat;
        List list = z7externalsyntheticlambda4.write;
        publishError publisherror = (publishError) pair.RemoteActionCompatParcelizer;
        list.getClass();
        List list2 = list;
        int i9 = 10;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it3 = list2.iterator();
        while (true) {
            final int i10 = 0;
            isRendererInitialised isrendererinitialised = null;
            final int i11 = 1;
            if (!it3.hasNext()) {
                nowInSecondsPrecise nowinsecondsprecise = new nowInSecondsPrecise(arrayList);
                BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = extrasKt.IconCompatParcelizer;
                zcExternalSyntheticLambda0 zcexternalsyntheticlambda0 = z7externalsyntheticlambda4.serializer;
                ?? r7 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(extrasKt) { // from class: o.ExtrasKey
                    private static int read = 0;
                    private static int write = 1;
                    public final /* synthetic */ ExtrasKt serializer;

                    {
                        this.serializer = extrasKt;
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i12 = 2 % 2;
                        int i13 = read + 65;
                        write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            throw null;
                        }
                        int i14 = i10;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        z7ExternalSyntheticLambda4 z7externalsyntheticlambda5 = z7externalsyntheticlambda4;
                        ExtrasKt extrasKt2 = this.serializer;
                        if (i14 != 0) {
                            zcExternalSyntheticLambda0 zcexternalsyntheticlambda1 = z7externalsyntheticlambda5.serializer;
                            if (zcexternalsyntheticlambda1 != null) {
                                extrasKt2.MediaMetadataCompat.serializer(zcexternalsyntheticlambda1.serializer);
                            }
                            return createfromparcel2;
                        }
                        zcExternalSyntheticLambda0 zcexternalsyntheticlambda2 = z7externalsyntheticlambda5.serializer;
                        if (zcexternalsyntheticlambda2 != null) {
                            extrasKt2.MediaMetadataCompat.serializer(zcexternalsyntheticlambda2.serializer);
                        }
                        int i15 = write + 17;
                        read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        return createfromparcel2;
                    }
                };
                ?? r8 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(extrasKt) { // from class: o.ExtrasKey
                    private static int read = 0;
                    private static int write = 1;
                    public final /* synthetic */ ExtrasKt serializer;

                    {
                        this.serializer = extrasKt;
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i12 = 2 % 2;
                        int i13 = read + 65;
                        write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            throw null;
                        }
                        int i14 = i11;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        z7ExternalSyntheticLambda4 z7externalsyntheticlambda5 = z7externalsyntheticlambda4;
                        ExtrasKt extrasKt2 = this.serializer;
                        if (i14 != 0) {
                            zcExternalSyntheticLambda0 zcexternalsyntheticlambda1 = z7externalsyntheticlambda5.serializer;
                            if (zcexternalsyntheticlambda1 != null) {
                                extrasKt2.MediaMetadataCompat.serializer(zcexternalsyntheticlambda1.serializer);
                            }
                            return createfromparcel2;
                        }
                        zcExternalSyntheticLambda0 zcexternalsyntheticlambda2 = z7externalsyntheticlambda5.serializer;
                        if (zcexternalsyntheticlambda2 != null) {
                            extrasKt2.MediaMetadataCompat.serializer(zcexternalsyntheticlambda2.serializer);
                        }
                        int i15 = write + 17;
                        read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        return createfromparcel2;
                    }
                };
                brazeExternalSyntheticLambda28.getClass();
                if (zcexternalsyntheticlambda0 != null) {
                    int i12 = ParcelableVolumeInfo + 39;
                    PlaybackStateCompatCustomAction = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    int i14 = setBearing.read[zcexternalsyntheticlambda0.read.ordinal()];
                    if (i14 == 1) {
                        i4 = com.logistics.rider.glovo.R.drawable.ic_bold_large_finance_cash;
                    } else {
                        if (i14 != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        int i15 = ParcelableVolumeInfo + 69;
                        PlaybackStateCompatCustomAction = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        i4 = com.logistics.rider.glovo.R.drawable.ic_bold_large_finance_money_credit_card;
                    }
                    setaccuracyradius = new setAccuracyRadius(i4, zcexternalsyntheticlambda0.RemoteActionCompatParcelizer + " (#" + zcexternalsyntheticlambda0.IconCompatParcelizer + ")", brazeExternalSyntheticLambda28.read.IconCompatParcelizer(com.logistics.rider.glovo.R.string.history_latest_delivery_section_additional_info), r7, r8);
                } else {
                    setaccuracyradius = null;
                }
                FormBody.Builder builder = extrasKt.RemoteActionCompatParcelizer;
                List list3 = z7externalsyntheticlambda4.RemoteActionCompatParcelizer;
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) builder.RemoteActionCompatParcelizer;
                publishError publisherror2 = (publishError) builder.serializer;
                list3.getClass();
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    int i17 = ParcelableVolumeInfo + 105;
                    PlaybackStateCompatCustomAction = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % i7;
                    z9 z9Var = (z9) it4.next();
                    int i19 = ImageLoaderBuilder.serializer[z9Var.RemoteActionCompatParcelizer.ordinal()];
                    if (i19 == i11) {
                        i = com.logistics.rider.glovo.R.drawable.ic_bold_large_finance_cash;
                    } else {
                        if (i19 != i7) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return isrendererinitialised;
                        }
                        i = com.logistics.rider.glovo.R.drawable.ic_bold_large_finance_money_credit_card;
                    }
                    String str2 = z9Var.serializer + " (#" + z9Var.write + ")";
                    DateTime dateTime = z9Var.read;
                    if (dateTime != null) {
                        ZonedDateTime zonedDateTimeOfLocal = ZonedDateTime.ofLocal(LocalDateTime.of(dateTime.getYear(), dateTime.getMonthOfYear(), dateTime.getDayOfMonth(), dateTime.getHourOfDay(), dateTime.getMinuteOfHour(), dateTime.getSecondOfMinute(), dateTime.getMillisOfSecond() * 1000000), ZoneId.of(dateTime.getZone().getID(), ZoneId.SHORT_IDS), ZoneOffset.ofTotalSeconds(dateTime.getZone().getOffset(dateTime) / 1000));
                        zonedDateTimeOfLocal.getClass();
                        publisherror2.getClass();
                        String str3 = new SimpleDateFormat("HH:mm", java.util.Locale.getDefault()).format(Date.from(zonedDateTimeOfLocal.toInstant()));
                        str3.getClass();
                        str = settransactionsuccessful.read(com.logistics.rider.glovo.R.string.history_all_deliveries_section_additional_info, str3);
                    } else {
                        str = null;
                    }
                    clearBitmaps clearbitmaps = new clearBitmaps(i, str2, str);
                    ArrayList arrayList3 = z9Var.IconCompatParcelizer;
                    ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, i9));
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        za zaVar = (za) it5.next();
                        boolean z = zaVar instanceof zc;
                        if (z) {
                            int i20 = PlaybackStateCompatCustomAction + 19;
                            ParcelableVolumeInfo = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            i2 = com.logistics.rider.glovo.R.drawable.ic_bold_medium_finance_cash;
                            if (i21 != 0) {
                                int i22 = 38 / 0;
                            }
                        } else if (zaVar instanceof zd) {
                            i2 = com.logistics.rider.glovo.R.drawable.ic_bold_medium_vehicle_bike;
                        } else {
                            if (!(zaVar instanceof zb)) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            int i23 = PlaybackStateCompatCustomAction + 101;
                            ParcelableVolumeInfo = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i24 = i23 % 2;
                            i2 = com.logistics.rider.glovo.R.drawable.ic_bold_medium_finance_coin_with_heart;
                        }
                        if (z) {
                            i3 = com.logistics.rider.glovo.R.string.history_all_deliveries_section_cash_collected;
                        } else if (zaVar instanceof zd) {
                            i3 = com.logistics.rider.glovo.R.string.history_all_deliveries_section_distance;
                        } else {
                            if (!(zaVar instanceof zb)) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            int i25 = PlaybackStateCompatCustomAction + 121;
                            ParcelableVolumeInfo = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i25 % 2 != 0) {
                                int i26 = 4 % 2;
                            }
                            i3 = com.logistics.rider.glovo.R.string.history_all_deliveries_section_tip_received;
                        }
                        if (z) {
                            int i27 = ParcelableVolumeInfo + 97;
                            PlaybackStateCompatCustomAction = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i28 = i27 % 2;
                            long j = ((zc) zaVar).RemoteActionCompatParcelizer;
                            publisherror2.getClass();
                            double dSerializer = checkForSystemLogLevelPropertylambda0.serializer(j);
                            openSessionlambda1 opensessionlambda1 = publisherror2.read;
                            it = it4;
                            it2 = it5;
                            strSerializer = opensessionlambda1.serializer(dSerializer, opensessionlambda1.serializer.read.write().currency, true);
                        } else {
                            it = it4;
                            it2 = it5;
                            if (zaVar instanceof zd) {
                                strSerializer = publisherror2.write(((zd) zaVar).IconCompatParcelizer);
                            } else {
                                if (!(zaVar instanceof zb)) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                double d = ((zb) zaVar).IconCompatParcelizer;
                                openSessionlambda1 opensessionlambda2 = publisherror2.read;
                                strSerializer = opensessionlambda2.serializer(d, opensessionlambda2.serializer.read.write().currency, false);
                            }
                            strSerializer.getClass();
                            arrayList4.add(new getNextEvents(i2, settransactionsuccessful.IconCompatParcelizer(i3), strSerializer));
                            it4 = it;
                            it5 = it2;
                            i9 = 10;
                        }
                        strSerializer.getClass();
                        arrayList4.add(new getNextEvents(i2, settransactionsuccessful.IconCompatParcelizer(i3), strSerializer));
                        it4 = it;
                        it5 = it2;
                        i9 = 10;
                    }
                    arrayList2.add(new report(clearbitmaps, arrayList4));
                    i7 = 2;
                    isrendererinitialised = null;
                    i11 = 1;
                }
                return arrayList2.isEmpty() ? new styleAccuracy(nowinsecondsprecise) : new removeLayers(nowinsecondsprecise, setaccuracyradius, arrayList2);
            }
            zgExternalSyntheticLambda3 zgexternalsyntheticlambda3 = (zgExternalSyntheticLambda3) it3.next();
            boolean z2 = zgexternalsyntheticlambda3 instanceof zf;
            if (z2) {
                i5 = com.logistics.rider.glovo.R.string.history_summation_section_collected;
            } else if (zgexternalsyntheticlambda3 instanceof zg) {
                i5 = com.logistics.rider.glovo.R.string.history_summation_section_deliveries;
            } else if (zgexternalsyntheticlambda3 instanceof ze) {
                i5 = com.logistics.rider.glovo.R.string.history_summation_section_distance;
            } else {
                if (!(zgexternalsyntheticlambda3 instanceof provideRequestParams)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                i5 = com.logistics.rider.glovo.R.string.history_summation_section_tips;
            }
            if (z2) {
                i6 = com.logistics.rider.glovo.R.drawable.ic_bold_medium_finance_money_coin;
            } else if (zgexternalsyntheticlambda3 instanceof zg) {
                int i29 = ParcelableVolumeInfo + 103;
                PlaybackStateCompatCustomAction = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i29 % 2 == 0) {
                    int i30 = 62 / 0;
                }
                i6 = com.logistics.rider.glovo.R.drawable.ic_bold_medium_essentials_shopping_bag_check;
            } else if (!(!(zgexternalsyntheticlambda3 instanceof ze))) {
                i6 = com.logistics.rider.glovo.R.drawable.ic_bold_medium_vehicle_bike;
            } else {
                if (!(zgexternalsyntheticlambda3 instanceof provideRequestParams)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                i6 = com.logistics.rider.glovo.R.drawable.ic_bold_medium_finance_coin_with_heart;
            }
            if (z2) {
                long j2 = ((zf) zgexternalsyntheticlambda3).serializer;
                publisherror.getClass();
                double dSerializer2 = checkForSystemLogLevelPropertylambda0.serializer(j2);
                openSessionlambda1 opensessionlambda3 = publisherror.read;
                strSerializer2 = opensessionlambda3.serializer(dSerializer2, opensessionlambda3.serializer.read.write().currency, true);
            } else if (zgexternalsyntheticlambda3 instanceof zg) {
                int i31 = ((zg) zgexternalsyntheticlambda3).RemoteActionCompatParcelizer;
                publisherror.serializer.IconCompatParcelizer(com.logistics.rider.glovo.R.string.symbol_null);
                strSerializer2 = new DecimalFormat("0", new DecimalFormatSymbols(java.util.Locale.getDefault())).format(i31);
                strSerializer2.getClass();
            } else if (zgexternalsyntheticlambda3 instanceof ze) {
                strSerializer2 = publisherror.write(((ze) zgexternalsyntheticlambda3).RemoteActionCompatParcelizer);
            } else {
                if (!(zgexternalsyntheticlambda3 instanceof provideRequestParams)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i32 = PlaybackStateCompatCustomAction + 3;
                ParcelableVolumeInfo = i32 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i33 = i32 % 2;
                double d2 = ((provideRequestParams) zgexternalsyntheticlambda3).write;
                openSessionlambda1 opensessionlambda4 = publisherror.read;
                strSerializer2 = opensessionlambda4.serializer(d2, opensessionlambda4.serializer.read.write().currency, false);
            }
            strSerializer2.getClass();
            arrayList.add(new parseDatelambda0(((setTransactionSuccessful) pair.write).IconCompatParcelizer(i5), i6, strSerializer2.toString()));
        }
    }
}
