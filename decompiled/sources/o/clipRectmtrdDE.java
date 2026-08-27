package o;

import android.content.Context;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final class clipRectmtrdDE {
    public boolean ComponentActivity;
    public boolean IconCompatParcelizer;
    public final r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final getAndroidCanvas MediaMetadataCompat;
    public final ArrayList MediaSessionCompatQueueItem;
    public Executor MediaSessionCompatResultReceiverWrapper;
    public final LinkedHashSet MediaSessionCompatToken;
    public final accessgetCompositingStrategyNrFUSIjd ParcelableVolumeInfo;
    public final LinkedHashSet PlaybackStateCompat;
    public final String PlaybackStateCompatCustomAction;
    public final Context RatingCompat;
    public final ArrayList RemoteActionCompatParcelizer;
    public final ArrayList ResultReceiver;
    public getAlpha8_sVssgQ r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public Executor r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean read;
    public boolean serializer;
    public final long write;

    public final void read() {
        this.ComponentActivity = false;
        this.IconCompatParcelizer = true;
    }

    public final androidx.room.RoomDatabase write() {
        String name;
        androidx.room.RoomDatabase roomDatabase;
        String str;
        Executor executor = this.MediaSessionCompatResultReceiverWrapper;
        if (executor == null && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
            setSupportButtonTintList setsupportbuttontintlist = setSupportButtonTintMode.write;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setsupportbuttontintlist;
            this.MediaSessionCompatResultReceiverWrapper = setsupportbuttontintlist;
        } else if (executor != null && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = executor;
        } else if (executor == null) {
            this.MediaSessionCompatResultReceiverWrapper = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        }
        LinkedHashSet linkedHashSet = this.PlaybackStateCompat;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = this.MediaSessionCompatToken;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        isSpecified8_81llA accessgetwcp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (accessgetwcp == null) {
            accessgetwcp = new accessgetWcp(5);
        }
        isSpecified8_81llA isspecified8_81lla = accessgetwcp;
        if (this.write > 0) {
            if (this.PlaybackStateCompatCustomAction != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z = this.read;
        getAndroidCanvas getandroidcanvas = this.MediaMetadataCompat;
        Context context = this.RatingCompat;
        getAndroidCanvas getandroidcanvasResolve$room_runtime = getandroidcanvas.resolve$room_runtime(context);
        Executor executor2 = this.MediaSessionCompatResultReceiverWrapper;
        if (executor2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
            return null;
        }
        Executor executor3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (executor3 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
            return null;
        }
        lerpNullableFloatList lerpnullablefloatlist = new lerpNullableFloatList(context, this.PlaybackStateCompatCustomAction, isspecified8_81lla, this.ParcelableVolumeInfo, this.MediaSessionCompatQueueItem, z, getandroidcanvasResolve$room_runtime, executor2, executor3, null, this.ComponentActivity, this.IconCompatParcelizer, linkedHashSet2, null, null, null, this.ResultReceiver, this.RemoteActionCompatParcelizer, this.serializer, null, null);
        lerpnullablefloatlist.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = this.MediaDescriptionCompat;
        Class cls = Options.Companion.read(this.MediaBrowserCompatMediaItem);
        Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            if (name.length() == 0) {
                str = strConcat;
            } else {
                str = name + '.' + strConcat;
            }
            Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
            cls2.getClass();
            roomDatabase = null;
            try {
                androidx.room.RoomDatabase roomDatabase2 = (androidx.room.RoomDatabase) cls2.getDeclaredConstructor(null).newInstance(null);
                roomDatabase2.init(lerpnullablefloatlist);
                return roomDatabase2;
            } catch (ClassNotFoundException e) {
                e = e;
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Cannot find implementation for ", cls.getCanonicalName(), ". ", strConcat, " does not exist. Is Room annotation processor correctly configured?", e);
                return roomDatabase;
            } catch (IllegalAccessException e2) {
                e = e2;
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(ff$$ExternalSyntheticOutline0.m(cls, new StringBuilder("Cannot access the constructor ")), e);
                return roomDatabase;
            } catch (InstantiationException e3) {
                e = e3;
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(ff$$ExternalSyntheticOutline0.m(cls, new StringBuilder("Failed to create an instance of ")), e);
                return roomDatabase;
            }
        } catch (ClassNotFoundException e4) {
            e = e4;
            roomDatabase = null;
        } catch (IllegalAccessException e5) {
            e = e5;
            roomDatabase = null;
        } catch (InstantiationException e6) {
            e = e6;
            roomDatabase = null;
        }
    }

    public clipRectmtrdDE(Context context, Class cls, String str) {
        context.getClass();
        this.MediaSessionCompatQueueItem = new ArrayList();
        this.ResultReceiver = new ArrayList();
        this.MediaMetadataCompat = getAndroidCanvas.AUTOMATIC;
        this.write = -1L;
        this.ParcelableVolumeInfo = new accessgetCompositingStrategyNrFUSIjd(1);
        this.MediaSessionCompatToken = new LinkedHashSet();
        this.PlaybackStateCompat = new LinkedHashSet();
        this.RemoteActionCompatParcelizer = new ArrayList();
        this.ComponentActivity = true;
        this.MediaDescriptionCompat = true;
        this.MediaBrowserCompatMediaItem = displayInAppMessagelambda1.serializer(cls);
        this.RatingCompat = context;
        this.PlaybackStateCompatCustomAction = str;
    }

    public final void write(getBlack0d7_KjUannotations... getblack0d7_kjuannotationsArr) {
        for (getBlack0d7_KjUannotations getblack0d7_kjuannotations : getblack0d7_kjuannotationsArr) {
            int i = getblack0d7_kjuannotations.RemoteActionCompatParcelizer;
            LinkedHashSet linkedHashSet = this.PlaybackStateCompat;
            linkedHashSet.add(Integer.valueOf(i));
            linkedHashSet.add(Integer.valueOf(getblack0d7_kjuannotations.serializer));
        }
        getBlack0d7_KjUannotations[] getblack0d7_kjuannotationsArr2 = (getBlack0d7_KjUannotations[]) Arrays.copyOf(getblack0d7_kjuannotationsArr, getblack0d7_kjuannotationsArr.length);
        accessgetCompositingStrategyNrFUSIjd accessgetcompositingstrategynrfusijd = this.ParcelableVolumeInfo;
        accessgetcompositingstrategynrfusijd.getClass();
        for (getBlack0d7_KjUannotations getblack0d7_kjuannotations2 : getblack0d7_kjuannotationsArr2) {
            accessgetcompositingstrategynrfusijd.write(getblack0d7_kjuannotations2);
        }
    }
}
