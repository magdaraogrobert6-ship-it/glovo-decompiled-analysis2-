package io.sentry.android.core.internal.tombstone;

import io.sentry.protocol.DebugImage;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import o.BannerViewExternalSyntheticLambda2;
import o.UriActionExternalSyntheticLambda1;
import o.getContentCardsSwipeLayout;
import o.r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class write implements Closeable {
    public final List IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final InputStream read;
    public final String serializer;
    public final HashMap write;

    public final BannerViewExternalSyntheticLambda2 IconCompatParcelizer() throws IOException {
        DebugImage debugImageSerializer;
        DebugImage debugImageSerializer2;
        TombstoneProtos$Tombstone from = TombstoneProtos$Tombstone.parseFrom(this.read);
        BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2 = new BannerViewExternalSyntheticLambda2();
        bannerViewExternalSyntheticLambda2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL;
        bannerViewExternalSyntheticLambda2.MediaSessionCompatQueueItem = "native";
        io.sentry.protocol.r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = new io.sentry.protocol.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        TombstoneProtos$Signal signalInfo = from.getSignalInfo();
        String strJoin = String.join(" ", from.getCommandLineList());
        if (from.hasSignalInfo()) {
            String abortMessage = from.getAbortMessage();
            Locale locale = Locale.ROOT;
            String strConcat = !abortMessage.isEmpty() ? abortMessage.concat(": ") : "";
            r8lambda54beh8zsbru0cxi2ccsp2synys.read = strConcat + "Fatal signal " + signalInfo.getName() + " (" + signalInfo.getNumber() + "), " + signalInfo.getCodeName() + " (" + signalInfo.getCode() + "), pid = " + from.getPid() + " (" + strJoin + ")";
        } else {
            Locale locale2 = Locale.ROOT;
            r8lambda54beh8zsbru0cxi2ccsp2synys.read = "Fatal exit pid = " + from.getPid() + " (" + strJoin + ")";
        }
        bannerViewExternalSyntheticLambda2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54beh8zsbru0cxi2ccsp2synys;
        ArrayList arrayList = new ArrayList();
        Iterator<TombstoneProtos$MemoryMapping> it = from.getMemoryMappingsList().iterator();
        getContentCardsSwipeLayout getcontentcardsswipelayout = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TombstoneProtos$MemoryMapping next = it.next();
            if (next.getRead()) {
                String mappingName = next.getMappingName();
                if (!mappingName.isEmpty() && !mappingName.startsWith("/dev/")) {
                    boolean zIsEmpty = next.getBuildId().isEmpty();
                    boolean z = next.getOffset() == 0;
                    if (zIsEmpty || !z) {
                        if (getcontentcardsswipelayout != null && mappingName.equals((String) getcontentcardsswipelayout.write)) {
                            getcontentcardsswipelayout.RemoteActionCompatParcelizer = next.getEndAddress();
                        }
                    } else if (getcontentcardsswipelayout == null || !mappingName.equals((String) getcontentcardsswipelayout.write)) {
                        if (getcontentcardsswipelayout != null && (debugImageSerializer2 = getcontentcardsswipelayout.serializer()) != null) {
                            arrayList.add(debugImageSerializer2);
                        }
                        getcontentcardsswipelayout = new getContentCardsSwipeLayout();
                        getcontentcardsswipelayout.write = next.getMappingName();
                        getcontentcardsswipelayout.serializer = next.getBuildId();
                        getcontentcardsswipelayout.read = next.getBeginAddress();
                        getcontentcardsswipelayout.RemoteActionCompatParcelizer = next.getEndAddress();
                    } else {
                        getcontentcardsswipelayout.RemoteActionCompatParcelizer = next.getEndAddress();
                    }
                }
            }
        }
        if (getcontentcardsswipelayout != null && (debugImageSerializer = getcontentcardsswipelayout.serializer()) != null) {
            arrayList.add(debugImageSerializer);
        }
        io.sentry.protocol.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new io.sentry.protocol.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer = new ArrayList(arrayList);
        bannerViewExternalSyntheticLambda2.write = remoteActionCompatParcelizer;
        io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 = new io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        if (from.hasSignalInfo()) {
            TombstoneProtos$Signal signalInfo2 = from.getSignalInfo();
            r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.RemoteActionCompatParcelizer = signalInfo2.getName();
            r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.MediaBrowserCompatMediaItem = (String) this.write.get(signalInfo2.getName());
            io.sentry.protocol.ParcelableVolumeInfo parcelableVolumeInfo = new io.sentry.protocol.ParcelableVolumeInfo();
            parcelableVolumeInfo.MediaDescriptionCompat = RemoteActionCompatParcelizer.TOMBSTONE.getValue();
            parcelableVolumeInfo.serializer = Boolean.FALSE;
            parcelableVolumeInfo.MediaMetadataCompat = Boolean.TRUE;
            HashMap map = new HashMap();
            map.put("number", Integer.valueOf(signalInfo2.getNumber()));
            map.put("name", signalInfo2.getName());
            map.put("code", Integer.valueOf(signalInfo2.getCode()));
            map.put("code_name", signalInfo2.getCodeName());
            parcelableVolumeInfo.MediaSessionCompatQueueItem = new HashMap(map);
            r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.write = parcelableVolumeInfo;
        }
        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.read = Long.valueOf(from.getTid());
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8);
        bannerViewExternalSyntheticLambda2.ComponentActivity = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(arrayList2);
        ArrayList arrayListRemoteActionCompatParcelizer = bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer();
        Objects.requireNonNull(arrayListRemoteActionCompatParcelizer);
        io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc9 = (io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) arrayListRemoteActionCompatParcelizer.get(0);
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<Integer, TombstoneProtos$Thread> entry : from.getThreadsMap().entrySet()) {
            TombstoneProtos$Thread value = entry.getValue();
            io.sentry.protocol._init_lambda2 _init_lambda2Var = new io.sentry.protocol._init_lambda2();
            _init_lambda2Var.IconCompatParcelizer = Long.valueOf(entry.getKey().intValue());
            _init_lambda2Var.MediaSessionCompatQueueItem = value.getName();
            ArrayList arrayList4 = new ArrayList();
            for (TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame : value.getCurrentBacktraceList()) {
                if (!tombstoneProtos$BacktraceFrame.getFileName().endsWith("libart.so") && (!tombstoneProtos$BacktraceFrame.getFileName().startsWith("<anonymous") || !tombstoneProtos$BacktraceFrame.getFunctionName().isEmpty())) {
                    io.sentry.protocol.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = new io.sentry.protocol.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.IconCompatParcelizer = tombstoneProtos$BacktraceFrame.getFileName();
                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaBrowserCompatMediaItem = tombstoneProtos$BacktraceFrame.getFunctionName();
                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatToken = String.format("0x%x", Long.valueOf(tombstoneProtos$BacktraceFrame.getPc()));
                    String functionName = tombstoneProtos$BacktraceFrame.getFunctionName();
                    Boolean boolRemoteActionCompatParcelizer = functionName.isEmpty() ? Boolean.FALSE : UriActionExternalSyntheticLambda1.RemoteActionCompatParcelizer(functionName, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
                    String str = this.serializer;
                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatQueueItem = Boolean.valueOf((boolRemoteActionCompatParcelizer != null && boolRemoteActionCompatParcelizer.booleanValue()) || (str != null && tombstoneProtos$BacktraceFrame.getFileName().startsWith(str)));
                    arrayList4.add(0, r8lambdah6vvr6zuwa2u1fe0kskpogpr28);
                }
            }
            io.sentry.protocol.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh0 = new io.sentry.protocol.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
            r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.read = arrayList4;
            r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.IconCompatParcelizer = io.sentry.protocol._init_lambda3.NONE;
            HashMap map2 = new HashMap();
            for (TombstoneProtos$Register tombstoneProtos$Register : value.getRegistersList()) {
                map2.put(tombstoneProtos$Register.getName(), String.format("0x%x", Long.valueOf(tombstoneProtos$Register.getU64())));
            }
            r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.RemoteActionCompatParcelizer = map2;
            _init_lambda2Var.MediaBrowserCompatMediaItem = r8lambdaypqlaaoriyrj3iy_tqzuutrvh0;
            if (from.getTid() == value.getId()) {
                _init_lambda2Var.write = Boolean.TRUE;
                r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc9.serializer = r8lambdaypqlaaoriyrj3iy_tqzuutrvh0;
            }
            arrayList3.add(_init_lambda2Var);
        }
        bannerViewExternalSyntheticLambda2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(arrayList3);
        return bannerViewExternalSyntheticLambda2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.read.close();
    }

    public write(InputStream inputStream, List list, List list2, String str) {
        HashMap map = new HashMap();
        this.write = map;
        this.read = inputStream;
        this.RemoteActionCompatParcelizer = list;
        this.IconCompatParcelizer = list2;
        this.serializer = str;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }
}
