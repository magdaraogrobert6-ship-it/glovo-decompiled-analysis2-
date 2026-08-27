package o;

import android.database.sqlite.SQLiteDatabase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.datasync.Payload;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.createFromParcel;
import o.r8lambda1EzHY_LOIkKjPSeQvPl13OfHS3U;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "VehicleCrashFeedbackPayloadCreator", componentName = "VehicleCrashFeedbackPayloadCreator")
public final class r8lambda1EzHY_LOIkKjPSeQvPl13OfHS3U extends getStoryStyle {
    private final com.sentiance.sdk.util.c IconCompatParcelizer;
    private final migrateFeatureFlagStorageToJsonlambda20 MediaBrowserCompatMediaItem;
    private final getNotificationPriorityInt MediaDescriptionCompat;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs MediaMetadataCompat;
    private final setHeaderTextColor MediaSessionCompatQueueItem;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds read;
    private final component4android_sdk_base_release serializer;
    private final parseLonglambda0 write;

    @Override // o.getStoryStyle
    public final int IconCompatParcelizer() {
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00fe  */
    private final getNotificationStyle MediaDescriptionCompat() {
        Payload payloadSerializer;
        ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lRatingCompat = RatingCompat();
        Long lValueOf = lRatingCompat != null ? Long.valueOf(lRatingCompat.longValue() - 1) : null;
        parseLonglambda0 parselonglambda0 = this.write;
        parselonglambda0.IconCompatParcelizer("Processing eligible feedback events from " + jCurrentTimeMillis + " to " + lValueOf, new Object[0]);
        List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(invokeSuspendlambda1.class, lValueOf, Long.valueOf(jCurrentTimeMillis), false, false);
        listRemoteActionCompatParcelizer.getClass();
        ArrayList<ContentCardAdapterExternalSyntheticLambda0> arrayList = new ArrayList();
        Iterator<T> it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) it.next()).RemoteActionCompatParcelizer(this.serializer);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer == null) {
                contentCardAdapterExternalSyntheticLambda0 = null;
            } else {
                invokeSuspendlambda1 invokesuspendlambda1 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.onBackPressedInput_delegatelambda0;
                Long l = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                l.getClass();
                long jLongValue = l.longValue();
                if (invokesuspendlambda1 == null) {
                    contentCardAdapterExternalSyntheticLambda0 = null;
                } else {
                    contentCardAdapterExternalSyntheticLambda0 = new ContentCardAdapterExternalSyntheticLambda0(invokesuspendlambda1, Long.valueOf(jLongValue), Boolean.valueOf(this.MediaDescriptionCompat.read(jLongValue)));
                }
            }
            if (contentCardAdapterExternalSyntheticLambda0 != null) {
                arrayList.add(contentCardAdapterExternalSyntheticLambda0);
            }
        }
        final ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda1 : arrayList) {
            invokeSuspendlambda1 invokesuspendlambda2 = (invokeSuspendlambda1) contentCardAdapterExternalSyntheticLambda1.serializer;
            long jLongValue2 = ((Number) contentCardAdapterExternalSyntheticLambda1.RemoteActionCompatParcelizer).longValue();
            boolean zBooleanValue = ((Boolean) contentCardAdapterExternalSyntheticLambda1.IconCompatParcelizer).booleanValue();
            boolean z = true;
            if (zBooleanValue) {
                payloadSerializer = null;
            } else {
                Long l2 = invokesuspendlambda2.IconCompatParcelizer;
                l2.getClass();
                final long jLongValue3 = l2.longValue();
                final InAppMessageFull inAppMessageFull = InAppMessageFull.read();
                final InAppMessageFull.read readVar = new InAppMessageFull.read();
                readVar.write(false);
                final setHeaderTextColor setheadertextcolor = this.MediaSessionCompatQueueItem;
                setheadertextcolor.getClass();
                if (((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) ((r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) setheadertextcolor.RemoteActionCompatParcelizer(new r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk() { // from class: o.setCloseButtonColor
                    @Override // o.r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk
                    public final Object write(SQLiteDatabase sQLiteDatabase) {
                        return setHeaderTextColor.write(setheadertextcolor, readVar, jLongValue3, inAppMessageFull, sQLiteDatabase);
                    }
                }))) == null) {
                    payloadSerializer = null;
                } else {
                    r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) setheadertextcolor.read(InAppMessageFull.read(), jLongValue3);
                    Long l3 = invokesuspendlambda2.IconCompatParcelizer;
                    l3.getClass();
                    long jLongValue4 = l3.longValue();
                    setClickBehaviorlambda0 setclickbehaviorlambda0 = setClickBehaviorlambda0.read();
                    setheadertextcolor.getClass();
                    List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(setclickbehaviorlambda0, jLongValue4 - 1800000, jLongValue4 + 1800000, new WhereClause());
                    listIconCompatParcelizer.getClass();
                    Iterator it2 = listIconCompatParcelizer.iterator();
                    Object obj = null;
                    boolean z2 = false;
                    while (true) {
                        if (!it2.hasNext()) {
                            if (!z2) {
                                break;
                            }
                            break;
                        }
                        Object next = it2.next();
                        if (((r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0) next).PlaybackStateCompatCustomAction() == jLongValue4) {
                            if (!z2) {
                                z2 = true;
                                obj = next;
                            }
                        }
                        obj = null;
                        break;
                    }
                    r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0 r8lambda5plvmmyc7msph8a8xignikxwbe0 = (r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0) obj;
                    if (r8lambda5plvmmyc7msph8a8xignikxwbe0 != null) {
                        listIconCompatParcelizer = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{r8lambda5plvmmyc7msph8a8xignikxwbe0}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    }
                    payloadSerializer = r8lambdaQMpB2ZjTzCqSwpx9l6hPdj8cu4s.serializer(invokesuspendlambda2, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, jLongValue2, listIconCompatParcelizer, r8lambdali8uu9krigfjg6en6xj7af4cwaq != null ? r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() : null);
                }
            }
            if (payloadSerializer == null && !zBooleanValue) {
                z = false;
            }
            arrayList2.add(new r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM(jLongValue2, payloadSerializer, z));
        }
        if (arrayList2.isEmpty()) {
            parselonglambda0.IconCompatParcelizer("No feedback events to process.", new Object[0]);
            getNotificationStyle.write.getClass();
            return getNotificationStyle.serializer.IconCompatParcelizer();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Payload payload = ((r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM) it3.next()).read();
            if (payload != null) {
                arrayList3.add(payload);
            }
        }
        return new getNotificationStyle(arrayList3, RemoteActionCompatParcelizer(), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.ondevice.datasyncing.creators.VehicleCrashFeedbackPayloadCreator$processRemainingFeedbackEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                r8lambda1EzHY_LOIkKjPSeQvPl13OfHS3U.write(this.this$0, arrayList2);
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void write(r8lambda1EzHY_LOIkKjPSeQvPl13OfHS3U r8lambda1ezhy_loikkjpseqvpl13ofhs3u, List list) {
        Object next;
        getNotificationPriorityInt getnotificationpriorityint = r8lambda1ezhy_loikkjpseqvpl13ofhs3u.MediaDescriptionCompat;
        com.sentiance.sdk.util.c cVar = r8lambda1ezhy_loikkjpseqvpl13ofhs3u.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM) obj).read() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM) it.next()).IconCompatParcelizer()));
        }
        getnotificationpriorityint.RemoteActionCompatParcelizer(arrayList2);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!((r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM) it2.next()).write()) {
                    Iterator it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (((r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM) next).write());
                    r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM r8lambda1r0efd4fg0xchfpbtlhdpmxsnvm = (r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM) next;
                    if (r8lambda1r0efd4fg0xchfpbtlhdpmxsnvm != null) {
                        long jSerializer = r8lambda1r0efd4fg0xchfpbtlhdpmxsnvm.serializer();
                        Long lRatingCompat = r8lambda1ezhy_loikkjpseqvpl13ofhs3u.RatingCompat();
                        if (lRatingCompat != null && lRatingCompat.longValue() == jSerializer) {
                            return;
                        }
                        cVar.read(jSerializer, "KEY_OLDEST_UNPROCESSED_FEEDBACK_TIME");
                        getnotificationpriorityint.RemoteActionCompatParcelizer(jSerializer);
                        return;
                    }
                    return;
                }
            }
        }
        Iterator it4 = list.iterator();
        if (!it4.hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return;
        }
        long jIconCompatParcelizer = ((r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM) it4.next()).IconCompatParcelizer();
        while (it4.hasNext()) {
            long jIconCompatParcelizer2 = ((r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM) it4.next()).IconCompatParcelizer();
            if (jIconCompatParcelizer < jIconCompatParcelizer2) {
                jIconCompatParcelizer = jIconCompatParcelizer2;
            }
        }
        long j = jIconCompatParcelizer + 1;
        cVar.read(j, "KEY_OLDEST_UNPROCESSED_FEEDBACK_TIME");
        getnotificationpriorityint.RemoteActionCompatParcelizer(j);
    }

    @Override // o.getStoryStyle, o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.MediaDescriptionCompat.clearData();
        this.IconCompatParcelizer.read("KEY_OLDEST_UNPROCESSED_FEEDBACK_TIME");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda1EzHY_LOIkKjPSeQvPl13OfHS3U(ConfigurationManager configurationManager, storeRegisteredGeofencesToLocalStoragelambda0 storeregisteredgeofencestolocalstoragelambda0, com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, setHeaderTextColor setheadertextcolor, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, getNotificationPriorityInt getnotificationpriorityint) {
        super(configurationManager, storeregisteredgeofencestolocalstoragelambda0);
        configurationManager.getClass();
        storeregisteredgeofencestolocalstoragelambda0.getClass();
        cVar.getClass();
        parselonglambda0.getClass();
        getcooldownenterseconds.getClass();
        component4android_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        setheadertextcolor.getClass();
        r8lambdaw447glwjfoun4bg91upxnadqezs.getClass();
        getnotificationpriorityint.getClass();
        this.IconCompatParcelizer = cVar;
        this.write = parselonglambda0;
        this.read = getcooldownenterseconds;
        this.serializer = component4android_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = migratefeatureflagstoragetojsonlambda20;
        this.MediaSessionCompatQueueItem = setheadertextcolor;
        this.MediaMetadataCompat = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.MediaDescriptionCompat = getnotificationpriorityint;
    }

    private final Long RatingCompat() {
        com.sentiance.sdk.util.c cVar = this.IconCompatParcelizer;
        if (cVar.write("KEY_OLDEST_UNPROCESSED_FEEDBACK_TIME")) {
            return Long.valueOf(cVar.IconCompatParcelizer("KEY_OLDEST_UNPROCESSED_FEEDBACK_TIME", -1L));
        }
        return null;
    }

    @Override // o.getStoryStyle, o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        Long lRatingCompat = RatingCompat();
        if (lRatingCompat != null) {
            long jLongValue = lRatingCompat.longValue();
            getCooldownEnterSeconds getcooldownenterseconds = this.read;
            getcooldownenterseconds.getClass();
            Optional optionalWrite = getcooldownenterseconds.write(jLongValue - 1, Collections.singletonList(invokeSuspendlambda1.class), true);
            if (optionalWrite.IconCompatParcelizer()) {
                Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> mapSingletonMap = Collections.singletonMap(invokeSuspendlambda1.class, Long.valueOf(((getCooldownEnterSeconds.read) optionalWrite.write()).RemoteActionCompatParcelizer()));
                mapSingletonMap.getClass();
                return mapSingletonMap;
            }
        }
        return SimpleItemTouchHelperCallback.serializer;
    }

    @Override // o.getStoryStyle
    public final getNotificationStyle serializer() {
        if (RemoteActionCompatParcelizer()) {
            return MediaDescriptionCompat();
        }
        getNotificationStyle.write.getClass();
        return getNotificationStyle.serializer.IconCompatParcelizer();
    }

    @Override // o.getStoryStyle
    public final getNotificationStyle IconCompatParcelizer(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog r8lambdaqoukgs6h1gfby4ttokxnao8yog, long j) {
        r8lambdaqoukgs6h1gfby4ttokxnao8yog.getClass();
        List list = r8lambdaqoukgs6h1gfby4ttokxnao8yog.write;
        InAppMessageFull.read().getClass();
        if (list.contains((byte) 1) && RemoteActionCompatParcelizer()) {
            return MediaDescriptionCompat();
        }
        getNotificationStyle.write.getClass();
        return getNotificationStyle.serializer.IconCompatParcelizer();
    }
}
