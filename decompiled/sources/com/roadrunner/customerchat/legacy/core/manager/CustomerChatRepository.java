package com.roadrunner.customerchat.legacy.core.manager;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;
import o.TextUnitType;
import o.TextUnitTypeCompanion;
import o.accessgetInstancedelegatecp;
import o.fireWithUpdatedRectui;
import o.instance_delegatelambda0;
import o.setCarryoverInAppMessage;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerChatRepository {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final ObservableMap IconCompatParcelizer;
    public final BehaviorSubject read;
    public final TextUnitType serializer;
    public final transferSessionPackageI write;

    public CustomerChatRepository(TextUnitType textUnitType, setTransactionSuccessful settransactionsuccessful, transferSessionPackageI transfersessionpackagei) {
        this.serializer = textUnitType;
        this.write = transfersessionpackagei;
        BehaviorSubject behaviorSubjectIconCompatParcelizer = BehaviorSubject.IconCompatParcelizer(instance_delegatelambda0.write);
        this.read = behaviorSubjectIconCompatParcelizer;
        this.IconCompatParcelizer = new ObservableMap(behaviorSubjectIconCompatParcelizer, new PerseusInitializerImpl$$ExternalSyntheticLambda0(13, new MapApiError$$ExternalSyntheticLambda1(5)));
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strMediaBrowserCompatMediaItem = ((ChatDeliveryRepositoryImpl) this.serializer).MediaBrowserCompatMediaItem();
        int i4 = MediaSessionCompatQueueItem + 55;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strMediaBrowserCompatMediaItem;
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 57;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zEquals = ((ChatDeliveryRepositoryImpl) this.serializer).RemoteActionCompatParcelizer().equals("staging");
        int i4 = RemoteActionCompatParcelizer + 33;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return zEquals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ArrayList read() {
        int iIntValue;
        Integer numMediaSessionCompatQueueItem;
        int i = 2 % 2;
        List<TextUnitTypeCompanion> list = ((ChatDeliveryRepositoryImpl) this.serializer).read();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (TextUnitTypeCompanion textUnitTypeCompanion : list) {
            int iIconCompatParcelizer = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
            int iIconCompatParcelizer2 = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
            long jLongValue = ((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{textUnitTypeCompanion}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer2, -1563797762)).longValue();
            String strMediaMetadataCompat = textUnitTypeCompanion.MediaMetadataCompat();
            if (strMediaMetadataCompat == null || (numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, strMediaMetadataCompat)) == null) {
                iIntValue = 0;
            } else {
                int i2 = MediaSessionCompatQueueItem + 75;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                iIntValue = numMediaSessionCompatQueueItem.intValue();
            }
            int i4 = iIntValue;
            int i5 = RemoteActionCompatParcelizer + 95;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            String strSerializer = textUnitTypeCompanion.serializer();
            String strWrite = textUnitTypeCompanion.write();
            String strRemoteActionCompatParcelizer = textUnitTypeCompanion.RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer == null) {
                int i7 = MediaSessionCompatQueueItem + 79;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                strRemoteActionCompatParcelizer = "";
            }
            arrayList.add(new fireWithUpdatedRectui(jLongValue, i4, strSerializer, strWrite, strRemoteActionCompatParcelizer, textUnitTypeCompanion.MediaBrowserCompatMediaItem(), textUnitTypeCompanion.MediaDescriptionCompat(), textUnitTypeCompanion.IconCompatParcelizer(), textUnitTypeCompanion.RatingCompat(), textUnitTypeCompanion.read(), 0));
            int i9 = MediaSessionCompatQueueItem + 59;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        return arrayList;
    }
}
