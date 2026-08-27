package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import io.sentry.SentryThreadFactory;
import io.sentry.protocol.DebugImage;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.BannerViewExternalSyntheticLambda2;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.UriActionExternalSyntheticLambda1;
import o.accessgetThumbsDowncp;
import o.executelambda4;
import o.r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI;
import o.truncslo4al4;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 implements r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI {
    public final List IconCompatParcelizer = Collections.singletonList(new r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw(this));
    public final SentryThreadFactory MediaDescriptionCompat;
    public final Context RemoteActionCompatParcelizer;
    public final io.sentry.cache.MediaMetadataCompat read;
    public final SentryAndroidOptions serializer;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ write;

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final io.sentry.protocol.accessensureViewModelStore RemoteActionCompatParcelizer(io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore, executelambda4 executelambda4Var) {
        return accessensureviewmodelstore;
    }

    public final String read() {
        SentryAndroidOptions sentryAndroidOptions = this.serializer;
        try {
            return (String) sentryAndroidOptions.getRuntimeManager().RemoteActionCompatParcelizer(new d0$$ExternalSyntheticLambda0(14, this));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    public r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(Context context, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.RemoteActionCompatParcelizer = applicationContext != null ? applicationContext : context;
        this.serializer = sentryAndroidOptions;
        this.write = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.read = sentryAndroidOptions.findPersistingScopeObserver();
        this.MediaDescriptionCompat = new SentryThreadFactory(new UriActionExternalSyntheticLambda1(sentryAndroidOptions));
    }

    public final Object RemoteActionCompatParcelizer(SentryOptions sentryOptions, String str, Class cls) {
        io.sentry.cache.MediaMetadataCompat mediaMetadataCompat = this.read;
        if (mediaMetadataCompat == null) {
            return null;
        }
        return mediaMetadataCompat.RemoteActionCompatParcelizer(sentryOptions, str, cls);
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final BannerViewExternalSyntheticLambda2 read(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw r8lambdavcwjfxdisgcircy4i008voij_lw;
        String str;
        String str2;
        String str3;
        File[] fileArr;
        DisplayMetrics displayMetrics;
        String str4;
        String str5;
        io.sentry.protocol._init_lambda2 _init_lambda2Var;
        ArrayList arrayList;
        Object obj = executelambda4Var.read("sentry:typeCheckHint");
        boolean z = obj instanceof io.sentry.hints.write;
        SentryAndroidOptions sentryAndroidOptions = this.serializer;
        if (!z) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return bannerViewExternalSyntheticLambda2;
        }
        io.sentry.hints.write writeVar = (io.sentry.hints.write) obj;
        Iterator it = this.IconCompatParcelizer.iterator();
        do {
            if (!it.hasNext()) {
                r8lambdavcwjfxdisgcircy4i008voij_lw = null;
                break;
            }
            r8lambdavcwjfxdisgcircy4i008voij_lw = (r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) it.next();
            r8lambdavcwjfxdisgcircy4i008voij_lw.getClass();
        } while (!(obj instanceof io.sentry.hints.IconCompatParcelizer));
        String str6 = "anr_background";
        if (r8lambdavcwjfxdisgcircy4i008voij_lw != null) {
            boolean zEquals = writeVar instanceof io.sentry.hints.IconCompatParcelizer ? "anr_background".equals(((io.sentry.hints.IconCompatParcelizer) writeVar).IconCompatParcelizer()) : false;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh0 = r8lambdavcwjfxdisgcircy4i008voij_lw.write;
            if (bannerViewExternalSyntheticLambda2.MediaSessionCompatQueueItem == null) {
                bannerViewExternalSyntheticLambda2.MediaSessionCompatQueueItem = "java";
            }
            if (bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer() == null) {
                io.sentry.protocol.ParcelableVolumeInfo parcelableVolumeInfo = new io.sentry.protocol.ParcelableVolumeInfo();
                if (!writeVar.serializer()) {
                    parcelableVolumeInfo.MediaDescriptionCompat = "HistoricalAppExitInfo";
                } else {
                    parcelableVolumeInfo.MediaDescriptionCompat = "AppExitInfo";
                }
                if (zEquals) {
                    str5 = "Background ANR";
                } else {
                    str5 = "ANR";
                }
                ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str5, Thread.currentThread());
                ArrayList arrayListSerializer = bannerViewExternalSyntheticLambda2.serializer();
                if (arrayListSerializer == null) {
                    _init_lambda2Var = null;
                    break;
                }
                Iterator it2 = arrayListSerializer.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        _init_lambda2Var = null;
                        break;
                    }
                    _init_lambda2Var = (io.sentry.protocol._init_lambda2) it2.next();
                    String str7 = _init_lambda2Var.MediaSessionCompatQueueItem;
                    if (str7 != null && str7.equals("main")) {
                        break;
                    }
                }
                if (_init_lambda2Var == null) {
                    _init_lambda2Var = new io.sentry.protocol._init_lambda2();
                    _init_lambda2Var.MediaBrowserCompatMediaItem = new io.sentry.protocol.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
                }
                r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.MediaDescriptionCompat.getClass();
                io.sentry.protocol.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh1 = _init_lambda2Var.MediaBrowserCompatMediaItem;
                if (r8lambdaypqlaaoriyrj3iy_tqzuutrvh1 == null) {
                    arrayList = new ArrayList(0);
                } else {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(SentryThreadFactory.write(applicationNotResponding, parcelableVolumeInfo, _init_lambda2Var.IconCompatParcelizer, r8lambdaypqlaaoriyrj3iy_tqzuutrvh1.read, true));
                    arrayList = arrayList2;
                }
                bannerViewExternalSyntheticLambda2.ComponentActivity = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(arrayList);
            }
        }
        io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = bannerViewExternalSyntheticLambda2.read;
        io.sentry.protocol.ComponentActivity componentActivityMediaMetadataCompat = iconCompatParcelizer.MediaMetadataCompat();
        Context context = this.RemoteActionCompatParcelizer;
        iconCompatParcelizer.write(_init_lambda4.read(context, sentryAndroidOptions).MediaMetadataCompat);
        if (componentActivityMediaMetadataCompat != null) {
            String str8 = componentActivityMediaMetadataCompat.write;
            if (str8 != null && !str8.isEmpty()) {
                str4 = "os_" + str8.trim().toLowerCase(Locale.ROOT);
            } else {
                str4 = "os_1";
            }
            iconCompatParcelizer.IconCompatParcelizer(componentActivityMediaMetadataCompat, str4);
        }
        io.sentry.protocol.MediaMetadataCompat mediaMetadataCompatWrite = iconCompatParcelizer.write();
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.write;
        if (mediaMetadataCompatWrite == null) {
            io.sentry.protocol.MediaMetadataCompat mediaMetadataCompat = new io.sentry.protocol.MediaMetadataCompat();
            mediaMetadataCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Build.MANUFACTURER;
            mediaMetadataCompat.RemoteActionCompatParcelizer = Build.BRAND;
            mediaMetadataCompat.PlaybackStateCompatCustomAction = _init_lambda3.read(sentryAndroidOptions.getLogger());
            mediaMetadataCompat.ResultReceiver = Build.MODEL;
            mediaMetadataCompat.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Build.ID;
            mediaMetadataCompat.read = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo memoryInfo = _init_lambda3.read(context, sentryAndroidOptions.getLogger());
            if (memoryInfo != null) {
                mediaMetadataCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Long.valueOf(memoryInfo.totalMem);
            }
            mediaMetadataCompat._init_lambda3 = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.write();
            BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th) {
                logger.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting DisplayMetrics.", th);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                mediaMetadataCompat.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = Integer.valueOf(displayMetrics.widthPixels);
                mediaMetadataCompat.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = Integer.valueOf(displayMetrics.heightPixels);
                mediaMetadataCompat.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = Float.valueOf(displayMetrics.density);
                mediaMetadataCompat.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (mediaMetadataCompat.ParcelableVolumeInfo == null) {
                mediaMetadataCompat.ParcelableVolumeInfo = read();
            }
            ArrayList arrayListIconCompatParcelizer = io.sentry.android.core.internal.util.RatingCompat.read.IconCompatParcelizer();
            if (!arrayListIconCompatParcelizer.isEmpty()) {
                mediaMetadataCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = Double.valueOf(((Integer) Collections.max(arrayListIconCompatParcelizer)).doubleValue());
                mediaMetadataCompat.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Integer.valueOf(arrayListIconCompatParcelizer.size());
            }
            iconCompatParcelizer.RemoteActionCompatParcelizer(mediaMetadataCompat);
        }
        if (!writeVar.serializer()) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return bannerViewExternalSyntheticLambda2;
        }
        if (bannerViewExternalSyntheticLambda2.MediaBrowserCompatMediaItem == null) {
            bannerViewExternalSyntheticLambda2.MediaBrowserCompatMediaItem = (io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) RemoteActionCompatParcelizer(sentryAndroidOptions, "request.json", io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.class);
        }
        if (bannerViewExternalSyntheticLambda2.ParcelableVolumeInfo == null) {
            bannerViewExternalSyntheticLambda2.ParcelableVolumeInfo = (io.sentry.protocol.addObserverForBackInvoker) RemoteActionCompatParcelizer(sentryAndroidOptions, "user.json", io.sentry.protocol.addObserverForBackInvoker.class);
        }
        Map map = (Map) RemoteActionCompatParcelizer(sentryAndroidOptions, "tags.json", Map.class);
        if (map != null) {
            if (bannerViewExternalSyntheticLambda2.PlaybackStateCompatCustomAction == null) {
                bannerViewExternalSyntheticLambda2.PlaybackStateCompatCustomAction = new HashMap(new HashMap(map));
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    if (!bannerViewExternalSyntheticLambda2.PlaybackStateCompatCustomAction.containsKey(entry.getKey())) {
                        bannerViewExternalSyntheticLambda2.IconCompatParcelizer((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        List list = (List) RemoteActionCompatParcelizer(sentryAndroidOptions, "breadcrumbs.json", List.class);
        if (list != null) {
            List list2 = bannerViewExternalSyntheticLambda2.IconCompatParcelizer;
            if (list2 == null) {
                bannerViewExternalSyntheticLambda2.IconCompatParcelizer = new ArrayList(list);
            } else {
                list2.addAll(list);
            }
        }
        Map map2 = (Map) RemoteActionCompatParcelizer(sentryAndroidOptions, "extras.json", Map.class);
        if (map2 != null) {
            if (bannerViewExternalSyntheticLambda2.MediaDescriptionCompat == null) {
                bannerViewExternalSyntheticLambda2.MediaDescriptionCompat = new HashMap(new HashMap(map2));
            } else {
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (!bannerViewExternalSyntheticLambda2.MediaDescriptionCompat.containsKey(entry2.getKey())) {
                        bannerViewExternalSyntheticLambda2.MediaDescriptionCompat.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer2 = (io.sentry.protocol.IconCompatParcelizer) RemoteActionCompatParcelizer(sentryAndroidOptions, "contexts.json", io.sentry.protocol.IconCompatParcelizer.class);
        if (iconCompatParcelizer2 != null) {
            for (Map.Entry entry3 : new io.sentry.protocol.IconCompatParcelizer(iconCompatParcelizer2).serializer.entrySet()) {
                Object value = entry3.getValue();
                if ((!"trace".equals(entry3.getKey()) || !(value instanceof r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0)) && !iconCompatParcelizer.write(entry3.getKey())) {
                    iconCompatParcelizer.IconCompatParcelizer(value, (String) entry3.getKey());
                }
            }
        }
        String str9 = (String) RemoteActionCompatParcelizer(sentryAndroidOptions, "transaction.json", String.class);
        if (bannerViewExternalSyntheticLambda2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
            bannerViewExternalSyntheticLambda2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = str9;
        }
        List list3 = (List) RemoteActionCompatParcelizer(sentryAndroidOptions, "fingerprint.json", List.class);
        if (bannerViewExternalSyntheticLambda2.ResultReceiver == null) {
            bannerViewExternalSyntheticLambda2.ResultReceiver = list3 != null ? new ArrayList(list3) : null;
        }
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = (r8lambdaL32xCEzW71g2Xzeh1NM3NImxco) RemoteActionCompatParcelizer(sentryAndroidOptions, "level.json", r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.class);
        if (bannerViewExternalSyntheticLambda2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
            bannerViewExternalSyntheticLambda2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdal32xcezw71g2xzeh1nm3nimxco;
        }
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = (r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0) RemoteActionCompatParcelizer(sentryAndroidOptions, "trace.json", r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0.class);
        if (iconCompatParcelizer.MediaSessionCompatQueueItem() == null && r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 != null) {
            iconCompatParcelizer.serializer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0);
        }
        String str10 = (String) RemoteActionCompatParcelizer(sentryAndroidOptions, "replay.json", String.class);
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath != null) {
            if (!new File(cacheDirPath, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("replay_", str10)).exists()) {
                String str11 = (String) io.sentry.cache.IconCompatParcelizer.IconCompatParcelizer(sentryAndroidOptions, ".options-cache", "replay-error-sample-rate.json", String.class);
                if (str11 != null) {
                    try {
                        if (Double.parseDouble(str11) < io.sentry.util.MediaSessionCompatToken.read().IconCompatParcelizer()) {
                            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", bannerViewExternalSyntheticLambda2.MediaMetadataCompat);
                        } else {
                            File[] fileArrListFiles = new File(cacheDirPath).listFiles();
                            if (fileArrListFiles != null) {
                                int length = fileArrListFiles.length;
                                long jLastModified = Long.MIN_VALUE;
                                int i = 0;
                                String strSubstring = null;
                                while (i < length) {
                                    File file = fileArrListFiles[i];
                                    if (file.isDirectory()) {
                                        fileArr = fileArrListFiles;
                                        if (file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= ((Date) bannerViewExternalSyntheticLambda2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.clone()).getTime()) {
                                            jLastModified = file.lastModified();
                                            strSubstring = file.getName().substring(7);
                                        }
                                    } else {
                                        fileArr = fileArrListFiles;
                                    }
                                    i++;
                                    fileArrListFiles = fileArr;
                                }
                                str3 = strSubstring;
                            } else {
                                str3 = null;
                            }
                        }
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error parsing replay sample rate.", th2);
                    }
                }
            }
            if (str3 != null) {
                str3 = str10;
                Charset charset = io.sentry.cache.MediaMetadataCompat.write;
                io.sentry.cache.IconCompatParcelizer.write(sentryAndroidOptions, str3, ".scope-cache", "replay.json");
                iconCompatParcelizer.IconCompatParcelizer(str3, "replay_id");
            }
        }
        str3 = str10;
        if (bannerViewExternalSyntheticLambda2.RatingCompat == null) {
            bannerViewExternalSyntheticLambda2.RatingCompat = (String) io.sentry.cache.IconCompatParcelizer.IconCompatParcelizer(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (bannerViewExternalSyntheticLambda2.serializer == null) {
            String environment = (String) io.sentry.cache.IconCompatParcelizer.IconCompatParcelizer(sentryAndroidOptions, ".options-cache", "environment.json", String.class);
            if (environment == null) {
                environment = sentryAndroidOptions.getEnvironment();
            }
            bannerViewExternalSyntheticLambda2.serializer = environment;
        }
        if (bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer == null) {
            bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer = (String) io.sentry.cache.IconCompatParcelizer.IconCompatParcelizer(sentryAndroidOptions, ".options-cache", "dist.json", String.class);
        }
        if (bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer == null && (str2 = (String) io.sentry.cache.IconCompatParcelizer.IconCompatParcelizer(sentryAndroidOptions, ".options-cache", "release.json", String.class)) != null) {
            try {
                bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer = str2.substring(str2.indexOf(43) + 1);
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to parse release from scope cache: %s", str2);
            }
        }
        io.sentry.protocol.RemoteActionCompatParcelizer remoteActionCompatParcelizer = bannerViewExternalSyntheticLambda2.write;
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = new io.sentry.protocol.RemoteActionCompatParcelizer();
        }
        if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer = new ArrayList(new ArrayList());
        }
        List list4 = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        if (list4 == null) {
            str6 = "anr_background";
        } else {
            String str12 = (String) io.sentry.cache.IconCompatParcelizer.IconCompatParcelizer(sentryAndroidOptions, ".options-cache", "proguard-uuid.json", String.class);
            if (str12 != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str12);
                list4.add(debugImage);
            }
            bannerViewExternalSyntheticLambda2.write = remoteActionCompatParcelizer;
        }
        if (bannerViewExternalSyntheticLambda2.PlaybackStateCompat == null) {
            bannerViewExternalSyntheticLambda2.PlaybackStateCompat = (io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) io.sentry.cache.IconCompatParcelizer.IconCompatParcelizer(sentryAndroidOptions, ".options-cache", "sdk-version.json", io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.class);
        }
        io.sentry.protocol.read readVarIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
        if (readVarIconCompatParcelizer == null) {
            readVarIconCompatParcelizer = new io.sentry.protocol.read();
        }
        io.sentry.protocol.read readVar = readVarIconCompatParcelizer;
        readVar.serializer = (String) _init_lambda3.write.IconCompatParcelizer(context);
        PackageInfo packageInfoRemoteActionCompatParcelizer = _init_lambda3.RemoteActionCompatParcelizer(context, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq);
        if (packageInfoRemoteActionCompatParcelizer != null) {
            readVar.RemoteActionCompatParcelizer = packageInfoRemoteActionCompatParcelizer.packageName;
        }
        String str13 = bannerViewExternalSyntheticLambda2.RatingCompat;
        if (str13 == null) {
            str13 = (String) io.sentry.cache.IconCompatParcelizer.IconCompatParcelizer(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (str13 != null) {
            try {
                String strSubstring2 = str13.substring(str13.indexOf(64) + 1, str13.indexOf(43));
                String strSubstring3 = str13.substring(str13.indexOf(43) + 1);
                readVar.read = strSubstring2;
                readVar.write = strSubstring3;
            } catch (Throwable unused2) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to parse release from scope cache: %s", str13);
            }
        }
        try {
            truncslo4al4 truncslo4al4Var = _init_lambda4.read(context, sentryAndroidOptions).MediaDescriptionCompat;
            if (truncslo4al4Var != null) {
                readVar.MediaBrowserCompatMediaItem = Boolean.valueOf(truncslo4al4Var.read);
                String[] strArr = (String[]) truncslo4al4Var.IconCompatParcelizer;
                if (strArr != null) {
                    readVar.PlaybackStateCompatCustomAction = Arrays.asList(strArr);
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting split apks info.", th3);
        }
        iconCompatParcelizer.write(readVar);
        Map map3 = (Map) io.sentry.cache.IconCompatParcelizer.IconCompatParcelizer(sentryAndroidOptions, ".options-cache", "tags.json", Map.class);
        if (map3 != null) {
            if (bannerViewExternalSyntheticLambda2.PlaybackStateCompatCustomAction == null) {
                bannerViewExternalSyntheticLambda2.PlaybackStateCompatCustomAction = new HashMap(new HashMap(map3));
            } else {
                for (Map.Entry entry4 : map3.entrySet()) {
                    if (!bannerViewExternalSyntheticLambda2.PlaybackStateCompatCustomAction.containsKey(entry4.getKey())) {
                        bannerViewExternalSyntheticLambda2.IconCompatParcelizer((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
        }
        io.sentry.protocol.addObserverForBackInvoker addobserverforbackinvoker = bannerViewExternalSyntheticLambda2.ParcelableVolumeInfo;
        if (addobserverforbackinvoker == null) {
            addobserverforbackinvoker = new io.sentry.protocol.addObserverForBackInvoker();
            bannerViewExternalSyntheticLambda2.ParcelableVolumeInfo = addobserverforbackinvoker;
        }
        if (addobserverforbackinvoker.read == null) {
            addobserverforbackinvoker.read = read();
        }
        if (addobserverforbackinvoker.IconCompatParcelizer == null && sentryAndroidOptions.isSendDefaultPii()) {
            addobserverforbackinvoker.IconCompatParcelizer = "{{auto}}";
        }
        try {
            accessgetThumbsDowncp accessgetthumbsdowncp = _init_lambda4.read(context, sentryAndroidOptions).RatingCompat;
            if (accessgetthumbsdowncp != null) {
                HashMap map4 = new HashMap();
                map4.put("isSideLoaded", String.valueOf(accessgetthumbsdowncp.write));
                String str14 = accessgetthumbsdowncp.RemoteActionCompatParcelizer;
                if (str14 != null) {
                    map4.put("installerStore", str14);
                }
                for (Map.Entry entry5 : map4.entrySet()) {
                    bannerViewExternalSyntheticLambda2.IconCompatParcelizer((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting side loaded info.", th4);
        }
        if (r8lambdavcwjfxdisgcircy4i008voij_lw != null) {
            boolean zEquals2 = writeVar instanceof io.sentry.hints.IconCompatParcelizer ? str6.equals(((io.sentry.hints.IconCompatParcelizer) writeVar).IconCompatParcelizer()) : false;
            io.sentry.protocol.read readVarIconCompatParcelizer2 = iconCompatParcelizer.IconCompatParcelizer();
            if (readVarIconCompatParcelizer2 == null) {
                readVarIconCompatParcelizer2 = new io.sentry.protocol.read();
                iconCompatParcelizer.write(readVarIconCompatParcelizer2);
            }
            if (readVarIconCompatParcelizer2.MediaSessionCompatQueueItem == null) {
                readVarIconCompatParcelizer2.MediaSessionCompatQueueItem = Boolean.valueOf(!zEquals2);
            }
            if (bannerViewExternalSyntheticLambda2.ResultReceiver == null) {
                if (zEquals2) {
                    str = "background-anr";
                } else {
                    str = "foreground-anr";
                }
                List listAsList = Arrays.asList("{{ default }}", str);
                bannerViewExternalSyntheticLambda2.ResultReceiver = listAsList != null ? new ArrayList(listAsList) : null;
            }
        }
        return bannerViewExternalSyntheticLambda2;
    }
}
