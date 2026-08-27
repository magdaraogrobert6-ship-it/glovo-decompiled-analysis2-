package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.camera.video.Recorder$3;
import androidx.core.provider.CallbackWrapper$2;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.net.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.DoubleConfirmationFragment;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.opportunities.calendar.info.CalendarInformationFragment;
import com.roadrunner.push.core.domain.RegisterPushNotificationUseCaseImpl;
import io.sentry.HostnameCache$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import okio.Options;
import okio.Path$Companion;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class colorResource implements VideoEncoderCrashQuirk, drag12SF9DM, compositeOverOWjLjI, rotateUv8p0NA, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, accessgetNumPadRightParenthesiscp, getNavigateInEK5gGoQ, PausedPrecompositionImpl, setMeasureResultui {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;
    public Object write;

    public ArrayList RemoteActionCompatParcelizer(Class cls, Class cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.IconCompatParcelizer).iterator();
            while (it.hasNext()) {
                List<clipRectrOu3jXo> list = (List) ((HashMap) this.write).get((String) it.next());
                if (list != null) {
                    for (clipRectrOu3jXo cliprectrou3jxo : list) {
                        if (cliprectrou3jxo.serializer.isAssignableFrom(cls) && cls2.isAssignableFrom(cliprectrou3jxo.IconCompatParcelizer) && !arrayList.contains(cliprectrou3jxo.IconCompatParcelizer)) {
                            arrayList.add(cliprectrou3jxo.IconCompatParcelizer);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public List write(String str) {
        List arrayList;
        synchronized (this) {
            if (!((ArrayList) this.IconCompatParcelizer).contains(str)) {
                ((ArrayList) this.IconCompatParcelizer).add(str);
            }
            arrayList = (List) ((HashMap) this.write).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.write).put(str, arrayList);
            }
        }
        return arrayList;
    }

    @Override // o.rotateUv8p0NA
    public void serializer() {
        com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream = (com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) this.IconCompatParcelizer;
        synchronized (recyclableBufferedInputStream) {
            recyclableBufferedInputStream.IconCompatParcelizer = recyclableBufferedInputStream.serializer.length;
        }
    }

    @Override // o.compositeOverOWjLjI
    public String getSql() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) this.write;
        int i4 = i3 + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    @Override // o.getNavigateInEK5gGoQ
    public void serializer(scale0AR0LA0default scale0ar0la0default) {
        int i = 2 % 2;
        throw new IllegalStateException();
    }

    public colorResource(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, int i) {
        this.serializer = i;
        int i2 = 3;
        switch (i) {
            case 17:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                this.write = new readInstallReferrerHuaweiAppGallery(6);
                break;
            case 18:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt(getstyleable_vector_drawable_group_rotation.onDestroy, 12);
                mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.toClipEntry;
                int i3 = 4;
                PreferenceGroupAdapter preferenceGroupAdapter = new PreferenceGroupAdapter(new AndroidIndirectPointerEvent_androidKt(mergejsonobjects, 11), mergejsonobjects, i3);
                AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt2 = getstyleable_vector_drawable_group_rotation.ContextMenuScope;
                r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw = getstyleable_vector_drawable_group_rotation.getSupportCompoundDrawablesTintList;
                acquire acquireVar = getstyleable_vector_drawable_group_rotation.onNightModeChanged;
                this.write = new ba(androidIndirectPointerEvent_androidKt, preferenceGroupAdapter, new applyLayoutFeatures(androidIndirectPointerEvent_androidKt2, r8lambda6uovp7lvejigbq5knkop8a0veiw, acquireVar, i3), new applyLayoutFeatures(androidIndirectPointerEvent_androidKt2, r8lambda6uovp7lvejigbq5knkop8a0veiw, acquireVar, i2), getstyleable_vector_drawable_group_rotation.NonTouchScrollingLogic, mergejsonobjects, new acquire(getstyleable_vector_drawable_group_rotation.setItemInvoker, getstyleable_vector_drawable_group_rotation.setForceShowIcon, 8), getstyleable_vector_drawable_group_rotation.valueOf);
                break;
            case 19:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                this.write = new applyLayoutFeatures(getstyleable_vector_drawable_group_rotation.access201, getstyleable_vector_drawable_group_rotation.CodecStuckOnFlushQuirk, getstyleable_vector_drawable_group_rotation.Contentfoundation, 7);
                break;
            default:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                this.write = new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.toClipEntry, i2);
                break;
        }
    }

    @Override // o.compositeOverOWjLjI
    public void bindTo(getComponents8_81llA getcomponents8_81lla) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ColorKt.write(getcomponents8_81lla, (Object[]) this.IconCompatParcelizer);
            throw null;
        }
        ColorKt.write(getcomponents8_81lla, (Object[]) this.IconCompatParcelizer);
        int i3 = read + 105;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getNavigateInEK5gGoQ
    public void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((ParentDataModifierDefaultImpls) this.write).write(null);
        int i4 = RemoteActionCompatParcelizer + 75;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.drag12SF9DM
    public boolean RemoteActionCompatParcelizer() {
        boolean zRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            zRemoteActionCompatParcelizer = ((drag12SF9DM) this.IconCompatParcelizer).RemoteActionCompatParcelizer();
            int i3 = 64 / 0;
        } else {
            zRemoteActionCompatParcelizer = ((drag12SF9DM) this.IconCompatParcelizer).RemoteActionCompatParcelizer();
        }
        int i4 = read + 97;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return zRemoteActionCompatParcelizer;
        }
        throw null;
    }

    @Override // o.rotateUv8p0NA
    public void read(Bitmap bitmap, getD getd) throws IOException {
        int i = 2 % 2;
        IOException iOException = ((DrawTransformDefaultImpls) this.write).serializer;
        if (iOException != null) {
            int i2 = read;
            int i3 = i2 + 69;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (bitmap == null) {
                throw iOException;
            }
            int i5 = i2 + 81;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getd.read(bitmap);
                throw iOException;
            }
            getd.read(bitmap);
            int i6 = 52 / 0;
            throw iOException;
        }
    }

    @Override // o.setMeasureResultui
    public void v_() {
        int i = 2 % 2;
        ((getTextInputService) this.IconCompatParcelizer).serializer(incrementSensitiveComponentCount.INDEX_BACKFILL, 15000L, new RxWorker$1$$ExternalSyntheticLambda0(19, this));
        int i2 = read + 57;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public void serializer(FocusOwnerdispatchKeyEvent1 focusOwnerdispatchKeyEvent1) {
        int i = 2 % 2;
        int i2 = read + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = focusOwnerdispatchKeyEvent1.IconCompatParcelizer;
            obj.hashCode();
            throw null;
        }
        getInternalPopup getinternalpopup = (getInternalPopup) this.write;
        androidx.camera.view.PendingValue pendingValue = (androidx.camera.view.PendingValue) this.IconCompatParcelizer;
        int i4 = focusOwnerdispatchKeyEvent1.IconCompatParcelizer;
        if (i4 == 0) {
            getinternalpopup.execute(new zza(pendingValue, 4, focusOwnerdispatchKeyEvent1.serializer));
            int i5 = RemoteActionCompatParcelizer + 55;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        getinternalpopup.execute(new CallbackWrapper$2(pendingValue, i4, 0));
        int i6 = read + 121;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.drag12SF9DM
    public List write(Integer num) {
        int i = 2 % 2;
        int i2 = read + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        List listWrite = ((drag12SF9DM) this.IconCompatParcelizer).write(null);
        getType gettype = (getType) this.write;
        int i4 = gettype.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (i4 >= 0) {
            return onContentCardDismissed.IconCompatParcelizer(listWrite, com.sentiance.protobuf.j.IconCompatParcelizer(gettype, num, i4, Integer.valueOf(gettype.serializer(gettype.PlaybackStateCompatCustomAction, i4))));
        }
        int i5 = read + 75;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return listWrite;
        }
        obj.hashCode();
        throw null;
    }

    public void read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) ((NoWindowInsetsAnimation) this.write).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        SparseArray sparseArrayMediaSessionCompatQueueItem = lookaheadScopeKt.MediaSessionCompatQueueItem();
        zzoh zzohVar = (zzoh) this.IconCompatParcelizer;
        sparseArrayMediaSessionCompatQueueItem.put(zzohVar.RemoteActionCompatParcelizer, Long.valueOf(zzohVar.write));
        LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
        int[] iArr = new int[sparseArrayMediaSessionCompatQueueItem.size()];
        long[] jArr = new long[sparseArrayMediaSessionCompatQueueItem.size()];
        int i4 = 0;
        while (i4 < sparseArrayMediaSessionCompatQueueItem.size()) {
            int i5 = RemoteActionCompatParcelizer + 103;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                iArr[i4] = sparseArrayMediaSessionCompatQueueItem.keyAt(i4);
                jArr[i4] = ((Long) sparseArrayMediaSessionCompatQueueItem.valueAt(i4)).longValue();
                i4 += 63;
            } else {
                iArr[i4] = sparseArrayMediaSessionCompatQueueItem.keyAt(i4);
                jArr[i4] = ((Long) sparseArrayMediaSessionCompatQueueItem.valueAt(i4)).longValue();
                i4++;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        lookaheadScopeKt2.MediaBrowserCompatMediaItem.serializer(bundle);
        int i6 = RemoteActionCompatParcelizer + 69;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 56 / 0;
        }
    }

    @Override // o.getNavigateInEK5gGoQ
    public scale0AR0LA0default write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        scale0AR0LA0default scale0ar0la0default = (scale0AR0LA0default) this.IconCompatParcelizer;
        int i5 = i3 + 27;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return scale0ar0la0default;
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        if (i4 == 22) {
            accessgetTvAudioDescriptioncp accessgettvaudiodescriptioncp = new accessgetTvAudioDescriptioncp((zay) this.IconCompatParcelizer, (ParentDataModifierDefaultImpls) obj2, 1);
            accessgetTvAudioDescriptionMixingVolumeDowncp accessgettvaudiodescriptionmixingvolumedowncp = (accessgetTvAudioDescriptionMixingVolumeDowncp) ((accessgetTvContentsMenucp) obj).MediaSessionCompatResultReceiverWrapper();
            ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) this.write;
            Parcel parcelWrite = accessgettvaudiodescriptionmixingvolumedowncp.write();
            int i5 = getBEK5gGoQ.serializer;
            parcelWrite.writeStrongBinder(accessgettvaudiodescriptioncp);
            getBEK5gGoQ.serializer(parcelWrite, apiFeatureRequest);
            parcelWrite.writeStrongBinder(null);
            accessgettvaudiodescriptionmixingvolumedowncp.RemoteActionCompatParcelizer(2, parcelWrite);
            return;
        }
        if (i4 != 23) {
            ((zzdz) obj).read((PendingIntent) this.IconCompatParcelizer, (LocationRequest) this.write, (ParentDataModifierDefaultImpls) obj2);
            int i6 = read + 115;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        getMediaPauseEK5gGoQ getmediapauseek5ggoq = new getMediaPauseEK5gGoQ((ParentDataModifierDefaultImpls) obj2);
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) ((getNumPadAddEK5gGoQ) obj).MediaSessionCompatResultReceiverWrapper();
        PendingIntent pendingIntent = (PendingIntent) this.IconCompatParcelizer;
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) this.write;
        Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, pendingIntent);
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, sleepSegmentRequest);
        parcelZza.writeStrongBinder(getmediapauseek5ggoq);
        getnumpaddeleteek5ggoq.zzc(79, parcelZza);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0050 A[Catch: IOException -> 0x009c, TRY_ENTER, TryCatch #0 {IOException -> 0x009c, blocks: (B:3:0x0004, B:4:0x000e, B:6:0x0011, B:10:0x002b, B:14:0x003c, B:24:0x0050, B:25:0x0053, B:26:0x0058, B:28:0x005d, B:32:0x006d, B:33:0x007e), top: B:41:0x0004 }] */
    public static colorResource RemoteActionCompatParcelizer(String... strArr) {
        String str;
        int i = 2 % 2;
        try {
            RequestBuilder[] requestBuilderArr = new RequestBuilder[strArr.length];
            RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
            boolean z = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str2 = strArr[i2];
                String[] strArr2 = com.airbnb.lottie.parser.moshi.JsonReader.IconCompatParcelizer;
                registryMissingComponentException.read(34);
                int length = str2.length();
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = read + 89;
                    RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    char cCharAt = str2.charAt(i4);
                    if (cCharAt < 128) {
                        int i7 = RemoteActionCompatParcelizer + 83;
                        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i3 < i4) {
                                registryMissingComponentException.IconCompatParcelizer(i3, i4, str2);
                            }
                            registryMissingComponentException.IconCompatParcelizer(str);
                            i3 = i4 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i3 < i4) {
                            registryMissingComponentException.IconCompatParcelizer(i3, i4, str2);
                        }
                        registryMissingComponentException.IconCompatParcelizer(str);
                        i3 = i4 + 1;
                    }
                }
                if (i3 < length) {
                    registryMissingComponentException.IconCompatParcelizer(i3, length, str2);
                    int i9 = RemoteActionCompatParcelizer + 101;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        int i10 = 2 % 4;
                    }
                }
                registryMissingComponentException.read(34);
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                requestBuilderArr[i2] = registryMissingComponentException.RemoteActionCompatParcelizer(registryMissingComponentException.size);
            }
            colorResource colorresource = new colorResource((String[]) strArr.clone(), Options.Companion.serializer(requestBuilderArr), z, 13);
            int i11 = read + 85;
            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                return colorresource;
            }
            throw null;
        } catch (IOException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }

    public /* synthetic */ colorResource(getMediaFastForwardEK5gGoQ getmediafastforwardek5ggoq, PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        this.serializer = 23;
        this.IconCompatParcelizer = pendingIntent;
        this.write = sleepSegmentRequest;
    }

    public /* synthetic */ colorResource(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
    }

    public /* synthetic */ colorResource(Object obj, Object obj2, boolean z, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
    }

    public colorResource(accessgetTvTeletextcp accessgettvteletextcp) {
        this.serializer = 26;
        this.write = new setCountrylambda1();
        this.IconCompatParcelizer = accessgettvteletextcp;
        setApproachMeasureRequiredui.RemoteActionCompatParcelizer();
    }

    public colorResource(getContentViewGroupParentLayout getcontentviewgroupparentlayout, RegisterPushNotificationUseCaseImpl registerPushNotificationUseCaseImpl) {
        this.serializer = 20;
        getcontentviewgroupparentlayout.getClass();
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.write = registerPushNotificationUseCaseImpl;
    }

    public colorResource(String str) {
        this.serializer = 12;
        this.write = str;
        this.IconCompatParcelizer = null;
    }

    public colorResource(int i) {
        this.serializer = i;
        if (i != 15) {
            this.IconCompatParcelizer = (androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk) getSurfaceProvider.read.read(androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.class);
            this.write = (androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk) getSurfaceProvider.read.read(androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.class);
        } else {
            this.IconCompatParcelizer = new ArrayList();
            this.write = new HashMap();
        }
    }

    public colorResource(setDropDownWidth setdropdownwidth) {
        this.serializer = 1;
        this.write = setdropdownwidth;
    }

    public /* synthetic */ colorResource(int i, boolean z) {
        this.serializer = i;
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) throws Throwable {
        io.sentry.instrumentation.file.MediaSessionCompatQueueItem mediaSessionCompatQueueItem;
        int i = 2 % 2;
        access500 access500Var = (access500) this.write;
        JSONObject jSONObject = (JSONObject) ((CrashlyticsWorkers) this.IconCompatParcelizer).IconCompatParcelizer.read.submit(new HostnameCache$$ExternalSyntheticLambda1(2, this)).get();
        io.sentry.instrumentation.file.MediaSessionCompatQueueItem mediaSessionCompatQueueItem2 = null;
        if (jSONObject != null) {
            getAdapters getadaptersWrite = ((zzz) access500Var.IconCompatParcelizer).write(jSONObject);
            zzz zzzVar = (zzz) access500Var.write;
            long j = getadaptersWrite.write;
            zzzVar.getClass();
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                jSONObject.put(com.braze.models.Banner.EXPIRATION, j);
                mediaSessionCompatQueueItem = new io.sentry.instrumentation.file.MediaSessionCompatQueueItem(new io.sentry.instrumentation.file.serializer(io.sentry.instrumentation.file.serializer.IconCompatParcelizer((File) zzzVar.serializer, null, false)));
                try {
                    try {
                        mediaSessionCompatQueueItem.write(jSONObject.toString());
                        mediaSessionCompatQueueItem.flush();
                    } catch (Exception e) {
                        e = e;
                        SentryLogcatAdapter.read("FirebaseCrashlytics", "Failed to cache settings", e);
                        int i2 = read + 91;
                        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaSessionCompatQueueItem2 = mediaSessionCompatQueueItem;
                    accessgetOuterCoordinator.IconCompatParcelizer(mediaSessionCompatQueueItem2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                mediaSessionCompatQueueItem = null;
            } catch (Throwable th2) {
                th = th2;
                accessgetOuterCoordinator.IconCompatParcelizer(mediaSessionCompatQueueItem2, "Failed to close settings writer.");
                throw th;
            }
            accessgetOuterCoordinator.IconCompatParcelizer(mediaSessionCompatQueueItem, "Failed to close settings writer.");
            int i4 = read + 29;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            jSONObject.toString();
            Log.isLoggable("FirebaseCrashlytics", 3);
            String str = ((getInspectableElements) access500Var.serializer).MediaSessionCompatQueueItem;
            SharedPreferences.Editor editorEdit = ((Context) access500Var.RatingCompat).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            ((AtomicReference) access500Var.MediaMetadataCompat).set(getadaptersWrite);
            ((ParentDataModifierDefaultImpls) ((AtomicReference) access500Var.RemoteActionCompatParcelizer).get()).write(getadaptersWrite);
        }
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        if (((androidx.camera.camera2.internal.Camera2CameraImpl) r7.write).MediaBrowserCompatMediaItem == 0) goto L55;
     */
    @Override // o.VideoEncoderCrashQuirk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a_(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.colorResource.a_(java.lang.Object):void");
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        switch (this.serializer) {
            case 16:
                CalendarInformationFragment calendarInformationFragment = (CalendarInformationFragment) obj;
                calendarInformationFragment.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer).PlaybackStateCompatCustomAction();
                calendarInformationFragment.getNavigationEventDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((lambdaprocessAndResolveDeeplink15) this.write);
                return;
            case 17:
                DoubleConfirmationFragment doubleConfirmationFragment = (DoubleConfirmationFragment) obj;
                doubleConfirmationFragment.onCreate = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer).PlaybackStateCompatCustomAction();
                doubleConfirmationFragment.getSavedStateRegistry = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((readInstallReferrerHuaweiAppGallery) this.write);
                return;
            case 18:
                GalleryFragment galleryFragment = (GalleryFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer;
                galleryFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                galleryFragment.onConfigurationChanged = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((ba) this.write);
                galleryFragment.getOnBackPressedDispatcher = new IsFixableByRetry(18);
                galleryFragment.getNavigationEventDispatcher = new com.huawei.wisesecurity.ucs_credential.g0(0);
                int iIconCompatParcelizer = bo.app.n5.IconCompatParcelizer();
                int iIconCompatParcelizer2 = bo.app.n5.IconCompatParcelizer();
                galleryFragment.getSavedStateRegistry = new CreateHomeScope((BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer2));
                int i3 = RemoteActionCompatParcelizer + 95;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 72 / 0;
                    return;
                }
                return;
            default:
                StackedDeliveryDetailsFragment stackedDeliveryDetailsFragment = (StackedDeliveryDetailsFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation2 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer;
                stackedDeliveryDetailsFragment.getSavedStateRegistry = getstyleable_vector_drawable_group_rotation2.PlaybackStateCompatCustomAction();
                stackedDeliveryDetailsFragment.invalidateMenu = getstyleable_vector_drawable_group_rotation2.getLifecycle();
                int i5 = 10;
                stackedDeliveryDetailsFragment.getOnBackPressedDispatcher = new SignInDataStore(new getActionViewIntentlambda0(), new i2(new isMainThread(8), new getAnimationObject(getColorIntegerOrNull.serializer(getstyleable_vector_drawable_group_rotation2.SeekableTransitionStateseekTo3), new ImageHeaderParserImageType(), getstyleable_vector_drawable_group_rotation2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs), new AndroidUiFrameClock(), new getAnimatedProperties(getstyleable_vector_drawable_group_rotation2.RatingCompat()), new getTransitions(getstyleable_vector_drawable_group_rotation2.RatingCompat()), new ImageHeaderParserImageType(), new isMainThread(i5, new io.sentry.util.MediaBrowserCompatMediaItem(i5)), new Path$Companion(), new toIntSizeuvyYCjk(new getTransactionExecutor(), new ImageHeaderParserImageType(), new AndroidUiDispatcherCompanioncurrentThread1(6), (transferSessionPackageI) getstyleable_vector_drawable_group_rotation2.Contentfoundation.write()), new RouterLogger(new ImageHeaderParserImageType(), new Path$Companion()), new RouterLogger(new ImageHeaderParserImageType(), new accessisMainThread()), new ProtobufEncoder(new getTransactionExecutor(), new AndroidUiDispatcherCompanioncurrentThread1(10), new getActionViewIntentlambda0()), new RouterLogger(new getTransactionExecutor(), new isMainThread(9)), (createAnimation) getstyleable_vector_drawable_group_rotation2.TextFieldCursor_androidKt.write()), new findComposableMethod((createAnimation) getstyleable_vector_drawable_group_rotation2.TextFieldCursor_androidKt.write(), (transferSessionPackageI) getstyleable_vector_drawable_group_rotation2.Contentfoundation.write()));
                stackedDeliveryDetailsFragment.onConfigurationChanged = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((applyLayoutFeatures) this.write);
                stackedDeliveryDetailsFragment.getNavigationEventDispatcher = (setTransactionSuccessful) getstyleable_vector_drawable_group_rotation2.toClipEntry.write();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    @Override // o.VideoEncoderCrashQuirk
    public void write(Throwable th) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        if (i4 != 2) {
            int i5 = 3;
            if (i4 == 3) {
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            }
            if (i4 == 4) {
                PrematureEndOfStreamVideoQuirk.write();
                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.IconCompatParcelizer;
                androidx.lifecycle.BlockRunner blockRunner = (androidx.lifecycle.BlockRunner) this.write;
                if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk == ((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) blockRunner.read)) {
                    setInflatedId.read("CaptureNode", "request aborted, id=" + ((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) blockRunner.read).MediaDescriptionCompat);
                    Recorder$3 recorder$3 = (Recorder$3) blockRunner.IconCompatParcelizer;
                    if (recorder$3 != null) {
                        recorder$3.RemoteActionCompatParcelizer = null;
                    }
                    blockRunner.read = null;
                    return;
                }
                return;
            }
            if (i4 == 6) {
                Objects.toString(th);
                setInflatedId.IconCompatParcelizer(3, "Recorder");
                return;
            }
            if (i4 == 7) {
                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                encoderImpl.MediaMetadataCompat.remove((animate) this.IconCompatParcelizer);
                if (!(th instanceof MediaCodec.CodecException)) {
                    encoderImpl.read(0, th.getMessage(), th);
                    return;
                }
                int i6 = RemoteActionCompatParcelizer + 23;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                encoderImpl.read(1, codecException.getMessage(), codecException);
                return;
            }
            zzoh zzohVar = (zzoh) this.IconCompatParcelizer;
            NoWindowInsetsAnimation noWindowInsetsAnimation = (NoWindowInsetsAnimation) this.write;
            noWindowInsetsAnimation.MediaSessionCompatToken();
            noWindowInsetsAnimation.MediaSessionCompatQueueItem = false;
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.onBackPressedDispatcher_delegatelambda010)) {
                int i8 = read + 89;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                String message = th.getMessage();
                noWindowInsetsAnimation.MediaSessionCompatToken = false;
                if (message == null) {
                    i5 = 2;
                } else if (th instanceof IllegalStateException) {
                    if (!(!message.contains("Background"))) {
                        noWindowInsetsAnimation.MediaSessionCompatToken = true;
                    }
                    i5 = 1;
                } else {
                    int i10 = read + 41;
                    RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                        if (!(!message.contains("Background"))) {
                            noWindowInsetsAnimation.MediaSessionCompatToken = true;
                        }
                        i5 = 1;
                    } else if (th instanceof SecurityException) {
                        int i12 = RemoteActionCompatParcelizer + 49;
                        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i12 % 2 != 0) {
                            int i13 = 31 / 0;
                            if (message.endsWith("READ_DEVICE_CONFIG")) {
                                i5 = 2;
                            }
                        } else if (message.endsWith("READ_DEVICE_CONFIG")) {
                            i5 = 2;
                        }
                    } else {
                        i5 = 2;
                    }
                }
            } else {
                i5 = 2;
            }
            int i14 = i5 - 1;
            if (i14 == 0) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", getLookaheadDelegate.RemoteActionCompatParcelizer(lookaheadScopeKtLookaheadScope221.MediaMetadataCompat().MediaSessionCompatResultReceiverWrapper()), getLookaheadDelegate.RemoteActionCompatParcelizer(th.toString()));
                noWindowInsetsAnimation.PlaybackStateCompat = 1;
                noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().add(zzohVar);
            } else if (i14 != 1) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.serializer("registerTriggerAsync failed. Dropping URI. App ID, Throwable", getLookaheadDelegate.RemoteActionCompatParcelizer(lookaheadScopeKtLookaheadScope221.MediaMetadataCompat().MediaSessionCompatResultReceiverWrapper()), th);
                read();
                noWindowInsetsAnimation.PlaybackStateCompat = 1;
                noWindowInsetsAnimation.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            } else {
                noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().add(zzohVar);
                if (noWindowInsetsAnimation.PlaybackStateCompat > ((Integer) premeasure0kLqBqw.onActivityResult.IconCompatParcelizer(null)).intValue()) {
                    noWindowInsetsAnimation.PlaybackStateCompat = 1;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.MediaSessionCompatQueueItem.serializer("registerTriggerAsync failed. May try later. App ID, throwable", getLookaheadDelegate.RemoteActionCompatParcelizer(lookaheadScopeKtLookaheadScope221.MediaMetadataCompat().MediaSessionCompatResultReceiverWrapper()), getLookaheadDelegate.RemoteActionCompatParcelizer(th.toString()));
                } else {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.MediaSessionCompatQueueItem.IconCompatParcelizer("registerTriggerAsync failed. App ID, delay in seconds, throwable", getLookaheadDelegate.RemoteActionCompatParcelizer(lookaheadScopeKtLookaheadScope221.MediaMetadataCompat().MediaSessionCompatResultReceiverWrapper()), getLookaheadDelegate.RemoteActionCompatParcelizer(String.valueOf(noWindowInsetsAnimation.PlaybackStateCompat)), getLookaheadDelegate.RemoteActionCompatParcelizer(th.toString()));
                    int i15 = noWindowInsetsAnimation.PlaybackStateCompat;
                    if (noWindowInsetsAnimation.ParcelableVolumeInfo == null) {
                        noWindowInsetsAnimation.ParcelableVolumeInfo = new maxHeight(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope221, 1);
                    }
                    noWindowInsetsAnimation.ParcelableVolumeInfo.RemoteActionCompatParcelizer(((long) i15) * 1000);
                    int i16 = noWindowInsetsAnimation.PlaybackStateCompat;
                    noWindowInsetsAnimation.PlaybackStateCompat = i16 + i16;
                }
            }
            int i17 = RemoteActionCompatParcelizer + 107;
            read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                int i18 = 63 / 0;
            }
        }
    }
}
