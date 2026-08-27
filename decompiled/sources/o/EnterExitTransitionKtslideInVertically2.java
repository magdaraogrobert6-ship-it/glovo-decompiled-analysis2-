package o;

import androidx.camera.video.Recorder$3;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class EnterExitTransitionKtslideInVertically2 implements EnterExitTransitionKtexpandVertically2 {
    public final int read;
    public final shutdown write;
    public final HashMap serializer = new HashMap();
    public final HashMap RemoteActionCompatParcelizer = new HashMap();

    @Override // o.EnterExitTransitionKtexpandVertically2
    public final Set write() {
        return this.serializer.keySet();
    }

    public EnterExitTransitionKtslideInVertically2(FocusMeteringAction focusMeteringAction, int i) {
        InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2;
        int i2 = i == 2 ? 2 : 1;
        this.read = i2;
        shutdown shutdownVarMediaMetadataCompat = focusMeteringAction.MediaMetadataCompat();
        if (i2 == 2) {
            if (!focusMeteringAction.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
                shutdownVarMediaMetadataCompat = shutdown.serializer;
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TreeMap treeMap = new TreeMap(new AudioEncoderIgnoresInputTimestampQuirk(false));
            AnimatedVisibilityKt animatedVisibilityKt = AnimatedVisibilityKt.MediaBrowserCompatMediaItem;
            for (AnimatedVisibilityKt animatedVisibilityKt2 : new ArrayList(AnimatedVisibilityKt.MediaSessionCompatQueueItem)) {
                coil3.util.UtilsKt.RemoteActionCompatParcelizer("Currently only support ConstantQuality", animatedVisibilityKt2 instanceof AnimatedVisibilityKt);
                SurfaceRequest surfaceRequestWrite = shutdownVarMediaMetadataCompat.write(animatedVisibilityKt2.RemoteActionCompatParcelizer(i2));
                if (surfaceRequestWrite != null) {
                    surfaceRequestWrite.toString();
                    setInflatedId.IconCompatParcelizer(3, "CapabilitiesByQuality");
                    if (surfaceRequestWrite.RemoteActionCompatParcelizer().isEmpty()) {
                        infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 = null;
                    } else {
                        int iWrite = surfaceRequestWrite.write();
                        int iIconCompatParcelizer = surfaceRequestWrite.IconCompatParcelizer();
                        List list = surfaceRequestWrite.read();
                        List listRemoteActionCompatParcelizer = surfaceRequestWrite.RemoteActionCompatParcelizer();
                        coil3.util.UtilsKt.IconCompatParcelizer("Should contain at least one VideoProfile.", !listRemoteActionCompatParcelizer.isEmpty());
                        infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 = new InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2(iWrite, iIconCompatParcelizer, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(listRemoteActionCompatParcelizer)), !list.isEmpty() ? (LegacyCameraSurfaceCleanupQuirk) list.get(0) : null, (PreviewDelayWhenVideoCaptureIsBoundQuirk) listRemoteActionCompatParcelizer.get(0));
                    }
                    if (infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 == null) {
                        setInflatedId.read("CapabilitiesByQuality", "EncoderProfiles of quality " + animatedVisibilityKt2 + " has no video validated profiles.");
                    } else {
                        treeMap.put(infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.serializer.read(), animatedVisibilityKt2);
                        linkedHashMap.put(animatedVisibilityKt2, infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2);
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                setInflatedId.serializer("CapabilitiesByQuality", "No supported EncoderProfiles");
            } else {
                ArrayDeque arrayDeque = new ArrayDeque(linkedHashMap.values());
            }
            if (new ArrayList(linkedHashMap.keySet()).isEmpty()) {
                setInflatedId.read("RecorderVideoCapabilities", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
                shutdownVarMediaMetadataCompat = new androidx.transition.TransitionValuesMaps(focusMeteringAction, Arrays.asList(AnimatedVisibilityKt.read, AnimatedVisibilityKt.RemoteActionCompatParcelizer, AnimatedVisibilityKt.MediaBrowserCompatMediaItem));
            }
            u$a u_a = accesswaitForCompositionAfterTargetStateChange.read;
            androidx.navigation.NavArgsLazy navArgsLazy = new androidx.navigation.NavArgsLazy(new Recorder$3(focusMeteringAction, shutdownVarMediaMetadataCompat, u_a), u_a);
            for (getNavigationIcon getnavigationicon : focusMeteringAction.MediaSessionCompatToken()) {
                int i3 = getnavigationicon.MediaSessionCompatQueueItem;
                int i4 = getnavigationicon.MediaBrowserCompatMediaItem;
                if (Integer.valueOf(i3).equals(3) && i4 == 10) {
                    navArgsLazy = new androidx.navigation.NavArgsLazy(navArgsLazy);
                    break;
                }
            }
            shutdownVarMediaMetadataCompat = new AbstractClickableNode(focusMeteringAction, navArgsLazy, u_a);
        }
        this.write = shutdownVarMediaMetadataCompat;
        for (getNavigationIcon getnavigationicon2 : focusMeteringAction.MediaSessionCompatToken()) {
            animateEnterExit animateenterexit = new animateEnterExit(new androidx.navigation.NavArgsLazy(this.write, getnavigationicon2), this.read);
            if (!new ArrayList(animateenterexit.RemoteActionCompatParcelizer.keySet()).isEmpty()) {
                this.serializer.put(getnavigationicon2, animateenterexit);
            }
        }
        focusMeteringAction.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    public final animateEnterExit RemoteActionCompatParcelizer(getNavigationIcon getnavigationicon) {
        Object next;
        boolean zSerializer = getnavigationicon.serializer();
        HashMap map = this.serializer;
        if (zSerializer) {
            return (animateEnterExit) map.get(getnavigationicon);
        }
        HashMap map2 = this.RemoteActionCompatParcelizer;
        if (map2.containsKey(getnavigationicon)) {
            return (animateEnterExit) map2.get(getnavigationicon);
        }
        Set setKeySet = map.keySet();
        setKeySet.getClass();
        animateEnterExit animateenterexit = null;
        if (!getnavigationicon.serializer()) {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                getNavigationIcon getnavigationicon2 = (getNavigationIcon) next;
                coil3.util.UtilsKt.RemoteActionCompatParcelizer("Fully specified range is not actually fully specified.", getnavigationicon2.serializer());
                int i = getnavigationicon.MediaBrowserCompatMediaItem;
                if (i == 0 || i == getnavigationicon2.MediaBrowserCompatMediaItem) {
                    coil3.util.UtilsKt.RemoteActionCompatParcelizer("Fully specified range is not actually fully specified.", getnavigationicon2.serializer());
                    int i2 = getnavigationicon.MediaSessionCompatQueueItem;
                    if (i2 != 0) {
                        int i3 = getnavigationicon2.MediaSessionCompatQueueItem;
                        if ((i2 == 2 && i3 != 1) || i2 == i3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (next != null) {
                animateenterexit = new animateEnterExit(new androidx.navigation.NavArgsLazy(this.write, getnavigationicon), this.read);
            }
        } else if (setKeySet.contains(getnavigationicon)) {
            animateenterexit = new animateEnterExit(new androidx.navigation.NavArgsLazy(this.write, getnavigationicon), this.read);
        }
        map2.put(getnavigationicon, animateenterexit);
        return animateenterexit;
    }

    @Override // o.EnterExitTransitionKtexpandVertically2
    public final InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 IconCompatParcelizer(android.util.Size size, getNavigationIcon getnavigationicon) {
        Object value;
        animateEnterExit animateenterexitRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getnavigationicon);
        if (animateenterexitRemoteActionCompatParcelizer == null) {
            return null;
        }
        TreeMap treeMap = animateenterexitRemoteActionCompatParcelizer.IconCompatParcelizer;
        android.util.Size size2 = setController.MediaDescriptionCompat;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        AnimatedVisibilityKt animatedVisibilityKt = (AnimatedVisibilityKt) value;
        if (animatedVisibilityKt == null) {
            animatedVisibilityKt = AnimatedVisibilityKt.write;
        }
        Objects.toString(animatedVisibilityKt);
        Objects.toString(size);
        setInflatedId.IconCompatParcelizer(3, "CapabilitiesByQuality");
        if (animatedVisibilityKt == AnimatedVisibilityKt.write) {
            return null;
        }
        InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer = animateenterexitRemoteActionCompatParcelizer.IconCompatParcelizer(animatedVisibilityKt);
        if (infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer != null) {
            return infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
        return null;
    }

    @Override // o.EnterExitTransitionKtexpandVertically2
    public final InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 serializer(AnimatedVisibilityKt animatedVisibilityKt, getNavigationIcon getnavigationicon) {
        animateEnterExit animateenterexitRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getnavigationicon);
        if (animateenterexitRemoteActionCompatParcelizer == null) {
            return null;
        }
        return animateenterexitRemoteActionCompatParcelizer.IconCompatParcelizer(animatedVisibilityKt);
    }

    @Override // o.EnterExitTransitionKtexpandVertically2
    public final ArrayList write(getNavigationIcon getnavigationicon) {
        animateEnterExit animateenterexitRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getnavigationicon);
        return animateenterexitRemoteActionCompatParcelizer == null ? new ArrayList() : new ArrayList(animateenterexitRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.keySet());
    }
}
