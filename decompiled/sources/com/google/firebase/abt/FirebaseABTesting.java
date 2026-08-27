package com.google.firebase.abt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.logTree;
import o.logTreeprintSubTree;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseABTesting {
    public Integer IconCompatParcelizer = null;
    public final AbstractComposeViewExternalSyntheticLambda0 serializer;
    public final String write;

    public final void IconCompatParcelizer() throws AbtException {
        if (this.serializer.write() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public final void read(ArrayList arrayList) {
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0 = this.serializer;
        logTree logtree = (logTree) abstractComposeViewExternalSyntheticLambda0.write();
        String str = this.write;
        ArrayDeque arrayDeque = new ArrayDeque(logtree.IconCompatParcelizer(str));
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = Integer.valueOf(((logTree) abstractComposeViewExternalSyntheticLambda0.write()).serializer(str));
        }
        int iIntValue = this.IconCompatParcelizer.intValue();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            while (arrayDeque.size() >= iIntValue) {
                ((logTree) abstractComposeViewExternalSyntheticLambda0.write()).RemoteActionCompatParcelizer(((logTreeprintSubTree) arrayDeque.pollFirst()).write);
            }
            logTreeprintSubTree logtreeprintsubtreeSerializer = abtExperimentInfo.serializer(str);
            ((logTree) abstractComposeViewExternalSyntheticLambda0.write()).IconCompatParcelizer(logtreeprintsubtreeSerializer);
            arrayDeque.offer(logtreeprintsubtreeSerializer);
        }
    }

    public FirebaseABTesting(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0, String str) {
        this.serializer = abstractComposeViewExternalSyntheticLambda0;
        this.write = str;
    }

    public static boolean IconCompatParcelizer(ArrayList arrayList, AbtExperimentInfo abtExperimentInfo) {
        String strWrite = abtExperimentInfo.write();
        String strIconCompatParcelizer = abtExperimentInfo.IconCompatParcelizer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) it.next();
            if (abtExperimentInfo2.write().equals(strWrite) && abtExperimentInfo2.IconCompatParcelizer().equals(strIconCompatParcelizer)) {
                return true;
            }
        }
        return false;
    }

    public final void RemoteActionCompatParcelizer(ArrayList arrayList) throws AbtException {
        IconCompatParcelizer();
        ArrayList<AbtExperimentInfo> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbtExperimentInfo.RemoteActionCompatParcelizer((Map) it.next()));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        String str = this.write;
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0 = this.serializer;
        if (zIsEmpty) {
            IconCompatParcelizer();
            Iterator it2 = ((logTree) abstractComposeViewExternalSyntheticLambda0.write()).IconCompatParcelizer(str).iterator();
            while (it2.hasNext()) {
                ((logTree) abstractComposeViewExternalSyntheticLambda0.write()).RemoteActionCompatParcelizer(((logTreeprintSubTree) it2.next()).write);
            }
            return;
        }
        IconCompatParcelizer();
        List listIconCompatParcelizer = ((logTree) abstractComposeViewExternalSyntheticLambda0.write()).IconCompatParcelizer(str);
        ArrayList<AbtExperimentInfo> arrayList3 = new ArrayList();
        Iterator it3 = listIconCompatParcelizer.iterator();
        while (it3.hasNext()) {
            arrayList3.add(AbtExperimentInfo.read((logTreeprintSubTree) it3.next()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (AbtExperimentInfo abtExperimentInfo : arrayList3) {
            if (!IconCompatParcelizer(arrayList2, abtExperimentInfo)) {
                arrayList4.add(abtExperimentInfo.serializer(str));
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((logTree) abstractComposeViewExternalSyntheticLambda0.write()).RemoteActionCompatParcelizer(((logTreeprintSubTree) it4.next()).write);
        }
        ArrayList arrayList5 = new ArrayList();
        for (AbtExperimentInfo abtExperimentInfo2 : arrayList2) {
            if (!IconCompatParcelizer(arrayList3, abtExperimentInfo2)) {
                arrayList5.add(abtExperimentInfo2);
            }
        }
        read(arrayList5);
    }
}
