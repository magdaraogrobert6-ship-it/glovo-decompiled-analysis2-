package o;

import android.content.BroadcastReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class getButtonXEK5gGoQ extends BroadcastReceiver {
    public static final /* synthetic */ int write = 0;
    public final Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getButtonXEK5gGoQ(int i, Object obj) {
        this.serializer = i;
        this.read = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:266:0x03bd  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018b, code lost:
    
        if (r12.equals("3002") != true) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0199, code lost:
    
        if (r12.equals("3001") != true) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a7, code lost:
    
        if (r12.equals("3000") != true) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0129, code lost:
    
        if (r12.equals("3009") != true) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0137, code lost:
    
        if (r12.equals("3008") != true) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0145, code lost:
    
        if (r12.equals("3007") != true) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0153, code lost:
    
        if (r12.equals("3006") != true) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0161, code lost:
    
        if (r12.equals("3005") != true) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016f, code lost:
    
        if (r12.equals("3004") != true) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017d, code lost:
    
        if (r12.equals("3003") != true) goto L266;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 int, still in use, count: 11, list:
  (r4v2 int) from 0x0079: SWITCH (r4v2 int)
 case 1537214: goto B:68:0x0115
 case 1537215: goto B:64:0x0107
 case 1537216: goto B:60:0x00f9
 case 1537217: goto B:56:0x00eb
 case 1537218: goto B:52:0x00dd
 default: goto B:21:0x007c A[RegionRef:SW:20]
  (r4v2 int) from 0x007f: IF  (r4v2 int) == (1626680 int)  -> B:264:0x03b5 A[HIDDEN]
  (r4v2 int) from 0x0084: IF  (r4v2 int) == (1627548 int)  -> B:260:0x03a9 A[HIDDEN]
  (r4v2 int) from 0x0089: IF  (r4v2 int) == (1628509 int)  -> B:256:0x039d A[HIDDEN]
  (r4v2 int) from 0x008e: SWITCH (r4v2 int)
 case 1567036: goto B:120:0x01cb
 case 1567037: goto B:116:0x01bd
 case 1567038: goto B:112:0x01af
 default: goto B:29:0x0091 A[RegionRef:SW:28]
  (r4v2 int) from 0x0091: SWITCH (r4v2 int)
 case 1596796: goto B:140:0x0211
 case 1596797: goto B:136:0x0203
 case 1596798: goto B:132:0x01f5
 case 1596799: goto B:128:0x01e7
 case 1596800: goto B:124:0x01d9
 default: goto B:30:0x0094 A[RegionRef:SW:29]
  (r4v2 int) from 0x0094: SWITCH (r4v2 int)
 case 1626587: goto B:160:0x0257
 case 1626588: goto B:156:0x0249
 case 1626589: goto B:152:0x023b
 case 1626590: goto B:148:0x022d
 case 1626591: goto B:144:0x021f
 default: goto B:31:0x0097 A[RegionRef:SW:30]
  (r4v2 int) from 0x0097: SWITCH (r4v2 int)
 case 1626593: goto B:176:0x028f
 case 1626594: goto B:172:0x0281
 case 1626595: goto B:168:0x0273
 case 1626596: goto B:164:0x0265
 default: goto B:32:0x009a A[RegionRef:SW:31]
  (r4v2 int) from 0x009a: SWITCH (r4v2 int)
 case 1626618: goto B:216:0x031b
 case 1626619: goto B:212:0x030d
 case 1626620: goto B:208:0x02ff
 case 1626621: goto B:204:0x02f1
 case 1626622: goto B:200:0x02e3
 case 1626623: goto B:196:0x02d5
 case 1626624: goto B:192:0x02c7
 case 1626625: goto B:188:0x02b9
 case 1626626: goto B:184:0x02ab
 case 1626627: goto B:180:0x029d
 default: goto B:33:0x009d A[RegionRef:SW:32]
  (r4v2 int) from 0x009d: SWITCH (r4v2 int)
 case 1626649: goto B:224:0x0337
 case 1626650: goto B:220:0x0329
 default: goto B:34:0x00a0 A[RegionRef:SW:33]
  (r4v2 int) from 0x00a0: SWITCH (r4v2 int)
 case 1626652: goto B:252:0x0391
 case 1626653: goto B:248:0x0385
 case 1626654: goto B:244:0x0379
 case 1626655: goto B:240:0x036d
 case 1626656: goto B:236:0x0361
 case 1626657: goto B:232:0x0353
 case 1626658: goto B:228:0x0345
 default: goto B:266:0x03bd A[RegionRef:SW:34]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 int, still in use, count: 12, list:
  (r4v2 int) from 0x0079: SWITCH (r4v2 int)
 case 1537214: goto B:68:0x0115
 case 1537215: goto B:64:0x0107
 case 1537216: goto B:60:0x00f9
 case 1537217: goto B:56:0x00eb
 case 1537218: goto B:52:0x00dd
 default: goto B:21:0x007c A[RegionRef:SW:20]
  (r4v2 int) from 0x007f: IF  (r4v2 int) == (1626680 int)  -> B:264:0x03b5 A[HIDDEN]
  (r4v2 int) from 0x0084: IF  (r4v2 int) == (1627548 int)  -> B:260:0x03a9 A[HIDDEN]
  (r4v2 int) from 0x0089: IF  (r4v2 int) == (1628509 int)  -> B:256:0x039d A[HIDDEN]
  (r4v2 int) from 0x008b: SWITCH (r4v2 int)
 case 1567005: goto B:108:0x01a1
 case 1567006: goto B:104:0x0193
 case 1567007: goto B:100:0x0185
 case 1567008: goto B:96:0x0177
 case 1567009: goto B:92:0x0169
 case 1567010: goto B:88:0x015b
 case 1567011: goto B:84:0x014d
 case 1567012: goto B:80:0x013f
 case 1567013: goto B:76:0x0131
 case 1567014: goto B:72:0x0123
 default: goto B:28:0x008e A[RegionRef:SW:27]
  (r4v2 int) from 0x008e: SWITCH (r4v2 int)
 case 1567036: goto B:120:0x01cb
 case 1567037: goto B:116:0x01bd
 case 1567038: goto B:112:0x01af
 default: goto B:29:0x0091 A[RegionRef:SW:28]
  (r4v2 int) from 0x0091: SWITCH (r4v2 int)
 case 1596796: goto B:140:0x0211
 case 1596797: goto B:136:0x0203
 case 1596798: goto B:132:0x01f5
 case 1596799: goto B:128:0x01e7
 case 1596800: goto B:124:0x01d9
 default: goto B:30:0x0094 A[RegionRef:SW:29]
  (r4v2 int) from 0x0094: SWITCH (r4v2 int)
 case 1626587: goto B:160:0x0257
 case 1626588: goto B:156:0x0249
 case 1626589: goto B:152:0x023b
 case 1626590: goto B:148:0x022d
 case 1626591: goto B:144:0x021f
 default: goto B:31:0x0097 A[RegionRef:SW:30]
  (r4v2 int) from 0x0097: SWITCH (r4v2 int)
 case 1626593: goto B:176:0x028f
 case 1626594: goto B:172:0x0281
 case 1626595: goto B:168:0x0273
 case 1626596: goto B:164:0x0265
 default: goto B:32:0x009a A[RegionRef:SW:31]
  (r4v2 int) from 0x009a: SWITCH (r4v2 int)
 case 1626618: goto B:216:0x031b
 case 1626619: goto B:212:0x030d
 case 1626620: goto B:208:0x02ff
 case 1626621: goto B:204:0x02f1
 case 1626622: goto B:200:0x02e3
 case 1626623: goto B:196:0x02d5
 case 1626624: goto B:192:0x02c7
 case 1626625: goto B:188:0x02b9
 case 1626626: goto B:184:0x02ab
 case 1626627: goto B:180:0x029d
 default: goto B:33:0x009d A[RegionRef:SW:32]
  (r4v2 int) from 0x009d: SWITCH (r4v2 int)
 case 1626649: goto B:224:0x0337
 case 1626650: goto B:220:0x0329
 default: goto B:34:0x00a0 A[RegionRef:SW:33]
  (r4v2 int) from 0x00a0: SWITCH (r4v2 int)
 case 1626652: goto B:252:0x0391
 case 1626653: goto B:248:0x0385
 case 1626654: goto B:244:0x0379
 case 1626655: goto B:240:0x036d
 case 1626656: goto B:236:0x0361
 case 1626657: goto B:232:0x0353
 case 1626658: goto B:228:0x0345
 default: goto B:266:0x03bd A[RegionRef:SW:34]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            Method dump skipped, instruction units count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getButtonXEK5gGoQ.onReceive(android.content.Context, android.content.Intent):void");
    }

    public /* synthetic */ getButtonXEK5gGoQ(Object obj, boolean z, int i) {
        this.serializer = i;
        this.read = obj;
    }
}
