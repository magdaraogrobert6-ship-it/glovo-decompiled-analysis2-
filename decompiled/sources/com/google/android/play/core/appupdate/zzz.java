package com.google.android.play.core.appupdate;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.memory.MemoryCacheService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.roadrunner.appperformance.AppPerformanceAttributesValueProvider;
import com.roadrunner.appperformance.performance.AppPerformanceAttributesValueProviderImpl;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.country.config.implementation.data.CountryConfigFallbackDataSource;
import com.roadrunner.delivery.accept.acknowledgment.implementation.data.TimestampRepositoryImpl;
import com.roadrunner.delivery.accept.acknowledgment.implementation.domain.ContainsAcknowledgmentTimestamp$invoke$1;
import io.reactivex.FlowableEmitter;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.io.File;
import java.io.FileInputStream;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AndroidFontResolveInterceptor_androidKt;
import o.AnnotatedStringSaverlambda1;
import o.AnnotationRangeListSaverlambda0;
import o.BaselineShiftSaverlambda1;
import o.PausedPrecompositionImpl;
import o.TextUnitTypeSaverlambda1;
import o.accessgetOuterCoordinator;
import o.accessgetRadioButtoncp;
import o.accessgetWindowInsetsTypeMapp;
import o.accessisMainThread;
import o.checkChildrenPlaceOrderForUpdates;
import o.getActiveFocusTargetNode;
import o.getAdapters;
import o.getFocusEK5gGoQ;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getNavigationBars;
import o.getTraversalIndexdelegate;
import o.getValueOverride;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.logTree;
import o.nodeToString;
import o.onItemDismiss;
import o.positionIniSbpLlYui;
import o.r8lambdaEdQQWzTg5FJP9FEnVxOS8uVofXM;
import o.r8lambdaWCDbPWUfYlM_GBXQf0_zfyuQk;
import o.r8lambdaZAOVipOHbM4PifGbUR7Pt0iDfw;
import o.r8lambdaZk1XR2HG058y20NJa5DdotqIgJw;
import o.r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4;
import o.r8lambdagXIqj5qpNkGc4rtyOFC1jDf22k;
import o.r8lambdajGN0R5SNiP8MH4lSXA9ZBKzYFds;
import o.r8lambdakIVDkQwEEMlQwSm85jJjcEOGjQ;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdal8xCa_l9GxweJoXP4OJ7CgbYjs;
import o.r8lambdamuWE7MSz590YWAntMOyrj1VpJNs;
import o.r8lambdapdoga6DS0atY1gN7jHnoJSspjGg;
import o.r8lambdapeqL4UO8g80z6BUezZiEIwNDRQ;
import o.r8lambdayEku4rOwAcdsRfbBJxAM5k6KqXA;
import o.r8lambdayI6xeP9AiNKLsbi32uilsQfpkWw;
import o.rectIntersectsRect;
import o.setDetachedFromParentLookaheadPassui;
import o.setDetachedFromParentLookaheadPlacementui;
import o.setShadow;
import o.speculativeHit;
import o.unpackMetaParentId;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class zzz implements setDetachedFromParentLookaheadPlacementui, positionIniSbpLlYui, PausedPrecompositionImpl, nodeToString, setShadow {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public Object serializer;

    public zzz(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq5.getClass();
        this.serializer = SQLite.read(r8lambdaZk1XR2HG058y20NJa5DdotqIgJw.IconCompatParcelizer, BaselineShiftSaverlambda1.write, r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdayEku4rOwAcdsRfbBJxAM5k6KqXA.IconCompatParcelizer, AnnotatedStringSaverlambda1.RemoteActionCompatParcelizer, r8lambdagXIqj5qpNkGc4rtyOFC1jDf22k.RemoteActionCompatParcelizer, r8lambdal8xCa_l9GxweJoXP4OJ7CgbYjs.serializer, r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdapdoga6DS0atY1gN7jHnoJSspjGg.write, r8lambdayI6xeP9AiNKLsbi32uilsQfpkWw.write, r8lambdapeqL4UO8g80z6BUezZiEIwNDRQ.read, AnnotationRangeListSaverlambda0.read, r8lambdaktwlyipskq3tfa9ey3gatonixfq3, r8lambdakIVDkQwEEMlQwSm85jJjcEOGjQ.RemoteActionCompatParcelizer, r8lambdajGN0R5SNiP8MH4lSXA9ZBKzYFds.write, r8lambdaktwlyipskq3tfa9ey3gatonixfq4, r8lambdamuWE7MSz590YWAntMOyrj1VpJNs.read, r8lambdaktwlyipskq3tfa9ey3gatonixfq5);
    }

    @Override // o.setShadow
    public Map write() {
        int i = 2 % 2;
        int i2 = write + 1;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ConcurrentHashMap concurrentHashMap = ((AppPerformanceAttributesValueProviderImpl) ((AppPerformanceAttributesValueProvider) this.serializer)).serializer;
        int i4 = write + 121;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return concurrentHashMap;
    }

    @Override // o.positionIniSbpLlYui
    public void read(Bundle bundle) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((logTree) this.serializer).serializer("clx", "_ae", bundle);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ((logTree) this.serializer).serializer("clx", "_ae", bundle);
        int i3 = write + 37;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // o.nodeToString
    public void RemoteActionCompatParcelizer(int i, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 73;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (i == 2) {
            ((FlowableEmitter) this.serializer).write(bundle.getString("events"));
            int i5 = RemoteActionCompatParcelizer + 39;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        int i = 2 % 2;
        getAdapters getadapters = (getAdapters) obj;
        zzbv zzbvVar = (zzbv) this.serializer;
        Object obj2 = null;
        if (getadapters != null) {
            checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates = (checkChildrenPlaceOrderForUpdates) zzbvVar.RemoteActionCompatParcelizer;
            checkChildrenPlaceOrderForUpdates.write(checkchildrenplaceorderforupdates);
            checkchildrenplaceorderforupdates.ParcelableVolumeInfo.serializer(null, checkchildrenplaceorderforupdates.MediaDescriptionCompat.read);
            checkchildrenplaceorderforupdates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(null);
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
        int i2 = write + 73;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SentryLogcatAdapter.write("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
        zzw zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        int i4 = RemoteActionCompatParcelizer + 73;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return zzwVarRemoteActionCompatParcelizer;
        }
        obj2.hashCode();
        throw null;
    }

    public accessgetRadioButtoncp RemoteActionCompatParcelizer(Uri uri) {
        int i = 2 % 2;
        int i2 = write + 43;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (uri != null) {
            Iterator it = ((List) this.serializer).iterator();
            while (!(!it.hasNext())) {
                int i4 = write + 45;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                r8lambdaZAOVipOHbM4PifGbUR7Pt0iDfw r8lambdazaovipohbm4pifgbur7pt0idfwIconCompatParcelizer = ((r8lambdaWCDbPWUfYlM_GBXQf0_zfyuQk) ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) it.next()).write()).IconCompatParcelizer(uri);
                if (r8lambdazaovipohbm4pifgbur7pt0idfwIconCompatParcelizer instanceof r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4) {
                    int i6 = write + 13;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return ((r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4) r8lambdazaovipohbm4pifgbur7pt0idfwIconCompatParcelizer).serializer();
                    }
                    int i7 = 51 / 0;
                    return ((r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4) r8lambdazaovipohbm4pifgbur7pt0idfwIconCompatParcelizer).serializer();
                }
            }
        }
        return r8lambdaEdQQWzTg5FJP9FEnVxOS8uVofXM.read;
    }

    public String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        getTraversalIndexdelegate gettraversalindexdelegateRemoteActionCompatParcelizer = ((AuthRepository) this.serializer).serializer.RemoteActionCompatParcelizer();
        Object obj = null;
        if (gettraversalindexdelegateRemoteActionCompatParcelizer != null) {
            int i2 = RemoteActionCompatParcelizer + 7;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                String str2 = gettraversalindexdelegateRemoteActionCompatParcelizer.accessToken;
                obj.hashCode();
                throw null;
            }
            str = gettraversalindexdelegateRemoteActionCompatParcelizer.accessToken;
        } else {
            int i3 = RemoteActionCompatParcelizer + 37;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            str = null;
        }
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Access token is null");
            return null;
        }
        int i5 = write + 31;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return str;
    }

    public getAdapters write(JSONObject jSONObject) {
        getValueOverride playbackStateCompatCustomAction;
        int i = 2 % 2;
        int i2 = write + 51;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = jSONObject.getInt("settings_version");
        int i5 = 27;
        if (i4 != 3) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i4 + ". Using default settings values.", null);
            playbackStateCompatCustomAction = new getIntentArrayWithConfiguredBackStacklambda4(i5);
        } else {
            playbackStateCompatCustomAction = new PlaybackStateCompatCustomAction(i5);
        }
        getAdapters getadapters = playbackStateCompatCustomAction.read((speculativeHit) this.serializer, jSONObject);
        int i6 = write + 39;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return getadapters;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037 A[PHI: r6
  0x0037: PHI (r6v5 java.security.Provider) = (r6v4 java.security.Provider), (r6v7 java.security.Provider) binds: [B:10:0x0035, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.setDetachedFromParentLookaheadPlacementui
    public Object IconCompatParcelizer(String str) {
        Provider provider;
        int i = 2 % 2;
        setDetachedFromParentLookaheadPassui setdetachedfromparentlookaheadpassui = (setDetachedFromParentLookaheadPassui) this.serializer;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = write + 95;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                provider = Security.getProvider(strArr[i2]);
                int i4 = 51 / 0;
                if (provider != null) {
                    arrayList.add(provider);
                }
            } else {
                provider = Security.getProvider(strArr[i2]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            int i5 = write + 3;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            try {
                return setdetachedfromparentlookaheadpassui.IconCompatParcelizer(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return setdetachedfromparentlookaheadpassui.IconCompatParcelizer(str, null);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0055: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:22:0x0055 */
    public JSONObject read() throws Throwable {
        Exception e;
        FileInputStream fileInputStreamWrite;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        int i = 2 % 2;
        Log.isLoggable("FirebaseCrashlytics", 3);
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File file = (File) this.serializer;
                if (file.exists()) {
                    fileInputStreamWrite = getActiveFocusTargetNode.write(file, new FileInputStream(file));
                    try {
                        jSONObject = new JSONObject(accessgetOuterCoordinator.RemoteActionCompatParcelizer(fileInputStreamWrite));
                        int i2 = write + 7;
                        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        fileInputStream2 = fileInputStreamWrite;
                    } catch (Exception e2) {
                        e = e2;
                        SentryLogcatAdapter.read("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        accessgetOuterCoordinator.IconCompatParcelizer(fileInputStreamWrite, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    jSONObject = null;
                }
                accessgetOuterCoordinator.IconCompatParcelizer(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                accessgetOuterCoordinator.IconCompatParcelizer(fileInputStream2, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e3) {
            int i4 = write + 13;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            e = e3;
            fileInputStreamWrite = null;
        } catch (Throwable th2) {
            th = th2;
            accessgetOuterCoordinator.IconCompatParcelizer(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m4472invokegIAlus(long j, ContinuationImpl continuationImpl) {
        ContainsAcknowledgmentTimestamp$invoke$1 containsAcknowledgmentTimestamp$invoke$1;
        long j2;
        Exception e;
        int i = 2 % 2;
        if (continuationImpl instanceof ContainsAcknowledgmentTimestamp$invoke$1) {
            containsAcknowledgmentTimestamp$invoke$1 = (ContainsAcknowledgmentTimestamp$invoke$1) continuationImpl;
            int i2 = containsAcknowledgmentTimestamp$invoke$1.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = RemoteActionCompatParcelizer + 65;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                containsAcknowledgmentTimestamp$invoke$1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                containsAcknowledgmentTimestamp$invoke$1 = new ContainsAcknowledgmentTimestamp$invoke$1(this, continuationImpl);
            }
        } else {
            containsAcknowledgmentTimestamp$invoke$1 = new ContainsAcknowledgmentTimestamp$invoke$1(this, continuationImpl);
        }
        Object obj = containsAcknowledgmentTimestamp$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = containsAcknowledgmentTimestamp$invoke$1.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            int i6 = write + 105;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = write + 61;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 62 / 0;
                }
                return null;
            }
            j2 = containsAcknowledgmentTimestamp$invoke$1.serializer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i10 = write + 59;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    return obj;
                }
                throw null;
            } catch (Exception e2) {
                e = e2;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                TextUnitTypeSaverlambda1 textUnitTypeSaverlambda1 = (TextUnitTypeSaverlambda1) this.serializer;
                containsAcknowledgmentTimestamp$invoke$1.serializer = j;
                containsAcknowledgmentTimestamp$invoke$1.RemoteActionCompatParcelizer = 1;
                Object objContains = ((TimestampRepositoryImpl) textUnitTypeSaverlambda1).contains(j, containsAcknowledgmentTimestamp$invoke$1);
                return objContains == coroutineSingletons ? coroutineSingletons : objContains;
            } catch (Exception e3) {
                j2 = j;
                e = e3;
            }
        }
        Timber.RemoteActionCompatParcelizer.write(new Throwable(af$$ExternalSyntheticOutline0.m(j2, "Fetching expiry timestamp failed for "), e));
        return new isItemDismissable(e);
    }

    public /* synthetic */ zzz(getFocusEK5gGoQ getfocusek5ggoq) {
        MemoryCacheService memoryCacheService = new MemoryCacheService(getfocusek5ggoq);
        this.serializer = getNavigationBars.read(new Extras$Key(28, getNavigationBars.read(new EmojiProcessor(getNavigationBars.read(new zzbv(memoryCacheService, 10, getNavigationBars.read(new accessgetWindowInsetsTypeMapp(memoryCacheService, 1)))), getNavigationBars.read(new accessgetWindowInsetsTypeMapp(memoryCacheService, 0)), memoryCacheService, 25))));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Object getCountryConfigs(ContinuationImpl continuationImpl) {
        unpackMetaParentId unpackmetaparentid;
        Object objM4877getFallbackCountryConfigsIoAF18A;
        rectIntersectsRect rectintersectsrect;
        int i = 2 % 2;
        if (!(continuationImpl instanceof unpackMetaParentId)) {
            unpackmetaparentid = new unpackMetaParentId(this, continuationImpl);
            int i2 = RemoteActionCompatParcelizer + 95;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            unpackmetaparentid = (unpackMetaParentId) continuationImpl;
            int i4 = unpackmetaparentid.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                unpackmetaparentid.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                unpackmetaparentid = new unpackMetaParentId(this, continuationImpl);
                int i5 = RemoteActionCompatParcelizer + 95;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        Object obj = unpackmetaparentid.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = unpackmetaparentid.RemoteActionCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            CountryConfigFallbackDataSource countryConfigFallbackDataSource = (CountryConfigFallbackDataSource) this.serializer;
            unpackmetaparentid.RemoteActionCompatParcelizer = 1;
            objM4877getFallbackCountryConfigsIoAF18A = countryConfigFallbackDataSource.m4877getFallbackCountryConfigsIoAF18A(unpackmetaparentid);
            if (objM4877getFallbackCountryConfigsIoAF18A == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4877getFallbackCountryConfigsIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4877getFallbackCountryConfigsIoAF18A instanceof isItemDismissable)) {
            int i8 = write + 61;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                rectintersectsrect = (rectIntersectsRect) objM4877getFallbackCountryConfigsIoAF18A;
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("fetch the fallback country list", new Object[0]);
            } else {
                rectintersectsrect = (rectIntersectsRect) objM4877getFallbackCountryConfigsIoAF18A;
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("fetch the fallback country list", new Object[0]);
            }
            objM4877getFallbackCountryConfigsIoAF18A = accessisMainThread.RemoteActionCompatParcelizer(rectintersectsrect);
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4877getFallbackCountryConfigsIoAF18A);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to map the fallback country list", new Object[0]);
        }
        if (onItemDismiss.serializer(objM4877getFallbackCountryConfigsIoAF18A) != null) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Returning empty fallback country list", new Object[0]);
            return instance_delegatelambda0.write;
        }
        int i9 = RemoteActionCompatParcelizer + 15;
        write = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 1 / 0;
        }
        return objM4877getFallbackCountryConfigsIoAF18A;
    }

    public zzz(AndroidFontResolveInterceptor_androidKt androidFontResolveInterceptor_androidKt) {
        androidFontResolveInterceptor_androidKt.getClass();
        this.serializer = androidFontResolveInterceptor_androidKt;
    }

    public zzz(AuthRepository authRepository) {
        authRepository.getClass();
        this.serializer = authRepository;
    }

    public /* synthetic */ zzz(Object obj) {
        this.serializer = obj;
    }

    public zzz() {
    }
}
