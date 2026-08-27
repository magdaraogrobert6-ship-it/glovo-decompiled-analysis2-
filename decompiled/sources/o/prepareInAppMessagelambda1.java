package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;
import kotlinx.serialization.json.internal.JsonNamesMapKt;

/* JADX INFO: loaded from: classes4.dex */
public class prepareInAppMessagelambda1 extends r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y {
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA MediaDescriptionCompat;
    public final r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public int RatingCompat;

    public final boolean RatingCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        boolean z = (this.write.IconCompatParcelizer.RatingCompat || r8lambda92m0p9sit5uf70mvjf4rwmruda.write(i) || !r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i).MediaBrowserCompatMediaItem()) ? false : true;
        this.MediaSessionCompatQueueItem = z;
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prepareInAppMessagelambda1(resetTransientState resettransientstate, r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k, String str, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        super(resettransientstate, str);
        resettransientstate.getClass();
        r8lambdaerwhggzq_gqgn8cultnvrcshm8k.getClass();
        this.MediaMetadataCompat = r8lambdaerwhggzq_gqgn8cultnvrcshm8k;
        this.MediaDescriptionCompat = r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    public String MediaDescriptionCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        resetTransientState resettransientstate = this.write;
        JsonNamesMapKt.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate);
        String strIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i);
        if (this.serializer.ParcelableVolumeInfo && !RemoteActionCompatParcelizer().content.keySet().contains(strIconCompatParcelizer)) {
            io.sentry.logger.serializer serializerVar = resettransientstate.write;
            SealedClassSerializer$$ExternalSyntheticLambda0 sealedClassSerializer$$ExternalSyntheticLambda0 = new SealedClassSerializer$$ExternalSyntheticLambda0(r8lambda92m0p9sit5uf70mvjf4rwmruda, 21, resettransientstate);
            serializerVar.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) serializerVar.scopes;
            Map map = (Map) concurrentHashMap.get(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            handleLocalImagelambda1 handlelocalimagelambda1 = JsonNamesMapKt.IconCompatParcelizer;
            Object obj = null;
            Object objInvoke = map != null ? map.get(handlelocalimagelambda1) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = sealedClassSerializer$$ExternalSyntheticLambda0.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(r8lambda92m0p9sit5uf70mvjf4rwmruda, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(handlelocalimagelambda1, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : RemoteActionCompatParcelizer().content.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strIconCompatParcelizer;
    }

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    public SwipeDismissTouchListenerVerticalDismissDirection RemoteActionCompatParcelizer(String str) {
        str.getClass();
        return (SwipeDismissTouchListenerVerticalDismissDirection) onMove.read(RemoteActionCompatParcelizer(), str);
    }

    public int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        while (this.RatingCompat < r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer()) {
            int i = this.RatingCompat;
            this.RatingCompat = i + 1;
            String strMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
            int i2 = this.RatingCompat - 1;
            boolean z = false;
            this.MediaSessionCompatQueueItem = false;
            if (RemoteActionCompatParcelizer().containsKey(strMediaBrowserCompatMediaItem) || RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2)) {
                if (this.serializer.RemoteActionCompatParcelizer) {
                    boolean zWrite = r8lambda92m0p9sit5uf70mvjf4rwmruda.write(i2);
                    r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i2);
                    if (!zWrite || r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() || !(((SwipeDismissTouchListenerVerticalDismissDirection) RemoteActionCompatParcelizer().get(strMediaBrowserCompatMediaItem)) instanceof r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc)) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && (!r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() || !(((SwipeDismissTouchListenerVerticalDismissDirection) RemoteActionCompatParcelizer().get(strMediaBrowserCompatMediaItem)) instanceof r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc))) {
                            SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) RemoteActionCompatParcelizer().get(strMediaBrowserCompatMediaItem);
                            String strIconCompatParcelizer = null;
                            r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 ? (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirection : null;
                            if (r8lambdagbekcaskecamm7h9dyqnzofon0 != null) {
                                performClickActionlambda1 performclickactionlambda1 = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer;
                                if (!(r8lambdagbekcaskecamm7h9dyqnzofon0 instanceof r8lambdaOVm5S_u8QUSoMXvJUOeZHUBFeHc)) {
                                    strIconCompatParcelizer = r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer();
                                }
                            }
                            if (strIconCompatParcelizer != null) {
                                resetTransientState resettransientstate = this.write;
                                int iSerializer = JsonNamesMapKt.serializer(r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer, resettransientstate, strIconCompatParcelizer);
                                if (!resettransientstate.IconCompatParcelizer.RatingCompat && r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
                                    z = true;
                                }
                                if (iSerializer != -3 || ((!zWrite && !z) || RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y, o.DefaultInAppMessageModalViewFactoryCompanion
    public final createInAppMessageViewlambda1 serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = this.MediaDescriptionCompat;
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda != r8lambda92m0p9sit5uf70mvjf4rwmruda2) {
            return super.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirectionWrite = write();
        String strSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda2.serializer();
        if (swipeDismissTouchListenerVerticalDismissDirectionWrite instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) {
            return new prepareInAppMessagelambda1(this.write, (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) swipeDismissTouchListenerVerticalDismissDirectionWrite, this.RemoteActionCompatParcelizer, r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        }
        throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirectionWrite.toString(), -1, "Expected " + displayInAppMessagelambda1.serializer(r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k.class).IconCompatParcelizer() + ", but had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirectionWrite.getClass()).IconCompatParcelizer() + " as the serialized body of " + strSerializer + " at element: " + RatingCompat());
    }

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y, o.createInAppMessageViewlambda1
    public void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        Set setSerializer;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        resetTransientState resettransientstate = this.write;
        if (JsonNamesMapKt.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate) || (r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer() instanceof createInAppMessageViewlambda0)) {
            return;
        }
        JsonNamesMapKt.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate);
        if (this.serializer.ParcelableVolumeInfo) {
            Set setSerializer2 = r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            io.sentry.logger.serializer serializerVar = resettransientstate.write;
            serializerVar.getClass();
            Map map = (Map) ((ConcurrentHashMap) serializerVar.scopes).get(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            Object obj = map != null ? map.get(JsonNamesMapKt.IconCompatParcelizer) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = ItemTouchHelperAdapter.serializer;
            }
            setSerializer = RangesKt.read(setSerializer2, setKeySet);
        } else {
            setSerializer = r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        for (String str : RemoteActionCompatParcelizer().content.keySet()) {
            if (!setSerializer.contains(str)) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, this.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Encountered an unknown key '", str, "' at element: ");
                    sbM.append(RatingCompat());
                    sbM.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                    sbM.append(coil3.util.IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1928934327, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{-1, RemoteActionCompatParcelizer().toString()}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1928934330));
                    throw coil3.util.IntPair.RemoteActionCompatParcelizer(-1, sbM.toString());
                }
            }
        }
    }

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y, o.DefaultInAppMessageModalViewFactoryCompanion
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return !this.MediaSessionCompatQueueItem && super.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
    }

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: merged with bridge method [inline-methods] */
    public r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public /* synthetic */ prepareInAppMessagelambda1(resetTransientState resettransientstate, r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k, String str, int i) {
        this(resettransientstate, r8lambdaerwhggzq_gqgn8cultnvrcshm8k, (i & 4) != 0 ? null : str, (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) null);
    }
}
