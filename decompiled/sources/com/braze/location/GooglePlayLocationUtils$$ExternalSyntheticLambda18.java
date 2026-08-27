package com.braze.location;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sentiance.core.model.events.i$c;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.sentry.android.core.SentryLogcatAdapter;
import o.ColorSpaceVerificationHelperExternalSyntheticLambda0;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.JsonUtilsa;
import o.MeasureScopeWithLayoutNodeKtWhenMappings;
import o.getContainer;
import o.getDstBrush;
import o.getOutlineProvider;
import o.getRightimpl;
import o.markAsAttached;
import o.obtainAndroidColorSpace;
import o.onLayoutChange;
import o.rotateRad0AR0LA0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GooglePlayLocationUtils$$ExternalSyntheticLambda18 implements getDstBrush, OnFailureListener, rotateRad0AR0LA0, getOutlineProvider, getContainer, CompletableOnSubscribe, getRightimpl, MeasureScopeWithLayoutNodeKtWhenMappings, onLayoutChange, OnSuccessListener, Consumer, Action {
    private static int RatingCompat = 1;
    private static int write;
    public final /* synthetic */ int $r8$classId;

    @Override // io.reactivex.functions.Action
    public void run() {
        int i = 2 % 2;
        int i2 = RatingCompat + 53;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        int i4 = RatingCompat + 113;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ GooglePlayLocationUtils$$ExternalSyntheticLambda18(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = 2 % 2;
        int i2 = write + 77;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            SentryLogcatAdapter.serializer("FIAM.Headless", "Impression store write failure");
            throw null;
        }
        SentryLogcatAdapter.serializer("FIAM.Headless", "Impression store write failure");
        int i3 = write + 17;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.getDstBrush
    public void serializer(obtainAndroidColorSpace obtainandroidcolorspace, ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0, boolean z) {
        int i = 2 % 2;
        int i2 = write + 31;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        if (i4 == 1) {
            obtainandroidcolorspace.write(colorSpaceVerificationHelperExternalSyntheticLambda0);
            return;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                obtainandroidcolorspace.serializer();
                return;
            } else {
                obtainandroidcolorspace.read();
                return;
            }
        }
        obtainandroidcolorspace.serializer(colorSpaceVerificationHelperExternalSyntheticLambda0);
        int i5 = RatingCompat + 21;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
    }

    @Override // o.onLayoutChange, io.reactivex.functions.Function
    public Object apply(Object obj) {
        int i = 2 % 2;
        markAsAttached markasattached = (markAsAttached) obj;
        markasattached.getClass();
        i$c i_c = new i$c(0);
        i_c.MediaMetadataCompat = new DropShadowEffect(14);
        i_c.write = markasattached;
        int i2 = write + 65;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return i_c;
    }

    public static /* synthetic */ void m(int i, int i2) {
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m(String str) throws zzmr {
        int i = 2 % 2;
        throw new zzmr(str);
    }

    @Override // o.getOutlineProvider, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = write + 107;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        if (i4 != 11) {
            if (i4 != 13) {
                ((JsonUtilsa) obj).read();
                return;
            } else {
                Timber.RemoteActionCompatParcelizer.getClass();
                return;
            }
        }
        Timber.RemoteActionCompatParcelizer.getClass();
        int i5 = write + 49;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.rotateRad0AR0LA0
    public Object B_() {
        int i = 2 % 2;
        boolean z = false;
        if (Build.VERSION.SDK_INT != 34) {
            int i2 = write + 55;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            Log.isLoggable("GainmapWorkaroundCalc", 2);
            if (bitmapCopy != null) {
                int i4 = RatingCompat + 87;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // io.reactivex.CompletableOnSubscribe
    public void subscribe(CompletableEmitter completableEmitter) {
        int i = 2 % 2;
        completableEmitter.getClass();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("GMS Push Token: deleting", new Object[0]);
        try {
            FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
            firebaseMessaging.getClass();
            Task taskDeleteToken = firebaseMessaging.deleteToken();
            taskDeleteToken.getClass();
            taskDeleteToken.addOnCompleteListener(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(5, completableEmitter)).getClass();
            int i2 = write + 7;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "GMS Push Token: delete failed during task creation", new Object[0]);
            completableEmitter.IconCompatParcelizer();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = 2 % 2;
        int i2 = write + 111;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.$r8$classId;
        if (i3 == 0) {
            GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3(exc);
            return;
        }
        if (i3 == 5) {
            GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2(exc);
            return;
        }
        if (i3 == 12) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc, "requesting transition updates failed", new Object[0]);
            int i4 = write + 79;
            RatingCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i3 == 14) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc, "requesting Activity updates failed", new Object[0]);
            return;
        }
        if (i3 == 15) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc, "Transitions could not be unregistered.", new Object[0]);
            return;
        }
        switch (i3) {
            case 7:
                exc.getClass();
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc, "Recognition could not be unregistered.", new Object[0]);
                return;
            case 8:
                exc.getClass();
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc, "requesting Activity updates failed", new Object[0]);
                return;
            case 9:
                exc.getClass();
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc, "Transitions could not be unregistered.", new Object[0]);
                return;
            case 10:
                exc.getClass();
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc, "requesting transition updates failed", new Object[0]);
                return;
            default:
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc, "Recognition could not be unregistered.", new Object[0]);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0221  */
    /* JADX WARN: Code restructure failed: missing block: B:204:?, code lost:
    
        return new o.remeasureAndRelayoutIfNeededdefault(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018d, code lost:
    
        if (r2 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0190, code lost:
    
        if (r2 == null) goto L95;
     */
    @Override // o.MeasureScopeWithLayoutNodeKtWhenMappings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object parse(android.util.JsonReader r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18.parse(android.util.JsonReader):java.lang.Object");
    }
}
