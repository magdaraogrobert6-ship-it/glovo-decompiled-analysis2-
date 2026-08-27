package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.feature.Feature;
import com.sentiance.sdk.feature.FeatureType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "FeatureManager")
public class getConversationPersonMap implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private static final List<FeatureType> read = Collections.singletonList(FeatureType.DATA_COLLECTOR);
    private final Context IconCompatParcelizer;
    private final configureFromServerConfiglambda1 MediaBrowserCompatMediaItem;
    private final getNotificationCategory MediaDescriptionCompat;
    private final r8lambdaLnKUwFcTXyyCsnNZGD04zGjVSqI MediaMetadataCompat;
    private final parseLonglambda0 serializer;
    private final PackageManager write;
    private final HashSet RemoteActionCompatParcelizer = new HashSet();
    private final migrateTriggersReeligibilityToJsonlambda1<List<Feature>> RatingCompat = new getNotificationBadgeNumber(this);

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    private boolean serializer(FeatureType featureType) {
        synchronized (this.RemoteActionCompatParcelizer) {
            Iterator it = this.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                if (((getCartId) it.next()).RemoteActionCompatParcelizer().equals(featureType.getModuleClassName())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.RemoteActionCompatParcelizer.clear();
    }

    public getConversationPersonMap(parseLonglambda0 parselonglambda0, Context context, PackageManager packageManager, r8lambdaLnKUwFcTXyyCsnNZGD04zGjVSqI r8lambdalnkuwfctxyycsnnzgd04zgjvsqi, configureFromServerConfiglambda1 configurefromserverconfiglambda1, getNotificationCategory getnotificationcategory) {
        this.serializer = parselonglambda0;
        this.IconCompatParcelizer = context;
        this.write = packageManager;
        this.MediaMetadataCompat = r8lambdalnkuwfctxyycsnnzgd04zgjvsqi;
        this.MediaBrowserCompatMediaItem = configurefromserverconfiglambda1;
        this.MediaDescriptionCompat = getnotificationcategory;
    }

    private void serializer(List<getCartId> list) {
        boolean zContains;
        for (getCartId getcartid : list) {
            synchronized (this.RemoteActionCompatParcelizer) {
                zContains = this.RemoteActionCompatParcelizer.contains(getcartid);
            }
            if (!zContains) {
                List<Class<? extends getCartId>> listRemoteActionCompatParcelizer = getcartid.serializer().RemoteActionCompatParcelizer();
                if (!listRemoteActionCompatParcelizer.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Class<? extends getCartId>> it = listRemoteActionCompatParcelizer.iterator();
                    while (it.hasNext()) {
                        arrayList.add((getCartId) setPushUniqueId.read(it.next()));
                    }
                    serializer(arrayList);
                }
                getWireValue getwirevalueSerializer = getcartid.serializer();
                ArrayList arrayList2 = new ArrayList();
                Iterator<Class<? extends setPushDuration>> it2 = getwirevalueSerializer.IconCompatParcelizer().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            setPushUniqueId.serializer().RemoteActionCompatParcelizer().serializer((setPushDuration) it3.next());
                        }
                        Iterator<Class<? extends createOrGetDataStorelambda00>> it4 = getwirevalueSerializer.MediaMetadataCompat().iterator();
                        while (it4.hasNext()) {
                            readFloatlambda0.read().serializer(it4.next());
                        }
                        Iterator<Class<? extends removeGeofencesRegisteredWithGeofencingClientlambda2>> it5 = getwirevalueSerializer.serializer().iterator();
                        while (it5.hasNext()) {
                            removeGeofencesRegisteredWithGeofencingClientlambda23.serializer().read(it5.next());
                        }
                        Iterator<Class<? extends r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q>> it6 = getwirevalueSerializer.read().iterator();
                        while (it6.hasNext()) {
                            getPublicNotificationExtras.b().write(it6.next());
                        }
                        Iterator<Class<? extends r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA>> it7 = getwirevalueSerializer.RatingCompat().iterator();
                        while (it7.hasNext()) {
                            this.MediaMetadataCompat.write().RemoteActionCompatParcelizer(it7.next());
                        }
                        Iterator<Class<? extends getValidNotificationChannellambda0>> it8 = getwirevalueSerializer.write().iterator();
                        while (it8.hasNext()) {
                            setCategoryIfPresentAndSupported.write().serializer(it8.next());
                        }
                        synchronized (this.RemoteActionCompatParcelizer) {
                            this.RemoteActionCompatParcelizer.add(getcartid);
                        }
                        break;
                    }
                    setPushDuration setpushduration = (setPushDuration) write(it2.next());
                    if (setpushduration == null) {
                        break;
                    } else {
                        arrayList2.add(setpushduration);
                    }
                }
            }
        }
    }

    public final void IconCompatParcelizer() {
        getNotificationCategory getnotificationcategory;
        Iterator<Feature> it = this.RatingCompat.read().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            getnotificationcategory = this.MediaDescriptionCompat;
            if (!zHasNext) {
                break;
            }
            Feature next = it.next();
            boolean zWrite = ((ConfigurationManager) getnotificationcategory).write(next.getType());
            parseLonglambda0 parselonglambda0 = this.serializer;
            if (!zWrite) {
                parselonglambda0.RemoteActionCompatParcelizer("Feature %s cannot be enabled", next.getType().name());
            } else {
                parselonglambda0.IconCompatParcelizer("Enabling feature %s", next.getClass().getName());
                serializer(next.getModules());
            }
        }
        if (this.MediaBrowserCompatMediaItem.read()) {
            ArrayList arrayList = new ArrayList();
            for (FeatureType featureType : FeatureType.values()) {
                if (!read.contains(featureType) && ((ConfigurationManager) getnotificationcategory).write(featureType) && !serializer(featureType)) {
                    arrayList.add(featureType);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            write("-----------------------------------------------------------------------------", new Object[0]);
            write("The following SDK features are enabled for your app on the Sentiance", new Object[0]);
            write("Platform, but the corresponding dependencies are missing from your project.", new Object[0]);
            write("If you want to make use of these features, add the corresponding dependencies", new Object[0]);
            write("in your project's build.gradle configuration.", new Object[0]);
            write("\b", new Object[0]);
            write("┌──────────────────────────────┬──────────────────────────────┐", new Object[0]);
            write("│ Feature                      │ Maven Artifact               │", new Object[0]);
            write("├==============================┼==============================┤", new Object[0]);
            for (int i = 0; i < arrayList.size(); i++) {
                FeatureType featureType2 = (FeatureType) arrayList.get(i);
                write("│ %-28s │ %-28s │", featureType2.getFeatureTitle(), featureType2.getArtifactName());
                if (i < arrayList.size() - 1) {
                    write("├──────────────────────────────┼──────────────────────────────┤", new Object[0]);
                } else {
                    write("└──────────────────────────────┴──────────────────────────────┘", new Object[0]);
                }
            }
            write("-----------------------------------------------------------------------------", new Object[0]);
        }
    }

    public static ArrayList RemoteActionCompatParcelizer(getConversationPersonMap getconversationpersonmap) {
        Class<?> cls;
        ArrayList arrayList = new ArrayList();
        parseLonglambda0 parselonglambda0 = getconversationpersonmap.serializer;
        ArrayList arrayList2 = new ArrayList();
        try {
            Bundle bundle = getconversationpersonmap.write.getApplicationInfo(getconversationpersonmap.IconCompatParcelizer.getPackageName(), androidx.compose.ui.graphics.Fields.SpotShadowColor).metaData;
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    if (str.startsWith("com.sentiance.sdk.feature.")) {
                        try {
                            cls = Class.forName(str);
                        } catch (ClassCastException | ClassNotFoundException e) {
                            parselonglambda0.IconCompatParcelizer(true, e, "Failed to get class from name %s", str);
                            cls = null;
                        }
                        if (cls != null) {
                            arrayList2.add(cls);
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            parselonglambda0.IconCompatParcelizer(false, e2, "Failed to get feature classes", new Object[0]);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Feature feature = (Feature) getconversationpersonmap.write((Class) it.next());
            if (feature != null) {
                arrayList.add(feature);
            }
        }
        return arrayList;
    }

    private <T> T write(Class<? extends T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            this.serializer.IconCompatParcelizer(true, e, ff$$ExternalSyntheticOutline0.m(cls, new StringBuilder("Failed to create an instance of class ")), new Object[0]);
            return null;
        }
    }

    public final boolean read(FeatureType featureType) {
        return ((ConfigurationManager) this.MediaDescriptionCompat).write(featureType) && serializer(featureType);
    }

    private static void write(String str, Object... objArr) {
        Log.w("Sentiance", String.format(java.util.Locale.ENGLISH, str, objArr));
    }
}
