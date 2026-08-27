package com.google.gson;

import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.memory.MemoryCacheService;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.SessionEvents;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.metrics.MetricsBatchProcessor;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import o.AccessibilityIterators;
import o.AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DpTouchBoundsExpansiona9UjIt4;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.LookaheadDelegateKt;
import o.MeasureScopeWithLayoutNodeKtWhenMappings;
import o.OuterPlacementScope;
import o.PausedPrecompositionImpl;
import o.accessgetBrightnessDowncp;
import o.didInsert;
import o.ensureSubscribedToInAppMessageEvents;
import o.getHasPendingMeasureOrLayout;
import o.getInspectorValues;
import o.getPlacementScope;
import o.removeDelayedExecution;
import o.requestFocusCurrent;
import o.requestRelayoutdefault;
import o.traceMeasureLayout;
import o.trimChain;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Gson$$ExternalSyntheticBUOutline0 implements OuterPlacementScope, MeasureScopeWithLayoutNodeKtWhenMappings, accessgetBrightnessDowncp, getPlacementScope, OnSuccessListener, trimChain, Consumer, BiFunction, Predicate, FlowableOnSubscribe, PausedPrecompositionImpl, ObjectConstructor {
    public final /* synthetic */ int $r8$classId;

    @Override // io.reactivex.FlowableOnSubscribe
    public void subscribe(FlowableEmitter flowableEmitter) {
    }

    public /* synthetic */ Gson$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    @Override // o.MeasureScopeWithLayoutNodeKtWhenMappings
    public Object parse(JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        int i;
        int i2 = this.$r8$classId;
        if (i2 == 2) {
            jsonReader.beginObject();
            byte b3 = 0;
            int iNextInt = 0;
            String strNextString = null;
            List listIconCompatParcelizer = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -1266514778) {
                    if (iHashCode != 3373707) {
                        if (iHashCode == 2125650548 && strNextName.equals("importance")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("name")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("frames")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    listIconCompatParcelizer = didInsert.IconCompatParcelizer(jsonReader, new Gson$$ExternalSyntheticBUOutline0(4));
                    if (listIconCompatParcelizer == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null frames");
                        return null;
                    }
                } else if (b == 1) {
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null name");
                        return null;
                    }
                } else if (b != 2) {
                    jsonReader.skipValue();
                } else {
                    iNextInt = jsonReader.nextInt();
                    b3 = (byte) (b3 | 1);
                }
            }
            jsonReader.endObject();
            if (b3 == 1 && strNextString != null && listIconCompatParcelizer != null) {
                return new getHasPendingMeasureOrLayout(listIconCompatParcelizer, iNextInt, strNextString);
            }
            StringBuilder sb = new StringBuilder();
            if (strNextString == null) {
                sb.append(" name");
            }
            if ((b3 & 1) == 0) {
                sb.append(" importance");
            }
            if (listIconCompatParcelizer == null) {
                sb.append(" frames");
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }
        if (i2 != 3) {
            return didInsert.serializer(jsonReader);
        }
        jsonReader.beginObject();
        byte b4 = 0;
        String strNextString2 = null;
        String str = null;
        long jNextLong = 0;
        long jNextLong2 = 0;
        while (jsonReader.hasNext()) {
            String strNextName2 = jsonReader.nextName();
            strNextName2.getClass();
            switch (strNextName2) {
                case "name":
                    b2 = 0;
                    break;
                case "size":
                    b2 = 1;
                    break;
                case "uuid":
                    b2 = 2;
                    break;
                case "baseAddress":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 == 1) {
                    jNextLong2 = jsonReader.nextLong();
                    i = b4 | 2;
                } else if (b2 == 2) {
                    str = new String(Base64.decode(jsonReader.nextString(), 2), traceMeasureLayout.PlaybackStateCompat);
                } else if (b2 != 3) {
                    jsonReader.skipValue();
                } else {
                    jNextLong = jsonReader.nextLong();
                    i = b4 | 1;
                }
                b4 = (byte) i;
            } else {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null name");
                    return null;
                }
            }
        }
        jsonReader.endObject();
        if (b4 == 3 && strNextString2 != null) {
            return new requestRelayoutdefault(jNextLong, jNextLong2, strNextString2, str);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b4 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b4 & 2) == 0) {
            sb2.append(" size");
        }
        if (strNextString2 == null) {
            sb2.append(" name");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb2));
        return null;
    }

    @Override // io.reactivex.functions.Predicate
    public boolean read(Object obj) {
        DpTouchBoundsExpansiona9UjIt4 dpTouchBoundsExpansiona9UjIt4 = (DpTouchBoundsExpansiona9UjIt4) obj;
        return (TextUtils.isEmpty(dpTouchBoundsExpansiona9UjIt4.read) || TextUtils.isEmpty(dpTouchBoundsExpansiona9UjIt4.IconCompatParcelizer.IconCompatParcelizer)) ? false : true;
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        if (this.$r8$classId == 12) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        } else {
            Locale locale = Locale.US;
            ((FetchEligibleCampaignsResponse) obj).getMessagesList().size();
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
        }
    }

    @Override // o.accessgetBrightnessDowncp
    public Object apply(Object obj) {
        int i = this.$r8$classId;
        if (i == 5) {
            getInspectorValues.RemoteActionCompatParcelizer.getClass();
            return didInsert.IconCompatParcelizer.IconCompatParcelizer((traceMeasureLayout) obj).getBytes(Charset.forName(Constants.ENCODING));
        }
        if (i == 17) {
            return (byte[]) obj;
        }
        if (i == 20) {
            return ((PerfMetric) obj).toByteArray();
        }
        AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1 = (AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1) obj;
        String strIconCompatParcelizer = SessionEvents.read.IconCompatParcelizer(androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1);
        strIconCompatParcelizer.getClass();
        androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1.serializer.name();
        byte[] bytes = strIconCompatParcelizer.getBytes(ensureSubscribedToInAppMessageEvents.write);
        bytes.getClass();
        return bytes;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        int i = this.$r8$classId;
        if (i != 27) {
            return i != 28 ? ConstructorConstructor.lambda$newMapConstructor$16() : ConstructorConstructor.lambda$newMapConstructor$15();
        }
        return ConstructorConstructor.lambda$newMapConstructor$14();
    }

    @Override // o.getPlacementScope
    public Object create(MetricsBatchProcessor metricsBatchProcessor) {
        int i = this.$r8$classId;
        if (i == 18) {
            return FirebaseInstallationsRegistrar.lambda$getComponents$0(metricsBatchProcessor);
        }
        if (i == 19) {
            return FirebasePerfRegistrar.providesFirebasePerformance(metricsBatchProcessor);
        }
        if (i != 21) {
            if (i == 25) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(metricsBatchProcessor);
            }
            switch (i) {
                case 6:
                    return TransportRegistrar.lambda$getComponents$0(metricsBatchProcessor);
                case 7:
                    return TransportRegistrar.lambda$getComponents$1(metricsBatchProcessor);
                case 8:
                    return TransportRegistrar.lambda$getComponents$2(metricsBatchProcessor);
                case 9:
                    return FirestoreRegistrar.lambda$getComponents$0(metricsBatchProcessor);
                default:
                    return FirebaseSessionsRegistrar.getComponents$lambda$1(metricsBatchProcessor);
            }
        }
        Set set = metricsBatchProcessor.read(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(removeDelayedExecution.class));
        MemoryCacheService memoryCacheService = MemoryCacheService.read;
        if (memoryCacheService == null) {
            synchronized (MemoryCacheService.class) {
                memoryCacheService = MemoryCacheService.read;
                if (memoryCacheService == null) {
                    memoryCacheService = new MemoryCacheService(1, false);
                    MemoryCacheService.read = memoryCacheService;
                }
            }
        }
        return new requestFocusCurrent(set, memoryCacheService);
    }

    public /* synthetic */ Gson$$ExternalSyntheticBUOutline0(int i, Object obj) {
        this.$r8$classId = i;
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            LookaheadDelegateKt lookaheadDelegateKt = (LookaheadDelegateKt) task.getResult();
            String str = lookaheadDelegateKt.RemoteActionCompatParcelizer;
            Log.isLoggable("FirebaseCrashlytics", 3);
            File file = lookaheadDelegateKt.IconCompatParcelizer;
            if (file.delete()) {
                file.getPath();
                Log.isLoggable("FirebaseCrashlytics", 3);
            } else {
                SentryLogcatAdapter.write("FirebaseCrashlytics", "Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // io.reactivex.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new DpTouchBoundsExpansiona9UjIt4((String) obj, (AccessibilityIterators) obj2);
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
    }
}
