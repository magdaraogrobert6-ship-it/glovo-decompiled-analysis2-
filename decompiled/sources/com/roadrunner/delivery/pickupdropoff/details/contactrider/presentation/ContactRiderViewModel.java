package com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation;

import android.content.ClipboardManager;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.domain.ContactRiderEventsLogger;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.compose.navigator.ContactRiderArgs;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import io.grpc.internal.SharedResourcePool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.ShortNewsContentCardView;
import o.getLineNumber;
import o.setTransactionSuccessful;
import o.toBitmapConfig1JJdX4A;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ContactRiderViewModel extends ViewModel {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final MutableStateFlow IconCompatParcelizer;
    public final UnifiedPhoneCallerImpl MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final ClipboardManager RemoteActionCompatParcelizer;
    public final ContactRiderEventsLogger read;
    public final SharedResourcePool serializer;
    public final setTransactionSuccessful write;

    public final SharedResourcePool serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 111;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        SharedResourcePool sharedResourcePool = this.serializer;
        int i4 = i2 + 117;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return sharedResourcePool;
    }

    public ContactRiderViewModel(SharedResourcePool sharedResourcePool, UnifiedPhoneCallerImpl unifiedPhoneCallerImpl, ClipboardManager clipboardManager, setTransactionSuccessful settransactionsuccessful, ContactRiderEventsLogger contactRiderEventsLogger) {
        sharedResourcePool.getClass();
        unifiedPhoneCallerImpl.getClass();
        clipboardManager.getClass();
        settransactionsuccessful.getClass();
        contactRiderEventsLogger.getClass();
        this.serializer = sharedResourcePool;
        this.MediaMetadataCompat = unifiedPhoneCallerImpl;
        this.RemoteActionCompatParcelizer = clipboardManager;
        this.write = settransactionsuccessful;
        this.read = contactRiderEventsLogger;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getLineNumber.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
    }

    public final void read(ContactRiderArgs contactRiderArgs) {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new SwitcherUiModelImpl$1.AnonymousClass1(this, contactRiderArgs, shortNewsContentCardView, 16), 3);
        List list = contactRiderArgs.IconCompatParcelizer.read;
        ContactRiderEventsLogger contactRiderEventsLogger = this.read;
        contactRiderEventsLogger.getClass();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (!(!it.hasNext())) {
                Object next = it.next();
                Trigger.Companion companion = Trigger.Companion;
                String str = ((TrackingEvent) next).trigger;
                companion.getClass();
                if (Trigger.Companion.write(str) == Trigger.SCREEN_OPENED) {
                    int i2 = MediaDescriptionCompat + 33;
                    RatingCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        arrayList.add(next);
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException(c8$$ExternalSyntheticOutline0.m("There is no screen opened event for ContactRider ", list)));
                arrayList = null;
            }
            if (arrayList != null) {
                int i3 = RatingCompat + 91;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    contactRiderEventsLogger.RemoteActionCompatParcelizer(arrayList);
                } else {
                    contactRiderEventsLogger.RemoteActionCompatParcelizer(arrayList);
                    throw null;
                }
            }
        }
    }
}
