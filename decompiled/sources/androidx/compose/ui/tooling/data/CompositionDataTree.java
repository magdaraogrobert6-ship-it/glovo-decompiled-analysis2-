package androidx.compose.ui.tooling.data;

import com.sentiance.protobuf.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC0170getTimestamp;
import o.AndroidContentCaptureManagersendContentCaptureAppearEvents1;
import o.AndroidContentCaptureManagerupdateBuffersOnAppeared1;
import o.BlurredEdgeTreatmentCompanion;
import o.getBirthDateYear;
import o.getCreditCardExpirationDate;
import o.getCreditCardSecurityCode;
import o.getUsername;
import o.instance_delegatelambda0;
import o.invalidateDrawCache;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
final class CompositionDataTree<T, R> {
    private final ContextCache cache;
    private final Set<BlurredEdgeTreatmentCompanion> compositions;
    private final r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds createNode;
    private final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY createResult;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM prepareResult;
    private final Map<invalidateDrawCache, List<invalidateDrawCache>> hierarchy = new LinkedHashMap();
    private final Map<invalidateDrawCache, R> processedNodes = new LinkedHashMap();
    private final Set<invalidateDrawCache> rootCompositionInstances = new LinkedHashSet();

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0024, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void buildCompositionParentHierarchy(o.invalidateDrawCache r5) {
        /*
            r4 = this;
            o.getUsername r5 = (o.getUsername) r5
            o.getCreditCardExpirationDate r0 = r5.serializer
            boolean r1 = r0 instanceof o.getCreditCardSecurityCode
            r2 = 0
            if (r1 == 0) goto Lc
            o.getCreditCardSecurityCode r0 = (o.getCreditCardSecurityCode) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L12
            o.getBirthDateYear r0 = r0.ComponentActivity
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 == 0) goto L1a
            o.getCreditCardExpirationDate r0 = r0.MediaMetadataCompat()
            goto L1b
        L1a:
            r0 = r2
        L1b:
            if (r0 == 0) goto L23
            o.getUsername r1 = new o.getUsername
            r1.<init>(r0)
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L66
            java.util.Map<o.invalidateDrawCache, java.util.List<o.invalidateDrawCache>> r0 = r4.hierarchy
            java.lang.Object r3 = r0.get(r1)
            if (r3 != 0) goto L36
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r1, r3)
        L36:
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r3.contains(r5)
            if (r0 == 0) goto L3f
            return
        L3f:
            r3.add(r5)
            o.getCreditCardExpirationDate r5 = r1.serializer
            boolean r0 = r5 instanceof o.getCreditCardSecurityCode
            if (r0 == 0) goto L4b
            o.getCreditCardSecurityCode r5 = (o.getCreditCardSecurityCode) r5
            goto L4c
        L4b:
            r5 = r2
        L4c:
            if (r5 == 0) goto L51
            o.getBirthDateYear r5 = r5.ComponentActivity
            goto L52
        L51:
            r5 = r2
        L52:
            if (r5 == 0) goto L59
            o.getCreditCardExpirationDate r5 = r5.MediaMetadataCompat()
            goto L5a
        L59:
            r5 = r2
        L5a:
            if (r5 == 0) goto L64
            o.getUsername r0 = new o.getUsername
            r0.<init>(r5)
            r5 = r1
            r1 = r0
            goto L24
        L64:
            r5 = r1
            goto L23
        L66:
            java.util.Set<o.invalidateDrawCache> r0 = r4.rootCompositionInstances
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.data.CompositionDataTree.buildCompositionParentHierarchy(o.invalidateDrawCache):void");
    }

    private final R mapTree(invalidateDrawCache invalidatedrawcache) {
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1;
        Integer numRemoteActionCompatParcelizer;
        if (this.processedNodes.containsKey(invalidatedrawcache)) {
            return this.processedNodes.get(invalidatedrawcache);
        }
        getUsername getusername = (getUsername) invalidatedrawcache;
        getusername.getClass();
        List<invalidateDrawCache> list = this.hierarchy.get(invalidatedrawcache);
        if (list == null) {
            list = instance_delegatelambda0.write;
        }
        Iterator<invalidateDrawCache> it = list.iterator();
        while (it.hasNext()) {
            mapTree(it.next());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<invalidateDrawCache> arrayList = new ArrayList();
        for (T t : list) {
            if (this.processedNodes.containsKey((invalidateDrawCache) t)) {
                arrayList.add(t);
            }
        }
        for (invalidateDrawCache invalidatedrawcache2 : arrayList) {
            getCreditCardExpirationDate getcreditcardexpirationdate = ((getUsername) invalidatedrawcache2).serializer;
            boolean z = getcreditcardexpirationdate instanceof getCreditCardSecurityCode;
            AndroidContentCaptureManagerupdateBuffersOnAppeared1 androidContentCaptureManagerupdateBuffersOnAppeared1 = null;
            getCreditCardSecurityCode getcreditcardsecuritycode = z ? (getCreditCardSecurityCode) getcreditcardexpirationdate : null;
            getBirthDateYear getbirthdateyear = getcreditcardsecuritycode != null ? getcreditcardsecuritycode.ComponentActivity : null;
            getCreditCardExpirationDate getcreditcardexpirationdateMediaMetadataCompat = getbirthdateyear != null ? getbirthdateyear.MediaMetadataCompat() : null;
            if (getcreditcardexpirationdateMediaMetadataCompat != null && (androidContentCaptureManagersendContentCaptureAppearEvents1 = ((getCreditCardSecurityCode) getcreditcardexpirationdateMediaMetadataCompat).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
                AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1Serializer = AbstractC0170getTimestamp.serializer(androidContentCaptureManagersendContentCaptureAppearEvents1);
                getCreditCardSecurityCode getcreditcardsecuritycode2 = z ? (getCreditCardSecurityCode) getcreditcardexpirationdate : null;
                getBirthDateYear getbirthdateyear2 = getcreditcardsecuritycode2 != null ? getcreditcardsecuritycode2.ComponentActivity : null;
                if (getbirthdateyear2 != null && (numRemoteActionCompatParcelizer = j.RemoteActionCompatParcelizer(androidContentCaptureManagersendContentCaptureAppearEvents1Serializer, getbirthdateyear2)) != null) {
                    androidContentCaptureManagerupdateBuffersOnAppeared1 = new AndroidContentCaptureManagerupdateBuffersOnAppeared1(androidContentCaptureManagersendContentCaptureAppearEvents1Serializer, numRemoteActionCompatParcelizer.intValue(), androidContentCaptureManagersendContentCaptureAppearEvents1Serializer.MediaMetadataCompat);
                }
            }
            androidContentCaptureManagerupdateBuffersOnAppeared1.getClass();
            Object arrayList2 = linkedHashMap.get(androidContentCaptureManagerupdateBuffersOnAppeared1);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(androidContentCaptureManagerupdateBuffersOnAppeared1, arrayList2);
            }
            R r = this.processedNodes.get(invalidatedrawcache2);
            r.getClass();
            ((List) arrayList2).add(r);
        }
        this.prepareResult.invoke(invalidatedrawcache);
        R r2 = (R) this.createResult.invoke(invalidatedrawcache, SlotTreeKt.mapTreeWithStitching(getusername, this.createNode, this.cache, linkedHashMap), list);
        this.processedNodes.put(invalidatedrawcache, r2);
        return r2;
    }

    public final List<R> build() {
        Set<invalidateDrawCache> set = this.rootCompositionInstances;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            R rMapTree = mapTree((invalidateDrawCache) it.next());
            if (rMapTree != null) {
                arrayList.add(rMapTree);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionDataTree(Set<? extends BlurredEdgeTreatmentCompanion> set, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, ContextCache contextCache) {
        this.compositions = set;
        this.prepareResult = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.createNode = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
        this.createResult = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.cache = contextCache;
        for (BlurredEdgeTreatmentCompanion blurredEdgeTreatmentCompanion : set) {
            invalidateDrawCache invalidatedrawcache = blurredEdgeTreatmentCompanion instanceof invalidateDrawCache ? (invalidateDrawCache) blurredEdgeTreatmentCompanion : null;
            if (invalidatedrawcache != null) {
                buildCompositionParentHierarchy(invalidatedrawcache);
            }
        }
    }
}
