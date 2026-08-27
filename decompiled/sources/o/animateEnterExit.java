package o;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class animateEnterExit {
    public final InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 read;
    public final InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 serializer;
    public final LinkedHashMap RemoteActionCompatParcelizer = new LinkedHashMap();
    public final TreeMap IconCompatParcelizer = new TreeMap(new AudioEncoderIgnoresInputTimestampQuirk(false));

    public animateEnterExit(androidx.navigation.NavArgsLazy navArgsLazy, int i) {
        AnimatedVisibilityKt animatedVisibilityKt = AnimatedVisibilityKt.MediaBrowserCompatMediaItem;
        Iterator it = new ArrayList(AnimatedVisibilityKt.MediaSessionCompatQueueItem).iterator();
        while (true) {
            InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 = null;
            if (!it.hasNext()) {
                break;
            }
            AnimatedVisibilityKt animatedVisibilityKt2 = (AnimatedVisibilityKt) it.next();
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("Currently only support ConstantQuality", animatedVisibilityKt2 instanceof AnimatedVisibilityKt);
            SurfaceRequest surfaceRequestRemoteActionCompatParcelizer = navArgsLazy.RemoteActionCompatParcelizer(animatedVisibilityKt2.RemoteActionCompatParcelizer(i));
            if (surfaceRequestRemoteActionCompatParcelizer != null) {
                surfaceRequestRemoteActionCompatParcelizer.toString();
                setInflatedId.IconCompatParcelizer(3, "CapabilitiesByQuality");
                if (!surfaceRequestRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().isEmpty()) {
                    int iWrite = surfaceRequestRemoteActionCompatParcelizer.write();
                    int iIconCompatParcelizer = surfaceRequestRemoteActionCompatParcelizer.IconCompatParcelizer();
                    List list = surfaceRequestRemoteActionCompatParcelizer.read();
                    List listRemoteActionCompatParcelizer = surfaceRequestRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                    coil3.util.UtilsKt.IconCompatParcelizer("Should contain at least one VideoProfile.", !listRemoteActionCompatParcelizer.isEmpty());
                    infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 = new InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2(iWrite, iIconCompatParcelizer, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(listRemoteActionCompatParcelizer)), list.isEmpty() ? null : (LegacyCameraSurfaceCleanupQuirk) list.get(0), (PreviewDelayWhenVideoCaptureIsBoundQuirk) listRemoteActionCompatParcelizer.get(0));
                }
                if (infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 == null) {
                    setInflatedId.read("CapabilitiesByQuality", "EncoderProfiles of quality " + animatedVisibilityKt2 + " has no video validated profiles.");
                } else {
                    this.IconCompatParcelizer.put(infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.serializer.read(), animatedVisibilityKt2);
                    this.RemoteActionCompatParcelizer.put(animatedVisibilityKt2, infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2);
                }
            }
        }
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            setInflatedId.serializer("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.read = null;
            this.serializer = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.RemoteActionCompatParcelizer.values());
            this.serializer = (InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2) arrayDeque.peekFirst();
            this.read = (InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2) arrayDeque.peekLast();
        }
    }

    public final InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 IconCompatParcelizer(AnimatedVisibilityKt animatedVisibilityKt) {
        coil3.util.UtilsKt.IconCompatParcelizer("Unknown quality: " + animatedVisibilityKt, AnimatedVisibilityKt.MediaMetadataCompat.contains(animatedVisibilityKt));
        if (animatedVisibilityKt == AnimatedVisibilityKt.serializer) {
            return this.serializer;
        }
        return animatedVisibilityKt == AnimatedVisibilityKt.IconCompatParcelizer ? this.read : (InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2) this.RemoteActionCompatParcelizer.get(animatedVisibilityKt);
    }
}
