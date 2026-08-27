package androidx.compose.ui.tooling;

import androidx.compose.ui.platform.InspectionModeKt;
import java.util.Set;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidContentCaptureManagersendContentCaptureAppearEvents1;
import o.AndroidPrefetchScheduler;
import o.BlurredEdgeTreatmentCompanion;
import o.CacheDrawModifierNodeImpl;
import o.ContentType_androidKt;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getType;
import o.hideTranslatedText;
import o.onItemDismisslambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class InspectableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel InInspectionModeOnly$lambda$0(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, getBirthDateFull getbirthdatefull, int i2) {
        InInspectionModeOnly(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel Inspectable$lambda$0(CompositionDataRecord compositionDataRecord, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, getBirthDateFull getbirthdatefull, int i2) {
        Inspectable(compositionDataRecord, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
        return createFromParcel.INSTANCE;
    }

    @onItemDismisslambda0
    public static final void InInspectionModeOnly(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1954693855);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (!getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (((Boolean) getpostalcode.write((getNewPassword) InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            getpostalcode.serializer(1118132138);
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, Integer.valueOf(i2 & 14));
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.serializer(1118156163);
            getpostalcode.IconCompatParcelizer(false);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new InspectableKt$$ExternalSyntheticLambda0(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i, i3);
        }
    }

    public static final void Inspectable(CompositionDataRecord compositionDataRecord, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1504045604);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(compositionDataRecord) : getpostalcode.IconCompatParcelizer(compositionDataRecord) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            getpostalcode.MediaSessionCompatResultReceiverWrapper = true;
            getpostalcode.fullyDrawnReporter_delegatelambda00 = true;
            getpostalcode.menuHostHelperlambda0.read();
            getpostalcode.ResultReceiver.read();
            getType gettype = getpostalcode.onBackPressedDispatcher_delegatelambda00;
            AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = gettype.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            gettype.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaBrowserCompatMediaItem;
            gettype.RemoteActionCompatParcelizer = androidContentCaptureManagersendContentCaptureAppearEvents1.write;
            compositionDataRecord.getClass();
            Set<BlurredEdgeTreatmentCompanion> store = ((CompositionDataRecordImpl) compositionDataRecord).getStore();
            store.add(getpostalcode.RatingCompat());
            AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{InspectionModeKt.getLocalInspectionMode().write(Boolean.TRUE), CacheDrawModifierNodeImpl.read.write(store)}, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, (i2 & 112) | 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(i, 6, compositionDataRecord, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }
    }
}
