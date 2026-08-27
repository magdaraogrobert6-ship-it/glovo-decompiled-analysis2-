package o;

import com.roadrunner.home.HomeFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getFloatValue implements setBlurFilter {
    public final /* synthetic */ int read = 0;
    public final Object serializer;
    public final Object write;

    public getFloatValue(coil3.memory.MemoryCacheService memoryCacheService, HomeFragment.AnonymousClass1 anonymousClass1) {
        memoryCacheService.getClass();
        this.serializer = memoryCacheService;
        this.write = anonymousClass1;
    }

    @Override // o.setBlurFilter
    public final void IconCompatParcelizer(String str) {
        str.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    @Override // o.setBlurFilter
    public final void serializer(String str, HashMap map) {
        String strSerializer;
        int i = this.read;
        Object obj = this.serializer;
        Object obj2 = this.write;
        str.getClass();
        map.getClass();
        if (i != 0) {
            if (str.equals("app_start_to_interactive")) {
                ((HomeFragment.AnonymousClass1) obj).invoke(new InnerShadowRendererProvider(str.concat(".triggered"), onMove.RemoteActionCompatParcelizer(map, (Map) ((InnerShadowRenderer) obj2).invoke())));
                return;
            }
            return;
        }
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "sm_", false) && map.containsKey("screenName") && map.containsKey("isFirstLaunch")) {
            HomeFragment.AnonymousClass1 anonymousClass1 = (HomeFragment.AnonymousClass1) obj2;
            coil3.memory.MemoryCacheService memoryCacheService = (coil3.memory.MemoryCacheService) obj;
            memoryCacheService.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                String string = (String) entry.getKey();
                int iHashCode = string.hashCode();
                if (iHashCode != -1035111496) {
                    if (iHashCode != -863634500) {
                        if (iHashCode == 1476438151 && string.equals("SourceScreen")) {
                            strSerializer = "screenOrigin";
                        } else {
                            getInAppMessageEventMap getinappmessageeventmap = (getInAppMessageEventMap) memoryCacheService.RemoteActionCompatParcelizer;
                            if (string.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                String strValueOf = String.valueOf(string.charAt(0));
                                strValueOf.getClass();
                                String lowerCase = strValueOf.toLowerCase(java.util.Locale.ROOT);
                                lowerCase.getClass();
                                sb.append((Object) lowerCase);
                                sb.append(string.substring(1));
                                string = sb.toString();
                            }
                            strSerializer = getinappmessageeventmap.serializer(string, getMCachedImageannotations.RemoteActionCompatParcelizer);
                        }
                    } else if (string.equals("tti_ms")) {
                        strSerializer = "timeToInteractiveMs";
                    } else {
                        getInAppMessageEventMap getinappmessageeventmap2 = (getInAppMessageEventMap) memoryCacheService.RemoteActionCompatParcelizer;
                        if (string.length() > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            String strValueOf2 = String.valueOf(string.charAt(0));
                            strValueOf2.getClass();
                            String lowerCase2 = strValueOf2.toLowerCase(java.util.Locale.ROOT);
                            lowerCase2.getClass();
                            sb2.append((Object) lowerCase2);
                            sb2.append(string.substring(1));
                            string = sb2.toString();
                        }
                        strSerializer = getinappmessageeventmap2.serializer(string, getMCachedImageannotations.RemoteActionCompatParcelizer);
                    }
                } else if (string.equals("nts_ms")) {
                    strSerializer = "navigationToScreenMs";
                } else {
                    getInAppMessageEventMap getinappmessageeventmap3 = (getInAppMessageEventMap) memoryCacheService.RemoteActionCompatParcelizer;
                    if (string.length() > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        String strValueOf3 = String.valueOf(string.charAt(0));
                        strValueOf3.getClass();
                        String lowerCase3 = strValueOf3.toLowerCase(java.util.Locale.ROOT);
                        lowerCase3.getClass();
                        sb3.append((Object) lowerCase3);
                        sb3.append(string.substring(1));
                        string = sb3.toString();
                    }
                    strSerializer = getinappmessageeventmap3.serializer(string, getMCachedImageannotations.RemoteActionCompatParcelizer);
                }
                linkedHashMap.put(strSerializer, entry.getValue());
            }
            anonymousClass1.invoke(new fullMultiplicationHighBits(linkedHashMap));
        }
    }

    public getFloatValue(HomeFragment.AnonymousClass1 anonymousClass1, InnerShadowRenderer innerShadowRenderer) {
        this.serializer = anonymousClass1;
        this.write = innerShadowRenderer;
    }
}
